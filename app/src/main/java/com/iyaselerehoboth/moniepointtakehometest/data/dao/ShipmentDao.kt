package com.iyaselerehoboth.moniepointtakehometest.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.iyaselerehoboth.moniepointtakehometest.data.models.Shipment
import kotlinx.coroutines.flow.Flow

@Dao
interface ShipmentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(shipments: List<Shipment>)

    @Insert()
    fun insert(shipment: Shipment)

    @Query("SELECT * FROM shipment_table")
    fun getAllShipments(): LiveData<List<Shipment>>

    @Query("SELECT * FROM shipment_table WHERE status = :status")
    fun getShipmentsByStatus(status: String): LiveData<List<Shipment>>
}