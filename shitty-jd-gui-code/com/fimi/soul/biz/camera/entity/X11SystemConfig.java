package com.fimi.soul.biz.camera.entity;

import java.util.HashMap;
import java.util.Map;

public class X11SystemConfig
{
  private String SDState;
  private String appStatus;
  private int batteryLevel;
  private String cameraTimeLock;
  private int cameraType;
  private String captureMode;
  private long cur_time;
  private int currentZoomInfo = 0;
  private String dvVersion = null;
  private long freeKBSpace = 0L;
  private String image_format;
  private boolean isSaveLowResolution;
  private boolean isTimelapsePhoto;
  private boolean isTimelapseVideo;
  private boolean isVideoStamp = false;
  private int maxZoomInfo;
  private int photoFileNumbers;
  private String photoQuality;
  private String photoSize;
  private String photoStamp;
  private String powerSourceType;
  private int ravl;
  private int remainPhotoTakeNumbers;
  private int remainVideoRecordMinutes;
  private String streamOutType;
  private Map<String, X11SystemConfigOption> systemConfigOptions = new HashMap();
  private int totalFileNumbers;
  private long totalKBSpace = 0L;
  private int videoFileNumbers;
  private String videoLoopBack;
  private String videoMode;
  private String videoQuality;
  private String videoResolution;
  private String videoSrt;
  private String videoStamp;
  private String videoStandard;
  private X11DeviceInfo x11DeviceInfo = new X11DeviceInfo();
  
  public String getAppStatus()
  {
    return this.appStatus;
  }
  
  public int getBatteryLevel()
  {
    return this.batteryLevel;
  }
  
  public String getCameraTimeLock()
  {
    return this.cameraTimeLock;
  }
  
  public String getCaptureMode()
  {
    return this.captureMode;
  }
  
  public long getCur_time()
  {
    return this.cur_time;
  }
  
  public int getCurrentZoomInfo()
  {
    return this.currentZoomInfo;
  }
  
  public String getDvVersion()
  {
    return this.dvVersion;
  }
  
  public long getFreeKBSpace()
  {
    return this.freeKBSpace;
  }
  
  public String getImage_format()
  {
    return this.image_format;
  }
  
  public int getMaxZoomInfo()
  {
    return this.maxZoomInfo;
  }
  
  public int getPhotoFileNumbers()
  {
    return this.photoFileNumbers;
  }
  
  public String getPhotoQuality()
  {
    return this.photoQuality;
  }
  
  public String getPhotoSize()
  {
    return this.photoSize;
  }
  
  public String getPhotoStamp()
  {
    return this.photoStamp;
  }
  
  public String getPowerSourceType()
  {
    return this.powerSourceType;
  }
  
  public int getRavl()
  {
    return this.ravl;
  }
  
  public int getRemainPhotoTakeNumbers()
  {
    return this.remainPhotoTakeNumbers;
  }
  
  public int getRemainVideoRecordMinutes()
  {
    return this.remainVideoRecordMinutes;
  }
  
  public String getSDState()
  {
    return this.SDState;
  }
  
  public String getStreamOutType()
  {
    return this.streamOutType;
  }
  
  public Map<String, X11SystemConfigOption> getSystemConfigOptions()
  {
    return this.systemConfigOptions;
  }
  
  public int getTotalFileNumbers()
  {
    return this.totalFileNumbers;
  }
  
  public long getTotalKBSpace()
  {
    return this.totalKBSpace;
  }
  
  public int getVideoFileNumbers()
  {
    return this.videoFileNumbers;
  }
  
  public String getVideoLoopBack()
  {
    return this.videoLoopBack;
  }
  
  public String getVideoMode()
  {
    return this.videoMode;
  }
  
  public String getVideoQuality()
  {
    return this.videoQuality;
  }
  
  public String getVideoResolution()
  {
    return this.videoResolution;
  }
  
  public String getVideoSrt()
  {
    return this.videoSrt;
  }
  
  public String getVideoStamp()
  {
    return this.videoStamp;
  }
  
  public String getVideoStandard()
  {
    return this.videoStandard;
  }
  
  public X11DeviceInfo getX11DeviceInfo()
  {
    return this.x11DeviceInfo;
  }
  
  public String getX11DeviceName()
  {
    if (this.x11DeviceInfo != null) {
      return this.x11DeviceInfo.getChip();
    }
    return "a71";
  }
  
  public boolean isCamara1080()
  {
    return this.cameraType != 66;
  }
  
  public boolean isContinueCaptureMode()
  {
    return (this.captureMode != null) && (this.captureMode.contains("burst quality cont."));
  }
  
