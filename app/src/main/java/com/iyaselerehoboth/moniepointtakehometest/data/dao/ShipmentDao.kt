package com.iyaselerehoboth.moniepointtakehometest.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.iyaselerehoboth.moniepointtakehometest.data.models.Shipment

@Dao
interface ShipmentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(shipments: List<Shipment>)

    @Insert()
    fun insert(shipment: Shipment)

    @Query("SELECT * FROM shipment_table")
    fun getAllShipments()

    @Query("SELECT * FROM shipment_table WHERE status = :status")
    fun getShipmentsByStatus(status: String)
}