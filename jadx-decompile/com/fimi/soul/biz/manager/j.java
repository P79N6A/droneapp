package com.fimi.soul.biz.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.SuggestBean;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.ae;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

public abstract class j implements Callback {
    List<NameValuePair> a = new ArrayList();
    public String b;
    public String c;
    public String d;
    public PlaneMsg e = null;
    public HashMap<Integer, k> f;
    private Context g;
    private Handler h;

    class a implements Runnable {
        int a;
        Object b;
        k c;
        final /* synthetic */ j d;

        public a(j jVar, int i, Object obj, k kVar) {
            this.d = jVar;
            this.a = i;
            this.b = obj;
            this.c = kVar;
        }

        public void run() {
            Object obj = null;
            try {
                obj = this.d.b(this.b);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Message obtainMessage = this.d.h.obtainMessage();
            obtainMessage.what = this.a;
            obtainMessage.obj = obj;
            this.d.h.sendMessage(obtainMessage);
        }
    }

    public j(Context context) {
        this.g = context;
        this.h = new Handler(this);
        this.f = new HashMap();
    }

    public String a() {
        return this.d;
    }

    public void a(Object obj) {
        for (Field field : obj.getClass().getDeclaredFields()) {
            String name = field.getName();
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
            String obj2 = field.getGenericType().toString();
            Method method = obj.getClass().getMethod("get" + name, new Class[0]);
            if (obj2 == null || !"java.util.List<java.lang.String>".equals(obj2)) {
                name = (String) method.invoke(obj, new Object[0]);
                if (name != null && name.length() > 0) {
                    this.a.add(new BasicNameValuePair(field.getName(), name));
                }
            } else {
                List<String> list = (List) method.invoke(obj, new Object[0]);
                if (list != null && list.size() > 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (String name2 : list) {
                        stringBuffer.append(name2);
                        stringBuffer.append(";");
                    }
                    this.a.add(new BasicNameValuePair("paramlist", stringBuffer.toString().substring(0, stringBuffer.length() - 1)));
                }
            }
        }
    }

    public PlaneMsg b(Object obj) {
        SuggestBean suggestBean = (SuggestBean) obj;
        this.a.add(new BasicNameValuePair("userID", suggestBean.getUserID()));
        this.a.add(new BasicNameValuePair("model", suggestBean.getModel()));
        this.a.add(new BasicNameValuePair("content", suggestBean.getContent()));
        this.a.add(new BasicNameValuePair("contact", suggestBean.getContact()));
        this.a.add(new BasicNameValuePair("commandCode", suggestBean.getCommandCode()));
        List<String> list = suggestBean.getList();
        if (list != null && list.size() > 0) {
            StringBuffer stringBuffer = new StringBuffer();
            for (String append : list) {
                stringBuffer.append(append);
                stringBuffer.append(";");
            }
            this.a.add(new BasicNameValuePair("paramlist", stringBuffer.toString().substring(0, stringBuffer.length() - 1)));
        }
        String append2 = NetUtil.b(com.fimi.soul.base.a.j, this.a, this.g);
        if (append2 == null || append2.length() == 0) {
            Log.e("error:", "respMsg is null");
            return null;
        }
        Log.i("Response:[%s]", append2);
        try {
            JSONObject jSONObject = new JSONObject(append2);
            this.e = (PlaneMsg) ae.b(PlaneMsg.class, append2);
        } catch (Exception e) {
            Log.i("Exception:[%s]", e.getMessage());
        }
        this.a = null;
        return this.e;
    }

    public boolean handleMessage(Message message) {
        if (message.obj != null) {
            ((k) this.f.get(Integer.valueOf(message.what))).a((PlaneMsg) message.obj, null);
        }
        return true;
    }
}
