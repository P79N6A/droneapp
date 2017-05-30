package com.fimi.soul.module.flyplannermedia;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.GridView;
import com.fimi.kernel.b.b.b;
import com.fimi.kernel.b.b.c;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.entity.X11RespCmd.NotificationType;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.utils.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DroneLocalFragment extends DroneBaseMediaFragment {
    private c d;
    private List<WifiDistanceFile> e;
    private a f = new a(this);
    private Handler g = new Handler();
    private boolean h = false;

    class a extends Handler {
        final /* synthetic */ DroneLocalFragment a;

        a(DroneLocalFragment droneLocalFragment) {
            this.a = droneLocalFragment;
        }

        public void handleMessage(Message message) {
            this.a.h = false;
            if (this.a.e != null) {
                this.a.b().a(this.a.e);
                this.a.g(false);
                if (this.a.e.size() > 0) {
                    this.a.d(false);
                } else {
                    this.a.d(true);
                }
                this.a.b().notifyDataSetChanged();
                return;
            }
            this.a.g(false);
            this.a.d(true);
        }
    }

    public DroneLocalFragment() {
        a(false);
    }

    private void p() {
        if (!this.h) {
            this.h = true;
            new Thread(new Runnable(this) {
                final /* synthetic */ DroneLocalFragment a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.e = this.a.q();
                    this.a.f.sendEmptyMessage(100);
                    this.a.h = false;
                }
            }).start();
        }
    }

    private List<WifiDistanceFile> q() {
        File file = new File(j.o());
        Object arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (file == null || !file.exists()) {
            return null;
        }
        File[] listFiles = file.listFiles();
        for (Object add : listFiles) {
            arrayList.add(add);
        }
        File file2 = new File(j.n());
        if (file2 != null) {
            listFiles = file2.listFiles();
            if (listFiles != null) {
                for (Object add2 : listFiles) {
                    arrayList2.add(add2);
                }
            }
        }
        Collections.sort(arrayList, new b());
        List<WifiDistanceFile> arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            file2 = (File) it.next();
            String name = file2.getName();
            WifiDistanceFile wifiDistanceFile = new WifiDistanceFile(name);
            String format = String.format("file://%s%s", new Object[]{j.o(), name});
            wifiDistanceFile.setLocalThumbnailPath(format);
            wifiDistanceFile.setPath(format);
            b a = this.d.a(getActivity(), name);
            if (a != null) {
                a.a(this.g);
                this.d.c();
                wifiDistanceFile.setDownloadTaskInfo(a);
                wifiDistanceFile.setRemoteUrl(a.m());
                if (name.contains(X11FileInfo.FILE_TYPE_MP4)) {
                    name = name.replace(X11FileInfo.FILE_TYPE_MP4, ".jpg");
                    if (a.a() != null) {
                        wifiDistanceFile.setDurationString(a.a());
                    }
                }
                format = name;
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    file = (File) it2.next();
                    if (file.getName().contains(format)) {
                        wifiDistanceFile.setLocalDownloadCachePath(file.getPath());
                        break;
                    }
                }
            }
            if (file2.length() > 0) {
                arrayList3.add(wifiDistanceFile);
            }
        }
        return arrayList3;
    }

    public void a(Intent intent) {
        String stringExtra = intent.getStringExtra("del_file");
        if (intent != null && !"".equals(stringExtra) && stringExtra != null) {
            b().b(stringExtra);
        }
    }

    void a(GridView gridView) {
    }

    public void a(String str, String str2) {
    }

    public void a(boolean z, X11RespCmd x11RespCmd) {
        if (getActivity() != null) {
            if (x11RespCmd.getNotificationType() == NotificationType.StartingVideoRecord) {
                b().notifyDataSetChanged();
            }
            if (x11RespCmd.getNotificationType() == NotificationType.VideoRecordComplete) {
                b().notifyDataSetChanged();
            }
        }
    }

    public void o() {
        h(false);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.d = c.a(getActivity());
        k().setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DroneLocalFragment a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                final List d = this.a.b().d();
                com.fimi.soul.view.f.a aVar = new com.fimi.soul.view.f.a(this.a.getActivity());
                if (this.a.b().c() != null && this.a.b().c().size() > 0) {
                    aVar.a(String.format(this.a.getString(R.string.ensure_delete_image), new Object[]{this.a.b().c().size() + ""})).a(this.a.getActivity().getResources().getColor(R.color.dialog_ensure_hot)).b(this.a.getString(R.string.delete), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ AnonymousClass1 b;

                        public void onClick(DialogInterface dialogInterface, int i) {
                            com.fimi.kernel.c.b().a();
                            for (WifiDistanceFile wifiDistanceFile : this.b.a.b().c()) {
                                if (d.contains(wifiDistanceFile)) {
                                    File file = new File(wifiDistanceFile.getPath().replace("file://", ""));
                                    if (file.exists()) {
                                        file.delete();
                                    }
                                    d.remove(wifiDistanceFile);
                                }
                                b a = this.b.a.d.a(this.b.a.getActivity(), wifiDistanceFile.getRemoteUrl());
                                if (a != null) {
                                    this.b.a.d.a(a);
                                }
                            }
                            this.b.a.b().a(d);
                            this.b.a.b().g();
                            this.b.a.b().notifyDataSetChanged();
                            this.b.a.h(false);
                            com.fimi.kernel.c.b().c();
                            if (d.size() == 0) {
                                this.b.a.d(true);
                            }
                        }
                    }).a(this.a.getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ AnonymousClass1 a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).a().show();
                }
            }
        });
        return onCreateView;
    }

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        super.onStart();
        e(false);
        f(true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        g(true);
        d(false);
        p();
    }
}
