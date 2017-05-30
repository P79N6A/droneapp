package com.fimi.soul.base;

import com.fimi.kernel.BaseApplication;
import com.fimi.soul.biz.manager.d;
import com.fimi.soul.utils.r;
import java.io.PrintStream;
import java.lang.Thread.UncaughtExceptionHandler;

public class ErrorReportApp extends BaseApplication {
    private UncaughtExceptionHandler a;
    private UncaughtExceptionHandler b = new UncaughtExceptionHandler(this) {
        final /* synthetic */ ErrorReportApp a;

        {
            this.a = r1;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            new a(this.a, th).a();
            this.a.a.uncaughtException(thread, th);
        }
    };

    class a {
        final /* synthetic */ ErrorReportApp a;
        private Throwable b;

        public a(ErrorReportApp errorReportApp, Throwable th) {
            this.a = errorReportApp;
            this.b = th;
        }

        public void a() {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(this.b.toString());
                for (StackTraceElement stackTraceElement : this.b.getStackTrace()) {
                    stringBuffer.append(", Class Name:");
                    stringBuffer.append(stackTraceElement.getClassName());
                    stringBuffer.append(" , Method Name:");
                    stringBuffer.append(stackTraceElement.getMethodName());
                    stringBuffer.append(" , LineNumber:");
                    stringBuffer.append(stackTraceElement.getLineNumber());
                }
                d.a(this.a.getApplicationContext()).a(stringBuffer.toString());
                PrintStream printStream = new PrintStream(r.b());
                this.b.printStackTrace(printStream);
                printStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void onCreate() {
        super.onCreate();
        this.a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this.b);
    }
}
