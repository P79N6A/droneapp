package com.fimi.soul.drone.droneconnection.connection;

import android.content.Context;
import com.fimi.soul.drone.droneconnection.connection.c.b;
import com.fimi.soul.drone.g.c;

public class g {

    public enum a {
        USB(1) {
            public /* synthetic */ a a(Context context) {
                return b(context);
            }

            public b b(Context context) {
                return new b(context);
            }
        },
        TCP(3) {
            public /* synthetic */ a a(Context context) {
                return b(context);
            }

            public com.fimi.soul.drone.droneconnection.connection.b.a b(Context context) {
                return new com.fimi.soul.drone.droneconnection.connection.b.a(context);
            }
        };
        
        private final int c;

        private a(int i) {
            this.c = i;
            if (i == 3) {
                com.fimi.soul.drone.droneconnection.connection.a.a.a(c.d);
            } else if (i == 1) {
                com.fimi.soul.drone.droneconnection.connection.a.a.a(c.c);
            }
        }

        public int a() {
            return this.c;
        }

        public abstract a a(Context context);
    }
}
