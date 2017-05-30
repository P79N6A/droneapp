package com.fimi.kernel.view.dialog;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.fimi.kernel.R;

public class b extends ProgressDialog {
    private String a;

    public b(Context context) {
        super(context);
    }

    public b(Context context, int i) {
        super(context, i);
    }

    public void a(String str) {
        this.a = str;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_easyprogress);
        TextView textView = (TextView) findViewById(R.id.pb_easyMessage);
        if (this.a != null) {
            textView.setText(this.a);
        }
    }
}
