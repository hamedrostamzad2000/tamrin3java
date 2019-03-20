package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        int i;
        int j;
        int k;
        int s;
        int l;
        System.out.print("GHOTRE LOZY (FAGHAT AADADE FARD) :");
        Scanner input=new Scanner(System.in);
        l=input.nextInt();

        System.out.println();

        for(i=1;i<=l;i+=2){
            j=1;
            k=(l-i)/2;
            for(s=1;s<=k;s++){
                System.out.print(" ");
            }

            for(j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }


        for(i=l-2;i>=1;i-=2){
            j=1;
            k=(l-i)/2;
            for(s=1;s<=k;s++){
                System.out.print(" ");
            }

            for(j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
