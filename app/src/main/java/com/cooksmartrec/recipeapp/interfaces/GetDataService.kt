package com.cooksmartrec.recipeapp.interfaces

import com.codingwithme.recipeapp.entities.Meal
import com.cooksmartrec.recipeapp.entities.Category
import com.cooksmartrec.recipeapp.entities.CategoryItems
import com.cooksmartrec.recipeapp.entities.MealResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetDataService {
    @GET("categories.php")
    fun getCategoryList(): Call<Category>

    @GET("filter.php")
    fun getMealList(@Query("c") category: String): Call<Meal>

    @GET("lookup.php")
    fun getSpecificItem(@Query("i") id: String): Call<MealResponse>


}