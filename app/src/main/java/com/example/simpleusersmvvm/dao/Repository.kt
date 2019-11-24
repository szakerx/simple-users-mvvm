package com.example.simpleusersmvvm.dao

import com.example.simpleusersmvvm.models.User

class Repository private constructor(private val userDao: UserDao){

    // punkt zarządzania bazami
    // miejsce, w którym można określić skąd pobierać dane

    companion object{
        private var instance: Repository? = null

        fun getInstance(userDao: UserDao): Repository {
            if(instance==null)
                instance = Repository(userDao)
            return instance as Repository
        }
    }
    fun addUser(user: User) {
        userDao.addUser(user)
    }

    fun getUsers() = userDao.getUsers()
}