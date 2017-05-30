package m.framework.ui.widget.asyncview;

import android.graphics.Bitmap;

public class e implements d {
    public static final e a = new e();

    private e() {
    }

    public Bitmap a(a aVar, Bitmap bitmap, String str) {
        return (str == null || str.trim().length() <= 0 || !str.equals(aVar.getUrl())) ? null : bitmap;
    }
}
