package com.noormohammed.newsbd;

import com.startapp.android.publish.StartAppSDK;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AboutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		StartAppSDK.init(this, "209475344", true);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
	}

	
}
