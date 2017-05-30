package com.xiaomi.market.sdk;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class e extends i {
    final /* synthetic */ c G;
    private File H;

    public e(c cVar, File file) {
        this.G = cVar;
        super(cVar, new FileOutputStream(file));
        this.H = file;
    }

    public void reset() {
        try {
            this.S.close();
        } catch (IOException e) {
        }
        this.H.delete();
        try {
            this.S = new FileOutputStream(this.H);
        } catch (FileNotFoundException e2) {
        }
    }
}
