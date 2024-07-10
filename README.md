<h1> Conversor de Monedas </h1>
 
Este es un programa de conversión de monedas que permite a los usuarios convertir entre varias monedas utilizando datos en tiempo real obtenidos de una API de tasas de conversión.

<h3>Características</h3>
<ul>
  <li>Conversión entre Dólar (USD) y Peso Argentino (ARS).</li>
  <li>Conversión entre Dólar (USD) y Real Brasileño (BRL).</li>
  <li>Conversión entre Dólar (USD) y Peso Colombiano (COP).</li>
</ul>
 Conversión en ambas direcciones para las monedas mencionadas.

<h3>Requisitos</h3>
<ul>
  <li>Java 11 o superior.</li>
  <li>Dependencia de Gson para manejar las respuestas JSON de la API.</li>
  </ul>


<h3>Estructura del Proyecto</h3>
<ul>
  <li>Menu: Clase que muestra el menú y gestiona la interacción con el usuario..</li>
  <li>ConsultaApi: Clase que realiza las consultas a la API de tasas de conversión.</li>
  <li>Moneda: Clase que representa la estructura de datos devuelta por la API.</li>
  <li>ConversorMoneda: Clase que contiene la lógica para convertir monedas.</li>
</ul>



<h3>API de Tasas de Conversión</h3>
Este proyecto utiliza la API de ExchangeRate-API para obtener las tasas de conversión de monedas en tiempo real. Necesitarás una clave de API válida, que puedes obtener registrándote en su sitio web.
