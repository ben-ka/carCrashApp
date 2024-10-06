package com.example.carcrashapplication.db.models;

public class LU_AnswerType {
    private int id;
    private String description;

    // Constructors
    public LU_AnswerType() { }

    public LU_AnswerType(int id, String description) {
        this.id = id;
        this.description = description;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

