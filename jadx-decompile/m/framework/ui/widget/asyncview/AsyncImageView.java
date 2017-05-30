package m.framework.ui.widget.asyncview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler.Callback;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.fimi.kernel.a;
import java.util.Random;
import m.framework.b.e;
import m.framework.b.f;

public class AsyncImageView extends ImageView implements Callback, a, b {
    public static final int a = 17170445;
    private static Bitmap b = null;
    private static final int c = 1;
    private static final Random d = new Random();
    private static String e;
    private String f;
    private int g;
    private d h;

    public AsyncImageView(Context context) {
        super(context);
        a(context);
    }

    public AsyncImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public AsyncImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private Bitmap a(int i) {
        switch (i) {
            case a /*17170445*/:
                if (b == null) {
                    b = BitmapFactory.decodeResource(getResources(), a);
                }
                return b;
            default:
                return BitmapFactory.decodeResource(getResources(), i);
        }
    }

    private void a(Context context) {
        e.a();
        if (TextUtils.isEmpty(e)) {
            e = f.a(getContext(), a.b);
        }
        c.a(e);
        setOnImageGotListener(e.a);
    }

    public void a(String str) {
        a(str, 0);
    }

    public void a(String str, int i) {
        this.f = str;
        this.g = i;
        if (f.a(str)) {
            setImageResource(i);
            return;
        }
        Bitmap b = c.b(str);
        if (b == null || b.isRecycled()) {
            if (i > 0) {
                setImageBitmap(a(i));
            }
            c.a(str, this);
            return;
        }
        setImageBitmap(b);
    }

    public void a(String str, Bitmap bitmap) {
        if (this.h != null) {
            bitmap = this.h.a(this, bitmap, str);
        }
        Message message = new Message();
        message.what = 1;
        message.obj = new Object[]{str, bitmap};
        e.a(message, (long) d.nextInt(300), (Callback) this);
    }

    public String getUrl() {
        return this.f;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            Object obj = ((Object[]) message.obj)[0];
            Object obj2 = ((Object[]) message.obj)[1];
            if (obj2 == null || obj == null || !obj.equals(this.f)) {
                setImageResource(this.g);
            } else {
                setImageBitmap((Bitmap) obj2);
            }
        }
        return false;
    }

    public void setOnImageGotListener(d dVar) {
        this.h = dVar;
    }
}
