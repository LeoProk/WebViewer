package leoprok.me.webviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import leoprok.me.webviewer.factories.FactoryBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create web view and get the factory with link and javascript enabled
        final WebView webView = (WebView)findViewById(R.id.webView);
        FactoryBuilder.getWebView(webView,this);
        //sets the title of actionbar
        setTitle(R.string.call);
    }
}
