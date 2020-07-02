package com.company;

public class Magic<superAbilityType> extends Hero {
    @Override
    public void makeMove() {
        System.out.println("Magic goes straight");
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Magic применил суперспособность MAGICAL");
    }

    @Override
    public String apply (String superAbilityType){
        return superAbilityType;
    }
}

