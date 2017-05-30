package com.fimi.soul.module.a.a.a;

import android.graphics.drawable.ColorDrawable;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import com.facebook.common.util.UriUtil;
import com.fimi.soul.entity.User;
import com.mob.tools.gui.PullToRequestListAdapter;
import com.mob.tools.gui.PullToRequestView;
import com.mob.tools.utils.UIHandler;
import com.tencent.open.SocialConstants;
import com.xiaomi.market.sdk.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class c extends PullToRequestListAdapter implements PlatformActionListener {
    private e a;
    private boolean b;
    private Platform c;
    private final int d = 15;
    private int e;
    private ArrayList<b> f;
    private HashMap<String, Boolean> g;
    private g h;
    private float i;

    private static class a {
        public ArrayList<b> a;
        public boolean b;

        private a() {
            this.b = false;
        }
    }

    public static class b {
        public boolean a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
    }

    public c(e eVar, PullToRequestView pullToRequestView) {
        super(pullToRequestView);
        this.a = eVar;
        this.e = -1;
        this.b = true;
        this.g = new HashMap();
        this.f = new ArrayList();
        getListView().setDivider(new ColorDrawable(-1381654));
    }

    private a a(String str, HashMap<String, Object> hashMap, HashMap<String, Boolean> hashMap2) {
        boolean z = false;
        if (hashMap == null || hashMap.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it;
        HashMap hashMap3;
        String valueOf;
        b bVar;
        if ("SinaWeibo".equals(str)) {
            it = ((ArrayList) hashMap.get("users")).iterator();
            while (it.hasNext()) {
                hashMap3 = (HashMap) it.next();
                valueOf = String.valueOf(hashMap3.get("id"));
                if (!hashMap2.containsKey(valueOf)) {
                    bVar = new b();
                    bVar.d = valueOf;
                    bVar.b = String.valueOf(hashMap3.get(User.FN_NAME));
                    bVar.c = String.valueOf(hashMap3.get("description"));
                    bVar.e = String.valueOf(hashMap3.get("profile_image_url"));
                    bVar.f = bVar.b;
                    hashMap2.put(bVar.d, Boolean.valueOf(true));
                    arrayList.add(bVar);
                }
            }
            z = ((Integer) hashMap.get("total_number")).intValue() > hashMap2.size();
        } else if ("TencentWeibo".equals(str)) {
            boolean z2 = ((Integer) hashMap.get("hasnext")).intValue() == 0;
            Iterator it2 = ((ArrayList) hashMap.get(j.ag)).iterator();
            while (it2.hasNext()) {
                hashMap3 = (HashMap) it2.next();
                String valueOf2 = String.valueOf(hashMap3.get(User.FN_NAME));
                if (!hashMap2.containsKey(valueOf2)) {
                    bVar = new b();
                    bVar.b = String.valueOf(hashMap3.get("nick"));
                    bVar.d = valueOf2;
                    bVar.f = valueOf2;
                    r1 = ((ArrayList) hashMap3.get("tweet")).iterator();
                    if (r1.hasNext()) {
                        bVar.c = String.valueOf(((HashMap) r1.next()).get("text"));
                    }
                    bVar.e = String.valueOf(hashMap3.get("head")) + "/100";
                    hashMap2.put(bVar.d, Boolean.valueOf(true));
                    arrayList.add(bVar);
                }
            }
            z = z2;
        } else if ("Facebook".equals(str)) {
            r1 = ((ArrayList) hashMap.get(UriUtil.DATA_SCHEME)).iterator();
            while (r1.hasNext()) {
                hashMap3 = (HashMap) r1.next();
                String valueOf3 = String.valueOf(hashMap3.get("id"));
                if (!hashMap2.containsKey(valueOf3)) {
                    b bVar2 = new b();
                    bVar2.d = valueOf3;
                    bVar2.f = "[" + valueOf3 + "]";
                    bVar2.b = String.valueOf(hashMap3.get(User.FN_NAME));
                    hashMap3 = (HashMap) hashMap3.get(SocialConstants.PARAM_AVATAR_URI);
                    if (hashMap3 != null) {
                        bVar2.e = String.valueOf(((HashMap) hashMap3.get(UriUtil.DATA_SCHEME)).get("url"));
                    }
                    hashMap2.put(bVar2.d, Boolean.valueOf(true));
                    arrayList.add(bVar2);
                }
            }
            z = ((HashMap) hashMap.get("paging")).containsKey("next");
        } else if ("Twitter".equals(str)) {
            it = ((ArrayList) hashMap.get("users")).iterator();
            while (it.hasNext()) {
                hashMap3 = (HashMap) it.next();
                valueOf = String.valueOf(hashMap3.get("screen_name"));
                if (!hashMap2.containsKey(valueOf)) {
                    bVar = new b();
                    bVar.d = valueOf;
                    bVar.f = valueOf;
                    bVar.b = String.valueOf(hashMap3.get(User.FN_NAME));
                    bVar.c = String.valueOf(hashMap3.get("description"));
                    bVar.e = String.valueOf(hashMap3.get("profile_image_url"));
                    hashMap2.put(bVar.d, Boolean.valueOf(true));
                    arrayList.add(bVar);
                }
            }
        }
        a aVar = new a();
        aVar.a = arrayList;
        aVar.b = z;
        return aVar;
    }

    private void a() {
        if (this.b) {
            this.c.listFriend(15, this.e + 1, null);
        }
    }

    public b a(int i) {
        return (b) this.f.get(i);
    }

    public void a(float f) {
        this.i = f;
        ListView listView = getListView();
        if (f < 1.0f) {
            f = 1.0f;
        }
        listView.setDividerHeight((int) f);
    }

    public void a(OnItemClickListener onItemClickListener) {
        getListView().setOnItemClickListener(onItemClickListener);
    }

    public void a(Platform platform) {
        this.c = platform;
        platform.setPlatformActionListener(this);
    }

    public int getCount() {
        return this.f == null ? 0 : this.f.size();
    }

    public View getFooterView() {
        View linearLayout = new LinearLayout(getContext());
        linearLayout.setMinimumHeight(10);
        return linearLayout;
    }

    public View getHeaderView() {
        if (this.h == null) {
            this.h = new g(getContext());
        }
        return this.h;
    }

    public /* synthetic */ Object getItem(int i) {
        return a(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View dVar = view == null ? new d(viewGroup.getContext(), this.i) : view;
        ((d) dVar).a(a(i), isFling());
        if (i == getCount() - 1) {
            a();
        }
        return dVar;
    }

    public void onCancel(Platform platform, int i) {
        UIHandler.sendEmptyMessage(0, new Callback(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public boolean handleMessage(Message message) {
                this.a.a.finish();
                return false;
            }
        });
    }

    public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
        final a a = a(this.c.getName(), hashMap, this.g);
        if (a == null) {
            UIHandler.sendEmptyMessage(0, new Callback(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public boolean handleMessage(Message message) {
                    this.a.notifyDataSetChanged();
                    return false;
                }
            });
            return;
        }
        this.b = a.b;
        if (a.a != null && a.a.size() > 0) {
            this.e++;
            Message message = new Message();
            message.what = 1;
            message.obj = a.a;
            UIHandler.sendMessage(message, new Callback(this) {
                final /* synthetic */ c b;

                public boolean handleMessage(Message message) {
                    if (this.b.e <= 0) {
                        this.b.f.clear();
                    }
                    this.b.f.addAll(a.a);
                    this.b.notifyDataSetChanged();
                    return false;
                }
            });
        }
    }

    public void onError(Platform platform, int i, Throwable th) {
        th.printStackTrace();
    }

    public void onPullDown(int i) {
        this.h.a(i);
    }

    public void onRefresh() {
        this.h.a();
        this.e = -1;
        this.b = true;
        this.g.clear();
        a();
    }

    public void onReversed() {
        this.h.b();
    }
}
