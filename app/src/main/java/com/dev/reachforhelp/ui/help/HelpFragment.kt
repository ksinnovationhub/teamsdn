package com.dev.reachforhelp.ui.help

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.dev.reachforhelp.databinding.HelpFragmentBinding

class HelpFragment : Fragment() {

//    companion object {
//        fun newInstance() = HelpFragment()
//    }

    private var _binding: HelpFragmentBinding? = null
    private lateinit var viewModelHelp: HelpViewModel

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        (activity as AppCompatActivity?)!!.supportActionBar?.hide()
        viewModelHelp =
            ViewModelProvider(this).get(HelpViewModel::class.java)

       _binding = HelpFragmentBinding.inflate(layoutInflater)

        return binding.root
    }



//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(HelpViewModel::class.java)
//        // TODO: Use the ViewModel
//    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}