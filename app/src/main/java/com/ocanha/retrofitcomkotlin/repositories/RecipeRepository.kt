package com.ocanha.retrofitcomkotlin.repositories

import android.util.Log
import com.ocanha.retrofitcomkotlin.model.Recipe
import com.ocanha.retrofitcomkotlin.rest.RetrofitService

class RecipeRepository(private val retrofitService: RetrofitService) {

    fun saveRecipe(recipe: Recipe) {

        //Salvar receita
        Log.i("DOG", recipe.toString())

    }

    fun getAllRecipes() =
        retrofitService.getAllRecipes() // Aqui seria imprementado o if e decidir da onde pegar os dados.
}
