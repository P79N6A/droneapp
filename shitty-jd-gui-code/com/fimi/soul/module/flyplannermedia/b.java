package com.fimi.soul.module.flyplannermedia;

import java.io.File;
import java.util.Comparator;

public class b
  implements Comparator<File>
{
  public int a(File paramFile1, File paramFile2)
  {
    if ((paramFile1 == null) || (paramFile2 == null)) {}
    while (paramFile1.lastModified() == paramFile2.lastModified()) {
      return 0;
    }
    if (paramFile1.lastModified() > paramFile2.lastModified()) {
      return -1;
    }
    return 1;
  }
}


/* Location:              /Users/andi/Downloads/dex2jar-2.0/classes-dex2jar.jar!/com/fimi/soul/module/flyplannermedia/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */