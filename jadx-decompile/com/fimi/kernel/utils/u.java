package com.fimi.kernel.utils;

import java.io.File;
import java.io.IOException;

public class u {
    public static String a(File file) {
        try {
            return m.a(file);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(String str) {
        return a(new File(str));
    }
}
