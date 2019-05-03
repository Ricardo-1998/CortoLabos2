package com.example.cortolabo.Activities

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.cortolabo.Fragmentos.Fragmento1
import com.example.cortolabo.Fragmentos.Fragmento2
import com.example.cortolabo.R
import kotlinx.android.synthetic.main.layout_fragmento1.*
import kotlinx.android.synthetic.main.layout_fragmento2.*

class MainActivity : AppCompatActivity(), Fragmento1.OnFragmentInteractionListener, Fragmento2.OnFragmentInteractionListener {


    var cont = 1
    var cont2 = 1
    

    override fun onFragmentInteraction(uri: Uri) {

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.frameLayout,Fragmento2.newInstance()).commit()

        btn_siguiente.setOnClickListener {
            when(cont){
                1 -> tv_color.setBackgroundResource(R.color.Azul1)
                2 -> tv_color.setBackgroundResource(R.color.Verde1)
            }
            cont++
            if(cont==3){cont=1}

        }

        btn_atras.setOnClickListener {
            when(cont2){
                1 -> tv_color.setBackgroundResource(R.color.Rojo1)
                2 -> tv_color.setBackgroundResource(R.color.Azul1)
            }
            cont2++
            if(cont2==3){cont2=1}
        }





    }



}
