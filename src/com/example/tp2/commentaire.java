package com.example.tp2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class commentaire  extends Activity implements OnClickListener {

	Button bouton = null;
	
	
	   @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.commentaire);
	        bouton = (Button) findViewById(R.id.monbouton);
	    	bouton.setOnClickListener(this);
	    }
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Toast.makeText (this,"My name is Arnaud!",Toast.LENGTH_SHORT).show();
		finish();
		
	}

	

	
	
	
}
