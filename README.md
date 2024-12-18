# Conversor de Monedas consumiendo ExchangeRate-API

Este proyecto es un **conversor de monedas** en Java que utiliza la API de **ExchangeRate-API** para obtener las tasas de cambio en tiempo real. El programa permite convertir entre diversas monedas, como USD, ARS, BRL y COP, a través de un menú interactivo.

## Características

- Permite seleccionar entre varias opciones de conversión de monedas.
- Consume la API pública de ExchangeRate-API para obtener las tasas de cambio actuales.
- Redondea los resultados a dos decimales.
- Muestra el valor convertido y el tipo de cambio utilizado.

## Tecnologías Utilizadas

- **Java 17+**: El lenguaje de programación utilizado.
- **Gson**: Para parsear la respuesta JSON de la API.
- **ExchangeRate-API**: API pública para obtener las tasas de cambio en tiempo real.
- **HttpClient**: Para realizar las peticiones HTTP.

## Instalación

### Requisitos previos

1. **Java 17 o superior**.
2. Una clave de API de **ExchangeRate-API**. Puedes obtener una clave gratuita registrándote en su [sitio web](https://www.exchangerate-api.com/).

### Pasos para la instalación

1. Clona este repositorio o descarga los archivos del proyecto.

   ```bash
   https://github.com/bradMr11/ConversorDeMonedas
