package com.priyansu;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if (this.health <= 0){
            System.out.println("Player Knocked out");
            //Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
