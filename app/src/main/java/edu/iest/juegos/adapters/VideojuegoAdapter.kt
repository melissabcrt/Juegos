package edu.iest.juegos.adapters

import android.content.Context
import edu.iest.juegos.models.Videojuego

class VideojuegoAdapter(
    videojuegos: ArrayList<Videojuego>,
    contexto: Context) {

    var inner_videojuegos: ArrayList<Videojuego>  = videojuegos
    var inner_context: Context = contexto
}