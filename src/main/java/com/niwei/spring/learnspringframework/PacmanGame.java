package com.niwei.spring.learnspringframework;


public class PacmanGame implements GameConsole {
    public void up() {
        System.out.println("Pacman up");
    }
    public void down() {
        System.out.println("Pacman down");
    }
    public void left() {
        System.out.println("Pacman left");
    }
    public void right() {
        System.out.println("Pacman right");
    }
}
