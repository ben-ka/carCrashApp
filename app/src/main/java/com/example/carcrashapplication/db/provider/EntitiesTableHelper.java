package com.example.carcrashapplication.db.provider;

import android.database.sqlite.SQLiteDatabase;

public class EntitiesTableHelper {
    public static final String ENTITIES_TABLE_NAME = "Entities";
    public static final String ENTITIES_COLUMN_ID = "Id";
    public static final String ENTITIES_COLUMN_FIRST_NAME = "FirstName";
    public static final String ENTITIES_COLUMN_LAST_NAME = "LastName";
    public static final String ENTITIES_COLUMN_PHONE_NUMBER = "PhoneNumber";
    public static final String ENTITIES_COLUMN_EMAIL = "Email";
    public static final String ENTITIES_COLUMN_CAR_NUMBER = "CarNumber";
    public static final String ENTITIES_COLUMN_IDENTIFICATION = "Identification";

    public static void createEntitiesTable(SQLiteDatabase db) {
        String CreateEntitiesTable = String.format(
                "CREATE TABLE %s (" +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "%s NVARCHAR(50), " +
                        "%s NVARCHAR(50), " +
                        "%s NVARCHAR(20), " +
                        "%s NVARCHAR(50), " +
                        "%s NVARCHAR(20), " +
                        "%s NVARCHAR(20)" +
                        ");",
                ENTITIES_TABLE_NAME,
                ENTITIES_COLUMN_ID,
                ENTITIES_COLUMN_FIRST_NAME,
                ENTITIES_COLUMN_LAST_NAME,
                ENTITIES_COLUMN_PHONE_NUMBER,
                ENTITIES_COLUMN_EMAIL,
                ENTITIES_COLUMN_CAR_NUMBER,
                ENTITIES_COLUMN_IDENTIFICATION
        );
        db.execSQL(CreateEntitiesTable);
    }
}
