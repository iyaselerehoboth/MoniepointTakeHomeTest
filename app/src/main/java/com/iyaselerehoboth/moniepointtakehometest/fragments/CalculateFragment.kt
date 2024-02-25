package com.iyaselerehoboth.moniepointtakehometest.fragments

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.iyaselerehoboth.moniepointtakehometest.R
import com.iyaselerehoboth.moniepointtakehometest.databinding.FragmentCalculateBinding


class CalculateFragment : Fragment() {

    private lateinit var binding: FragmentCalculateBinding
    private val packaging: Array<String> = arrayOf("Box", "Carton", "Basket")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_calculate, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter: ArrayAdapter<String> =
            ArrayAdapter<String>(requireContext(), android.R.layout.simple_dropdown_item_1line, packaging)
        binding.actv.setAdapter(adapter) //setting the adapter data into the AutoCompleteTextView

        binding.btnCalc.setOnClickListener {
            calcCost()
        }
    }

    private fun isValidInputs(): Boolean{
        if(binding.editSenderLocation.text.isNullOrEmpty()){
            binding.inputSourceLocation.error = "Kindly enter a valid location"
            return false
        }

        if(binding.editReceiverLocation.text.isNullOrEmpty()){
            binding.inputDestLocation.error = "Kindly enter a valid location"
            return false
        }

        if(binding.editApproxWeight.text.isNullOrEmpty()){
            binding.inputApproxWeight.error = "Kindly enter a valid weight"
            return false
        }

        if(binding.actv.text.isNullOrEmpty()){
            binding.inputPackaging.error = "Kindly select a valid packaging type"
            return false
        }

        return true
    }

    private fun calcCost() {

        if(isValidInputs()){
            Toast.makeText(context, "Running calculations", Toast.LENGTH_SHORT).show()
        }
    }
}