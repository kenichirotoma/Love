package com.miconos.love

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.miconos.love.databinding.ActivityHomeBinding


class SubActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*
        setContentView(R.layout.activity_home)
        */

        val homechat = findViewById<Button>(R.id.chatbtn)
        homechat.setOnClickListener {
            val i = Intent(this,ChatActivity::class.java)
            startActivity(i)
        }
        val homefootstemps = findViewById<Button>(R.id.footstempsbtn)
        homefootstemps.setOnClickListener {
            val i = Intent(this,FootstempsActivity::class.java)
            startActivity(i)
        }
        val homefavorite = findViewById<Button>(R.id.favoritebtn)
        homefavorite.setOnClickListener {
            val i = Intent(this,FavoriteActivity::class.java)
            startActivity(i)
        }

        val msg = findViewById<Button>(R.id.msg)
        msg.setOnClickListener {
            val i = Intent(this,MessageActivity::class.java)
            startActivity(i)
        }
        val footstemps = findViewById<Button>(R.id.footstemps)
        footstemps.setOnClickListener {
            val i = Intent(this,FootstempsActivity::class.java)
            startActivity(i)
        }
        val recommend = findViewById<Button>(R.id.recommend)
        recommend.setOnClickListener {
            val i = Intent(this,AppActivity::class.java)
            startActivity(i)
        }
        val newsbtn = findViewById<Button>(R.id.newsBtn)
        newsbtn.setOnClickListener {
            val i = Intent(this,NewsActivity::class.java)
            startActivity(i)
        }
    }
}

