package clases.clases

class Phone {
    //Atributos
    var isOn = false
    lateinit var model: String

    //Métodos
    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun getTurn() {
        val turnMode = if (isOn) "Encendido" else "Apagado"
        println("El teléfono esta $turnMode")
    }
}