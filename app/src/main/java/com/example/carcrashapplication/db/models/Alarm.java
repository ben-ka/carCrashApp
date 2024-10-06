package com.example.carcrashapplication.db.models;


public class Alarm {
    private int id;
    private int entityId;
    private String type;
    private String latitude;
    private String longitude;
    private String dateTime;
    private int alarmOptionId;

    // Constructors
    public Alarm() { }

    public Alarm(int id, int entityId, String type, String latitude, String longitude, String dateTime, int alarmOptionId) {
        this.id = id;
        this.entityId = entityId;
        this.type = type;
        this.latitude = latitude;
        this.longitude = longitude;
        this.dateTime = dateTime;
        this.alarmOptionId = alarmOptionId;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getAlarmOptionId() {
        return alarmOptionId;
    }

    public void setAlarmOptionId(int alarmOptionId) {
        this.alarmOptionId = alarmOptionId;
    }
}

