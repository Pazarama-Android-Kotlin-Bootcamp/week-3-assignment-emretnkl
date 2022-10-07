package com.emretnkl.bootcamprvassignment.countrylist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.emretnkl.bootcamprvassignment.R
import com.emretnkl.bootcamprvassignment.data.CountryModel

class CountriesAdapter(
    private val countryList: MutableList<CountryModel>,
    private val listener: CountriesListener
) :
    RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder>() {
    interface CountriesListener {
        fun onClicked(country: CountryModel)

    }

    class CountriesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tvName = view.findViewById<TextView>(R.id.tvCountryName)
        private val tvCapital = view.findViewById<TextView>(R.id.tvCapitalName)
        private val tvPopulation = view.findViewById<TextView>(R.id.tvPopulation)
        private val ivCardItem = view.findViewById<ImageView>(R.id.ivCardItem)

        fun bind(country: CountryModel, listener: CountriesListener) {
            tvName.text = country.countryName
            tvCapital.text = country.capitalCity
            tvPopulation.text = country.population

            val imageUrl = country.imgUrl
            Glide.with(itemView)
                .load(imageUrl)
                .into(ivCardItem)



            itemView.setOnClickListener {
                listener.onClicked(country)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountriesViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_country_list, parent, false)
        return CountriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountriesViewHolder, position: Int) {
        holder.bind(countryList[position],listener)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }
}