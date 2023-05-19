package com.miconos.love

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Love.App // Under_son// character voice // navigator
        // DownTownMaker: App_o_ll_o*13

        // 脚色状況支援装置バイオポリティクス発展開発環境移行型『まどろみ』
        // 夕涼
        // 環境補正装置破壊認証決定記録

        // 洗脳放送シグマ
        // カードゲーム　
        // 悪魔と対戦して勝利すると仲間として捕獲。
        // 出会えるロールプレイング。

//        ボイスメッセージ
        // ボイスチャットアプリ(twitter,instagram,TiKtok連動)
        // ドライブレコーダー　サウンドクラウド、ユーチューブ、GPS機能
        //　コミュニティ機能
        // 2shotメール機能、サークル機能、

//        道路案内図
//        待ち合わせ場所
//        ホテル
//        マッチングアプリ

//        カードゲーム
//        レンタルコスプレ宅配ショップ
//        Vapeハンバーガー　相沢みなみプロデュース

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

        val msgbtn = findViewById<Button>(R.id.msg)
        msgbtn.setOnClickListener {
            val i = Intent(this,ChatActivity::class.java)
            startActivity(i)
        }

        val footstempsbtn = findViewById<Button>(R.id.footstemps)
        footstempsbtn.setOnClickListener {
            val i = Intent(this,FootstempsActivity::class.java)
            startActivity(i)
        }

        val recommendbtn = findViewById<Button>(R.id.recommend)
        recommendbtn.setOnClickListener {
            val i = Intent(this,AppActivity::class.java)
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