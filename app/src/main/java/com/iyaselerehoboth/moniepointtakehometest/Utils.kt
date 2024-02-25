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
            Shipment("#875323945834NG3", 6500, "2024-02-27", "pending"),
            Shipment("#87532DHF5834NG3", 600, "2024-02-15", "cancelled"),
            Shipment("#075322345834NG3", 2400, "2024-02-24", "in-progress"),
            Shipment("#875323115834NG3", 1200, "2024-02-21", "completed"),
            Shipment("#048323945834NG3", 60500, "2024-02-30", "pending"),
            Shipment("#905323OI5834NG3", 100, "2024-03-05", "pending"),
            Shipment("#875320145834NG3", 9000, "2024-02-10", "cancelled"),
            Shipment("#875323ASH834NG3", 10000, "2024-02-25", "pending"),
            Shipment("#8753UR345834NG3", 7500, "2024-02-25", "in-progress"),
            Shipment("#875323LKD834NG3", 6900, "2024-02-20", "completed"),
            Shipment("#89ER23945834NG3", 600, "2024-02-25", "in-progress"),
            Shipment("#800923945834NG3", 800, "2024-01-15", "completed"),
            Shipment("#8753OEJF9834NG3", 40000, "2024-01-25", "completed"),
            Shipment("#8753IER93234NG3", 6700, "2024-02-01", "completed")
        )
    }
}