package org.a.a.j;

import org.a.a.e.c;
import org.apache.http.HttpMessage;
import org.apache.http.io.HttpMessageParser;
import org.apache.http.io.SessionInputBuffer;

public interface b<T extends HttpMessage> {
    HttpMessageParser a(SessionInputBuffer sessionInputBuffer, c cVar);
}
