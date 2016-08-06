<#ftl strip_whitespace = true>

<#assign charset="UTF-8">
<#assign title="Pagina prueba">
<#assign content>
Contenido
</#assign>
<!DOCTYPE html>
<html>
    <head>
        <title>${title}</title>
        <meta charset="${charset}">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        </head>
    <body>
        <p>Agregar personas</p>
        <form id="formPersona">
            Nombre:<br>
            <input type="text" name="nombre" required><br>
            <input type="submit" value="Agregar">
            </form>
        <br>
        <h3>Personas: </h3>
        <#list personas as persona>
        <p>${persona.id} ${persona.nombre}
            <#else>
        <p>No hay personas
        </#list>

            <script src="/js/lib/jquery.js"></script>
            <script src="/js/heroku.js"></script>
            <script src="/js/service/service.js"></script>
            <script src="/js/service/persona/persona.js"></script>
            <script src="/js/ui/home.js"></script>
        </body>
    </html>
