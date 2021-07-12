package com.example.news

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


    }

    fun scienceNews(view: View) {

        Toast.makeText(this, "Science Section", Toast.LENGTH_LONG).show()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }
    fun entertainmentNews(view: View) {

        Toast.makeText(this, "Entertainment Section", Toast.LENGTH_LONG).show()
        val intent = Intent(this, Entertainment::class.java)
        startActivity(intent)



    }
    fun sportsNews(view: View) {


        Toast.makeText(this, "Sports Section", Toast.LENGTH_LONG).show()
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)


    }
    fun businessNews(view: View) {

        Toast.makeText(this, "Business Section", Toast.LENGTH_LONG).show()
        val intent = Intent(this, Business::class.java)
        startActivity(intent)


    }
}