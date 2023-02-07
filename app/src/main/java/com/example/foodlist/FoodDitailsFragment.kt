package com.example.foodlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import coil.load
import com.example.foodlist.databinding.FragmentFoodDitailsBinding
import java.io.File

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

    }
   override  fun onDestroyView(){
       _binding=null
       super.onDestroyView()
   }

}
