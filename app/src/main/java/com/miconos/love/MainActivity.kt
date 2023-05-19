package com.miconos.love

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity


class
MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.Start)
        btn.setOnClickListener {

            val dialog = ConfirmDialogFragment()
            dialog.show(supportFragmentManager, "dialog_basic")

            val NickName = findViewById<EditText>(R.id.NickName)
            val YourGender = findViewById<RadioGroup>(R.id.YourGender)

            // val male = findViewById<RadioButton>(R.id.male)
            // val female = findViewById<RadioButton>(R.id.female)
            startActivity(
                Intent(this, HomeActivity::class.java).apply {
                    putExtra("NickName", NickName.text.toString())
                }
            )
        }
    }
}


// TODO 　ホーム画面　ヘッダー新着表示 ⇨ メール新着 ？　もしくは運営からのニュース notification.activity
// TODO 　ホーム画面　新着メッセージのポップアップ、足跡のポップアップ、notification
// TODO 　admobs、firebaseもしくはGoogle Adview
// TODO 　ホーム画面　ヘッダー新着表示 ⇨メール新着？　もしくは運営からのニュース notification.activity
// TODO 　マイページの更新



// TODO 　チャット画面DAO接続

// TODO MessageActivity LISTVIEW
// TODO ログイン画面のレジスター化

// TODO HOME DIALOGFLAGMENT 生成

// TODO HOME DIALOG 保存　遷移
// TODO HOME DIALOG 保存　遷移

// TODO HOME DIALOG 情報　保存

// TODO HeadMenuFragment
//  chat,contact,favorite,favoritelist,footstemps,home,information,list,privacy,term

// TODO HeadMenuFragment Intent

// TODO BottomMenuFragment
//  app,chat,contact,favorite,favoritelist,footstemps,home,information,list,message,mypage,news,privacy,profile,search,setting,term
// TODO BottomMenuFragment Intent

// TODO LIST VIEW クリック PROFILE
// TODO ACTIONBAR 新着Popup

// TODO AD VIEW サイズ調整
// TODO LIST VIEW　イメージ　アダプター化
// TODO LIST VIEW　イメージ　チャット

// TODO チャットページ　角丸

// TODO スピナーデフォルト設定
// TODO 各種お問合せページ
// TODO 新着PopUp　アダプター化　スイッチ
// TODO ホームボタン　新着PopUp
// TODO サーチ　更新　絞り込み
// TODO サーチ　ダイアログ　検索　年齢　地域　性別
// TODO リストビュー　アドブロック差し込み
// TODO ニュースページ入れ替え
// TODO ニュースページ　クローズ
// TODO チャットページ動画表示





