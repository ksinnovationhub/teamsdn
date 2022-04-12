package com.dev.reachforhelp.ui.safetyguide

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.dev.reachforhelp.R
import com.dev.reachforhelp.databinding.FragmentNotificationsBinding
import com.dev.reachforhelp.databinding.SafetyGuideFragmentBinding
import com.dev.reachforhelp.model.NotificationData
import com.dev.reachforhelp.model.SafetyGuide
import com.dev.reachforhelp.ui.notifications.NotificationsViewModel

class SafetyGuideFragment : Fragment() {

    companion object {
        fun newInstance() = SafetyGuideFragment()
    }

    private lateinit var viewModel: SafetyGuideViewModel
    private var _binding: SafetyGuideFragmentBinding? = null

    private val safetyGuide = mutableListOf<SafetyGuide>()
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewModel =
            ViewModelProvider(this).get(SafetyGuideViewModel::class.java)

        _binding = SafetyGuideFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root



        return binding.root
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SafetyGuideViewModel::class.java)
        // TODO: Use the ViewModel
    }

}