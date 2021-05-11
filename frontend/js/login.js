
$(document).ready(function () {
    $("#btnLogin").click(function () {
        const $user = $("#user").val();
        const $pwd = $("#pwd").val();
        if ($user && $pwd) {
            $.getJSON("http://localhost:8080/usuarios",
                function ($registros) {
                    //console.log($registros)
                    //console.log($registros.filter($usuario => $usuario.user == $user && $usuario.pwd == $pwd))
                    var usr = $registros.find($usuario => $usuario.user == $user && $usuario.pwd == $pwd);
                    //if ($registros.filter($usuario => $usuario.user == $user && $usuario.pwd == $pwd).length > 0)
                    if (usr) {
                        sessionStorage.setItem("id",usr.id);
                        window.open(`game.html?id_usuario=${usr.id}`, "_self")
                    } else alert("Usuário Inválido");
                });
        } else {
            alert("Erro: favor informar usuário e senha")
        }
    })
});

