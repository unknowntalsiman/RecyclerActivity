package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter (private val numbers: Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() /* TODO Step 3a: Provide Adapter Parent */ {

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(
            TextView(
                parent.context
            ).apply {
                setPadding(10, 10, 10, 10)
            }
        )
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.text = numbers[position].toString()
        holder.textView.textSize = numbers[position].toFloat()
    }

    override fun getItemCount() = numbers.size


    // TODO Step 3b: Complete function definitions for adapter

}