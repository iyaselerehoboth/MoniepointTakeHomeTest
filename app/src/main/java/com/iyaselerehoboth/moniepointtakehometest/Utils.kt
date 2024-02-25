package com.iyaselerehoboth.moniepointtakehometest

import com.iyaselerehoboth.moniepointtakehometest.data.models.Shipment
import com.iyaselerehoboth.moniepointtakehometest.data.models.Vehicle

class Utils {

    fun getAvailableVehicles(): List<Vehicle>{
        return listOf(
            Vehicle(1, "Ocean freight", "International", ""),
            Vehicle(2, "Cargo freight", "Reliable", ""),
            Vehicle(3, "Air freight", "International", ""),
            Vehicle(4, "Train freight", "Multi Service", ""),
            Vehicle(5, "Drone freight", "Instant Service", ""),
            Vehicle(6, "Instant freight", "Local", ""),
            Vehicle(7, "Road freight", "Local", ""),
        )
    }

    fun getShipments(): List<Shipment>{
        return listOf(
            Shipment("#875323945834NG3", 6500, "2024-02-25", "pending"),
            Shipment("#87532DHF5834NG3", 6500, "2024-02-25", "pending"),
            Shipment("#075322345834NG3", 6500, "2024-02-25", "pending"),
            Shipment("#875323115834NG3", 6500, "2024-02-25", "pending"),
            Shipment("#048323945834NG3", 6500, "2024-02-25", "pending"),
            Shipment("#905323OI5834NG3", 6500, "2024-02-25", "pending"),
            Shipment("#875323945834NG3", 6500, "2024-02-25", "pending"),
            Shipment("#875323945834NG3", 6500, "2024-02-25", "pending"),
            Shipment("#875323945834NG3", 6500, "2024-02-25", "pending"),
            Shipment("#875323945834NG3", 6500, "2024-02-25", "pending"),
            Shipment("#875323945834NG3", 6500, "2024-02-25", "pending"),
            Shipment("#875323945834NG3", 6500, "2024-02-25", "pending"),
            Shipment("#875323945834NG3", 6500, "2024-02-25", "pending"),
            Shipment("#875323945834NG3", 6500, "2024-02-25", "pending")
        )
    }
}