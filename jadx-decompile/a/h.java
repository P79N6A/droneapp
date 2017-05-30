package a;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class h {
    private static final h a = new h();
    private final ExecutorService b;
    private final Executor c;

    private static class a implements Executor {
        private static final int a = 15;
        private ThreadLocal<Integer> b;

        private a() {
            this.b = new ThreadLocal();
        }

        private int a() {
            Integer num = (Integer) this.b.get();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            int intValue = num.intValue() + 1;
            this.b.set(Integer.valueOf(intValue));
            return intValue;
        }

        private int b() {
            Integer num = (Integer) this.b.get();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.b.remove();
            } else {
                this.b.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        public void execute(Runnable runnable) {
            if (a() <= 15) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    b();
                }
            } else {
                h.a().execute(runnable);
            }
            b();
        }
    }

    private h() {
        this.b = !c() ? Executors.newCachedThreadPool() : b.a();
        this.c = new a();
    }

    public static ExecutorService a() {
        return a.b;
    }

    static Executor b() {
        return a.c;
    }

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        return property == null ? false : property.toLowerCase(Locale.US).contains(SystemMediaRouteProvider.PACKAGE_NAME);
    }
}
