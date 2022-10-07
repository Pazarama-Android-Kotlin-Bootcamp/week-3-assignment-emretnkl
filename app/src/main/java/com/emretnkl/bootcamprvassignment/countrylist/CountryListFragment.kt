package com.emretnkl.bootcamprvassignment.countrylist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.emretnkl.bootcamprvassignment.R
import com.emretnkl.bootcamprvassignment.data.CountryModel
import com.emretnkl.bootcamprvassignment.data.mockCountryData

class CountryListFragment : Fragment(), CountriesAdapter.CountriesListener {

    // RecyclerView and Navigation Controller being described.
    private lateinit var rvCountriesList: RecyclerView
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // RecyclerView and Navigation Controller are being initialized.
        navController = findNavController()
        rvCountriesList = view.findViewById(R.id.rvCountryList)

        // The adapter setter function is being called.
        setupAdapter()

    }

    // The adapter setter function is being created.
    private fun setupAdapter(){
        rvCountriesList.adapter = CountriesAdapter(mockCountryData, this@CountryListFragment)
        rvCountriesList.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
    }

    // Transition to CountryDetailFragment is being occurred.
    override fun onClicked(country: CountryModel) {
        navController.navigate(R.id.action_countryListFragment_to_countryDetailFragment, Bundle().apply {
            putString("countryModel", country.toJson())
        })
    }
}