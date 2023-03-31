package com.example.indoornavigationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import apriltag.ApriltagNative
import com.example.indoornavigationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val LOGTAG = "MainActivity"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        ApriltagNative.apriltag_native_init()
        ApriltagNative.apriltag_init("tagStandard52h13", 2, 4.0, 0.0, 1)

        setContentView(binding.root)
    }

    companion object {
        // Used to load the library on application startup.
        init {
            System.loadLibrary("opencv_java4")
            System.loadLibrary("opencv_native_lib")
            System.loadLibrary("apriltag_native_lib")
        }
    }
}