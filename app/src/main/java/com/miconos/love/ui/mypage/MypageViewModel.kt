package com.miconos.love.ui.mypage

import android.widget.EditText
import android.widget.TextView
import androidx.databinding.ObservableField
import androidx.databinding.ObservableArrayList
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MypageViewModel : ViewModel() {
    val data: MutableLiveData<MutableList<Person>> by lazy {
        MutableLiveData<MutableList<Person>>()
    }

    val name:MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    val mail:MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    val age:MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    val allText:MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    fun allByText(): String {
        var res = String()
        for (item in data.value!!) {
            res += item.to_s()
            res += "\n"
        }
        return res
    }
    fun getById(id:Int):Person = data.value!!.get(id)
    fun add(nm:String, ml:String, ag:Int) {
        data.value?.add(Person(nm, ml, ag))
    }

    init {
        data.value = mutableListOf(
            Person("Taro", "taro@yamada", 36),
            Person("Hanako", "hanako@flower", 25), Person("Sachiko", "sachiko@happy", 14)

        )
        allText.value = allByText()
        name.value = "name"
        mail.value = "mail@address"
        age.value = "0"
    }
}

class Person(name:String, mail:String, age:Int) {
    var name:String = name
    var mail:String = mail
    var age:Int = age
    fun age_s():String = age.toString()
    fun to_s(): Any? = "$name ($mail, $age)"
}

class LayoutObject {
    fun doIt(edit : EditText , vw : TextView) {
        val num = edit.text.toString().toInt()
        var total = 0
        for (n in 1..num) {
            total += n
        }
        vw.text = "Total: $total."
    }
}


//    var data:MutableList<Person> = mutableListOf(
//        Person("Taro", "taro@yamada", 36),
//        Person("Hanako", "hanako@flower", 25),
//        Person("Sachiko", "sachiko@happy", 14)
//    )

    // present!!

//    val data = ObservableArrayList<Person>().apply {
//        add(Person("Taro", "taro@yamada", 36))
//        add(Person("Hanako", "hanako@flower", 25))
//        add(Person("Sachiko", "sachiko@happy", 14))
//    }
//    val person = ObservableField<Person>()
//    var allText = ObservableField<String>()
//    fun allbyText():String {
//        var res = String()
//        for(item in data) {
//            res += item.to_s()
//            res += "\n"
//        }
//        return res
//    }
//    fun getById(id:Int):Person = data[id]
//    fun add(nm:String, ml:String, ag:Int) {
//        this.add(Person(nm, ml, ag))
//    }
//    fun add(person:Person) {
//        data.add(person)
//    }
//    init {
//        allText.set((allbyText()))
//        person.set(Person("", "", 0))
//    }
//}

// present!!


//    val data = ObservableArrayList<Person>().apply {
//        add(Person
//                (
//            "ニックネーム",
//        "男性",
//        "東京都練馬区",
//        36,
//        "自己紹介です"
//        ))
//    }
//
//    val person = ObservableField<Person>()
//    var allText = ObservableField<String>()
//
//    fun allByText(): String {
//        var res = ""
//        for (item in data) {
//            res += item.to_s()
//            res += "\n"
//        }
//        return res
//    }
//
//    fun getById(id: Int): Person = data[id]
//
//    fun add(name: String, gender: String, address: String, age: Int, introTxt: String) {
//        data.add(Person(name, gender, address, age, introTxt))
//    }
//
//    fun add(person: Person) {
//        data.add(person)
//    }
//
//    init {
//        allText.set((allByText()))
//         person.set(Person("","","",0,""))
//    }

//    fun getAll(): List<Person> = data
//
////    fun getById(id: Int): Person = data[id]
////
////    fun add(name: String, gender: String, address: String, age: Int, introTxt: String) {
////        data.add(Person(name, gender, address, age, introTxt))
////    }
////}
////
//
//
//class Person(name:String, mail:String, age:Int) {
//
//    var name:String = name
//    var mail:String = mail
//    var age:Int = age
//    fun age_s():String = age.toString()
//    fun to_s(): Any? = "$name ($mail, $age)"
//
//}

// Present
//class Person(name:String, mail:String, age:Int) {
//    var name = ObservableField<String>()
//    var mail = ObservableField<String>()
//    var age = ObservableField<String>()
//    init {
//        this.name.set(name)
//        this.mail.set(mail)
//        this.age.set(age.toString())
//    }
//    fun to_s(): String = "${name.get()} (${mail.get()}, ${age.get()})"
//}

// Present
//   class Person(name:String,gender:String,address:String,age:Int,introTxt:String) {
//        var name = ObservableField<String>()
//        var gender = ObservableField<String>()
//        var address = ObservableField<String>()
//        var age = ObservableField<String>()
//        var introTxt = ObservableField<String>()
//    init {
//        this.name.set(name)
//        this.gender.set(gender)
//        this.address.set(address)
//        this.age.set(age.toString())
//        this.introTxt.set(introTxt)
//    }
//
//        fun age_s(): String = age.toString()
//        fun to_s(): Any? = "$name($gender,$address,$age,$introTxt)"
//    }

