package com.echoes.echoesofthedungeon;

public class Player {
    private String name;
    private int x;
    private int y;
    private int health;
    private int speed;

    public Player(String name, int x, int y){
        this.name = name;
        this.x = x;
        this.y = y;
        this.health = 100;
        this.speed = 10;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
}

}
