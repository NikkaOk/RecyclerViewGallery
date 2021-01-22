package com.example.recyclerviewgallery

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class adapter(private var Photos: List<Photo>, private val context:Context):RecyclerView.Adapter<adapter.photoViewHolder>() {


    class photoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): photoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return photoViewHolder(view)
    }

    override fun getItemCount(): Int = Photos.size

    override fun onBindViewHolder(holder: photoViewHolder, position: Int) {

        val p = Photos[position]

        Glide.with(context)
            .load(p.url)
            .into(holder.imageView)
    }
}