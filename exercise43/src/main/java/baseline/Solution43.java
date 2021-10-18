/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Nicholas Lopes
 */
package baseline;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Solution43 {
    private static final Scanner in = new Scanner(System.in);

    static void makeDir(String path, String name, String author) throws IOException {
        File file = new File(path);
        file.mkdir();

        file = new File(path + name);
        file.mkdir();
        System.out.print("Created ./website/"+ name+"\n");

        file = new File(path + name +"/index.html");
        System.out.print("Created ./website/"+ name +"/index.html\n");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write("<head> <title "+ name +"> <meta "+ author +">");
        bw.close();
    }

    static void makeJava(){
        File file = new File("data/website/js");
        file.mkdir();
        System.out.print("Created ./website/js/\n");
    }

    static void makeCss(){
        File file = new File("data/website/css");
        file.mkdir();
        System.out.print("Created ./website/css/\n");
    }

    public static void main(String[] args) throws IOException {
        //initialize variables
        String name;
        String author;
        String javaFile;
        String cssFile;
        String path = "data/website/";

        //prompt user for website name
        System.out.print("Site name: ");
        name = in.nextLine();

        //prompt user for author
        System.out.print("Author: ");
        author = in.nextLine();

        //ask for folder responses
        System.out.print("Do you want a folder for JavaScript? ");
        javaFile = in.nextLine();

        System.out.print("Do you want a folder for CSS? ");
        cssFile = in.nextLine();

        //create index file with title and author and prompt user of creation
        makeDir(path, name, author);

        if (javaFile.compareTo("y") == 0 || javaFile.compareTo("Y") == 0){
            makeJava();
        }

        if (cssFile.compareTo("y") == 0 || cssFile.compareTo("Y") == 0){
            makeCss();
        }
    }


}

