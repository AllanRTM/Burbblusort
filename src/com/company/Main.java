package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=100;
        while (n<1000000){
            int []aArray=new int[n];
            long startime=System.nanoTime();
            fillRandomArray(aArray);
            BubleSort(aArray);
            long endtime=System.nanoTime();
            long deltatime=endtime-startime;
            System.out.println(""+ n + " , " +deltatime);
            n+=n;

        }


        System.out.println("*********************");



    }
    private static void BubleSort(int [] a){
        int temp;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                if (a[i]<a[j]) {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }

        }
    }
    private static void fillRandomArray(int[]rArray){
        Random r =new Random();
        for (int i = 0; i <rArray.length ; i++) {
            rArray[i]=r.nextInt();
        }
    }

    private static void printArray(int[] aArray) {
        for (int num:
                aArray) {
            System.out.println(num);
        }
    }
}
