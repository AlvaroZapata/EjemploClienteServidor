<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/css.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>${producto.nombre}</title>
</head>
<body>

<h1 align="center">Descripcion del producto</h1>
<div>
<h3 id="aa">El nombre del producto es</h3>${producto.nombre} <br>
<h3 id="bb">El precio es</h3>${producto.precio} <br>
<h3 id="cc">La descripcion del producto es:</h3>${producto.descripcion} <br>
</div>
</body>
</html>

