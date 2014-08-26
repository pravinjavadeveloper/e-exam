<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html >
<head>
<style>

.label{
    font-family:Verdana, Arial, Helvetica, sans-serif;
    font-size:11px;
    color:#0066FF;
}
.tableBorder{
    border:solid 1px #0066FF;
    margin-top:100px;
}
.message{
    font-family:Verdana, Arial, Helvetica, sans-serif;
    font-size:14px;
    font-weight:bold;
    color:#0066FF;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>LogIn</title>

<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body background="l.jpg">
<form action="loginServlet" method="post" >
<table cellpadding="2px" cellspacing="1px" bgcolor="#F4F5F7" width="400px" class="tableBorder" align="right">
    <tr>
        <td colspan="2" bgcolor="#0066FF">&nbsp;</td>
    </tr>
    <tr>
        <td colspan="2" class="label">&nbsp;</td>
    </tr>
    
    <tr>
        <td align="center" colspan="2">
            <img src="login.jpg" border="0" align="absbottom"/>&nbsp;
            <span class="message">Login Here</span>
        </td>
    </tr>                   
    <tr>
        <td colspan="2" class="label">&nbsp;</td>
    </tr>
    <tr>
        <td class="label" align="right" width="40%">Username:</td>
        <td align="left" width="60%"><input type="text" name="u_name" maxlength="20"/></td>
    </tr>
    <tr>
        <td class="label" align="right">Password:</td>
        <td align="left"><input type="password" name="pass" maxlength="20" /></td>
    </tr>
    <tr>
        <td class="label" align="right">&nbsp;</td>
        <td align="left"><input type="submit" value="Login" /><input type="reset" name="reset" value="reset"></td>
    </tr> 
	<tr>
	<td class="label" align="right">&nbsp;</td>
	<td align="left"><a href="recordSave.jsp">New User</a></td>
	</tr>
    <tr>
        <td colspan="2" class="label">&nbsp;</td>
    </tr>                   
</table>
</form>
</body>
</html>