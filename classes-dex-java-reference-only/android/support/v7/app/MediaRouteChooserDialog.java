package android.support.v7.app;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.support.v7.media.MediaRouter.Callback;
import android.support.v7.media.MediaRouter.RouteGroup;
import android.support.v7.media.MediaRouter.RouteInfo;
import android.support.v7.mediarouter.R.attr;
import android.support.v7.mediarouter.R.id;
import android.support.v7.mediarouter.R.layout;
import android.support.v7.mediarouter.R.string;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MediaRouteChooserDialog
  extends Dialog
{
  private static final String TAG = "MediaRouteChooserDialog";
  private RouteAdapter mAdapter;
  private boolean mAttachedToWindow;
  private final MediaRouterCallback mCallback = new MediaRouterCallback(null);
  private ListView mListView;
  private AsyncTask<Void, Void, Void> mOnItemClickTask;
  private AsyncTask<Void, Void, Void> mRefreshRoutesTask;
  private final MediaRouter mRouter = MediaRouter.getInstance(getContext());
  private ArrayList<MediaRouter.RouteInfo> mRoutes;
  private MediaRouteSelector mSelector = MediaRouteSelector.EMPTY;
  
  public MediaRouteChooserDialog(Context paramContext)
  {
    this(paramContext, 0);
  }
  
  public MediaRouteChooserDialog(Context paramContext, int paramInt)
  {
    super(MediaRouterThemeHelper.createThemedContext(paramContext, paramInt), paramInt);
  }
  
  @NonNull
  public MediaRouteSelector getRouteSelector()
  {
    return this.mSelector;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.mAttachedToWindow = true;
    this.mRouter.addCallback(this.mSelector, this.mCallback, 1);
    refreshRoutes();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.mr_chooser_dialog);
    setTitle(R.string.mr_chooser_title);
    this.mRoutes = new ArrayList();
    this.mAdapter = new RouteAdapter(getContext(), this.mRoutes);
    this.mListView = ((ListView)findViewById(R.id.mr_chooser_list));
    this.mListView.setAdapter(this.mAdapter);
    this.mListView.setOnItemClickListener(this.mAdapter);
    this.mListView.setEmptyView(findViewById(16908292));
    updateLayout();
  }
  
  public void onDetachedFromWindow()
  {
    this.mAttachedToWindow = false;
    this.mRouter.removeCallback(this.mCallback);
    super.onDetachedFromWindow();
  }
  
  public boolean onFilterRoute(@NonNull MediaRouter.RouteInfo paramRouteInfo)
  {
    return (!paramRouteInfo.isDefaultOrBluetooth()) && (paramRouteInfo.isEnabled()) && (paramRouteInfo.matchesSelector(this.mSelector));
  }
  
  public void onFilterRoutes(@NonNull List<MediaRouter.RouteInfo> paramList)
  {
    int i = paramList.size();
    for (;;)
    {
      int j = i - 1;
      if (i > 0)
      {
        if (!onFilterRoute((MediaRouter.RouteInfo)paramList.get(j)))
        {
          paramList.remove(j);
          i = j;
        }
      }
      else {
        return;
      }
      i = j;
    }
  }
  
  public void refreshRoutes()
  {
    if (this.mAttachedToWindow)
    {
      if (this.mRefreshRoutesTask != null)
      {
        this.mRefreshRoutesTask.cancel(true);
        this.mRefreshRoutesTask = null;
      }
      this.mRefreshRoutesTask = new AsyncTask()
      {
        private ArrayList<MediaRouter.RouteInfo> mNewRoutes;
        
        protected Void doInBackground(Void... arg1)
        {
          synchronized (MediaRouteChooserDialog.this)
          {
            if (!isCancelled()) {
              MediaRouteChooserDialog.RouteComparator.access$200(MediaRouteChooserDialog.RouteComparator.getInstance(MediaRouteChooserDialog.this.getContext()), this.mNewRoutes);
            }
            return null;
          }
        }
        
        protected void onPostExecute(Void paramAnonymousVoid)
        {
          MediaRouteChooserDialog.this.mRoutes.clear();
          MediaRouteChooserDialog.this.mRoutes.addAll(this.mNewRoutes);
          Collections.sort(MediaRouteChooserDialog.this.mRoutes, MediaRouteChooserDialog.RouteComparator.access$400());
          MediaRouteChooserDialog.this.mAdapter.notifyDataSetChanged();
          MediaRouteChooserDialog.access$602(MediaRouteChooserDialog.this, null);
        }
        
        protected void onPreExecute()
        {
          this.mNewRoutes = new ArrayList(MediaRouteChooserDialog.this.mRouter.getRoutes());
          MediaRouteChooserDialog.this.onFilterRoutes(this.mNewRoutes);
        }
      }.execute(new Void[0]);
    }
  }
  
  public void setRouteSelector(@NonNull MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector == null) {
      throw new IllegalArgumentException("selector must not be null");
    }
    if (!this.mSelector.equals(paramMediaRouteSelector))
    {
      this.mSelector = paramMediaRouteSelector;
      if (this.mAttachedToWindow)
      {
        this.mRouter.removeCallback(this.mCallback);
        this.mRouter.addCallback(paramMediaRouteSelector, this.mCallback, 1);
      }
      refreshRoutes();
    }
  }
  
  void updateLayout()
  {
    getWindow().setLayout(MediaRouteDialogHelper.getDialogWidth(getContext()), -2);
  }
  
  private final class MediaRouterCallback
    extends MediaRouter.Callback
  {
    private MediaRouterCallback() {}
    
    public void onRouteAdded(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      MediaRouteChooserDialog.this.refreshRoutes();
    }
    
    public void onRouteChanged(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      MediaRouteChooserDialog.this.refreshRoutes();
    }
    
    public void onRouteRemoved(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      MediaRouteChooserDialog.this.refreshRoutes();
    }
    
    public void onRouteSelected(MediaRouter paramMediaRouter, MediaRouter.RouteInfo paramRouteInfo)
    {
      MediaRouteChooserDialog.this.dismiss();
    }
  }
  
  private final class RouteAdapter
    extends ArrayAdapter<MediaRouter.RouteInfo>
    implements AdapterView.OnItemClickListener
  {
    private final Drawable mDefaultIcon;
    private final LayoutInflater mInflater;
    private final Drawable mSpeakerGroupIcon;
    private final Drawable mSpeakerIcon;
    private final Drawable mTvIcon;
    
    public RouteAdapter(List<MediaRouter.RouteInfo> paramList)
    {
      super(0, localList);
      this.mInflater = LayoutInflater.from(paramList);
      this$1 = getContext().obtainStyledAttributes(new int[] { R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable });
      this.mDefaultIcon = MediaRouteChooserDialog.this.getDrawable(0);
      this.mTvIcon = MediaRouteChooserDialog.this.getDrawable(1);
      this.mSpeakerIcon = MediaRouteChooserDialog.this.getDrawable(2);
      this.mSpeakerGroupIcon = MediaRouteChooserDialog.this.getDrawable(3);
      MediaRouteChooserDialog.this.recycle();
    }
    
    private Drawable getDefaultIconDrawable(MediaRouter.RouteInfo paramRouteInfo)
    {
      switch (paramRouteInfo.getDeviceType())
      {
      default: 
        if ((paramRouteInfo instanceof MediaRouter.RouteGroup)) {
          return this.mSpeakerGroupIcon;
        }
        break;
      case 1: 
        return this.mTvIcon;
      case 2: 
        return this.mSpeakerIcon;
      }
      return this.mDefaultIcon;
    }
    
    private Drawable getIconDrawable(MediaRouter.RouteInfo paramRouteInfo)
    {
      Uri localUri = paramRouteInfo.getIconUri();
      if (localUri != null) {
        try
        {
          Drawable localDrawable = Drawable.createFromStream(getContext().getContentResolver().openInputStream(localUri), null);
          if (localDrawable != null) {
            return localDrawable;
          }
        }
        catch (IOException localIOException)
        {
          Log.w("MediaRouteChooserDialog", "Failed to load " + localUri, localIOException);
        }
      }
      return getDefaultIconDrawable(paramRouteInfo);
    }
    
    public boolean areAllItemsEnabled()
    {
      return false;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      int i = 1;
      View localView = paramView;
      if (paramView == null) {
        localView = this.mInflater.inflate(R.layout.mr_chooser_list_item, paramViewGroup, false);
      }
      paramView = (MediaRouter.RouteInfo)getItem(paramInt);
      paramViewGroup = (TextView)localView.findViewById(R.id.mr_chooser_route_name);
      TextView localTextView = (TextView)localView.findViewById(R.id.mr_chooser_route_desc);
      paramViewGroup.setText(paramView.getName());
      String str = paramView.getDescription();
      paramInt = i;
      if (paramView.getConnectionState() != 2)
      {
        if (paramView.getConnectionState() == 1) {
          paramInt = i;
        }
      }
      else
      {
        if ((paramInt == 0) || (TextUtils.isEmpty(str))) {
          break label167;
        }
        paramViewGroup.setGravity(80);
        localTextView.setVisibility(0);
        localTextView.setText(str);
      }
      for (;;)
      {
        localView.setEnabled(paramView.isEnabled());
        paramViewGroup = (ImageView)localView.findViewById(R.id.mr_chooser_route_icon);
        if (paramViewGroup != null) {
          paramViewGroup.setImageDrawable(getIconDrawable(paramView));
        }
        return localView;
        paramInt = 0;
        break;
        label167:
        paramViewGroup.setGravity(16);
        localTextView.setVisibility(8);
        localTextView.setText("");
      }
    }
    
    public boolean isEnabled(int paramInt)
    {
      return ((MediaRouter.RouteInfo)getItem(paramInt)).isEnabled();
    }
    
    public void onItemClick(final AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
    {
      paramAdapterView = (MediaRouter.RouteInfo)getItem(paramInt);
      if ((paramAdapterView.isEnabled()) && (MediaRouteChooserDialog.this.mOnItemClickTask == null)) {
        MediaRouteChooserDialog.access$702(MediaRouteChooserDialog.this, new AsyncTask()
        {
          protected Void doInBackground(Void... paramAnonymousVarArgs)
          {
            MediaRouteChooserDialog.RouteComparator.access$800(MediaRouteChooserDialog.RouteComparator.getInstance(MediaRouteChooserDialog.RouteAdapter.this.getContext()), paramAdapterView.getId());
            return null;
          }
          
          protected void onPostExecute(Void paramAnonymousVoid)
          {
            MediaRouteChooserDialog.this.dismiss();
            MediaRouteChooserDialog.access$702(MediaRouteChooserDialog.this, null);
          }
          
          protected void onPreExecute()
          {
            paramAdapterView.select();
          }
        }.execute(new Void[0]));
      }
    }
  }
  
  private static final class RouteComparator
    implements Comparator<MediaRouter.RouteInfo>
  {
    private static final float MIN_USAGE_SCORE = 0.1F;
    private static final String PREF_ROUTE_IDS = "android.support.v7.app.MediaRouteChooserDialog_route_ids";
    private static final String PREF_USAGE_SCORE_PREFIX = "android.support.v7.app.MediaRouteChooserDialog_route_usage_score_";
    private static final float USAGE_SCORE_DECAY_FACTOR = 0.95F;
    private static RouteComparator sInstance;
    private final SharedPreferences mPreferences;
    private final HashMap<String, Float> mRouteUsageScoreMap = new HashMap();
    
    private RouteComparator(Context paramContext)
    {
      this.mPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    }
    
    public static RouteComparator getInstance(Context paramContext)
    {
      if (sInstance == null) {
        sInstance = new RouteComparator(paramContext);
      }
      return sInstance;
    }
    
    private void loadRouteUsageScores(List<MediaRouter.RouteInfo> paramList)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        MediaRouter.RouteInfo localRouteInfo = (MediaRouter.RouteInfo)paramList.next();
        if (this.mRouteUsageScoreMap.get(localRouteInfo.getId()) == null) {
          this.mRouteUsageScoreMap.put(localRouteInfo.getId(), Float.valueOf(this.mPreferences.getFloat("android.support.v7.app.MediaRouteChooserDialog_route_usage_score_" + localRouteInfo.getId(), 0.0F)));
        }
      }
    }
    
    private void storeRouteUsageScores(String paramString)
    {
      SharedPreferences.Editor localEditor = this.mPreferences.edit();
      Object localObject = new ArrayList(Arrays.asList(this.mPreferences.getString("android.support.v7.app.MediaRouteChooserDialog_route_ids", "").split(",")));
      if (!((List)localObject).contains(paramString)) {
        ((List)localObject).add(paramString);
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str1 = (String)((Iterator)localObject).next();
        String str2 = "android.support.v7.app.MediaRouteChooserDialog_route_usage_score_" + str1;
        float f2 = this.mPreferences.getFloat(str2, 0.0F) * 0.95F;
        float f1 = f2;
        if (paramString.equals(str1)) {
          f1 = f2 + 1.0F;
        }
        if (f1 < 0.1F)
        {
          this.mRouteUsageScoreMap.remove(str1);
          localEditor.remove(str1);
        }
        else
        {
          this.mRouteUsageScoreMap.put(str1, Float.valueOf(f1));
          localEditor.putFloat(str2, f1);
          if (localStringBuilder.length() > 0) {
            localStringBuilder.append(',');
          }
          localStringBuilder.append(str1);
        }
      }
      localEditor.putString("android.support.v7.app.MediaRouteChooserDialog_route_ids", localStringBuilder.toString());
      localEditor.commit();
    }
    
    public int compare(MediaRouter.RouteInfo paramRouteInfo1, MediaRouter.RouteInfo paramRouteInfo2)
    {
      int i = -1;
      if (paramRouteInfo1 == null)
      {
        if (paramRouteInfo2 == null) {
          return 0;
        }
        return -1;
      }
      if (paramRouteInfo2 == null) {
        return 1;
      }
      Float localFloat1 = (Float)this.mRouteUsageScoreMap.get(paramRouteInfo1.getId());
      if (localFloat1 == null) {
        localFloat1 = Float.valueOf(0.0F);
      }
      for (;;)
      {
        Float localFloat3 = (Float)this.mRouteUsageScoreMap.get(paramRouteInfo2.getId());
        Float localFloat2 = localFloat3;
        if (localFloat3 == null) {
          localFloat2 = Float.valueOf(0.0F);
        }
        if (!localFloat1.equals(localFloat2))
        {
          if (localFloat1.floatValue() > localFloat2.floatValue()) {}
          for (;;)
          {
            return i;
            i = 1;
          }
        }
        return paramRouteInfo1.getName().compareTo(paramRouteInfo2.getName());
      }
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/app/MediaRouteChooserDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */