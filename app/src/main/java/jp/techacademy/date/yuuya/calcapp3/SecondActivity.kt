package jp.techacademy.date.yuuya.calcapp3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getIntExtra("VALUE1", 0)
        val value2 = intent.getIntExtra("VALUE2", 0)
        val value3 = intent.getIntExtra("VALUE3", 0)
        val value4 = intent.getIntExtra("VALUE4", 0)

        textView.text = "$value1"
        textView.text = "$value2"
        textView.text = "$value3"
        textView.text = "$value4"
    }
}
