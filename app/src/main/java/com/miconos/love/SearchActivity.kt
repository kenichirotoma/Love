package com.miconos.love

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.ListView

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

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

        val searchList = listOf(
            ListItem(1,  "ニックネーム",
                "25歳",
                "東京都新宿区",
                "8/31",
                "13:56",
                "プロフィールです。",

                ),
            ListItem(2,  "ニックネーム2",
                "26歳",
                "東京都新宿区",
                "8/31",
                "13:56",
                "プロフィールです。",

                ),
            ListItem(3,  "ニックネーム",
                "25歳",
                "東京都新宿区",
                "8/31",
                "13:56",
                "プロフィールです。",

                ),
            ListItem(4,  "ニックネーム",
                "25歳",
                "東京都新宿区",
                "8/31",
                "13:56",
                "プロフィールです。",

                ),
            ListItem(5,  "ニックネーム",
                "25歳",
                "東京都新宿区",
                "8/31",
                "13:56",
                "プロフィールです。",

                ),
            ListItem(6,  "ニックネーム",
                "25歳",
                "東京都新宿区",
                "8/31",
                "13:56",
                "プロフィールです。",

                ),
            ListItem(7,  "ニックネーム",
                "25歳",
                "東京都新宿区",
                "8/31",
                "13:56",
                "プロフィールです。",

                ),
            ListItem(8,  "ニックネーム",
                "25歳",
                "東京都新宿区",
                "8/31",
                "13:56",
                "プロフィールです。",

                ),
            ListItem(9,  "ニックネーム",
                "25歳",
                "東京都新宿区",
                "8/31",
                "13:56",
                "プロフィールです。",

                ),
            ListItem(10,  "ニックネーム",
                "25歳",
                "東京都新宿区",
                "8/31",
                "13:56",
                "プロフィールです。",

                ),

            )

        val list = findViewById<ListView>(R.id.search_list)
        list.onItemClickListener = ListItemClickListener()
        list.adapter = MyListAdapter(this, searchList, R.layout.listitem)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private inner class ListItemClickListener : AdapterView.OnItemClickListener {
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {

            // インテントオブジェクトを生成。
            val ProfilePage = Intent(this@SearchActivity, ProfileActivity::class.java).apply {
            }

            // 第2画面の起動。
            startActivity(ProfilePage)

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