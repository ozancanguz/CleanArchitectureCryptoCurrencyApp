package com.ozancanguz.mvmmcurrenciesforusd.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.mvmmcurrenciesforusd.R
import kotlinx.android.synthetic.main.currency_row_layout.view.*
import java.util.*

class CurrencyAdapter :RecyclerView.Adapter<CurrencyAdapter.MyViewHolder>(){


    fun updateData(newData:List<Currency>){

        this.currencyList=newData.toMutableList()
        notifyDataSetChanged()
    }

    var currencyList= emptyList<Currency>()

    class MyViewHolder(view: View):RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.currency_row_layout,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentCurrency=currencyList[position]
        holder.itemView.currency_symbol.text=currentCurrency.symbol
        holder.itemView.currency_baseAsset.text=currentCurrency.displayName


    }

    override fun getItemCount(): Int {
        return currencyList.size
    }

}