package it.a.a.b;

import it.a.a.t;
import java.util.ArrayList;

public class b implements t {
    private ArrayList a = new ArrayList();

    public b(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof String) {
                b((String) obj);
            }
        }
    }

    public b(String[] strArr) {
        for (String b : strArr) {
            b(b);
        }
    }

    public boolean a(String str) {
        boolean contains;
        synchronized (this.a) {
            contains = this.a.contains(str);
        }
        return contains;
    }

    public void b(String str) {
        synchronized (this.a) {
            this.a.add(str.toLowerCase());
        }
    }

    public String[] b() {
        String[] strArr;
        synchronized (this.a) {
            int size = this.a.size();
            strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = (String) this.a.get(i);
            }
        }
        return strArr;
    }

    public void c(String str) {
        synchronized (this.a) {
            this.a.remove(str.toLowerCase());
        }
    }
}
