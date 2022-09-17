package ru.mirea.korenev.practic2;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {//1 задание
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите размер массива: ");
        int n = sc.nextInt();
        double [] arr1 = new double[n];
        Random rand = new Random();
        for(int i =0; i< n; i++){
            arr1[i] = rand.nextDouble();
            System.out.println(arr1[i]);
        }
        System.out.println("Массив сгенерирован с помощью класса Random" + '\n');
        for(int i = 1; i< n ; i++){
            for(int j =0; j< n -1; j++){
                if(arr1[j]>arr1[j+1]){
                    double temp = arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }

        }
        for(int i = 0; i < n; i++){
            System.out.println(arr1[i]);
        }
        System.out.println("Массив отсортирован" + '\n');
        double [] arr2 = new double[n];
        for(int i =0; i< n; i++){
            arr1[i] = Math.random();
            System.out.println(arr1[i]);
        }
        System.out.println("Массив сгенерирован с помощью метода .random()"+'\n');





        Random rand2 = new Random();//3 задание
        int [] arr = new int[4];
        for(int i=0; i<4; i++){
            arr[i] = 10 + rand.nextInt(90);
            System.out.println(arr[i]);
        }
        int arr_count = 0;
        for(int i = 0; i < 3; i++){
            if(arr[i]<arr[i+1]){
                arr_count += 1;
            }
        }
        if(arr_count!=0){
            System.out.println("Массив не является строго возрастающим!");
        }
        else{
            System.out.println("Массив является строго возрастающим!");

        }
    }
}
