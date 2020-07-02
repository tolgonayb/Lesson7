package com.company;

public class Medic extends Hero {

    @Override
    public void makeMove() {
        System.out.println("Medic turn left");
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Medic применил суперспособность MEDICAL");
    }

    @Override
    public String apply (String superAbilityType){
        return superAbilityType;
    }
}
