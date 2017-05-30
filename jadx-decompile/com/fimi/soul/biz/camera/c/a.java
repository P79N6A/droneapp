package com.fimi.soul.biz.camera.c;

import android.util.Log;
import com.fimi.soul.biz.camera.b.e;
import com.fimi.soul.biz.camera.c;
import com.fimi.soul.biz.camera.entity.BaseX11Cmd;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.utils.ad;

public abstract class a implements e<X11RespCmd> {
    private c a;

    protected a(c cVar) {
        this.a = cVar;
    }

    public c a() {
        return this.a;
    }

    protected void a(int i) {
        a(i, null);
    }

    protected void a(int i, String str) {
        a(i, str, null);
    }

    protected void a(int i, String str, String str2) {
        BaseX11Cmd baseX11Cmd = new BaseX11Cmd();
        baseX11Cmd.setMsg_id(i);
        baseX11Cmd.setParam(str);
        baseX11Cmd.setType(str2);
        baseX11Cmd.setToken(a().e());
        a(baseX11Cmd);
    }

    protected void a(BaseX11Cmd baseX11Cmd) {
        String str = ad.a(baseX11Cmd) + "\n";
        Log.d("Good", "send cmd:" + str);
        a().a(str.getBytes());
    }

    public void a(boolean z, X11RespCmd x11RespCmd) {
    }

    protected void a(byte[] bArr, int i, int i2) {
        a().a(bArr, i, i2);
    }

    protected BaseX11Cmd b(int i, String str, String str2) {
        BaseX11Cmd baseX11Cmd = new BaseX11Cmd();
        baseX11Cmd.setMsg_id(i);
        baseX11Cmd.setParam(str);
        baseX11Cmd.setType(str2);
        baseX11Cmd.setToken(a().e());
        return baseX11Cmd;
    }
}
