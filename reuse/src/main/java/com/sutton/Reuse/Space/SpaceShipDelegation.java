package com.sutton.Reuse.Space;

/**
 * @version 1.0.1
 * @program: nirvana
 * @description: 代理
 * @author: Mr.wang.sutton
 * @create: 2022-10-18 19:32
 **/
public class SpaceShipDelegation {
    private String name;

    private SpaceShipControls controls=new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }
    void up(int velocity) {
        controls.up(100);
    }

    void down(int velocity) {
        controls.down(100);
    }


    void left(int velocity) {
        controls.down(100);
    }

    void right(int velocity) {
        controls.right(100);
    }

    void forward(int velocity) {
        controls.forward(100);
    }

    void back(int velocity) {
        controls.back(100);
    }

    void turboBoost() {
        controls.turboBoost();
    }

    public static void main(String[] args) {
        SpaceShipDelegation spaceShipDelegation=new SpaceShipDelegation("NSEA Protector");
        spaceShipDelegation.forward(100);

    }
}
