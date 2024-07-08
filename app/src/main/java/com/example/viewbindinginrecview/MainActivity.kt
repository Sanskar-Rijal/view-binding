package com.example.viewbindinginrecview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import com.example.viewbindinginrecview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter =Mainadapter(TaskList.tasklist)
        binding?.taskRv?.adapter=adapter
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}