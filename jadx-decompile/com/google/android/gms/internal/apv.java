package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

public class apv {

    class AnonymousClass1 implements Runnable {
        final /* synthetic */ Editor a;

        AnonymousClass1(Editor editor) {
            this.a = editor;
        }

        public void run() {
            this.a.commit();
        }
    }

    public static void a(Editor editor) {
        if (VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            new Thread(new AnonymousClass1(editor)).start();
        }
    }
}
