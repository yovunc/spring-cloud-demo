package com.ovnc.coffeeservice.v1.beans;

public class Coffee {
    private Long id;
    private String name;
    private String strength;
    private boolean aromatic;

    public Coffee(){ }

    public Coffee(String name, String strength, boolean aromatic){
        this.name = name;
        this.strength = strength;
        this.aromatic = aromatic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public boolean isAromatic() {
        return aromatic;
    }

    public void setAromatic(boolean aromatic) {
        this.aromatic = aromatic;
    }
}
