package com.example.webbrowser

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Web_browser.loadUrl("https://www.google.com/")
        Web_browser.settings.javaScriptEnabled=true
        Web_browser.canGoBack()
    }

    fun search_button_Click(view: View)
    {
        val url = Search_EditText.text.toString()
        Web_browser.loadUrl(url)

    }

    fun back_button_Click(view: View)
    {
        Web_browser.goBack()
    }
}