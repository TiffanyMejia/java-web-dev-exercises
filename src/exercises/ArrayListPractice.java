package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>(
                Arrays.asList(
                        1,
                        2,
                        3,
                        4,
                        5,
                        6,
                        7,
                        8,
                        9,
                        10
                )
        );
        System.out.println(sumEven(nums));

        ArrayList<String> wowverse = new ArrayList<>(Arrays.asList(
                        "Anduin",
                        "Jaina",
                        "Sylvanas",
                        "Zuljin",
                        "Khadgar",
                        "Magni"
                )
        );
        System.out.print("Word length to search for: ");
        int wordLength = input.nextInt();
        findFive(wowverse,wordLength);
    }
    public static int sumEven(ArrayList<Integer> numbers){
        int total = 0;

        for (int i : numbers){
            if (i % 2 == 0){
                total += i;
            }
        }
        return total;
    }
    public static void findFive(ArrayList<String> wowPeople, int length){
        for (String word : wowPeople){
            if (word.length() == length){
                System.out.println(word);
            }
        }
    }

}