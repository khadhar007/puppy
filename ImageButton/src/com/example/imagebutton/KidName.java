package com.example.imagebutton;


import com.example.sessions.AlertDialogManager;
import com.example.sessions.SessionManager;

import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class KidName extends Activity {
	Button save;
	EditText name;

	// Alert Dialog Manager
	AlertDialogManager alert = new AlertDialogManager();

	// Session Manager Class
	SessionManager session;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kid_name);

		// Session Manager
		session = new SessionManager(getApplicationContext());         

		name =(EditText)findViewById(R.id.etusername);




		save = (Button)findViewById(R.id.btnsave);

		// Login button click event
		save.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {



				// Get username, password from EditText
				String username = name.getText().toString();
				//String password = txtPassword.getText().toString();

				// Check if username, password is filled				
				if(username.trim().length() > 0){
					// For testing puspose username, password is checked with sample data
					// username = test
					// password = test


					// Creating user login session
					// For testing i am stroing name, email as follow
					// Use user real data
					session.createLoginSession(username);

					// Staring MainActivity
					Intent i = new Intent(getApplicationContext(), PlayScreenActivity.class);
					startActivity(i);
					finish();


				}
			}
		});



	}



}




