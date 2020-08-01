package jp.techacademy.date.yuuya.calcapp3

import android.os.Bundle
import android.support.design.widget.Snackbar;
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val snackbar = Snackbar.make(rootLayout , "EditTextに何も値が入っていない時に、何か数値を入力してください", Snackbar.LENGTH_LONG)
        snackbar.show()

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        var edittext1 = editText1.text.toString()
        var edittext2 = editText2.text.toString()
        edittext1.toDouble()

        fun edittext1.toDouble()

        if (v.id == R.id.button1) {
            intent.putExtra("VALUE1",edittext1+edittext2)
        } else if (v.id == R.id.button2) {
            intent.putExtra("VALUE2",edittext1-edittext2)
        } else if (v.id == R.id.button3) {
            intent.putExtra("VALUE3",edittext1*edittext2)
        } else if (v.id == R.id.button4) {
            intent.putExtra("VALUE3",edittext1/edittext2)
        }
        startActivity(intent)
    }
}
