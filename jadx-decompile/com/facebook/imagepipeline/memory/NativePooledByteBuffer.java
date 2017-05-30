package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.memory.PooledByteBuffer.ClosedException;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class NativePooledByteBuffer implements PooledByteBuffer {
    @GuardedBy("this")
    @VisibleForTesting
    CloseableReference<NativeMemoryChunk> mBufRef;
    private final int mSize;

    public NativePooledByteBuffer(CloseableReference<NativeMemoryChunk> closeableReference, int i) {
        Preconditions.checkNotNull(closeableReference);
        boolean z = i >= 0 && i <= ((NativeMemoryChunk) closeableReference.get()).getSize();
        Preconditions.checkArgument(z);
        this.mBufRef = closeableReference.clone();
        this.mSize = i;
    }

    public synchronized void close() {
        CloseableReference.closeSafely(this.mBufRef);
        this.mBufRef = null;
    }

    synchronized void ensureValid() {
        if (isClosed()) {
            throw new ClosedException();
        }
    }

    public synchronized long getNativePtr() {
        ensureValid();
        return ((NativeMemoryChunk) this.mBufRef.get()).getNativePtr();
    }

    public synchronized boolean isClosed() {
        return !CloseableReference.isValid(this.mBufRef);
    }

    public synchronized byte read(int i) {
        byte read;
        boolean z = true;
        synchronized (this) {
            ensureValid();
            Preconditions.checkArgument(i >= 0);
            if (i >= this.mSize) {
                z = false;
            }
            Preconditions.checkArgument(z);
            read = ((NativeMemoryChunk) this.mBufRef.get()).read(i);
        }
        return read;
    }

    public synchronized void read(int i, byte[] bArr, int i2, int i3) {
        ensureValid();
        Preconditions.checkArgument(i + i3 <= this.mSize);
        ((NativeMemoryChunk) this.mBufRef.get()).read(i, bArr, i2, i3);
    }

    public synchronized int size() {
        ensureValid();
        return this.mSize;
    }
}
