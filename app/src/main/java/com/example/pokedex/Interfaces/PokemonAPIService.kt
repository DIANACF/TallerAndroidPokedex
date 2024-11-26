package com.example.pokedex.Interfaces

import com.example.pokedex.services.models.PokemonDetails
import com.example.pokedex.services.models.PokemonModels
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonAPIService {
    @GET("pokemon")
    suspend fun getPokemonList(): PokemonModels

    @GET("pokemon/{name}")
    suspend fun getPokemonDetails(@Path("name") name: PokemonDetails)
}