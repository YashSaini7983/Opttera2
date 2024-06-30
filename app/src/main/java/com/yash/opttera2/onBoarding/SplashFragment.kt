package com.yash.opttera2.onBoarding

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.yash.opttera2.R
import com.yash.opttera2.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {

    private lateinit var  binding : FragmentSplashBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSplashBinding.inflate(inflater,container,false)

        Handler().postDelayed(
            {
                findNavController().navigate(R.id.action_splashFragment_to_viewpager)
            }, 3000)



        return binding.root



    }




}