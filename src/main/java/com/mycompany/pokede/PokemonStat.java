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
public class PokemonStat {
    private Stat stat;
    private int base_stat;

    public PokemonStat(Stat stat, int base_stat) {
        this.stat = stat;
        this.base_stat = base_stat;
    }

    public Stat getStat() {
        return stat;
    }

    public void setStat(Stat stat) {
        this.stat = stat;
    }

    public int getBase_stat() {
        return base_stat;
    }

    public void setBase_stat(int base_stat) {
        this.base_stat = base_stat;
    }

    @Override
    public String toString() {
        return "PokemonStat{" + "stat=" + stat + ", base_stat=" + base_stat + '}';
    }
    
  
}
