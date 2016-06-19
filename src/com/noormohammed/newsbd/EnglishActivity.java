package com.noormohammed.newsbd;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

import com.startapp.android.publish.StartAppSDK;

public class EnglishActivity extends Activity {
	
	ImageView dailystar,finex,sun,edaily,independent,newage,newnation,energy;
    MediaPlayer player;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		StartAppSDK.init(this, "209475344", true);
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_english);
		
		dailystar=(ImageView)findViewById(R.id.dailystar);
		sun=(ImageView)findViewById(R.id.sun);
		finex=(ImageView)findViewById(R.id.finex);
		independent=(ImageView)findViewById(R.id.independent);
		newage=(ImageView)findViewById(R.id.newage);
		newnation=(ImageView)findViewById(R.id.newnation);
		edaily=(ImageView)findViewById(R.id.edaily);
		energy=(ImageView)findViewById(R.id.energy);
		
		player = MediaPlayer.create(this, R.raw.click);

	edaily.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(EnglishActivity.this,LoadWeb.class); 
				intent.putExtra("Data", "http://www.edailystar.com"); 
				startActivity(intent);
				player.start();
				Toast.makeText(getApplicationContext(), "eDaily",Toast.LENGTH_SHORT).show();
				
			}
		});
		

		energy.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(EnglishActivity.this,LoadWeb.class); 
				intent.putExtra("Data", "http://www.energybangla.com"); 
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Energy Bangla",Toast.LENGTH_SHORT).show();
				player.start();
				
			}
		});

	newage.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(EnglishActivity.this,LoadWeb.class); 
				intent.putExtra("Data", "http://newagebd.com"); 
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "New Age",Toast.LENGTH_SHORT).show();
				player.start();
				
			}
		});
		

	newnation.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(EnglishActivity.this,LoadWeb.class); 
				intent.putExtra("Data", "http://www.thenewnationbd.com"); 
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "New Nation",Toast.LENGTH_SHORT).show();
				player.start();
				
			}
		});
		
		finex.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(EnglishActivity.this,LoadWeb.class); 
				intent.putExtra("Data", "http://www.thefinancialexpress-bd.com"); 
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Financial Express",Toast.LENGTH_SHORT).show();
				player.start();
				
			}
		});
		

	independent.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(EnglishActivity.this,LoadWeb.class); 
				intent.putExtra("Data", "http://www.theindependentbd.com"); 
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Independent",Toast.LENGTH_SHORT).show();
				player.start();
				
			}
		});
		
		
		sun.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(EnglishActivity.this,LoadWeb.class); 
				intent.putExtra("Data", "http://www.daily-sun.com"); 
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Daily Sun",Toast.LENGTH_SHORT).show();
				player.start();
				
			}
		});

dailystar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(EnglishActivity.this,LoadWeb.class); 
				intent.putExtra("Data", "http://www.thedailystar.net"); 
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Daily Star",Toast.LENGTH_SHORT).show();
				player.start();
				
			}
		});
		
	}

	

}
