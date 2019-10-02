package com.young.contextappvscontextclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var tvAppContexto : TextView
    lateinit var tvActivityContexto : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvAppContexto = TextView(applicationContext)
        tvAppContexto.text = "Contexto de la APP"
        tvAppContexto.textSize = 30F

        tvActivityContexto = TextView(this)
        tvActivityContexto.text = "Contexto de la Clase o Actividad"
        tvActivityContexto.textSize = 20F

        linearlayout.addView(tvAppContexto)
        linearlayout.addView(tvActivityContexto)

    }
}
