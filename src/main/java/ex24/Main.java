/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 24
 *  Copyright 2021 Mayank Goyal
 */

package ex24;

import java.util.Scanner;
import java.util.Arrays;

public class Main
{

    static boolean isAnagram(String strOne, String strTwo) {
        String s1 = strOne.replaceAll("\\s", "");
        String s2 = strTwo.replaceAll("\\s", "");
        boolean isEqual = true;

        if (s1.length() != s2.length())
        {
            isEqual = false;
        }
        else
        {
            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            isEqual = Arrays.equals(arr1, arr2);
        }

        if (isEqual)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        System.out.print("Enter the first string: ");

        String first = scanner.nextLine();

        System.out.print("Enter the second string: ");

        String second = scanner.nextLine();

        if(isAnagram(first, second))
        {
            System.out.print(first + " and " + second + " are anagrams");
        }
    }
}




