package ua.amv0107.telegram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ua.amv0107.telegram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}