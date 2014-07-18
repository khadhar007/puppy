package com.example.imagebutton;

import java.util.Random;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class PlayScreenActivity extends Activity {
	TextView[] tv = new TextView[10];
	static int[] anum =new int[10];
	static int flag=0;
	public static int index;
	public Random r;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_play_screen);
		tv[0]=(TextView)findViewById(R.id.textView0);
		tv[1]=(TextView)findViewById(R.id.textView1);
		tv[2]=(TextView)findViewById(R.id.textView2);
		tv[3]=(TextView)findViewById(R.id.textView3);
		tv[4]=(TextView)findViewById(R.id.textView4);
		tv[5]=(TextView)findViewById(R.id.textView5);
		tv[6]=(TextView)findViewById(R.id.textView6);
		tv[7]=(TextView)findViewById(R.id.textView7);
		tv[8]=(TextView)findViewById(R.id.textView8);
		tv[9]=(TextView)findViewById(R.id.textView9);
		tv[0].setOnClickListener(mGlobal_OnClickListener);
		tv[1].setOnClickListener(mGlobal_OnClickListener);
		tv[2].setOnClickListener(mGlobal_OnClickListener);
		tv[3].setOnClickListener(mGlobal_OnClickListener);
		tv[4].setOnClickListener(mGlobal_OnClickListener);
		tv[5].setOnClickListener(mGlobal_OnClickListener);
		tv[6].setOnClickListener(mGlobal_OnClickListener);
		tv[7].setOnClickListener(mGlobal_OnClickListener);
		tv[8].setOnClickListener(mGlobal_OnClickListener);
		tv[9].setOnClickListener(mGlobal_OnClickListener);
		
		if(flag==0)
		{
			initialSetText();
			flag=1;
		}
		
		
	}
	final OnClickListener mGlobal_OnClickListener = new OnClickListener() {
		public void onClick(final View v) {
			switch(v.getId()) {
			case R.id.textView0:
				//Inform the user the button1 has been clicked
				// Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show(); 
				for(int i=0;i<10;i++)
				{
					int min = 0;
					int max = 99;


					r = new Random();
					int i1 = r.nextInt(max - min + 1) + min;

					if(i1!=anum[0] && i1!=anum[1] ){
						if(i1!=anum[2] && i1!=anum[3] ){
							if(i1!=anum[4] && i1!=anum[5] ){
								if(i1!=anum[6] && i1!=anum[7] ){
									if(i1!=anum[8] && i1!=anum[9] ){
										tv[0].setText(String.valueOf(i1));
										i=10;
									}

								}
							}
						}
					}
				}


				System.out.println("pressed position: 0 value:"+tv[0].getText().toString());
				anum[0]=Integer.parseInt(tv[0].getText().toString());
				break;

			case R.id.textView1:
				//Inform the user the button2 has been clicked
				//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
				for(int i=0;i<10;i++)
				{
					int min = 0;
					int max = 99;


					r = new Random();
					int i1 = r.nextInt(max - min + 1) + min;

					if(i1!=anum[0] && i1!=anum[1] ){
						if(i1!=anum[2] && i1!=anum[3] ){
							if(i1!=anum[4] && i1!=anum[5] ){
								if(i1!=anum[6] && i1!=anum[7] ){
									if(i1!=anum[8] && i1!=anum[9] ){
										tv[1].setText(String.valueOf(i1));
										i=10;
									}

								}
							}
						}
					}
				}


				System.out.println("pressed position: 0 value:"+tv[1].getText().toString());
				anum[1]=Integer.parseInt(tv[1].getText().toString());

				break;

			case R.id.textView2:
				//Inform the user the button2 has been clicked
				//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
				for(int i=0;i<10;i++)
				{
					int min = 0;
					int max = 99;


					r = new Random();
					int i1 = r.nextInt(max - min + 1) + min;

					if(i1!=anum[0] && i1!=anum[1] ){
						if(i1!=anum[2] && i1!=anum[3] ){
							if(i1!=anum[4] && i1!=anum[5] ){
								if(i1!=anum[6] && i1!=anum[7] ){
									if(i1!=anum[8] && i1!=anum[9] ){
										tv[2].setText(String.valueOf(i1));
										i=10;
									}

								}
							}
						}
					}
				}


				System.out.println("pressed position: 0 value:"+tv[2].getText().toString());
				anum[2]=Integer.parseInt(tv[2].getText().toString());

				break;

			case R.id.textView3:
				//Inform the user the button2 has been clicked
				//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
				for(int i=0;i<10;i++)
				{
					int min = 0;
					int max = 99;


					r = new Random();
					int i1 = r.nextInt(max - min + 1) + min;

					if(i1!=anum[0] && i1!=anum[1] ){
						if(i1!=anum[2] && i1!=anum[3] ){
							if(i1!=anum[4] && i1!=anum[5] ){
								if(i1!=anum[6] && i1!=anum[7] ){
									if(i1!=anum[8] && i1!=anum[9] ){
										tv[3].setText(String.valueOf(i1));
										i=10;
									}

								}
							}
						}
					}
				}


				System.out.println("pressed position: 0 value:"+tv[3].getText().toString());
				anum[3]=Integer.parseInt(tv[3].getText().toString());

				break;

			case R.id.textView4:
				//Inform the user the button2 has been clicked
				//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
				for(int i=0;i<10;i++)
				{
					int min = 0;
					int max = 99;


					r = new Random();
					int i1 = r.nextInt(max - min + 1) + min;

					if(i1!=anum[0] && i1!=anum[1] ){
						if(i1!=anum[2] && i1!=anum[3] ){
							if(i1!=anum[4] && i1!=anum[5] ){
								if(i1!=anum[6] && i1!=anum[7] ){
									if(i1!=anum[8] && i1!=anum[9] ){
										tv[4].setText(String.valueOf(i1));
										i=10;
									}

								}
							}
						}
					}
				}


				System.out.println("pressed position: 0 value:"+tv[4].getText().toString());
				anum[4]=Integer.parseInt(tv[4].getText().toString());

				break;

			case R.id.textView5:
				//Inform the user the button2 has been clicked
				//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
				for(int i=0;i<10;i++)
				{
					int min = 0;
					int max = 99;


					r = new Random();
					int i1 = r.nextInt(max - min + 1) + min;

					if(i1!=anum[0] && i1!=anum[1] ){
						if(i1!=anum[2] && i1!=anum[3] ){
							if(i1!=anum[4] && i1!=anum[5] ){
								if(i1!=anum[6] && i1!=anum[7] ){
									if(i1!=anum[8] && i1!=anum[9] ){
										tv[5].setText(String.valueOf(i1));
										i=10;
									}

								}
							}
						}
					}
				}


				System.out.println("pressed position: 0 value:"+tv[5].getText().toString());
				anum[5]=Integer.parseInt(tv[5].getText().toString());

				break;

			case R.id.textView6:
				//Inform the user the button2 has been clicked
				//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
				for(int i=0;i<10;i++)
				{
					int min = 0;
					int max = 99;


					r = new Random();
					int i1 = r.nextInt(max - min + 1) + min;

					if(i1!=anum[0] && i1!=anum[1] ){
						if(i1!=anum[2] && i1!=anum[3] ){
							if(i1!=anum[4] && i1!=anum[5] ){
								if(i1!=anum[6] && i1!=anum[7] ){
									if(i1!=anum[8] && i1!=anum[9] ){
										tv[6].setText(String.valueOf(i1));
										i=10;
									}

								}
							}
						}
					}
				}


				System.out.println("pressed position: 0 value:"+tv[6].getText().toString());
				anum[6]=Integer.parseInt(tv[6].getText().toString());

				break;

			case R.id.textView7:
				//Inform the user the button2 has been clicked
				//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
				for(int i=0;i<10;i++)
				{
					int min = 0;
					int max = 99;


					r = new Random();
					int i1 = r.nextInt(max - min + 1) + min;

					if(i1!=anum[0] && i1!=anum[1] ){
						if(i1!=anum[2] && i1!=anum[3] ){
							if(i1!=anum[4] && i1!=anum[5] ){
								if(i1!=anum[6] && i1!=anum[7] ){
									if(i1!=anum[8] && i1!=anum[9] ){
										tv[7].setText(String.valueOf(i1));
										i=10;
									}

								}
							}
						}
					}
				}


				System.out.println("pressed position: 0 value:"+tv[7].getText().toString());
				anum[7]=Integer.parseInt(tv[7].getText().toString());

				break;

			case R.id.textView8:
				//Inform the user the button2 has been clicked
				//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
				for(int i=0;i<10;i++)
				{
					int min = 0;
					int max = 99;


					r = new Random();
					int i1 = r.nextInt(max - min + 1) + min;

					if(i1!=anum[0] && i1!=anum[1] ){
						if(i1!=anum[2] && i1!=anum[3] ){
							if(i1!=anum[4] && i1!=anum[5] ){
								if(i1!=anum[6] && i1!=anum[7] ){
									if(i1!=anum[8] && i1!=anum[9] ){
										tv[8].setText(String.valueOf(i1));
										i=10;
									}

								}
							}
						}
					}
				}


				System.out.println("pressed position: 0 value:"+tv[8].getText().toString());
				anum[8]=Integer.parseInt(tv[8].getText().toString());

				break;

			case R.id.textView9:
				//Inform the user the button2 has been clicked
				//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
				for(int i=0;i<10;i++)
				{
					int min = 0;
					int max = 99;


					r = new Random();
					int i1 = r.nextInt(max - min + 1) + min;

					if(i1!=anum[0] && i1!=anum[1] ){
						if(i1!=anum[2] && i1!=anum[3] ){
							if(i1!=anum[4] && i1!=anum[5] ){
								if(i1!=anum[6] && i1!=anum[7] ){
									if(i1!=anum[8] && i1!=anum[9] ){
										tv[9].setText(String.valueOf(i1));
										i=10;
									}

								}
							}
						}
					}
				}


				System.out.println("pressed position: 0 value:"+tv[9].getText().toString());
				anum[9]=Integer.parseInt(tv[9].getText().toString());

				break;

			}
		}
	};


	//        int index = (Integer) v.getTag();
	//        System.out.println("pressed position:" +index+"value:"+tv[index].getText().toString());

	public void initialSetText(){
		for(int i=0;i<10;i++)
		{
			int min = 0;
			int max = 99;


			r = new Random();
			int i1 = r.nextInt(max - min + 1) + min;

			if(i1!=anum[0] && i1!=anum[1] ){
				if(i1!=anum[2] && i1!=anum[3] ){
					if(i1!=anum[4] && i1!=anum[5] ){
						if(i1!=anum[6] && i1!=anum[7] ){
							if(i1!=anum[8] && i1!=anum[9] ){
								tv[i].setText(String.valueOf(i1));
								i=10;
							}

						}
					}
				}
			}
		}


	}
}
