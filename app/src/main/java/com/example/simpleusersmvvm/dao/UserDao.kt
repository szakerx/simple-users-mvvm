package com.example.simpleusersmvvm.dao

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.simpleusersmvvm.models.User

class UserDao {
    private val userList = mutableListOf<User>() //sztuczna baza danych

    fun addUser(user: User) {
        userList.add(user) //proces dodania uzytkownika do bazy danych
    }

    fun getUsers(): List<User> {
        return userList
    }
}