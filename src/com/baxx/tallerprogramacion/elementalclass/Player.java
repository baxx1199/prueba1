
package com.baxx.tallerprogramacion.elementalclass;


public class Player {
    public String username;
    public String character;
    public int pointHealth;

    public Player(String username, String character, int pointHealth) {
        this.username = username;
        this.character = character;
        this.pointHealth = pointHealth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public int getPointHealth() {
        return pointHealth;
    }

    public void setPointHealth(int pointHealth) {
        this.pointHealth = pointHealth;
    }

    
    
}
