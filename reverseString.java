import java.io.*;
import java.util.*;
import java.lang.StringBuilder;

public class reverseString{

    public static void main(String[] args){

	// Given an input of string
	// reverse the input
	// print out the original string
	// and the reversed string

	String input = args[0];

	String reversed = new StringBuilder(input).reverse().toString();

	System.out.println("Input: " + input);
	System.out.println("Reversed: " + reversed); 
    }

}
