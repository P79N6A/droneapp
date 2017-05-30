package com.fimi.soul.module.flyplannermedia;

import java.io.File;
import java.util.Comparator;

public class b implements Comparator<File> {
    public int a(File file, File file2) {
        return (file == null || file2 == null || file.lastModified() == file2.lastModified()) ? 0 : file.lastModified() > file2.lastModified() ? -1 : 1;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((File) obj, (File) obj2);
    }
}
