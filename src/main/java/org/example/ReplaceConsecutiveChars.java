package org.example;



public class ReplaceConsecutiveChars {

    public static String replaceConsecutive(String text) {
        StringBuilder result = new StringBuilder();
        char prevChar = text.charAt(0);
        int count = 1;
        for (int i = 1; i < text.length(); i++) {
            char currChar = text.charAt(i);
            if (currChar == prevChar) {
                count++;
            } else {
                result.append(replaceChars(prevChar, count));
                prevChar = currChar;
                count = 1;
            }
        }
        result.append(replaceChars(prevChar, count));
        return result.toString();
    }

    private static String replaceChars(char ch, int count) {
        if(count >= 3){
            int asc =  ch - 1;
            if(asc >= 97){
                char pre = (char) asc;
                return String.valueOf(pre);
            }
            return "";
        }
        return String.valueOf(ch).repeat(Math.min(count,3));
    }

    public static String output(String input) {
        String output = input;
        while (true) {
            String prevOutput = output;
            output = replaceConsecutive(output);
            if (prevOutput.equals(output)) {
                break;
            }
        }
        return output; // Output: d
    }
}
