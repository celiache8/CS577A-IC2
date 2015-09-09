import java.io.*;
import java.util.*;

public class reverseString{

    public static void main(String[] args){

	// Given an input of string
	// reverse the input
	// print out the original string
	// and the reversed string

	String input = "Everything is awesome!";

	StringBuilder input1 = new StringBuilder();
	input1.append(input);
	input1=input1.reverse(); 
	for (int i=0;i<input1.length();i++)
	    System.out.print(input1.charAt(i));  

    }

}