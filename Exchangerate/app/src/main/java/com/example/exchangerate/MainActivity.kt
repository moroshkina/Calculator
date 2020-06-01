package com.example.exchangerate

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        if(input_num.text.isNotEmpty()){
            var a :Double = input_num.getText().toString().toDouble()
            a /= 74
            this.output_num.setText(a.toString())
        }
    }

}

