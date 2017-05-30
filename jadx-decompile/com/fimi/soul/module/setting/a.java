package com.fimi.soul.module.setting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.fimi.kernel.view.button.SwitchButton;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.camera.b.e;
import com.fimi.soul.biz.camera.d;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import java.util.HashMap;
import java.util.Map;

public abstract class a implements e<X11RespCmd> {
    private View a;
    private ViewGroup b;
    private Context c;
    private Map<String, View> d = new HashMap();
    private LayoutInflater e;
    private d f;

    public class a {
        final /* synthetic */ a a;
        private Button b;
        private Button c;

        public a(a aVar) {
            this.a = aVar;
        }

        public Button a() {
            return this.b;
        }

        public void a(Button button) {
            this.b = button;
        }

        public Button b() {
            return this.c;
        }

        public void b(Button button) {
            this.c = button;
        }
    }

    public a(Context context) {
        a(context);
        this.e = LayoutInflater.from(context);
        this.a = this.e.inflate(R.layout.layout_camera_setting_main, null);
        this.b = (ViewGroup) this.a.findViewById(R.id.lv_viewContent);
    }

    private Button a(View view, String str, String str2, OnClickListener onClickListener) {
        ((TextView) view.findViewById(R.id.tv_settingTitle)).setText(str);
        Button button = (Button) view.findViewById(R.id.btn_settingAction);
        button.setOnClickListener(onClickListener);
        button.setText(str2);
        e().addView(view);
        return button;
    }

    private void a(View view, String str) {
        ((TextView) view.findViewById(R.id.tv_settingTitle)).setText(str);
    }

    protected LayoutInflater a() {
        return this.e;
    }

    protected Button a(int i, String str, OnClickListener onClickListener) {
        return a(f().getText(i).toString(), str, onClickListener);
    }

    protected Button a(String str) {
        return a(str, null);
    }

    protected Button a(String str, OnClickListener onClickListener) {
        View inflate = this.e.inflate(R.layout.item_setting_center_button, null);
        Button button = (Button) inflate.findViewById(R.id.btn_settingAction);
        button.setText(str);
        button.setOnClickListener(onClickListener);
        e().addView(inflate);
        return button;
    }

    protected Button a(String str, String str2, OnClickListener onClickListener) {
        return a(a().inflate(R.layout.item_setting_short_button, null), str, str2, onClickListener);
    }

    protected SwitchButton a(String str, boolean z, com.fimi.kernel.view.button.SwitchButton.a aVar) {
        View inflate = a().inflate(R.layout.item_setting_switch_button, null);
        ((TextView) inflate.findViewById(R.id.tv_settingTitle)).setText(str);
        SwitchButton switchButton = (SwitchButton) inflate.findViewById(R.id.sb_settingAction);
        switchButton.setSwitchState(z);
        switchButton.setOnSwitchListener(aVar);
        e().addView(inflate);
        return switchButton;
    }

    protected a a(String str, String str2) {
        View inflate = this.e.inflate(R.layout.item_setting_double_button, null);
        a aVar = new a(this);
        Button button = (Button) inflate.findViewById(R.id.btn_settingActionFirst);
        button.setText(str);
        Button button2 = (Button) inflate.findViewById(R.id.btn_settingActionSecond);
        button2.setText(str2);
        aVar.a(button);
        aVar.b(button2);
        e().addView(inflate);
        return aVar;
    }

    protected void a(Context context) {
        this.c = context;
    }

    protected void a(LayoutInflater layoutInflater) {
        this.e = layoutInflater;
    }

    protected void a(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public void a(d dVar) {
        this.f = dVar;
    }

    protected View b() {
        return this.a;
    }

    protected Button b(String str, String str2, OnClickListener onClickListener) {
        return a(a().inflate(R.layout.item_setting_long_button, null), str, str2, onClickListener);
    }

    protected EditText b(String str, String str2) {
        View inflate = a().inflate(R.layout.item_setting_edit, null);
        a(inflate, str);
        EditText editText = (EditText) inflate.findViewById(R.id.et_settingAction);
        editText.setText(str2);
        e().addView(inflate);
        return editText;
    }

    public abstract View c();

    protected TextView c(String str, String str2) {
        View inflate = a().inflate(R.layout.item_setting_text, null);
        a(inflate, str);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_settingAction);
        textView.setText(str2);
        e().addView(inflate);
        return textView;
    }

    public d d() {
        return this.f;
    }

    public ViewGroup e() {
        return this.b;
    }

    protected Context f() {
        return this.c;
    }
}
