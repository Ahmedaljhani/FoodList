
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.foodlist.FoodAdapter
import com.example.foodlist.Foods
import com.example.foodlist.R
import com.example.foodlist.SettSave
import com.example.foodlist.databinding.FragmentFoodBinding


class Food : Fragment(R.layout.fragment_food) {
     private   var _binding:FragmentFoodBinding? =null
    private  val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //!important
        _binding=FragmentFoodBinding.bind(view)

         val foodList = mutableListOf(
            Foods("Pizza 10$", R.drawable.pizza,"Cheese + olives + tomatoes"),
            Foods ("Burger 5$", R.drawable.burger,"Meat + cheese + eggs"),
            Foods("Toast 5$", R.drawable.toast,"Cheese + tomato + lettuce"),
             Foods("Pizza 10$", R.drawable.pizza,"Cheese + olives + tomatoes"),
             Foods ("Burger 5$", R.drawable.burger,"Meat + cheese + eggs"),
             Foods("Toast 5$", R.drawable.toast,"Cheese + tomato + lettuce"),
             Foods("Pizza 10$", R.drawable.pizza,"Cheese + olives + tomatoes"),
             Foods ("Burger 5$", R.drawable.burger,"Meat + cheese + eggs"),
             Foods("Toast 5$", R.drawable.toast,"Cheese + tomato + lettuce"),
            )
       //assign the adapter to the recyclerView
         val adapter = FoodAdapter(SettSave(requireContext())){
             // action to sent args from frag to frag
             val action = FoodDirections.go(it.name,it.imageUrl,it.description)
             view.findNavController().navigate(action)
         }
        //add food list to adapter
        binding.rvFood.adapter = adapter
        adapter.submitList(foodList)

    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}