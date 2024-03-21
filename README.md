# Pacheco Cruz Eduardo | 6NM61

## Actividad 4. Herencia de Clases Abstractas e Interfaces

### Instruciones

A partir del proyecto del sistema de reserva de Viajes (Class Travel) realiza los siguientes puntos:

1. Crear la clase International para viajes internacionales, contemplar que ahora el usuario proporciona el nombre del Pais y la Cuidad.
1. Existe un miembro en la Clase Travel que a pesar de ser abstracta, podría ser idéntico tanto en National como en International. En caso de afirmación, agrega el cuerpo en la clase abstracta y elimínala de sus hijos.
1. Debemos establecer los impuestos por país, y las ciudades a donde viajar:

- Alemania tiene el 16% del precio total como impuesto y las ciudades disponibles son:
  - Munich, $980 por día
  - Berlín, $820 por día
  - Francfort, $850 por día
- Chile cobra únicamente el 5% como impuesto y sus ciudades son:

  - Santiago, $643 por día
  - Valparaíso, $721 por día

- Canadá cobra el 10% de impuesto y las ciudades a visitar son:
  - Vancouver, $620 por día
  - Ottawa, $680 por día
  - Montreal, $600 por día

### Solución

El miembro de clase travel que a pesar de ser abstracto, podría ser identico tanto en National como en International, es el método **_quotePrice_**, por lo que se agrega el cuerpo en la clase abstracta y se elimina de sus hijos.

![image](https://github.com/EduardoPacheco2003/Act4-Herencia-de-Clases-Abstractas-e-Interfaces/assets/100945554/c3330693-abc8-45d0-9751-5de9df202e82)

#### Clase International

4.  Redefinir la función getPrice() para que se obtenga el precio de un viaje con impuesto incluido.

![image-1](https://github.com/EduardoPacheco2003/Act4-Herencia-de-Clases-Abstractas-e-Interfaces/assets/100945554/2aa93d04-9a59-48ce-beed-352b0a40a471)

5. Crear una interfaz que permita cancelar viajes. Implementarlo en la clase NationalLowSeason.

![image-2](https://github.com/EduardoPacheco2003/Act4-Herencia-de-Clases-Abstractas-e-Interfaces/assets/100945554/f458a168-1c33-486c-bf46-ad984f71b05c)

Implementación de la interfaz en la clase NationalLowSeason.

![image-3](https://github.com/EduardoPacheco2003/Act4-Herencia-de-Clases-Abstractas-e-Interfaces/assets/100945554/63ceabbb-9a38-4165-82fa-1e4b052baf8c)
