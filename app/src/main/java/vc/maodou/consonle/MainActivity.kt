package vc.maodou.consonle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_text.text=("PowerFullKotlin")
        main_pic.setOnClickListener { toast("Hello Kotlin") }
    }
}
