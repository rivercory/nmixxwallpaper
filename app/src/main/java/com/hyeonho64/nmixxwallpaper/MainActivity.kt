package com.hyeonho64.nmixxwallpaper

import android.app.WallpaperManager
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.IOException


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSetWallpaper = findViewById<View>(R.id.set_wallpaper_button) as Button
        val imagePreview = findViewById<View>(R.id.wallpaper_image) as ImageView
        imagePreview.setImageResource(R.mipmap.ic_launcher_round)

        buttonSetWallpaper.setOnClickListener {
            val myWallpaperManager = WallpaperManager.getInstance(applicationContext)
            try {
                myWallpaperManager.setResource(+ R.mipmap.ic_launcher_round)
            } catch (e: IOException) {
                e.printStackTrace()
                Toast.makeText(getApplicationContext(), "적용되지 않았습니다.", Toast.LENGTH_LONG).show();
            }
        }
    }
}