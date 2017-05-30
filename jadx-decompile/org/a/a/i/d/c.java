package org.a.a.i.d;

import java.util.Date;
import org.apache.http.cookie.SetCookie2;

@org.a.a.a.c
public class c extends d implements SetCookie2 {
    private static final long serialVersionUID = -7744598295706617057L;
    private String a;
    private int[] b;
    private boolean c;

    public c(String str, String str2) {
        super(str, str2);
    }

    public Object clone() {
        c cVar = (c) super.clone();
        if (this.b != null) {
            cVar.b = (int[]) this.b.clone();
        }
        return cVar;
    }

    public String getCommentURL() {
        return this.a;
    }

    public int[] getPorts() {
        return this.b;
    }

    public boolean isExpired(Date date) {
        return this.c || super.isExpired(date);
    }

    public boolean isPersistent() {
        return !this.c && super.isPersistent();
    }

    public void setCommentURL(String str) {
        this.a = str;
    }

    public void setDiscard(boolean z) {
        this.c = z;
    }

    public void setPorts(int[] iArr) {
        this.b = iArr;
    }
}
