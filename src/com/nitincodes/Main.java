package com.nitincodes;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	//using for each loop in creating an array:
    Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
    for(int i=0;i< arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int item:arr){
        System.out.println(item+" ");
    }
    }
}
