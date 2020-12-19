package org.example;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //1//
        System.out.println("Question number 1 :");
        int arr[] = {11, 23, 39};
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println();
        //2//
        System.out.println("Question number 2 :");
        int arr2[] = {1, 2, 5};
        if (indexOf(arr2) != 2) {
            System.out.println("Index position of number 5 is : -1");
        } else
            System.out.println("Index position of number 5 is : " + indexOf(arr2));
        System.out.println();

        // 3//
        System.out.println("Question number 3 :");
        String array[] = {"Paris", "London", "New York", "Stockholm"};
        Arrays.sort(array);

        for (String input : array) {
            System.out.print(input + " ");

        }
        System.out.println();
        System.out.println();
        //4//
        System.out.println("Question number 4 :");
        int arr4[] = {1, 15, 20};
        int copy[] = Arrays.copyOf(arr4, 3);
        for (int output : copy) {
            System.out.print(output + " ");
        }
        System.out.println();
        System.out.println();
        //5//
        System.out.println("Question number 5 :");
        String arr5[][] = {{"France", "Paris"}, {"Sweden", "Stockholm"}};
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                System.out.print(arr5[i][j] + " ");
            }

        }
        System.out.println();
        System.out.println();

        //6//
        System.out.println("Question number 6 :");
        int arr6[] = {43, 5, 23, 17, 2, 14};
        double sum = 0.0;
        double avreage = 0.0;
        for (int i = 0; i <= arr6.length - 1; i++) {
            sum = sum + arr6[i];
            avreage = sum / 6;
        }
        System.out.print(avreage);
        System.out.println();
        System.out.println();
        //7//
        System.out.println("Question number 7 :");
        int arr7[] = {1, 2, 4, 7, 9, 12};
        System.out.print("Odd Array : ");
        for (int i = 0; i <= arr7.length - 1; i++) {
            if (arr7[i] % 2 != 0) {
                int result = arr7[i];
                System.out.print(result + " ");
            }

        }
        System.out.println();
        System.out.println();

        //8//
        System.out.println("Question number 8 :");
        int arr8[] = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        for (int i = 0; i < arr8.length - 1; i++) {
            if (arr8[i] == arr8[i + 1]) {

            }
        }
        System.out.println();

        //9//
        System.out.println("Question number 9 :");
        int[] arr9 = {1, 2, 3, 4};
        addingElements(arr);
        System.out.println();
        System.out.println();

        //10//
        System.out.println("Question number 10 :");
        int arr10[][] = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};

        for (int i = 0; i < arr10.length; i++) {
            for (int j = 0; j < arr10[i].length; j++) {
                System.out.print(arr10[i][j] * arr10[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println();
        //11//
        System.out.println("Question number 11 :");
        System.out.print("Enter 10 to stop : ");
        Scanner sc = new Scanner(System.in);

        int arr11[] = new int[10];
        int count = 0;
        for (int i = 0; i < arr11.length; i++) {
            arr11[i] = sc.nextInt();
        }
        System.out.print("Normal order : ");
        for (int output : arr11) {
            System.out.print(+output + " ");
            count++;
        }
        System.out.println();
        System.out.print("In reversed : ");
        for (int j = arr11.length - 1; j >= 0; j--) {
            System.out.print(+arr11[j] + " ");
        }
        if (count == 10) {
            System.exit(-1);
        }
        if (sc.nextInt() == 10) {
            System.exit(-1);
        }
        System.out.println();
        System.out.println();
        //12//
        System.out.println("Question number 12 :");


        System.out.println();
        //13//
        System.out.println("Question number 13 :");


    }

       //Methods
    public static int indexOf(int arr[]) {

        int index = Arrays.binarySearch(arr, 10);

        return index;
    }

    public static void addingElements(int arr[]) {
        int arr9[] = {1, 2, 3, 4};
        int[] copy = Arrays.copyOf(arr9, arr9.length + 2);
        copy[4] = 5;
        copy[5] = 6;

        for (int number : copy) {
            System.out.print(number + " ");

        }
    }

}
