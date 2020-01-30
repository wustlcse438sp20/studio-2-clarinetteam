package com.example.studio2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_change.*
import kotlinx.android.synthetic.main.fragment_deposit.*

class ChangeActivity : AppCompatActivity() {
    var total:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change)

        switch_button.setOnClickListener {


            //val intent = Intent(activity, MainActivity::class.java)
            //intent.putExtra("Total", total)
            //activity!!.startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        switch_button.setOnClickListener {
            val fragment = DepositFragment()
            var bundle = Bundle()
            bundle.putInt("deposit", deposit_value.text.toString().toInt())
            fragment.arguments = bundle
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.switch_button, fragment)
            transaction.commit()
        }
    }

}
