package clases

import clases.clases.International
import clases.dataClasses.Movie

fun main() {
    //val mario = Mario();
    //val goomba = Goomba();
    //val koopa = Koopa();

    //mario.collision("Goomba");
    //koopa.collision("Weapon");
    /*
        val national = National("Monterrey");
        val nationalLowSeason = NationalLowSeason("Monterrey");

        nationalLowSeason.quotePrice(2);
        nationalLowSeason.reserve(4);
    */
//    val scaryMovie = Movie("Scary Movie", "Comedy", 120);
//    println(scaryMovie);
//    println(scaryMovie.name);
//    println(scaryMovie.createdAtr);
//    println(scaryMovie.component3());
//
//    val (name, genre, duration) = scaryMovie;
//    println("La duración de la película [$name] es de $duration minutos");
//    val (_, genre2, duration2) = scaryMovie;
//    println("La duración de la película es de $duration2 minutos");
//
//    val movie2 = scaryMovie.copy(name = "Scary Movie 2");
//    println(
//        """
//        |Scary Movie: $scaryMovie
//        |Scary Movie 2: $movie2
//    """.trimIndent()
//    );
    val national = National("Monterrey");
    national.quotePrice(4);
    national.reserve(4);

    val international = International("Munich", "Alemania");
    international.quotePrice(4);
    international.reserve(4);




}