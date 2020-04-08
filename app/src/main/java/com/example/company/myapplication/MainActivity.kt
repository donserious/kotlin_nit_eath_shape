package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write your code here

        butAnswer.setOnClickListener{btnClick()}

    }



    private fun btnClick() {
        var idObj:Int = rgAnswers.checkedRadioButtonId
        if (idObj!=-1) {
            var rdButton: RadioButton = findViewById(idObj)
            if (rdButton.text.toString() == "шар") {
                tvAnswer.text = "Правильно!"
            } else {
                tvAnswer.text = "Неправильно!"
            }
        } else {
            tvAnswer.text = "Неправильно!"
        }
    }
}
