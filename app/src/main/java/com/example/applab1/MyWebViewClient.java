package com.example.applab1;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class MyWebViewClient extends WebViewClient {
    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        // TODO Auto-generated method stub
        super.onPageStarted(view, url, favicon);
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        // TODO Auto-generated method stub

        view.loadUrl(url);
        return true;

    }

    @Override
    public void onPageFinished(WebView view, String url) {
        // TODO Auto-generated method stub
        super.onPageFinished(view, url);

        //progressBar.setVisibility(View.GONE);
    }
//    @Override
//    public boolean shouldOverrideUrlLoading(WebView view, String url) {
////       Uri uri = Uri.parse(url);
////        if (uri.getHost() != null && uri.getHost().contains("code.org")) {
////            return false;
////        }
//
//        if(Uri.parse(url).getHost().length() == 0) {
//            return false;
//        }
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//        view.getContext().startActivity(intent);
//        return true;
////        view.loadUrl(url);
// //       return true;
////        return false;
//
//    }
}
