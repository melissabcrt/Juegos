package edu.iest.juegos.adapters

import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.iest.juegos.R
import edu.iest.juegos.models.Videojuego

class VideojuegoAdapter(
    videojuegos: ArrayList<Videojuego>,
    contexto: Context) {

    var inner_videojuegos: ArrayList<Videojuego>  = videojuegos
    var inner_context: Context = contexto

    inner class ContenedorDeVista(view: View) :
        RecyclerView.ViewHolder(view){
            ///aquí haremos el inflate del layout
            val tvNombre : TextView
            val tvPrecio : TextView
            val ivFoto : ImageView
            val tvConsola : TextView
            val bnComprar : Button
            init {
                // Define click listener for the ViewHolder's View.
                tvNombre = view.findViewById(R.id.tvNombre)
                tvPrecio = view.findViewById(R.id.tvPrecio)
                ivFoto = view.findViewById(R.id.ivFoto)
                tvConsola = view.findViewById(R.id.tvConsola)
                bnComprar = view.findViewById(R.id.bnComprar)
            }
    }
}