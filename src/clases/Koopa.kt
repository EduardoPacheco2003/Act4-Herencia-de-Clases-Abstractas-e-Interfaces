package clases

class Koopa : Enemy("Koopa", 2) {
    init {
        println("Iniciando Subclase de $name")
    }

    override fun collision(collider: String) {
        when (collider) {
            "Weapon" -> {
                var state = "Shell"
                println("El estado es ahora $state")
            }

            "Enemy" -> changeDirection()
        }
    }
}