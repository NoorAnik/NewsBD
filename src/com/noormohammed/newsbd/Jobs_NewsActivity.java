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

public class Jobs_NewsActivity extends Activity {

	ImageView plaoJobs,bdJobs,ctgJobs,azadiJobs;
	MediaPlayer player;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		StartAppSDK.init(this, "209475344", true);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jobs__news);
		
		plaoJobs=(ImageView)findViewById(R.id.palojobs);
		bdJobs=(ImageView)findViewById(R.id.bdjobs);
		ctgJobs=(ImageView)findViewById(R.id.jobsctg);
		azadiJobs=(ImageView)findViewById(R.id.azadijobs);
		
		player = MediaPlayer.create(this, R.raw.click);
		  

		azadiJobs.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(Jobs_NewsActivity.this,LoadWeb.class); 
				intent.putExtra("Data", "http://azadijobs.com"); 
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Azadi Jobs",Toast.LENGTH_SHORT).show();
				player.start();
				
			}
		});

		ctgJobs.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent=new Intent(Jobs_NewsActivity.this,LoadWeb.class); 
				intent.putExtra("Data", "http://www.jobsctg.com"); 
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Jobs Ctg",Toast.LENGTH_SHORT).show();
				player.start();
				
			}
		});



		bdJobs.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						
						Intent intent=new Intent(Jobs_NewsActivity.this,LoadWeb.class); 
						intent.putExtra("Data", "http://www.bdjobs.com"); 
						Toast.makeText(getApplicationContext(), "Bdjobs",Toast.LENGTH_SHORT).show();
						startActivity(intent);
						player.start();
						
					}
				});

		
		plaoJobs.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						
						Intent intent=new Intent(Jobs_NewsActivity.this,LoadWeb.class); 
						intent.putExtra("Data", "http://prothom-alojobs.com"); 
						startActivity(intent);
						Toast.makeText(getApplicationContext(), "Prothom Alo Jobs",Toast.LENGTH_SHORT).show();
						player.start();
						
					}
				});
		
	}

	
}
