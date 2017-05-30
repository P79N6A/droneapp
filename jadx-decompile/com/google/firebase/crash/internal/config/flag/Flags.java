package com.google.firebase.crash.internal.config.flag;

import android.content.Context;
import android.support.annotation.Keep;
import com.google.android.gms.internal.amf;
import com.google.android.gms.internal.amg;
import com.google.android.gms.internal.amk;
import java.util.concurrent.TimeUnit;

@Keep
public final class Flags {
    public static final amf<Boolean> aVh = amf.a(0, "crash:enabled", Boolean.valueOf(true));
    public static final amf<String> aVi = amf.a(0, "crash:gateway_url", "https://mobilecrashreporting.googleapis.com/v1/crashes:batchCreate?key=");
    public static final amf<Integer> aVj = amf.a(0, "crash:log_buffer_capacity", 100);
    public static final amf<Integer> aVk = amf.a(0, "crash:log_buffer_max_total_size", 32768);
    public static final amf<Integer> aVl = amf.a(0, "crash:crash_backlog_capacity", 5);
    public static final amf<Long> aVm = amf.a(0, "crash:crash_backlog_max_age", 604800000);
    public static final amf<Long> aVn = amf.a(0, "crash:starting_backoff", TimeUnit.SECONDS.toMillis(1));
    public static final amf<Long> aVo = amf.a(0, "crash:backoff_limit", TimeUnit.MINUTES.toMillis(60));
    public static final amf<Integer> aVp = amf.a(0, "crash:retry_num_attempts", 12);
    public static final amf<Integer> aVq = amf.a(0, "crash:batch_size", 5);
    public static final amf<Long> aVr = amf.a(0, "crash:batch_throttle", TimeUnit.MINUTES.toMillis(5));
    public static final amf<Integer> aVs = amf.a(0, "crash:frame_depth", 60);

    private Flags() {
    }

    public static final void initialize(Context context) {
        amk.a();
        amg.a(context);
    }
}
