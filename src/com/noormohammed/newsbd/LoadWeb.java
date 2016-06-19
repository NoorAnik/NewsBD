package com.noormohammed.newsbd;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.startapp.android.publish.StartAppSDK;
  
public class LoadWeb extends Activity
{
    final Activity activity = this;
    WebView webView;
  
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
    	StartAppSDK.init(this, "209475344", true);
        super.onCreate(savedInstanceState);
        this.getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.activity_load_web);
        webView = (WebView) findViewById(R.id.webView1);
       // webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
    
  
        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress)
            {
                activity.setTitle("Loading.......");
                activity.setProgress(progress * 100);
  
                if(progress == 100)
                    activity.setTitle(R.string.app_name);
            }
        });
  
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl)
            {
                // Handle the error
            }
  
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {
                view.loadUrl(url);
                return true;
            }
        });
         
        String value=getIntent().getExtras().getString("Data");
        webView.loadUrl(value);
        
        
        
    }
    
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
          webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
   
}


