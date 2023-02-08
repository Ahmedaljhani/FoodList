package com.example.foodlist.viewmodal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.foodlist.modal.Foods
import com.example.foodlist.modal.FoodInterface
import com.example.foodlist.modal.FoodinterfaceImpl

class FoodViewModal:ViewModel() {
    private var _foodList :MutableLiveData<List<Foods>> = MutableLiveData(emptyList())
    val foodList : LiveData<List<Foods>> get() = _foodList
    private  val foodinterface:FoodInterface =FoodinterfaceImpl()
    init {
        getListOfFood()
    }
    fun getListOfFood(){
        _foodList.value=foodinterface.getFoodList()
    }
}