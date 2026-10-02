import java.util.Scanner;
public class Main{

    public static void main(String[] args) {


    System.out.println("Iniciar Votação");


    System.out.println("Deputado(a) Federal");
    System.out.print("Digite seu voto: ");
    int votoFederal = leitura.nextInt();

    for (int i = 0; i < Banco.deputadosFederais.length; i++) {

        if (Banco.deputadosFederais[i].numero == votoFederal) {

            System.out.println("Candidato:");
            System.out.println(Banco.deputadosFederais[i].nome);
            System.out.println("Número: " + Banco.deputadosFederais[i].numero);

        }
    }


        System.out.println("Deputado(a) Estadual");
        System.out.print("Digite seu voto: ");
        int votoEstadual = leitura.nextInt();

        for (int i = 0; i < Banco.deputadosEstaduais.length; i++) {

            if (Banco.deputadosEstaduais[i].numero == votoEstadual) {

                System.out.println("Candidato:");
                System.out.println(Banco.deputadosEstaduais[i].nome);
                System.out.println("Número: " + Banco.deputadosEstaduais[i].numero);

            }
        }

        }
    }