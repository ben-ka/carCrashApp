package com.example.carcrashapplication.db.provider;

import android.database.sqlite.SQLiteDatabase;

public class LU_AlarmOptionsTableHelper {
    public static final String ALARM_OPTIONS_TABLE_NAME = "LU_AlarmOptions";
    public static final String ALARM_OPTIONS_COLUMN_ID = "Id";
    public static final String ALARM_OPTIONS_COLUMN_DESCRIPTION = "Description";

    public static void createAlarmOptionsTable(SQLiteDatabase db) {
        String CreateAlarmOptionsTable = String.format(
                "CREATE TABLE %s (" +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "%s NVARCHAR(30)" +
                        ");",
                ALARM_OPTIONS_TABLE_NAME,
                ALARM_OPTIONS_COLUMN_ID,
                ALARM_OPTIONS_COLUMN_DESCRIPTION
        );
        db.execSQL(CreateAlarmOptionsTable);
    }
}
