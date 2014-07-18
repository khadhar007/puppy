package com.example.imagebutton;

import java.util.Locale;

import android.app.Activity;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.util.Log;
import android.widget.Toast;

public class VoiceCommand extends Activity implements OnInitListener{
	private TextToSpeech tts;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		tts = new TextToSpeech(this, this);
	}
	@Override
	public void onDestroy() {
		// Don't forget to shutdown!
		if (tts != null) {
			tts.stop();
			tts.shutdown();
		}
		super.onDestroy();
	}

	public void onInit(int status) {
		// TODO Auto-generated method stub

		if (status == TextToSpeech.SUCCESS) {

			int result = tts.setLanguage(Locale.US);
			
			if (result == TextToSpeech.LANG_MISSING_DATA
					|| result == TextToSpeech.LANG_NOT_SUPPORTED) {
				Toast.makeText(this, "Language not supported", Toast.LENGTH_LONG).show();
				Log.e("TTS", "Language is not supported");
			} 

		} else {
			Log.e("TTS", "Initilization Failed");
		}

	}
	private void speakOut(String txt) {

		String text = txt;
		if (text.length() == 0) {
			tts.speak("You haven't typed text", TextToSpeech.QUEUE_FLUSH, null);
		} else {
			tts.speak(text, TextToSpeech.QUEUE_FLUSH, null);
		}

	}

}
