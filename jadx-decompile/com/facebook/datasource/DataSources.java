package com.facebook.datasource;

import com.facebook.common.internal.Supplier;

public class DataSources {
    private DataSources() {
    }

    public static <T> Supplier<DataSource<T>> getFailedDataSourceSupplier(final Throwable th) {
        return new Supplier<DataSource<T>>() {
            public DataSource<T> get() {
                return DataSources.immediateFailedDataSource(th);
            }
        };
    }

    public static <T> DataSource<T> immediateFailedDataSource(Throwable th) {
        DataSource create = SettableDataSource.create();
        create.setFailure(th);
        return create;
    }
}
