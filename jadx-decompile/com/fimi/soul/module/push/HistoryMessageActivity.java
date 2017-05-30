package com.fimi.soul.module.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.entity.HistoryPushMessage;
import com.fimi.soul.utils.a.b;
import com.fimi.soul.utils.ao;
import java.util.List;

public class HistoryMessageActivity extends BaseActivity implements OnItemClickListener {
    private a a;
    private ListView b;
    private List<HistoryPushMessage> c;
    private b d;
    private TextView e;
    private ImageView f;

    private void a() {
        ((TextView) findViewById(R.id.tv_settingTitle)).setText(R.string.setting_history_message);
        ((Button) findViewById(R.id.black_btn)).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ HistoryMessageActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.finish();
            }
        });
        this.b = (ListView) findViewById(R.id.history_message_lv);
        this.b.setOnItemClickListener(this);
        this.b.setOverScrollMode(2);
        this.e = (TextView) findViewById(R.id.history_message_no_tv);
        this.f = (ImageView) findViewById(R.id.history_message_no_iv);
        ao.a(getAssets(), r0, r1, this.e);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(128, 128);
        setContentView(R.layout.activity_history_message);
        a();
        this.d = b.a((Context) this);
        this.c = this.d.a();
        if (this.c.size() > 0) {
            this.e.setVisibility(8);
            this.f.setVisibility(8);
            this.a = new a(this, this.c);
            this.b.setAdapter(this.a);
            return;
        }
        this.e.setVisibility(0);
        this.f.setVisibility(0);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Intent intent = new Intent(this, MessageDetailActivity.class);
        intent.putExtra("redirectURL", ((HistoryPushMessage) this.c.get(i)).getRedirectURL());
        startActivity(intent);
    }
}
