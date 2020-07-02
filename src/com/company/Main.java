package com.company;

public class Main {


    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();

        magic.makeMove();
        medic.makeMove();
        warrior.makeMove();

        Hero[] heroes = {magic, medic, warrior};
        for (Hero a: heroes) {
            applySuperAbilityAll(a, " ");
        }

    }

    public static void applySuperAbilityAll (HavingSuperAbility a, String superAbilityType){
        a.applySuperAbility(superAbilityType);
        System.out.println(a.apply(superAbilityType));
    }

}



