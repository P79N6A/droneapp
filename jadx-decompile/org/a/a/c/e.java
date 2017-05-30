package org.a.a.c;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

public interface e {
    boolean a(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext);

    HttpUriRequest b(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext);
}
