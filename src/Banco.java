import java.util.concurrent.Callable;

public class Banco {

    public static void main(String[] args) {

        Candidato[] deputadosFederais = new Candidato[5];

        Candidato bibo = new Candidato();
        bibo.nome = "Bibo Nunes";
        bibo.numero = 2200;

        Candidato mariana = new Candidato();
        mariana.nome = "Mariana Lescano";
        mariana.numero = 1100;

        Candidato ustra = new Candidato();
        ustra.nome = "Coronel Ustra";
        ustra.numero = 2212;

        Candidato jesse = new Candidato();
        jesse.nome = "Jessé Sangalli";
        jesse.numero = 2230;

        Candidato victorino = new Candidato();
        victorino.nome = "Gustavo Victorino";
        victorino.numero = 1022;

        Candidato any = new Candidato();
        any.nome = "Any Ortiz";
        any.numero = 1123;

    }
}