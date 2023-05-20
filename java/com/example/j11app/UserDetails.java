package com.example.j11app;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class UserDetails extends SQLiteOpenHelper {
public final static String DB_Name = "users.db";
String TableName = "users_table";
String col1 = "Name";
String col2 = "Phone";
String col3 = "Pass";
String col4 = "RePass";
    public UserDetails(Context context) {
        super(context, DB_Name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + TableName+ "(Name Varchar,Phone Long,Pass Varchar,Repass Varchar)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TableName);
onCreate(sqLiteDatabase);
    }
    public boolean insertData(String name,String num,String password,String confirmPassword)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv =new ContentValues();
        cv.put(col1,name);
        cv.put(col2,num);
        cv.put(col3,password);
        cv.put(col4,confirmPassword);
        long res = db.insert(TableName,null,cv);
        if(res == -1)
        return false;
        else return true;
    }
}

