heroku.service = (function () {
    function uriService() {
        url = heroku.url();
        return url + "api/";
    }

    function get(uri) {
        return $.get(uri);
    }


    function post(uri, data) {
        return $.ajax({
            contentType: 'application/json; charset=UTF-8',
            url: uri,
            type: 'POST',
            data: JSON.stringify(data),
            dataType: 'json'
        });
    }

    function patch(uri, data) {
        return $.ajax({
            contentType: 'application/json; charset=UTF-8',
            url: uri,
            type: 'PATCH',
            data: JSON.stringify(data),
            dataType: 'json'
        });
    }

    function eliminar(uri) {
        return $.ajax({
            contentType: 'application/json; charset=UTF-8',
            url: uri,
            type: 'DELETE'
        });
    }


    return {
        url: uriService,
        get: get,
        post: post,
        patch: patch,
        eliminar: eliminar
    };
})();

