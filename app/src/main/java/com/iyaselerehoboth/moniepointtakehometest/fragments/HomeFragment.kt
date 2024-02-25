package com.iyaselerehoboth.moniepointtakehometest.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.iyaselerehoboth.moniepointtakehometest.R
import com.iyaselerehoboth.moniepointtakehometest.Utils
import com.iyaselerehoboth.moniepointtakehometest.VehiclesAdapter
import com.iyaselerehoboth.moniepointtakehometest.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container,  false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = VehiclesAdapter()
        binding.rcvAvailableVehicles.adapter = adapter
        binding.rcvAvailableVehicles.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        adapter.submitList(Utils().getAvailableVehicles())
    }
}