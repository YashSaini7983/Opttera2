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
import androidx.viewpager2.widget.ViewPager2
import com.yash.opttera2.R
import com.yash.opttera2.databinding.FragmentEnergyPlanBinding


class EnergyPlan : Fragment() {

    private lateinit var binding : FragmentEnergyPlanBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentEnergyPlanBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val  txtOnBoarding = view.findViewById<TextView>(R.id.textonBoarding1)

        val text = "Transforming the Way you Navigate,Charge,and Manage Energy"
        val spannable  = SpannableString(text)
        val start = spannable.indexOf("Navigate")
        val end  = start + "Navigate".length
        spannable.setSpan(
            ForegroundColorSpan(Color.BLUE),
            start,
            end,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
         txtOnBoarding.text = spannable




    }




}