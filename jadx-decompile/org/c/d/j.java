package org.c.d;

import java.io.File;
import java.io.IOException;

public class j extends e {
    private final File a;
    private File b;

    public j() {
        this(null);
    }

    public j(File file) {
        this.a = file;
    }

    private File a(File file) {
        File createTempFile = File.createTempFile("junit", "", file);
        createTempFile.delete();
        createTempFile.mkdir();
        return createTempFile;
    }

    private boolean a(int i, String[] strArr) {
        return i == strArr.length + -1;
    }

    private void b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File b : listFiles) {
                b(b);
            }
        }
        file.delete();
    }

    private void c(String str) {
        if (new File(str).getParent() != null) {
            throw new IOException("Folder name cannot consist of multiple path components separated by a file separator. Please use newFolder('MyParentFolder','MyFolder') to create hierarchies of folders");
        }
    }

    public File a(String str) {
        File file = new File(f(), str);
        if (file.createNewFile()) {
            return file;
        }
        throw new IOException("a file with the name '" + str + "' already exists in the test folder");
    }

    public File a(String... strArr) {
        File f = f();
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            c(str);
            File file = new File(f, str);
            if (file.mkdir() || !a(i, strArr)) {
                i++;
                f = file;
            } else {
                throw new IOException("a folder with the name '" + str + "' already exists");
            }
        }
        return f;
    }

    protected void a() {
        c();
    }

    public File b(String str) {
        return a(str);
    }

    protected void b() {
        g();
    }

    public void c() {
        this.b = a(this.a);
    }

    public File d() {
        return File.createTempFile("junit", null, f());
    }

    public File e() {
        return a(f());
    }

    public File f() {
        if (this.b != null) {
            return this.b;
        }
        throw new IllegalStateException("the temporary folder has not yet been created");
    }

    public void g() {
        if (this.b != null) {
            b(this.b);
        }
    }
}
