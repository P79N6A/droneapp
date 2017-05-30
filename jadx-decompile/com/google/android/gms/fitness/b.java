package com.google.android.gms.fitness;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.result.DataTypeResult;

public interface b {
    i<Status> a(g gVar);

    i<DataTypeResult> a(g gVar, DataTypeCreateRequest dataTypeCreateRequest);

    i<DataTypeResult> a(g gVar, String str);
}
