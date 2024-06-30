package com.yash.opttera2.onBoarding

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.yash.opttera2.R
import com.yash.opttera2.databinding.FragmentEnergyWalletBinding


class EnergyWallet : Fragment() {

    private lateinit var binding : FragmentEnergyWalletBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentEnergyWalletBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val  txtOnBoarding = view.findViewById<TextView>(R.id.textonBoarding3)

        val text = "Transforming the Way you Navigate,Charge,and Manage Energy"
        val spannable  = SpannableString(text)
        val start = spannable.indexOf("Navigate,Charge,and Manage Energy")
        val end  = start + "Navigate,Charge,and Manage Energy".length
        spannable.setSpan(
            ForegroundColorSpan(Color.BLUE),
            start,
            end,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        txtOnBoarding.text = spannable



    }


}