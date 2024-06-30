package com.yash.opttera2.onBoarding

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.yash.opttera2.R
import com.yash.opttera2.databinding.FragmentFreeMembershipBinding
import com.yash.opttera2.databinding.FragmentSplashBinding


class FreeMembership : Fragment() {

    private lateinit var binding : FragmentFreeMembershipBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFreeMembershipBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val txtOnBoarding = view.findViewById<TextView>(R.id.textonBoarding4)

        val text ="Get FREE plus Loyalty card-saving and collection energy usage point at over 899007 charging stations."
        val spannable = SpannableString(text)
        val start = spannable.indexOf("FREE")
        val end  = start + "FREE".length
        spannable.setSpan(
            ForegroundColorSpan(Color.BLACK),
            start,
            end,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        txtOnBoarding.text = spannable
        spannable.setSpan(
            StyleSpan(Typeface.BOLD),
            start,
            end,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        txtOnBoarding.text = spannable










    }


}