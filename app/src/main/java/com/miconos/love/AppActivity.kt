package com.miconos.love

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.ListView
import android.widget.SimpleAdapter

class AppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)
        val data = listOf(
            mapOf("appName" to "オススメアプリ", "appTxt" to "おすすめアプリです"),
            mapOf("appName" to "オススメアプリ", "appTxt" to "おすすめアプリです"),
            mapOf("appName" to "オススメアプリ", "appTxt" to "おすすめアプリです"),
            mapOf("appName" to "オススメアプリ", "appTxt" to "おすすめアプリです"),
            mapOf("appName" to "オススメアプリ", "appTxt" to "おすすめアプリです"),
            mapOf("appName" to "オススメアプリ", "appTxt" to "おすすめアプリ"),
            mapOf("appName" to "オススメアプリ", "appTxt" to "おすすめアプリです"),
            mapOf("appName" to "オススメアプリ", "appTxt" to "おすすめアプリです"),
            mapOf("appName" to "オススメアプリ", "appTxt" to "おすすめアプリだよ"),
            mapOf("appName" to "オススメアプリ", "appTxt" to "おすすめアプリです"),
            mapOf("appName" to "オススメアプリ", "appTxt" to "おすすめアプリです"),
            mapOf("appName" to "オススメアプリ", "appTxt" to "おすすめアプリです")
        )
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

        val list = findViewById<ListView>(R.id.Applist)
        list.onItemClickListener = ListItemClickListener()
        list.adapter = SimpleAdapter(
            this,
            data,
            R.layout.applist,
            arrayOf("appName", "appTxt"),
            intArrayOf(R.id.appName, R.id.appTxt)
        )

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private inner class ListItemClickListener : AdapterView.OnItemClickListener {
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            // インテントオブジェクトを生成。
            val ProfilePape = Intent(this@AppActivity, ProfileActivity::class.java)
            // 第2画面の起動。
            startActivity(ProfilePape)
        }
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