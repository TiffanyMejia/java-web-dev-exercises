
package Studios;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {
    public static void main(String[] args) {
        //input String
        String str = "If the product of two terms is zero " +
                "then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        int startingValue=1;

        Map<Character,Integer> charCount = new HashMap<>();

        char[] inputCharArray = str.toCharArray();

        // iterate each character from characterArray
        for(Character eachChar : inputCharArray){

            //condition is true if the character is already present in the map
            if(charCount.containsKey(eachChar)){
                //increment the character occurrence in the map
                //Hashmap doesn't allow duplicate keys, so it increments the value alone
                charCount.put(eachChar,charCount.get(eachChar)+1);
            }else{
                // put the new character in the map with starting value as 1
                charCount.put(eachChar,startingValue);
            }

        }
        for(Character inputChar : charCount.keySet()){
            //search for value using character
            Integer count = charCount.get(inputChar);

            // print each character and its occurrence
            System.out.println( inputChar + ": " + count);
        }
    }
}