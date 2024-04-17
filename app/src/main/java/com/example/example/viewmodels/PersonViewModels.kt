package com.example.example.viewmodels

import com.example.example.R
import com.example.example.models.Person

class PersonViewModels {
    init {}

    fun getPersonList(): ArrayList<Person> {
        var peopleList: ArrayList<Person> = ArrayList<Person>()

        peopleList.add(Person(R.drawable.student_icon, 19475, "Edson de Jesús Maya Mendez", "edson.maya@iest.edu.mx",8,"ISND",true,95,0))
        peopleList.add(Person(R.drawable.student_icon, 19508, "Aylin Alvarez Hernandez", "aylin.alvarez@iest.edu.mx",8,"ISND",true,94,0))
        peopleList.add(Person(R.drawable.student_icon, 19523, "Yoselin Alejandra Mojica Ahumada", "yoselin.mojica@iest.edu.mx",8,"ISND",true,93,0))
        peopleList.add(Person(R.drawable.student_icon, 19666, "Sebastian Rubio Quiroz", "sebastian.rubio@iest.edu.mx",8,"ISND",true,99,0))
        peopleList.add(Person(R.drawable.student_icon, 21637, "Josue David Arreola Aguilera", "josue.arreola@iest.edu.mx",8,"ISND",true,98,0))
        peopleList.add(Person(R.drawable.student_icon, 21767, "María Fernanda Villarreal Mar", "maria.villarreal02@iest.edu.mx",8,"ISND",true,93,0))
        peopleList.add(Person(R.drawable.student_icon, 22098, "Gerardo Torres García", "gerardo.torres@iest.edu.mx",8,"ISND",true,94,0))
        peopleList.add(Person(R.drawable.student_icon, 22154, "Luis Javier Zapata Perales", "luis.zapata01@iest.edu.mx",8,"ISND",true,93,0))
        peopleList.add(Person(R.drawable.student_icon, 22180, "Alfonso Madero Benítez", "alfonso.madero@iest.edu.mx",8,"ISND",true,90,0))
        peopleList.add(Person(R.drawable.student_icon, 22208, "David Alejandro Rivera Luna", "david.rivera@iest.edu.mx",8,"ISND",true,93,0))
        peopleList.add(Person(R.drawable.student_icon, 22210, "Raymundo Gutierrez Gerrero", "raymundo.gutierrez@iest.edu.mx",8,"ISND",false,95,0))

        return peopleList
    }
}