package com.example.carcrashapplication.db.models;


public class Accident {
    private int id;
    private int alarmId;

    // Constructors
    public Accident() { }

    public Accident(int id, int alarmId) {
        this.id = id;
        this.alarmId = alarmId;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(int alarmId) {
        this.alarmId = alarmId;
    }
}
