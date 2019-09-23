package com.greene.botservice.task;

public enum DifficultyLevel {
    LOW(0),
    MEDIUM(2),
    HIGH(5),
    EXTREME(10);

    private int delta;

    DifficultyLevel(int delta) {
        this.delta = delta;
    }

    public int getDelta() {
        return delta;
    }
}
