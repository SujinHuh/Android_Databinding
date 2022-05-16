package com.sujin.databinding_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.sujin.databinding_ex.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // 1번 방식 - findViewById
        /* val btn = findViewById<Button>(R.id.testBtnId)
         btn.setOnClickListener {
             Toast.makeText(this,"click",Toast.LENGTH_LONG).show()
         }
        */

        val test = "테스트 가자고고고고고고고고고!!!!!"
        Log.e("MainActivity", test)//오류
        Log.w("MainActivity", test)//경고
        Log.i("MainActivity", test)//정보
        Log.d("MainActivity", test)//디버그
        Log.v("MainActivity", test)//상세

        print(test)
        //2번 방식 - Databinding
        binding.testBtnId.setOnClickListener {
            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
        }
    }
}