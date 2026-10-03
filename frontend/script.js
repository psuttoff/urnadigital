let deputadosFederais = [];
let deputadosEstaduais = [];
let senadores = [];
let governadores = [];
let presidentes = [];

let voto = "";

fetch("http://localhost:8080/api/candidatos/federal")
    .then(resposta => resposta.json())
    .then(dados => {
        deputadosFederais = dados;
        console.log("Deputados Federais:", deputadosFederais);
    })
    .catch(erro => console.error("Erro nos Deputados Federais:", erro));


fetch("http://localhost:8080/api/candidatos/estadual")
    .then(resposta => resposta.json())
    .then(dados => {
        deputadosEstaduais = dados;
        console.log("Deputados Estaduais:", deputadosEstaduais);
    })
    .catch(erro => console.error("Erro nos Deputados Estaduais:", erro));


fetch("http://localhost:8080/api/candidatos/senador")
    .then(resposta => resposta.json())
    .then(dados => {
        senadores = dados;
        console.log("Senadores:", senadores);
    })
    .catch(erro => console.error("Erro nos Senadores:", erro));


fetch("http://localhost:8080/api/candidatos/governador")
    .then(resposta => resposta.json())
    .then(dados => {
        governadores = dados;
        console.log("Governadores:", governadores);
    })
    .catch(erro => console.error("Erro nos Governadores:", erro));


    fetch("http://localhost:8080/api/candidatos/presidente")
    .then(resposta => resposta.json())
    .then(dados => {
        presidentes = dados;
        console.log("Presidentes:", presidentes);
    })
    .catch(erro => console.error("Erro nos Presidentes:", erro));

function digitar(numero) {

    if (voto.length >= 5) {
        return;
    }

    voto += numero;

    atualizarTela();

}


function atualizarTela() {

    document.getElementById("numero").innerText =
        voto || "_";


    const candidato = candidatos[voto];


    if (candidato) {

        document.getElementById("nome").innerText =
            candidato.nome;

        document.getElementById("numeroCandidato").innerText =
            candidato.numero;

        document.getElementById("vice").innerText =
            candidato.vice || "";

        document.getElementById("mensagem").innerText =
            "CONFIRA SEU VOTO";

    } else {

        document.getElementById("nome").innerText =
            "-";

        document.getElementById("numeroCandidato").innerText =
            "-";

        document.getElementById("vice").innerText =
            "";

        if (voto.length > 0) {

            document.getElementById("mensagem").innerText =
                "NÚMERO INVÁLIDO";

        } else {

            document.getElementById("mensagem").innerText =
                "DIGITE O NÚMERO";

        }

    }

}


function corrigir() {

    voto = "";

    atualizarTela();

}


function branco() {

    voto = "";

    document.getElementById("numero").innerText =
        "BRANCO";

    document.getElementById("nome").innerText =
        "-";

    document.getElementById("numeroCandidato").innerText =
        "-";

    document.getElementById("vice").innerText =
        "";

    document.getElementById("mensagem").innerText =
        "VOTO EM BRANCO";

}


function confirmar() {

    if (candidatos[voto]) {

        document.getElementById("mensagem").innerText =
            "VOTO CONFIRMADO!";

    } else {

        document.getElementById("mensagem").innerText =
            "DIGITE UM NÚMERO VÁLIDO";

    }

}