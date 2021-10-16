/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Nicholas Lopes
 */
package baseline;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution41 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> Names = new ArrayList<>();
        ArrayList<String> nameSort = new ArrayList<>();

        File file = new File("exercise41_input.txt");
        //declare varables
        //load names from file into arraylist
        //pass arraylist to sortAlpha method
        nameSort = sortAlpha(Names);
        //print sortedlist into new txt file

    }

    private static ArrayList<String> sortAlpha(ArrayList<String> names) {
        ArrayList<String> sort = new ArrayList<>();
        //Sort through names list alphabetically and return sorted list
        return sort;
    }
}
