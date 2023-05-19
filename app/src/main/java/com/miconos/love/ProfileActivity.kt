package com.miconos.love

import android.content.ContentValues
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_profile.*
import java.text.SimpleDateFormat
import java.util.*

class ProfileActivity : AppCompatActivity() {

    private var _imageUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val messagebtn = findViewById<Button>(R.id.chatStart)
        messagebtn.setOnClickListener {
            val i = Intent(this,MessageActivity::class.java)
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

        val NickName : TextView = findViewById(R.id.NickName)
        // val YourAddress : TextView = findViewById(R.id.YourAddress)
        // val YourAge : TextView = findViewById(R.id.YourAge)
        // val Profile : TextView = findViewById(R.id.Profile)

        // ３）渡された値を取り出す⇒テキストに表示
        val myName = intent.getStringExtra("NickName")
        // val myAddress = intent.getStringExtra("YourAddress")
        // val myAge = intent.getStringExtra("YourAge")
        // val Profile = intent.getStringExtra("Profile")

        NickName.text = myName

        val dialog = ConfirmDialogFragment()
        dialog.show(supportFragmentManager, "dialog_basic")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        // 親クラスの同名メソッドの呼び出し。
        super.onActivityResult(requestCode, resultCode, data)
        // カメラアプリからの戻りでかつ撮影成功の場合
        if(requestCode == 200 && resultCode == RESULT_OK) {
            // 撮影された画像のビットマップデータを取得。
//			val bitmap = data?.getParcelableExtra<Bitmap>("data")
            // 画像を表示するImageViewを取得。
            val ivCamera = findViewById<ImageView>(R.id.ProfileCamera)
            // 撮影された画像をImageViewに設定。
//			ivCamera.setImageBitmap(bitmap)
            // フィールドの画像URIをImageViewに設定。
            ivCamera.setImageURI(_imageUri)
        }
    }

    fun onCameraImageClick(view: View) {
        // 日時データを「yyyyMMddHHmmss」の形式に整形するフォーマッタを生成。
        val dateFormat = SimpleDateFormat("yyyyMMddHHmmss")
        // 現在の日時を取得。
        val now = Date()
        // 取得した日時データを「yyyyMMddHHmmss」形式に整形した文字列を生成。
        val nowStr = dateFormat.format(now)
        // ストレージに格納する画像のファイル名を生成。ファイル名の一意を確保するためにタイムスタンプの値を利用。
        val fileName = "CameraIntentSamplePhoto_${nowStr}.jpg"

        // ContentValuesオブジェクトを生成。
        val values = ContentValues()
        // 画像ファイル名を設定。
        values.put(MediaStore.Images.Media.TITLE, fileName)
        // 画像ファイルの種類を設定。
        values.put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg")

        // ContentResolverを使ってURIオブジェクトを生成。
        _imageUri = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values)
        // Intentオブジェクトを生成。
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        // Extra情報として_imageUriを設定。
        intent.putExtra(MediaStore.EXTRA_OUTPUT, _imageUri)
        // アクティビティを起動。
        startActivityForResult(intent, 200)
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