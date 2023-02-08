package com.example.foodlist.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.navArgs
import coil.load
import com.example.foodlist.R
import com.example.foodlist.databinding.FragmentFoodDitailsBinding

class FoodDitailsFragment :Fragment(R.layout.fragment_food_ditails) {
    private  var  _binding :FragmentFoodDitailsBinding? = null
    private  val binding get()=_binding!!
    private val args by navArgs<FoodDitailsFragmentArgs>()

    override fun onViewCreated(view: View,savedInstanceState: Bundle?) {
        super.onViewCreated(view,savedInstanceState)
       _binding=FragmentFoodDitailsBinding.bind(view)
//      Toast.makeText(requireContext(),"${args.name} :: ${args.image}",Toast.LENGTH_LONG).show()
        //display args in Ditails fragment
        binding.tvName.text=args.name
        binding.ivImage.load(args.image)
        binding.tvdes.text=args.description

    }
   override  fun onDestroyView(){
       _binding=null
       super.onDestroyView()
   }

}
