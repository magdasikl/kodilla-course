package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String [] [] workers = {
            {"34455667675", "John", "Smith"},
            {"76889983465", "Ivone", "Novak"},
            {"57623454447", "Jassie", "Pinkman"},
            {"09098009876", "Walter", "White"},
            {"65412866879", "Clara", "Larson"}};
    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};
    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] +", "+ workers[n][1]+", "+ workers[n][2] +salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
