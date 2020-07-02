package com.company;

public class Warrior extends Hero {
    @Override
    public void makeMove() {
        System.out.println("Warrior turn right");
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Warrior применил суперспособность PHYSICAL");
    }

    @Override
    public String apply (String superAbilityType){
        return superAbilityType;
    }

}
