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
import java.util.Iterator;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

public abstract class j
  implements Handler.Callback
{
  List<NameValuePair> a = new ArrayList();
  public String b;
  public String c;
  public String d;
  public PlaneMsg e = null;
  public HashMap<Integer, k> f;
  private Context g;
  private Handler h;
  
  public j(Context paramContext)
  {
    this.g = paramContext;
    this.h = new Handler(this);
    this.f = new HashMap();
  }
  
  public String a()
  {
    return this.d;
  }
  
  public void a(Object paramObject)
  {
    Field[] arrayOfField = paramObject.getClass().getDeclaredFields();
    int j = arrayOfField.length;
    int i = 0;
    if (i < j)
    {
      Object localObject1 = arrayOfField[i];
      Object localObject2 = ((Field)localObject1).getName();
      Object localObject3 = ((String)localObject2).substring(0, 1).toUpperCase() + ((String)localObject2).substring(1);
      localObject2 = ((Field)localObject1).getGenericType().toString();
      localObject3 = paramObject.getClass().getMethod("get" + (String)localObject3, new Class[0]);
      if ((localObject2 != null) && ("java.util.List<java.lang.String>".equals(localObject2)))
      {
        localObject2 = (List)((Method)localObject3).invoke(paramObject, new Object[0]);
        if ((localObject2 != null) && (((List)localObject2).size() > 0))
        {
          localObject1 = new StringBuffer();
          localObject2 = ((List)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            ((StringBuffer)localObject1).append((String)((Iterator)localObject2).next());
            ((StringBuffer)localObject1).append(";");
          }
          this.a.add(new BasicNameValuePair("paramlist", ((StringBuffer)localObject1).toString().substring(0, ((StringBuffer)localObject1).length() - 1)));
        }
      }
      for (;;)
      {
        i += 1;
        break;
        localObject2 = (String)((Method)localObject3).invoke(paramObject, new Object[0]);
        if ((localObject2 != null) && (((String)localObject2).length() > 0)) {
          this.a.add(new BasicNameValuePair(((Field)localObject1).getName(), (String)localObject2));
        }
      }
    }
  }
  
  public PlaneMsg b(Object paramObject)
  {
    paramObject = (SuggestBean)paramObject;
    this.a.add(new BasicNameValuePair("userID", ((SuggestBean)paramObject).getUserID()));
    this.a.add(new BasicNameValuePair("model", ((SuggestBean)paramObject).getModel()));
    this.a.add(new BasicNameValuePair("content", ((SuggestBean)paramObject).getContent()));
    this.a.add(new BasicNameValuePair("contact", ((SuggestBean)paramObject).getContact()));
    this.a.add(new BasicNameValuePair("commandCode", ((SuggestBean)paramObject).getCommandCode()));
    Object localObject = ((SuggestBean)paramObject).getList();
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      paramObject = new StringBuffer();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        ((StringBuffer)paramObject).append((String)((Iterator)localObject).next());
        ((StringBuffer)paramObject).append(";");
      }
      this.a.add(new BasicNameValuePair("paramlist", ((StringBuffer)paramObject).toString().substring(0, ((StringBuffer)paramObject).length() - 1)));
    }
    paramObject = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", this.a, this.g);
    if ((paramObject == null) || (((String)paramObject).length() == 0))
    {
      Log.e("error:", "respMsg is null");
      return null;
    }
    Log.i("Response:[%s]", (String)paramObject);
    try
    {
      new JSONObject((String)paramObject);
      this.e = ((PlaneMsg)ae.b(PlaneMsg.class, (String)paramObject));
      this.a = null;
      return this.e;
    }
    catch (Exception paramObject)
    {
      for (;;)
      {
        Log.i("Exception:[%s]", ((Exception)paramObject).getMessage());
      }
    }
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (paramMessage.obj != null) {
      ((k)this.f.get(Integer.valueOf(paramMessage.what))).a((PlaneMsg)paramMessage.obj, null);
    }
    return true;
  }
  
  class a
    implements Runnable
  {
    int a;
    Object b;
    k c;
    
    public a(int paramInt, Object paramObject, k paramk)
    {
      this.a = paramInt;
      this.b = paramObject;
      this.c = paramk;
    }
    
    public void run()
    {
      Object localObject1 = null;
      try
      {
        localObject2 = j.this.b(this.b);
        localObject1 = localObject2;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject2;
          localException.printStackTrace();
        }
      }
      localObject2 = j.a(j.this).obtainMessage();
      ((Message)localObject2).what = this.a;
      ((Message)localObject2).obj = localObject1;
      j.a(j.this).sendMessage((Message)localObject2);
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/manager/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */