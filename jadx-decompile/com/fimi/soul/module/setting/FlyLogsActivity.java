package com.fimi.soul.module.setting;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.fimi.kernel.utils.x;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.biz.j.h;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.fimi.soul.module.droneTrack.PlayBackDroneTrackActivity;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.j;
import java.io.File;
import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;

public class FlyLogsActivity extends BaseActivity implements OnClickListener {
    public static final int p = 10;
    ImageView a;
    TextView b;
    TextView c;
    TextView d;
    TextView e;
    Button f;
    Button g;
    ListView h;
    ArrayList<f> i = new ArrayList();
    List<f> j = new ArrayList();
    RelativeLayout k;
    RelativeLayout l;
    LinearLayout m;
    ImageButton n;
    ImageButton o;
    private e q;
    private Handler r = new h(this);
    private ArrayList<f> s;
    private HashMap<String, List<f>> t = new HashMap();

    class a implements Comparator<f> {
        final /* synthetic */ FlyLogsActivity a;

        a(FlyLogsActivity flyLogsActivity) {
            this.a = flyLogsActivity;
        }

        public int a(f fVar, f fVar2) {
            return fVar2.f() > fVar.f() ? 1 : fVar.f() == fVar2.f() ? 0 : -1;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((f) obj, (f) obj2);
        }
    }

    private void a(ArrayList<f> arrayList) {
        String str = null;
        int i = 0;
        while (i < arrayList.size()) {
            String str2;
            f fVar = (f) arrayList.get(i);
            String[] split = fVar.b().split(" ");
            String str3 = " ";
            if (split.length > 0) {
                str3 = split[0];
            }
            if (str3.equals(str)) {
                str2 = str;
            } else {
                f fVar2 = new f();
                fVar2.a(str3);
                fVar2.a(0);
                fVar2.b(fVar.c());
                fVar2.b(0);
                fVar2.b(true);
                arrayList.add(i, fVar2);
                str2 = str3;
            }
            i++;
            str = str2;
        }
    }

