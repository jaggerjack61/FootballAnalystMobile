package com.example.football

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast

class WebviewActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        val webView=findViewById<WebView>(R.id.web_view)
        webView.settings.setJavaScriptEnabled(true)

        webView.webViewClient = object : WebViewClient() {
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
        val curl=intent.getStringExtra("url")
        if (curl != null) {
            Toast.makeText(this, curl, Toast.LENGTH_SHORT).show()
            webView.loadUrl(curl)

        }else{
            Toast.makeText(this, "null", Toast.LENGTH_SHORT).show()
        }
    }
       // webView.loadUrl("http://google.com")


}