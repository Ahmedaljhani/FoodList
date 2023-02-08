
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.foodlist.*
import com.example.foodlist.databinding.FragmentFoodBinding
import com.example.foodlist.view.FoodAdapter
import com.example.foodlist.viewmodal.FoodViewModal


class Food : Fragment(R.layout.fragment_food) {
     private   var _binding:FragmentFoodBinding? =null
    private  val binding get() = _binding!!
    private  val viewModal by viewModels<FoodViewModal>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //!important
        _binding=FragmentFoodBinding.bind(view)


       //assign the adapter to the recyclerView
         val adapter = FoodAdapter(SettSave(requireContext())){
             // action to sent args from frag to frag
             val action = FoodDirections.go(it.name,it.imageUrl,it.description)
             view.findNavController().navigate(action)
         }
        //add food list to adapter
        binding.rvFood.adapter = adapter
//        adapter.submitList(foodList)
        viewModal.foodList.observe(viewLifecycleOwner){list ->
            adapter.submitList(list)
            adapter.notifyDataSetChanged()

        }

    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}