package com.ozancanguz.mvmmcurrenciesforusd.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.mvmmcurrenciesforusd.R
import com.ozancanguz.mvmmcurrenciesforusd.model.Currency
import kotlinx.android.synthetic.main.currency_row_layout.view.*
import kotlinx.android.synthetic.main.fragment_currency_details.view.*


class CurrencyAdapter :RecyclerView.Adapter<CurrencyAdapter.MyViewHolder>(){

    var currencyList= emptyList<Currency>()

    fun updateData(newData:List<com.ozancanguz.mvmmcurrenciesforusd.model.Currency>){

        this.currencyList=newData.toMutableList()
        notifyDataSetChanged()
    }



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
        holder.itemView.currency_baseAsset.text=currentCurrency.baseAsset
        holder.itemView.currency_image.setImageResource(R.drawable.currency)


    }

    override fun getItemCount(): Int {
        return currencyList.size
    }

}