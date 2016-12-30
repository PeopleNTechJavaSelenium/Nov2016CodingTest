package data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.io.*;

/**
 * Created by Renadh on 12/21/2016.
 */
public class UseBufferedReader {

    public static void main(String[] args) {


        FileReader fr = null;
        BufferedReader br = null;

        String path = "C:\\Users\\Renadh\\Nov2016CodingTest\\src\\data\\self-driving-car";

        try {
            fr = new FileReader(path);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        br = new BufferedReader(fr);
        String text = "";


       try{
        while((text = br.readLine()) != null){
               System.out.println(text);
           }
        }catch(IOException e){
           e.printStackTrace();
       }

       try {
           if (br != null) {
               br = null;
           }

           if (fr != null) {
               fr = null;

           }
       }catch(Exception ex){
            ex.printStackTrace();
       }
    }

}