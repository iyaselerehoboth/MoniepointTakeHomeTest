package com.iyaselerehoboth.moniepointtakehometest.data.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shipment_table")
data class Shipment(
    @PrimaryKey val id: String,
    @ColumnInfo(name = "price") val price: Int,
    @ColumnInfo(name = "delivery_date") val deliveryDate: String,
    @ColumnInfo(name = "status") val status: String //Completed, In-Progress, Pending, Cancelled
)
