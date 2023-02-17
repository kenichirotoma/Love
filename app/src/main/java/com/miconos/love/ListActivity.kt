package com.miconos.love

import android.content.Intent
import android.location.Address
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

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

        val dataList = listOf(

            ListItem(
                1, "ニックネームだから",
                "25歳",
                "東京都練馬区",
                "9/1",
                "14:56",
                "プロフィールです。プロフィールです。プロフィールです。プロフィールです。プロフィールです。プロフィールです。",
                ),
            ListItem(
                2, "ニックネーム2",
                "27歳",
                "東京都東村山市",
                "8/31",
                "13:53",
                "プロフィールです。プロフィールです。プロフィールです。プロフィールです。プロフィールです。",
                ),
            ListItem(
                3, "ニックネーム4",
                "28歳",
                "東京都新宿区",
                "9/2",
                "15:56",
                "プロフィールです。プロフィールです。プロフィールです。プロフィールです。プロフィールです。プロフィールです。",
                ),
            ListItem(
                4, "ニックネーム44",
                "29歳",
                "東京都杉並区",
                "10/1",
                "15:56",
                "プロフィールです。プロフィールです。プロフィールです。プロフィールです。プロフィールです。プロフィールです。プロフィールです。",
                ),
            ListItem(
                5, "ネーム",
                "32歳",
                "東京都新宿区",
                "7/28",
                "13:56",
                "プロフィールです。プロフィールです。プロフィールです。プロフィールです。プロフィールです。プロフィールです。プロフィールです。",
                ),
            ListItem(
                6, "ネーム777",
                "32歳",
                "東京都新宿区",
                "8/31",
                "13:56",
                "プロフィールです。",
                ),
            ListItem(
                7, "ニック",
                "44歳",
                "東京都新宿区",
                "8/4",
                "13:36",
                "プロフィールです。プロフィールです。プロフィールです。プロフィールです。",
                ),
            ListItem(
                8, "ネーム",
                "33歳",
                "東京都新宿区",
                "8/31",
                "13:56",
                "プロフィールです。",
                ),
            ListItem(
                9, "ニック",
                "25歳",
                "東京都墨田区",
                "8/1",
                "11:56",
                "プロフィールです。",
                ),
            ListItem(
                10, "ニックネーム",
                "25歳",
                "東京都新宿区",
                "8/31",
                "13:56",
                "プロフィールです。",
                ),
            )

        val list = findViewById<ListView>(R.id.chatlist)
        list.onItemClickListener = ListItemClickListener()
        list.adapter = MyListAdapter(this, dataList, R.layout.listitem)


        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    private inner class ListItemClickListener : AdapterView.OnItemClickListener {
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            // インテントオブジェクトを生成。
            val NickName = findViewById<TextView>(R.id.NickName)
            // val YourGender = findViewById<RadioGroup>(R.id.YourGender)
            val YourAddress = findViewById<TextView>(R.id.YourAddress)
            val YourAge = findViewById<TextView>(R.id.YourAge)
            val Profile = findViewById<TextView>(R.id.Profile)

            val ProfilePage = Intent(this@ListActivity, ProfileActivity::class.java).apply {
                putExtra("NickName",NickName.text.toString())
                putExtra("YourAge",YourAge.text.toString())
                putExtra("YourAddress",YourAddress.text.toString())
                putExtra("Profile",Profile.text.toString())
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