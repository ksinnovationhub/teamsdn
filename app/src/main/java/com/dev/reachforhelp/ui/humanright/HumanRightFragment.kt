package com.dev.reachforhelp.ui.humanright

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dev.reachforhelp.R
import com.dev.reachforhelp.databinding.HumanRightFragmentBinding
import com.dev.reachforhelp.databinding.SafetyGuideFragmentBinding
import com.dev.reachforhelp.model.SafetyGuide
import com.dev.reachforhelp.ui.safetyguide.SafetyGuideViewModel

class HumanRightFragment : Fragment() {

    companion object {
        fun newInstance() = HumanRightFragment()
    }

    private var _binding: HumanRightFragmentBinding? = null

    private val humanRight = mutableListOf<SafetyGuide>()
    private val binding get() = _binding!!
    private lateinit var viewModel: HumanRightViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel =
            ViewModelProvider(this).get(HumanRightViewModel::class.java)

        _binding = HumanRightFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root



        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HumanRightViewModel::class.java)
        // TODO: Use the ViewModel
    }

}