package org.a.a.j;

import org.apache.http.HttpMessage;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionOutputBuffer;

public interface c<T extends HttpMessage> {
    HttpMessageWriter a(SessionOutputBuffer sessionOutputBuffer);
}
