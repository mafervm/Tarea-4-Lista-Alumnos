package com.example.example.viewmodels

import com.example.example.R
import com.example.example.models.Poke

class PokeViewModels {
    init {}

    fun getPokeList(): ArrayList<Poke> {
        var pokeList: ArrayList<Poke> = ArrayList<Poke>()

        pokeList.add(Poke(R.drawable.student_icon, "Spirigatito"))
        pokeList.add(Poke(R.drawable.student_icon, "Fuecoco"))
        pokeList.add(Poke(R.drawable.student_icon, "Quaxly"))

        return pokeList
    }
}