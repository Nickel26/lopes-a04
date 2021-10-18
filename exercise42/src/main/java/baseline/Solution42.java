/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Nicholas Lopes
 */
package baseline;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution42 {
    public static void main(String[] args){
        //initialize starting variables
        String[] load = new String[100];
        String[] result = new String[100];
        int lines = 0, num = 0;
        File file = new File("data/exercise42_input.txt");
        //load files contents into string
        try(Scanner in = new Scanner(file)){
            while(in.hasNextLine()){
                load[lines] = in.nextLine();
                lines++;
            }
        }
        catch (FileNotFoundException e){
            System.out.print("File not found!");
        }
        catch (Exception e){
            System.out.print("Error has occurred!");
        }
        //pass string to split method which returns string array
        for(int i = 0; i < lines; i++){
            String temp[] = load[i].split(",");
            for(int j = 0; j < 3; j++, num++) {
                result[num] = temp[j];
            }
        }
        //display parsed data
        System.out.format("\tLast \t\tfirst \t\tsalary\n" +
                "-------------------------------------\n");
        for(int i = 0; i < num; i += 3){
            System.out.format("%10s %10s %10s\n", result[i], result[i+1], result[i+2]);
        }
    }
}
