<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/css.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1>Seleccione el producto</h1>

	<p>
		El usuario es
		<%=request.getAttribute("datos")%></p>


	<div class="row">

		<div class="col-md 6">
		
			<a href="Producto?producto=1"> <img
				src="https://lpcdedios.files.wordpress.com/2013/12/tomate.jpg"
				width="300" height="300"></a> 
				
				<a href="Producto?producto=2">	<img
				src="http://imeoobesidad.com/blog/wp-content/uploads/2014/02/lechuga.jpg"
				width="300" height="300"></a> 
				
				<a href="Producto?producto=3">	<img
				src="http://www.tipos.co/wp-content/uploads/2015/02/Los-pescados-se-pueden-clasificar-de-distintas-formas.jpg"
				width="300" height="300"></a>
			

		</div>
		
		<br>
		
		<div class="col-md 6">
			<a href="Producto?producto=4"><img
				src="http://www.blogrecetas.com/files/2013/10/Depositphotos_2501949_m.jpg"
				width="300" height="300"></a> 
				
				<a href="Producto?producto=5"><img
				src="http://i0.wp.com/conviviendoconcandidas.com/wp-content/uploads/2015/04/legumbres.jpg"
				width="300" height="300">
				
				</a> <a href="Producto?producto=fruta"><img
				src="http://www.aguaeden.es/acerca-de-nosotros/blog-agua-eden/wp-content/uploads/2015/04/iStock_000036788012_Large.jpg"
				width="300" height="300"></a>


		</div>
		
		<br>



	</div>


</body>
</html>