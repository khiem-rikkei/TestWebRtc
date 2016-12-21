package com.example.khiemnv.testcrosswalk;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.widget.Toast;

import org.xwalk.core.XWalkActivity;
import org.xwalk.core.XWalkPreferences;
import org.xwalk.core.XWalkView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends XWalkActivity {
    private XWalkView xWalkWebView;

    private String mBaseUrl = "http://lisa-app.com/webview/";
    private int mPerformerCode;
    private int mVideoMode = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        xWalkWebView = (XWalkView) findViewById(R.id.xwalkWebView);
        // turn on debugging
        XWalkPreferences.setValue(XWalkPreferences.REMOTE_DEBUGGING, true);

    }

    @Override
    protected void onXWalkReady() {

//        xWalkWebView.clearCache(true);

        RkLogger.d("IDK-zzz", "CookieManager.getInstance().acceptCookie()=" + CookieManager.getInstance().acceptCookie());

        mPerformerCode = 4423;
        Toast.makeText(this, "Call 4423", Toast.LENGTH_SHORT).show();
        // Get token for video call
        getWebToken();
    }

    @Override
    protected void onXWalkFailed() {
        super.onXWalkFailed();
        RkLogger.d("IDK-zzz", "failed");
    }

    private void getWebToken() {
        ApiInterface apiService = ApiClientManager.createNewInstance(mBaseUrl).create(ApiInterface.class);
        Call<ApiWebTokenResponse> call = apiService.getWebToken("UFxd9kq0@hime-cas.com", "l3c7QFSn");
        call.enqueue(new Callback<ApiWebTokenResponse>() {
            @Override
            public void onResponse(Call<ApiWebTokenResponse> call, Response<ApiWebTokenResponse> response) {
                if (response == null || response.body() == null) {
                    return;
                }
                ApiWebTokenResponse tokenResponse = response.body();
                String error = tokenResponse.getErrorMessage();
                if (TextUtils.isEmpty(error)) {

                    String token = tokenResponse.getToken();
                    String secret = tokenResponse.getSecretKey();

                    String url = mBaseUrl + Define.WebUrl.CALL_VIDEO;
                    Uri builder = Uri.parse(url)
                            .buildUpon()
                            .appendQueryParameter(Define.Fields.FIELD_TOKEN, token)
                            .appendQueryParameter(Define.Fields.FIELD_SECRET, secret)
                            .appendQueryParameter(Define.Fields.FIELD_PERFORMER_CODE, String.valueOf(mPerformerCode))
                            .appendQueryParameter(Define.Fields.FIELD_MODE, String.valueOf(mVideoMode))
                            .build();
                    RkLogger.d("IDK-zzz", builder.toString());
                    xWalkWebView.setUserAgentString("Mozilla/5.0 (Android 4.4; Mobile; rv:42.0) Gecko/42.0 Firefox/42.0");
//                    xWalkWebView.load(builder.toString(), null);
                }
            }

            @Override
            public void onFailure(Call<ApiWebTokenResponse> call, Throwable t) {
                // Show notice error
            }
        });
    }
}
