package com.example.simpleusersmvvm.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.simpleusersmvvm.dao.Repository
import com.example.simpleusersmvvm.models.User

class MainActivityViewModel(private val repository: Repository): ViewModel() {

    private val users = MutableLiveData<List<User>>()

    fun getUsers(): LiveData<List<User>> {
        users.value = repository.getUsers()
        return users
    }


    fun addUser(user: User) {
        repository.addUser(user)
        getUsers()
    }

}