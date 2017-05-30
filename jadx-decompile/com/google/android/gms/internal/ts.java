package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.tv.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@aaa
public class ts {
    private final int a;
    private final int b;
    private final int c;
    private final tr d = new tu();

    public ts(int i) {
        this.b = i;
        this.a = 6;
        this.c = 0;
    }

    a a() {
        return new a();
    }

    String a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        a a = a();
        PriorityQueue priorityQueue = new PriorityQueue(this.b, new 1(this));
        for (String b : split) {
            String[] b2 = tt.b(b);
            if (b2.length != 0) {
                tv.a(b2, this.b, this.a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                a.a(this.d.a(((a) it.next()).b));
            } catch (Throwable e) {
                b.b("Error while writing hash to byteStream", e);
            }
        }
        return a.toString();
    }

    public String a(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((String) it.next()).toLowerCase(Locale.US));
            stringBuffer.append('\n');
        }
        return a(stringBuffer.toString());
    }
}
