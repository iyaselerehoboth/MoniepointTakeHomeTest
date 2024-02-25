package com.iyaselerehoboth.moniepointtakehometest.views.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.iyaselerehoboth.moniepointtakehometest.R
import com.iyaselerehoboth.moniepointtakehometest.Utils
import com.iyaselerehoboth.moniepointtakehometest.data.MoniepointDatabase
import com.iyaselerehoboth.moniepointtakehometest.databinding.FragmentHomeBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeFragment : Fragment() {
    
    private lateinit var binding: FragmentHomeBinding
    private lateinit var db: MoniepointDatabase

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container,  false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        CoroutineScope(Dispatchers.IO).launch {
            db = MoniepointDatabase.getInstance(requireContext())
            db.shipmentDao().insert(Utils().getShipments())
        }

        val adapter = VehiclesAdapter()
        binding.rcvAvailableVehicles.adapter = adapter
        binding.rcvAvailableVehicles.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        adapter.submitList(Utils().getAvailableVehicles())
    }
}