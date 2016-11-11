<%@ page contentType="text/html;charset=utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />  
<title>测试步骤</title>  
<style type="text/css">  
</style>  
</head>  
  
<body>  
<form id="form1" name="form1" method="post" action="">
<h3>编辑测试步骤</h3>  
<table width="698" border="0" cellpadding="0" cellspacing="0" id="tabProduct">  
    <tr>  
      <td width="32" align="center" bgcolor="#EFEFEF" Name="Num"><input type="checkbox" name="checkbox" value="checkbox" /></td>  
      <td width="186" bgcolor="#EFEFEF" Name="num" >序号</td>
      <td width="152" bgcolor="#EFEFEF" Name="keyWord" EditType="DropDownList" DataItems="{text:'A',value:'a'},{text:'B',value:'b'},{text:'C',value:'c'},{text:'D',value:'d'}">关键字</td>
      <td width="103" bgcolor="#EFEFEF" Name="arg1" EditType="TextBox">参数一</td>
      <td width="103" bgcolor="#EFEFEF" Name="arg2" EditType="TextBox">参数二</td>
	  <td width="103" bgcolor="#EFEFEF" Name="arg3" EditType="TextBox">参数三</td>
      <!--
	  <td width="120" bgcolor="#EFEFEF" Name="SumMoney" Expression="Amount*Price" Format="#,###.00">合计</td>
	-->	  
    </tr>  
    <tr>  
      <td align="center" bgcolor="#FFFFFF"><input type="checkbox" name="checkbox2" value="checkbox" /></td>  
      <td bgcolor="#FFFFFF">0</td>  
      <td bgcolor="#FFFFFF" Value="c"></td>  
      <td bgcolor="#FFFFFF"></td>  
      <td bgcolor="#FFFFFF"></td>  
      <td bgcolor="#FFFFFF"></td>  
    </tr>  
    
</table>  
  
<br />  
<input type="button" name="Submit" value="新增" onclick="AddRow(document.getElementById('tabProduct'),1)" />  
<input type="button" name="Submit2" value="删除" onclick="DeleteRow(document.getElementById('tabProduct'),1)" />  
<input type="button" name="Submit22" value="重置" onclick="window.location.reload()" />  
<input type="submit" name="Submit3" value="执行" onclick="GetTableData(document.getElementById('tabProduct'),'/autoTest.do');return false;" />
</form>
<script type="text/javascript" language="javascript" src="js/GridEdit.js" charset="utf-8"></script>
<script language="javascript" src="js/GridEdit.js"></script>  
<script language="javascript">  
var tabProduct = document.getElementById("tabProduct");  
  
// 设置表格可编辑  
// 可一次设置多个，例如：EditTables(tb1,tb2,tb2,......)  
EditTables(tabProduct);  
  
  
</script>
</body>  
</html>  