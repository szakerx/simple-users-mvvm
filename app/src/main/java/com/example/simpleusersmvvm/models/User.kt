package com.example.simpleusersmvvm.models

class User(var name: String, var surname:String) {

    // prosty model usera, mogłby znaleźć się tu więcej danych
    
    override fun toString(): String {
        return "$name $surname"
    }
}