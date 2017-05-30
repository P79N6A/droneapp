package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.NetworkFetcher.Callback;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.a.a.e;

public class HttpUrlConnectionNetworkFetcher extends BaseNetworkFetcher<FetchState> {
    private static final int NUM_NETWORK_THREADS = 3;
    private final ExecutorService mExecutorService = Executors.newFixedThreadPool(3);

    public FetchState createFetchState(Consumer<EncodedImage> consumer, ProducerContext producerContext) {
        return new FetchState(consumer, producerContext);
    }

    public void fetch(final FetchState fetchState, final Callback callback) {
        final Future submit = this.mExecutorService.submit(new Runnable() {
            public void run() {
                HttpURLConnection httpURLConnection;
                Throwable th;
                String scheme = fetchState.getUri().getScheme();
                String uri = fetchState.getUri().toString();
                Object obj = scheme;
                HttpURLConnection httpURLConnection2 = null;
                while (true) {
                    try {
                        httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                        try {
                            scheme = httpURLConnection.getHeaderField(e.H);
                            String scheme2 = scheme == null ? null : Uri.parse(scheme).getScheme();
                            if (scheme == null || scheme2.equals(r2)) {
                                callback.onResponse(httpURLConnection.getInputStream(), -1);
                            } else {
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                String str = scheme2;
                                String str2 = scheme;
                                httpURLConnection2 = httpURLConnection;
                                uri = str2;
                            }
                        } catch (Throwable e) {
                            Throwable th2 = e;
                            httpURLConnection2 = httpURLConnection;
                            th = th2;
                        } catch (Throwable e2) {
                            th2 = e2;
                            httpURLConnection2 = httpURLConnection;
                            th = th2;
                        }
                    } catch (Exception e3) {
                        th = e3;
                    }
                }
                callback.onResponse(httpURLConnection.getInputStream(), -1);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    return;
                }
                return;
                try {
                    callback.onFailure(th);
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    throw th;
                }
            }
        });
        fetchState.getContext().addCallbacks(new BaseProducerContextCallbacks() {
            public void onCancellationRequested() {
                if (submit.cancel(false)) {
                    callback.onCancellation();
                }
            }
        });
    }
}
