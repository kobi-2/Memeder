package com.mycom.memeder.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.mycom.memeder.R

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.browse_meme_button)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when(v!!.id){
            R.id.browse_meme_button -> startActivity(Intent(this, BrowseMemeHome::class.java))
            R.id.upload_meme_button -> Toast.makeText(this, "Upload A Meme!", Toast.LENGTH_SHORT).show()
            R.id.join_meme_gang_button -> Toast.makeText(this, "Join A Meme Gang!", Toast.LENGTH_SHORT).show()

        }
    }
}
