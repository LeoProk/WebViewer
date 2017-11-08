package leoprok.me.webviewer.factories;

import android.content.Context;
import android.webkit.WebView;

import leoprok.me.webviewer.interfaces.FactoryInterface;

/**
 * Factory for app specifics
 */

public class FactoryBuilder {
    public static FactoryInterface getWebView(WebView webView, Context context){
        return new WebLoader(webView,context);
    }
}
