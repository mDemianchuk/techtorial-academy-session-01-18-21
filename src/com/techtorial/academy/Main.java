package com.techtorial.academy;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        printStringBuilderInfo(sb);
        printStringBuilderInfo(sb.append("techtorialacademy"));
    }

    private static void printStringBuilderInfo(StringBuilder stringBuilder) {
        StringBuilder output = new StringBuilder();
        output.append("Capacity is ")
                .append(stringBuilder.capacity())
                .append(" and length is ")
                .append(stringBuilder.length());
        System.out.println(output);
    }
}
