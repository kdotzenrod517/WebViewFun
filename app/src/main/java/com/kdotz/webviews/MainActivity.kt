package com.kdotz.webviews

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webView)

        webView.settings.javaScriptEnabled

        webView.webViewClient = WebViewClient()

//        webView.loadUrl("https://www.google.com")

        webView.loadData("<html><body><h1>Hello World</h1><p>This is my cool website</p></body></html>", "text/html", "UTF-8")

    }
}
