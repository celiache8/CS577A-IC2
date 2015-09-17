public class reverseString{
    public static void main(String[] args){
        // Given an input of string
        // reverse the input
        // print out the original string
        // and the reversed string
        if (args.length < 1) {
            System.out.println("Please input a string!");
            return;
        }
        String input = args[0];
        StringBuffer sb = new StringBuffer();
        for(int j = input.length()-1; j>=0;j--){
                sb.append(input.charAt(j));
        }
        System.out.println("Original String: "+input);
        input = sb.toString();
        System.out.println("Reversed String: "+input); 
    }
}
