package com.neural.androidlearning

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.neural.androidlearning.userInterface.activities.BaseActivity

class MainActivity : BaseActivity("MainActivity") {
    private var btnStart: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart = findViewById(R.id.startButton)
        btnStart?.setOnClickListener {
            println("Lets Start learning android !!")
            showList()
        }
    }

    private fun showList() {
        val intent = Intent(this, TopicsActivity::class.java)
        startActivity(intent)
    }
}