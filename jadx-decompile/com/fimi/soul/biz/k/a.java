package com.fimi.soul.biz.k;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Point;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import com.fimi.kernel.utils.x;
import com.fimi.overseas.soul.R;
import com.fimi.soul.entity.DynamicDYZ_Entity;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.y;
import com.fimi.soul.utils.z;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.c;
import com.tencent.open.yyb.TitleBar;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class a {
    final List<LatLng> a = new ArrayList();
    Handler b = new Handler(this) {
        final /* synthetic */ a a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 100) {
                try {
                    if (this.a.e.a().b < TitleBar.SHAREBTN_RIGHT_MARGIN) {
                        for (c a : this.a.f) {
                            a.a();
                        }
                        this.a.f.clear();
                        this.a.a.clear();
                    }
                    LatLng a2 = this.a.e.n().a(new Point(0, 0));
                    LatLng latLng = this.a.e.a().a;
                    if (latLng != null) {
                        double a3 = y.c(a2, latLng).a();
                        if (a3 < 20000.0d) {
                            a3 = 20000.0d;
                        }
                        a3 /= 111000.0d;
                        if (this.a.d != null) {
                            Cursor rawQuery = this.a.d.rawQuery("SELECT LAT,LON,CLASS from dmz_tb where LAT > " + (latLng.a - a3) + " and LAT <" + (latLng.a + a3) + " and LON >" + (latLng.b - a3) + " and LON < " + (a3 + latLng.b), null);
                            if (rawQuery != null && rawQuery.getCount() > 0) {
                                while (rawQuery.moveToNext()) {
                                    byte b = (byte) rawQuery.getInt(rawQuery.getColumnIndex("CLASS"));
                                    int i = b & 3;
                                    int i2 = ((b & 63) + 1) * 1000;
                                    this.a.a(new LatLng((double) rawQuery.getFloat(rawQuery.getColumnIndex("LAT")), (double) rawQuery.getFloat(rawQuery.getColumnIndex("LON"))), i2, this.a.g);
                                }
                            }
                            if (rawQuery != null) {
                                rawQuery.close();
                            }
                        }
                        if (this.a.j != null && this.a.j.size() > 0) {
                            for (DynamicDYZ_Entity dynamicDYZ_Entity : this.a.j) {
                                this.a.a(new LatLng(dynamicDYZ_Entity.getLatitude(), dynamicDYZ_Entity.getLogitude()), dynamicDYZ_Entity.getRadius(), this.a.h);
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    };
    private AsyncTask c;
    private SQLiteDatabase d;
    private com.google.android.gms.maps.c e;
    private List<c> f;
    private CircleOptions g;
    private CircleOptions h;
    private ExecutorService i;
    private List<DynamicDYZ_Entity> j;
    private Context k;
    private final int l = 100;

    public a(Context context, com.google.android.gms.maps.c cVar) {
        this.k = context;
        this.e = cVar;
        this.f = b.a().b();
        a(context);
        this.i = x.a();
        c();
    }

    private void a(Context context) {
        try {
            File file = new File(ao.o(context));
            if (file.exists()) {
                this.d = SQLiteDatabase.openDatabase(file.getPath(), null, 0);
            }
        } catch (Exception e) {
        }
    }

    private void a(LatLng latLng, int i, CircleOptions circleOptions) {
        LatLng latLng2;
        if (com.fimi.soul.biz.n.a.a().b()) {
            latLng2 = new LatLng(latLng.a, latLng.b);
        } else {
            af a = z.a(latLng.a, latLng.b);
            latLng2 = new LatLng(a.a(), a.b());
        }
        if (!this.a.contains(latLng2)) {
            this.a.add(latLng2);
            c a2 = this.e.a(circleOptions.a(latLng2).a((double) i));
            if (!this.f.contains(a2)) {
                this.f.add(a2);
            }
        }
    }

    private void c() {
        this.g = new CircleOptions().a(8000.0d).a(Color.argb(127, 255, 54, 0)).a(2.0f).b(Color.argb(51, 255, 54, 0)).b(100.0f);
        this.h = new CircleOptions().a(8000.0d).a(this.k.getResources().getColor(R.color.lawngreen)).a(2.0f).b(Color.argb(51, 255, 54, 0)).b(100.0f);
    }

    public void a() {
        this.b.sendEmptyMessage(100);
    }

    public void a(List<DynamicDYZ_Entity> list) {
        this.j = list;
    }

    public void b() {
        if (this.d != null && this.d.isOpen()) {
            this.d.close();
        }
    }
}
