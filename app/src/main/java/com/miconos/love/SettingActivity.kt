package com.miconos.love

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        val startbtn = findViewById<Button>(R.id.starttxt)
        startbtn.setOnClickListener {
            val i = Intent(this,ChatActivity::class.java)
            startActivity(i)
        }
        val recommendbtn = findViewById<Button>(R.id.recommend)
        recommendbtn.setOnClickListener {
            val i = Intent(this,AppActivity::class.java)
            startActivity(i)
        }
        val term = findViewById<Button>(R.id.terms)
        term.setOnClickListener {
            val i = Intent(this,TermActivity::class.java)
            startActivity(i)
        }
        val policy = findViewById<Button>(R.id.policy)
        policy.setOnClickListener {
            val i = Intent(this,PrivacyActivity::class.java)
            startActivity(i)
        }
        val infobtn = findViewById<Button>(R.id.Operation)
        infobtn.setOnClickListener {
            val i = Intent(this,OperationActivity::class.java)
            startActivity(i)
        }
        val  Contactbtn = findViewById<Button>(R.id.Contact)
        Contactbtn.setOnClickListener {
            val i = Intent(this,ContactActivity::class.java)
            startActivity(i)
        }
        val chatbtn = findViewById<Button>(R.id.chat)
        chatbtn.setOnClickListener {
            val i = Intent(this,ChatActivity::class.java)
            startActivity(i)
        }
        val searchbtn = findViewById<Button>(R.id.search)
        searchbtn.setOnClickListener {
            val i = Intent(this,SearchActivity::class.java)
            startActivity(i)
        }
        val homebtn = findViewById<Button>(R.id.home)
        homebtn.setOnClickListener {
            val i = Intent(this,HomeActivity::class.java)
            startActivity(i)
        }
        val mypagebtn = findViewById<Button>(R.id.mypage)
        mypagebtn.setOnClickListener {
            val i = Intent(this,MypageActivity::class.java)
            startActivity(i)
        }
        val settingbtn = findViewById<Button>(R.id.setting)
        settingbtn.setOnClickListener {
            val i = Intent(this,SettingActivity::class.java)
            startActivity(i)
        }
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // android.R.id.home に戻るボタンを押した時のidが取得できる
        if (item.itemId == android.R.id.home) {
            // 今回はActivityを終了させている
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}