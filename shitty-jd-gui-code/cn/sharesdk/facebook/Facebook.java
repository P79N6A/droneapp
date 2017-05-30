package cn.sharesdk.facebook;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.Platform.ShareParams;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.PlatformDb;
import cn.sharesdk.framework.authorize.AuthorizeListener;
import cn.sharesdk.framework.b.b.f.a;
import com.mob.tools.log.NLog;
import com.mob.tools.utils.BitmapHelper;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;

public class Facebook
  extends Platform
{
  public static final String NAME = Facebook.class.getSimpleName();
  private String a;
  private String b;
  
  public Facebook(Context paramContext)
  {
    super(paramContext);
  }
  
  protected boolean checkAuthorize(int paramInt, Object paramObject)
  {
    if (isAuthValid())
    {
      d locald = d.a(this);
      locald.a(this.a);
      String str1 = this.db.getToken();
      String str2 = String.valueOf(this.db.getExpiresIn());
      if ((str1 != null) && (str2 != null))
      {
        locald.a(str1, str2);
        if (locald.a()) {
          return true;
        }
      }
    }
    else if (((paramObject instanceof Platform.ShareParams)) && (((Platform.ShareParams)paramObject).getShareType() == 4))
    {
      return true;
    }
    innerAuthorize(paramInt, paramObject);
    return false;
  }
  
  protected void doAuthorize(String[] paramArrayOfString)
  {
    final d locald = d.a(this);
    locald.a(this.a);
    locald.d(this.b);
    locald.a(paramArrayOfString);
    locald.a(new AuthorizeListener()
    {
      public void onCancel()
      {
        if (Facebook.e(Facebook.this) != null) {
          Facebook.f(Facebook.this).onCancel(Facebook.this, 1);
        }
      }
      
      public void onComplete(Bundle paramAnonymousBundle)
      {
        String str2 = paramAnonymousBundle.getString("oauth_token");
        int j = paramAnonymousBundle.getInt("oauth_token_expires");
        int i = j;
        String str1;
        if (j == 0) {
          str1 = String.valueOf(paramAnonymousBundle.get("expires_in"));
        }
        try
        {
          i = R.parseInt(str1);
          str1 = str2;
          if (TextUtils.isEmpty(str2)) {
            str1 = paramAnonymousBundle.getString("access_token");
          }
          Facebook.c(Facebook.this).putToken(str1);
          Facebook.d(Facebook.this).putExpiresIn(i);
          locald.a(str1, String.valueOf(i));
          Facebook.a(Facebook.this, 1, null);
          return;
        }
        catch (Throwable localThrowable)
        {
          for (;;)
          {
            cn.sharesdk.framework.utils.d.a().d(localThrowable);
            i = 0;
          }
        }
      }
      
      public void onError(Throwable paramAnonymousThrowable)
      {
        if (Facebook.a(Facebook.this) != null) {
          Facebook.b(Facebook.this).onError(Facebook.this, 1, paramAnonymousThrowable);
        }
      }
    }, isSSODisable());
  }
  
  protected void doCustomerProtocol(String paramString1, String paramString2, int paramInt, HashMap<String, Object> paramHashMap, HashMap<String, String> paramHashMap1)
  {
    d locald = d.a(this);
    try
    {
      paramString1 = locald.a(paramString1, paramString2, paramHashMap, paramHashMap1);
      if ((paramString1 == null) || (paramString1.size() <= 0))
      {
        if (this.listener != null) {
          this.listener.onError(this, paramInt, new Throwable("response is null"));
        }
      }
      else if ((paramString1.containsKey("error_code")) || (paramString1.containsKey("error")))
      {
        if (this.listener == null) {
          return;
        }
        paramString1 = new Hashon().fromHashMap(paramString1);
        this.listener.onError(this, paramInt, new Throwable(paramString1));
      }
    }
    catch (Throwable paramString1)
    {
      if (this.listener != null)
      {
        this.listener.onError(this, paramInt, paramString1);
        return;
        if (this.listener != null) {
          this.listener.onComplete(this, paramInt, paramString1);
        }
      }
    }
  }
  
  protected void doShare(final Platform.ShareParams paramShareParams)
  {
    Object localObject1 = d.a(this);
    ((d)localObject1).a(this.a);
    try
    {
      str1 = getShortLintk(paramShareParams.getText(), false);
      localObject2 = paramShareParams.getImagePath();
      str2 = paramShareParams.getImageUrl();
      String str3 = paramShareParams.getTitleUrl();
      String str4 = paramShareParams.getUrl();
      if ((paramShareParams.getShareType() == 4) && ((!TextUtils.isEmpty(str3)) || (!TextUtils.isEmpty(str4))))
      {
        if ((TextUtils.isEmpty(str2)) && (!TextUtils.isEmpty((CharSequence)localObject2)) && (new File((String)localObject2).exists())) {
          paramShareParams.setImageUrl(uploadImageToFileServer((String)localObject2));
        }
        ((d)localObject1).a(paramShareParams, new PlatformActionListener()
        {
          public void onCancel(Platform paramAnonymousPlatform, int paramAnonymousInt)
          {
            if (Facebook.k(Facebook.this) != null) {
              Facebook.l(Facebook.this).onCancel(Facebook.this, 9);
            }
          }
          
          public void onComplete(Platform paramAnonymousPlatform, int paramAnonymousInt, HashMap<String, Object> paramAnonymousHashMap)
          {
            if (Facebook.i(Facebook.this) != null)
            {
              paramAnonymousHashMap.put("ShareParams", paramShareParams);
              Facebook.j(Facebook.this).onComplete(Facebook.this, 9, paramAnonymousHashMap);
            }
          }
          
          public void onError(Platform paramAnonymousPlatform, int paramAnonymousInt, Throwable paramAnonymousThrowable)
          {
            if (Facebook.g(Facebook.this) != null) {
              Facebook.h(Facebook.this).onError(Facebook.this, 9, paramAnonymousThrowable);
            }
          }
        });
        return;
      }
      if ((TextUtils.isEmpty((CharSequence)localObject2)) || (!new File((String)localObject2).exists())) {
        break label220;
      }
      localObject1 = ((d)localObject1).b(str1, (String)localObject2);
    }
    catch (Throwable paramShareParams)
    {
      String str1;
      Object localObject2;
      String str2;
      while (this.listener != null)
      {
        this.listener.onError(this, 9, paramShareParams);
        return;
        label220:
        if (!TextUtils.isEmpty(str2))
        {
          localObject2 = new File(BitmapHelper.downloadBitmap(this.context, str2));
          if (((File)localObject2).exists()) {
            localObject1 = ((d)localObject1).b(str1, ((File)localObject2).getAbsolutePath());
          } else {
            localObject1 = ((d)localObject1).b(str1);
          }
        }
        else
        {
          localObject1 = ((d)localObject1).b(str1);
        }
      }
      if ((!((HashMap)localObject1).containsKey("error_code")) && (!((HashMap)localObject1).containsKey("error"))) {
        break label344;
      }
      if (this.listener == null) {
        return;
      }
      paramShareParams = new Hashon().fromHashMap((HashMap)localObject1);
      this.listener.onError(this, 9, new Throwable(paramShareParams));
      return;
      label344:
      if (this.listener == null) {
        return;
      }
      ((HashMap)localObject1).put("ShareParams", paramShareParams);
      this.listener.onComplete(this, 9, (HashMap)localObject1);
    }
    if ((localObject1 == null) || (((HashMap)localObject1).size() <= 0))
    {
      if (this.listener == null) {
        return;
      }
      this.listener.onError(this, 9, new Throwable("response is null"));
    }
  }
  
  protected HashMap<String, Object> filterFriendshipInfo(int paramInt, HashMap<String, Object> paramHashMap)
  {
    Object localObject1 = paramHashMap.get("data");
    if (localObject1 == null) {
      return null;
    }
    HashMap localHashMap1 = new HashMap();
    localHashMap1.put("type", "FOLLOWING");
    localHashMap1.put("snsplat", Integer.valueOf(getPlatformId()));
    localHashMap1.put("snsuid", this.db.getUserId());
    paramInt = ((Integer)paramHashMap.get("current_cursor")).intValue();
    int i = ((Integer)paramHashMap.get("current_limit")).intValue();
    ArrayList localArrayList = new ArrayList();
    paramHashMap = (ArrayList)localObject1;
    if (paramHashMap.size() <= 0) {
      return null;
    }
    localObject1 = paramHashMap.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (HashMap)((Iterator)localObject1).next();
      if (localObject2 != null)
      {
        HashMap localHashMap2 = new HashMap();
        localHashMap2.put("snsuid", String.valueOf(((HashMap)localObject2).get("id")));
        localHashMap2.put("nickname", String.valueOf(((HashMap)localObject2).get("name")));
        if ("male".equals(String.valueOf(((HashMap)localObject2).get("gender")))) {
          paramHashMap = "0";
        }
        for (;;)
        {
          localHashMap2.put("gender", paramHashMap);
          if ("true".equals(String.valueOf(((HashMap)localObject2).get("verified"))))
          {
            paramHashMap = "1";
            label257:
            localHashMap2.put("secretType", paramHashMap);
            localHashMap2.put("snsUserUrl", String.valueOf(((HashMap)localObject2).get("link")));
            localHashMap2.put("resume", String.valueOf(((HashMap)localObject2).get("link")));
            if (!((HashMap)localObject2).containsKey("picture")) {
              break label659;
            }
            paramHashMap = (HashMap)((HashMap)localObject2).get("picture");
            label330:
            if (paramHashMap != null)
            {
              if (!paramHashMap.containsKey("data")) {
                break label664;
              }
              paramHashMap = (HashMap)paramHashMap.get("data");
              label353:
              if (paramHashMap != null) {
                localHashMap2.put("icon", String.valueOf(paramHashMap.get("url")));
              }
            }
          }
          try
          {
            if (((HashMap)localObject2).containsKey("birthday"))
            {
              paramHashMap = String.valueOf(((HashMap)localObject2).get("birthday")).split("/");
              localObject3 = Calendar.getInstance();
              ((Calendar)localObject3).set(1, R.parseInt(paramHashMap[2]));
              ((Calendar)localObject3).set(2, R.parseInt(paramHashMap[0]) - 1);
              ((Calendar)localObject3).set(5, R.parseInt(paramHashMap[1]));
              localHashMap2.put("birthday", String.valueOf(((Calendar)localObject3).getTimeInMillis()));
            }
            if (((HashMap)localObject2).containsKey("education"))
            {
              paramHashMap = (ArrayList)((HashMap)localObject2).get("education");
              if (paramHashMap == null) {
                break label751;
              }
              localObject3 = new ArrayList();
              paramHashMap = paramHashMap.iterator();
              if (!paramHashMap.hasNext()) {
                break label700;
              }
              localHashMap3 = (HashMap)paramHashMap.next();
              localObject4 = new HashMap();
              ((HashMap)localObject4).put("school_type", Integer.valueOf(0));
              HashMap localHashMap4 = (HashMap)localHashMap3.get("school");
              if (localHashMap4 != null) {
                ((HashMap)localObject4).put("school", String.valueOf(localHashMap4.get("name")));
              }
            }
          }
          catch (Throwable paramHashMap)
          {
            Object localObject3;
            Object localObject4;
            try
            {
              for (;;)
              {
                HashMap localHashMap3;
                ((HashMap)localObject4).put("year", Integer.valueOf(R.parseInt(String.valueOf(((HashMap)localHashMap3.get("year")).get("name")))));
                ((HashMap)localObject4).put("background", Integer.valueOf(0));
                ((ArrayList)localObject3).add(localObject4);
                continue;
                paramHashMap = "1";
                break;
                paramHashMap = "0";
                break label257;
                label659:
                paramHashMap = null;
                break label330;
                label664:
                paramHashMap = null;
                break label353;
                paramHashMap = paramHashMap;
                cn.sharesdk.framework.utils.d.a().d(paramHashMap);
              }
              paramHashMap = null;
            }
            catch (Throwable localThrowable2)
            {
              for (;;)
              {
                cn.sharesdk.framework.utils.d.a().d(localThrowable2);
              }
            }
            label700:
            paramHashMap = new HashMap();
            paramHashMap.put("list", localObject3);
            paramHashMap = new Hashon().fromHashMap(paramHashMap);
            localHashMap2.put("educationJSONArrayStr", paramHashMap.substring(8, paramHashMap.length() - 1));
            label751:
            if (((HashMap)localObject2).containsKey("work")) {
              paramHashMap = (ArrayList)((HashMap)localObject2).get("work");
            }
            for (;;)
            {
              if (paramHashMap == null) {
                break label1111;
              }
              localObject2 = new ArrayList();
              paramHashMap = paramHashMap.iterator();
              label792:
              if (paramHashMap.hasNext())
              {
                localObject4 = (HashMap)paramHashMap.next();
                localObject3 = new HashMap();
                Object localObject5 = (HashMap)((HashMap)localObject4).get("employer");
                if (localObject5 != null) {
                  ((HashMap)localObject3).put("company", String.valueOf(((HashMap)localObject5).get("name")));
                }
                localObject5 = (HashMap)((HashMap)localObject4).get("position");
                if (localObject5 != null) {
                  ((HashMap)localObject3).put("position", String.valueOf(((HashMap)localObject5).get("name")));
                }
                try
                {
                  localObject5 = String.valueOf(((HashMap)localObject4).get("start_date")).split("-");
                  j = R.parseInt(localObject5[0]);
                  ((HashMap)localObject3).put("start_date", Integer.valueOf(R.parseInt(localObject5[1]) + j * 100));
                }
                catch (Throwable localThrowable3)
                {
                  try
                  {
                    for (;;)
                    {
                      localObject4 = String.valueOf(((HashMap)localObject4).get("end_date")).split("-");
                      int j = R.parseInt(localObject4[0]);
                      ((HashMap)localObject3).put("end_date", Integer.valueOf(R.parseInt(localObject4[1]) + j * 100));
                      ((ArrayList)localObject2).add(localObject3);
                      break label792;
                      paramHashMap = null;
                      break;
                      localThrowable3 = localThrowable3;
                      cn.sharesdk.framework.utils.d.a().d(localThrowable3);
                    }
                  }
                  catch (Throwable localThrowable1)
                  {
                    for (;;)
                    {
                      cn.sharesdk.framework.utils.d.a().d(localThrowable1);
                      ((HashMap)localObject3).put("end_date", Integer.valueOf(0));
                    }
                  }
                }
              }
            }
            paramHashMap = new HashMap();
            paramHashMap.put("list", localObject2);
            paramHashMap = new Hashon().fromHashMap(paramHashMap);
            localHashMap2.put("workJSONArrayStr", paramHashMap.substring(8, paramHashMap.length() - 1));
            label1111:
            localArrayList.add(localHashMap2);
          }
        }
      }
    }
    if ((localArrayList == null) || (localArrayList.size() <= 0)) {
      return null;
    }
    paramHashMap = "_false";
    if (i >= localArrayList.size()) {
      paramHashMap = "_true";
    }
    localHashMap1.put("nextCursor", localArrayList.size() + paramInt + paramHashMap);
    localHashMap1.put("list", localArrayList);
    return localHashMap1;
  }
  
  protected f.a filterShareContent(Platform.ShareParams paramShareParams, HashMap<String, Object> paramHashMap)
  {
    f.a locala = new f.a();
    locala.b = paramShareParams.getText();
    if (paramHashMap != null)
    {
      if ((paramHashMap == null) || (!paramHashMap.containsKey("source"))) {
        break label84;
      }
      locala.d.add(String.valueOf(paramHashMap.get("source")));
      paramShareParams = paramHashMap.get("post_id");
      if (paramShareParams != null) {
        break label140;
      }
    }
    label84:
    label140:
    for (paramShareParams = null;; paramShareParams = String.valueOf(paramShareParams))
    {
      locala.a = paramShareParams;
      locala.g = paramHashMap;
      return locala;
      if (4 != paramShareParams.getShareType()) {
        break;
      }
      locala.d.add(paramShareParams.getImageUrl());
      String str2 = paramShareParams.getTitleUrl();
      String str1 = str2;
      if (TextUtils.isEmpty(str2)) {
        str1 = paramShareParams.getUrl();
      }
      locala.c.add(str1);
      break;
    }
  }
  
  protected void follow(String paramString)
  {
    if (this.listener != null) {
      this.listener.onCancel(this, 6);
    }
  }
  
  protected HashMap<String, Object> getBilaterals(int paramInt1, int paramInt2, String paramString)
  {
    return null;
  }
  
  protected HashMap<String, Object> getFollowers(int paramInt1, int paramInt2, String paramString)
  {
    return null;
  }
  
  protected HashMap<String, Object> getFollowings(int paramInt1, int paramInt2, String paramString)
  {
    d locald = d.a(this);
    try
    {
      paramString = locald.a(paramInt1, paramInt2, paramString);
      if (paramString != null)
      {
        if (paramString.size() <= 0) {
          return null;
        }
        if ((!paramString.containsKey("error_code")) && (!paramString.containsKey("error")))
        {
          paramString.put("current_limit", Integer.valueOf(paramInt1));
          paramString.put("current_cursor", Integer.valueOf(paramInt2));
          paramString = filterFriendshipInfo(2, paramString);
          return paramString;
        }
      }
    }
    catch (Throwable paramString)
    {
      cn.sharesdk.framework.utils.d.a().d(paramString);
    }
    return null;
  }
  
  protected void getFriendList(int paramInt1, int paramInt2, String paramString)
  {
    d locald = d.a(this);
    try
    {
      paramString = locald.a(paramInt1, paramInt2 * paramInt1, paramString);
      if ((paramString == null) || (paramString.size() <= 0))
      {
        if (this.listener != null) {
          this.listener.onError(this, 2, new Throwable("response is null"));
        }
      }
      else if ((paramString.containsKey("error_code")) || (paramString.containsKey("error")))
      {
        if (this.listener == null) {
          return;
        }
        paramString = new Hashon().fromHashMap(paramString);
        this.listener.onError(this, 2, new Throwable(paramString));
      }
    }
    catch (Throwable paramString)
    {
      if (this.listener != null)
      {
        this.listener.onError(this, 2, paramString);
        return;
        if (this.listener != null) {
          this.listener.onComplete(this, 2, paramString);
        }
      }
    }
  }
  
  public String getName()
  {
    return NAME;
  }
  
  public int getPlatformId()
  {
    return 10;
  }
  
  public int getVersion()
  {
    return 2;
  }
  
  public boolean hasShareCallback()
  {
    return true;
  }
  
  protected void initDevInfo(String paramString)
  {
    this.a = getDevinfo("ConsumerKey");
    this.b = getDevinfo("RedirectUrl");
  }
  
  public boolean isClientValid()
  {
    d locald = d.a(this);
    locald.a(this.a);
    return locald.b();
  }
  
  protected void setNetworkDevinfo()
  {
    this.a = getNetworkDevinfo("api_key", "ConsumerKey");
    this.b = getNetworkDevinfo("redirect_uri", "RedirectUrl");
    if (TextUtils.isEmpty(this.b)) {
      this.b = "fbconnect://success";
    }
  }
  
  protected void timeline(int paramInt1, int paramInt2, String paramString)
  {
    if (this.listener != null) {
      this.listener.onCancel(this, 7);
    }
  }
  
  protected void userInfor(String paramString)
  {
    Object localObject1 = d.a(this);
    try
    {
      localObject1 = ((d)localObject1).c(paramString);
      if ((localObject1 == null) || (((HashMap)localObject1).size() <= 0))
      {
        if (this.listener == null) {
          break label1103;
        }
        this.listener.onError(this, 8, new Throwable("response is null"));
        return;
      }
      if ((!((HashMap)localObject1).containsKey("error_code")) && (!((HashMap)localObject1).containsKey("error"))) {
        break label131;
      }
      if (this.listener == null) {
        break label1103;
      }
      paramString = new Hashon().fromHashMap((HashMap)localObject1);
      this.listener.onError(this, 8, new Throwable(paramString));
      return;
    }
    catch (Throwable paramString)
    {
      if (this.listener == null) {
        break label1103;
      }
    }
    this.listener.onError(this, 8, paramString);
    return;
    label131:
    Object localObject2;
    label251:
    label406:
    label476:
    Object localObject3;
    Object localObject5;
    Object localObject4;
    if (paramString == null)
    {
      this.db.putUserId(String.valueOf(((HashMap)localObject1).get("id")));
      this.db.put("nickname", String.valueOf(((HashMap)localObject1).get("name")));
      localObject2 = this.db;
      if (!"male".equals(String.valueOf(((HashMap)localObject1).get("gender")))) {
        break label1104;
      }
      paramString = "0";
      ((PlatformDb)localObject2).put("gender", paramString);
      this.db.put("token_for_business", (String)((HashMap)localObject1).get("token_for_business"));
      if (!((HashMap)localObject1).containsKey("picture")) {
        break label1111;
      }
      paramString = (HashMap)((HashMap)localObject1).get("picture");
      if (paramString != null)
      {
        paramString = (HashMap)paramString.get("data");
        if (paramString != null) {
          this.db.put("icon", String.valueOf(paramString.get("url")));
        }
      }
      try
      {
        if (((HashMap)localObject1).containsKey("birthday"))
        {
          paramString = String.valueOf(((HashMap)localObject1).get("birthday")).split("/");
          localObject2 = Calendar.getInstance();
          ((Calendar)localObject2).set(1, R.parseInt(paramString[2]));
          ((Calendar)localObject2).set(2, R.parseInt(paramString[0]) - 1);
          ((Calendar)localObject2).set(5, R.parseInt(paramString[1]));
          this.db.put("birthday", String.valueOf(((Calendar)localObject2).getTimeInMillis()));
        }
        localObject2 = this.db;
        if (!"true".equals(String.valueOf(((HashMap)localObject1).get("verified")))) {
          break label1116;
        }
        paramString = "1";
        ((PlatformDb)localObject2).put("secretType", paramString);
        this.db.put("snsUserUrl", String.valueOf(((HashMap)localObject1).get("link")));
        this.db.put("resume", String.valueOf(((HashMap)localObject1).get("link")));
        if (!((HashMap)localObject1).containsKey("education")) {
          break label1123;
        }
        paramString = (ArrayList)((HashMap)localObject1).get("education");
        if (paramString != null)
        {
          localObject2 = new ArrayList();
          localObject3 = paramString.iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject5 = (HashMap)((Iterator)localObject3).next();
            localObject4 = new HashMap();
            ((HashMap)localObject4).put("school_type", Integer.valueOf(0));
            if (!((HashMap)localObject5).containsKey("school")) {
              break label1128;
            }
            paramString = (HashMap)((HashMap)localObject5).get("school");
            label562:
            if (paramString != null) {
              ((HashMap)localObject4).put("school", String.valueOf(paramString.get("name")));
            }
            try
            {
              if (!((HashMap)localObject5).containsKey("year")) {
                break label1133;
              }
              paramString = (HashMap)((HashMap)localObject5).get("year");
              label608:
              ((HashMap)localObject4).put("year", Integer.valueOf(R.parseInt(String.valueOf(paramString.get("name")))));
            }
            catch (Throwable paramString)
            {
              for (;;)
              {
                cn.sharesdk.framework.utils.d.a().d(paramString);
              }
            }
            ((HashMap)localObject4).put("background", Integer.valueOf(0));
            ((ArrayList)localObject2).add(localObject4);
          }
        }
      }
      catch (Throwable paramString)
      {
        for (;;)
        {
          cn.sharesdk.framework.utils.d.a().d(paramString);
        }
        paramString = new HashMap();
        paramString.put("list", localObject2);
        paramString = new Hashon().fromHashMap(paramString);
        this.db.put("educationJSONArrayStr", paramString.substring(8, paramString.length() - 1));
      }
      if (!((HashMap)localObject1).containsKey("work")) {
        break label1138;
      }
    }
    label1103:
    label1104:
    label1111:
    label1116:
    label1123:
    label1128:
    label1133:
    label1138:
    for (paramString = (ArrayList)((HashMap)localObject1).get("work");; paramString = null)
    {
      if (paramString != null)
      {
        localObject2 = new ArrayList();
        paramString = paramString.iterator();
        for (;;)
        {
          if (paramString.hasNext())
          {
            localObject4 = (HashMap)paramString.next();
            localObject3 = new HashMap();
            localObject5 = (HashMap)((HashMap)localObject4).get("employer");
            if (localObject5 != null) {
              ((HashMap)localObject3).put("company", String.valueOf(((HashMap)localObject5).get("name")));
            }
            localObject5 = (HashMap)((HashMap)localObject4).get("position");
            if (localObject5 != null) {
              ((HashMap)localObject3).put("position", String.valueOf(((HashMap)localObject5).get("name")));
            }
            try
            {
              localObject5 = String.valueOf(((HashMap)localObject4).get("start_date")).split("-");
              i = R.parseInt(localObject5[0]);
              ((HashMap)localObject3).put("start_date", Integer.valueOf(R.parseInt(localObject5[1]) + i * 100));
            }
            catch (Throwable localThrowable2)
            {
              try
              {
                for (;;)
                {
                  localObject4 = String.valueOf(((HashMap)localObject4).get("end_date")).split("-");
                  int i = R.parseInt(localObject4[0]);
                  ((HashMap)localObject3).put("end_date", Integer.valueOf(R.parseInt(localObject4[1]) + i * 100));
                  ((ArrayList)localObject2).add(localObject3);
                  break;
                  localThrowable2 = localThrowable2;
                  cn.sharesdk.framework.utils.d.a().d(localThrowable2);
                }
              }
              catch (Throwable localThrowable1)
              {
                for (;;)
                {
                  cn.sharesdk.framework.utils.d.a().d(localThrowable1);
                  ((HashMap)localObject3).put("end_date", Integer.valueOf(0));
                }
              }
            }
          }
        }
        paramString = new HashMap();
        paramString.put("list", localObject2);
        paramString = new Hashon().fromHashMap(paramString);
        this.db.put("workJSONArrayStr", paramString.substring(8, paramString.length() - 1));
      }
      if (this.listener != null) {
        this.listener.onComplete(this, 8, (HashMap)localObject1);
      }
      return;
      paramString = "1";
      break;
      paramString = null;
      break label251;
      paramString = "0";
      break label406;
      paramString = null;
      break label476;
      paramString = null;
      break label562;
      paramString = null;
      break label608;
    }
  }
  
  public static class ShareParams
    extends Platform.ShareParams
  {}
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/cn/sharesdk/facebook/Facebook.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */