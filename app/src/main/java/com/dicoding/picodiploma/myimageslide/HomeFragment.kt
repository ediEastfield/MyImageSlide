package com.dicoding.picodiploma.myimageslide

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.dicoding.picodiploma.myimageslide.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return  binding.root
    }

    override fun onViewCreated(
            view: View,
            savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.amazon, "Amazon"))
        imageList.add(SlideModel(R.drawable.disney, "disney"))
        imageList.add(SlideModel(R.drawable.hbo, "hbo"))
        imageList.add(SlideModel(R.drawable.iflix, "iflix"))
        imageList.add(SlideModel(R.drawable.netflix, "netflix"))
        imageList.add(SlideModel(R.drawable.viu, "viu"))

        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList, ScaleTypes.FIT)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}