package codepath.com.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)

        val itemEdit = findViewById<EditText>(R.id.editItemName)
        val priceEdit = findViewById<EditText>(R.id.editPrice)
        val webEdit = findViewById<EditText>(R.id.editWebsite)

        val itemTv = findViewById<TextView>(R.id.itemTextView)
        val priceTv = findViewById<TextView>(R.id.priceTextView)
        val webTv = findViewById<TextView>(R.id.webTextView)

        var wishListRv = findViewById<RecyclerView>(R.id.wishListRv)
        var count = 0;
        //var items : MutableList<item> = ArrayList()
        wishListRv.layoutManager = LinearLayoutManager(this)
        button.setOnClickListener{
            count++
            //val item = item(itemEdit.text.toString(), webEdit.text.toString(),priceEdit.text.toString() )
            //items.add(item)
            //itemTv.text = items[count].itemName
            //priceTv.text = items[count].price
            //webTv.text = items[count].website
            val adapter = itemAdapter(itemEdit.text.toString(),webEdit.text.toString(),priceEdit.text.toString())
            //val adapter = itemAdapter(itemTv.text as String,webTv.text as String,priceTv.text as String)
            wishListRv.adapter = adapter
        }
    }
}