package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.webkit.*;
import android.util.*;
import android.view.*;

public class MainActivity extends Activity 
{   
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		WebView myWebView = (WebView) findViewById(R.id.webview);
		WebSettings webSettings = myWebView.getSettings();
		webSettings.setAllowFileAccess(true);
		webSettings.setJavaScriptEnabled(true);
		myWebView.addJavascriptInterface(new WebAppInterface(this), "Android");
		myWebView.loadUrl("file:///android_asset/gameUi.html");
		
    }
}
	
	


