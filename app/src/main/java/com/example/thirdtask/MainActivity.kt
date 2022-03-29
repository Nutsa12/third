package com.example.thirdtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.supportActionBar?.hide()

        findViewById<Button>(R.id.create_account)
            .setOnClickListener(object: View.OnClickListener{
                override fun onClick(p0: View?) {
                    Toast.makeText(this@MainActivity, "Create not supported", Toast.LENGTH_SHORT).show()
                }
            })

        findViewById<Button>(R.id.forgot_password)
            .setOnClickListener(object : View.OnClickListener{
                override fun onClick(p0: View?) {
                    Toast.makeText(this@MainActivity, "Forgot not supported", Toast.LENGTH_SHORT).show()
                }
            })

        findViewById<Button>(R.id.get_started)
            .setOnClickListener(object : View.OnClickListener{
                override fun onClick(p0: View?) {
                    Toast.makeText(this@MainActivity, "Start not supported", Toast.LENGTH_SHORT).show()
                }
            })
    }
}