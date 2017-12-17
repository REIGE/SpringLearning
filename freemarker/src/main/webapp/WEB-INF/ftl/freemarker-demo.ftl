<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
    </head>
    ${Name}
    aa${basePath}
    ${_time}
    ${_v}
    ${NOW_YEAY}

    <@api target="userInfoTag" userId="1">
        <#if outTagName?exists>
        nickname：${outTagName.name}
        email：${outTagName.sex}
        </#if>
    </@api>
    <body>
	</body>
</html>