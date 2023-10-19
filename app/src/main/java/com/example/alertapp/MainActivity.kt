package com.example.alertapp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        var  view =binding.root
        setContentView(view)

        binding.button.setOnClickListener {

            var builder =AlertDialog.Builder(this)
            builder.setTitle("Alert Dialog")
            builder.setMessage("File May Be Harm Full")

            builder.setPositiveButton("Yes"){DialogInterface,which->
                Toast.makeText(this,"Clicked Yes",Toast.LENGTH_SHORT).show()
                finishAffinity()
            }

            builder.setNegativeButton("No"){DialogInterface,which->
                Toast.makeText(this,"Clicked No",Toast.LENGTH_SHORT).show()
            }

            val alertDialog:AlertDialog=builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}