package ru.mirea.practice.work6;

public class Manager extends Employer {
    private double averageSum;

    Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    public double getAverageSum() {
        return averageSum;
    }
}
