package org.d3if0144.kalkulatorlite.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface Dao {
    @Insert
    fun insert(x: Entity)
    @Query("SELECT * FROM kalkulator ORDER BY id DESC")
    fun getData(): LiveData<List<Entity>>
    @Query("DELETE FROM kalkulator")
    fun clearData()

}