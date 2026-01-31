package scenario_based;

import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class LexicalTwist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first word");
        String firstWord = input.nextLine();
        
        if (firstWord.trim().contains(" ")) {
            System.out.println(firstWord + " is an invalid word");
            input.close();
            return;
        }

        System.out.println("Enter the second word");
        String secondWord = input.nextLine();
        if (secondWord.trim().contains(" ")) {
            System.out.println(secondWord + " is an invalid word");
            input.close();
            return;
        }

        String reversedFirst = new StringBuilder(firstWord).reverse().toString();

        if (reversedFirst.equalsIgnoreCase(secondWord)) {
            String transformed = reversedFirst.toLowerCase().replaceAll("[aeiouAEIOU]", "@");
            System.out.println(transformed);
        } else {
            String combined = (firstWord + secondWord).toUpperCase();
            int vowelsCount = 0;
            int consonantsCount = 0;
            
            String vowelsList = "AEIOU";
            
            for (char c : combined.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (vowelsList.indexOf(c) != -1) {
                        vowelsCount++;
                    } else {
                        consonantsCount++;
                    }
                }
            }

            if (vowelsCount > consonantsCount) {
                printFirstTwoUnique(combined, true);
            } else if (consonantsCount > vowelsCount) {
                printFirstTwoUnique(combined, false);
            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }
        input.close();
    }

    public static void printFirstTwoUnique(String word, boolean wantVowels) {
        String vowels = "AEIOU";
        Set<Character> seen = new LinkedHashSet<>();
        
        for (char c : word.toCharArray()) {
            boolean isVowel = vowels.indexOf(c) != -1;
            if (wantVowels && isVowel) {
                seen.add(c);
            } else if (!wantVowels && !isVowel && Character.isLetter(c)) {
                seen.add(c);
            }
            
            if (seen.size() == 2) break;
        }
        
        for (Character ch : seen) {
            System.out.print(ch);
        }
        System.out.println();
    }
}