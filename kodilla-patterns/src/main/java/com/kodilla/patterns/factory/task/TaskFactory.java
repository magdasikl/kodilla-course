package com.kodilla.patterns.factory.task;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Lidl","woda", 6.0);
            case PAINTING:
                return new PaintingTask("Natura", "czerwony", "jabłko");
            case DRIVING:
                return new DrivingTask("BMW", "Kraków","auto");
            default:
                return null;
        }
    }

}
