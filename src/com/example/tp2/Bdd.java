package com.example.tp2;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.ArrayAdapter;

public class Bdd extends SQLiteOpenHelper{
	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "mabase";
	
	

	public Bdd(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
		chargerBase();
				
	}



	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE exemple (nom TEXT PRIMARY KEY, commentaire STRING)");
		
	}


	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
		
	}
	


public void chargerBase (){
		
		SQLiteDatabase writableDB = this.getWritableDatabase();
		
		ContentValues values = new ContentValues();
		values.put("nom", "Bob");
		values.put("commentaire","l'éponge");
		long rowId = writableDB.insert("exemple", null, values);
		values.put("nom", "Alice");
		values.put("commentaire","au pays des merveilles");
		rowId = writableDB.insert("exemple", null, values);
					
	}	
	
}
