package uz.data.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class HomeAdapter(val list:ArrayList<Home>) :RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_home,parent,false))
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = list[position]
        holder.tvTime.text=item.time
        holder.tvMessage.text=item.message
        holder.tvName.text=item.name
        Glide.with(holder.ivProfile).load(item.imageUrl).into(holder.ivProfile)
    }

    override fun getItemCount(): Int {
        return list.size
    }




    class HomeViewHolder(view:View):RecyclerView.ViewHolder(view){
        val ivProfile=view.findViewById<ImageView>(R.id.iv_profile)
        val tvName = view.findViewById<TextView>(R.id.tv_name)
        val tvMessage = view.findViewById<TextView>(R.id.tv_message)
        val tvTime = view.findViewById<TextView>(R.id.tv_time)
    }
}