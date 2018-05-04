package edu.fjnu.cse.mybrower;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data == null) {
            String url = "http://www.baidu.com";
            data = Uri.parse(url);
        }
            WebView webView = (WebView) findViewById(R.id.web_view);
            WebSettings setting = webView.getSettings();
            setting.setJavaScriptEnabled(true);
            webView.loadUrl(data.toString());
            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    return true;
                }
            });

        }
}
