package com.example.carcrashapplication.db.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "myDatabase.db";
    private static final int DATABASE_VERSION = 1;

    public DBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Enable foreign key constraints
        db.execSQL("PRAGMA foreign_keys = ON");

        // Create all tables
        EntitiesTableHelper.createEntitiesTable(db);
        UsersTableHelper.createUsersTable(db);
        AlarmsTableHelper.createAlarmsTable(db);
        AccidentsTableHelper.createAccidentsTable(db);
        AccidentDocumentsTableHelper.createAccidentDocumentsTable(db);
        LU_AlarmOptionsTableHelper.createAlarmOptionsTable(db);
        QuestionConfigurationTableHelper.createQuestionConfigurationTable(db);
        LU_AnswerTypesTableHelper.createAnswerTypesTable(db);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        // Drop existing tables
        db.execSQL("DROP TABLE IF EXISTS " + UsersTableHelper.USERS_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + EntitiesTableHelper.ENTITIES_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + AlarmsTableHelper.ALARMS_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + AccidentsTableHelper.ACCIDENTS_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + AccidentDocumentsTableHelper.ACCIDENT_DOCUMENTS_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + LU_AlarmOptionsTableHelper.ALARM_OPTIONS_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + QuestionConfigurationTableHelper.QUESTION_CONFIG_TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + LU_AnswerTypesTableHelper.ANSWER_TYPES_TABLE_NAME);

        // Recreate tables
        onCreate(db);
    }
}
