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
        
        <br>
        <h3>Personas: </h3>
        <#list personas as persona>
        <p>persona</p>
        </#list>
    </body>
    </html>
