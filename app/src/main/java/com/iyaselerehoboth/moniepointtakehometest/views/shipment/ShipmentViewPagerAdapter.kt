package com.iyaselerehoboth.moniepointtakehometest.views.shipment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.iyaselerehoboth.moniepointtakehometest.views.shipment.tabs.AllShipmentsFragment
import com.iyaselerehoboth.moniepointtakehometest.views.shipment.tabs.CancelledShipmentsFragment
import com.iyaselerehoboth.moniepointtakehometest.views.shipment.tabs.CompletedShipmentsFragment
import com.iyaselerehoboth.moniepointtakehometest.views.shipment.tabs.InProgressShipmentsFragment
import com.iyaselerehoboth.moniepointtakehometest.views.shipment.tabs.PendingShipmentsFragment

class ShipmentViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle):
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            1 -> CompletedShipmentsFragment()
            2 -> InProgressShipmentsFragment()
            3 -> PendingShipmentsFragment()
            4 -> CancelledShipmentsFragment()
            else -> AllShipmentsFragment()
        }
    }
}