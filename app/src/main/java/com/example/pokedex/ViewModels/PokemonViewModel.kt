package com.example.pokedex.ViewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokedex.services.controllers.PokemonService
import com.example.pokedex.services.models.Pokemon
import kotlinx.coroutines.launch

class PokemonViewModel : ViewModel() {
    private val service = PokemonService()

    private val _pokemonList = mutableStateOf<List<Pokemon>>(emptyList())
    val pokemonList: State<List<Pokemon>> get() = _pokemonList

    fun fetchPokemonList(){
        viewModelScope.launch {
            try {
                val response = service.fecthPokmonList()
                _pokemonList.value = response.results
            } catch (e : Exception){
                e.printStackTrace()
            }
        }
    }
}