package io.github.mhayashi.photogallery;

import android.os.HandlerThread;
import android.util.Log;

/**
 * Created by Masahiro Hayashi on 12/1/14.
 */
public class ThumbnailDownloader<Token> extends HandlerThread {
    private static final String TAG = "ThumbnailDownloader";

    public ThumbnailDownloader() {
        super(TAG);
    }

    public void queueThumbnail(Token token, String url) {
        Log.i(TAG, "Got an URL: " + url);
    }
}
