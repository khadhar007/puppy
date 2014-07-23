package com.example.imagebutton;

import java.util.Locale;
import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class PlayScreenActivity extends Activity implements OnInitListener{
	//TTS object
		private TextToSpeech myTTS;
		//status check code
		private int MY_DATA_CHECK_CODE = 0;

		final Handler handler = new Handler();
		static int clickvalue;
		TextView[] tv = new TextView[10];
		static int[] anum =new int[10];
		public int flag=0;
		public static int index;
		public Random r;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_play_screen);
		//check for TTS data
				Intent checkTTSIntent = new Intent();
				checkTTSIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
				startActivityForResult(checkTTSIntent, MY_DATA_CHECK_CODE);


				tv[0]=(TextView)findViewById(R.id.TextView0);
				tv[1]=(TextView)findViewById(R.id.TextView1);
				tv[2]=(TextView)findViewById(R.id.TextView2);
				tv[3]=(TextView)findViewById(R.id.TextView3);
				tv[4]=(TextView)findViewById(R.id.TextView4);
				tv[5]=(TextView)findViewById(R.id.TextView5);
				tv[6]=(TextView)findViewById(R.id.TextView6);
				tv[7]=(TextView)findViewById(R.id.TextView7);
				tv[8]=(TextView)findViewById(R.id.TextView8);
				tv[9]=(TextView)findViewById(R.id.TextView9);
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
					setVoiceCmd();
					flag=1;
				}


			}
			final OnClickListener mGlobal_OnClickListener = new OnClickListener() {
				public void onClick(final View v) {
					switch(v.getId()) {
					case R.id.TextView0:
						//Inform the user the button1 has been clicked
						// Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show(); 
						
						if(clickvalue==Integer.parseInt(tv[0].getText().toString()))
						{
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
												System.out.println("pressed position: 0 value:"+tv[0].getText().toString());
												anum[0]=Integer.parseInt(tv[0].getText().toString());
												
												i=10;
											}

										}
									}
								}
							}
						}

						setVoiceCmd();
						
						}
						else
						{
							speakWords("please click a correct number");
						}
						break;

					case R.id.TextView1:
						//Inform the user the button2 has been clicked
						//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show(); 
						if(clickvalue==Integer.parseInt(tv[1].getText().toString()))
						{
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
												System.out.println("pressed position: 0 value:"+tv[1].getText().toString());
												anum[1]=Integer.parseInt(tv[1].getText().toString());
												
												i=10;
											}

										}
									}
								}
							}
						}

						setVoiceCmd();
						
						}
						else
						{
							speakWords("please click a correct number");
						}
						break;

					case R.id.TextView2:
						//Inform the user the button2 has been clicked
						//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
						if(clickvalue==Integer.parseInt(tv[2].getText().toString()))
						{
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
												System.out.println("pressed position: 0 value:"+tv[2].getText().toString());
												anum[2]=Integer.parseInt(tv[2].getText().toString());
												
												i=10;
											}

										}
									}
								}
							}
						}

						setVoiceCmd();
						
						}
						else
						{
							speakWords("please click a correct number");
						}
						break;

					case R.id.TextView3:
						//Inform the user the button2 has been clicked
						//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
						if(clickvalue==Integer.parseInt(tv[3].getText().toString()))
						{
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
												System.out.println("pressed position: 0 value:"+tv[3].getText().toString());
												anum[3]=Integer.parseInt(tv[3].getText().toString());
												
												i=10;
											}

										}
									}
								}
							}
						}
						setVoiceCmd();

				
					}
						else
						{
							speakWords("please click a correct number");
						}
						
						break;

					case R.id.TextView4:
						//Inform the user the button2 has been clicked
						//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
						if(clickvalue==Integer.parseInt(tv[4].getText().toString()))
						{
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
												System.out.println("pressed position: 0 value:"+tv[4].getText().toString());
												anum[4]=Integer.parseInt(tv[4].getText().toString());
												
												i=10;
											}

										}
									}
								}
							}
						}

						setVoiceCmd();
						
				}
				else
				{
					speakWords("please click a correct number");
				}

						break;

					case R.id.TextView5:
						//Inform the user the button2 has been clicked
						//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();  
						if(clickvalue==Integer.parseInt(tv[5].getText().toString()))
						{
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
												System.out.println("pressed position: 0 value:"+tv[5].getText().toString());
												anum[5]=Integer.parseInt(tv[5].getText().toString());
											
												i=10;
											}

										}
									}
								}
							}
						}

						setVoiceCmd();

			}
			else
			{
				speakWords("please click a correct number");
			}
						break;

					case R.id.TextView6:
						//Inform the user the button2 has been clicked
						//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
						if(clickvalue==Integer.parseInt(tv[6].getText().toString()))
						{
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
												System.out.println("pressed position: 0 value:"+tv[6].getText().toString());
												anum[6]=Integer.parseInt(tv[6].getText().toString());
												
												i=10;
											}

										}
									}
								}
							}
						}
						setVoiceCmd();


		}
		else
		{
			speakWords("please click a correct number");
		}
						break;

					case R.id.TextView7:
						//Inform the user the button2 has been clicked
						//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
						if(clickvalue==Integer.parseInt(tv[7].getText().toString()))
						{
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
												System.out.println("pressed position: 0 value:"+tv[7].getText().toString());
												anum[7]=Integer.parseInt(tv[7].getText().toString());
												setVoiceCmd();
												i=10;
											}

										}
									}
								}
							}
						}

						setVoiceCmd();
					}
					else
					{
						speakWords("please click a correct number");
					}
						break;

					case R.id.TextView8:
						//Inform the user the button2 has been clicked
						//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
						if(clickvalue==Integer.parseInt(tv[8].getText().toString()))
						{
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
												System.out.println("pressed position: 0 value:"+tv[8].getText().toString());
												anum[8]=Integer.parseInt(tv[8].getText().toString());
												
												i=10;
											}

										}
									}
								}
							}
						}

						setVoiceCmd();
						
					}
					else
					{
						speakWords("please click a correct number");
					}
						break;

					case R.id.TextView9:
						//Inform the user the button2 has been clicked
						//Toast.makeText(this, "textView clicked.", Toast.LENGTH_SHORT).show();   
						if(clickvalue==Integer.parseInt(tv[9].getText().toString()))
						{
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
												System.out.println("pressed position: 0 value:"+tv[9].getText().toString());
												anum[9]=Integer.parseInt(tv[9].getText().toString());
												
												
												i=10;
											}

										}
									}
								}
							}
						}

						setVoiceCmd();
						
					}
					else
					{
						speakWords("please click a correct number");
					}
						break;

					}
				}
			};


			//        int index = (Integer) v.getTag();
			//        System.out.println("pressed position:" +index+"value:"+tv[index].getText().toString());

			public void initialSetText(){
				for(int i=0;i<10;i++)
				{
					for(int j=0;j<10;j++){
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
										anum[i]=i1;
										j=10;
									}
									}

								}
							}
						}
					}
				}


			}
			
			public void setVoiceCmd()
			{
				
				handler.postDelayed(new Runnable() {
				    @Override
				    public void run() {
				    	
				        // Do something after 5s = 5000ms
				    	int min = 0;
						int max = 9;


						r = new Random();
						int i2 = r.nextInt(max - min + 1) + min;
						System.out.println("number is: "+i2+" word to speak is:"+anum[i2]);
						speakWords("press "+anum[i2]);
						clickvalue=anum[i2];
				        
				    }
				}, 1000);
				
				
				
			}
			//speak the user text
			public void speakWords(String speech) {

				//speak straight away
				myTTS.speak(speech, TextToSpeech.QUEUE_FLUSH, null);
			}

			//act on result of TTS data check
			protected void onActivityResult(int requestCode, int resultCode, Intent data) {

				if (requestCode == MY_DATA_CHECK_CODE) {
					if (resultCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS) {
						//the user has the necessary data - create the TTS
						myTTS = new TextToSpeech(this, this);
					}
					else {
						//no data - install it now
						Intent installTTSIntent = new Intent();
						installTTSIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
						startActivity(installTTSIntent);
					}
				}
			}

			//setup TTS
			public void onInit(int initStatus) {

				//check for successful instantiation
				if (initStatus == TextToSpeech.SUCCESS) {
					if(myTTS.isLanguageAvailable(Locale.US)==TextToSpeech.LANG_AVAILABLE)
						myTTS.setLanguage(Locale.US);
					myTTS.setSpeechRate(0.5f);
				}
				else if (initStatus == TextToSpeech.ERROR) {
					Toast.makeText(this, "Sorry! Text To Speech failed...", Toast.LENGTH_LONG).show();
				}
			}
}
