package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.fitness.b;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.DataTypeReadRequest;
import com.google.android.gms.fitness.request.DisableFitRequest;
import com.google.android.gms.fitness.result.DataTypeResult;

public class alu implements b {

    private static class a extends com.google.android.gms.internal.akz.a {
        private final ahl.b<DataTypeResult> a;

        private a(ahl.b<DataTypeResult> bVar) {
            this.a = bVar;
        }

        public void a(DataTypeResult dataTypeResult) {
            this.a.a(dataTypeResult);
        }
    }

    public i<Status> a(g gVar) {
        return gVar.b(new c(this, gVar) {
            final /* synthetic */ alu a;

            protected void a(akp com_google_android_gms_internal_akp) {
                ((ald) com_google_android_gms_internal_akp.G()).a(new DisableFitRequest(new amb(this)));
            }
        });
    }

    public i<DataTypeResult> a(g gVar, final DataTypeCreateRequest dataTypeCreateRequest) {
        return gVar.b(new a<DataTypeResult>(this, gVar) {
            final /* synthetic */ alu b;

            protected DataTypeResult a(Status status) {
                return DataTypeResult.a(status);
            }

            protected void a(akp com_google_android_gms_internal_akp) {
                ((ald) com_google_android_gms_internal_akp.G()).a(new DataTypeCreateRequest(dataTypeCreateRequest, new a(this)));
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }

    public i<DataTypeResult> a(g gVar, final String str) {
        return gVar.a(new a<DataTypeResult>(this, gVar) {
            final /* synthetic */ alu b;

            protected DataTypeResult a(Status status) {
                return DataTypeResult.a(status);
            }

            protected void a(akp com_google_android_gms_internal_akp) {
                ((ald) com_google_android_gms_internal_akp.G()).a(new DataTypeReadRequest(str, new a(this)));
            }

            protected /* synthetic */ m b(Status status) {
                return a(status);
            }
        });
    }
}
