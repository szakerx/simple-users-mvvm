package com.example.simpleusersmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.simpleusersmvvm.models.User
import com.example.simpleusersmvvm.viewmodels.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUi()
    }

    private fun initUi() {

        // fabryka ViewModelu
        // zaimplementowana własnoręcznie, żeby ułatwić późniejsze testowanie
        val factory = InjectorUtils.provideUserViewModelFactory() 

        // wyprodukowanie nowego lub otrzymanie istniejącego ViewModelu
        val viewModel = ViewModelProviders.of(this, factory).get(MainActivityViewModel::class.java)

        // wzorzec obserwatora
        // obserwowanie funkcji getUsers w ViewModelu
        viewModel.getUsers().observe(this, Observer { users ->
            val builder = StringBuilder()
            users.forEach{ user ->
                builder.append("$user\n\n")
            }
            text_view.text = builder.toString()
        })

        button.setOnClickListener {
            val user = User(edit_text_name.text.toString(),edit_text_surname.text.toString())
            viewModel.addUser(user)
            edit_text_name.setText("")
            edit_text_surname.setText("")
        }
    }

}
