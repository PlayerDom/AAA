<!DOCTYPE html>
	<html>
		<head>
		<meta charset="utf-8">
		<title>Isograma</title>
		</head>
		
		
		<body>
		<div align="Center">
			<h1>Verifica Isogramma</h1>
				<form action="verificaIso" method="post">
				
				<label>Inserisci la frase da verificare</label>
				<input type="text" name="frase" required>
				<input type="submit" name="verifica" value="verifica">

				</form>
				
			<div align="center">
				<% if(request.getAttribute("return")!=null)   {%>
	 			<p><%= request.getAttribute("return") %>
	 			<% } %>
	 		</div>
				
		</div>
		</body>
	</html>