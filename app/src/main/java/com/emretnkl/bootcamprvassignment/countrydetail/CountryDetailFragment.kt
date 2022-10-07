package com.emretnkl.bootcamprvassignment.countrydetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.emretnkl.bootcamprvassignment.R
import com.emretnkl.bootcamprvassignment.data.CountryModel

class CountryDetailFragment : Fragment() {

    // The view elements are being described.
    private lateinit var tvCountryNameDetail: TextView
    private lateinit var tvCapitalCityDetail: TextView
    private lateinit var tvPopulationDetail: TextView
    private lateinit var tvDescriptionDetail: TextView
    private lateinit var ivDetail: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //The view setter function is being called.
        setupViews(view)
    }

    // The view setter function is being created.
    private fun setupViews(view: View) {
        tvCountryNameDetail = view.findViewById(R.id.tvCountryNameDetail)
        tvCapitalCityDetail = view.findViewById(R.id.tvCapitalCityDetail)
        tvPopulationDetail = view.findViewById(R.id.tvPopulationDetail)
        tvDescriptionDetail = view.findViewById(R.id.tvDescriptionDetail)
        ivDetail = view.findViewById(R.id.ivDetail)

        arguments?.let {
            val countryData = it.getString("countryModel")

            countryData?.let { safeCountryData ->
                val country = CountryModel.fromJson(safeCountryData)

                tvCountryNameDetail.text = country.countryName
                tvCapitalCityDetail.text = country.capitalCity
                tvPopulationDetail.text = country.population
                tvDescriptionDetail.text = country.description

                Glide.with(this)
                    .load(country.imgUrl)
                    .into(ivDetail)

            }
        }
    }
}