  public boolean isPrecisePhotoMode()
  {
    return (this.captureMode != null) && (this.captureMode.contains("precise quality"));
  }
  
  public boolean isSaveLowResolution()
  {
    return this.isSaveLowResolution;
  }
  
  public boolean isTimelapsePhoto()
  {
    return this.isTimelapsePhoto;
  }
  
  public boolean isTimelapseVideo()
  {
    return this.isTimelapseVideo;
  }
  
  public boolean isVideoStamp()
  {
    return this.isVideoStamp;
  }
  
  public void setAppStatus(String paramString)
  {
    this.appStatus = paramString;
  }
  
  public void setBatteryLevel(int paramInt)
  {
    this.batteryLevel = paramInt;
  }
  
  public void setCameraTimeLock(String paramString)
  {
    this.cameraTimeLock = paramString;
  }
  
  public void setCameraType(int paramInt)
  {
    this.cameraType = paramInt;
  }
  
  public void setCaptureMode(String paramString)
  {
    this.captureMode = paramString;
  }
  
  public void setCur_time(long paramLong)
  {
    this.cur_time = paramLong;
  }
  
  public void setCurrentZoomInfo(int paramInt)
  {
    this.currentZoomInfo = paramInt;
  }
  
  public void setDvVersion(String paramString)
  {
    this.dvVersion = paramString;
  }
  
  public void setFreeKBSpace(long paramLong)
  {
    this.freeKBSpace = paramLong;
  }
  
  public void setImage_format(String paramString)
  {
    this.image_format = paramString;
  }
  
  public void setMaxZoomInfo(int paramInt)
  {
    this.maxZoomInfo = paramInt;
  }
  
  public void setPhotoFileNumbers(int paramInt)
  {
    this.photoFileNumbers = paramInt;
  }
  
  public void setPhotoQuality(String paramString)
  {
    this.photoQuality = paramString;
  }
  
  public void setPhotoSize(String paramString)
  {
    this.photoSize = paramString;
  }
  
  public void setPhotoStamp(String paramString)
  {
    this.photoStamp = paramString;
  }
  
  public void setPowerSourceType(String paramString)
  {
    this.powerSourceType = paramString;
  }
  
  public void setRavl(int paramInt)
  {
    this.ravl = paramInt;
  }
  
  public void setRemainPhotoTakeNumbers(int paramInt)
  {
    this.remainPhotoTakeNumbers = paramInt;
  }
  
  public void setRemainVideoRecordMinutes(int paramInt)
  {
    this.remainVideoRecordMinutes = paramInt;
  }
  
  public void setSDState(String paramString)
  {
    this.SDState = paramString;
  }
  
  public void setSaveLowResolution(boolean paramBoolean)
  {
    this.isSaveLowResolution = paramBoolean;
  }
  
  public void setStreamOutType(String paramString)
  {
    this.streamOutType = paramString;
  }
  
  public void setSystemConfigOptions(Map<String, X11SystemConfigOption> paramMap)
  {
    this.systemConfigOptions = paramMap;
  }
  
  public void setTimelapsePhoto(boolean paramBoolean)
  {
    this.isTimelapsePhoto = paramBoolean;
  }
  
  public void setTimelapseVideo(boolean paramBoolean)
  {
    this.isTimelapseVideo = paramBoolean;
  }
  
  public void setTotalFileNumbers(int paramInt)
  {
    this.totalFileNumbers = paramInt;
  }
  
  public void setTotalKBSpace(long paramLong)
  {
    this.totalKBSpace = paramLong;
  }
  
  public void setVideoFileNumbers(int paramInt)
  {
    this.videoFileNumbers = paramInt;
  }
  
  public void setVideoLoopBack(String paramString)
  {
    this.videoLoopBack = paramString;
  }
  
  public void setVideoMode(String paramString)
  {
    this.videoMode = paramString;
  }
  
  public void setVideoQuality(String paramString)
  {
    this.videoQuality = paramString;
  }
  
  public void setVideoResolution(String paramString)
  {
    this.videoResolution = paramString;
  }
  
  public void setVideoSrt(String paramString)
  {
    this.videoSrt = paramString;
  }
  
  public void setVideoStamp(String paramString)
  {
    this.videoStamp = paramString;
  }
  
  public void setVideoStamp(boolean paramBoolean)
  {
    this.isVideoStamp = paramBoolean;
  }
  
  public void setVideoStandard(String paramString)
  {
    this.videoStandard = paramString;
  }
  
  public void setX11DeviceInfo(X11DeviceInfo paramX11DeviceInfo)
  {
    this.x11DeviceInfo = paramX11DeviceInfo;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/biz/camera/entity/X11SystemConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */