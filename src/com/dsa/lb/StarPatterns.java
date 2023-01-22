package com.dsa.lb;

public class StarPatterns {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int n = 9;
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                printStar(i);
            }
            if (i > n / 2) {
                printStar(n - i);
            }

        }
        System.out.println("======");
        for (int i = 0; i < n; i++) {
            printSpace(n - i);
            printStar(i);
        }
        System.out.println();
        for (int i = n; i > 0; i--) {
            printSpace(n - i);
            printStar(i);
        }
        System.out.println("======");
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                printSpace(n - i);
                printStar(i);
            } else {
                printSpace(n - i);
                printStar(i);
            }
        }
        System.out.println("========");
        ptr8(n);
        System.out.println("========");
        ptr9(5);

    }

    public static void ptr8(int n) {
        int nst = 1;
        int nsp = n / 2;
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                printStar(nst);
                nst++;
            } else {
                printStar(nst);
                nst--;
            }
        }
    }

    public static void ptr9(int n) {
        int row = (2*n)-1;
        int nst = 1;
        int nsp = n-1;

        for (int r = 1; r <= row; r++) {
            printSpace(nsp);
            printStar(nst);
            if (r <n ) {
                nst++;
                nsp--;
            } else {
                nst--;
                nsp++;
            }
            System.out.println();
        }
    }

    public static void printStar(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void printSpace(int n) {
        for (int j = 0; j < n; j++) {
            System.out.print("  ");
        }
    }
}
