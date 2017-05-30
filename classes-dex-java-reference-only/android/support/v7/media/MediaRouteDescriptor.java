package android.support.v7.media;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class MediaRouteDescriptor
{
  private static final String KEY_CAN_DISCONNECT = "canDisconnect";
  private static final String KEY_CONNECTING = "connecting";
  private static final String KEY_CONNECTION_STATE = "connectionState";
  private static final String KEY_CONTROL_FILTERS = "controlFilters";
  private static final String KEY_DESCRIPTION = "status";
  private static final String KEY_DEVICE_TYPE = "deviceType";
  private static final String KEY_ENABLED = "enabled";
  private static final String KEY_EXTRAS = "extras";
  private static final String KEY_GROUP_MEMBER_IDS = "groupMemberIds";
  private static final String KEY_ICON_URI = "iconUri";
  private static final String KEY_ID = "id";
  private static final String KEY_NAME = "name";
  private static final String KEY_PLAYBACK_STREAM = "playbackStream";
  private static final String KEY_PLAYBACK_TYPE = "playbackType";
  private static final String KEY_PRESENTATION_DISPLAY_ID = "presentationDisplayId";
  private static final String KEY_SETTINGS_INTENT = "settingsIntent";
  private static final String KEY_VOLUME = "volume";
  private static final String KEY_VOLUME_HANDLING = "volumeHandling";
  private static final String KEY_VOLUME_MAX = "volumeMax";
  private final Bundle mBundle;
  private List<IntentFilter> mControlFilters;
  
  private MediaRouteDescriptor(Bundle paramBundle, List<IntentFilter> paramList)
  {
    this.mBundle = paramBundle;
    this.mControlFilters = paramList;
  }
  
  private void ensureControlFilters()
  {
    if (this.mControlFilters == null)
    {
      this.mControlFilters = this.mBundle.getParcelableArrayList("controlFilters");
      if (this.mControlFilters == null) {
        this.mControlFilters = Collections.emptyList();
      }
    }
  }
  
  public static MediaRouteDescriptor fromBundle(Bundle paramBundle)
  {
    if (paramBundle != null) {
      return new MediaRouteDescriptor(paramBundle, null);
    }
    return null;
  }
  
  public Bundle asBundle()
  {
    return this.mBundle;
  }
  
  public boolean canDisconnectAndKeepPlaying()
  {
    return this.mBundle.getBoolean("canDisconnect", false);
  }
  
  public int getConnectionState()
  {
    return this.mBundle.getInt("connectionState", 0);
  }
  
  public List<IntentFilter> getControlFilters()
  {
    ensureControlFilters();
    return this.mControlFilters;
  }
  
  public String getDescription()
  {
    return this.mBundle.getString("status");
  }
  
  public int getDeviceType()
  {
    return this.mBundle.getInt("deviceType");
  }
  
  public Bundle getExtras()
  {
    return this.mBundle.getBundle("extras");
  }
  
  public List<String> getGroupMemberIds()
  {
    return this.mBundle.getStringArrayList("groupMemberIds");
  }
  
  public Uri getIconUri()
  {
    String str = this.mBundle.getString("iconUri");
    if (str == null) {
      return null;
    }
    return Uri.parse(str);
  }
  
  public String getId()
  {
    return this.mBundle.getString("id");
  }
  
  public String getName()
  {
    return this.mBundle.getString("name");
  }
  
  public int getPlaybackStream()
  {
    return this.mBundle.getInt("playbackStream", -1);
  }
  
  public int getPlaybackType()
  {
    return this.mBundle.getInt("playbackType", 1);
  }
  
  public int getPresentationDisplayId()
  {
    return this.mBundle.getInt("presentationDisplayId", -1);
  }
  
  public IntentSender getSettingsActivity()
  {
    return (IntentSender)this.mBundle.getParcelable("settingsIntent");
  }
  
  public int getVolume()
  {
    return this.mBundle.getInt("volume");
  }
  
  public int getVolumeHandling()
  {
    return this.mBundle.getInt("volumeHandling", 0);
  }
  
  public int getVolumeMax()
  {
    return this.mBundle.getInt("volumeMax");
  }
  
  @Deprecated
  public boolean isConnecting()
  {
    return this.mBundle.getBoolean("connecting", false);
  }
  
  public boolean isEnabled()
  {
    return this.mBundle.getBoolean("enabled", true);
  }
  
  public boolean isValid()
  {
    ensureControlFilters();
    return (!TextUtils.isEmpty(getId())) && (!TextUtils.isEmpty(getName())) && (!this.mControlFilters.contains(null));
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("MediaRouteDescriptor{ ");
    localStringBuilder.append("id=").append(getId());
    localStringBuilder.append(", groupMemberIds=").append(getGroupMemberIds());
    localStringBuilder.append(", name=").append(getName());
    localStringBuilder.append(", description=").append(getDescription());
    localStringBuilder.append(", iconUri=").append(getIconUri());
    localStringBuilder.append(", isEnabled=").append(isEnabled());
    localStringBuilder.append(", isConnecting=").append(isConnecting());
    localStringBuilder.append(", connectionState=").append(getConnectionState());
    localStringBuilder.append(", controlFilters=").append(Arrays.toString(getControlFilters().toArray()));
    localStringBuilder.append(", playbackType=").append(getPlaybackType());
    localStringBuilder.append(", playbackStream=").append(getPlaybackStream());
    localStringBuilder.append(", deviceType=").append(getDeviceType());
    localStringBuilder.append(", volume=").append(getVolume());
    localStringBuilder.append(", volumeMax=").append(getVolumeMax());
    localStringBuilder.append(", volumeHandling=").append(getVolumeHandling());
    localStringBuilder.append(", presentationDisplayId=").append(getPresentationDisplayId());
    localStringBuilder.append(", extras=").append(getExtras());
    localStringBuilder.append(", isValid=").append(isValid());
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
  
  public static final class Builder
  {
    private final Bundle mBundle;
    private ArrayList<IntentFilter> mControlFilters;
    private ArrayList<String> mGroupMemberIds;
    
    public Builder(MediaRouteDescriptor paramMediaRouteDescriptor)
    {
      if (paramMediaRouteDescriptor == null) {
        throw new IllegalArgumentException("descriptor must not be null");
      }
      this.mBundle = new Bundle(paramMediaRouteDescriptor.mBundle);
      paramMediaRouteDescriptor.ensureControlFilters();
      if (!paramMediaRouteDescriptor.mControlFilters.isEmpty()) {
        this.mControlFilters = new ArrayList(paramMediaRouteDescriptor.mControlFilters);
      }
    }
    
    public Builder(String paramString1, String paramString2)
    {
      this.mBundle = new Bundle();
      setId(paramString1);
      setName(paramString2);
    }
    
    public Builder addControlFilter(IntentFilter paramIntentFilter)
    {
      if (paramIntentFilter == null) {
        throw new IllegalArgumentException("filter must not be null");
      }
      if (this.mControlFilters == null) {
        this.mControlFilters = new ArrayList();
      }
      if (!this.mControlFilters.contains(paramIntentFilter)) {
        this.mControlFilters.add(paramIntentFilter);
      }
      return this;
    }
    
    public Builder addControlFilters(Collection<IntentFilter> paramCollection)
    {
      if (paramCollection == null) {
        throw new IllegalArgumentException("filters must not be null");
      }
      if (!paramCollection.isEmpty())
      {
        paramCollection = paramCollection.iterator();
        while (paramCollection.hasNext()) {
          addControlFilter((IntentFilter)paramCollection.next());
        }
      }
      return this;
    }
    
    public Builder addGroupMemberId(String paramString)
    {
      if (TextUtils.isEmpty(paramString)) {
        throw new IllegalArgumentException("groupMemberId must not be empty");
      }
      if (this.mGroupMemberIds == null) {
        this.mGroupMemberIds = new ArrayList();
      }
      if (!this.mGroupMemberIds.contains(paramString)) {
        this.mGroupMemberIds.add(paramString);
      }
      return this;
    }
    
    public Builder addGroupMemberIds(Collection<String> paramCollection)
    {
      if (paramCollection == null) {
        throw new IllegalArgumentException("groupMemberIds must not be null");
      }
      if (!paramCollection.isEmpty())
      {
        paramCollection = paramCollection.iterator();
        while (paramCollection.hasNext()) {
          addGroupMemberId((String)paramCollection.next());
        }
      }
      return this;
    }
    
    public MediaRouteDescriptor build()
    {
      if (this.mControlFilters != null) {
        this.mBundle.putParcelableArrayList("controlFilters", this.mControlFilters);
      }
      if (this.mGroupMemberIds != null) {
        this.mBundle.putStringArrayList("groupMemberIds", this.mGroupMemberIds);
      }
      return new MediaRouteDescriptor(this.mBundle, this.mControlFilters, null);
    }
    
    public Builder setCanDisconnect(boolean paramBoolean)
    {
      this.mBundle.putBoolean("canDisconnect", paramBoolean);
      return this;
    }
    
    @Deprecated
    public Builder setConnecting(boolean paramBoolean)
    {
      this.mBundle.putBoolean("connecting", paramBoolean);
      return this;
    }
    
    public Builder setConnectionState(int paramInt)
    {
      this.mBundle.putInt("connectionState", paramInt);
      return this;
    }
    
    public Builder setDescription(String paramString)
    {
      this.mBundle.putString("status", paramString);
      return this;
    }
    
    public Builder setDeviceType(int paramInt)
    {
      this.mBundle.putInt("deviceType", paramInt);
      return this;
    }
    
    public Builder setEnabled(boolean paramBoolean)
    {
      this.mBundle.putBoolean("enabled", paramBoolean);
      return this;
    }
    
    public Builder setExtras(Bundle paramBundle)
    {
      this.mBundle.putBundle("extras", paramBundle);
      return this;
    }
    
    public Builder setIconUri(Uri paramUri)
    {
      if (paramUri == null) {
        throw new IllegalArgumentException("iconUri must not be null");
      }
      this.mBundle.putString("iconUri", paramUri.toString());
      return this;
    }
    
    public Builder setId(String paramString)
    {
      this.mBundle.putString("id", paramString);
      return this;
    }
    
    public Builder setName(String paramString)
    {
      this.mBundle.putString("name", paramString);
      return this;
    }
    
    public Builder setPlaybackStream(int paramInt)
    {
      this.mBundle.putInt("playbackStream", paramInt);
      return this;
    }
    
    public Builder setPlaybackType(int paramInt)
    {
      this.mBundle.putInt("playbackType", paramInt);
      return this;
    }
    
    public Builder setPresentationDisplayId(int paramInt)
    {
      this.mBundle.putInt("presentationDisplayId", paramInt);
      return this;
    }
    
    public Builder setSettingsActivity(IntentSender paramIntentSender)
    {
      this.mBundle.putParcelable("settingsIntent", paramIntentSender);
      return this;
    }
    
    public Builder setVolume(int paramInt)
    {
      this.mBundle.putInt("volume", paramInt);
      return this;
    }
    
    public Builder setVolumeHandling(int paramInt)
    {
      this.mBundle.putInt("volumeHandling", paramInt);
      return this;
    }
    
    public Builder setVolumeMax(int paramInt)
    {
      this.mBundle.putInt("volumeMax", paramInt);
      return this;
    }
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/media/MediaRouteDescriptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */