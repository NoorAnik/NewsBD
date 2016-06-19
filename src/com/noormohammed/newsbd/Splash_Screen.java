package com.noormohammed.newsbd;


import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class Splash_Screen extends Activity {
	
	private static int SplashTimeOut=3000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash__screen);
		
		//Post delayed for main activity
				new Handler().postDelayed(new Runnable() {
					
					@Override
					public void run() {
						
						//After 3 seconds ,start this activity
					Intent intent=new Intent(Splash_Screen.this,MainActivity.class);
					startActivity(intent);
					
					//closing this activity.
					finish();
						
					}
				}, SplashTimeOut);
	}

	
}
