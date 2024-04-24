<%--
  Created by IntelliJ IDEA.
  User: Programador
  Date: 24/04/2024
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Listas y tablas</title>
</head>
<body>
    <h1>Listas y tablas en HTML</h1>
<!--Listas ordenadas-->
<ol>
    <li>Pera</li>
    <li>Manzana</li>
    <li>Uva</li>
    <li>Platano</li>
    <li>Freza</li>
    <li>Piña</li>
</ol>
    <ol type="I" reversed>
        <!-- ol>li*5-->
        <li>Pera</li>
        <li>Manzana</li>
        <li>Uva</li>
        <li>Platano</li>
        <li>Freza</li>
        <li>Piña</li>
    </ol>
    <ol start="25">
        <li>Pera</li>
        <li>Manzana</li>
        <li>Uva</li>
        <li>Platano</li>
        <li>Freza</li>
        <li>Piña</li>
    </ol>
    <h2>Listas encadenadas</h2>
    <ul>
        <li>Pera</li>
        <li>Manzana
        <ul>
         <li>Golden</li>
         <li>Royal
             <ul>
                 <li>Pequeña</li>
                 <li>Grande</li>
             </ul>
         </li>

         <li>Fuji</li>
        </ul>
        </li>
        <li>Uva</li>
        <li>Platano</li>
        <li>Freza</li>
        <li>Piña</li>
    </ul>
    <ol>
        <h2>Listas no ordenadas</h2>
        <ul>
            <li>Pera</li>
            <li>Manzana</li>
            <li>Uva</li>
            <li>Platano</li>
            <li>Freza</li>
            <li>Piña</li>
        </ul>
        <h2>Listas de definiciones</h2>
        <dl>
            <dt>Java</dt>
            <dd>Lenguaje de programacion del lado del Servidor</dd>
            <dt>JavaScript</dt>
            <dd>Lenguaje de programacion del lado del Cliente</dd>
        </dl>
    </ol>
          <h2>Tablas</h2>
<table border="1" style="border-collapse: collapse">
    <tr>
        <td>Nombre</td>
        <td>Apelldo</td>
        <td>Direccion</td>
        <td>Telefono</td>
        <td>Edad</td>
        <td>Email</td>
        <td>Acciones</td>
    </tr>
    <tr>
        <td>Fran</td>
        <td>Gonzales</td>
        <td>Calle Doña Crisanta</td>
        <td>655555555</td>
        <td>32</td>
        <td>fran@gmail.com</td>
        <td>
            <a href="#" title="Actualizar">✏</a>
            <a href="#" title="Eliminar">🗑</a>
        </td>
    </tr>
    <tr>
        <td>Isabel</td>
        <td>garcia</td>
        <td>Calle Estacion</td>
        <td>647138888</td>
        <td>35</td>
        <td>isa@gmail.com</td>
        <td>
            <a href="#" title="Actualizar">✏</a>
            <a href="#" title="Eliminar">🗑</a>
        </td>
    </tr>



</table>

</body>
</html>
