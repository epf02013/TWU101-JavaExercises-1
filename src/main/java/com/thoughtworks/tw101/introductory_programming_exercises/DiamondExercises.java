package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(3);
        drawADiamondWithYourName(3);
    }

    //    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int totalRows) {
        int leftPadding = totalRows - 1;
        int totalAsterisks = 1;
        for (int i = 1; i <= totalRows; i++) {
            printString(" ",leftPadding);
            printString("*",totalAsterisks);
            leftPadding--;
            System.out.println();
            totalAsterisks = totalAsterisks + 2;
        }
    }

    private static void printString(String string,int numberOfTimes) {
        for (int j = numberOfTimes; j > 0; j--)
            System.out.print(string);
    }

    //    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        int totalRows = n + (n - 1);
        int totalAsterisks = 1;
        int leftPadding = n - 1;

        drawADiamondTop(n, totalAsterisks, leftPadding);

        leftPadding=0;
        totalAsterisks = 2 * (n-1) + 1;

        drawADiamondLine(totalAsterisks, leftPadding);

        leftPadding++;
        totalAsterisks = totalAsterisks - 2;

        drawADiamondBottom(n, totalRows, totalAsterisks, leftPadding);

    }

    private static void drawADiamondBottom(int n, int totalRows, int totalAsterisks, int leftPadding) {
        for (int i = n+1; i <=totalRows; i++) {
            drawADiamondLine(totalAsterisks, leftPadding);
            leftPadding++;
            totalAsterisks = totalAsterisks - 2;
        }
    }

    private static void drawADiamondTop(int n, int totalAsterisks, int leftPadding) {
        for (int i = 1; i < n; i++) {
            drawADiamondLine(totalAsterisks, leftPadding);
            leftPadding--;
            totalAsterisks = totalAsterisks + 2;
        }
    }

    private static void drawADiamondLine(int totalAsterisks, int leftPadding) {
        printString(" ",leftPadding);
        printString("*",totalAsterisks);
        System.out.println();
    }

    //    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        int totalRows = n + (n - 1);
        int totalAsterisks = 1;
        int leftPadding = n - 1;

        drawADiamondTop(n,totalAsterisks,leftPadding);

        leftPadding=0;
        totalAsterisks = 2 * (n-1) + 1;

        System.out.print("Jackie");
        System.out.println();

        leftPadding++;
        totalAsterisks = totalAsterisks - 2;

        drawADiamondBottom(n,totalRows,totalAsterisks,leftPadding);
    }
}
