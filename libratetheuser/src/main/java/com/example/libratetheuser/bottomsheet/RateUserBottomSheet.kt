package com.example.libratetheuser.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import com.example.libratetheuser.R
import com.example.libratetheuser.databinding.RateUserBottomsheetBinding

class RateUserBottomSheet : BaseBottomSheetDialog(), RatingBar.OnRatingBarChangeListener {
    private lateinit var binding: RateUserBottomsheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.MyBottomSheetDialogTheme)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = RateUserBottomsheetBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding!!.ratingBar.onRatingBarChangeListener = this

        binding!!.submit.setOnClickListener {
            val name = binding!!.name.text.toString()
            val rating = binding!!.ratingBar.rating.toString()
            val review = binding!!.feedback.text.toString()
        }
    }

    override fun onRatingChanged(p0: RatingBar?, p1: Float, p2: Boolean) {
        TODO("Not yet implemented")
    }
}