package com.tw;

import java.util.stream.IntStream;

public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.build(start, end);

        System.out.println(multiplicationTable);
    }

    public boolean isInputStartSmallerThanOrEqualEnd(int start, int end) {
        return start <= end;
    }

    public boolean isInputBetween1To1000Inclusive(int start, int end) {
        return start > 1 && start <= 1000 && end > 1 && end <= 1000;
    }

    public boolean isValid(int start, int end) {
        return isInputStartSmallerThanOrEqualEnd(start, end) && isInputBetween1To1000Inclusive(start, end);
    }

    public String generateTable(int start, int end) {
        StringBuilder multiplicationTable = new StringBuilder();
        IntStream.rangeClosed(start, end).forEach(i -> {
            IntStream.rangeClosed(start, i).forEach(j -> {
                multiplicationTable.append(j).append("*").append(i).append("=").append(i * j);
                if (j != i) {
                    multiplicationTable.append(" ");
                }
            });
            multiplicationTable.append(System.lineSeparator());
        });
        return multiplicationTable.toString();
    }

    public String build(int start, int end) {
        if (!isValid(start, end)) {
            return null;
        }

        return generateTable(start, end);

    }
}
