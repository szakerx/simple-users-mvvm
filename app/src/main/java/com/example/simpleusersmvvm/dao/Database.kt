package com.example.simpleusersmvvm.dao

class Database private constructor(){
    var userDao = UserDao()
        private set

    companion object{
        private var instance: Database? = null

        fun getInstance(): Database {
            if(instance==null)
                instance = Database()
            return instance as Database
        }
    }
}