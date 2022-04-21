package com.algo;

public class basic_recursion {
    public static void main(String[] args) {
        //System.out.println(factorial(4));
        //System.out.println(sum_natural(4));
        System.out.println(recursive_power(2,3));

    }


    // Recursive Program For Calculating Factorial .
    private static int factorial(int a){
        if(a<0){
            return -1;
        }
        else{
            if(a==0 || a==1){
                return 1;

            }
            else{
                return a*factorial(a-1);
            }
        }

    }

    // Recursive Program For Calculating Sum Of First N Natural Numbers .

    private static int sum_natural(int n){
        if(n<0){
            return -1;
        }
        else{
            if(n==0){
                return 0;

            }
            else{
                return n+sum_natural(n-1);
            }
        }
    }

    // Recursive Program For Calculating A^B .

    private static  int recursive_power(int a , int b){
        if(a<0 || b<0){
            return -1;

        }
        else if(a==0){
            return 0;

        }
        else if (b==0){
            return 1;
        }
        else{
            return a*recursive_power(a,b-1);
        }
    }
}
