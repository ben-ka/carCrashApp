package com.example.carcrashapplication.db.provider;

import android.database.sqlite.SQLiteDatabase;

public class AccidentsTableHelper {
    public static final String ACCIDENTS_TABLE_NAME = "Accidents";
    public static final String ACCIDENTS_COLUMN_ID = "Id";
    public static final String ACCIDENTS_COLUMN_ALARM_ID = "AlarmId";

    public static void createAccidentsTable(SQLiteDatabase db) {
        String CreateAccidentsTable = String.format(
                "CREATE TABLE %s (" +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "%s INTEGER, " +
                        "FOREIGN KEY (%s) REFERENCES %s(%s)" +
                        ");",
                ACCIDENTS_TABLE_NAME,
                ACCIDENTS_COLUMN_ID,
                ACCIDENTS_COLUMN_ALARM_ID,
                ACCIDENTS_COLUMN_ALARM_ID, "Alarms", "Id" // References Alarms(Id)
        );
        db.execSQL(CreateAccidentsTable);
    }
}
