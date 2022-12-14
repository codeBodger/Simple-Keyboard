package com.simplemobiletools.keyboard.activities
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.appcompat.app.AppCompatActivity
//import androidx.recyclerview.widget.RecyclerView
//import com.simplemobiletools.keyboard.R
//import com.simplemobiletools.keyboard.databinding.KeyboardLayoutListBinding
//
//
//class KeyboardLayoutManagerActivity : AppCompatActivity() {
//
//    class ListAdapter : RecyclerView.Adapter<ListAdapter.ViewHolder>() {
//
//        val mContext: Context
//
//
//        fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//            val bi: ListItemBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.list_item, parent, false)
//            return ViewHolder(bi)
//        }
//
//        class ViewHolder(itemView: KeyboardLayoutListBinding) : RecyclerView.ViewHolder(itemView.getRoot()) {
//            var bi: ListItemBinding
//
//            init {
//                bi = itemView
//            }
//        }
//    }
//
//}
