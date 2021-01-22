package com.example.recyclerviewgallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.RecoverySystem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val photoList = ArrayList<Photo>()
        photoList.add(Photo("https://i.pinimg.com/474x/8c/a3/ec/8ca3eceea83c3b64db3f47a5ed63487b.jpg"))
        photoList.add(Photo("https://bot.to/wp-content/uploads/2020/10/swag-cat_5f83fd035d490.png"))
        photoList.add(Photo("https://i.pinimg.com/originals/d3/d9/e3/d3d9e352c32c3b1bb14394e2f9d11abb.png"))
        photoList.add(Photo("https://i.pinimg.com/474x/8c/a3/ec/8ca3eceea83c3b64db3f47a5ed63487b.jpg"))
        photoList.add(Photo("https://bot.to/wp-content/uploads/2020/10/swag-cat_5f83fd035d490.png"))
        photoList.add(Photo("https://i.pinimg.com/originals/d3/d9/e3/d3d9e352c32c3b1bb14394e2f9d11abb.png"))
        photoList.add(Photo("https://i.pinimg.com/474x/8c/a3/ec/8ca3eceea83c3b64db3f47a5ed63487b.jpg"))
        photoList.add(Photo("https://bot.to/wp-content/uploads/2020/10/swag-cat_5f83fd035d490.png"))
        photoList.add(Photo("https://i.pinimg.com/originals/d3/d9/e3/d3d9e352c32c3b1bb14394e2f9d11abb.png"))
        photoList.add(Photo("https://i.pinimg.com/474x/8c/a3/ec/8ca3eceea83c3b64db3f47a5ed63487b.jpg"))

        val adapter = adapter(photoList, this)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter


    }


}