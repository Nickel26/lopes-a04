/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Nicholas Lopes
 */
package baseline;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Scanner;

public class Solution41 {
    public static void main(String[] args) throws IOException {
        //declare varables
        ArrayList<String> Names = new ArrayList<String>();

        File inFile = new File("data/exercise41_input.txt");

        int lineCounter = 0;
        //load names from file into arraylist
        try(Scanner in = new Scanner(inFile)){
            while(in.hasNextLine()){
                Names.add(in.nextLine());
                lineCounter++;
            }

        }
        catch (FileNotFoundException e){
            System.out.print("File not found!");
        }
        catch (Exception e){
            System.out.print("Error has occurred!");
        }

        //sort Arraylist using method
        Collections.sort(Names);

        //print sortedlist into new txt file
        Formatter out = new Formatter("docs/exercise41_output");
        out.format("Total of %d names\n-----------------\n", lineCounter);
        for(int i = 0; i < lineCounter; i++){
            out.format("%s  \n", Names.get(i));
        }
        out.close();
    }


}
