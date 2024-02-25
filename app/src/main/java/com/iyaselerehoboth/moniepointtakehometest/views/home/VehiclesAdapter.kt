package com.iyaselerehoboth.moniepointtakehometest.views.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.iyaselerehoboth.moniepointtakehometest.R
import com.iyaselerehoboth.moniepointtakehometest.data.models.Vehicle
import com.iyaselerehoboth.moniepointtakehometest.databinding.ItemViewAvailableVehiclesBinding

class VehiclesAdapter: ListAdapter<Vehicle, VehiclesAdapter.VehicleViewHolder>(VehicleDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VehicleViewHolder {
        return VehicleViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_view_available_vehicles,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: VehicleViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
    class VehicleViewHolder(
        private val binding: ItemViewAvailableVehiclesBinding
    ): RecyclerView.ViewHolder(binding.root){

        fun bind(vehicle: Vehicle){
            binding.apply {
                mtvHeading.text = vehicle.name
                mtvSubHeading.text = vehicle.type
            }

            binding.executePendingBindings()
        }

    }

    private class VehicleDiffCallback : DiffUtil.ItemCallback<Vehicle>(){
        override fun areItemsTheSame(oldItem: Vehicle, newItem: Vehicle): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Vehicle, newItem: Vehicle): Boolean {
            return oldItem == newItem
        }

    }

}