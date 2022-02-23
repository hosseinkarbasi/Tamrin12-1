package com.example.netflix

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.signature.ObjectKey

@BindingAdapter("imgUrl")
fun show(iv: ImageView, url: String) {
    Glide
        .with(iv.context)
        .load(url)
        .signature(ObjectKey(System.currentTimeMillis().toString()))
        .into(iv)
}

//@BindingAdapter(value = ["url", "defaultImage", "placeholder", "circleCrop"], requireAll = false)
//fun ImageView.setImageUrl(
//    url: String,
//    default: Drawable? = null,
//    placeholder: Drawable? = null,
//    circleCrop: Boolean = false
//) {
//    // code
//}
