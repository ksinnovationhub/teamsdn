package com.dev.reachforhelp.ui.onboarding.Screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dev.reachforhelp.R
import com.dev.reachforhelp.databinding.FragmentOnboardingThreeBinding


class OnboardingThreeFragment : Fragment() {

    private lateinit var binding: FragmentOnboardingThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnboardingThreeBinding.inflate(layoutInflater)

        binding.btnGetStarted.setOnClickListener {
            findNavController().navigate(R.id.action_onboardingThreeFragment_to_signupFragment)
        }
        return binding.root
    }


}