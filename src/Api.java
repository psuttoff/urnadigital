import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Api {

    public static void main(String[] args) throws IOException {

        HttpServer servidor = HttpServer.create(
                new InetSocketAddress(8080),
                0
        );

        servidor.createContext("/api/teste", exchange -> {

            String resposta = "UE-26 API funcionando!";

            exchange.sendResponseHeaders(
                    200,
                    resposta.getBytes().length
            );

            OutputStream saida = exchange.getResponseBody();

            saida.write(resposta.getBytes());

            saida.close();
        });

        servidor.start();

        System.out.println("API iniciada!");
        System.out.println("http://localhost:8080/api/teste");

        servidor.createContext("/api/candidatos/federal/1100", exchange -> {

            Banco.carregarCandidatos();

            Candidato candidato = null;

            for (int i = 0; i < Banco.deputadosFederais.length; i++) {

                if (Banco.deputadosFederais[i].numero == 1100) {
                    candidato = Banco.deputadosFederais[i];
                    break;
                }
            }

            String resposta;

            if (candidato != null) {

                resposta = "{"
                        + "\"nome\":\"" + candidato.nome + "\","
                        + "\"numero\":" + candidato.numero
                        + "}";

            } else {

                resposta = "{\"erro\":\"Candidato não encontrado\"}";
            }

            exchange.getResponseHeaders().set(
                    "Content-Type",
                    "application/json"
            );

            exchange.sendResponseHeaders(
                    200,
                    resposta.getBytes().length
            );

            OutputStream saida = exchange.getResponseBody();

            saida.write(resposta.getBytes());

            saida.close();
        });
    }
}
