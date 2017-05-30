package com.fimi.soul.biz.l;

import android.content.Context;
import android.location.Location;
import android.util.Log;
import com.fimi.soul.base.a;
import com.fimi.soul.biz.manager.MyLocationManager;
import com.fimi.soul.entity.FlightTimeInfo;
import com.fimi.soul.entity.NearPerson;
import com.fimi.soul.entity.Page;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.Relation;
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

public class s
  implements com.fimi.soul.biz.m.o
{
  private static String a = "/user/profile";
  private MyLocationManager b;
  
  public s(Context paramContext)
  {
    this.b = MyLocationManager.a(paramContext);
  }
  
  public PlaneMsg a(Context paramContext)
  {
    Object localObject1 = new ArrayList();
    ((List)localObject1).add(new BasicNameValuePair("commandCode", "getAllUsers"));
    localObject1 = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject1, paramContext);
    paramContext = new PlaneMsg();
    try
    {
      Object localObject2 = new JSONObject((String)localObject1);
      localObject1 = ((JSONObject)localObject2).getString("errorMessage");
      String str1 = ((JSONObject)localObject2).getString("commandCode");
      String str2 = ((JSONObject)localObject2).getString("errorCode");
      boolean bool = ((JSONObject)localObject2).getBoolean("success");
      localObject2 = ae.a(User[].class, ((JSONObject)localObject2).getJSONArray("data").toString());
      paramContext.setCommandCode(str1);
      paramContext.setData(localObject2);
      paramContext.setErrorCode(str2);
      paramContext.setErrorMessage((String)localObject1);
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
  
  public PlaneMsg a(Relation paramRelation, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "addUserRelation"));
    ((List)localObject).add(new BasicNameValuePair("userID", paramRelation.getUserID()));
    ((List)localObject).add(new BasicNameValuePair("relationID", paramRelation.getRelationID()));
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramRelation = new PlaneMsg();
    try
    {
      paramContext = new JSONObject(paramContext);
      localObject = paramContext.getString("errorMessage");
      String str1 = paramContext.getString("commandCode");
      String str2 = paramContext.getString("errorCode");
      boolean bool = paramContext.getBoolean("success");
      if (!paramContext.isNull("data")) {
        paramRelation.setData((Relation)ae.b(Relation.class, paramContext.getJSONObject("data").toString()));
      }
      paramRelation.setCommandCode(str1);
      paramRelation.setErrorCode(str2);
      paramRelation.setErrorMessage((String)localObject);
      paramRelation.setSuccess(bool);
      return paramRelation;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
      return paramRelation;
    }
    catch (JsonParseException paramContext)
    {
      paramContext.printStackTrace();
      return paramRelation;
    }
    catch (JsonMappingException paramContext)
    {
      paramContext.printStackTrace();
      return paramRelation;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramRelation;
  }
  
  public PlaneMsg a(User paramUser, int paramInt, String paramString, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "selectNearbyPerson"));
    ((List)localObject).add(new BasicNameValuePair("userID", paramUser.getUserID()));
    ((List)localObject).add(new BasicNameValuePair("sex", paramUser.getSex()));
    ((List)localObject).add(new BasicNameValuePair("curLongitude", paramUser.getCurLongitude()));
    ((List)localObject).add(new BasicNameValuePair("curLatitude", paramUser.getCurLatitude()));
    ((List)localObject).add(new BasicNameValuePair("curPage", paramInt + ""));
    ((List)localObject).add(new BasicNameValuePair("pageSize", "20"));
    ((List)localObject).add(new BasicNameValuePair("distance", paramString));
    paramString = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramUser = new PlaneMsg();
    try
    {
      paramString = new JSONObject(paramString);
      paramContext = paramString.getString("errorMessage");
      localObject = paramString.getString("commandCode");
      String str = paramString.getString("errorCode");
      boolean bool = paramString.getBoolean("success");
      if (!paramString.isNull("data")) {
        paramUser.setData(ae.a(NearPerson[].class, paramString.getJSONArray("data").toString()));
      }
      if (!paramString.isNull("page")) {
        paramUser.setPage((Page)ae.b(Page.class, paramString.getJSONObject("page").toString()));
      }
      paramUser.setCommandCode((String)localObject);
      paramUser.setErrorCode(str);
      paramUser.setErrorMessage(paramContext);
      paramUser.setSuccess(bool);
      return paramUser;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
      return paramUser;
    }
    catch (JsonParseException paramString)
    {
      paramString.printStackTrace();
      return paramUser;
    }
    catch (JsonMappingException paramString)
    {
      paramString.printStackTrace();
      return paramUser;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
    return paramUser;
  }
  
  public PlaneMsg a(User paramUser, Context paramContext)
  {
    Object localObject1 = new ArrayList();
    ((List)localObject1).add(new BasicNameValuePair("commandCode", "register"));
    ((List)localObject1).add(new BasicNameValuePair("name", paramUser.getName()));
    ((List)localObject1).add(new BasicNameValuePair("signature", paramUser.getSignature()));
    ((List)localObject1).add(new BasicNameValuePair("country", paramUser.getCountry()));
    ((List)localObject1).add(new BasicNameValuePair("nickName", paramUser.getNickName()));
    ((List)localObject1).add(new BasicNameValuePair("userIDs", paramUser.getUserIDs()));
    ((List)localObject1).add(new BasicNameValuePair("xiaomiID", paramUser.getXiaomiID()));
    ((List)localObject1).add(new BasicNameValuePair("device", paramUser.getDevice()));
    ((List)localObject1).add(new BasicNameValuePair("sex", paramUser.getSex()));
    ((List)localObject1).add(new BasicNameValuePair("phone", paramUser.getPhone()));
    ((List)localObject1).add(new BasicNameValuePair("userImgUrl", paramUser.getUserImgUrl()));
    Location localLocation = this.b.c();
    if ((localLocation != null) && (com.fimi.soul.biz.manager.o.a(paramContext).d()))
    {
      ((List)localObject1).add(new BasicNameValuePair("curLongitude", this.b.b() + ""));
      ((List)localObject1).add(new BasicNameValuePair("curLatitude", this.b.a() + ""));
    }
    localObject1 = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject1, paramContext);
    paramUser = new PlaneMsg();
    try
    {
      Object localObject2 = new JSONObject((String)localObject1);
      localObject1 = ((JSONObject)localObject2).getString("errorMessage");
      String str1 = ((JSONObject)localObject2).getString("commandCode");
      String str2 = ((JSONObject)localObject2).getString("errorCode");
      boolean bool = ((JSONObject)localObject2).getBoolean("success");
      if (!((JSONObject)localObject2).isNull("data"))
      {
        localObject2 = (User)ae.b(User.class, ((JSONObject)localObject2).getJSONObject("data").toString());
        if ((localLocation != null) && (0.0D != localLocation.getLatitude()) && (0.0D != localLocation.getLongitude()))
        {
          ((User)localObject2).setCurLongitude(this.b.b() + "");
          ((User)localObject2).setCurLatitude(this.b.a() + "");
        }
        if (bool) {
          a.a(paramContext, (User)localObject2);
        }
        paramUser.setData(localObject2);
      }
      paramUser.setCommandCode(str1);
      paramUser.setErrorCode(str2);
      paramUser.setErrorMessage((String)localObject1);
      paramUser.setSuccess(bool);
      return paramUser;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
      return paramUser;
    }
    catch (JsonParseException paramContext)
    {
      paramContext.printStackTrace();
      return paramUser;
    }
    catch (JsonMappingException paramContext)
    {
      paramContext.printStackTrace();
      return paramUser;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramUser;
  }
  
  public PlaneMsg a(String paramString, int paramInt, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "selectNickName"));
    ((List)localObject).add(new BasicNameValuePair("nickName", paramString));
    ((List)localObject).add(new BasicNameValuePair("curPage", paramInt + ""));
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
        paramString.setData(ae.a(User[].class, paramContext.getJSONArray("data").toString()));
      }
      if (!paramContext.isNull("page")) {
        paramString.setPage((Page)ae.b(Page.class, paramContext.getJSONObject("page").toString()));
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
  
  public PlaneMsg a(String paramString, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getUserById"));
    ((List)localObject).add(new BasicNameValuePair("userid", paramString));
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
        paramContext.setData((User)ae.b(User.class, paramString));
      }
      paramString = (User)ae.b(User.class, paramString);
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
  
  public PlaneMsg a(String paramString1, String paramString2, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "login"));
    ((List)localObject).add(new BasicNameValuePair("name", paramString1));
    ((List)localObject).add(new BasicNameValuePair("pwd", paramString2));
    paramString2 = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramString1 = new PlaneMsg();
    try
    {
      paramString2 = new JSONObject(paramString2);
      paramContext = paramString2.getString("errorMessage");
      localObject = paramString2.getString("commandCode");
      String str = paramString2.getString("errorCode");
      boolean bool = paramString2.getBoolean("success");
      if (!paramString2.isNull("data")) {
        paramString1.setData((User)ae.b(User.class, paramString2.getJSONObject("data").toString()));
      }
      paramString1.setCommandCode((String)localObject);
      paramString1.setErrorCode(str);
      paramString1.setErrorMessage(paramContext);
      paramString1.setSuccess(bool);
      return paramString1;
    }
    catch (JSONException paramString2)
    {
      paramString2.printStackTrace();
      return paramString1;
    }
    catch (JsonParseException paramString2)
    {
      paramString2.printStackTrace();
      return paramString1;
    }
    catch (JsonMappingException paramString2)
    {
      paramString2.printStackTrace();
      return paramString1;
    }
    catch (IOException paramString2)
    {
      paramString2.printStackTrace();
    }
    return paramString1;
  }
  
  /* Error */
  public PlaneMsg b(Context paramContext)
  {
    // Byte code:
    //   0: new 64	com/fimi/soul/entity/PlaneMsg
    //   3: dup
    //   4: invokespecial 65	com/fimi/soul/entity/PlaneMsg:<init>	()V
    //   7: astore_2
    //   8: aload_1
    //   9: getstatic 16	com/fimi/soul/biz/l/s:a	Ljava/lang/String;
    //   12: ldc_w 309
    //   15: invokestatic 315	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   18: aload_1
    //   19: iconst_0
    //   20: invokestatic 320	com/fimi/soul/biz/g/a:c	(Landroid/content/Context;I)Ljava/lang/String;
    //   23: aload_1
    //   24: iconst_0
    //   25: invokestatic 322	com/fimi/soul/biz/g/a:b	(Landroid/content/Context;I)Ljava/lang/String;
    //   28: aload_1
    //   29: iconst_0
    //   30: invokestatic 324	com/fimi/soul/biz/g/a:a	(Landroid/content/Context;I)Ljava/lang/String;
    //   33: invokestatic 330	com/xiaomi/account/openauth/AuthorizeApi:doHttpGet	(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   36: astore_3
    //   37: new 67	org/json/JSONObject
    //   40: dup
    //   41: aload_3
    //   42: invokespecial 70	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   45: astore_3
    //   46: aload_3
    //   47: ldc_w 332
    //   50: invokevirtual 76	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   53: ldc_w 334
    //   56: invokevirtual 339	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   59: ifeq +196 -> 255
    //   62: aload_3
    //   63: ldc 88
    //   65: invokevirtual 148	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   68: astore_3
    //   69: new 157	com/fimi/soul/entity/User
    //   72: dup
    //   73: invokespecial 340	com/fimi/soul/entity/User:<init>	()V
    //   76: astore 4
    //   78: aload 4
    //   80: aload_3
    //   81: ldc_w 342
    //   84: invokevirtual 76	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   87: invokevirtual 345	com/fimi/soul/entity/User:setXiaomiID	(Ljava/lang/String;)V
    //   90: aload 4
    //   92: aload_3
    //   93: ldc_w 347
    //   96: invokevirtual 76	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   99: invokevirtual 350	com/fimi/soul/entity/User:setName	(Ljava/lang/String;)V
    //   102: aload 4
    //   104: aload_3
    //   105: ldc_w 347
    //   108: invokevirtual 76	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   111: invokevirtual 353	com/fimi/soul/entity/User:setNickName	(Ljava/lang/String;)V
    //   114: aload 4
    //   116: aload_1
    //   117: invokestatic 358	com/fimi/soul/utils/ao:a	(Landroid/content/Context;)Ljava/lang/String;
    //   120: invokevirtual 361	com/fimi/soul/entity/User:setDevice	(Ljava/lang/String;)V
    //   123: aload_3
    //   124: ldc -96
    //   126: invokevirtual 144	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   129: ifne +77 -> 206
    //   132: aload_3
    //   133: ldc -96
    //   135: invokevirtual 76	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   138: aload_1
    //   139: invokevirtual 367	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   142: ldc_w 368
    //   145: invokevirtual 373	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   148: invokevirtual 339	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   151: ifeq +55 -> 206
    //   154: aload 4
    //   156: ldc_w 375
    //   159: invokevirtual 378	com/fimi/soul/entity/User:setSex	(Ljava/lang/String;)V
    //   162: aload_0
    //   163: aload 4
    //   165: aload_1
    //   166: invokevirtual 380	com/fimi/soul/biz/l/s:a	(Lcom/fimi/soul/entity/User;Landroid/content/Context;)Lcom/fimi/soul/entity/PlaneMsg;
    //   169: astore_1
    //   170: aload_1
    //   171: areturn
    //   172: astore_3
    //   173: aload_1
    //   174: ldc_w 381
    //   177: invokevirtual 382	android/content/Context:getString	(I)Ljava/lang/String;
    //   180: astore_1
    //   181: aload_2
    //   182: ldc_w 384
    //   185: invokevirtual 113	com/fimi/soul/entity/PlaneMsg:setErrorCode	(Ljava/lang/String;)V
    //   188: aload_2
    //   189: aload_1
    //   190: invokevirtual 116	com/fimi/soul/entity/PlaneMsg:setErrorMessage	(Ljava/lang/String;)V
    //   193: aload_2
    //   194: iconst_0
    //   195: invokevirtual 120	com/fimi/soul/entity/PlaneMsg:setSuccess	(Z)V
    //   198: aload_1
    //   199: ldc 2
    //   201: invokestatic 387	com/fimi/soul/base/a:a	(Ljava/lang/String;Ljava/lang/Class;)V
    //   204: aload_2
    //   205: areturn
    //   206: aload_3
    //   207: ldc -96
    //   209: invokevirtual 144	org/json/JSONObject:isNull	(Ljava/lang/String;)Z
    //   212: ifne -50 -> 162
    //   215: aload_3
    //   216: ldc -96
    //   218: invokevirtual 76	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   221: aload_1
    //   222: invokevirtual 367	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   225: ldc_w 388
    //   228: invokevirtual 373	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   231: invokevirtual 339	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   234: ifeq -72 -> 162
    //   237: aload 4
    //   239: ldc_w 390
    //   242: invokevirtual 378	com/fimi/soul/entity/User:setSex	(Ljava/lang/String;)V
    //   245: goto -83 -> 162
    //   248: astore_1
    //   249: aload_1
    //   250: invokevirtual 123	org/json/JSONException:printStackTrace	()V
    //   253: aload_2
    //   254: areturn
    //   255: aload_3
    //   256: ldc_w 332
    //   259: invokevirtual 76	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   262: ldc_w 392
    //   265: invokevirtual 339	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   268: ifeq -15 -> 253
    //   271: aload_3
    //   272: ldc_w 394
    //   275: invokevirtual 76	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   278: astore_1
    //   279: aload_2
    //   280: aload_3
    //   281: ldc_w 396
    //   284: invokevirtual 76	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   287: invokevirtual 113	com/fimi/soul/entity/PlaneMsg:setErrorCode	(Ljava/lang/String;)V
    //   290: aload_2
    //   291: aload_1
    //   292: invokevirtual 116	com/fimi/soul/entity/PlaneMsg:setErrorMessage	(Ljava/lang/String;)V
    //   295: aload_2
    //   296: iconst_0
    //   297: invokevirtual 120	com/fimi/soul/entity/PlaneMsg:setSuccess	(Z)V
    //   300: goto -47 -> 253
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	303	0	this	s
    //   0	303	1	paramContext	Context
    //   7	289	2	localPlaneMsg	PlaneMsg
    //   36	97	3	localObject	Object
    //   172	109	3	localException	Exception
    //   76	162	4	localUser	User
    // Exception table:
    //   from	to	target	type
    //   8	37	172	java/lang/Exception
    //   37	162	248	org/json/JSONException
    //   162	170	248	org/json/JSONException
    //   206	245	248	org/json/JSONException
    //   255	300	248	org/json/JSONException
  }
  
  public PlaneMsg b(User paramUser, Context paramContext)
  {
    Object localObject1 = new ArrayList();
    ((List)localObject1).add(new BasicNameValuePair("commandCode", "editUserImage"));
    ((List)localObject1).add(new BasicNameValuePair("userID", paramUser.getUserID()));
    ((List)localObject1).add(new BasicNameValuePair("userImgUrl", paramUser.getUserImgUrl()));
    ((List)localObject1).add(new BasicNameValuePair("objectName", paramUser.getObjectName()));
    localObject1 = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject1, paramContext);
    paramUser = new PlaneMsg();
    try
    {
      Object localObject2 = new JSONObject((String)localObject1);
      localObject1 = ((JSONObject)localObject2).getString("errorMessage");
      String str1 = ((JSONObject)localObject2).getString("commandCode");
      String str2 = ((JSONObject)localObject2).getString("errorCode");
      boolean bool = ((JSONObject)localObject2).getBoolean("success");
      if (!((JSONObject)localObject2).isNull("data"))
      {
        localObject2 = (User)ae.b(User.class, ((JSONObject)localObject2).getJSONObject("data").toString());
        if (bool) {
          a.a(paramContext, (User)localObject2);
        }
        paramUser.setData(localObject2);
      }
      paramUser.setCommandCode(str1);
      paramUser.setErrorCode(str2);
      paramUser.setErrorMessage((String)localObject1);
      paramUser.setSuccess(bool);
      return paramUser;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
      return paramUser;
    }
    catch (JsonParseException paramContext)
    {
      paramContext.printStackTrace();
      return paramUser;
    }
    catch (JsonMappingException paramContext)
    {
      paramContext.printStackTrace();
      return paramUser;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramUser;
  }
  
  public PlaneMsg b(String paramString, int paramInt, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getUserRelations"));
    ((List)localObject).add(new BasicNameValuePair("userID", paramString));
    ((List)localObject).add(new BasicNameValuePair("curPage", paramInt + ""));
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
        paramString.setData(ae.a(Relation[].class, paramContext.getJSONArray("data").toString()));
      }
      if (!paramContext.isNull("page")) {
        paramString.setPage((Page)ae.b(Page.class, paramContext.getJSONObject("page").toString()));
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
  
  public PlaneMsg b(String paramString1, String paramString2, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "editPushRegID"));
    ((List)localObject).add(new BasicNameValuePair("userID", paramString1));
    ((List)localObject).add(new BasicNameValuePair("regID", paramString2));
    paramString2 = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    a.a(paramString2, s.class);
    paramString1 = new PlaneMsg();
    try
    {
      paramString2 = new JSONObject(paramString2);
      paramContext = paramString2.getString("errorMessage");
      localObject = paramString2.getString("commandCode");
      String str = paramString2.getString("errorCode");
      boolean bool = paramString2.getBoolean("success");
      paramString1.setCommandCode((String)localObject);
      paramString1.setErrorCode(str);
      paramString1.setErrorMessage(paramContext);
      paramString1.setSuccess(bool);
      return paramString1;
    }
    catch (JSONException paramString2)
    {
      paramString2.printStackTrace();
    }
    return paramString1;
  }
  
  public boolean b(String paramString, Context paramContext)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("commandCode", "delUserById"));
    localArrayList.add(new BasicNameValuePair("userid", paramString));
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
  
  public PlaneMsg c(Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getDynamicDNZ"));
    localObject = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramContext = new PlaneMsg();
    try
    {
      localObject = new JSONObject((String)localObject);
      String str1 = ((JSONObject)localObject).getString("errorMessage");
      String str2 = ((JSONObject)localObject).getString("commandCode");
      String str3 = ((JSONObject)localObject).getString("errorCode");
      boolean bool = ((JSONObject)localObject).getBoolean("success");
      paramContext.setCommandCode(str2);
      paramContext.setErrorCode(str3);
      paramContext.setErrorMessage(str1);
      paramContext.setSuccess(bool);
      paramContext.setData(((JSONObject)localObject).getJSONArray("data").toString());
      return paramContext;
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
    }
    return paramContext;
  }
  
  public PlaneMsg c(User paramUser, Context paramContext)
  {
    Object localObject1 = new ArrayList();
    ((List)localObject1).add(new BasicNameValuePair("commandCode", "editUser"));
    ((List)localObject1).add(new BasicNameValuePair("userID", paramUser.getUserID()));
    ((List)localObject1).add(new BasicNameValuePair("sex", paramUser.getSex()));
    ((List)localObject1).add(new BasicNameValuePair("signature", paramUser.getSignature()));
    ((List)localObject1).add(new BasicNameValuePair("nickName", paramUser.getNickName()));
    localObject1 = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject1, paramContext);
    paramUser = new PlaneMsg();
    try
    {
      Object localObject2 = new JSONObject((String)localObject1);
      localObject1 = ((JSONObject)localObject2).getString("errorMessage");
      String str1 = ((JSONObject)localObject2).getString("commandCode");
      String str2 = ((JSONObject)localObject2).getString("errorCode");
      boolean bool = ((JSONObject)localObject2).getBoolean("success");
      if (!((JSONObject)localObject2).isNull("data"))
      {
        localObject2 = (User)ae.b(User.class, ((JSONObject)localObject2).getJSONObject("data").toString());
        if (bool) {
          a.a(paramContext, (User)localObject2);
        }
        paramUser.setData(localObject2);
      }
      paramUser.setCommandCode(str1);
      paramUser.setErrorCode(str2);
      paramUser.setErrorMessage((String)localObject1);
      paramUser.setSuccess(bool);
      return paramUser;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
      return paramUser;
    }
    catch (JsonParseException paramContext)
    {
      paramContext.printStackTrace();
      return paramUser;
    }
    catch (JsonMappingException paramContext)
    {
      paramContext.printStackTrace();
      return paramUser;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramUser;
  }
  
  public PlaneMsg c(String paramString, int paramInt, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getRelationUserList"));
    ((List)localObject).add(new BasicNameValuePair("relationID", paramString));
    ((List)localObject).add(new BasicNameValuePair("curPage", paramInt + ""));
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
        paramString.setData(ae.a(Relation[].class, paramContext.getJSONArray("data").toString()));
      }
      if (!paramContext.isNull("page")) {
        paramString.setPage((Page)ae.b(Page.class, paramContext.getJSONObject("page").toString()));
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
  
  public PlaneMsg c(String paramString, Context paramContext)
  {
    Object localObject = new ArrayList();
    PlaneMsg localPlaneMsg = new PlaneMsg();
    try
    {
      ((List)localObject).add(new BasicNameValuePair("commandCode", "addPlaneActionList"));
      ((List)localObject).add(new BasicNameValuePair("jsonContent", paramString));
      if (paramString != null)
      {
        paramString = new JSONArray(paramString);
        if (paramString != null)
        {
          paramString = paramString.getJSONObject(0);
          if ((paramString != null) && (paramString.has("userID"))) {
            ((List)localObject).add(new BasicNameValuePair("userID", paramString.getString("userID")));
          }
        }
      }
      paramString = new JSONObject(NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext));
      paramContext = paramString.getString("errorMessage");
      localObject = paramString.getString("commandCode");
      String str = paramString.getString("errorCode");
      boolean bool = paramString.getBoolean("success");
      Log.i("ljh", "rt : " + paramString.toString());
      localPlaneMsg.setCommandCode((String)localObject);
      localPlaneMsg.setErrorCode(str);
      localPlaneMsg.setErrorMessage(paramContext);
      localPlaneMsg.setSuccess(bool);
      localPlaneMsg.setData(ae.b(FlightTimeInfo.class, paramString.getJSONObject("data").toString()));
      return localPlaneMsg;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
      return localPlaneMsg;
    }
    catch (JsonParseException paramString)
    {
      paramString.printStackTrace();
      return localPlaneMsg;
    }
    catch (JsonMappingException paramString)
    {
      paramString.printStackTrace();
      return localPlaneMsg;
    }
    catch (IOException paramString)
    {
      paramString.printStackTrace();
    }
    return localPlaneMsg;
  }
  
  public PlaneMsg c(String paramString1, String paramString2, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "addPlaneAction"));
    ((List)localObject).add(new BasicNameValuePair("planeID", paramString1));
    ((List)localObject).add(new BasicNameValuePair("userID", paramString2));
    paramString2 = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramString1 = new PlaneMsg();
    try
    {
      paramString2 = new JSONObject(paramString2);
      paramContext = paramString2.getString("errorMessage");
      localObject = paramString2.getString("commandCode");
      String str = paramString2.getString("errorCode");
      boolean bool = paramString2.getBoolean("success");
      paramString1.setCommandCode((String)localObject);
      paramString1.setErrorCode(str);
      paramString1.setErrorMessage(paramContext);
      paramString1.setSuccess(bool);
      paramString2 = paramString2.getJSONObject("data").toString();
      if (paramString2 != null)
      {
        paramString1.setData(ae.b(FlightTimeInfo.class, paramString2));
        return paramString1;
      }
      paramString1.setSuccess(false);
      return paramString1;
    }
    catch (JSONException paramString2)
    {
      paramString2.printStackTrace();
      return paramString1;
    }
    catch (JsonParseException paramString2)
    {
      paramString2.printStackTrace();
      return paramString1;
    }
    catch (JsonMappingException paramString2)
    {
      paramString2.printStackTrace();
      return paramString1;
    }
    catch (IOException paramString2)
    {
      paramString2.printStackTrace();
    }
    return paramString1;
  }
  
  public PlaneMsg d(User paramUser, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "getIsAttention"));
    ((List)localObject).add(new BasicNameValuePair("userID", paramUser.getUserID()));
    ((List)localObject).add(new BasicNameValuePair("relationID", paramUser.getCountry()));
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramUser = new PlaneMsg();
    try
    {
      paramContext = new JSONObject(paramContext);
      localObject = paramContext.getString("errorMessage");
      String str1 = paramContext.getString("commandCode");
      String str2 = paramContext.getString("errorCode");
      boolean bool = paramContext.getBoolean("success");
      paramUser.setData(paramContext.getString("data"));
      paramUser.setCommandCode(str1);
      paramUser.setErrorCode(str2);
      paramUser.setErrorMessage((String)localObject);
      paramUser.setSuccess(bool);
      return paramUser;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramUser;
  }
  
  public PlaneMsg e(User paramUser, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "clearLocation"));
    ((List)localObject).add(new BasicNameValuePair("userID", paramUser.getUserID()));
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    a.a(paramContext, s.class);
    paramUser = new PlaneMsg();
    try
    {
      paramContext = new JSONObject(paramContext);
      localObject = paramContext.getString("errorMessage");
      String str1 = paramContext.getString("commandCode");
      String str2 = paramContext.getString("errorCode");
      boolean bool = paramContext.getBoolean("success");
      paramUser.setCommandCode(str1);
      paramUser.setErrorCode(str2);
      paramUser.setErrorMessage((String)localObject);
      paramUser.setSuccess(bool);
      return paramUser;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramUser;
  }
  
  public PlaneMsg f(User paramUser, Context paramContext)
  {
    Object localObject1 = new ArrayList();
    ((List)localObject1).add(new BasicNameValuePair("commandCode", "exitAircraft"));
    ((List)localObject1).add(new BasicNameValuePair("userID", paramUser.getUserID()));
    a.c(paramContext);
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject1, paramContext);
    a.a(paramContext, s.class);
    localObject1 = new PlaneMsg();
    try
    {
      Object localObject2 = new JSONObject(paramContext);
      String str1 = ((JSONObject)localObject2).getString("errorMessage");
      String str2 = ((JSONObject)localObject2).getString("commandCode");
      String str3 = ((JSONObject)localObject2).getString("errorCode");
      boolean bool = ((JSONObject)localObject2).getBoolean("success");
      if (!((JSONObject)localObject2).isNull("data"))
      {
        paramContext = ((JSONObject)localObject2).getJSONObject("data").toString();
        localObject2 = (User)ae.b(User.class, paramContext);
        ((PlaneMsg)localObject1).setData(paramUser);
      }
      paramContext = (User)ae.b(User.class, paramContext);
      ((PlaneMsg)localObject1).setCommandCode(str2);
      ((PlaneMsg)localObject1).setData(paramUser);
      ((PlaneMsg)localObject1).setErrorCode(str3);
      ((PlaneMsg)localObject1).setErrorMessage(str1);
      ((PlaneMsg)localObject1).setSuccess(bool);
      return (PlaneMsg)localObject1;
    }
    catch (Exception paramUser)
    {
      paramUser.printStackTrace();
    }
    return (PlaneMsg)localObject1;
  }
  
  public PlaneMsg g(User paramUser, Context paramContext)
  {
    Object localObject = new ArrayList();
    ((List)localObject).add(new BasicNameValuePair("commandCode", "editPhone"));
    ((List)localObject).add(new BasicNameValuePair("userID", paramUser.getUserID()));
    ((List)localObject).add(new BasicNameValuePair("phone", paramUser.getPhone()));
    paramContext = NetUtil.b("https://fimiservice-us.mi-ae.com/android/fimi.service", (List)localObject, paramContext);
    paramUser = new PlaneMsg();
    try
    {
      paramContext = new JSONObject(paramContext);
      localObject = paramContext.getString("errorMessage");
      String str1 = paramContext.getString("commandCode");
      String str2 = paramContext.getString("errorCode");
      boolean bool = paramContext.getBoolean("success");
      paramUser.setCommandCode(str1);
      paramUser.setErrorCode(str2);
      paramUser.setErrorMessage((String)localObject);
      paramUser.setSuccess(bool);
      return paramUser;
    }
    catch (JSONException paramContext)
    {
      paramContext.printStackTrace();
    }
    return paramUser;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/l/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */