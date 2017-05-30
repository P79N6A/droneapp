package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class n
  extends c
{
  public static final String g = f.b("com.google.cast.media");
  private long h;
  private MediaStatus i;
  private final List<q> j = new ArrayList();
  private a k;
  private final q l = new q(this.b, 86400000L);
  private final q m = new q(this.b, 86400000L);
  private final q n = new q(this.b, 86400000L);
  private final q o = new q(this.b, 86400000L);
  private final q p = new q(this.b, 86400000L);
  private final q q = new q(this.b, 86400000L);
  private final q r = new q(this.b, 86400000L);
  private final q s = new q(this.b, 86400000L);
  private final q t = new q(this.b, 86400000L);
  private final q u = new q(this.b, 86400000L);
  private final q v = new q(this.b, 86400000L);
  private final q w = new q(this.b, 86400000L);
  private final q x = new q(this.b, 86400000L);
  private final q y = new q(this.b, 86400000L);
  
  public n(String paramString)
  {
    super(g, h.d(), "MediaControlChannel", paramString, 1000L);
    this.j.add(this.l);
    this.j.add(this.m);
    this.j.add(this.n);
    this.j.add(this.o);
    this.j.add(this.p);
    this.j.add(this.q);
    this.j.add(this.r);
    this.j.add(this.s);
    this.j.add(this.t);
    this.j.add(this.u);
    this.j.add(this.v);
    this.j.add(this.w);
    this.j.add(this.x);
    this.j.add(this.y);
    m();
  }
  
  private void a(long paramLong, JSONObject paramJSONObject)
  {
    int i3 = 1;
    boolean bool = this.l.a(paramLong);
    int i2;
    if ((this.p.b()) && (!this.p.a(paramLong)))
    {
      i1 = 1;
      if (this.q.b())
      {
        i2 = i3;
        if (!this.q.a(paramLong)) {}
      }
      else
      {
        if ((!this.r.b()) || (this.r.a(paramLong))) {
          break label277;
        }
        i2 = i3;
      }
      label87:
      if (i1 == 0) {
        break label299;
      }
    }
    label277:
    label299:
    for (int i1 = 2;; i1 = 0)
    {
      i3 = i1;
      if (i2 != 0) {
        i3 = i1 | 0x1;
      }
      if ((bool) || (this.i == null))
      {
        this.i = new MediaStatus(paramJSONObject);
        this.h = this.b.b();
      }
      for (i1 = 31;; i1 = this.i.a(paramJSONObject, i3))
      {
        if ((i1 & 0x1) != 0)
        {
          this.h = this.b.b();
          i();
        }
        if ((i1 & 0x2) != 0)
        {
          this.h = this.b.b();
          i();
        }
        if ((i1 & 0x4) != 0) {
          j();
        }
        if ((i1 & 0x8) != 0) {
          k();
        }
        if ((i1 & 0x10) != 0) {
          l();
        }
        paramJSONObject = this.j.iterator();
        while (paramJSONObject.hasNext()) {
          ((q)paramJSONObject.next()).a(paramLong, 0);
        }
        i1 = 0;
        break;
        i2 = 0;
        break label87;
      }
      return;
    }
  }
  
  private void i()
  {
    if (this.k != null) {
      this.k.a();
    }
  }
  
  private void j()
  {
    if (this.k != null) {
      this.k.b();
    }
  }
  
  private void k()
  {
    if (this.k != null) {
      this.k.c();
    }
  }
  
  private void l()
  {
    if (this.k != null) {
      this.k.d();
    }
  }
  
  private void m()
  {
    this.h = 0L;
    this.i = null;
    Iterator localIterator = this.j.iterator();
    while (localIterator.hasNext()) {
      ((q)localIterator.next()).a();
    }
  }
  
  public long a(p paramp)
  {
    JSONObject localJSONObject = new JSONObject();
    long l1 = c();
    this.s.a(l1, paramp);
    a(true);
    try
    {
      localJSONObject.put("requestId", l1);
      localJSONObject.put("type", "GET_STATUS");
      if (this.i != null) {
        localJSONObject.put("mediaSessionId", this.i.b());
      }
      a(localJSONObject.toString(), l1, null);
      return l1;
    }
    catch (JSONException paramp)
    {
      for (;;) {}
    }
  }
  
  public long a(p paramp, double paramDouble, JSONObject paramJSONObject)
  {
    if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble))) {
      throw new IllegalArgumentException(41 + "Volume cannot be " + paramDouble);
    }
    JSONObject localJSONObject = new JSONObject();
    long l1 = c();
    this.q.a(l1, paramp);
    a(true);
    try
    {
      localJSONObject.put("requestId", l1);
      localJSONObject.put("type", "SET_VOLUME");
      localJSONObject.put("mediaSessionId", h());
      paramp = new JSONObject();
      paramp.put("level", paramDouble);
      localJSONObject.put("volume", paramp);
      if (paramJSONObject != null) {
        localJSONObject.put("customData", paramJSONObject);
      }
    }
    catch (JSONException paramp)
    {
      for (;;) {}
    }
    a(localJSONObject.toString(), l1, null);
    return l1;
  }
  
  public long a(p paramp, int paramInt1, long paramLong, MediaQueueItem[] paramArrayOfMediaQueueItem, int paramInt2, Integer paramInteger, JSONObject paramJSONObject)
  {
    if ((paramLong != -1L) && (paramLong < 0L)) {
      throw new IllegalArgumentException(53 + "playPosition cannot be negative: " + paramLong);
    }
    JSONObject localJSONObject = new JSONObject();
    long l1 = c();
    this.w.a(l1, paramp);
    a(true);
    for (;;)
    {
      try
      {
        localJSONObject.put("requestId", l1);
        localJSONObject.put("type", "QUEUE_UPDATE");
        localJSONObject.put("mediaSessionId", h());
        if (paramInt1 != 0) {
          localJSONObject.put("currentItemId", paramInt1);
        }
        if (paramInt2 != 0) {
          localJSONObject.put("jump", paramInt2);
        }
        if ((paramArrayOfMediaQueueItem != null) && (paramArrayOfMediaQueueItem.length > 0))
        {
          paramp = new JSONArray();
          paramInt1 = 0;
          if (paramInt1 < paramArrayOfMediaQueueItem.length)
          {
            paramp.put(paramInt1, paramArrayOfMediaQueueItem[paramInt1].k());
            paramInt1 += 1;
            continue;
          }
          localJSONObject.put("items", paramp);
        }
        if (paramInteger != null) {}
        switch (paramInteger.intValue())
        {
        case 0: 
          if (paramLong != -1L) {
            localJSONObject.put("currentTime", f.a(paramLong));
          }
          if (paramJSONObject != null) {
            localJSONObject.put("customData", paramJSONObject);
          }
          break;
        }
      }
      catch (JSONException paramp)
      {
        continue;
      }
      a(localJSONObject.toString(), l1, null);
      return l1;
      localJSONObject.put("repeatMode", "REPEAT_OFF");
      continue;
      localJSONObject.put("repeatMode", "REPEAT_ALL");
      continue;
      localJSONObject.put("repeatMode", "REPEAT_SINGLE");
      continue;
      localJSONObject.put("repeatMode", "REPEAT_ALL_AND_SHUFFLE");
    }
  }
  
  public long a(p paramp, long paramLong, int paramInt, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    long l1 = c();
    this.p.a(l1, paramp);
    a(true);
    for (;;)
    {
      try
      {
        localJSONObject.put("requestId", l1);
        localJSONObject.put("type", "SEEK");
        localJSONObject.put("mediaSessionId", h());
        localJSONObject.put("currentTime", f.a(paramLong));
        if (paramInt != 1) {
          continue;
        }
        localJSONObject.put("resumeState", "PLAYBACK_START");
        if (paramJSONObject != null) {
          localJSONObject.put("customData", paramJSONObject);
        }
      }
      catch (JSONException paramp)
      {
        continue;
      }
      a(localJSONObject.toString(), l1, null);
      return l1;
      if (paramInt == 2) {
        localJSONObject.put("resumeState", "PLAYBACK_PAUSE");
      }
    }
  }
  
  public long a(p paramp, MediaInfo paramMediaInfo, boolean paramBoolean, long paramLong, long[] paramArrayOfLong, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    long l1 = c();
    this.l.a(l1, paramp);
    a(true);
    try
    {
      localJSONObject.put("requestId", l1);
      localJSONObject.put("type", "LOAD");
      localJSONObject.put("media", paramMediaInfo.l());
      localJSONObject.put("autoplay", paramBoolean);
      localJSONObject.put("currentTime", f.a(paramLong));
      if (paramArrayOfLong != null)
      {
        paramp = new JSONArray();
        int i1 = 0;
        while (i1 < paramArrayOfLong.length)
        {
          paramp.put(i1, paramArrayOfLong[i1]);
          i1 += 1;
        }
        localJSONObject.put("activeTrackIds", paramp);
      }
      if (paramJSONObject != null) {
        localJSONObject.put("customData", paramJSONObject);
      }
    }
    catch (JSONException paramp)
    {
      for (;;) {}
    }
    a(localJSONObject.toString(), l1, null);
    return l1;
  }
  
  public long a(p paramp, TextTrackStyle paramTextTrackStyle)
  {
    JSONObject localJSONObject = new JSONObject();
    long l1 = c();
    this.u.a(l1, paramp);
    a(true);
    try
    {
      localJSONObject.put("requestId", l1);
      localJSONObject.put("type", "EDIT_TRACKS_INFO");
      if (paramTextTrackStyle != null) {
        localJSONObject.put("textTrackStyle", paramTextTrackStyle.n());
      }
      localJSONObject.put("mediaSessionId", h());
    }
    catch (JSONException paramp)
    {
      for (;;) {}
    }
    a(localJSONObject.toString(), l1, null);
    return l1;
  }
  
  public long a(p paramp, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    long l1 = c();
    this.m.a(l1, paramp);
    a(true);
    try
    {
      localJSONObject.put("requestId", l1);
      localJSONObject.put("type", "PAUSE");
      localJSONObject.put("mediaSessionId", h());
      if (paramJSONObject != null) {
        localJSONObject.put("customData", paramJSONObject);
      }
    }
    catch (JSONException paramp)
    {
      for (;;) {}
    }
    a(localJSONObject.toString(), l1, null);
    return l1;
  }
  
  public long a(p paramp, boolean paramBoolean, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    long l1 = c();
    this.r.a(l1, paramp);
    a(true);
    try
    {
      localJSONObject.put("requestId", l1);
      localJSONObject.put("type", "SET_VOLUME");
      localJSONObject.put("mediaSessionId", h());
      paramp = new JSONObject();
      paramp.put("muted", paramBoolean);
      localJSONObject.put("volume", paramp);
      if (paramJSONObject != null) {
        localJSONObject.put("customData", paramJSONObject);
      }
    }
    catch (JSONException paramp)
    {
      for (;;) {}
    }
    a(localJSONObject.toString(), l1, null);
    return l1;
  }
  
  public long a(p paramp, int[] paramArrayOfInt, int paramInt, JSONObject paramJSONObject)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      throw new IllegalArgumentException("itemIdsToReorder must not be null or empty.");
    }
    JSONObject localJSONObject = new JSONObject();
    long l1 = c();
    this.y.a(l1, paramp);
    a(true);
    try
    {
      localJSONObject.put("requestId", l1);
      localJSONObject.put("type", "QUEUE_REORDER");
      localJSONObject.put("mediaSessionId", h());
      paramp = new JSONArray();
      int i1 = 0;
      while (i1 < paramArrayOfInt.length)
      {
        paramp.put(i1, paramArrayOfInt[i1]);
        i1 += 1;
      }
      localJSONObject.put("itemIds", paramp);
      if (paramInt != 0) {
        localJSONObject.put("insertBefore", paramInt);
      }
      if (paramJSONObject != null) {
        localJSONObject.put("customData", paramJSONObject);
      }
    }
    catch (JSONException paramp)
    {
      for (;;) {}
    }
    a(localJSONObject.toString(), l1, null);
    return l1;
  }
  
  public long a(p paramp, int[] paramArrayOfInt, JSONObject paramJSONObject)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
    }
    JSONObject localJSONObject = new JSONObject();
    long l1 = c();
    this.x.a(l1, paramp);
    a(true);
    try
    {
      localJSONObject.put("requestId", l1);
      localJSONObject.put("type", "QUEUE_REMOVE");
      localJSONObject.put("mediaSessionId", h());
      paramp = new JSONArray();
      int i1 = 0;
      while (i1 < paramArrayOfInt.length)
      {
        paramp.put(i1, paramArrayOfInt[i1]);
        i1 += 1;
      }
      localJSONObject.put("itemIds", paramp);
      if (paramJSONObject != null) {
        localJSONObject.put("customData", paramJSONObject);
      }
    }
    catch (JSONException paramp)
    {
      for (;;) {}
    }
    a(localJSONObject.toString(), l1, null);
    return l1;
  }
  
  public long a(p paramp, long[] paramArrayOfLong)
  {
    JSONObject localJSONObject = new JSONObject();
    long l1 = c();
    this.t.a(l1, paramp);
    a(true);
    try
    {
      localJSONObject.put("requestId", l1);
      localJSONObject.put("type", "EDIT_TRACKS_INFO");
      localJSONObject.put("mediaSessionId", h());
      paramp = new JSONArray();
      int i1 = 0;
      while (i1 < paramArrayOfLong.length)
      {
        paramp.put(i1, paramArrayOfLong[i1]);
        i1 += 1;
      }
      localJSONObject.put("activeTrackIds", paramp);
    }
    catch (JSONException paramp)
    {
      for (;;) {}
    }
    a(localJSONObject.toString(), l1, null);
    return l1;
  }
  
  public long a(p paramp, MediaQueueItem[] paramArrayOfMediaQueueItem, int paramInt1, int paramInt2, int paramInt3, long paramLong, JSONObject paramJSONObject)
  {
    if ((paramArrayOfMediaQueueItem == null) || (paramArrayOfMediaQueueItem.length == 0)) {
      throw new IllegalArgumentException("itemsToInsert must not be null or empty.");
    }
    if ((paramInt2 != 0) && (paramInt3 != -1)) {
      throw new IllegalArgumentException("can not set both currentItemId and currentItemIndexInItemsToInsert");
    }
    if ((paramInt3 != -1) && ((paramInt3 < 0) || (paramInt3 >= paramArrayOfMediaQueueItem.length))) {
      throw new IllegalArgumentException(String.format("currentItemIndexInItemsToInsert %d out of range [0, %d).", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramArrayOfMediaQueueItem.length) }));
    }
    if ((paramLong != -1L) && (paramLong < 0L)) {
      throw new IllegalArgumentException(54 + "playPosition can not be negative: " + paramLong);
    }
    JSONObject localJSONObject = new JSONObject();
    long l1 = c();
    this.v.a(l1, paramp);
    a(true);
    try
    {
      localJSONObject.put("requestId", l1);
      localJSONObject.put("type", "QUEUE_INSERT");
      localJSONObject.put("mediaSessionId", h());
      paramp = new JSONArray();
      int i1 = 0;
      while (i1 < paramArrayOfMediaQueueItem.length)
      {
        paramp.put(i1, paramArrayOfMediaQueueItem[i1].k());
        i1 += 1;
      }
      localJSONObject.put("items", paramp);
      if (paramInt1 != 0) {
        localJSONObject.put("insertBefore", paramInt1);
      }
      if (paramInt2 != 0) {
        localJSONObject.put("currentItemId", paramInt2);
      }
      if (paramInt3 != -1) {
        localJSONObject.put("currentItemIndex", paramInt3);
      }
      if (paramLong != -1L) {
        localJSONObject.put("currentTime", f.a(paramLong));
      }
      if (paramJSONObject != null) {
        localJSONObject.put("customData", paramJSONObject);
      }
    }
    catch (JSONException paramp)
    {
      for (;;) {}
    }
    a(localJSONObject.toString(), l1, null);
    return l1;
  }
  
  public long a(p paramp, MediaQueueItem[] paramArrayOfMediaQueueItem, int paramInt1, int paramInt2, long paramLong, JSONObject paramJSONObject)
  {
    if ((paramArrayOfMediaQueueItem == null) || (paramArrayOfMediaQueueItem.length == 0)) {
      throw new IllegalArgumentException("items must not be null or empty.");
    }
    if ((paramInt1 < 0) || (paramInt1 >= paramArrayOfMediaQueueItem.length)) {
      throw new IllegalArgumentException(31 + "Invalid startIndex: " + paramInt1);
    }
    if ((paramLong != -1L) && (paramLong < 0L)) {
      throw new IllegalArgumentException(54 + "playPosition can not be negative: " + paramLong);
    }
    JSONObject localJSONObject = new JSONObject();
    long l1 = c();
    this.l.a(l1, paramp);
    a(true);
    for (;;)
    {
      try
      {
        localJSONObject.put("requestId", l1);
        localJSONObject.put("type", "QUEUE_LOAD");
        paramp = new JSONArray();
        int i1 = 0;
        if (i1 < paramArrayOfMediaQueueItem.length)
        {
          paramp.put(i1, paramArrayOfMediaQueueItem[i1].k());
          i1 += 1;
          continue;
        }
        localJSONObject.put("items", paramp);
        switch (paramInt2)
        {
        case 0: 
          throw new IllegalArgumentException(32 + "Invalid repeat mode: " + paramInt2);
        }
      }
      catch (JSONException paramp)
      {
        a(localJSONObject.toString(), l1, null);
        return l1;
      }
      localJSONObject.put("repeatMode", "REPEAT_OFF");
      for (;;)
      {
        localJSONObject.put("startIndex", paramInt1);
        if (paramLong != -1L) {
          localJSONObject.put("currentTime", f.a(paramLong));
        }
        if (paramJSONObject == null) {
          break;
        }
        localJSONObject.put("customData", paramJSONObject);
        break;
        localJSONObject.put("repeatMode", "REPEAT_ALL");
        continue;
        localJSONObject.put("repeatMode", "REPEAT_SINGLE");
        continue;
        localJSONObject.put("repeatMode", "REPEAT_ALL_AND_SHUFFLE");
      }
    }
  }
  
  public void a()
  {
    super.a();
    m();
  }
  
  public void a(long paramLong, int paramInt)
  {
    Iterator localIterator = this.j.iterator();
    while (localIterator.hasNext()) {
      ((q)localIterator.next()).a(paramLong, paramInt);
    }
  }
  
  public void a(a parama)
  {
    this.k = parama;
  }
  
  protected boolean a(long paramLong)
  {
    ??? = this.j.iterator();
    while (((Iterator)???).hasNext()) {
      ((q)((Iterator)???).next()).b(paramLong, 2102);
    }
    for (;;)
    {
      synchronized (q.a)
      {
        Iterator localIterator = this.j.iterator();
        if (localIterator.hasNext())
        {
          if (!((q)localIterator.next()).b()) {
            continue;
          }
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public long b(p paramp, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    long l1 = c();
    this.o.a(l1, paramp);
    a(true);
    try
    {
      localJSONObject.put("requestId", l1);
      localJSONObject.put("type", "STOP");
      localJSONObject.put("mediaSessionId", h());
      if (paramJSONObject != null) {
        localJSONObject.put("customData", paramJSONObject);
      }
    }
    catch (JSONException paramp)
    {
      for (;;) {}
    }
    a(localJSONObject.toString(), l1, null);
    return l1;
  }
  
  public final void b(String paramString)
  {
    this.f.b("message received: %s", new Object[] { paramString });
    Object localObject2;
    long l1;
    try
    {
      Object localObject1 = new JSONObject(paramString);
      localObject2 = ((JSONObject)localObject1).getString("type");
      l1 = ((JSONObject)localObject1).optLong("requestId", -1L);
      if (((String)localObject2).equals("MEDIA_STATUS"))
      {
        localObject1 = ((JSONObject)localObject1).getJSONArray("status");
        if (((JSONArray)localObject1).length() > 0)
        {
          a(l1, ((JSONArray)localObject1).getJSONObject(0));
          return;
        }
        this.i = null;
        i();
        j();
        k();
        l();
        this.s.a(l1, 0);
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      this.f.d("Message is malformed (%s); ignoring: %s", new Object[] { localJSONException.getMessage(), paramString });
      return;
    }
    JSONObject localJSONObject;
    if (((String)localObject2).equals("INVALID_PLAYER_STATE"))
    {
      this.f.d("received unexpected error: Invalid Player State.", new Object[0]);
      localJSONObject = localJSONException.optJSONObject("customData");
      localObject2 = this.j.iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((q)((Iterator)localObject2).next()).a(l1, 2100, localJSONObject);
      }
    }
    if (((String)localObject2).equals("LOAD_FAILED"))
    {
      localJSONObject = localJSONObject.optJSONObject("customData");
      this.l.a(l1, 2100, localJSONObject);
      return;
    }
    if (((String)localObject2).equals("LOAD_CANCELLED"))
    {
      localJSONObject = localJSONObject.optJSONObject("customData");
      this.l.a(l1, 2101, localJSONObject);
      return;
    }
    if (((String)localObject2).equals("INVALID_REQUEST"))
    {
      this.f.d("received unexpected error: Invalid Request.", new Object[0]);
      localJSONObject = localJSONObject.optJSONObject("customData");
      localObject2 = this.j.iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((q)((Iterator)localObject2).next()).a(l1, 2100, localJSONObject);
      }
    }
  }
  
  public long c(p paramp, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = new JSONObject();
    long l1 = c();
    this.n.a(l1, paramp);
    a(true);
    try
    {
      localJSONObject.put("requestId", l1);
      localJSONObject.put("type", "PLAY");
      localJSONObject.put("mediaSessionId", h());
      if (paramJSONObject != null) {
        localJSONObject.put("customData", paramJSONObject);
      }
    }
    catch (JSONException paramp)
    {
      for (;;) {}
    }
    a(localJSONObject.toString(), l1, null);
    return l1;
  }
  
  public long d()
  {
    MediaInfo localMediaInfo = g();
    if (localMediaInfo == null) {}
    while (this.h == 0L) {
      return 0L;
    }
    double d = this.i.e();
    long l3 = this.i.g();
    int i1 = this.i.c();
    if ((d == 0.0D) || (i1 != 2)) {
      return l3;
    }
    long l1 = this.b.b() - this.h;
    if (l1 < 0L) {
      l1 = 0L;
    }
    for (;;)
    {
      if (l1 == 0L) {
        return l3;
      }
      long l2 = localMediaInfo.f();
      l1 = l3 + (l1 * d);
      if ((l2 > 0L) && (l1 > l2)) {
        l1 = l2;
      }
      for (;;)
      {
        return l1;
        if (l1 < 0L) {
          l1 = 0L;
        }
      }
    }
  }
  
  public long e()
  {
    MediaInfo localMediaInfo = g();
    if (localMediaInfo != null) {
      return localMediaInfo.f();
    }
    return 0L;
  }
  
  public MediaStatus f()
  {
    return this.i;
  }
  
  public MediaInfo g()
  {
    if (this.i == null) {
      return null;
    }
    return this.i.f();
  }
  
  public long h()
  {
    if (this.i == null) {
      throw new IllegalStateException("No current media session");
    }
    return this.i.b();
  }
  
  public static abstract interface a
  {
    public abstract void a();
    
    public abstract void b();
    
    public abstract void c();
    
    public abstract void d();
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/google/android/gms/cast/internal/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */