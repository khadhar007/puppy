package com.example.imagebutton;










import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



import com.example.sessions.AlertDialogManager;
import com.example.sessions.SessionManager;

public class MainActivity extends Activity {
	// Alert Dialog Manager
		AlertDialogManager alert = new AlertDialogManager();
		
		// Session Manager Class
		SessionManager session;
		Button start;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	 // Session class instance
		TextView kdname = (TextView) findViewById(R.id.tvkidname);
		
//Toast.makeText(getApplicationContext(), "User Login Status: " + session.isLoggedIn(), Toast.LENGTH_LONG).show();
//        
//        
//        /**
//         * Call this function whenever you want to check user login
//         * This will redirect user to LoginActivity is he is not
//         * logged in
//         * */
//        session.checkLogin();
//        
//        // get user data from session
//        HashMap<String, String> user = session.getUserDetails();
//        
//        // name
//        String name = user.get(SessionManager.KEY_NAME);
//        kdname.setText(name);
    
    start.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// Clear the session data
			// This will clear all session data and 
			// redirect user to LoginActivity
			Intent move = new Intent(MainActivity.this,KidName.class);
			startActivity(move);
			
		}
	});
	
	
	}
}
