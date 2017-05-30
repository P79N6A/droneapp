package com.google.android.gms.cast.framework.media;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.MediaTrack.a;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.d;
import java.util.ArrayList;
import java.util.List;

public class TracksChooserDialogFragment extends DialogFragment {
    private List<MediaTrack> a;
    private List<MediaTrack> b;
    private long[] c;
    private Dialog d;

    private static int a(List<MediaTrack> list, long[] jArr, int i) {
        if (jArr == null || list == null) {
            return i;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            for (long j : jArr) {
                if (j == ((MediaTrack) list.get(i2)).b()) {
                    return i2;
                }
            }
        }
        return i;
    }

    private MediaTrack a() {
        return new a(-1, 1).c(getActivity().getString(R.string.cast_tracks_chooser_dialog_none)).a(2).a("").a();
    }

    public static TracksChooserDialogFragment a(MediaInfo mediaInfo, long[] jArr) {
        if (mediaInfo == null) {
            return null;
        }
        List g = mediaInfo.g();
        if (g == null) {
            return null;
        }
        ArrayList a = a(g, 2);
        ArrayList a2 = a(g, 1);
        if (a.isEmpty() && a2.isEmpty()) {
            return null;
        }
        TracksChooserDialogFragment tracksChooserDialogFragment = new TracksChooserDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("extra_tracks_type_audio", a);
        bundle.putParcelableArrayList("extra_tracks_type_text", a2);
        bundle.putLongArray("extra_active_track_ids", jArr);
        tracksChooserDialogFragment.setArguments(bundle);
        return tracksChooserDialogFragment;
    }

    @NonNull
    private static ArrayList<MediaTrack> a(List<MediaTrack> list, int i) {
        ArrayList<MediaTrack> arrayList = new ArrayList();
        if (list != null) {
            for (MediaTrack mediaTrack : list) {
                if (mediaTrack.c() == i) {
                    arrayList.add(mediaTrack);
                }
            }
        }
        return arrayList;
    }

    private void a(View view, h hVar, h hVar2) {
        ListView listView = (ListView) view.findViewById(R.id.text_list_view);
        ListView listView2 = (ListView) view.findViewById(R.id.audio_list_view);
        TextView textView = (TextView) view.findViewById(R.id.text_empty_message);
        TextView textView2 = (TextView) view.findViewById(R.id.audio_empty_message);
        listView.setAdapter(hVar);
        listView2.setAdapter(hVar2);
        TabHost tabHost = (TabHost) view.findViewById(R.id.tab_host);
        tabHost.setup();
        TabSpec newTabSpec = tabHost.newTabSpec("textTab");
        if (hVar.getCount() == 0) {
            listView.setVisibility(4);
            newTabSpec.setContent(R.id.text_empty_message);
        } else {
            textView.setVisibility(4);
            newTabSpec.setContent(R.id.text_list_view);
        }
        newTabSpec.setIndicator(getActivity().getString(R.string.cast_tracks_chooser_dialog_subtitles));
        tabHost.addTab(newTabSpec);
        TabSpec newTabSpec2 = tabHost.newTabSpec("audioTab");
        if (hVar2.getCount() == 0) {
            listView2.setVisibility(4);
            newTabSpec2.setContent(R.id.audio_empty_message);
        } else {
            textView2.setVisibility(4);
            newTabSpec2.setContent(R.id.audio_list_view);
        }
        newTabSpec2.setIndicator(getActivity().getString(R.string.cast_tracks_chooser_dialog_audio));
        tabHost.addTab(newTabSpec2);
    }

    private void a(h hVar, h hVar2) {
        List arrayList = new ArrayList();
        MediaTrack a = hVar.a();
        if (a.b() != -1) {
            arrayList.add(a);
        }
        a = hVar2.a();
        if (a != null) {
            arrayList.add(a);
        }
        d b = c.a(getContext()).b().b();
        if (b != null && b.o()) {
            c a2 = b.a();
            if (a2 != null) {
                long[] jArr = new long[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    jArr[i] = ((MediaTrack) arrayList.get(i)).b();
                }
                a2.a(jArr);
            }
        }
        if (this.d != null) {
            this.d.cancel();
            this.d = null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.a = getArguments().getParcelableArrayList("extra_tracks_type_text");
        this.a.add(0, a());
        this.b = getArguments().getParcelableArrayList("extra_tracks_type_audio");
        this.c = getArguments().getLongArray("extra_active_track_ids");
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        int a = a(this.a, this.c, 0);
        int a2 = a(this.b, this.c, -1);
        final h hVar = new h(getActivity(), this.a, a);
        final h hVar2 = new h(getActivity(), this.b, a2);
        Builder builder = new Builder(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.cast_tracks_chooser_dialog_layout, null);
        a(inflate, hVar, hVar2);
        builder.setView(inflate).setPositiveButton(getActivity().getString(R.string.cast_tracks_chooser_dialog_ok), new OnClickListener(this) {
            final /* synthetic */ TracksChooserDialogFragment c;

            public void onClick(DialogInterface dialogInterface, int i) {
                this.c.a(hVar, hVar2);
            }
        }).setNegativeButton(R.string.cast_tracks_chooser_dialog_cancel, new OnClickListener(this) {
            final /* synthetic */ TracksChooserDialogFragment a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                if (this.a.d != null) {
                    this.a.d.cancel();
                    this.a.d = null;
                }
            }
        });
        if (this.d != null) {
            this.d.cancel();
            this.d = null;
        }
        this.d = builder.create();
        return this.d;
    }

    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }
}
