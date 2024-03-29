package com.dev.reachforhelp.ui.onboarding.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.dev.reachforhelp.R
import com.dev.reachforhelp.databinding.FragmentViewPagerBinding
import com.dev.reachforhelp.ui.onboarding.Screens.OnboardingOneFragment
import com.dev.reachforhelp.ui.onboarding.Screens.OnboardingThreeFragment
import com.dev.reachforhelp.ui.onboarding.Screens.OnboardingTwoFragment

class ViewPagerFragment : Fragment() {

    private lateinit var binding: FragmentViewPagerBinding
    private lateinit var viewPager2: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentViewPagerBinding.inflate(layoutInflater)

        val fragList = arrayListOf<Fragment>(
            OnboardingOneFragment(),
            OnboardingTwoFragment()
        )

        val adapter = ViewPagerAdapter(
            fragList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager2.adapter = adapter

        binding.circleIndicator.setViewPager(binding.viewPager2)

        binding.viewPager2.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback() {


                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)

                    if (position == adapter.itemCount - 1) {
                        binding.imgNext.setOnClickListener {
                            findNavController().navigate(R.id.action_viewPagerFragment_to_onboardingThreeFragment)
                        }


//        binding.imgNext.setOnClickListener {
//            findNavController().navigate(R.id.action_viewPagerFragment_to_onboardingThreeFragment)
//        }

                    }
                }

            })
                    return binding.root
    }
}
