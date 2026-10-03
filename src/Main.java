import java.util.Scanner;
public class Main{

    public static void main(String[] args) {


    Scanner leitura = new Scanner(System.in);

    Banco.carregarCandidatos();

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


    System.out.println("Senador(a) 1");
    System.out.print("Digite seu voto: ");
    int votoSenador1 = leitura.nextInt();

    for (int i = 0; i < Banco.senadores.length; i++) {

        if (Banco.senadores[i].numero == votoSenador1) {

            System.out.println("Candidato:");
            System.out.println(Banco.senadores[i].nome);
            System.out.println("Número: " + Banco.senadores[i].numero);

        }
    }

    System.out.println("Senador(a) 2");
    System.out.print("Digite seu voto: ");
    int votoSenador2 = leitura.nextInt();

    for (int i = 0; i < Banco.senadores.length; i++) {

        if (Banco.senadores[i].numero == votoSenador2) {

            System.out.println("Candidato:");
            System.out.println(Banco.senadores[i].nome);
            System.out.println("Número: " + Banco.senadores[i].numero);

        }
    }


    System.out.println("Governador(a)");
    System.out.print("Digite seu voto: ");
    int votoGovernador = leitura.nextInt();

    for (int i = 0; i < Banco.governadores.length; i++) {

        if (Banco.governadores[i].numero == votoGovernador) {

            System.out.println("Candidato:");
            System.out.println(Banco.governadores[i].nome);
            System.out.println("Vice: " + Banco.governadores[i].vice);
            System.out.println("Número: " + Banco.governadores[i].numero);

        }
    }


    System.out.println("Presidente");
    System.out.print("Digite seu voto: ");
    int votoPresidente = leitura.nextInt();

    for (int i = 0; i < Banco.presidentes.length; i++) {

        if (Banco.presidentes[i].numero == votoPresidente) {

            System.out.println("Candidato:");
            System.out.println(Banco.presidentes[i].nome);
            System.out.println("Vice: " + Banco.presidentes[i].vice);
            System.out.println("Número: " + Banco.presidentes[i].numero);

        }
    }


        System.out.println("FIM");


        }
    }