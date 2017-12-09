package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // write your code here

        int[] myArray = getArray(5);
        int[] sorted =sortArray(myArray);
        printArray(sorted);


    }




    private static int[] getArray(int number) {

        int[] enterNumbers = new int[number];
        System.out.println("Enter "+number+" please");
        for(int i=0;i<enterNumbers.length;i++){
            enterNumbers[i] = scanner.nextInt();
        }
        return enterNumbers;
    }

    private static int[] sortArray(int[] myArray) {

        int[] sortedArray = new int[myArray.length];
            for(int  i =0;i<sortedArray.length;i++){
                sortedArray[i] = myArray[i];
            }

            boolean flag = true;
            int temp;

            while (flag){
                flag = false;

                for(int i = 0;i<sortedArray.length-1;i++){
                    if(sortedArray[i]<sortedArray[i+1]){
                       temp = sortedArray[i];
                       sortedArray[i] = sortedArray[i+1];
                       sortedArray[i+1]= temp;
                       flag = true;

                    }

                }

            }
            return sortedArray;
    }

    private static void printArray(int[] sorted) {
       for(int i =0;i<sorted.length;i++){
           System.out.println("Element "+i+" contains "+sorted[i]);
       }

    }

}
