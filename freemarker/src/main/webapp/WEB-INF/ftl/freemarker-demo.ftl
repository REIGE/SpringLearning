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
    <br>
    <@api target="userInfoTag" userId="1">
        <#if outTagName?exists>
        nickname：${outTagName.name}<br>
        sex：${outTagName.sex}
        </#if>
    </@api>
    <body>
	</body>
</html>