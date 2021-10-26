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
public class PokemonAbility {

    private boolean is_hiden;
    private Ability ability;

    public PokemonAbility(boolean is_hiden, Ability ability) {
        this.is_hiden = is_hiden;
        this.ability = ability;
    }

    public boolean isIs_hiden() {
        return is_hiden;
    }

    public void setIs_hiden(boolean is_hiden) {
        this.is_hiden = is_hiden;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "PokemonAbility{" + "is_hiden=" + is_hiden + ", ability=" + ability + '}';
    }

}
