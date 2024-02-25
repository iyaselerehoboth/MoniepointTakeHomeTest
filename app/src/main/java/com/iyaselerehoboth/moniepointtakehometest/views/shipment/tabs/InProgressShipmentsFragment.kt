package com.iyaselerehoboth.moniepointtakehometest.views.shipment.tabs

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.iyaselerehoboth.moniepointtakehometest.R
import com.iyaselerehoboth.moniepointtakehometest.data.MoniepointDatabase
import com.iyaselerehoboth.moniepointtakehometest.databinding.FragmentAllShipmentsBinding
import com.iyaselerehoboth.moniepointtakehometest.databinding.FragmentInProgressShipmentsBinding
import com.iyaselerehoboth.moniepointtakehometest.views.shipment.ShipmentAdapter


class InProgressShipmentsFragment : Fragment() {

    private lateinit var binding: FragmentInProgressShipmentsBinding
    private lateinit var db: MoniepointDatabase

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_in_progress_shipments, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        db = MoniepointDatabase.getInstance(requireContext())

        val adapter = ShipmentAdapter()

        binding.rcvShipments.adapter = adapter
        binding.rcvShipments.layoutManager = LinearLayoutManager(context)

        db.shipmentDao().getShipmentsByStatus("in-progress").observe(viewLifecycleOwner) {
            Log.d("CHECK", "onViewCreated: ${it[0].id}")
            adapter.submitList(it)
        }

    }
}