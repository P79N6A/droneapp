package com.fimi.soul.drone.c;

import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.e;

public class b {
    static boolean b;
    a a = a.MILINK_PARSE_STATE_UNINIT;
    public e c = new e();
    private c d;

    enum a {
        MILINK_PARSE_STATE_GOT_COMPID,
        MILINK_PARSE_STATE_UNINIT,
        MILINK_PARSE_STATE_IDLE,
        MILINK_PARSE_STATE_GOT_STX,
        MILINK_PARSE_STATE_GOT_LENGTH,
        MILINK_PARSE_STATE_GOT_MSGID,
        MILINK_PARSE_STATE_GOT_CRC1,
        MILINK_PARSE_STATE_GOT_PAYLOAD
    }

    public c a(int i) {
        b = false;
        switch (this.a) {
            case MILINK_PARSE_STATE_UNINIT:
            case MILINK_PARSE_STATE_IDLE:
                if (i == 254) {
                    this.a = a.MILINK_PARSE_STATE_GOT_STX;
                    this.d = new c();
                    break;
                }
                break;
            case MILINK_PARSE_STATE_GOT_STX:
                if (!b) {
                    this.d.b = i;
                    this.a = a.MILINK_PARSE_STATE_GOT_LENGTH;
                    break;
                }
                b = false;
                this.a = a.MILINK_PARSE_STATE_IDLE;
                break;
            case MILINK_PARSE_STATE_GOT_LENGTH:
                this.d.c = i;
                this.a = a.MILINK_PARSE_STATE_GOT_MSGID;
                break;
            case MILINK_PARSE_STATE_GOT_MSGID:
                this.d.d.a((byte) i);
                if (this.d.a()) {
                    this.a = a.MILINK_PARSE_STATE_GOT_PAYLOAD;
                    break;
                }
                break;
            case MILINK_PARSE_STATE_GOT_PAYLOAD:
                this.d.b();
                if (i == this.d.e.c()) {
                    this.a = a.MILINK_PARSE_STATE_GOT_CRC1;
                    break;
                }
                b = false;
                this.a = a.MILINK_PARSE_STATE_IDLE;
                if (i == 254) {
                    this.a = a.MILINK_PARSE_STATE_GOT_STX;
                    this.d.e.a();
                }
                this.c.a();
                break;
            case MILINK_PARSE_STATE_GOT_CRC1:
                if (i == this.d.e.b()) {
                    this.c.a(this.d);
                    b = true;
                    this.a = a.MILINK_PARSE_STATE_IDLE;
                    break;
                }
                b = false;
                this.a = a.MILINK_PARSE_STATE_IDLE;
                if (i == 254) {
                    this.a = a.MILINK_PARSE_STATE_GOT_STX;
                    this.d.e.a();
                }
                this.c.a();
                break;
        }
        return b ? this.d : null;
    }
}
