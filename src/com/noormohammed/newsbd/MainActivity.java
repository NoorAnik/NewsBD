package com.noormohammed.newsbd;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

	ImageView banglaNews,about, englishNews, jobsNews, techonolgyBlog;
     MediaPlayer player;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		banglaNews = (ImageView) findViewById(R.id.bnews);
	    englishNews = (ImageView) findViewById(R.id.englishnews);
	    jobsNews=(ImageView) findViewById(R.id.jobsnews);
	    techonolgyBlog=(ImageView) findViewById(R.id.technonews);
        about=(ImageView)findViewById(R.id.about);
        
    	player = MediaPlayer.create(this, R.raw.click);
	    
        about.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(MainActivity.this, AboutActivity.class);
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "About",Toast.LENGTH_SHORT).show();
				player.start();

			}
		});
        
	    techonolgyBlog.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(MainActivity.this, Technology.class);
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Technology Blogs",Toast.LENGTH_SHORT).show();
				player.start();

			}
		});
	    
	    
        jobsNews.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(MainActivity.this, Jobs_NewsActivity.class);
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Jobs Newspaper",Toast.LENGTH_SHORT).show();
				player.start();

			}
		});
	    
		banglaNews.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(MainActivity.this, Bangla_News.class);
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "Bangla Newspaper",Toast.LENGTH_SHORT).show();
				player.start();

			}
		});

		englishNews.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(MainActivity.this,
						EnglishActivity.class);
				startActivity(intent);
				Toast.makeText(getApplicationContext(), "English Newspaper",Toast.LENGTH_SHORT).show();
				player.start();

			}
		});
	}

}
