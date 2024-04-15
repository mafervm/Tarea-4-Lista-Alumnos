package com.example.example.viewmodels

import com.example.example.R
import com.example.example.models.Person

class PersonViewModels {
    init {}

    fun getPersonList(): ArrayList<Person> {
        var peopleList: ArrayList<Person> = ArrayList<Person>()

        peopleList.add(Person(R.drawable.student_icon, "Estudiante", "Mujer", 12))
        peopleList.add(Person(R.drawable.student_icon, "Estudiante", "Hombre", 14))
        peopleList.add(Person(R.drawable.student_icon, "profesor", "Hombre", 24))
        peopleList.add(Person(R.drawable.student_icon, "streamer", "Mujer", 32))
        peopleList.add(Person(R.drawable.student_icon, "cocinero", "Mujer", 21))
        peopleList.add(Person(R.drawable.student_icon, "mecanico", "Hombre", 65))
        peopleList.add(Person(R.drawable.student_icon, "albañil", "Hombre", 21))
        peopleList.add(Person(R.drawable.student_icon, "artista", "Mujer", 32))

        return peopleList
    }
}