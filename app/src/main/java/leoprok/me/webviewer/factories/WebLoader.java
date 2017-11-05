package leoprok.me.webviewer.factories;

import android.content.Context;
import android.webkit.WebView;

import leoprok.me.webviewer.R;
import leoprok.me.webviewer.interfaces.FactoryInterface;

/**
 * Created by Leo on 11/5/2017.
 */
public class WebLoader implements FactoryInterface {

    private WebView mWebView;
    private Context mContext;

    public WebLoader (WebView webView, Context context){
        mWebView = webView;
        mContext = context;
    }

    @Override
    public Object doTask() {
        mWebView.findViewById(R.id.webView);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl(mContext.getString(R.string.web_site));
        return null;
    }
}
