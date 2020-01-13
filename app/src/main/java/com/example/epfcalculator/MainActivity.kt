package com.example.epfcalculator

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*
//Author : Tsen Jing Sheng
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnDate : Button =findViewById(R.id.buttonDate)
        val txtDisplay : TextView = findViewById(R.id.txtDate)
        val c = Calendar.getInstance()
        val mYear = c[Calendar.YEAR] // current year
        val mMonth = c[Calendar.MONTH] // current month
        val mDay = c[Calendar.DAY_OF_MONTH] // current day
        val txtSaving :TextView = findViewById(R.id.txtBasicSaving)
        val txtTrsfr : TextView = findViewById(R.id.txtTransfer)
        btnDate.setOnClickListener {
            val currentDate = Calendar.getInstance()


            val datepicker = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{ view, mYear, mMonth, mDay ->
                val age = currentDate.get(Calendar.YEAR) - mYear

                txtDisplay.setText("Your age is " + age)
                if(age >= 16 && age <= 20){
                    val saving = 5000
                    val trsfr = (5000 * 0.3).toFloat()
                    txtSaving.text = "Basic Saving: RM" + saving
                    txtTrsfr.text = "Allow transfer not more than : RM" + String.format("%.2f",trsfr)
                }
                else if( age >= 21 && age <=25){
                    val saving = 14000
                    val trsfr = 14000 * 0.3.toFloat()
                    txtSaving.text = "Basic Saving: RM" + saving
                    txtTrsfr.text = "Allow transfer not more than : RM" + String.format("%.2f",trsfr)
                }
                else if(age >= 26 && age <= 30){
                    val saving = 29000
                    val trsfr = 29000 * 0.3.toFloat()
                    txtSaving.text = "Basic Saving: RM" + saving
                    txtTrsfr.text = "Allow transfer not more than : RM" + String.format("%.2f",trsfr)
                }
                else if(age >=31 && age<=35){
                    val saving = 50000
                    val trsfr = 50000 * 0.3.toFloat()
                    txtSaving.text = "Basic Saving: RM" + saving
                    txtTrsfr.text = "Allow transfer not more than : RM" + String.format("%.2f",trsfr)
                }
                else if(age >=36 && age<=40){
                    val saving = 78000
                    val trsfr = 78000 * 0.3.toFloat()
                    txtSaving.text = "Basic Saving: RM" + saving
                    txtTrsfr.text = "Allow transfer not more than : RM" + String.format("%.2f",trsfr)
                }
                else if(age >=41 && age<=45){
                    val saving = 116000
                    val trsfr = 116000 * 0.3.toFloat()
                    txtSaving.text = "Basic Saving: RM" + saving
                    txtTrsfr.text = "Allow transfer not more than : RM" + String.format("%.2f",trsfr)

                }
                else if(age >=46 && age<=50){
                    val saving = 165000
                    val trsfr = 165000 * 0.3.toFloat()
                    txtSaving.text = "Basic Saving: RM" + saving
                    txtTrsfr.text = "Allow transfer not more than : RM" + String.format("%.2f",trsfr)
                }
                else if (age >=51 && age <=55){
                    val saving = 228000
                    val trsfr = 228000 * 0.3.toFloat()
                    txtSaving.text = "Basic Saving: RM" + saving
                    txtTrsfr.text = "Allow transfer not more than : RM" + String.format("%.2f",trsfr)
                }
                else{
                    txtSaving.text = "RM0"
                    txtTrsfr.text = "RM0"
                }

            }, mYear, mMonth, mDay)

            datepicker.show()


        }
    }
}
