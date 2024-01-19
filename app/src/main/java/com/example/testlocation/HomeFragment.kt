package com.example.testlocation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
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
     binding= FragmentHomeBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvGovernment.setOnClickListener{
           showbottomsheet()
        }
    }
    @SuppressLint("InflateParams")
    private fun showbottomsheet(){
        val dialogview =layoutInflater.inflate(R.layout.fragment_bottom_sheet,null)
        bottomSheetDialog =BottomSheetDialog(requireContext())
        bottomSheetFragment = BottomSheetFragment()
        bottomSheetDialog.setContentView(dialogview)
       bottomSheetDialog.show()
        findNavController().navigate(R.id.action_homeFragment_to_bottom_sheetFragment)
    }

}