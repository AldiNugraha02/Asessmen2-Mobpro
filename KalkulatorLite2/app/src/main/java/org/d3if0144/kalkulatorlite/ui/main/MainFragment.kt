package org.d3if0144.kalkulatorlite.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import org.d3if0144.kalkulatorlite.databinding.FragmentMainBinding
import org.d3if0144.kalkulatorlite.db.Db

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private val viewModel: MainViewModel by lazy {
        val db = Db.getInstance(requireContext())
        val factory = MainViewModelFactory(db.dao)
        ViewModelProvider(this, factory)[MainViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMainBinding.inflate(layoutInflater,
            container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentMainBinding.inflate(layoutInflater)

        binding.tambah.setOnClickListener {
            tambah()
        }

        binding.kurang.setOnClickListener {
            kurang()
        }

        binding.kali.setOnClickListener {
            kali()
        }

        binding.bagi.setOnClickListener {
            bagi()
        }

        binding.pangkat.setOnClickListener {
            pangkat()
        }
    }

    fun tambah()
    {
        val data1 = binding.bi1EditText.text.toString()
        val data2 = binding.bil2EditText.text.toString()
        viewModel.tambah(
            data1.toFloat(),
            data2.toFloat()
        )
    }

    fun kurang()
    {
        val data1 = binding.bi1EditText.text.toString()
        val data2 = binding.bil2EditText.text.toString()
        viewModel.kurang(
            data1.toFloat(),
            data2.toFloat()
        )
    }

    fun kali()
    {
        val data1 = binding.bi1EditText.text.toString()
        val data2 = binding.bil2EditText.text.toString()
        viewModel.kali(
            data1.toFloat(),
            data2.toFloat()
        )
    }

    fun bagi()
    {
        val data1 = binding.bi1EditText.text.toString()
        val data2 = binding.bil2EditText.text.toString()
        viewModel.bagi(
            data1.toFloat(),
            data2.toFloat()
        )
    }

    fun pangkat()
    {
        val data1 = binding.bi1EditText.text.toString()
        val data2 = binding.bil2EditText.text.toString()
        viewModel.pangkat(
            data1.toFloat(),
            data2.toFloat()
        )
    }

}
