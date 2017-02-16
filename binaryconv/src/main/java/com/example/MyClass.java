package com.example;

public class MyClass {

    public static void main(String args[]) {

        int numArray[] = {0, 1, 1, 1, 0};

        int totalBinNumber = 0;

        for (int i = 0; i < numArray.length; i++) {
            if (i == 0) {
                if (numArray[i] == 0) {
                    totalBinNumber = totalBinNumber + 0;
                } else if (numArray[i] == 1) {
                    totalBinNumber = totalBinNumber + 16;
                }
            } else if (i == 1) {
                if (numArray[i] == 0) {
                    totalBinNumber = totalBinNumber + 0;
                } else if (numArray[i] == 1) {
                    totalBinNumber = totalBinNumber + 8;
                }

            } else if (i == 2) {
                if (numArray[i] == 0) {
                    totalBinNumber = totalBinNumber + 0;
                } else if (numArray[i] == 1) {
                    totalBinNumber = totalBinNumber + 4;
                }
            } else if (i == 3) {
                if (numArray[i] == 0) {
                    totalBinNumber = totalBinNumber + 0;
                } else if (numArray[i] == 1) {
                    totalBinNumber = totalBinNumber + 2;
                }
            } else if (i == 4) {
                if (numArray[i] == 0) {
                    totalBinNumber = totalBinNumber + 0;
                } else if (numArray[i] == 1) {
                    totalBinNumber = totalBinNumber + 1;
                } // inner if
            }//outer if

        }

        System.out.println("The binary number is: ");
        for (int j = 0; j < numArray.length; j++)
        {
            System.out.print(numArray[j] + " ");
        }
        System.out.println();
        System.out.println("Which is equal to the regular number: " + totalBinNumber);
    }


}