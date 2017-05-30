package org.a.a.i.b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.a.a.a.a;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieIdentityComparator;

@org.a.a.a.d
public class d implements Serializable, CookieStore {
    private static final long serialVersionUID = -7581093305228232025L;
    @a(a = "this")
    private final TreeSet<Cookie> a = new TreeSet(new CookieIdentityComparator());

    public synchronized void a(Cookie[] cookieArr) {
        if (cookieArr != null) {
            for (Cookie addCookie : cookieArr) {
                addCookie(addCookie);
            }
        }
    }

    public synchronized void addCookie(Cookie cookie) {
        if (cookie != null) {
            this.a.remove(cookie);
            if (!cookie.isExpired(new Date())) {
                this.a.add(cookie);
            }
        }
    }

    public synchronized void clear() {
        this.a.clear();
    }

    public synchronized boolean clearExpired(Date date) {
        boolean z = false;
        synchronized (this) {
            if (date != null) {
                Iterator it = this.a.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    if (((Cookie) it.next()).isExpired(date)) {
                        it.remove();
                        z2 = true;
                    }
                }
                z = z2;
            }
        }
        return z;
    }

    public synchronized List<Cookie> getCookies() {
        return new ArrayList(this.a);
    }

    public synchronized String toString() {
        return this.a.toString();
    }
}
