package com.mining.app.zxing.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import com.fimi.overseas.soul.R;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.mining.app.zxing.a.c;
import com.mining.app.zxing.b.a;
import com.mining.app.zxing.b.f;
import com.mining.app.zxing.view.ViewfinderView;
import java.io.IOException;
import java.util.Vector;

public class MipcaActivityCapture extends Activity implements Callback {
    private static final long h = 200;
    private a a;
    private ViewfinderView b;
    private boolean c;
    private Vector<BarcodeFormat> d;
    private String e;
    private f f;
    private Button g;
    private final OnCompletionListener i = new OnCompletionListener(this) {
        final /* synthetic */ MipcaActivityCapture a;

        {
            this.a = r1;
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.seekTo(0);
        }
    };

    private void a(SurfaceHolder surfaceHolder) {
        try {
            c.a().a(surfaceHolder);
            if (this.a == null) {
                this.a = new a(this, this.d, this.e);
            }
        } catch (IOException e) {
        } catch (RuntimeException e2) {
        }
    }

    public ViewfinderView a() {
        return this.b;
    }

    public void a(Result result, Bitmap bitmap) {
        this.f.a();
        String text = result.getText();
        if (text.equals("")) {
            Toast.makeText(this, "Scan failed!", 0).show();
        } else {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("result", text);
            intent.putExtras(bundle);
            setResult(-1, intent);
        }
        finish();
    }

    public Handler b() {
        return this.a;
    }

    public void c() {
        this.b.a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_insurance_capture);
        c.a(getApplication());
        this.b = (ViewfinderView) findViewById(R.id.viewfinder_view);
        this.g = (Button) findViewById(R.id.return_insurance);
        this.c = false;
        this.f = new f(this);
        this.g.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ MipcaActivityCapture a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
    }

    protected void onDestroy() {
        this.f.b();
        super.onDestroy();
    }

    protected void onPause() {
        super.onPause();
        if (this.a != null) {
            this.a.a();
            this.a = null;
        }
        c.a().b();
    }

    protected void onResume() {
        super.onResume();
        SurfaceHolder holder = ((SurfaceView) findViewById(R.id.preview_view)).getHolder();
        if (this.c) {
            a(holder);
        } else {
            holder.addCallback(this);
            holder.setType(3);
        }
        this.d = null;
        this.e = null;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (!this.c) {
            this.c = true;
            a(surfaceHolder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.c = false;
    }
}
