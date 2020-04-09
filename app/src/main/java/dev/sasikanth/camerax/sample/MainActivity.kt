package dev.sasikanth.camerax.sample

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scanQr.setOnClickListener {
            startActivity(Intent(this, ScanActivity::class.java))
        }
    }
}