    private void d() {
        this.q = new e(this, this.i, this.h);
        this.h.setAdapter(this.q);
        this.h.setOnItemLongClickListener(new OnItemLongClickListener(this) {
            final /* synthetic */ FlyLogsActivity a;

            {
                this.a = r1;
            }

            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                f fVar = (f) adapterView.getItemAtPosition(i);
                if (fVar != null && fVar.h()) {
                    return true;
                }
                this.a.q.a(true);
                this.a.k.setVisibility(0);
                this.a.l.setVisibility(4);
                this.a.m.setVisibility(0);
                return false;
            }
        });
        this.h.setOnItemClickListener(new OnItemClickListener(this) {
            final /* synthetic */ FlyLogsActivity a;

            {
                this.a = r1;
            }

            @SuppressLint({"StringFormatMatches"})
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                f fVar = (f) adapterView.getItemAtPosition(i);
                if (fVar != null && fVar.h()) {
                    return;
                }
                if (this.a.q.a()) {
                    fVar = (f) this.a.q.getItem(i);
                    if (fVar.g) {
                        for (int size = this.a.j.size() - 1; size >= 0; size--) {
                            if (fVar.c().equals(((f) this.a.j.get(size)).c())) {
                                this.a.j.remove(size);
                                break;
                            }
                        }
                    } else {
                        this.a.j.add(fVar);
                    }
                    this.a.q.a(i);
                    this.a.c.setText(String.format(this.a.getResources().getString(R.string.has_select_num, new Object[]{Integer.valueOf(this.a.j.size())}), new Object[0]));
                    if (this.a.q.getCount() == this.a.j.size()) {
                        this.a.f.setText(R.string.undo_select_all);
                    } else {
                        this.a.f.setText(R.string.select_all);
                    }
                } else if (!fVar.b().contains(".sf")) {
                    Intent intent = new Intent(this.a, PlayBackDroneTrackActivity.class);
                    fVar = (f) this.a.q.getItem(i);
                    if (fVar != null && fVar.c() != null) {
                        intent.putExtra("path", fVar.c());
                        this.a.startActivity(intent);
                    }
                }
            }
        });
    }

    public e a() {
        return this.q;
    }

    ArrayList<f> a(String str, ArrayList<f> arrayList) {
        File file = (str == null || "".equals(str)) ? new File(j.n()) : new File(str);
        if (file != null && file.exists()) {
            for (File file2 : file2.listFiles()) {
                if (file2.isDirectory()) {
                    a(file2.getAbsolutePath(), (ArrayList) arrayList);
                } else {
                    f fVar = new f();
                    fVar.a(file2.getName());
                    fVar.a(0);
                    fVar.b(file2.getAbsolutePath());
                    fVar.b(0);
                    try {
                        FileInputStream fileInputStream = new FileInputStream(new File(fVar.c()));
                        long size = fileInputStream.getChannel().size() / FimiMediaMeta.AV_CH_SIDE_RIGHT;
                        if (size > 0) {
                            if (size > FimiMediaMeta.AV_CH_SIDE_RIGHT) {
                                DecimalFormat decimalFormat = new DecimalFormat("######0.00");
                                fVar.c(String.format("%s %s", new Object[]{decimalFormat.format(((double) size) / 1024.0d), "M"}));
                            } else {
                                fVar.c(String.format("%d %s", new Object[]{Integer.valueOf((int) size), "K"}));
                            }
                            fileInputStream.close();
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
                            String replace = file2.getName().replace(".txt", "").replace("&synced", "").replace(".sf", "");
                            String[] split = replace.split(" ");
                            if (split != null && split.length > 0) {
                                replace = split[1].replace(SignatureVisitor.SUPER, ':');
                                if (!replace.contains(":") && replace.length() > 4) {
                                    replace = replace.substring(0, 2) + ":" + replace.substring(2, 4) + ":" + replace.substring(4, replace.length());
                                }
                                replace = split[0] + " " + replace;
                            }
                            fVar.a(simpleDateFormat.parse(replace).getTime());
                            arrayList.add(fVar);
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        return arrayList;
    }

    public ArrayList<f> b() {
        return this.s;
    }

    public ArrayList<f> c() {
        return this.i;
    }

    @SuppressLint({"StringFormatMatches"})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.back_btn:
                finish();
                return;
            case R.id.unall_btn:
                this.k.setVisibility(8);
                this.l.setVisibility(0);
                this.m.setVisibility(8);
                this.q.a(false);
                this.q.c(false);
                this.q.notifyDataSetChanged();
                this.j.clear();
                return;
            case R.id.all_btn:
                if (this.q.b()) {
                    this.j.clear();
                    this.q.c(false);
                    this.f.setText(R.string.select_all);
                } else {
                    this.f.setText(R.string.undo_select_all);
                    this.q.c(true);
                    this.j.clear();
                    if (this.i != null && this.i.size() > 0) {
                        Iterator it = this.i.iterator();
                        while (it.hasNext()) {
                            this.j.add((f) it.next());
                        }
                    }
                }
                this.c.setText(String.format(getResources().getString(R.string.has_select_num, new Object[]{Integer.valueOf(this.j.size())}), new Object[0]));
                return;
            case R.id.del_btn:
                if (this.j == null || this.j.size() <= 0) {
                    Toast.makeText(this, getString(R.string.make_sure_selected), 1).show();
                    return;
                } else {
                    new com.fimi.soul.view.f.a(this).a(getString(R.string.ensure_delete_selected)).c(17).b(getString(R.string.delete), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ FlyLogsActivity a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (this.a.j != null && this.a.j.size() > 0) {
                                for (int size = this.a.j.size() - 1; size >= 0; size--) {
                                    File file = new File(((f) this.a.j.get(size)).c());
                                    if (file.exists()) {
                                        file.delete();
                                    }
                                    File parentFile = file.getParentFile();
                                    if (parentFile != null && parentFile.isDirectory() && parentFile.listFiles().length == 0) {
                                        f fVar = new f();
                                        fVar.a(file.getName().split(" ")[0]);
                                        fVar.a(0);
                                        fVar.b(file.getPath());
                                        fVar.b(0);
                                        fVar.b(true);
                                        this.a.j.add(fVar);
                                    }
                                }
                                this.a.q.b(this.a.j);
                            }
                            this.a.q.a(false);
                            this.a.l.setVisibility(0);
                            this.a.m.setVisibility(8);
                            this.a.k.setVisibility(8);
                            this.a.q.c(false);
                            this.a.j.clear();
                        }
                    }).a(getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ FlyLogsActivity a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                            this.a.k.setVisibility(0);
                            this.a.m.setVisibility(0);
                            this.a.l.setVisibility(4);
                        }
                    }).a(getResources().getColor(R.color.dialog_ensure_hot)).a().show();
                    return;
                }
            case R.id.upload_btn:
                if (this.j == null || this.j.size() <= 0) {
                    Toast.makeText(this, getString(R.string.make_sure_upload_selected), 1).show();
                    return;
                } else {
                    new com.fimi.soul.view.f.a(this).a(getString(R.string.ensure_upload_selected)).c(17).b(getString(R.string.fly_upload_all_file), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ FlyLogsActivity a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (this.a.j != null && this.a.j.size() > 0) {
                                for (f fVar : this.a.j) {
                                    if (fVar.d() == 0) {
                                        this.a.q.a(fVar);
                                    }
                                }
                            }
                            this.a.q.a(false);
                            this.a.l.setVisibility(0);
                            this.a.m.setVisibility(8);
                            this.a.k.setVisibility(8);
                            this.a.q.c(false);
                            this.a.j.clear();
                        }
                    }).a(getString(R.string.cancel), new DialogInterface.OnClickListener(this) {
                        final /* synthetic */ FlyLogsActivity a;

                        {
                            this.a = r1;
                        }

                        public void onClick(DialogInterface dialogInterface, int i) {
                            this.a.k.setVisibility(0);
                            this.a.m.setVisibility(0);
                            this.a.l.setVisibility(4);
                        }
                    }).a(getResources().getColor(R.color.dialog_ensure_hot)).a().show();
                    return;
                }
            default:
                return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fly_logs_layout);
        this.a = (ImageView) findViewById(R.id.back_btn);
        this.a.setOnClickListener(this);
        this.b = (TextView) findViewById(R.id.fly_log_title);
        this.h = (ListView) findViewById(R.id.log_list);
        this.h.setOverScrollMode(2);
        this.c = (TextView) findViewById(R.id.del_title);
        this.f = (Button) findViewById(R.id.all_btn);
        this.g = (Button) findViewById(R.id.unall_btn);
        this.f.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.n = (ImageButton) findViewById(R.id.del_btn);
        this.n.setOnClickListener(this);
        this.o = (ImageButton) findViewById(R.id.upload_btn);
        this.o.setOnClickListener(this);
        this.e = (TextView) findViewById(R.id.upload_des);
        this.d = (TextView) findViewById(R.id.del_des);
        this.k = (RelativeLayout) findViewById(R.id.del_layout);
        this.l = (RelativeLayout) findViewById(R.id.title_layout);
        this.m = (LinearLayout) findViewById(R.id.bottom_layout);
        ao.a(getAssets(), getWindow().getDecorView());
        ao.a(getAssets(), this.b, this.c, this.d, this.e);
        getWindow().addFlags(128);
        d();
    }

    protected void onResume() {
        super.onResume();
    }

    protected void onStart() {
        super.onStart();
        this.i.clear();
        this.s = (ArrayList) this.i.clone();
        x.b(new Runnable(this) {
            final /* synthetic */ FlyLogsActivity a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.s = this.a.a(j.m(), this.a.s);
                Collections.sort(this.a.s, new a(this.a));
                this.a.a(this.a.s);
                this.a.r.sendEmptyMessage(10);
            }
        });
    }

    protected void onStop() {
        super.onStop();
    }
}
