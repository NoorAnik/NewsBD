package com.noormohammed.newsbd;

import com.startapp.android.publish.StartAppSDK;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class Technology extends Activity {
	
	ImageView pchelpline,techtunes,tunerpage,somewhere;
    MediaPlayer player;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		StartAppSDK.init(this, "209475344", true);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_technology);
		
		pchelpline=(ImageView)findViewById(R.id.pchelpline);
		techtunes=(ImageView)findViewById(R.id.techtunes);
		tunerpage=(ImageView)findViewById(R.id.tunerpage);
     	somewhere=(ImageView)findViewById(R.id.somewhere);
     	
     	player = MediaPlayer.create(this, R.raw.click);
     pchelpline.setOnClickListener(new OnClickListener() {
     				
     				@Override
     				public void onClick(View arg0) {
     					
     					Intent intent=new Intent(Technology.this,LoadWeb.class); 
     					intent.putExtra("Data", "http://pchelplinebd.com/wap/index-wap2.php");
     					startActivity(intent);
     					player.start();
     					Toast.makeText(getApplicationContext(), "Pchelplinebd",Toast.LENGTH_SHORT).show();
     				}
     			});
		
     techtunes.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(Technology.this,LoadWeb.class); 
				intent.putExtra("Data", "http://www.techtunes.com.bd");
				startActivity(intent);
				player.start();
				Toast.makeText(getApplicationContext(), "Techtunes",Toast.LENGTH_SHORT).show();
			}
		});

    tunerpage.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(Technology.this,LoadWeb.class); 
				intent.putExtra("Data", "http://m.tunerpage.com");
				startActivity(intent);
				player.start();
				Toast.makeText(getApplicationContext(), "Tunerpage",Toast.LENGTH_SHORT).show();
				
			}
		});
    
   somewhere.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			
			Intent intent=new Intent(Technology.this,LoadWeb.class); 
			intent.putExtra("Data", "http://m.somewhereinblog.net");
			startActivity(intent);
			player.start();
			Toast.makeText(getApplicationContext(), "Somewherein Blog",Toast.LENGTH_SHORT).show();
			
		}
	});


     
     
	}

	

}
