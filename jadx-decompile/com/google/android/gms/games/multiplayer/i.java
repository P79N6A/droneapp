package com.google.android.gms.games.multiplayer;

import com.google.android.gms.games.Player;
import java.util.ArrayList;

public final class i {
    private i() {
    }

    public static String a(ArrayList<Participant> arrayList, String str) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Participant participant = (Participant) arrayList.get(i);
            Player k = participant.k();
            if (k != null && k.c().equals(str)) {
                return participant.j();
            }
        }
        return null;
    }
}
