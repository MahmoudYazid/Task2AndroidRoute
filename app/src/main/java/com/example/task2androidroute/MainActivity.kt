package com.example.task2androidroute

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val AndroidCourses_Btm:Button=findViewById(R.id.button2)
        AndroidCourses_Btm.setOnClickListener(::NavigateToAndroidCourse)
        val IosCourses_Btm:Button=findViewById(R.id.button3)
        IosCourses_Btm.setOnClickListener(::NavigateToIosCourse)

        val FullStackCourses_Btm:Button=findViewById(R.id.button4)
        FullStackCourses_Btm.setOnClickListener(::NavigateToFullStackCourse)


    }
    private fun NavigateToAndroidCourse(view:View) {
        val Goto = Intent(this, androidActivity::class.java)
        startActivity(Goto)
    }

    private fun NavigateToIosCourse(view:View) {
        val Goto = Intent(this, IosActivity::class.java)
        startActivity(Goto)
    }
    private fun NavigateToFullStackCourse(view:View) {
        val Goto = Intent(this, FullStackActivity::class.java)
        startActivity(Goto)
    }
}

