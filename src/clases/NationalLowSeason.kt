package clases

import clases.interfaces.CancelTravel
import clases.interfaces.IPromotion

class NationalLowSeason(city: String) : National(city), IPromotion, CancelTravel {
    override val discount: Int = 10 // Definir el descuento para la temporada baja
    override val typeDiscount: Int = 0 // Tipo de descuento (0 para porcentaje)


    override fun getPrice(numDays: Int): Int {
        val amount = super.getPrice(numDays);
        return if (amount == 0) 0 else getDiscountPrice(amount);
    }

    override fun cancelTravel(){
        println("El viaje ha sido cancelado");
    }
}
