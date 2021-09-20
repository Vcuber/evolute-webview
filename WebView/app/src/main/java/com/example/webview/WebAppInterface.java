package com.example.webview;

import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;

public class WebAppInterface {
    Context mContext;
    String data;

    WebAppInterface(Context ctx) {
        this.mContext = ctx;
    }

    @JavascriptInterface
    public void sendData(String data) {
        this.data = data;
        Log.d("data", data);
    }
}
