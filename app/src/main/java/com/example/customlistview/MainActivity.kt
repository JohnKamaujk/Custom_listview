package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.listview)
        var list= mutableListOf<Model>()

            //adding images

        list.add(Model("Lamborghini","Its an Italian sports car with a maximum speed of ",R.drawable.lamborghini))
        list.add(Model("Mercedes","Its a German luxurious car that offers both quality & ",R.drawable.mercedes))
        list.add(Model("Peugeot","Its a French sports car that ",R.drawable.peugeot))
        list.add(Model("Range Rover","Its an English rover that is made for all weather roads",R.drawable.rangerover))
        list.add(Model("Tesla","Its an American electric car designed ",R.drawable.tesla))
        list.add(Model("Maserati","Its a Super car made in Italy",R.drawable.maserati))
        list.add(Model("Mustang","Its an American 1966 Ford Mustang",R.drawable.mustang))

        listview.adapter=Myadapter(this,R.layout.row,list)
        listview.setOnItemClickListener { adapterView, view, i, l ->
            if (i==0){
                Toast.makeText(this@MainActivity,"You have selected Lamborghini Gallardo",Toast.LENGTH_LONG).show()
            }
            if (i==1){
                Toast.makeText(this@MainActivity,"You have selected Mercedes S class",Toast.LENGTH_LONG).show()
             }
            if (i==2){
                Toast.makeText(this@MainActivity,"You have selected Peugeot 560",Toast.LENGTH_LONG).show()
            }
            if (i==3){
                Toast.makeText(this@MainActivity,"You have selected Range Rover Vogue",Toast.LENGTH_LONG).show()
            }
            if (i==4){
                Toast.makeText(this@MainActivity,"You have selected Tesla Electric car",Toast.LENGTH_LONG).show()
            }
            if (i==5){
                Toast.makeText(this@MainActivity,"You have selected Maserati Levante",Toast.LENGTH_LONG).show()
            }
            if (i==6){
                Toast.makeText(this@MainActivity,"You have selected Ford Mustang",Toast.LENGTH_LONG).show()
            }
        }
    }
}