package com.example.carcrashapplication.db.provider;

import android.database.sqlite.SQLiteDatabase;

public class AlarmsTableHelper {
    public static final String ALARMS_TABLE_NAME = "Alarms";
    public static final String ALARMS_COLUMN_ID = "Id";
    public static final String ALARMS_COLUMN_ENTITY_ID = "EntityId";
    public static final String ALARMS_COLUMN_TYPE = "Type";
    public static final String ALARMS_COLUMN_LATITUDE = "Latitude";
    public static final String ALARMS_COLUMN_LONGITUDE = "Longitude";
    public static final String ALARMS_COLUMN_DATETIME = "DateTime";
    public static final String ALARMS_COLUMN_ALARM_OPTION_ID = "AlarmOptionId";

    public static void createAlarmsTable(SQLiteDatabase db) {
        String CreateAlarmsTable = String.format(
                "CREATE TABLE %s (" +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "%s INTEGER, " +
                        "%s NVARCHAR(15), " +
                        "%s NVARCHAR(15), " +
                        "%s NVARCHAR(15), " +
                        "%s DATETIME, " +
                        "%s INTEGER, " +
                        "FOREIGN KEY (%s) REFERENCES %s(%s), " +  // Foreign key to EntityId
                        "FOREIGN KEY (%s) REFERENCES %s(%s)" +    // Foreign key to AlarmOptionId
                        ");",
                ALARMS_TABLE_NAME,
                ALARMS_COLUMN_ID,
                ALARMS_COLUMN_ENTITY_ID,
                ALARMS_COLUMN_TYPE,
                ALARMS_COLUMN_LATITUDE,
                ALARMS_COLUMN_LONGITUDE,
                ALARMS_COLUMN_DATETIME,
                ALARMS_COLUMN_ALARM_OPTION_ID,
                ALARMS_COLUMN_ENTITY_ID, "Entities", "Id",         // References Entities(Id)
                ALARMS_COLUMN_ALARM_OPTION_ID, "LU_AlarmOptions", "Id" // References LU_AlarmOptions(Id)
        );
        db.execSQL(CreateAlarmsTable);
    }
}
