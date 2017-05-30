package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

@aaa
public class xm
{
  public List<String> a(JSONObject paramJSONObject, String paramString)
  {
    paramJSONObject = paramJSONObject.optJSONArray(paramString);
    if (paramJSONObject != null)
    {
      paramString = new ArrayList(paramJSONObject.length());
      int i = 0;
      while (i < paramJSONObject.length())
      {
        paramString.add(paramJSONObject.getString(i));
        i += 1;
      }
      return Collections.unmodifiableList(paramString);
    }
    return null;
  }
  
  public void a(Context paramContext, String paramString1, abi paramabi, String paramString2, boolean paramBoolean, List<String> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return;
    }
    if (paramBoolean) {}
    for (String str = "1";; str = "0")
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = ((String)localIterator.next()).replaceAll("@gw_adlocid@", paramString2).replaceAll("@gw_adnetrefresh@", str).replaceAll("@gw_qdata@", paramabi.r.h).replaceAll("@gw_sdkver@", paramString1).replaceAll("@gw_sessid@", u.i().a()).replaceAll("@gw_seqnum@", paramabi.i);
        paramList = (List<String>)localObject;
        if (!TextUtils.isEmpty(paramabi.u)) {
          paramList = ((String)localObject).replaceAll("@gw_adnetstatus@", paramabi.u);
        }
        localObject = paramList;
        if (paramabi.o != null) {
          localObject = paramList.replaceAll("@gw_adnetid@", paramabi.o.b).replaceAll("@gw_allocid@", paramabi.o.d);
        }
        paramList = (Future)new acg(paramContext, paramString1, (String)localObject).e();
      }
      break;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/xm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */