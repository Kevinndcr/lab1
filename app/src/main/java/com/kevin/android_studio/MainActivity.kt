package com.kevin.android_studio

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var imageViewTop: ImageView

    // Método para asignar clic a cada imagen     --->>>>>>  primer parametro es el ID, el segundo es el nombre o src de la img
    private fun setImageClickListener(imageViewId: Int, imageResId: Int) {
        val imageView = findViewById<ImageView>(imageViewId)
        imageView.setOnClickListener {
            // Cambiar la imagen en la parte superior
            imageViewTop.setImageResource(imageResId)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main) //basicamente solo llama un layout ya creado

        // Inicializar la imagen superior
        imageViewTop = findViewById(R.id.imageViewTop)

        // Asignar clic a cada imagen de la tabla
        setImageClickListener(R.id.imageView1, R.drawable.facebook)
        setImageClickListener(R.id.imageView2, R.drawable.github)
        setImageClickListener(R.id.imageView3, R.drawable.twitter)
        setImageClickListener(R.id.imageView4, R.drawable.youtube)
        setImageClickListener(R.id.imageView5, R.drawable.whatsapp)
        setImageClickListener(R.id.imageView6, R.drawable.instagram)
    }


}
