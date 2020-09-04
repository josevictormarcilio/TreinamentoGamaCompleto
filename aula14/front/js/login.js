function autenticar(event) {
    event.preventDefault(); //interrompe a execução padrão de envio do formulário

    let usuario = document.getElementById("txtUsuario");
    let senha = document.getElementById("txtSenha");

    //conteudo do corpo da mensagem (o que eu quero mandar para o backend)
    let loginMsg = {
        email: usuario.value,
        cpf: usuario.value,
        senha: senha.value
    }

    //declaração para fazer o envio
    let cabecalho = {
        method: 'POST',
        body: JSON.stringify(loginMsg), //transforma objeto do js em texto
        headers: {
            'Content-type':'application/json'
        }
    }

    //fazer envio
    //rota que vai receber pedido de login e o que está mandando
    // envia o pedido para o servidor e só continua quando chegar a resposta (then)
    fetch('http://localhost:8080/usuario/login', cabecalho)
    .then( res => tratarResposta(res)); //arrow function chamando a função tratarResposta
                                        // res é a resposta que veio do backend
}

//outra forma de escrever uma função = anônima (utilizar apenas quando for chamada só 1x no código)
    //res=> {
    //}

function tratarResposta (res){
    if(res.status == 200){
        res.json().then(res => fazerLogin(res));
    } else {
        document.getElementById("msgErro").innerHTML = "Usuário/senha inválidos."
    }
}

function fazerLogin(res){
    //armazenar no localStorage os dados do usuário que fez o Login
    localStorage.setItem("userLogged", JSON.stringify(res)); //tranforma JSON em string
    window.location="relatorio.html";
}
