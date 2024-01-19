package com.example.testlocation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testlocation.databinding.FragmentHomeBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class HomeFragment : Fragment() {
    private lateinit var binding:FragmentHomeBinding
   private lateinit var bottomSheetDialog: BottomSheetDialog
    private lateinit var bottomSheetFragment: BottomSheetFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     binding= FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bottomSheetFragment = BottomSheetFragment()
        binding.tvGovernment.setOnClickListener{
           showbottomsheet()
        }
    }
    private fun showbottomsheet(){
        val dialogview =layoutInflater.inflate(R.layout.fragment_bottom_sheet,null)
        bottomSheetDialog =BottomSheetDialog(requireContext())
        bottomSheetDialog.setContentView(dialogview)
       bottomSheetDialog.show()
    }

}