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

public class Bangla_News extends Activity {

	ImageView p_alo,jugantor,amrdesh,somokal,noya,kalerkonto,jonokonto,bdnews24,azadi,amadrsomoy ;
	MediaPlayer player;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		StartAppSDK.init(this, "209475344", true);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bangla__news);

		p_alo = (ImageView) findViewById(R.id.p_alo);
		jugantor=(ImageView)findViewById(R.id.jugantor);
		kalerkonto=(ImageView)findViewById(R.id.kalerkonto);
		jonokonto=(ImageView)findViewById(R.id.jonokonto);
		bdnews24=(ImageView)findViewById(R.id.bdnews);
		azadi=(ImageView)findViewById(R.id.azadi);
		amadrsomoy=(ImageView)findViewById(R.id.amadrsomoy);
		somokal=(ImageView)findViewById(R.id.somokal);
		noya=(ImageView)findViewById(R.id.noya);
		amrdesh=(ImageView)findViewById(R.id.amardesh);
		
		player = MediaPlayer.create(this, R.raw.click);
	    
	
noya.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(Bangla_News.this,LoadWeb.class); //set destination.
				intent.putExtra("Data", "http://www.dailynayadiganta.com"); //Data : variable,another is msg. use for sending data to another activity.
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Nayadigontho",Toast.LENGTH_SHORT).show();
				player.start();
				
			}
		});

amrdesh.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		
		Intent intent=new Intent(Bangla_News.this,LoadWeb.class); //set destination.
		intent.putExtra("Data", "http://www.amardeshonline.com"); //Data : variable,another is msg. use for sending data to another activity.
		startActivity(intent);
		Toast.makeText(getApplicationContext(), "Amar Desh",Toast.LENGTH_SHORT).show();
		player.start();
	}
});
		
somokal.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(Bangla_News.this,LoadWeb.class); //set destination.
				intent.putExtra("Data", "http://www.shamokal.com"); //Data : variable,another is msg. use for sending data to another activity.
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Shomokal",Toast.LENGTH_SHORT).show();
				player.start();
			}
		});
		
		
amadrsomoy.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(Bangla_News.this,LoadWeb.class); //set destination.
				intent.putExtra("Data", "http://www.amadershomoys.com"); //Data : variable,another is msg. use for sending data to another activity.
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Amader Somoy",Toast.LENGTH_SHORT).show();
				player.start();
			}
		});

azadi.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(Bangla_News.this,LoadWeb.class); //set destination.
				intent.putExtra("Data", "http://www.dainikazadi.org"); //Data : variable,another is msg. use for sending data to another activity.
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Azadi",Toast.LENGTH_SHORT).show();
				player.start();
			}
		});
		
		
bdnews24.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(Bangla_News.this,LoadWeb.class); //set destination.
				intent.putExtra("Data", "http://bangla.bdnews24.com"); //Data : variable,another is msg. use for sending data to another activity.
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Bdnews24",Toast.LENGTH_SHORT).show();
				player.start();
			}
		});
		
kalerkonto.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(Bangla_News.this,LoadWeb.class); //set destination.
				intent.putExtra("Data", "http://www.dailykalerkantho.com"); //Data : variable,another is msg. use for sending data to another activity.
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Kaler khonto",Toast.LENGTH_SHORT).show();
				player.start();
			}
		});

jonokonto.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		
		Intent intent=new Intent(Bangla_News.this,LoadWeb.class); //set destination.
		intent.putExtra("Data", "http://www.dailyjanakantha.com"); //Data : variable,another is msg. use for sending data to another activity.
		startActivity(intent);
		Toast.makeText(getApplicationContext(), "Janokonto",Toast.LENGTH_SHORT).show();
		player.start();
	}
});

		
		p_alo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(Bangla_News.this,LoadWeb.class); //set destination.
				intent.putExtra("Data", "http://m.prothom-alo.com"); //Data : variable,another is msg. use for sending data to another activity.
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Prothom Alo",Toast.LENGTH_SHORT).show();
				player.start();
			}
		});

		
        jugantor.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(Bangla_News.this,LoadWeb.class); //set destination.
				intent.putExtra("Data", "http://www.jugantor.com"); 
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Jugantor",Toast.LENGTH_SHORT).show();
				player.start();
			}
		});

	
	}

	
	
}
	

