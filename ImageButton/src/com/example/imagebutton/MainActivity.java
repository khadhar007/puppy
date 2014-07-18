package com.example.imagebutton;







import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
Button start;
EditText kid;
static String kidName;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		start = (Button)findViewById(R.id.button1);
		
		moveToPlayScreen();
		
	}
	public void moveToPlayScreen()
	{
		start.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent move = new Intent(MainActivity.this,KidName.class);
				
				startActivity(move);
				
			}
			
		});
	}
	
	
	
}
