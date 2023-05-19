package com.miconos.love.ui.setting

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.miconos.love.R
import com.miconos.love.databinding.FragmentHomeBinding
import com.miconos.love.databinding.FragmentSettingBinding
import com.miconos.love.ui.home.HomeViewModel

class SettingFragment : Fragment() {

    /*
    companion object {
        fun newInstance() = HomeFragment()
    }
    */

    private var _binding: FragmentSettingBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: SettingViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_setting,container,false)
        _binding = FragmentSettingBinding.inflate(inflater,container,false)
        return binding.root
        /*
        return inflater.inflate(R.layout.fragment_home, container, false)
        */
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    /*
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
    }
     */

}