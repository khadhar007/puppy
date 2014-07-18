package com.example.imagebutton;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class KidName extends Activity {
	Button save;
	EditText name;
	Context mContext=this;
	int i=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kid_name);
		name =(EditText)findViewById(R.id.kidname);
		save = (Button)findViewById(R.id.save);
		
		save.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent move = new Intent(KidName.this,PlayScreenActivity.class);
				startActivity(move);
				
				

			}

		});


	}



}



