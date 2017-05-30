package com.fimi.soul.biz.l;

import android.content.Context;
import com.fimi.soul.base.a;
import com.fimi.soul.biz.m.n;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.SumFlyDataByMonth;
import com.fimi.soul.entity.UpdateDroneItem;
import com.fimi.soul.entity.UpdatePlannerBackdata;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.ae;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

public class r
  implements n
{
  public PlaneMsg a(Context paramContext)
  {
    return null;
  }
  
  public PlaneMsg a(UpdateDroneItem paramUpdateDroneItem, Context paramContext)
  {
    Object localObject2 = new ArrayList();
    ((List)localObject2).add(new BasicNameValuePair("commandCode", "addPlaneAction"));
    ((List)localObject2).add(new BasicNameValuePair("flyJourney", paramUpdateDroneItem.getDistance() + ""));
    ((List)localObject2).add(new BasicNameValuePair("flyTimeSum", paramUpdateDroneItem.getSportTime() + ""));
    ((List)localObject2).add(new BasicNameValuePair("flyFileUrl", paramUpdateDroneItem.getUploadurl()));
    if (paramUpdateDroneItem.getPlaneID() == null) {}
    for (Object localObject1 = "123";; localObject1 = paramUpdateDroneItem.getPlaneID())
    {
      ((List)localObject2).add(new BasicNameValuePair("planeID", (String)localObject1));
      ((List)localObject2).add(new BasicNameValuePair("userID", a.b(paramContext).getUserID()));
      ((List)localObject2).add(new BasicNameValuePair("startDate", paramUpdateDroneItem.getRecord_time()));
      ((List)localObject2).add(new BasicNameValuePair("endDate", paramUpdateDroneItem.getEndddata()));
      ((List)localObject2).add(new BasicNameValuePair("year", paramUpdateDroneItem.getYear() + ""));
      ((List)localObject2).add(new BasicNameValuePair("month", paramUpdateDroneItem.getMonth() + ""));
      ((List)localObject2).add(new BasicNameValuePair("maxHight", paramUpdateDroneItem.getMaxhight() + ""));
      ((List)localObject2).add(new BasicNameValuePair("latitude", paramUpdateDroneItem.getLatitude() + ""));
      ((List)localObject2).add(new BasicNameValuePair("latitude", paramUpdateDroneItem.getLongitude() + ""));
      ((List)localObject2).add(new BasicNameValuePair("fcType ", paramUpdateDroneItem.getFcType()));
      paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject2, paramContext);
      paramUpdateDroneItem = new PlaneMsg();
      try
      {
        paramContext = new JSONObject(paramContext);
        localObject1 = (UpdatePlannerBackdata)ae.b(UpdatePlannerBackdata.class, paramContext.get("data").toString());
        localObject2 = paramContext.getString("errorMessage");
        String str1 = paramContext.getString("commandCode");
        String str2 = paramContext.getString("errorCode");
        boolean bool = paramContext.getBoolean("success");
        paramUpdateDroneItem.setCommandCode(str1);
        paramUpdateDroneItem.setErrorCode(str2);
        paramUpdateDroneItem.setErrorMessage((String)localObject2);
        paramUpdateDroneItem.setSuccess(bool);
        paramUpdateDroneItem.setData(localObject1);
        return paramUpdateDroneItem;
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
      }
    }
    return paramUpdateDroneItem;
  }
  
  public PlaneMsg a(String paramString, Context paramContext)
  {
    return null;
  }
  
  public PlaneMsg a(String paramString1, String paramString2, int paramInt, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getPlaneActionListByMonth"));
    ((List)localObject).add(new BasicNameValuePair("userID", paramString1));
    ((List)localObject).add(new BasicNameValuePair("monthDate", paramString2));
    ((List)localObject).add(new BasicNameValuePair("curPage", "1"));
    paramString2 = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramString1 = new PlaneMsg();
    try
    {
      paramString2 = new JSONObject(paramString2);
      paramContext = ae.a(UpdatePlannerBackdata[].class, paramString2.get("data").toString());
      localObject = paramString2.getString("errorMessage");
      String str1 = paramString2.getString("commandCode");
      String str2 = paramString2.getString("errorCode");
      boolean bool = paramString2.getBoolean("success");
      paramString1.setCommandCode(str1);
      paramString1.setErrorCode(str2);
      paramString1.setErrorMessage((String)localObject);
      paramString1.setSuccess(bool);
      paramString1.setData(paramContext);
      return paramString1;
    }
    catch (Exception paramString2)
    {
      paramString2.printStackTrace();
    }
    return paramString1;
  }
  
  public PlaneMsg b(UpdateDroneItem paramUpdateDroneItem, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "delPlaneActoin"));
    ((List)localObject).add(new BasicNameValuePair("planeActionID", paramUpdateDroneItem.getFlag() + ""));
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramUpdateDroneItem = new PlaneMsg();
    try
    {
      paramContext = new JSONObject(paramContext);
      localObject = paramContext.getString("errorMessage");
      String str1 = paramContext.getString("commandCode");
      String str2 = paramContext.getString("errorCode");
      boolean bool = paramContext.getBoolean("success");
      paramUpdateDroneItem.setCommandCode(str1);
      paramUpdateDroneItem.setErrorCode(str2);
      paramUpdateDroneItem.setErrorMessage((String)localObject);
      paramUpdateDroneItem.setSuccess(bool);
      return paramUpdateDroneItem;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramUpdateDroneItem;
  }
  
  public boolean b(String paramString, Context paramContext)
  {
    return false;
  }
  
  public PlaneMsg c(String paramString, Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("commandCode", "addPlaneActionList"));
    localArrayList.add(new BasicNameValuePair("jsonContent", paramString));
    paramContext = NetUtil.a("https://fimiservice-us.mi-ae.com/android/fimi.service", localArrayList, paramContext);
    paramString = new PlaneMsg();
    try
    {
      paramContext = new JSONObject(paramContext);
      localArrayList = ae.a(UpdatePlannerBackdata[].class, paramContext.get("data").toString());
      String str1 = paramContext.getString("errorMessage");
      String str2 = paramContext.getString("commandCode");
      String str3 = paramContext.getString("errorCode");
      boolean bool = paramContext.getBoolean("success");
      paramString.setCommandCode(str2);
      paramString.setErrorCode(str3);
      paramString.setErrorMessage(str1);
      paramString.setSuccess(bool);
      paramString.setData(localArrayList);
      return paramString;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramString;
  }
  
  public PlaneMsg d(String paramString, Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("commandCode", "getPlaneActionListByUserID"));
    localArrayList.add(new BasicNameValuePair("userID", paramString));
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", localArrayList, paramContext);
    paramString = new PlaneMsg();
    try
    {
      paramContext = new JSONObject(paramContext);
      localArrayList = ae.a(UpdatePlannerBackdata[].class, paramContext.get("data").toString());
      String str1 = paramContext.getString("errorMessage");
      String str2 = paramContext.getString("commandCode");
      String str3 = paramContext.getString("errorCode");
      boolean bool = paramContext.getBoolean("success");
      paramString.setCommandCode(str2);
      paramString.setErrorCode(str3);
      paramString.setErrorMessage(str1);
      paramString.setSuccess(bool);
      paramString.setData(localArrayList);
      return paramString;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramString;
  }
  
  public PlaneMsg e(String paramString, Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("commandCode", "sumFlyDataByMonth"));
    localArrayList.add(new BasicNameValuePair("userID", paramString));
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", localArrayList, paramContext);
    paramString = new PlaneMsg();
    try
    {
      paramContext = new JSONObject(paramContext);
      localArrayList = ae.a(SumFlyDataByMonth[].class, paramContext.get("data").toString());
      String str1 = paramContext.getString("errorMessage");
      String str2 = paramContext.getString("commandCode");
      String str3 = paramContext.getString("errorCode");
      boolean bool = paramContext.getBoolean("success");
      paramString.setCommandCode(str2);
      paramString.setErrorCode(str3);
      paramString.setErrorMessage(str1);
      paramString.setSuccess(bool);
      paramString.setData(localArrayList);
      return paramString;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/l/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */