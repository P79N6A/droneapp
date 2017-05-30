package com.google.android.gms.ads.internal.util.client;

import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.util.client.a.a;
import com.google.android.gms.internal.aaa;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@aaa
public class c implements a {
    @Nullable
    private final String a;

    public c() {
        this(null);
    }

    public c(@Nullable String str) {
        this.a = str;
    }

    @WorkerThread
    public void a(String str) {
        HttpURLConnection httpURLConnection;
        String valueOf;
        try {
            String str2 = "Pinging URL: ";
            valueOf = String.valueOf(str);
            b.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            ac.a().a(true, httpURLConnection, this.a);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                b.d(new StringBuilder(String.valueOf(str).length() + 65).append("Received non-success response code ").append(responseCode).append(" from pinging URL: ").append(str).toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            valueOf = String.valueOf(e.getMessage());
            b.d(new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(valueOf).length()).append("Error while parsing ping URL: ").append(str).append(". ").append(valueOf).toString());
        } catch (IOException e2) {
            valueOf = String.valueOf(e2.getMessage());
            b.d(new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(valueOf).length()).append("Error while pinging URL: ").append(str).append(". ").append(valueOf).toString());
        } catch (RuntimeException e3) {
            valueOf = String.valueOf(e3.getMessage());
            b.d(new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(valueOf).length()).append("Error while pinging URL: ").append(str).append(". ").append(valueOf).toString());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }
}
