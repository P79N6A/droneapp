package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.internal.fq;

@Keep
public class HelpTextView extends LinearLayout implements b {
    private TextView ok;
    private TextView ol;

    @Keep
    public HelpTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void zza(TextView textView, @Nullable CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Keep
    public View asView() {
        return this;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.ok = (TextView) fq.a((TextView) findViewById(R.id.cast_featurehighlight_help_text_header_view));
        this.ol = (TextView) fq.a((TextView) findViewById(R.id.cast_featurehighlight_help_text_body_view));
    }

    @Keep
    public void setText(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        zza(this.ok, charSequence);
        zza(this.ol, charSequence2);
    }
}
