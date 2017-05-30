package com.google.gson.internal;

import java.io.Writer;

final class Streams$AppendableWriter extends Writer {
    private final Appendable appendable;
    private final CurrentWrite currentWrite;

    static class CurrentWrite implements CharSequence {
        char[] chars;

        CurrentWrite() {
        }

        public char charAt(int i) {
            return this.chars[i];
        }

        public int length() {
            return this.chars.length;
        }

        public CharSequence subSequence(int i, int i2) {
            return new String(this.chars, i, i2 - i);
        }
    }

    private Streams$AppendableWriter(Appendable appendable) {
        this.currentWrite = new CurrentWrite();
        this.appendable = appendable;
    }

    public void close() {
    }

    public void flush() {
    }

    public void write(int i) {
        this.appendable.append((char) i);
    }

    public void write(char[] cArr, int i, int i2) {
        this.currentWrite.chars = cArr;
        this.appendable.append(this.currentWrite, i, i + i2);
    }
}
