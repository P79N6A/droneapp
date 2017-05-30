package com.fimi.soul.biz.l;

import android.content.Context;
import com.fimi.soul.base.a;
import com.fimi.soul.biz.m.c;
import com.fimi.soul.entity.BroadcastComment;
import com.fimi.soul.entity.BroadcastMode;
import com.fimi.soul.entity.Page;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import com.fimi.soul.utils.NetUtil;
import com.fimi.soul.utils.ae;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b
  implements c
{
  public PlaneMsg a(Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getBroadcastListPaging"));
    ((List)localObject).add(new BasicNameValuePair("userID", a.b(paramContext).getUserID()));
    ((List)localObject).add(new BasicNameValuePair("xiaomiID", a.b(paramContext).getXiaomiID()));
    localObject = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramContext = new PlaneMsg();
    try
    {
      localObject = new JSONObject((String)localObject);
      String str1 = ((JSONObject)localObject).getString("errorMessage");
      String str2 = ((JSONObject)localObject).getString("commandCode");
      String str3 = ((JSONObject)localObject).getString("errorCode");
      boolean bool = ((JSONObject)localObject).getBoolean("success");
      if (!((JSONObject)localObject).isNull("data")) {
        paramContext.setData(ae.a(BroadcastMode[].class, ((JSONObject)localObject).getJSONArray("data").toString()));
      }
      if (!((JSONObject)localObject).isNull("page")) {
        paramContext.setPage((Page)ae.b(Page.class, ((JSONObject)localObject).getJSONObject("page").toString()));
      }
      paramContext.setCommandCode(str2);
      paramContext.setErrorCode(str3);
      paramContext.setErrorMessage(str1);
      paramContext.setSuccess(bool);
      return paramContext;
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
      return paramContext;
    }
    catch (JsonParseException localJsonParseException)
    {
      localJsonParseException.printStackTrace();
      return paramContext;
    }
    catch (JsonMappingException localJsonMappingException)
    {
      localJsonMappingException.printStackTrace();
      return paramContext;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
    return paramContext;
  }
  
  public PlaneMsg a(Context paramContext, int paramInt)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getNewBroadcastList"));
    ((List)localObject).add(new BasicNameValuePair("userID", a.b(paramContext).getUserID()));
    ((List)localObject).add(new BasicNameValuePair("curPage", paramInt + ""));
    ((List)localObject).add(new BasicNameValuePair("pageSize", "10"));
    localObject = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramContext = new PlaneMsg();
    try
    {
      localObject = new JSONObject((String)localObject);
      String str1 = ((JSONObject)localObject).getString("errorMessage");
      String str2 = ((JSONObject)localObject).getString("commandCode");
      String str3 = ((JSONObject)localObject).getString("errorCode");
      boolean bool = ((JSONObject)localObject).getBoolean("success");
      if (!((JSONObject)localObject).isNull("data")) {
        paramContext.setData(ae.a(BroadcastMode[].class, ((JSONObject)localObject).getJSONArray("data").toString()));
      }
      if (!((JSONObject)localObject).isNull("page")) {
        paramContext.setPage((Page)ae.b(Page.class, ((JSONObject)localObject).getJSONObject("page").toString()));
      }
      paramContext.setCommandCode(str2);
      paramContext.setErrorCode(str3);
      paramContext.setErrorMessage(str1);
      paramContext.setSuccess(bool);
      return paramContext;
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
      return paramContext;
    }
    catch (JsonParseException localJsonParseException)
    {
      localJsonParseException.printStackTrace();
      return paramContext;
    }
    catch (JsonMappingException localJsonMappingException)
    {
      localJsonMappingException.printStackTrace();
      return paramContext;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
    return paramContext;
  }
  
  public PlaneMsg a(Context paramContext, BroadcastComment paramBroadcastComment)
  {
    String str1 = paramBroadcastComment.getBroadcastID();
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "addBroadcastComment"));
    ((List)localObject).add(new BasicNameValuePair("content", paramBroadcastComment.getContent()));
    ((List)localObject).add(new BasicNameValuePair("broadcastID", paramBroadcastComment.getBroadcastID()));
    ((List)localObject).add(new BasicNameValuePair("userID", paramBroadcastComment.getUserID()));
    ((List)localObject).add(new BasicNameValuePair("userCommentID", paramBroadcastComment.getUserCommentID()));
    ((List)localObject).add(new BasicNameValuePair("userCommentName", paramBroadcastComment.getUserCommentName()));
    localObject = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramBroadcastComment = new PlaneMsg();
    try
    {
      localObject = new JSONObject((String)localObject);
      String str2 = ((JSONObject)localObject).getString("errorMessage");
      String str3 = ((JSONObject)localObject).getString("commandCode");
      String str4 = ((JSONObject)localObject).getString("errorCode");
      boolean bool = ((JSONObject)localObject).getBoolean("success");
      if (bool) {
        return b(paramContext, str1, 1);
      }
      paramBroadcastComment.setCommandCode(str3);
      paramBroadcastComment.setErrorCode(str4);
      paramBroadcastComment.setErrorMessage(str2);
      paramBroadcastComment.setSuccess(bool);
      return paramBroadcastComment;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramBroadcastComment;
  }
  
  public PlaneMsg a(Context paramContext, String paramString, int paramInt)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getBroadcastListPaging"));
    ((List)localObject).add(new BasicNameValuePair("userID", paramString));
    ((List)localObject).add(new BasicNameValuePair("curPage", paramInt + ""));
    paramString = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramContext = new PlaneMsg();
    try
    {
      paramString = new JSONObject(paramString);
      localObject = paramString.getString("errorMessage");
      String str1 = paramString.getString("commandCode");
      String str2 = paramString.getString("errorCode");
      boolean bool = paramString.getBoolean("success");
      if (!paramString.isNull("data")) {
        paramContext.setData(ae.a(BroadcastMode[].class, paramString.getJSONArray("data").toString()));
      }
      if (!paramString.isNull("page")) {
        paramContext.setPage((Page)ae.b(Page.class, paramString.getJSONObject("page").toString()));
      }
      paramContext.setCommandCode(str1);
      paramContext.setErrorCode(str2);
      paramContext.setErrorMessage((String)localObject);
      paramContext.setSuccess(bool);
      return paramContext;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
      return paramContext;
    }
    catch (JsonParseException paramString)
    {
      paramString.printStackTrace();
      return paramContext;
    }
    catch (JsonMappingException paramString)
    {
      paramString.printStackTrace();
      return paramContext;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
    return paramContext;
  }
  
  public PlaneMsg a(Context paramContext, String paramString1, String paramString2)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "addPraise"));
    ((List)localObject).add(new BasicNameValuePair("broadcastID", paramString1));
    ((List)localObject).add(new BasicNameValuePair("userID", paramString2));
    paramString1 = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramContext = new PlaneMsg();
    try
    {
      paramString1 = new JSONObject(paramString1);
      paramString2 = paramString1.getString("errorMessage");
      localObject = paramString1.getString("commandCode");
      String str = paramString1.getString("errorCode");
      boolean bool = paramString1.getBoolean("success");
      if (!paramString1.isNull("data")) {
        paramContext.setData((BroadcastMode)ae.b(BroadcastMode.class, paramString1.getJSONObject("data").toString()));
      }
      paramContext.setCommandCode((String)localObject);
      paramContext.setErrorCode(str);
      paramContext.setErrorMessage(paramString2);
      paramContext.setSuccess(bool);
      return paramContext;
    }
    catch (JSONException paramString1)
    {
      paramString1.printStackTrace();
      return paramContext;
    }
    catch (JsonParseException paramString1)
    {
      paramString1.printStackTrace();
      return paramContext;
    }
    catch (JsonMappingException paramString1)
    {
      paramString1.printStackTrace();
      return paramContext;
    }
    catch (IOException paramString1)
    {
      paramString1.printStackTrace();
    }
    return paramContext;
  }
  
  public PlaneMsg a(BroadcastMode paramBroadcastMode, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "addBroadcast"));
    ((List)localObject).add(new BasicNameValuePair("content", paramBroadcastMode.getContent()));
    ((List)localObject).add(new BasicNameValuePair("imgUrl", paramBroadcastMode.getImgUrl()));
    ((List)localObject).add(new BasicNameValuePair("userID", paramBroadcastMode.getUserID()));
    ((List)localObject).add(new BasicNameValuePair("objectName", paramBroadcastMode.getObjectName()));
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramBroadcastMode = new PlaneMsg();
    try
    {
      paramContext = new JSONObject(paramContext);
      localObject = paramContext.getString("errorMessage");
      String str1 = paramContext.getString("commandCode");
      String str2 = paramContext.getString("errorCode");
      boolean bool = paramContext.getBoolean("success");
      if (!paramContext.isNull("data")) {
        paramBroadcastMode.setData((BroadcastMode)ae.b(BroadcastMode.class, paramContext.getJSONObject("data").toString()));
      }
      paramBroadcastMode.setCommandCode(str1);
      paramBroadcastMode.setErrorCode(str2);
      paramBroadcastMode.setErrorMessage((String)localObject);
      paramBroadcastMode.setSuccess(bool);
      return paramBroadcastMode;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
      return paramBroadcastMode;
    }
    catch (JsonParseException paramContext)
    {
      paramContext.printStackTrace();
      return paramBroadcastMode;
    }
    catch (JsonMappingException paramContext)
    {
      paramContext.printStackTrace();
      return paramBroadcastMode;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramBroadcastMode;
  }
  
  public PlaneMsg a(String paramString, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getContentById"));
    ((List)localObject).add(new BasicNameValuePair("contentid", paramString));
    paramString = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramContext = new PlaneMsg();
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      localObject = localJSONObject.getString("errorMessage");
      String str1 = localJSONObject.getString("commandCode");
      String str2 = localJSONObject.getString("errorCode");
      boolean bool = localJSONObject.getBoolean("success");
      if (!localJSONObject.isNull("data"))
      {
        paramString = localJSONObject.getJSONObject("data").toString();
        paramContext.setData((BroadcastMode)ae.b(BroadcastMode.class, paramString));
      }
      paramString = (BroadcastMode)ae.b(BroadcastMode.class, paramString);
      paramContext.setCommandCode(str1);
      paramContext.setData(paramString);
      paramContext.setErrorCode(str2);
      paramContext.setErrorMessage((String)localObject);
      paramContext.setSuccess(bool);
      return paramContext;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
      return paramContext;
    }
    catch (JsonParseException paramString)
    {
      paramString.printStackTrace();
      return paramContext;
    }
    catch (JsonMappingException paramString)
    {
      paramString.printStackTrace();
      return paramContext;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
    return paramContext;
  }
  
  public PlaneMsg b(Context paramContext, int paramInt)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getHotBroadCastList"));
    ((List)localObject).add(new BasicNameValuePair("userID", a.b(paramContext).getUserID()));
    ((List)localObject).add(new BasicNameValuePair("curPage", paramInt + ""));
    ((List)localObject).add(new BasicNameValuePair("pageSize", "10"));
    localObject = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramContext = new PlaneMsg();
    try
    {
      localObject = new JSONObject((String)localObject);
      String str1 = ((JSONObject)localObject).getString("errorMessage");
      String str2 = ((JSONObject)localObject).getString("commandCode");
      String str3 = ((JSONObject)localObject).getString("errorCode");
      boolean bool = ((JSONObject)localObject).getBoolean("success");
      if (!((JSONObject)localObject).isNull("data")) {
        paramContext.setData(ae.a(BroadcastMode[].class, ((JSONObject)localObject).getJSONArray("data").toString()));
      }
      if (!((JSONObject)localObject).isNull("page")) {
        paramContext.setPage((Page)ae.b(Page.class, ((JSONObject)localObject).getJSONObject("page").toString()));
      }
      paramContext.setCommandCode(str2);
      paramContext.setErrorCode(str3);
      paramContext.setErrorMessage(str1);
      paramContext.setSuccess(bool);
      return paramContext;
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
      return paramContext;
    }
    catch (JsonParseException localJsonParseException)
    {
      localJsonParseException.printStackTrace();
      return paramContext;
    }
    catch (JsonMappingException localJsonMappingException)
    {
      localJsonMappingException.printStackTrace();
      return paramContext;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
    return paramContext;
  }
  
  public PlaneMsg b(Context paramContext, String paramString, int paramInt)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getBroadcastCommentList"));
    ((List)localObject).add(new BasicNameValuePair("broadcastID", paramString));
    ((List)localObject).add(new BasicNameValuePair("curPage", paramInt + ""));
    paramString = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramContext = new PlaneMsg();
    try
    {
      paramString = new JSONObject(paramString);
      localObject = paramString.getString("errorMessage");
      String str1 = paramString.getString("commandCode");
      String str2 = paramString.getString("errorCode");
      boolean bool = paramString.getBoolean("success");
      if (!paramString.isNull("data")) {
        paramContext.setData(ae.a(BroadcastComment[].class, paramString.getJSONArray("data").toString()));
      }
      if (!paramString.isNull("page")) {
        paramContext.setPage((Page)ae.b(Page.class, paramString.getJSONObject("page").toString()));
      }
      paramContext.setCommandCode(str1);
      paramContext.setErrorCode(str2);
      paramContext.setErrorMessage((String)localObject);
      paramContext.setSuccess(bool);
      return paramContext;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
      return paramContext;
    }
    catch (JsonParseException paramString)
    {
      paramString.printStackTrace();
      return paramContext;
    }
    catch (JsonMappingException paramString)
    {
      paramString.printStackTrace();
      return paramContext;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
    return paramContext;
  }
  
  public PlaneMsg b(Context paramContext, String paramString1, String paramString2)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "addBroadcastCommentPraise"));
    ((List)localObject).add(new BasicNameValuePair("broadcastCommentID", paramString1));
    ((List)localObject).add(new BasicNameValuePair("userID", paramString2));
    paramString1 = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramContext = new PlaneMsg();
    try
    {
      paramString1 = new JSONObject(paramString1);
      paramString2 = paramString1.getString("errorMessage");
      localObject = paramString1.getString("commandCode");
      String str = paramString1.getString("errorCode");
      boolean bool = paramString1.getBoolean("success");
      if (!paramString1.isNull("data")) {
        paramContext.setData((BroadcastComment)ae.b(BroadcastComment.class, paramString1.getJSONObject("data").toString()));
      }
      paramContext.setCommandCode((String)localObject);
      paramContext.setErrorCode(str);
      paramContext.setErrorMessage(paramString2);
      paramContext.setSuccess(bool);
      return paramContext;
    }
    catch (JSONException paramString1)
    {
      paramString1.printStackTrace();
      return paramContext;
    }
    catch (JsonParseException paramString1)
    {
      paramString1.printStackTrace();
      return paramContext;
    }
    catch (JsonMappingException paramString1)
    {
      paramString1.printStackTrace();
      return paramContext;
    }
    catch (IOException paramString1)
    {
      paramString1.printStackTrace();
    }
    return paramContext;
  }
  
  public PlaneMsg b(BroadcastMode paramBroadcastMode, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "delBroadcast"));
    ((List)localObject).add(new BasicNameValuePair("broadCastID", paramBroadcastMode.getBroadcastID()));
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramBroadcastMode = new PlaneMsg();
    try
    {
      paramContext = new JSONObject(paramContext);
      localObject = paramContext.getString("errorMessage");
      String str1 = paramContext.getString("commandCode");
      String str2 = paramContext.getString("errorCode");
      boolean bool = paramContext.getBoolean("success");
      paramBroadcastMode.setCommandCode(str1);
      paramBroadcastMode.setErrorCode(str2);
      paramBroadcastMode.setErrorMessage((String)localObject);
      paramBroadcastMode.setSuccess(bool);
      return paramBroadcastMode;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramBroadcastMode;
  }
  
  public boolean b(String paramString, Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("commandCode", "delContentById"));
    localArrayList.add(new BasicNameValuePair("contentid", paramString));
    paramString = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", localArrayList, paramContext);
    try
    {
      boolean bool = new JSONObject(paramString).getBoolean("success");
      return bool;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
    }
    return false;
  }
  
  public PlaneMsg c(Context paramContext, String paramString, int paramInt)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getAttentionBroadcastList"));
    ((List)localObject).add(new BasicNameValuePair("userID", paramString));
    ((List)localObject).add(new BasicNameValuePair("curPage", paramInt + ""));
    ((List)localObject).add(new BasicNameValuePair("pageSize", "10"));
    paramString = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramContext = new PlaneMsg();
    try
    {
      paramString = new JSONObject(paramString);
      localObject = paramString.getString("errorMessage");
      String str1 = paramString.getString("commandCode");
      String str2 = paramString.getString("errorCode");
      boolean bool = paramString.getBoolean("success");
      if (!paramString.isNull("data")) {
        paramContext.setData(ae.a(BroadcastMode[].class, paramString.getJSONArray("data").toString()));
      }
      if (!paramString.isNull("page")) {
        paramContext.setPage((Page)ae.b(Page.class, paramString.getJSONObject("page").toString()));
      }
      paramContext.setCommandCode(str1);
      paramContext.setErrorCode(str2);
      paramContext.setErrorMessage((String)localObject);
      paramContext.setSuccess(bool);
      return paramContext;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
      return paramContext;
    }
    catch (JsonParseException paramString)
    {
      paramString.printStackTrace();
      return paramContext;
    }
    catch (JsonMappingException paramString)
    {
      paramString.printStackTrace();
      return paramContext;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
    return paramContext;
  }
  
  public PlaneMsg c(BroadcastMode paramBroadcastMode, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "addInform"));
    ((List)localObject).add(new BasicNameValuePair("userID", paramBroadcastMode.getUserID()));
    ((List)localObject).add(new BasicNameValuePair("content", paramBroadcastMode.getContent()));
    ((List)localObject).add(new BasicNameValuePair("broadcastID", paramBroadcastMode.getBroadcastID()));
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramBroadcastMode = new PlaneMsg();
    try
    {
      paramContext = new JSONObject(paramContext);
      localObject = paramContext.getString("errorMessage");
      String str1 = paramContext.getString("commandCode");
      String str2 = paramContext.getString("errorCode");
      boolean bool = paramContext.getBoolean("success");
      paramBroadcastMode.setCommandCode(str1);
      paramBroadcastMode.setErrorCode(str2);
      paramBroadcastMode.setErrorMessage((String)localObject);
      paramBroadcastMode.setSuccess(bool);
      return paramBroadcastMode;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramBroadcastMode;
  }
  
  public PlaneMsg c(String paramString, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getBroadCast"));
    ((List)localObject).add(new BasicNameValuePair("broadcastID", paramString));
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramString = new PlaneMsg();
    try
    {
      paramContext = new JSONObject(paramContext);
      localObject = paramContext.getString("errorMessage");
      String str1 = paramContext.getString("commandCode");
      String str2 = paramContext.getString("errorCode");
      boolean bool = paramContext.getBoolean("success");
      if (!paramContext.isNull("data")) {
        paramString.setData((BroadcastMode)ae.b(BroadcastMode.class, paramContext.getJSONObject("data").toString()));
      }
      paramString.setCommandCode(str1);
      paramString.setErrorCode(str2);
      paramString.setErrorMessage((String)localObject);
      paramString.setSuccess(bool);
      return paramString;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
      return paramString;
    }
    catch (JsonParseException paramContext)
    {
      paramContext.printStackTrace();
      return paramString;
    }
    catch (JsonMappingException paramContext)
    {
      paramContext.printStackTrace();
      return paramString;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramString;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/l/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */