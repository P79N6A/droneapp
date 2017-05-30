package com.google.android.gms.appdatasearch;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.b.d.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.amm.a;
import com.google.android.gms.internal.amm.a.a;
import com.google.android.gms.internal.rd;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Locale;
import java.util.zip.CRC32;

public class UsageInfo
  extends AbstractSafeParcelable
{
  public static final j CREATOR = new j();
  final int a;
  final DocumentId b;
  final long c;
  int d;
  public final String e;
  final DocumentContents f;
  final boolean g;
  int h;
  int i;
  
  UsageInfo(int paramInt1, DocumentId paramDocumentId, long paramLong, int paramInt2, String paramString, DocumentContents paramDocumentContents, boolean paramBoolean, int paramInt3, int paramInt4)
  {
    this.a = paramInt1;
    this.b = paramDocumentId;
    this.c = paramLong;
    this.d = paramInt2;
    this.e = paramString;
    this.f = paramDocumentContents;
    this.g = paramBoolean;
    this.h = paramInt3;
    this.i = paramInt4;
  }
  
  private UsageInfo(DocumentId paramDocumentId, long paramLong, int paramInt1, String paramString, DocumentContents paramDocumentContents, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    this(1, paramDocumentId, paramLong, paramInt1, paramString, paramDocumentContents, paramBoolean, paramInt2, paramInt3);
  }
  
  public UsageInfo(String paramString1, Intent paramIntent, String paramString2, Uri paramUri, String paramString3, List<d.b> paramList, int paramInt)
  {
    this(1, a(paramString1, paramIntent), System.currentTimeMillis(), 0, null, a(paramIntent, paramString2, paramUri, paramString3, paramList).a(), false, -1, paramInt);
  }
  
  public static DocumentContents.a a(Intent paramIntent, String paramString1, Uri paramUri, String paramString2, List<d.b> paramList)
  {
    DocumentContents.a locala = new DocumentContents.a();
    locala.a(a(paramString1));
    if (paramUri != null) {
      locala.a(a(paramUri));
    }
    if (paramList != null) {
      locala.a(a(paramList));
    }
    paramString1 = paramIntent.getAction();
    if (paramString1 != null) {
      locala.a(b("intent_action", paramString1));
    }
    paramString1 = paramIntent.getDataString();
    if (paramString1 != null) {
      locala.a(b("intent_data", paramString1));
    }
    paramString1 = paramIntent.getComponent();
    if (paramString1 != null) {
      locala.a(b("intent_activity", paramString1.getClassName()));
    }
    paramIntent = paramIntent.getExtras();
    if (paramIntent != null)
    {
      paramIntent = paramIntent.getString("intent_extra_data_key");
      if (paramIntent != null) {
        locala.a(b("intent_extra_data", paramIntent));
      }
    }
    return locala.a(paramString2).a(true);
  }
  
  public static DocumentId a(String paramString, Intent paramIntent)
  {
    return a(paramString, a(paramIntent));
  }
  
  private static DocumentId a(String paramString1, String paramString2)
  {
    return new DocumentId(paramString1, "", paramString2);
  }
  
  private static DocumentSection a(Uri paramUri)
  {
    return new DocumentSection(paramUri.toString(), new RegisterSectionInfo.a("web_url").a(4).a(true).b("url").a());
  }
  
  private static DocumentSection a(String paramString)
  {
    return new DocumentSection(paramString, new RegisterSectionInfo.a("title").a(1).b(true).b("name").a(), "text1");
  }
  
  private static DocumentSection a(List<d.b> paramList)
  {
    amm.a locala = new amm.a();
    amm.a.a[] arrayOfa = new amm.a.a[paramList.size()];
    int j = 0;
    while (j < arrayOfa.length)
    {
      arrayOfa[j] = new amm.a.a();
      d.b localb = (d.b)paramList.get(j);
      arrayOfa[j].a = localb.a.toString();
      arrayOfa[j].c = localb.c;
      if (localb.b != null) {
        arrayOfa[j].b = localb.b.toString();
      }
      j += 1;
    }
    locala.a = arrayOfa;
    return new DocumentSection(rd.a(locala), new RegisterSectionInfo.a("outlinks").a(true).b(".private:outLinks").a("blob").a());
  }
  
  private static String a(Intent paramIntent)
  {
    paramIntent = paramIntent.toUri(1);
    CRC32 localCRC32 = new CRC32();
    try
    {
      localCRC32.update(paramIntent.getBytes("UTF-8"));
      return Long.toHexString(localCRC32.getValue());
    }
    catch (UnsupportedEncodingException paramIntent)
    {
      throw new IllegalStateException(paramIntent);
    }
  }
  
  private static DocumentSection b(String paramString1, String paramString2)
  {
    return new DocumentSection(paramString2, new RegisterSectionInfo.a(paramString1).a(true).a(), paramString1);
  }
  
  public String toString()
  {
    return String.format(Locale.US, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", new Object[] { this.b, Long.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.i) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    j localj = CREATOR;
    j.a(this, paramParcel, paramInt);
  }
  
  public static final class a
  {
    private DocumentId a;
    private long b = -1L;
    private int c = -1;
    private DocumentContents d;
    private boolean e = false;
    private int f = -1;
    private int g = 0;
    
    public a a(int paramInt)
    {
      this.c = paramInt;
      return this;
    }
    
    public a a(long paramLong)
    {
      this.b = paramLong;
      return this;
    }
    
    public a a(DocumentContents paramDocumentContents)
    {
      this.d = paramDocumentContents;
      return this;
    }
    
    public a a(DocumentId paramDocumentId)
    {
      this.a = paramDocumentId;
      return this;
    }
    
    public a a(boolean paramBoolean)
    {
      this.e = paramBoolean;
      return this;
    }
    
    public UsageInfo a()
    {
      return new UsageInfo(this.a, this.b, this.c, null, this.d, this.e, this.f, this.g, null);
    }
    
    public a b(int paramInt)
    {
      this.g = paramInt;
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/appdatasearch/UsageInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */