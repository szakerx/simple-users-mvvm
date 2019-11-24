package com.example.simpleusersmvvm.dao

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.simpleusersmvvm.models.User

class UserDao {

    // klasa Data Access Object, która ma pobierać dane z bazy danych 
    // dla każdej klasy z modelu mogłaby być osobna

    private val userList = mutableListOf<User>() // lista userów

    fun addUser(user: User) {
        userList.add(user) // dodanie użytkownika do bazy danych 
    }

    fun getUsers(): List<User> {
        return userList // pobranie użytkowników z baz danych
    }
}