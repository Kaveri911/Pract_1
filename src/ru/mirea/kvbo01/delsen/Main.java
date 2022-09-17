package ru.mirea.kvbo01.delsen;
import java.lang.*;
import java.util.Scanner;
public class Main {
    public static int Factorial(int x)
    {
        int t=1;
        for (int i=1;i<=x;i++)
        {
            t*=i;
        }
        return t;
    }
    public static void main(String[] args) {


        System.out.println("Hello world");
        Square a = new Square(10);
        a.setSide(3);
        System.out.println("Side of square is " + a.getSide());
        System.out.println("Area is " + a.getSquare());
        System.out.println("Our fields of class are " + a);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers?");
        int sum = 0;
        int max = 0;
        int min = 0;
        double medium = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Insert integer values please");
        for (int i = 0; i < n; i++) {


            if (sc.hasNextInt()) {
                int temp = sc.nextInt();
                arr[i] = temp;
                sum += arr[i];
                if (i == 0) {
                    max = arr[i];
                    min = arr[i];
                } else {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                }

            } else {
                System.out.println("It is not integer! ERROR");
                break;
            }

        }

        medium = (double) sum / n;
        System.out.println("Medium is " + medium);
        System.out.println("MAX is " + max + "  | MIN is " + min);
        System.out.println("10 чисел гармонического ряда: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println((double) 1 / i + "  (1/" + i + ")");
        }


        System.out.println("Факториал какого числа найти?");

        int temp = sc.nextInt();
        System.out.println("Факториал = " + Factorial(temp));
    }
}


