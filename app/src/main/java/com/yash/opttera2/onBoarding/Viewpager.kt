package com.yash.opttera2.onBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.yash.opttera2.R
import com.yash.opttera2.databinding.FragmentViewpagerBinding


class Viewpager : Fragment() {

       private lateinit var binding : FragmentViewpagerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentViewpagerBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         val fragmentList = arrayListOf<Fragment>(
             EnergyPlan(),
             EnergyReserve(),
             EnergyWallet(),
             FreeMembership()
         )


        val adapter = viewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager2.adapter = adapter





        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            tab.view.background = resources.getDrawable(R.drawable.tab_selector, null)
        }.attach()

        binding.btnNext1.setOnClickListener {
            if (binding.viewPager2.currentItem < fragmentList.size - 1) {
                binding.viewPager2.currentItem += 1
            }
            else{
                findNavController().navigate(R.id.action_viewpager_to_logIN)

            }
        }

        binding.txtSkip.setOnClickListener {
            binding.viewPager2.currentItem = fragmentList.size - 1
        }


        binding.viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (position == fragmentList.size - 1) {
                    binding.btnNext1.text = "Get Started"
                    binding.txtSkip.visibility = View.GONE
                } else {
                    binding.btnNext1.text = "Next"
                    binding.txtSkip.visibility = View.VISIBLE
                }
            }
        })



    }




}