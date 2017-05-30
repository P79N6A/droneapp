package com.baidu.tts.loopj;

import org.a.a.c.e.a;
import org.a.a.n.c;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.protocol.HttpContext;

public class PreemptiveAuthorizationHttpRequestInterceptor implements HttpRequestInterceptor {
    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        AuthState authState = (AuthState) httpContext.getAttribute(a.i);
        CredentialsProvider credentialsProvider = (CredentialsProvider) httpContext.getAttribute(a.g);
        HttpHost httpHost = (HttpHost) httpContext.getAttribute(c.q);
        if (authState.getAuthScheme() == null) {
            Credentials credentials = credentialsProvider.getCredentials(new AuthScope(httpHost.getHostName(), httpHost.getPort()));
            if (credentials != null) {
                authState.setAuthScheme(new BasicScheme());
                authState.setCredentials(credentials);
            }
        }
    }
}
