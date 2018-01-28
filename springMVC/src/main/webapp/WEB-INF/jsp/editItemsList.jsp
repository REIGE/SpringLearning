<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>批量修改商品查询</title>
<script type="text/javascript">
//修改商品提交
function updateItems(){
	document.itemsForm.submit();
}
</script>
</head>
<body> 
<form name="itemsForm" action="${pageContext.request.contextPath }/items/editItemsListSubmit" method="post">
查询条件：
<table width="100%" border=1>
<tr>
<td>
商品类别：
<select>
	<c:forEach items="${itemsType }" var="item">
			<option value="${item.key }">${item.value }</option>
	
	</c:forEach>
	
</select>
</td>
<td><input type="submit" value="查询"/>
<input type="button" value="批量修改提交" onclick="updateItems()"/>
</td>
</tr>
</table>
商品列表：
<table width="100%" borer=1>
<tr>	
	<td>商品名称</td>
	<td>商品价格</td>
	<td>生产日期</td>
	<td>商品描述</td>
	<td>操作</td>
</tr>
	<input type="text" name="aa" value="aa">
<tr>
	<td><input type="text" name="itemsList[0].name" value="itemsList"/></td>
	<td><input type="text" name="itemsList[0].price" value="itemsList"/></td>
	<td></td>
	<td></td>
</tr>



</table>
</form>
</body>

</html>