package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public abstract class MediaRouteProvider
{
  private static final int MSG_DELIVER_DESCRIPTOR_CHANGED = 1;
  private static final int MSG_DELIVER_DISCOVERY_REQUEST_CHANGED = 2;
  private Callback mCallback;
  private final Context mContext;
  private MediaRouteProviderDescriptor mDescriptor;
  private MediaRouteDiscoveryRequest mDiscoveryRequest;
  private final ProviderHandler mHandler = new ProviderHandler(null);
  private final ProviderMetadata mMetadata;
  private boolean mPendingDescriptorChange;
  private boolean mPendingDiscoveryRequestChange;
  
  public MediaRouteProvider(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  MediaRouteProvider(Context paramContext, ProviderMetadata paramProviderMetadata)
  {
    if (paramContext == null) {
      throw new IllegalArgumentException("context must not be null");
    }
    this.mContext = paramContext;
    if (paramProviderMetadata == null)
    {
      this.mMetadata = new ProviderMetadata(new ComponentName(paramContext, getClass()));
      return;
    }
    this.mMetadata = paramProviderMetadata;
  }
  
  private void deliverDescriptorChanged()
  {
    this.mPendingDescriptorChange = false;
    if (this.mCallback != null) {
      this.mCallback.onDescriptorChanged(this, this.mDescriptor);
    }
  }
  
  private void deliverDiscoveryRequestChanged()
  {
    this.mPendingDiscoveryRequestChange = false;
    onDiscoveryRequestChanged(this.mDiscoveryRequest);
  }
  
  public final Context getContext()
  {
    return this.mContext;
  }
  
  @Nullable
  public final MediaRouteProviderDescriptor getDescriptor()
  {
    return this.mDescriptor;
  }
  
  @Nullable
  public final MediaRouteDiscoveryRequest getDiscoveryRequest()
  {
    return this.mDiscoveryRequest;
  }
  
  public final Handler getHandler()
  {
    return this.mHandler;
  }
  
  public final ProviderMetadata getMetadata()
  {
    return this.mMetadata;
  }
  
  @Nullable
  public RouteController onCreateRouteController(String paramString)
  {
    return null;
  }
  
  public void onDiscoveryRequestChanged(@Nullable MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest) {}
  
  public final void setCallback(@Nullable Callback paramCallback)
  {
    MediaRouter.checkCallingThread();
    this.mCallback = paramCallback;
  }
  
  public final void setDescriptor(@Nullable MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
  {
    
    if (this.mDescriptor != paramMediaRouteProviderDescriptor)
    {
      this.mDescriptor = paramMediaRouteProviderDescriptor;
      if (!this.mPendingDescriptorChange)
      {
        this.mPendingDescriptorChange = true;
        this.mHandler.sendEmptyMessage(1);
      }
    }
  }
  
  public final void setDiscoveryRequest(MediaRouteDiscoveryRequest paramMediaRouteDiscoveryRequest)
  {
    
    if ((this.mDiscoveryRequest == paramMediaRouteDiscoveryRequest) || ((this.mDiscoveryRequest != null) && (this.mDiscoveryRequest.equals(paramMediaRouteDiscoveryRequest)))) {}
    do
    {
      return;
      this.mDiscoveryRequest = paramMediaRouteDiscoveryRequest;
    } while (this.mPendingDiscoveryRequestChange);
    this.mPendingDiscoveryRequestChange = true;
    this.mHandler.sendEmptyMessage(2);
  }
  
  public static abstract class Callback
  {
    public void onDescriptorChanged(@NonNull MediaRouteProvider paramMediaRouteProvider, @Nullable MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor) {}
  }
  
  private final class ProviderHandler
    extends Handler
  {
    private ProviderHandler() {}
    
    public void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      default: 
        return;
      case 1: 
        MediaRouteProvider.this.deliverDescriptorChanged();
        return;
      }
      MediaRouteProvider.this.deliverDiscoveryRequestChanged();
    }
  }
  
  public static final class ProviderMetadata
  {
    private final ComponentName mComponentName;
    
    ProviderMetadata(ComponentName paramComponentName)
    {
      if (paramComponentName == null) {
        throw new IllegalArgumentException("componentName must not be null");
      }
      this.mComponentName = paramComponentName;
    }
    
    public ComponentName getComponentName()
    {
      return this.mComponentName;
    }
    
    public String getPackageName()
    {
      return this.mComponentName.getPackageName();
    }
    
    public String toString()
    {
      return "ProviderMetadata{ componentName=" + this.mComponentName.flattenToShortString() + " }";
    }
  }
  
  public static abstract class RouteController
  {
    public boolean onControlRequest(Intent paramIntent, @Nullable MediaRouter.ControlRequestCallback paramControlRequestCallback)
    {
      return false;
    }
    
    public void onRelease() {}
    
    public void onSelect() {}
    
    public void onSetVolume(int paramInt) {}
    
    public void onUnselect() {}
    
    public void onUnselect(int paramInt)
    {
      onUnselect();
    }
    
    public void onUpdateVolume(int paramInt) {}
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/media/MediaRouteProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */