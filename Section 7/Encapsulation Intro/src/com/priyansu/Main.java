package com.priyansu;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//    //System.out.println("Hello World");
//        Player player = new Player();
//        player.name = "Thanos";
////        player.health = 50000;
//        player.weapon = "Infinity Gauntlet";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 9;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Thanos", 50000, "Infinity Gauntlet");
        System.out.println("Initial health is " + player.getHealth());
    }
}
