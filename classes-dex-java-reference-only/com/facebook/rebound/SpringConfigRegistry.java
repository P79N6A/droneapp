package com.facebook.rebound;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SpringConfigRegistry
{
  private static final SpringConfigRegistry INSTANCE = new SpringConfigRegistry(true);
  private final Map<SpringConfig, String> mSpringConfigMap = new HashMap();
  
  SpringConfigRegistry(boolean paramBoolean)
  {
    if (paramBoolean) {
      addSpringConfig(SpringConfig.defaultConfig, "default config");
    }
  }
  
  public static SpringConfigRegistry getInstance()
  {
    return INSTANCE;
  }
  
  public boolean addSpringConfig(SpringConfig paramSpringConfig, String paramString)
  {
    if (paramSpringConfig == null) {
      throw new IllegalArgumentException("springConfig is required");
    }
    if (paramString == null) {
      throw new IllegalArgumentException("configName is required");
    }
    if (this.mSpringConfigMap.containsKey(paramSpringConfig)) {
      return false;
    }
    this.mSpringConfigMap.put(paramSpringConfig, paramString);
    return true;
  }
  
  public Map<SpringConfig, String> getAllSpringConfig()
  {
    return Collections.unmodifiableMap(this.mSpringConfigMap);
  }
  
  public void removeAllSpringConfig()
  {
    this.mSpringConfigMap.clear();
  }
  
  public boolean removeSpringConfig(SpringConfig paramSpringConfig)
  {
    if (paramSpringConfig == null) {
      throw new IllegalArgumentException("springConfig is required");
    }
    return this.mSpringConfigMap.remove(paramSpringConfig) != null;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/rebound/SpringConfigRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */