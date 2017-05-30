package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@aaa
public class vz
  implements vt
{
  final HashMap<String, acl<JSONObject>> a = new HashMap();
  
  public Future<JSONObject> a(String paramString)
  {
    acl localacl = new acl();
    this.a.put(paramString, localacl);
    return localacl;
  }
  
  public void a(acy paramacy, Map<String, String> paramMap)
  {
    a((String)paramMap.get("request_id"), (String)paramMap.get("fetched_ad"));
  }
  
  public void a(String paramString1, String paramString2)
  {
    abr.a("Received ad from the cache.");
    acl localacl = (acl)this.a.get(paramString1);
    if (localacl == null)
    {
      abr.b("Could not find the ad request for the corresponding ad response.");
      return;
    }
    try
    {
      localacl.b(new JSONObject(paramString2));
      return;
    }
    catch (JSONException paramString2)
    {
      abr.b("Failed constructing JSON object from value passed from javascript", paramString2);
      localacl.b(null);
      return;
    }
    finally
    {
      this.a.remove(paramString1);
    }
  }
  
  public void b(String paramString)
  {
    acl localacl = (acl)this.a.get(paramString);
    if (localacl == null)
    {
      abr.b("Could not find the ad request for the corresponding ad response.");
      return;
    }
    if (!localacl.isDone()) {
      localacl.cancel(true);
    }
    this.a.remove(paramString);
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/internal/vz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */