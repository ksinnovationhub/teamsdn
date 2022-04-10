package com.dev.reachforhelp.ui.logIn

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import com.dev.reachforhelp.R
import com.dev.reachforhelp.databinding.SignInFragmentBinding

class SignInFragment : Fragment() {

    companion object {
        fun newInstance() = SignInFragment()
    }

    private lateinit var viewModel: SignInViewModel
    private var binding: SignInFragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {        binding = SignInFragmentBinding.inflate(layoutInflater)

        binding!!.loginbtn.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_navigation_home)
        }
        return binding!!.root    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SignInViewModel::class.java)
        // TODO: Use the ViewModel
    }

}