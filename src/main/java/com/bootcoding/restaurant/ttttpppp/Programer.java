// This Program Take String and Print it in Reverse Order

package com.bootcoding.restaurant.ttttpppp;

import java.util.Scanner;

public class Programer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        for (int i=0 ; i<s1.length/2 ; i++ ){
            String temp  = s1[s1.length-1-i];
            s1[s1.length-1-i] = s1[i];
            s1[i] = temp;

        }
        for (int i=0 ; i<s1.length ; i++){
            System.out.print(s1[i] + " ");
        }
    }
}
