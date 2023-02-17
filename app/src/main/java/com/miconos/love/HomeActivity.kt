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

        // セックスフレンドアドレスリスト

        // パスワード認証
        // BillingColorChanger=>C.L.O.C.K.
        // ==>>実際に円交換はしないが
        // アプリへの課金金額によって色が変わりヘルスサービスのレーティングアクションをリクエスすることが出来る。
        // バナー制作　
        // 客層　登録リストによってゾーンニング登録
        // 一括決済管理
        // タレント・AV女優公認SNS連動アプリ

        // デリヘル嬢からの登録斡旋。
        // 待ち合わせ場所設定型サクラメール機能
        // GPS情報型有効待ち合わせスポットかんたん設定
        // アイコン遭遇マップを元にサークル機能作成可能
        // 趣味や習い事に基づいた情報交換検索機能搭載

        // エロボイスチャット融合

        // twitter spaceを使ったバー=Youtube配信:投げ銭

        // ボイスメッセージ
        // ボイスチャットアプリ(twitter,instagram,TiKtok連動)=自動掲示板追加
        // ドライブレコーダー　サウンドクラウド、ユーチューブ、GPS機能
        // コミュニティ機能
        // 2shotメール機能、サークル機能、

        // 道路案内図
        // 待ち合わせ場所
        // ホテル
        // マッチングアプリ

        // バナーリンク
        // ガールズバー
        // レンタルコスプレ宅配ショップ
        // エイズ検査機関バナー
        // カードゲーム
        //
        // Vapeハンバーガー　相沢みなみプロデュース
        // ギリシャ料理
        // ムサカ
        // サジキ

        // グルナビ連動

        // モンキーコック
        // アンダーソン

        // メールオペレーターモバイルアプリ　PCアプリ連動型
        // Animation制作　
        // ソファ　クッキングハブ　ドリンクバー　週刊誌　本棚　隔離レイアウト個人PC


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