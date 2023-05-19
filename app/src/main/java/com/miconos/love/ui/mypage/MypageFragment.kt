package com.miconos.love.ui.mypage

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.miconos.love.R
import com.miconos.love.databinding.FragmentMypageBinding

class MypageFragment : Fragment() {
    /*
    companion object {
        fun newInstance() = MypageFragment()
    }
    */
    private var _binding: FragmentMypageBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: MypageViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_mypage,container,false)
        _binding = FragmentMypageBinding.inflate(inflater,container,false)
        return binding.root
        /*
        return inflater.inflate(R.layout.fragment_home, container, false)
        */
    }
//    override fun onActivityCreated(savedInstanceState: Bundle? ) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProviders.of(this).get(MypageViewModel::class.java)
//    }
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