package com.google.android.gms.games.a;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.games.internal.b.x;
import java.util.HashMap;

public final class n {
    private static final String[] a = new String[]{"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"};
    private String b;
    private String c;
    private int d;
    private HashMap<Integer, a> e = new HashMap();

    public static final class a {
        public final long a;
        public final String b;
        public final String c;
        public final boolean d;

        public a(long j, String str, String str2, boolean z) {
            this.a = j;
            this.b = str;
            this.c = str2;
            this.d = z;
        }

        public String toString() {
            return c.a(this).a("RawScore", Long.valueOf(this.a)).a("FormattedScore", this.b).a("ScoreTag", this.c).a("NewBest", Boolean.valueOf(this.d)).toString();
        }
    }

    public n(DataHolder dataHolder) {
        this.d = dataHolder.e();
        int g = dataHolder.g();
        d.b(g == 3);
        for (int i = 0; i < g; i++) {
            int a = dataHolder.a(i);
            if (i == 0) {
                this.b = dataHolder.c("leaderboardId", i, a);
                this.c = dataHolder.c("playerId", i, a);
            }
            if (dataHolder.d("hasResult", i, a)) {
                a(new a(dataHolder.a("rawScore", i, a), dataHolder.c("formattedScore", i, a), dataHolder.c("scoreTag", i, a), dataHolder.d("newBest", i, a)), dataHolder.b("timeSpan", i, a));
            }
        }
    }

    private void a(a aVar, int i) {
        this.e.put(Integer.valueOf(i), aVar);
    }

    public a a(int i) {
        return (a) this.e.get(Integer.valueOf(i));
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String toString() {
        com.google.android.gms.common.internal.c.a a = c.a(this).a("PlayerId", this.c).a("StatusCode", Integer.valueOf(this.d));
        for (int i = 0; i < 3; i++) {
            a aVar = (a) this.e.get(Integer.valueOf(i));
            a.a("TimesSpan", x.a(i));
            a.a("Result", aVar == null ? "null" : aVar.toString());
        }
        return a.toString();
    }
}
