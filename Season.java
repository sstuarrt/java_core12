package com.company.java_core.homework12.task2;

public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;

    private Month month;

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }
}
