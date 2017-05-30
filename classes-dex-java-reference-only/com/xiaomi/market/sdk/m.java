package com.xiaomi.market.sdk;

import android.app.DownloadManager;
import android.app.DownloadManager.Query;
import android.content.Context;
import android.database.Cursor;
import android.os.HandlerThread;
import java.io.File;

public class m
{
  public static m aJ;
  private w aK;
  private q aL;
  private long aM = -1L;
  private File aN;
  private DownloadManager aO;
  private HandlerThread aP;
  private n aQ;
  private Context mContext;
  
  private m(Context paramContext)
  {
    this.mContext = paramContext;
    this.aO = ((DownloadManager)this.mContext.getSystemService("download"));
    this.aP = new HandlerThread("Worker Thread");
    this.aP.start();
    this.aQ = new n(this, this.aP.getLooper());
  }
  
  public static m i(Context paramContext)
  {
    if (aJ == null) {
      aJ = new m(paramContext);
    }
    return aJ;
  }
  
  public void a(long paramLong)
  {
    if ((this.aM > 0L) && (this.aM != paramLong)) {
      return;
    }
    this.aQ.m();
  }
  
  public void a(q paramq, w paramw)
  {
    if ((paramw == null) || (paramq == null)) {
      return;
    }
    this.aK = paramw;
    this.aL = paramq;
    this.aQ.l();
  }
  
  public boolean a(q paramq)
  {
    paramq = r.j(this.mContext).query("update_download", l.aI, "package_name=?", new String[] { paramq.packageName }, null, null, null);
    if (paramq != null) {}
    for (;;)
    {
      try
      {
        if (!paramq.moveToFirst()) {
          break label225;
        }
        l = paramq.getLong(paramq.getColumnIndex("download_id"));
        if (l == -1L) {
          return false;
        }
      }
      finally
      {
        if (paramq != null) {
          paramq.close();
        }
      }
      if (paramq != null) {
        paramq.close();
      }
      paramq = new DownloadManager.Query();
      paramq.setFilterById(new long[] { l });
      paramq = this.aO.query(paramq);
      int j = -1;
      int i = j;
      if (paramq != null) {
        i = j;
      }
      try
      {
        if (paramq.moveToFirst()) {
          i = paramq.getInt(paramq.getColumnIndexOrThrow("status"));
        }
        if ((i != 4) && (i != 1) && (i != 2)) {
          return false;
        }
      }
      finally
      {
        if (paramq != null) {
          paramq.close();
        }
      }
      if (paramq != null) {
        paramq.close();
      }
      return true;
      label225:
      long l = -1L;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/xiaomi/market/sdk/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */