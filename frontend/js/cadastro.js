$(document).ready(function () {
    $("#btnCadastro").click(function () {
        let $user = $("#user").val();
        let $pwd = $("#pwd").val();
        let data = { "user": $user, "pwd": $pwd };

        if ($user && $pwd) {
            console.log('enviando requisição: ' + JSON.stringify(data))
            const url = "http://localhost:8080/usuarios";
            axios.post(url, data).then(()=>window.location.href = 'login.html');
        } else {
            alert("Erro: favor informar usuário e senha")
        }
    })
});