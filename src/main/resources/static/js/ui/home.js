heroku.home = (function () {

    function init() {

        $("#formPersona").submit(function (e) {
            e.preventDefault();
            var persona = {nombre: $("input:first").val()};

            heroku.service.persona.guardar(persona)
                    .success(function (data) {
                        console.log(data);
                        location.reload();
                    });
        });

    }

    return {
        init: init
    };
})();

$(document).ready((function () {
    heroku.home.init();
}));