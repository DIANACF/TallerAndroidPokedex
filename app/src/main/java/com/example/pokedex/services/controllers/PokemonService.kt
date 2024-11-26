package com.example.pokedex.services.controllers

import com.example.pokedex.Interfaces.PokemonAPIService

class PokemonService : BaseService() {
    private val api = getRetrofit().create(PokemonAPIService::class.java)

    suspend fun fecthPokmonList() = api.getPokemonList()
}