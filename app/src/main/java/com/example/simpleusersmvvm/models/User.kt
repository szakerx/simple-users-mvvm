package com.example.simpleusersmvvm.models

class User(var name: String, var surname:String) {

    override fun toString(): String {
        return "$name $surname"
    }
}