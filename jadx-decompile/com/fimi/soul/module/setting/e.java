package com.fimi.soul.module.setting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.manager.g;
import com.fimi.soul.biz.manager.u;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.utils.ao;
import com.fimi.soul.view.ImageLoadingView;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.List;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

public class e extends BaseAdapter implements g, com.fimi.soul.biz.manager.u.b {
    Context a;
    List<f> b;
    u c;
    ListView d;
    boolean e = false;
    boolean f = false;
    c g;
    private long h;
    private a i;

    private enum a {
        HeadView,
        BodyView
    }

    class b {
        TextView a;
        final /* synthetic */ e b;

        b(e eVar) {
            this.b = eVar;
        }
    }

    class c {
        TextView a;
        TextView b;
        TextView c;
        ImageLoadingView d;
        ImageView e;
        ImageView f;
        ImageView g;
        RelativeLayout h;
        final /* synthetic */ e i;

        c(e eVar) {
            this.i = eVar;
        }
    }

    public e(Context context, List<f> list, ListView listView) {
        this.a = context;
        this.b = list;
        this.d = listView;
        this.c = u.a(this.a);
        this.c.a((g) this);
        this.c.a((com.fimi.soul.biz.manager.u.b) this);
    }

    private void a(String str, int i) {
        if (this.b != null && this.b.size() > 0) {
            for (f fVar : this.b) {
                if (fVar.c().equals(str)) {
                    if (i == 100) {
                        fVar.a(2);
                        fVar.a(fVar.b().replace(".", "&synced."));
                        notifyDataSetChanged();
                    } else if (i > 0) {
                        fVar.a(1);
                    } else {
                        fVar.a(0);
                    }
                    fVar.b(i);
                }
            }
        }
    }

    public void a(int i) {
        f fVar = (f) this.b.get(i);
        if (fVar != null) {
            ((f) this.b.get(i)).a(!fVar.a());
        }
        notifyDataSetChanged();
    }

    public void a(int i, String str) {
        if (i > 0) {
            ImageLoadingView imageLoadingView = (ImageLoadingView) this.d.findViewWithTag("log_" + str);
            if (imageLoadingView != null) {
                imageLoadingView.a();
                imageLoadingView.setSweepAngle((float) i);
            }
            TextView textView = (TextView) this.d.findViewWithTag("percent_" + str);
            ImageView imageView = (ImageView) this.d.findViewWithTag("load_" + str);
            if (textView != null) {
                if (i >= 100 || i <= 0) {
                    textView.setText(String.format("%s", new Object[]{this.a.getString(R.string.fly_finish_over)}));
                    if (imageView != null) {
                        imageView.setImageResource(R.drawable.icon_upload_ok);
                    }
                    a(new File(str));
                } else {
                    textView.setText(String.format("%s | %s%s", new Object[]{this.a.getString(R.string.fly_uploading), Integer.valueOf(i), "%"}));
                    imageView.setImageResource(R.drawable.icon_download_pause);
                }
            }
        }
        a(str, i);
    }

    public void a(PlaneMsg planeMsg, String str) {
        if (!(planeMsg == null || planeMsg.isSuccess())) {
            ImageLoadingView imageLoadingView = (ImageLoadingView) this.d.findViewWithTag("log_" + str);
            TextView textView = (TextView) this.d.findViewWithTag("percent_" + str);
            ImageView imageView = (ImageView) this.d.findViewWithTag("load_" + str);
            if (imageView != null) {
                imageView.setImageResource(R.drawable.icon_download_continue);
            }
            if (textView != null) {
                textView.setText(this.a.getString(R.string.fly_upload_fail));
            }
            this.c.d(new File(str));
        }
        if (this.b != null && this.b.size() > 0) {
            for (f fVar : this.b) {
                if (fVar != null && fVar.c().equals(str)) {
                    fVar.a(0);
                    return;
                }
            }
        }
    }

    public void a(f fVar) {
        if (fVar == null) {
            return;
        }
        if (fVar.b().endsWith(".sf") || fVar.b().endsWith(".txt")) {
            this.c.a(new File(fVar.c()));
            fVar.c(true);
            notifyDataSetChanged();
        }
    }

    void a(File file) {
        if (file.exists()) {
            file.renameTo(new File(file.getAbsolutePath().substring(0, file.getAbsolutePath().lastIndexOf("/") + 1) + file.getName().replace(".", "&synced.")));
        }
    }

    public void a(List<f> list) {
        if (list != null) {
            this.b = list;
            notifyDataSetChanged();
        }
    }

