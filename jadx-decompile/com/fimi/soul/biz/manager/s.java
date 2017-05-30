package com.fimi.soul.biz.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.fimi.kernel.utils.x;
import com.fimi.soul.biz.m.e;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.FdsMsg;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.SuggestBean;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class s extends j {
    public ArrayList<Bitmap> g = new ArrayList();
    private Context h;

    public s(Context context) {
        super(context);
        this.h = context;
    }

    public PlaneMsg a(final SuggestBean suggestBean, final k kVar) {
        this.f.put(Integer.valueOf(1), kVar);
        f a = f.a(this.h);
        Log.i("bitmapList size is ", this.g.size() + "");
        if (this.g == null || this.g.size() <= 0 || "0".equals(suggestBean.getUserID())) {
            x.b(new a(this, 1, suggestBean, kVar));
        } else {
            final int size = this.g.size();
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                Bitmap bitmap = (Bitmap) it.next();
                a.a(bitmap, new e(this) {
                    final /* synthetic */ s d;

                    public void a(long j, long j2, String str) {
                    }

                    public void a(PlaneMsg planeMsg, File file) {
                        if (planeMsg.isSuccess()) {
                            suggestBean.getList().add(((FdsMsg) planeMsg.getData()).getUrl());
                            if (suggestBean.getList().size() == size) {
                                x.b(new a(this.d, 1, suggestBean, kVar));
                                return;
                            }
                            return;
                        }
                        Log.i("suguest fds :", "false");
                    }
                });
                if (bitmap != null && bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        }
        return this.e;
    }

    public void a(Bitmap bitmap) {
        this.g.add(bitmap);
    }

    public ArrayList<Bitmap> b() {
        return this.g;
    }
}
