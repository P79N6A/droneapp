package com.fimi.soul.module.flyplannermedia;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.GridView;
import com.fimi.kernel.b.b.c;
import com.fimi.kernel.b.b.c.a;
import com.fimi.kernel.b.b.c.b;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.camera.c.d;
import com.fimi.soul.biz.camera.e;
import com.fimi.soul.biz.camera.entity.X11DeviceInfo;
import com.fimi.soul.biz.camera.entity.X11FileInfo;
import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.entity.X11RespCmd.NotificationType;
import com.fimi.soul.entity.WifiDistanceFile;
import com.fimi.soul.media.player.FermiPlayerUtils;
import com.fimi.soul.utils.j;
import com.fimi.soul.view.f;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DroneOnlineFragment extends DroneBaseMediaFragment implements a, b {
    private static final int k = 153;
    Handler d = new Handler(this) {
        final /* synthetic */ DroneOnlineFragment a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (153 == message.what) {
                this.a.m().s().e();
            }
        }
    };
    private int e = 0;
    private int f;
    private a<X11FileInfo> g;
    private List<WifiDistanceFile> h;
    private List<X11FileInfo> i = new ArrayList();
    private X11DeviceInfo j;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;

    public DroneOnlineFragment() {
        a(true);
        this.n = false;
    }

    private void a(X11FileInfo x11FileInfo, String str) {
        WifiDistanceFile wifiDistanceFile = new WifiDistanceFile(x11FileInfo.getName());
        wifiDistanceFile.setLocalThumbnailPath(str);
        wifiDistanceFile.setDateString(x11FileInfo.getCreateDate());
        wifiDistanceFile.setSize(x11FileInfo.getSize());
        wifiDistanceFile.setRealPath(x11FileInfo.getRemotePath());
        wifiDistanceFile.setAbsolutePath(x11FileInfo.getAbsolutePath());
        wifiDistanceFile.setRemoteUrl(x11FileInfo.getHttpUrl());
        if (wifiDistanceFile.getType() == 2) {
            wifiDistanceFile.setRemoteThmUrl(x11FileInfo.getHttpThmUrl());
        }
        b().a(wifiDistanceFile);
        g(false);
    }

    private void b(List<X11FileInfo> list) {
        if (list == null || list.size() <= this.e) {
            d(true);
            m().a(true);
        } else if (list == null || list.size() <= 0) {
            d(true);
        } else {
            this.g = new a(list);
            this.g.a(new a.a<X11FileInfo>(this) {
                final /* synthetic */ DroneOnlineFragment a;

                {
                    this.a = r1;
                }

                public boolean a(X11FileInfo x11FileInfo) {
                    int fileType = WifiDistanceFile.getFileType(x11FileInfo.getName());
                    this.a.e = this.a.e + 1;
                    if (fileType == 1) {
                        if (com.fimi.soul.biz.camera.b.b(com.fimi.soul.biz.camera.b.a(x11FileInfo))) {
                            this.a.a(x11FileInfo, String.format("file://%s", new Object[]{j.a(com.fimi.soul.biz.camera.b.a(x11FileInfo))}));
                            this.a.g.b();
                        } else {
                            this.a.m().s().a(x11FileInfo.getName(), x11FileInfo.getAbsolutePath(), x11FileInfo.getCreateDate(), d.a.Thumb);
                        }
                    }
                    if (fileType == 2) {
                        this.a.m = true;
                        this.a.m().s().g(x11FileInfo.getAbsolutePath());
                    }
                    return true;
                }
            });
            this.g.b();
            d(false);
            g(false);
        }
    }

    private void p() {
        l().setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DroneOnlineFragment a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.q();
            }
        });
        k().setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ DroneOnlineFragment a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.h = this.a.b().c();
                new f.a(this.a.getActivity()).a(String.format(this.a.getString(R.string.ensure_delete_image), new Object[]{this.a.h.size() + ""})).a(this.a.getActivity().getResources().getColor(R.color.dialog_ensure_hot)).b(this.a.getString(R.string.delete), new DialogInterface.OnClickListener(this) {
                    final /* synthetic */ AnonymousClass3 a;

                    {
                        this.a = r1;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        this.a.a.f = 0;
                        this.a.a.m = false;
                        if (this.a.a.h.size() != 0) {
                            this.a.a.i.clear();
                            for (int i2 = 0; i2 < this.a.a.h.size(); i2++) {
                                for (X11FileInfo x11FileInfo : this.a.a.m().k().getCurDirFileList()) {
                                    if (((WifiDistanceFile) this.a.a.h.get(i2)).getName().equals(x11FileInfo.getName())) {
                                        this.a.a.i.add(x11FileInfo);
                                        break;
                                    }
                                }
                            }
                            this.a.a.m().s().c(((WifiDistanceFile) this.a.a.h.get(this.a.a.f)).getAbsolutePath());
                            this.a.a.h(false);
                            this.a.a.g(true);
                        }
                    }
                }).a(this.a.getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
                    final /* synthetic */ AnonymousClass3 a;

                    {
                        this.a = r1;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                }).a().show();
            }
        });
    }

    private void q() {
        List<WifiDistanceFile> c = b().c();
        c a = c.a(getActivity());
        a.a((b) this);
        a.a((a) this);
        if (c != null && c.size() > 0) {
            h(false);
            for (WifiDistanceFile wifiDistanceFile : c) {
                String a2 = com.fimi.soul.biz.camera.b.a(wifiDistanceFile.getName(), wifiDistanceFile.getDateString());
                String str = "";
                if (wifiDistanceFile.getType() == 2) {
                    str = wifiDistanceFile.getDurationString();
                }
                a.a(wifiDistanceFile.getRemoteUrl(), str, wifiDistanceFile.getSize(), Boolean.valueOf(false), j.b(a2));
            }
        }
        z.a(getActivity(), getActivity().getString(R.string.media_success_add, new Object[]{Integer.valueOf(c.size())}), 1000);
    }

    public void a(Intent intent) {
        if (intent != null) {
            WifiDistanceFile wifiDistanceFile = (WifiDistanceFile) intent.getSerializableExtra(com.fimi.soul.base.a.O);
            if (!(wifiDistanceFile == null || b() == null)) {
                b().c(wifiDistanceFile);
                if (b().getCount() == 0) {
                    d(true);
                }
            }
            if (this.e > 0) {
                this.e--;
            }
            a(wifiDistanceFile);
        }
    }

    void a(GridView gridView) {
        if (b().d().size() == this.e && this.g != null && this.g.d()) {
            this.g.b();
            b().notifyDataSetChanged();
        }
    }

    public void a(com.fimi.kernel.b.b.b bVar, int i) {
    }

    public void a(String str, String str2) {
        if (!this.o) {
            try {
                if (com.fimi.soul.biz.camera.b.f(str2) == com.fimi.soul.biz.camera.b.a.Thumbnail) {
                    List curDirFileList = m().k().getCurDirFileList();
                    if (this.e - 1 < curDirFileList.size()) {
                        a((X11FileInfo) curDirFileList.get(this.e - 1), String.format("file://%s%s", new Object[]{str, str2}));
                        if (!this.g.b()) {
                        }
                    }
                }
            } catch (Exception e) {
                Log.d("Good", e + "");
            }
        }
    }

    public void a(List<com.fimi.kernel.b.b.b> list, boolean z, com.fimi.kernel.b.b.b bVar) {
    }

    public void a(boolean z, X11RespCmd x11RespCmd) {
        if ("".equalsIgnoreCase(x11RespCmd.getErrorMsg())) {
        }
        if (getActivity() != null) {
            if (x11RespCmd.getNotificationType() == NotificationType.CardRemoved) {
                d(true);
                z.a(getActivity(), getActivity().getString(R.string.tf_removed));
                return;
            } else if (x11RespCmd.getNotificationType() == NotificationType.FmLsEnd) {
                if (z) {
                    b(m().k().getCurDirFileList());
                } else {
                    d(true);
                    g(false);
                }
            }
        }
        switch (x11RespCmd.getMsg_id()) {
            case 257:
                m().s().d();
                return;
            case 261:
                m().s().e();
                return;
            case 1026:
                break;
            case e.R /*1281*/:
                if (z) {
                    m().a(true);
                    b().b((WifiDistanceFile) this.h.get(this.f));
                    if (this.e > 0) {
                        this.e--;
                    }
                    m().k().getCurDirFileList().remove(this.i.get(this.f));
                    if (((WifiDistanceFile) this.h.get(this.f)).getLocalThumbnailPath() != null) {
                        File file = new File(((WifiDistanceFile) this.h.get(this.f)).getLocalThumbnailPath().replace("file://", ""));
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                    this.f++;
                    if (this.f >= this.h.size()) {
                        g(false);
                        z.a(getActivity(), getString(R.string.del_success), z.b);
                        a(this.h);
                        m().r().c(e.cy);
                        if (b().getCount() < 12 && this.g != null && this.g.d() && !this.g.b() && b().getCount() == 0) {
                            d(true);
                        }
                        b().notifyDataSetChanged();
                        break;
                    }
                    m().s().c(((WifiDistanceFile) this.h.get(this.f)).getAbsolutePath());
                    break;
                }
                g(false);
                z.a(getActivity(), getString(R.string.del_fail), 2000);
                return;
            case e.S /*1282*/:
                g(false);
                this.e = 0;
                b(m().k().getCurDirFileList());
                return;
            case e.T /*1283*/:
                m().s().f();
                return;
            case e.aj /*8947848*/:
                return;
            case e.al /*10066328*/:
                X11FileInfo curDownloadFile = m().k().getCurDownloadFile();
                m().s().a(curDownloadFile.getName(), curDownloadFile.getAbsolutePath(), curDownloadFile.getCreateDate(), d.a.Thumb);
                return;
            default:
                return;
        }
        if (this.m && !this.o) {
            List curDirFileList = m().k().getCurDirFileList();
            if (this.e - 1 >= 0 && this.e - 1 < curDirFileList.size()) {
                String timelineString;
                curDownloadFile = (X11FileInfo) curDirFileList.get(this.e - 1);
                WifiDistanceFile wifiDistanceFile = new WifiDistanceFile(curDownloadFile.getName());
                if (z) {
                    try {
                        timelineString = FermiPlayerUtils.getTimelineString(Long.parseLong(x11RespCmd.getDuration()) * 1000, "mm:ss");
                    } catch (Exception e) {
                    }
                } else {
                    timelineString = "00:00";
                }
                wifiDistanceFile.setDurationString(timelineString);
                wifiDistanceFile.setDateString(curDownloadFile.getCreateDate());
                wifiDistanceFile.setRemoteUrl(com.fimi.soul.biz.camera.b.a(curDownloadFile.getRemotePath()));
                wifiDistanceFile.setSize(curDownloadFile.getSize());
                wifiDistanceFile.setRealPath(curDownloadFile.getRemotePath());
                wifiDistanceFile.setAbsolutePath(curDownloadFile.getAbsolutePath());
                int indexOf = curDownloadFile.getRemotePath().indexOf(".");
                if (indexOf > 0 && wifiDistanceFile.getType() == 2) {
                    wifiDistanceFile.setRemoteThmUrl(com.fimi.soul.biz.camera.b.a(curDownloadFile.getRemotePath().substring(0, indexOf) + "_THM.MP4"));
                }
                b().a(wifiDistanceFile);
                this.g.b();
                b().notifyDataSetChanged();
            }
        }
    }

    public void o() {
        h(false);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        m().c(new com.fimi.kernel.b.c.d(this) {
            final /* synthetic */ DroneOnlineFragment a;

            {
                this.a = r1;
            }

            public void a(String str) {
            }
        });
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        p();
        return onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.o = false;
        if (!this.l && m().d() && b().getCount() > 0 && b().getCount() < 12 && m().k().getCurDirFileList().size() > b().getCount()) {
            b().h();
            this.e = 0;
            b(m().k().getCurDirFileList());
        }
        b().notifyDataSetChanged();
    }

    public void onStart() {
        super.onStart();
        e(true);
        f(false);
    }

    public void onStop() {
        super.onStop();
        this.l = false;
        this.o = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        d(false);
        if (m().h()) {
            if (m().d() && b().getCount() <= 0) {
                this.l = true;
                g(true);
                d(false);
                if (!m().c() && m().k().getCurDirFileList().size() > 0) {
                    b(m().k().getCurDirFileList());
                } else if (this.n || !m().c()) {
                    g(false);
                    d(true);
                } else {
                    this.d.sendEmptyMessageDelayed(153, 300);
                    m().r().c(e.cz);
                    this.n = true;
                }
            } else if (m().d()) {
                this.l = false;
            } else {
                this.l = true;
                d(true);
            }
            this.j = m().i().getX11DeviceInfo();
            return;
        }
        z.a(getActivity(), (int) R.string.tf_remove_error, 3000);
        d(true);
    }
}
