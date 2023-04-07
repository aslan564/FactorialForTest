package com.example.mylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.factorial.FactorialSimple

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {

    private lateinit var simpleFactorial: FactorialSimple

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        simpleFactorial = FactorialSimple()
        val sum = simpleFactorial.factorial(10)
        Log.d(TAG, "onCreate: ")
        Toast.makeText(this, "$sum", Toast.LENGTH_SHORT).show()
    }
}