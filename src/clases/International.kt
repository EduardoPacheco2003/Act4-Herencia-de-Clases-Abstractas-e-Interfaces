package clases.clases

import clases.Travel

/*
* A partir del proyecto del sistema de reserva de Viajes (Class Travel) realiza los siguientes puntos:
Crear la clase International para viajes internacionales, contemplar que ahora el usuario proporciona el nombre del Pais y la Cuidad.
Existe un miembro en la Clase Travel que a pesar de ser abstracta, podría ser idéntico tanto en National como en International.
* En caso de afirmación, agrega el cuerpo en la clase abstracta y elimínala de sus hijos.
Debemos establecer los impuestos por país, y las ciudades a donde viajar:

Alemania tiene el 16% del precio total como impuesto y las ciudades disponibles son:
Munich, $980 por día
Berlín, $820 por día
Francfort, $850 por día
*
Chile cobra únicamente el 5% como impuesto y sus ciudades son:
Santiago, $643 por día
Valparaíso, $721 por día
Canadá cobra el 10% de impuesto y las ciudades a visitar son:

Vancouver, $620 por día
Ottawa, $680 por día
Montreal, $600 por día
Redefinir la función getPrice() para que se obtenga el precio de un viaje con impuesto incluido.
Generar una interfaz que permita cancelar viajes. Implementarlo en la clase NationalLowSeason.
* */

class International(override val city: String, override val country: String): Travel(){

    private val taxes = mapOf(
        "Alemania" to 0.16,
        "Chile" to 0.05,
        "Canada" to 0.10
    )

    private val fees = mapOf(
        "Alemania" to mapOf(
            "Berlin" to 820,
            "Munich" to 980,
            "Francfort" to 850
        ),
        "Chile" to mapOf(
            "Santiago" to 643,
            "Valparaiso" to 721,
        ),
        "Canada" to mapOf(
            "Ottawa" to 680,
            "Vancouver" to 620,
            "Montreal" to 600
        )
    )

    override fun getPrice(numDays: Int): Int {
        val fee = fees[country]?.get(city)
        val tax = taxes[country]
        return if (fee == null || tax == null) 0 else (fee * numDays * (1 + tax)).toInt()
    }


}