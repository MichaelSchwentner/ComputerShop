package com.example.computershop.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.computershop.R
import com.example.computershop.data.model.Computer

// der Adapter braucht den Context um auf String Resourcen zuzugreifen
// und die Liste an Jokes um sie für die RecyclerView vorzubereiten
class ComputerAdapter(
    private val context: Context,
    private val dataset: List<Computer>
) : RecyclerView.Adapter<ComputerAdapter.ViewHolder>() {
    // IDEE EINES VIEWHOLDERS
    // der ViewHolder weiß welche Teile des Layouts beim Recycling angepasst werden
    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val computerImage = view.findViewById<ImageView>(R.id.computer_image)
        val computerName = view.findViewById<TextView>(R.id.computer_name_text)
        val computerPrice = view.findViewById<TextView>(R.id.computer_price_text)
        val computerDescription = view.findViewById<TextView>(R.id.computer_description_text)
        val computerSale = view.findViewById<TextView>(R.id.computer_sale_text)
        val sellButton = view.findViewById<Button>(R.id.sell_button)
    }
    // ERSTELLEN DES VIEWHOLDERS
    // hier werden neue ViewHolder erstellt
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.computer_item, parent, false)
        return ViewHolder(adapterLayout)
    }
    // BEFÜLLEN DES VIEWHOLDERS
    // hier findet der Recyclingprozess statt
    // die vom ViewHolder bereitgestellten Parameter werden verändert
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val computer = dataset[position]

        holder.computerImage.setImageResource(computer.imageResource)
        holder.computerName.text = computer.name
        holder.computerPrice.text = "${computer.price} Euro"
        holder.computerDescription.text = computer.description

        holder.sellButton.setOnClickListener {
            Toast.makeText(context,"${computer.name} Wurde in den Warenkorb gelegt.", Toast.LENGTH_SHORT)
                .show()
        }

        if (computer.isSale) {
            holder.computerSale.visibility = View.VISIBLE
        } else {
            holder.computerSale.visibility = View.INVISIBLE
        }

/*        holder.adoptButton.setOnClickListener {
            Toast.makeText(context,"${dog.name} freut sich schon", Toast.LENGTH_SHORT)
                .show()
        }*/

    }
    // damit der LayoutManager weiß wie lang die Liste ist
    override fun getItemCount(): Int {
        return dataset.size
    }
}