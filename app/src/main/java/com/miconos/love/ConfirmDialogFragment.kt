package com.miconos.love

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.appcompat.app.AlertDialog

class ConfirmDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // アクティビティがnullでないならばダイアログオブジェクトを生成。
        val dialog =  activity?.let {
            val builder = AlertDialog.Builder(it)
            // ダイアログのタイトルを設定。
            builder.setTitle(R.string.confirm   )
            // ダイアログのメッセージを設定。
            builder.setMessage(R.string.keep)
            // Positive Buttonを設定。
            // Neutral Buttonを設定。
            builder.setNeutralButton(R.string.OK, DialogButtonClickListener())
            // ダイアログオブジェクトを生成。
            builder.create()
        }
        // 生成したダイアログオブジェクトをリターン。
        return dialog ?: throw IllegalStateException("アクティビティがnullです")
    }

    /**
     * ダイアログのアクションボタンがタップされた時の処理が記述されたメンバクラス。
     */
    private inner class DialogButtonClickListener : DialogInterface.OnClickListener {
        override fun onClick(dialog: DialogInterface, which: Int) {

        }
    }
}