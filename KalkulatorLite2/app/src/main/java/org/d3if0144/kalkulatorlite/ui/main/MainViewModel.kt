package org.d3if0144.kalkulatorlite.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.d3if0144.kalkulatorlite.db.Dao
import org.d3if0144.kalkulatorlite.db.Entity


class MainViewModel(private val db: Dao): ViewModel() {


    fun tambah(data1: Float, data2: Float) {
        val bil1 = data1
        val bil2 = data2
        val hasil = bil1 + bil2
        val dataDao = Entity(
            bil1 = data1,
            bil2 = data2,
            hasil = hasil,
            aksi = "tambah"
        )

        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                db.insert(dataDao)
            }
        }
    }

    fun kurang(data1: Float, data2: Float) {
        val bil1 = data1
        val bil2 = data2
        val hasil = bil1 - bil2
        val dataDao = Entity(
            bil1 = data1,
            bil2 = data2,
            hasil = hasil,
            aksi = "kurang"
        )

        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                db.insert(dataDao)
            }
        }
    }

    fun kali(data1: Float, data2: Float) {
        val bil1 = data1
        val bil2 = data2
        val hasil = bil1 * bil2
        val dataDao = Entity(
            bil1 = data1,
            bil2 = data2,
            hasil = hasil,
            aksi = "kali"
        )

        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                db.insert(dataDao)
            }
        }

    }

    fun bagi(data1: Float, data2: Float) {
        val bil1 = data1
        val bil2 = data2
        val hasil = bil1 / bil2
        val dataDao = Entity(
            bil1 = data1,
            bil2 = data2,
            hasil = hasil,
            aksi = "bagi"
        )

        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                db.insert(dataDao)
            }
        }
    }

    fun pangkat(data1: Float, data2: Float) {
        val bil1 = data1
        val bil2 = data2
        var hasil = bil1
        for (i in 2..bil2.toInt()) {
            hasil *= bil1
        }
        val dataDao = Entity(
            bil1 = data1,
            bil2 = data2,
            hasil = hasil,
            aksi = "pangkat"
        )

        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                db.insert(dataDao)
            }
        }
    }



}