    public void a(boolean z) {
        this.e = z;
        notifyDataSetChanged();
    }

    public boolean a() {
        return this.e;
    }

    public void b(List<f> list) {
        synchronized (this.b) {
            if (list != null) {
                if (list.size() > 0) {
                    for (f fVar : list) {
                        for (int size = this.b.size() - 1; size >= 0; size--) {
                            f fVar2 = (f) this.b.get(size);
                            if (fVar.b().equals(fVar2.b())) {
                                this.b.remove(fVar2);
                                break;
                            }
                        }
                    }
                }
            }
        }
        notifyDataSetChanged();
    }

    public void b(boolean z) {
        this.f = z;
    }

    public boolean b() {
        return this.f;
    }

    public void c() {
        if (this.c != null) {
            this.c.a(null);
            this.c.c();
        }
    }

    public void c(boolean z) {
        this.f = z;
        for (f a : this.b) {
            a.a(z);
        }
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.b != null ? this.b.size() : 0;
    }

    public Object getItem(int i) {
        return this.b != null ? (f) this.b.get(i) : null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public int getItemViewType(int i) {
        if (this.b != null) {
            f fVar = (f) this.b.get(i);
            if (fVar != null && fVar.h()) {
                return a.HeadView.ordinal();
            }
        }
        return a.BodyView.ordinal();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (getItemViewType(i) == a.BodyView.ordinal()) {
            if (view == null) {
                this.g = new c(this);
                view = LinearLayout.inflate(this.a, R.layout.fly_logs_item, null);
                this.g.a = (TextView) view.findViewById(R.id.log_name);
                this.g.b = (TextView) view.findViewById(R.id.log_size);
                this.g.c = (TextView) view.findViewById(R.id.upload_status);
                this.g.d = (ImageLoadingView) view.findViewById(R.id.upload_icon);
                this.g.e = (ImageView) view.findViewById(R.id.upload_v);
                this.g.h = (RelativeLayout) view.findViewById(R.id.upload_layout);
                this.g.f = (ImageView) view.findViewById(R.id.select_icon);
                this.g.g = (ImageView) view.findViewById(R.id.head_arrow);
                view.setTag(this.g);
                ao.a(this.a.getAssets(), this.g.a, this.g.b, this.g.c);
            } else {
                this.g = (c) view.getTag();
            }
            final f fVar = (f) this.b.get(i);
            this.g.d.setTag("log_" + fVar.c());
            this.g.c.setTag("percent_" + fVar.c());
            this.g.e.setTag("load_" + fVar.c());
            if (this.e) {
                this.g.h.setVisibility(8);
                if (fVar.d() == 0 || fVar.d() == 2) {
                    this.g.f.setVisibility(0);
                } else {
                    this.g.f.setVisibility(4);
                }
                this.g.c.setVisibility(8);
                this.g.g.setVisibility(8);
            } else {
                this.g.h.setVisibility(0);
                this.g.f.setVisibility(8);
                this.g.c.setVisibility(0);
                this.g.g.setVisibility(0);
            }
            if (fVar != null) {
                this.g.f.setSelected(fVar.g);
                this.g.d.setPaintColor(this.a.getResources().getColor(R.color.gray));
                String b = fVar.b();
                if (b.contains(Constants.ACCEPT_TIME_SEPARATOR_SERVER) && b.contains(" ")) {
                    String[] split = b.split(" ");
                    if (split != null && split.length > 0) {
                        b = this.a.getResources().getConfiguration().locale.getCountry().equals("CN") ? split[1].replace(SignatureVisitor.SUPER, ':') : split[1].replace(SignatureVisitor.SUPER, ':');
                        if (!b.contains(":") && b.length() > 4) {
                            b = b.substring(0, 2) + ":" + b.substring(2, 4) + ":" + b.substring(4, b.length());
                        }
                    }
                }
                if (b.contains(".sf")) {
                    b = b.replaceAll(".sf", "");
                    this.g.b.setText(this.a.getString(R.string.black_box));
                    if (!this.e) {
                        this.g.g.setVisibility(8);
                    }
                } else {
                    b = b.replaceAll(".txt", "");
                    this.g.b.setText(this.a.getString(R.string.video_log));
                    if (!this.e) {
                        this.g.g.setVisibility(0);
                    }
                }
                if (b.contains("&synced")) {
                    this.g.d.a();
                    this.g.d.setSweepAngle(100.0f);
                    this.g.e.setImageResource(R.drawable.icon_upload_ok);
                    this.g.c.setText(this.a.getResources().getString(R.string.fly_finish_over));
                    this.g.a.setText(b.replaceAll("&synced", ""));
                    fVar.a(2);
                } else {
                    this.g.e.setImageResource(R.drawable.icon_upload_start);
                    this.g.a.setText(String.format("%s", new Object[]{b}));
                    if (fVar.d() == 0) {
                        fVar.a(0);
                        this.g.d.setSweepAngle(0.0f);
                        if (fVar.h) {
                            this.g.c.setText(this.a.getResources().getString(R.string.wait_upload));
                            b = fVar.e();
                            if (b != null && Double.valueOf(b.split(" ")[0]).doubleValue() > 0.0d) {
                            }
                        } else {
                            this.g.c.setText(fVar.e());
                        }
                    } else if (fVar.d() == 1) {
                        fVar.a(1);
                        this.g.e.setImageResource(R.drawable.icon_download_pause);
                        this.g.d.a();
                        this.g.d.setSweepAngle((float) fVar.g());
                        this.g.c.setText(String.format("%s | %s%s", new Object[]{this.a.getString(R.string.fly_uploading), Integer.valueOf(fVar.g()), "%"}));
                    } else if (fVar.d() == 3) {
                        fVar.a(3);
                        this.g.e.setImageResource(R.drawable.icon_download_pause);
                        this.g.d.a();
                        this.g.d.setSweepAngle((float) fVar.g());
                        this.g.c.setText(String.format("%s | %s%s", new Object[]{this.a.getString(R.string.fly_upload_pause), Integer.valueOf(fVar.g()), "%"}));
                    }
                }
            }
            this.g.d.setTag(R.id.tag_first, fVar);
            this.g.d.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ e b;

                public void onClick(View view) {
                    if (System.currentTimeMillis() - this.b.h >= 1000) {
                        this.b.h = System.currentTimeMillis();
                        ImageView imageView = (ImageView) this.b.d.findViewWithTag("load_" + fVar.c());
                        if (this.b.c != null && fVar.d() != 2) {
                            TextView textView = (TextView) this.b.d.findViewWithTag("percent_" + fVar.c());
                            if (fVar.d() == 1) {
                                this.b.c.b(new File(fVar.c()));
                                fVar.a(3);
                                textView.setText(String.format("%s | %s%s", new Object[]{this.b.a.getString(R.string.fly_upload_pause), Integer.valueOf(fVar.g()), "%"}));
                                imageView.setImageResource(R.drawable.icon_upload_start);
                                if (this.b.b != null) {
                                    for (f fVar : this.b.b) {
                                        if (fVar.c().equals(fVar.c())) {
                                            fVar.a(3);
                                            return;
                                        }
                                    }
                                }
                            } else if (fVar.d() == 3) {
                                textView.setText(String.format("%s | %s%s", new Object[]{this.b.a.getString(R.string.fly_uploading), Integer.valueOf(fVar.g()), "%"}));
                                this.b.c.c(new File(fVar.c()));
                                fVar.a(1);
                                imageView.setImageResource(R.drawable.icon_download_pause);
                                if (this.b.b != null) {
                                    for (f fVar2 : this.b.b) {
                                        if (fVar2.c().equals(fVar.c())) {
                                            fVar2.a(1);
                                            return;
                                        }
                                    }
                                }
                            } else if (fVar.d() == 0) {
                                textView.setText(this.b.a.getResources().getString(R.string.wait_upload));
                                String e = fVar.e();
                                if (e == null || Double.valueOf(e.split(" ")[0]).doubleValue() <= 0.0d) {
                                    ((TextView) this.b.d.findViewWithTag("percent_" + fVar.c())).setText(R.string.inabvility);
                                    return;
                                }
                                this.b.c.a(new File(fVar.c()));
                                fVar.c(true);
                            }
                        }
                    }
                }
            });
        } else {
            b bVar;
            if (view == null) {
                view = LayoutInflater.from(this.a).inflate(R.layout.drone_log_item_title, null);
                bVar = new b(this);
                bVar.a = (TextView) view.findViewById(R.id.headview);
                view.setTag(bVar);
                ao.a(this.a.getAssets(), bVar.a);
            } else {
                bVar = (b) view.getTag();
            }
            String b2 = ((f) this.b.get(i)).b();
            if (b2 != null) {
                String[] split2 = b2.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                if (split2.length >= 2) {
                    bVar.a.setText(split2[1] + "/" + split2[2] + "/" + split2[0]);
                }
            }
        }
        return view;
    }

    public int getViewTypeCount() {
        return 2;
    }
}
