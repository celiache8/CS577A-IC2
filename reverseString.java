import java.io.*;
import java.util.*;

public class reverseString{

    public static void main(String[] args){

	// Given an input of string
	// reverse the input
	// print out the original string
	// and the reversed string

	String input = "Everything is awesome!";
	StringBuilder buffer = new StringBuilder();
	for(int i = input.length() - 1; i >= 0; i--){
		buffer.append(input.charAt(i));
	}
	System.out.println("Input: " + input);
	System.out.println("Output: " + buffer.toString());
    }

}
