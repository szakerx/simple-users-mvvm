package com.example.simpleusersmvvm

import com.example.simpleusersmvvm.dao.Database
import com.example.simpleusersmvvm.dao.Repository
import com.example.simpleusersmvvm.viewmodels.MainActivityViewModelFactory

object InjectorUtils {
    fun provideUserViewModelFactory(): MainActivityViewModelFactory {
        val repository = Repository.getInstance(Database.getInstance().userDao)
        return MainActivityViewModelFactory(
            repository
        )
    }
}