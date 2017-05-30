package com.facebook.imagepipeline.datasource;

import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.AbstractDataSource;
import com.facebook.datasource.DataSource;
import com.facebook.datasource.DataSubscriber;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public class ListDataSource<T> extends AbstractDataSource<List<CloseableReference<T>>> {
    private final DataSource<CloseableReference<T>>[] mDataSources;
    @GuardedBy("this")
    private int mFinishedDataSources = 0;

    private class InternalDataSubscriber implements DataSubscriber<CloseableReference<T>> {
        @GuardedBy("InternalDataSubscriber.this")
        boolean mFinished;

        private InternalDataSubscriber() {
            this.mFinished = false;
        }

        private synchronized boolean tryFinish() {
            boolean z = true;
            synchronized (this) {
                if (this.mFinished) {
                    z = false;
                } else {
                    this.mFinished = true;
                }
            }
            return z;
        }

        public void onCancellation(DataSource<CloseableReference<T>> dataSource) {
            ListDataSource.this.onDataSourceCancelled();
        }

        public void onFailure(DataSource<CloseableReference<T>> dataSource) {
            ListDataSource.this.onDataSourceFailed(dataSource);
        }

        public void onNewResult(DataSource<CloseableReference<T>> dataSource) {
            if (dataSource.isFinished() && tryFinish()) {
                ListDataSource.this.onDataSourceFinished();
            }
        }

        public void onProgressUpdate(DataSource<CloseableReference<T>> dataSource) {
            ListDataSource.this.onDataSourceProgress();
        }
    }

    protected ListDataSource(DataSource<CloseableReference<T>>[] dataSourceArr) {
        this.mDataSources = dataSourceArr;
    }

    public static <T> ListDataSource<T> create(DataSource<CloseableReference<T>>... dataSourceArr) {
        int i = 0;
        Preconditions.checkNotNull(dataSourceArr);
        Preconditions.checkState(dataSourceArr.length > 0);
        ListDataSource<T> listDataSource = new ListDataSource(dataSourceArr);
        int length = dataSourceArr.length;
        while (i < length) {
            DataSource dataSource = dataSourceArr[i];
            if (dataSource != null) {
                listDataSource.getClass();
                dataSource.subscribe(new InternalDataSubscriber(), CallerThreadExecutor.getInstance());
            }
            i++;
        }
        return listDataSource;
    }

    private synchronized boolean increaseAndCheckIfLast() {
        int i;
        i = this.mFinishedDataSources + 1;
        this.mFinishedDataSources = i;
        return i == this.mDataSources.length;
    }

    private void onDataSourceCancelled() {
        setFailure(new CancellationException());
    }

    private void onDataSourceFailed(DataSource<CloseableReference<T>> dataSource) {
        setFailure(dataSource.getFailureCause());
    }

    private void onDataSourceFinished() {
        if (increaseAndCheckIfLast()) {
            setResult(null, true);
        }
    }

    private void onDataSourceProgress() {
        float f = 0.0f;
        for (DataSource progress : this.mDataSources) {
            f += progress.getProgress();
        }
        setProgress(f / ((float) this.mDataSources.length));
    }

    public boolean close() {
        int i = 0;
        if (!super.close()) {
            return false;
        }
        DataSource[] dataSourceArr = this.mDataSources;
        int length = dataSourceArr.length;
        while (i < length) {
            dataSourceArr[i].close();
            i++;
        }
        return true;
    }

    @Nullable
    public synchronized List<CloseableReference<T>> getResult() {
        List<CloseableReference<T>> arrayList;
        if (hasResult()) {
            arrayList = new ArrayList(this.mDataSources.length);
            for (DataSource result : this.mDataSources) {
                arrayList.add(result.getResult());
            }
        } else {
            arrayList = null;
        }
        return arrayList;
    }

    public synchronized boolean hasResult() {
        boolean z;
        z = !isClosed() && this.mFinishedDataSources == this.mDataSources.length;
        return z;
    }
}
