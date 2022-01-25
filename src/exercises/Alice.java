package exercises;

import java.util.Scanner;

public class Alice {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Please search for a term: ");
        String userSearch = input.next();
        userSearch = userSearch.toLowerCase();
        alice = alice.toLowerCase();

        boolean result=alice.contains(userSearch);

        if (result) {
            System.out.println(alice.indexOf(userSearch) + " " + userSearch.length());
            String[] strArr = alice.split(userSearch + " ");
            String newAlice = "";
            for (int i = 0; i < strArr.length; i++) {
                newAlice += strArr[i];
            }
            System.out.println(newAlice);
        }


    }
}
