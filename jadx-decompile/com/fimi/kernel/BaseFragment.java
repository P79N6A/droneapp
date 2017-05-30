package com.fimi.kernel;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fimi.kernel.utils.x;
import com.fimi.kernel.view.b;

public abstract class BaseFragment extends Fragment {
    private Handler a;

    class a extends Handler {
        final /* synthetic */ BaseFragment a;

        a(BaseFragment baseFragment) {
            this.a = baseFragment;
        }

        public void handleMessage(Message message) {
            this.a.a(message);
            super.handleMessage(message);
        }
    }

    public b a() {
        return c.b();
    }

    public void a(Message message) {
    }

    public void a(Runnable runnable) {
        x.a(runnable);
    }

    public com.fimi.kernel.c.a b() {
        return c.c();
    }

    protected Handler c() {
        return this.a;
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.a = new a(this);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
