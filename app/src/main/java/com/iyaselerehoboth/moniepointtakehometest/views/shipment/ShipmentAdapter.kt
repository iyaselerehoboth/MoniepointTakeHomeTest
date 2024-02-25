package com.iyaselerehoboth.moniepointtakehometest.views.shipment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.iyaselerehoboth.moniepointtakehometest.R
import com.iyaselerehoboth.moniepointtakehometest.data.models.Shipment
import com.iyaselerehoboth.moniepointtakehometest.databinding.ItemViewShipmentsBinding

class ShipmentAdapter: ListAdapter<Shipment, ShipmentAdapter.ShipmentViewHolder>(ShipmentDiffCallback()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShipmentViewHolder {
        return ShipmentViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_view_shipments,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ShipmentViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
    class ShipmentViewHolder(
        private val binding: ItemViewShipmentsBinding
    ): RecyclerView.ViewHolder(binding.root){

        fun bind(shipment: Shipment){
            binding.apply {
                chipStatus.text = shipment.status
                mtvShipmentHeading.text = "Arriving today!"
                mtvShipmentDesc.text = "Your delivery, ${shipment.id} from Atlanta, is arriving today!"
                mtvShipmentCost.text = "$${shipment.price} USD"
                mtvShipmentDate.text = shipment.deliveryDate

            }

            binding.executePendingBindings()
        }
    }

    private class ShipmentDiffCallback: DiffUtil.ItemCallback<Shipment>(){
        override fun areItemsTheSame(oldItem: Shipment, newItem: Shipment): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Shipment, newItem: Shipment): Boolean {
            return oldItem == newItem
        }

    }
}