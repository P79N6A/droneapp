package com.mob.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler.Callback;
import android.os.Message;
import com.google.android.gms.drive.e;

class FakeActivity$1 implements Callback {
    final /* synthetic */ FakeActivity this$0;
    final /* synthetic */ boolean val$forceNewTask;

    FakeActivity$1(FakeActivity fakeActivity, boolean z) {
        this.this$0 = fakeActivity;
        this.val$forceNewTask = z;
    }

    public boolean handleMessage(Message message) {
        Object[] objArr = (Object[]) message.obj;
        Context context = (Context) objArr[0];
        Intent intent = (Intent) objArr[1];
        if (this.val$forceNewTask) {
            intent.addFlags(e.a_);
            intent.addFlags(134217728);
        } else if (!(context instanceof Activity)) {
            intent.addFlags(e.a_);
        }
        context.startActivity(intent);
        return false;
    }
}
