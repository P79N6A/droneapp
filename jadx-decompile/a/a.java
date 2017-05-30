package a;

import java.util.ArrayList;
import java.util.List;

public class a extends Exception {
    private static final long serialVersionUID = 1;
    private Throwable[] a;

    public a(String str, Throwable[] thArr) {
        Throwable th = (thArr == null || thArr.length <= 0) ? null : thArr[0];
        super(str, th);
        if (thArr == null || thArr.length <= 0) {
            thArr = null;
        }
        this.a = thArr;
    }

    @Deprecated
    public a(List<Exception> list) {
        this("There were multiple errors.", (Throwable[]) list.toArray(new Exception[list.size()]));
    }

    @Deprecated
    public List<Exception> a() {
        List<Exception> arrayList = new ArrayList();
        if (this.a == null) {
            return arrayList;
        }
        for (Throwable th : this.a) {
            if (th instanceof Exception) {
                arrayList.add((Exception) th);
            } else {
                arrayList.add(new Exception(th));
            }
        }
        return arrayList;
    }

    public Throwable[] b() {
        return this.a;
    }
}
