package com.fimi.soul.utils;

import java.io.File;
import java.io.FilenameFilter;

public class p {
    public static String[] a() {
        return a(j.c(), new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.contains(".txt");
            }
        });
    }

    public static String[] a(String str, FilenameFilter filenameFilter) {
        File file = new File(str);
        try {
            file.mkdirs();
            if (file.exists()) {
                return file.list(filenameFilter);
            }
        } catch (SecurityException e) {
        }
        return new String[0];
    }

    public static String[] b() {
        return a(j.b(), new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.contains(".param");
            }
        });
    }

    public static String[] c() {
        return a(j.d(), new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.contains(".kml") || str.contains(".kmz");
            }
        });
    }

    public static String[] d() {
        return a(j.g(), new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.contains(".xml");
            }
        });
    }
}
