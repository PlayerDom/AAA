<!DOCTYPE html>
	<html>
		<head>
			<meta charset="utf-8">
			<title>Ricerca Binaria</title>
		</head>
		<body>
		<div align="Center">
			<h1>Binary Search</h1>
				<form action="verificaBi" method="post">
				
				<label>Inserisci il numero da cercare</label>
				<input type="number" name="key" min="0" required>
				<input type="submit" name="verifica" value="verifica">

				</form>
				
			<div align="center">
				<% if(request.getAttribute("return")!=null)   {%>
	 			<p>Il numero che cerchi si trova nell'indice: <%= request.getAttribute("return") %>
	 			<% } %>
	 		</div>
				
		</div>		
		</body>
	</html>