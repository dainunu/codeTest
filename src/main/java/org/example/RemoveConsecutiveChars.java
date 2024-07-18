package org.example;




public class RemoveConsecutiveChars {

    public static String removeConsecutive(String text) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(i - 1)) {
                count++;
            } else {
                appendChars(result, text, i - 1, count);
                count = 1;
            }
        }
        appendChars(result, text, text.length() - 1, count);
        return result.toString();
    }

    private static void appendChars(StringBuilder result, String text, int index, int count) {
        if (count < 3) {
            for (int i = index - count + 1; i <= index; i++) {
                result.append(text.charAt(i));
            }
        }
    }

    public static String output(String input) {
        String output = input;
        while (true) {
            String prevOutput = output;
            output = removeConsecutive(output);
            if (prevOutput.equals(output)) {
                break;
            }
        }
        return  output; // Output: d
    }
}

