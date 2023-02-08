package com.example.foodlist.modal

import com.example.foodlist.R

class FoodinterfaceImpl :FoodInterface {
   private val foodList = mutableListOf(
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

   override fun getFoodList(): List<Foods> {
    return foodList
   }
}