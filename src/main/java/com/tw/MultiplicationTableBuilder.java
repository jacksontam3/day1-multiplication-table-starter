package com.tw;

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
        return start > 1 && end <= 1000;
    }

    public String build(int start, int end) {
        return "";
    }
}
