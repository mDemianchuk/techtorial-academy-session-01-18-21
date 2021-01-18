package com.techtorial.academy;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        printStringBuilderInfo(sb);
        printStringBuilderInfo(sb.append("techtorialacademy"));

        String reversed = reverseString2("Madam");
        System.out.println(reversed);
    }

    private static void printStringBuilderInfo(StringBuilder stringBuilder) {
        StringBuilder output = new StringBuilder();
        output.append("Capacity is ")
                .append(stringBuilder.capacity())
                .append(" and length is ")
                .append(stringBuilder.length());
        System.out.println(output);
    }

    private static String reverseString(String s) {
        String reversedString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString += s.charAt(i);
        }
        return reversedString;
    }

    private static String reverseString2(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
