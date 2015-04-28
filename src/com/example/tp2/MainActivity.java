package com.example.tp2;



import java.util.ArrayList;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	public Button nico= null;
	public ListView listview = null;
	public ArrayAdapter<Element> adapter = null;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nico = (Button) findViewById(R.id.bouton);
    	nico.setOnClickListener(this);
    	
    	listview= (ListView) findViewById(R.id.listView);
    	 
    	
//    	chargerDonnee();
    	chargerBase();
    	
    	listview.setAdapter(adapter);
    	    	
    	
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Toast.makeText (this,"My name is Arnaud!",Toast.LENGTH_SHORT).show();
		visualiserProfil();
		
	}
	
	public void visualiserProfil(){
		Intent intent = new Intent(this,commentaire.class);
		startActivity(intent);
	}
  
	
	public void chargerDonnee(){
		adapter.clear();
		Element arno = new Element("Huyssen", "J'aime les frites!");
    	Element niko = new Element("Kempf", "MTP");
    	ArrayList<Element> liste = new ArrayList<Element>();
    	liste.add(arno);
    	liste.add(niko);
    	adapter = new ArrayAdapter<Element>(this, android.R.layout.simple_list_item_1, android.R.id.text1, liste);
	}
	
	public void chargerBase (){
		SQLiteOpenHelper bdd= new Bdd(this);
		SQLiteDatabase writableDB = bdd.getWritableDatabase();
		
		Cursor cursor = writableDB.query("exemple", new String[] {"nom", "commentaire"}, null, null, null, null, null);
		int nblignes = cursor.getCount();
		
		ArrayList<Element> liste = new ArrayList<Element>();
		
		while (cursor.moveToNext()) {

    	liste.add(new Element(cursor.getString(0), cursor.getString(1)));

		}
		cursor.close();
    	adapter = new ArrayAdapter<Element>(this, android.R.layout.simple_list_item_1, android.R.id.text1, liste);
		
	}	
}
