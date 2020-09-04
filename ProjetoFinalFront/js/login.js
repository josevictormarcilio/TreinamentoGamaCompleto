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
        body: JSON.stringify(loginMsg), 
        headers: {
            'Content-type':'application/json'
        }
    }

    fetch('http://localhost:8080/gestor/login', cabecalho)
    .then( res => tratarResposta(res)); 
}

// valida resultado inserido nos campos
function tratarResposta (res){
    //direciona para página gestor
    if(res.status == 200){
        res.json().then(res => fazerLogin(res));

    //exibe mensagem de erro
    } else {
        document.getElementById("msgErro").innerHTML = "E-mail/RACF/senha inválidos."
    }
}

function fazerLogin(res){
    //armazenar no localStorage os dados do usuário que fez o Login
    localStorage.setItem("userLogged", JSON.stringify(res)); //tranforma JSON em string
    window.location="relatorio.html";
}
