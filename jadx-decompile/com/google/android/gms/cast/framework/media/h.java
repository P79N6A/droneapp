package com.google.android.gms.cast.framework.media;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import java.util.List;

public class h extends ArrayAdapter<MediaTrack> implements OnClickListener {
    private final Context a;
    private int b;

    private class a {
        final TextView a;
        final RadioButton b;
        final /* synthetic */ h c;

        private a(h hVar, TextView textView, RadioButton radioButton) {
            this.c = hVar;
            this.a = textView;
            this.b = radioButton;
        }
    }

    public h(Context context, List<MediaTrack> list, int i) {
        List arrayList;
        int i2 = R.layout.cast_tracks_chooser_dialog_row_layout;
        if (list == null) {
            arrayList = new ArrayList();
        }
        super(context, i2, arrayList);
        this.b = -1;
        this.a = context;
        this.b = i;
    }

    public MediaTrack a() {
        return (this.b < 0 || this.b >= getCount()) ? null : (MediaTrack) getItem(this.b);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        View view2;
        if (view == null) {
            view = ((LayoutInflater) this.a.getSystemService("layout_inflater")).inflate(R.layout.cast_tracks_chooser_dialog_row_layout, viewGroup, false);
            aVar = new a((TextView) view.findViewById(R.id.text), (RadioButton) view.findViewById(R.id.radio));
            view.setTag(aVar);
            view2 = view;
        } else {
            aVar = (a) view.getTag();
            view2 = view;
        }
        if (aVar == null) {
            return null;
        }
        aVar.b.setTag(Integer.valueOf(i));
        aVar.b.setChecked(this.b == i);
        view2.setOnClickListener(this);
        CharSequence f = ((MediaTrack) getItem(i)).f();
        if (TextUtils.isEmpty(f)) {
            f = this.a.getString(R.string.cast_tracks_chooser_dialog_default_track_name, new Object[]{Integer.valueOf(i)});
        }
        aVar.a.setText(f);
        return view2;
    }

    public void onClick(View view) {
        this.b = ((Integer) ((a) view.getTag()).b.getTag()).intValue();
        notifyDataSetChanged();
    }
}
