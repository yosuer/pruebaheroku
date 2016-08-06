heroku.service.persona = (function () {

    function guardar(persona) {
        var url = heroku.service.url() + "persona/";
        return heroku.service.post(url, persona);
    }


    return {
        guardar: guardar
    };

})();
