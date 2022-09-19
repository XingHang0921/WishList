package codepath.com.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class itemAdapter(val itemName:String, val website:String, val price: String): RecyclerView.Adapter<itemAdapter.ViewHolder>()
{

    var count = 0
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val nameTv : TextView
        val webTv: TextView
        val priceTv : TextView

        init
        {
            nameTv = itemView.findViewById<TextView>(R.id.itemTextView)
            webTv = itemView.findViewById<TextView>(R.id.webTextView)
            priceTv = itemView.findViewById<TextView>(R.id.priceTextView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.wishlist_item, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        holder.nameTv.text = itemName
        holder.priceTv.text = price.toString()
        holder.webTv.text = website
        count++
    }

    override fun getItemCount(): Int
    {
        return count
    }

}