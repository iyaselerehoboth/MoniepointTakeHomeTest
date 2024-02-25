package com.iyaselerehoboth.moniepointtakehometest.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.iyaselerehoboth.moniepointtakehometest.Utils
import com.iyaselerehoboth.moniepointtakehometest.data.dao.ShipmentDao
import com.iyaselerehoboth.moniepointtakehometest.data.models.Shipment

@Database(
    entities = [Shipment::class],
    version = 1,
    exportSchema = false
)
abstract class MoniepointDatabase: RoomDatabase() {

    abstract fun shipmentDao(): ShipmentDao

    companion object{
        private var instance: MoniepointDatabase? = null

        fun getInstance(context: Context): MoniepointDatabase{
            return instance ?: synchronized(this){
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(mCtx: Context): MoniepointDatabase{
            return Room.databaseBuilder(mCtx, MoniepointDatabase::class.java, "moniepoint.db")
                .addCallback(
                    object : Callback(){
                        override fun onOpen(db: SupportSQLiteDatabase) {
                            super.onOpen(db)
                        }

                        override fun onCreate(db: SupportSQLiteDatabase) {
                            super.onCreate(db)
                        }
                    }
                ).build()
        }
    }
}