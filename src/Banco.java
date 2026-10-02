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

        deputadosEstaduais[0] = martim;
        deputadosEstaduais[1] = zucco;
        deputadosEstaduais[2] = nadia;
        deputadosEstaduais[3] = lara;
        deputadosEstaduais[4] = cherini;
        deputadosEstaduais[5] = tatsch;

        Candidato[] senadores = new Candidato[2];

        Candidato marcel = new Candidato();
        marcel.nome = "Marcel Van Hattem";
        marcel.numero = 300;

        Candidato sanderson = new Candidato();
        sanderson.nome = "Ubiratan Sanderson";
        sanderson.numero = 222;

        senadores[0] = marcel;
        senadores[1] = sanderson;

        Candidato[] governadores = new Candidato[1];

        Candidato gzucco = new Candidato();
        gzucco.nome = "Luciano Zucco";
        gzucco.numero = 22;
        gzucco.vice = "Silvana Covatti";

        governadores[0] = gzucco;

        Candidato[] presidentes = new Candidato[1];

        Candidato flavio = new Candidato();
        flavio.nome = "Flávio Bolsonaro";
        flavio.numero = 22;
        flavio.vice = "Alfredo Gaspar";

        presidentes[0] = flavio;

    }
}