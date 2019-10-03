package com.itis.edu.zuccante;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19};;
        boolean same = true;
        if (same) {
            if(comp(a, b)) {
                System.out.println("They are the same");
            }else{
                System.out.println("They aren't the same");
            }//if\else
        }//if
    }//main method

    @Test
    public static boolean comp(int[] a, int[] b){
        boolean same = true;
        Arrays.sort(a);

        Arrays.sort(b);

        for (int i = 0; i < a.length-1; i++) {
            System.out.println("a:" + a[i]);
            System.out.println("b:" + b[i]);
            if (same){
                if(Math.sqrt(a[i]) != b[i]){
                    System.out.println("a nel if:" + a[i]);
                    System.out.println("b nel if:" + b[i]);
                    same = false;
                }//if
            }//while
        }//for
        return same;
    }//comp method

    }


