package com.example.libratetheuser

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.libratetheuser.bottomsheet.RateUserBottomSheet
import com.example.libratetheuser.databinding.DashboardFragmentBinding
import com.example.libratetheuser.databinding.FragmentButtonBinding

class ButtonFragment : Fragment() {

    private lateinit var binding: FragmentButtonBinding
    var navController: NavController? = null
    private var rateuserBottomSheet: RateUserBottomSheet? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentButtonBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        initUI()
    }

    private fun initUI() {
        binding.userrating.setOnClickListener {
            rateuserBottomSheet = RateUserBottomSheet()
            rateuserBottomSheet!!.show(requireActivity().supportFragmentManager, "RateCustomer")

        }
    }
}