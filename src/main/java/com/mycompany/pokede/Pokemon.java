/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pokebuilder;

import java.util.ArrayList;

/**
 *
 * @author DAM2_Alu10
 */
public class Pokemon {
    private int id;
    private String name;
    private ArrayList<PokemonAbility> abilities;
    private PokemonSprites sprites;
    private ArrayList<PokemonStat> stats;
    private ArrayList<PokemonType> types;
    private ArrayList<PokemonMove> moves;

    public Pokemon(int id, String name, ArrayList<PokemonAbility> abilities, PokemonSprites sprites, ArrayList<PokemonStat> stats, ArrayList<PokemonType> types, ArrayList<PokemonMove> moves) {
        this.id = id;
        this.name = name;
        this.abilities = abilities;
        this.sprites = sprites;
        this.stats = stats;
        this.types = types;
        this.moves = moves;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<PokemonAbility> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<PokemonAbility> abilities) {
        this.abilities = abilities;
    }

    public PokemonSprites getSprites() {
        return sprites;
    }

    public void setSprites(PokemonSprites sprites) {
        this.sprites = sprites;
    }

    public ArrayList<PokemonStat> getStats() {
        return stats;
    }

    public void setStats(ArrayList<PokemonStat> stats) {
        this.stats = stats;
    }

    public ArrayList<PokemonType> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<PokemonType> types) {
        this.types = types;
    }

    public ArrayList<PokemonMove> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<PokemonMove> moves) {
        this.moves = moves;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", name=" + name + ", abilities=" + abilities + ", sprites=" + sprites + ", stats=" + stats + ", types=" + types + ", moves=" + moves + '}';
    }
    
    
}
