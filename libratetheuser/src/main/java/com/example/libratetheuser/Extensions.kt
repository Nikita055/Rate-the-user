package com.example.libratetheuser

import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

fun CircleImageView.loadImage(imageUrl: String) {
    Glide.with(this).load(imageUrl).placeholder(R.drawable.icons8_image_file_add_1).into(this)
}
