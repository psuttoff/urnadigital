public class Banco {

    public static void main(String[] args) {

        Candidato[] deputadosFederais = new Candidato[6];

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

        deputadosFederais[0] = bibo;
        deputadosFederais[1] = mariana;
        deputadosFederais[2] = ustra;
        deputadosFederais[3] = jesse;
        deputadosFederais[4] = victorino;
        deputadosFederais[5] = any;

        Candidato[] deputadosEstaduais = new Candidato[6];

        Candidato martim = new Candidato();
        martim.nome = "Capitão Martim";
        martim.numero = 10122;

        Candidato zucco = new Candidato();
        zucco.nome = "Delegado Zucco";
        zucco.numero = 10222;

        Candidato nadia = new Candidato();
        nadia.nome = "Comandante Nádia";
        nadia.numero = 22190;

        Candidato lara = new Candidato();
        lara.nome = "Adriana Lara";
        lara.numero = 22789;

        Candidato cherini = new Candidato();
        cherini.nome = "Adri Cherini";
        cherini.numero = 22222;

        Candidato tatsch = new Candidato();
        tatsch.nome = "Cláudio Tatsch";
        tatsch.numero = 22034;

    }
}