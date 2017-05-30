package com.fimi.soul.module.thirdpartlogin;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler.Callback;
import android.os.Message;
import android.provider.MediaStore.Images.Media;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.ShareSDK;
import com.fimi.soul.module.thirdpartlogin.f.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class RegisterPage extends Activity implements Callback, OnClickListener {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final String e = "UserIcon.jpg";
    private static d f;
    private static String g;
    private d h;
    private Platform i;
    private ImageView j;
    private ImageView k;
    private ImageView l;
    private TextView m;
    private EditText n;
    private String o;
    private f p = new f();

    private void a() {
        String str = "";
        if (this.i != null) {
            if (this.i.getDb().getUserGender().equals("m")) {
                this.p.a(a.MALE);
                this.k.setVisibility(0);
                this.l.setVisibility(4);
            } else {
                this.p.a(a.FEMALE);
                this.k.setVisibility(4);
                this.l.setVisibility(0);
            }
            this.p.a(this.i.getDb().getUserIcon());
            this.p.b(this.i.getDb().getUserName());
            this.p.c(this.i.getDb().getUserId());
        }
        this.n.setText(this.p.b());
        this.m.setText(this.p.d());
        if (!TextUtils.isEmpty(this.p.a())) {
            b();
        }
        if (Environment.getExternalStorageState().equals("mounted")) {
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + getPackageName() + "/download");
            File file2 = new File(file, e);
            if (!file.exists()) {
                file.mkdirs();
            }
            try {
                if (!file2.exists()) {
                    file2.createNewFile();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.o = file2.getAbsolutePath();
            Log.d("picturePath ==>>", this.o);
            return;
        }
        Log.d("change user icon ==>>", "there is not sdcard!");
    }

    static final void a(d dVar) {
        f = dVar;
    }

    static final void a(String str) {
        g = str;
    }

    private void b() {
        final String userIcon = this.i.getDb().getUserIcon();
        new Thread(new Runnable(this) {
            final /* synthetic */ RegisterPage b;

            public void run() {
                FileOutputStream fileOutputStream;
                FileNotFoundException e;
                Throwable th;
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(new URL(userIcon).openStream());
                    FileOutputStream fileOutputStream2 = null;
                    try {
                        fileOutputStream = new FileOutputStream(this.b.o);
                        try {
                            decodeStream.compress(CompressFormat.JPEG, 100, fileOutputStream);
                            try {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        } catch (FileNotFoundException e3) {
                            e = e3;
                            try {
                                e.printStackTrace();
                                try {
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                } catch (IOException e22) {
                                    e22.printStackTrace();
                                }
                                this.b.p.a(this.b.o);
                                new Message().what = 3;
                                this.b.j.post(new Runnable(this) {
                                    final /* synthetic */ AnonymousClass1 a;

                                    {
                                        this.a = r1;
                                    }

                                    public void run() {
                                        this.a.b.j.setImageURI(Uri.parse(this.a.b.o));
                                    }
                                });
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream2 = fileOutputStream;
                                try {
                                    fileOutputStream2.flush();
                                    fileOutputStream2.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                                throw th;
                            }
                        }
                    } catch (FileNotFoundException e5) {
                        e = e5;
                        fileOutputStream = null;
                        e.printStackTrace();
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        this.b.p.a(this.b.o);
                        new Message().what = 3;
                        this.b.j.post(/* anonymous class already generated */);
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        throw th;
                    }
                    this.b.p.a(this.b.o);
                    new Message().what = 3;
                    this.b.j.post(/* anonymous class already generated */);
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
        }).start();
    }

    private void c() {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        intent.setData(Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, 0);
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 3:
                this.j.setImageURI(Uri.parse(this.o));
                break;
        }
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0 && i2 == -1 && intent != null) {
            Cursor query = getBaseContext().getContentResolver().query(intent.getData(), null, null, null, null);
            query.moveToNext();
            String string = query.getString(query.getColumnIndex("_data"));
            query.close();
            if (new File(string).exists()) {
                Log.d(getClass().getSimpleName(), "onActivityResult == " + string + " == exist");
                this.p.a(string);
                this.j.setImageBitmap(e.a(string));
            }
        } else if (i == 1 && i2 == -1) {
            this.p.a(this.o);
            this.j.setImageDrawable(Drawable.createFromPath(this.o));
        } else if (i == 2 && i2 == -1 && intent != null) {
            this.j.setImageDrawable(Drawable.createFromPath(this.o));
        }
    }

    public void onClick(View view) {
    }

    protected void onCreate(Bundle bundle) {
        this.h = f;
        this.i = ShareSDK.getPlatform(g);
        f = null;
        g = null;
        super.onCreate(bundle);
        a();
    }
}
