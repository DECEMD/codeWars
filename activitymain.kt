package com.example.myfirstapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(kek: Bundle?) {
        super.onCreate(kek)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            val resultValue = binding.edValue.text.toString()
            when(resultValue){
                Constance.DIRECTOR_NAME -> {
                    binding.textView3.visibility = View.VISIBLE
                    val tempText = "Получите ваши: ${Constance.DIRECTOR_ZP}"
                    if(binding.edPassword.text.toString() == Constance.DIRECTOR_PASSWORD.toString()){
                        binding.imPhoto.setImageResource(R.drawable.director)
                        binding.imPhoto.visibility = View.VISIBLE
                    binding.textView3.text = tempText
                    } else {
                        binding.imPhoto.setImageResource(R.drawable.figa)
                        binding.imPhoto.visibility = View.VISIBLE
                        binding.textView3.text = "Неверный пароль"
                    }
                }
                Constance.ENGINEER_NAME -> {
                    binding.textView3.visibility = View.VISIBLE
                    val tempText = "Получите ваши: ${Constance.ENGINEER_ZP}"
                    if(binding.edPassword.text.toString() == Constance.ENGINEER_PASSWORD.toString()){
                        binding.imPhoto.setImageResource(R.drawable.engineer)
                        binding.imPhoto.visibility = View.VISIBLE
                        binding.textView3.text = tempText
                    } else {
                        binding.imPhoto.setImageResource(R.drawable.figa)
                        binding.imPhoto.visibility = View.VISIBLE
                        binding.textView3.text = "Неверный пароль"
            }

                }
                Constance.DVORNIK_NAME -> {
                    binding.textView3.visibility = View.VISIBLE
                    val tempText = "Получите ваши: ${Constance.DVORNIK_ZP}"
                    if(binding.edPassword.text.toString() == Constance.DVORNIK_PASSWORD.toString()){
                        binding.imPhoto.setImageResource(R.drawable.dvornik)
                        binding.imPhoto.visibility = View.VISIBLE
                        binding.textView3.text = tempText
                    } else {
                        binding.imPhoto.setImageResource(R.drawable.figa)
                        binding.imPhoto.visibility = View.VISIBLE
                        binding.textView3.text = "Неверный пароль"
                    }

                }

            }
        }

    }

}

