<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Colors Page</title>
</head>
<body>

<body style="background-color:${colore};">

<h1>Questa è la Pagina dei Colori! </h1>
<p>Colore scelto: ${param} ^-^

<img src="hotice.gif" alt="Colori base" width="300" height="300" align="right">


<h2>Qui di seguito potrai scegliere il colore della pagina:</h2>

<h3>Colori caldi:</h3>

<p><form action = "Color" method ="get">
-Sfondo Rosso :
<input type="hidden" name = "param" value = "red">
<input type = submit>
</form>

<p><form action = "Color" method ="get">
-Sfondo Giallo :
<input type="hidden" name = "param" value = "yellow">
<input type = submit>
</form>

<p><form action = "Color" method ="get">
-Sfondo Arancione :
<input type="hidden" name = "param" value = "orange">
<input type = submit>
</form>

<h3>Colori freddi:</h3>

<p><form action = "Color" method ="get">
-Sfondo Blu :
<input type="hidden" name = "param" value = "blue">
<input type = submit>
</form>

<p><form action = "Color" method ="get">
-Sfondo Viola :
<input type="hidden" name = "param" value = "violet">
<input type = submit>
</form>

<p><form action = "Color" method ="get">
-Sfondo Verde :
<input type="hidden" name = "param" value = "lime">
<input type = submit>
</form>


</body>
</html>