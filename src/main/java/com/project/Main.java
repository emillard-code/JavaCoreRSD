package com.project;

public class Main {

    public static void main( String[] args ) {

        removeSuccessiveDuplicates("aaabbcdeeff");
        removeSuccessiveDuplicates("aaabbaaacc");

    }

    // A method that removes all characters that are identical to the previous character in a String.
    static void removeSuccessiveDuplicates(String input) {

        StringBuilder noDuplicates = new StringBuilder();

        noDuplicates.append(input.charAt(0));

        for (int x = 1; x < input.length(); x++) {

            if (!(input.charAt(x) == input.charAt(x-1))) {
                noDuplicates.append(input.charAt(x));
            }

        }

        System.out.println(noDuplicates);

    }

}
