package org.a.a.b;

import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.Credentials;
import org.apache.http.protocol.HttpContext;

public interface f extends AuthScheme {
    Header a(Credentials credentials, HttpRequest httpRequest, HttpContext httpContext);
}
