package com.facebook.imagepipeline.nativecode;

import com.facebook.common.soloader.SoLoaderShim;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImagePipelineNativeLoader
{
  public static final List<String> DEPENDENCIES;
  public static final String DSO_NAME = "imagepipeline";
  
  static
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("webp");
    DEPENDENCIES = Collections.unmodifiableList(localArrayList);
  }
  
  public static void load()
  {
    int i = 0;
    while (i < DEPENDENCIES.size())
    {
      SoLoaderShim.loadLibrary((String)DEPENDENCIES.get(i));
      i += 1;
    }
    SoLoaderShim.loadLibrary("imagepipeline");
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/facebook/imagepipeline/nativecode/ImagePipelineNativeLoader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */