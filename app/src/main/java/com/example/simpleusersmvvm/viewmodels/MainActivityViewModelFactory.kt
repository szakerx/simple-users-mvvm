package com.example.simpleusersmvvm.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.simpleusersmvvm.dao.Repository

class MainActivityViewModelFactory(private val repository: Repository): ViewModelProvider.NewInstanceFactory(){
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainActivityViewModel(repository) as T
    }
}