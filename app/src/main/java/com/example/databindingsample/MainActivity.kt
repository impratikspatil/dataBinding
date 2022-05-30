package com.example.databindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.button.setOnClickListener {
            binding.apply {
                txtview.text = "welcome " + edittextname.text
                edittextname.text.clear()

                //this clear() will clear text inside textview
            }
            //here I have used bindig.apply{ } so it will help us not to use bindig many times so that we can directly use id's of view

        }
    }
}




    //In this project I have just used dataBinding so this project is only for understanding databinding

    // Enable dataBindind

    //wrap xml with layout tag <layout> </layout> so that binding class of that layout will be generated

    // create binding object on binding class and use wherever you want

    //we can use binding.apply{ } feateure so that we don't need to use binding word multiple times.