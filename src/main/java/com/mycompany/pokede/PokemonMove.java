/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pokebuilder;

/**
 *
 * @author DAM2_Alu10
 */
public class PokemonMove {
    private Move move;

    public PokemonMove(Move move) {
        this.move = move;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return "PokemonMove{" + "move=" + move + '}';
    }
    
}
