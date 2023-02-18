package com.dsa.lb.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'B', 'C');
    }

    public static void towerOfHanoi(int disk, char tower_from, char tower_helper, char tower_to) {
        if (disk == 1) {
            System.out.println("Disk "+disk+" Moved from "+tower_from+" to "+tower_to);
            return;
        }
        towerOfHanoi(disk - 1, tower_from, tower_to, tower_helper);
        System.out.println("Disk " + disk + " moved from " + tower_from + " to " + tower_to);
        towerOfHanoi(disk - 1, tower_helper, tower_from, tower_to);
    }
}
