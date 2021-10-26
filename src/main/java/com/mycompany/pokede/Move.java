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
public class Move {
    private int id;
    private String name;
    private Type type;

    public Move(int id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Move{" + "id=" + id + ", name=" + name + ", type=" + type + '}';
    }
    
    
}
