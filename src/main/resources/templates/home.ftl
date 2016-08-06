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
    <body><#if content??>
        <div>${content}</div>
		<#else>
        <div>No content</div>
		</#if>

        </body>
</html>
