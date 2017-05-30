package com.fimi.soul.biz.update;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.fimi.kernel.c;
import com.fimi.kernel.utils.z;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.manager.w;
import com.fimi.soul.service.UpdateApkService;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import com.google.android.gms.drive.e;
import com.xiaomi.market.sdk.UpdateResponse;
import com.xiaomi.market.sdk.XiaomiUpdateAgent;
import com.xiaomi.market.sdk.XiaomiUpdateListener;
import java.io.File;

public class b {
    private Context a;
    private a b;
    private b c;
    private w d;
    private com.fimi.soul.view.f.a e;

    public interface a {
        void a(String str);
    }

    public interface b {
        void a(UpdateResponse updateResponse);
    }

    public b(Context context) {
        this.d = w.a(context);
        this.a = context;
    }

    private void a(final UpdateResponse updateResponse, String str) {
        if (c.d() != null) {
            this.a = c.d();
            if (this.e == null) {
                this.e = new com.fimi.soul.view.f.a(this.a);
            }
            this.e.b(this.a.getString(R.string.updates), new OnClickListener(this) {
                final /* synthetic */ b b;

                public void onClick(DialogInterface dialogInterface, int i) {
                    z.a(this.b.a, this.b.a.getString(R.string.downloading_apk));
                    Intent intent;
                    if (new File(j.i(), com.fimi.soul.base.a.D).exists() && String.valueOf(updateResponse.versionCode).compareTo(ao.a(this.b.a, j.i() + com.fimi.soul.base.a.D)) == 0) {
                        intent = new Intent("android.intent.action.VIEW");
                        intent.setFlags(e.a_);
                        intent.setDataAndType(Uri.fromFile(new File(j.i(), com.fimi.soul.base.a.D)), "application/vnd.android.package-archive");
                        this.b.a.startActivity(intent);
                    } else if (ao.c() != null) {
                        intent = new Intent(this.b.a, UpdateApkService.class);
                        intent.putExtra("down_url", updateResponse.path);
                        intent.setFlags(e.c);
                        this.b.a.startService(intent);
                    } else {
                        z.a(this.b.a, (int) R.string.system_sd_tip, 2000);
                    }
                }
            }).a(this.a.getResources().getColor(R.color.dialog_update_right_text)).a(String.format(this.a.getString(R.string.findupdate), new Object[]{updateResponse.versionName})).a(this.a.getString(R.string.cancel), new OnClickListener(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                }
            }).b(str);
            if (!this.e.b().isShowing()) {
                this.e.a().show();
            }
        }
    }

    public void a() {
        XiaomiUpdateAgent.setUpdateAutoPopup(false);
        XiaomiUpdateAgent.setUpdateListener(new XiaomiUpdateListener(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void onUpdateReturned(int i, UpdateResponse updateResponse) {
                switch (i) {
                    case 0:
                        this.a.b.a(String.valueOf(updateResponse.versionCode));
                        return;
                    default:
                        return;
                }
            }
        });
        XiaomiUpdateAgent.update(this.a);
    }

    public void a(final int i) {
        XiaomiUpdateAgent.setUpdateAutoPopup(false);
        XiaomiUpdateAgent.setUpdateListener(new XiaomiUpdateListener(this) {
            final /* synthetic */ b b;

            public void onUpdateReturned(int i, UpdateResponse updateResponse) {
                switch (i) {
                    case 0:
                        if (this.b.c != null) {
                            this.b.c.a(updateResponse);
                            return;
                        }
                        return;
                    case 1:
                        if (i == 1) {
                            z.a(this.b.a, (int) R.string.version_tip, 2000);
                            return;
                        }
                        return;
                    case 3:
                        if (i == 1) {
                            z.a(this.b.a, (int) R.string.login_result_net, 2000);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        });
        XiaomiUpdateAgent.update(this.a);
    }

    public void a(a aVar) {
        this.b = aVar;
    }

    public void a(b bVar) {
        this.c = bVar;
    }

    public void a(UpdateResponse updateResponse) {
        a(updateResponse, updateResponse.updateLog);
    }

    public b b() {
        return this.c;
    }
}
