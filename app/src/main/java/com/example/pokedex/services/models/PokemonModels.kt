package com.example.pokedex.services.models

data class PokemonModels( val results: List<Pokemon>)

data class Pokemon(
    val name: String,
    val url: String
)

data class PokemonDetails(
    val sprites: Sprites
)

data class Sprites(
    val front_default: String
)
