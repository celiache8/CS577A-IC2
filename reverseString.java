import java.io.*;
import java.util.*;

public class reverseString{

    public static void main(String[] args){

	// Given an input of string
	// reverse the input
	// print out the original string
	// and the reversed string

	String input = "Everything is awesome!";
	StringBuffer sb = new StringBuffer();
        for(int i = 0, j = input.length()-1; j>=0;j--){
                sb.append(input.charAt(j));
        }
        System.out.println("Original String: "+input);
        input = sb.toString();
        System.out.println("Reversed String: "+input);	
    }

}
