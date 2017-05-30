package com.a.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class d extends a {
    boolean b = false;
    private ArrayList<a> c = new ArrayList();
    private HashMap<a, e> d = new HashMap();
    private ArrayList<e> e = new ArrayList();
    private ArrayList<e> f = new ArrayList();
    private boolean g = true;
    private a h = null;
    private boolean i = false;
    private long j = 0;
    private q k = null;
    private long l = -1;

    private class a implements com.a.a.a.a {
        final /* synthetic */ d a;
        private d b;

        a(d dVar, d dVar2) {
            this.a = dVar;
            this.b = dVar2;
        }

        public void a(a aVar) {
        }

        public void b(a aVar) {
            aVar.b((com.a.a.a.a) this);
            this.a.c.remove(aVar);
            ((e) this.b.d.get(aVar)).f = true;
            if (!this.a.b) {
                int i;
                boolean z;
                ArrayList c = this.b.f;
                int size = c.size();
                for (i = 0; i < size; i++) {
                    if (!((e) c.get(i)).f) {
                        z = false;
                        break;
                    }
                }
                z = true;
                if (z) {
                    if (this.a.a != null) {
                        ArrayList arrayList = (ArrayList) this.a.a.clone();
                        int size2 = arrayList.size();
                        for (i = 0; i < size2; i++) {
                            ((com.a.a.a.a) arrayList.get(i)).b(this.b);
                        }
                    }
                    this.b.i = false;
                }
            }
        }

        public void c(a aVar) {
            if (!this.a.b && this.a.c.size() == 0 && this.a.a != null) {
                int size = this.a.a.size();
                for (int i = 0; i < size; i++) {
                    ((com.a.a.a.a) this.a.a.get(i)).c(this.b);
                }
            }
        }

        public void d(a aVar) {
        }
    }

    public class b {
        final /* synthetic */ d a;
        private e b;

        b(d dVar, a aVar) {
            this.a = dVar;
            this.b = (e) dVar.d.get(aVar);
            if (this.b == null) {
                this.b = new e(aVar);
                dVar.d.put(aVar, this.b);
                dVar.e.add(this.b);
            }
        }

        public b a(long j) {
            a b = q.b(0.0f, 1.0f);
            b.d(j);
            c(b);
            return this;
        }

        public b a(a aVar) {
            e eVar = (e) this.a.d.get(aVar);
            if (eVar == null) {
                eVar = new e(aVar);
                this.a.d.put(aVar, eVar);
                this.a.e.add(eVar);
            }
            eVar.a(new c(this.b, 0));
            return this;
        }

        public b b(a aVar) {
            e eVar = (e) this.a.d.get(aVar);
            if (eVar == null) {
                eVar = new e(aVar);
                this.a.d.put(aVar, eVar);
                this.a.e.add(eVar);
            }
            eVar.a(new c(this.b, 1));
            return this;
        }

        public b c(a aVar) {
            e eVar = (e) this.a.d.get(aVar);
            if (eVar == null) {
                eVar = new e(aVar);
                this.a.d.put(aVar, eVar);
                this.a.e.add(eVar);
            }
            this.b.a(new c(eVar, 1));
            return this;
        }
    }

    private static class c {
        static final int a = 0;
        static final int b = 1;
        public e c;
        public int d;

        public c(e eVar, int i) {
            this.c = eVar;
            this.d = i;
        }
    }

    private static class d implements com.a.a.a.a {
        private d a;
        private e b;
        private int c;

        public d(d dVar, e eVar, int i) {
            this.a = dVar;
            this.b = eVar;
            this.c = i;
        }

        private void e(a aVar) {
            if (!this.a.b) {
                Object obj;
                int size = this.b.c.size();
                for (int i = 0; i < size; i++) {
                    obj = (c) this.b.c.get(i);
                    if (obj.d == this.c && obj.c.a == aVar) {
                        aVar.b((com.a.a.a.a) this);
                        break;
                    }
                }
                obj = null;
                this.b.c.remove(obj);
                if (this.b.c.size() == 0) {
                    this.b.a.a();
                    this.a.c.add(this.b.a);
                }
            }
        }

        public void a(a aVar) {
            if (this.c == 0) {
                e(aVar);
            }
        }

        public void b(a aVar) {
            if (this.c == 1) {
                e(aVar);
            }
        }

        public void c(a aVar) {
        }

        public void d(a aVar) {
        }
    }

    private static class e implements Cloneable {
        public a a;
        public ArrayList<c> b = null;
        public ArrayList<c> c = null;
        public ArrayList<e> d = null;
        public ArrayList<e> e = null;
        public boolean f = false;

        public e(a aVar) {
            this.a = aVar;
        }

        public e a() {
            try {
                e eVar = (e) super.clone();
                eVar.a = this.a.j();
                return eVar;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }

        public void a(c cVar) {
            if (this.b == null) {
                this.b = new ArrayList();
                this.d = new ArrayList();
            }
            this.b.add(cVar);
            if (!this.d.contains(cVar.c)) {
                this.d.add(cVar.c);
            }
            e eVar = cVar.c;
            if (eVar.e == null) {
                eVar.e = new ArrayList();
            }
            eVar.e.add(this);
        }

        public /* synthetic */ Object clone() {
            return a();
        }
    }

    private void o() {
        int size;
        e eVar;
        int i;
        if (this.g) {
            this.f.clear();
            ArrayList arrayList = new ArrayList();
            size = this.e.size();
            for (int i2 = 0; i2 < size; i2++) {
                eVar = (e) this.e.get(i2);
                if (eVar.b == null || eVar.b.size() == 0) {
                    arrayList.add(eVar);
                }
            }
            Object arrayList2 = new ArrayList();
            while (arrayList.size() > 0) {
                int size2 = arrayList.size();
                for (i = 0; i < size2; i++) {
                    eVar = (e) arrayList.get(i);
                    this.f.add(eVar);
                    if (eVar.e != null) {
                        int size3 = eVar.e.size();
                        for (size = 0; size < size3; size++) {
                            e eVar2 = (e) eVar.e.get(size);
                            eVar2.d.remove(eVar);
                            if (eVar2.d.size() == 0) {
                                arrayList2.add(eVar2);
                            }
                        }
                    }
                }
                arrayList.clear();
                arrayList.addAll(arrayList2);
                arrayList2.clear();
            }
            this.g = false;
            if (this.f.size() != this.e.size()) {
                throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
            }
            return;
        }
        int size4 = this.e.size();
        for (i = 0; i < size4; i++) {
            eVar = (e) this.e.get(i);
            if (eVar.b != null && eVar.b.size() > 0) {
                int size5 = eVar.b.size();
                for (size = 0; size < size5; size++) {
                    c cVar = (c) eVar.b.get(size);
                    if (eVar.d == null) {
                        eVar.d = new ArrayList();
                    }
                    if (!eVar.d.contains(cVar.c)) {
                        eVar.d.add(cVar.c);
                    }
                }
            }
            eVar.f = false;
        }
    }

    public b a(a aVar) {
        if (aVar == null) {
            return null;
        }
        this.g = true;
        return new b(this, aVar);
    }

    public void a() {
        int i;
        int i2;
        ArrayList arrayList;
        int i3 = 0;
        this.b = false;
        this.i = true;
        o();
        int size = this.f.size();
        for (i = 0; i < size; i++) {
            e eVar = (e) this.f.get(i);
            Collection h = eVar.a.h();
            if (h != null && h.size() > 0) {
                Iterator it = new ArrayList(h).iterator();
                while (it.hasNext()) {
                    com.a.a.a.a aVar = (com.a.a.a.a) it.next();
                    if ((aVar instanceof d) || (aVar instanceof a)) {
                        eVar.a.b(aVar);
                    }
                }
            }
        }
        final ArrayList arrayList2 = new ArrayList();
        for (i2 = 0; i2 < size; i2++) {
            eVar = (e) this.f.get(i2);
            if (this.h == null) {
                this.h = new a(this, this);
            }
            if (eVar.b == null || eVar.b.size() == 0) {
                arrayList2.add(eVar);
            } else {
                int size2 = eVar.b.size();
                for (i = 0; i < size2; i++) {
                    c cVar = (c) eVar.b.get(i);
                    cVar.c.a.a(new d(this, eVar, cVar.d));
                }
                eVar.c = (ArrayList) eVar.b.clone();
            }
            eVar.a.a(this.h);
        }
        if (this.j <= 0) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                eVar = (e) it2.next();
                eVar.a.a();
                this.c.add(eVar.a);
            }
        } else {
            this.k = q.b(0.0f, 1.0f);
            this.k.d(this.j);
            this.k.a(new c(this) {
                boolean a = false;
                final /* synthetic */ d c;

                public void b(a aVar) {
                    if (!this.a) {
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            e eVar = (e) arrayList2.get(i);
                            eVar.a.a();
                            this.c.c.add(eVar.a);
                        }
                    }
                }

                public void c(a aVar) {
                    this.a = true;
                }
            });
            this.k.a();
        }
        if (this.a != null) {
            arrayList = (ArrayList) this.a.clone();
            i2 = arrayList.size();
            for (i = 0; i < i2; i++) {
                ((com.a.a.a.a) arrayList.get(i)).a(this);
            }
        }
        if (this.e.size() == 0 && this.j == 0) {
            this.i = false;
            if (this.a != null) {
                arrayList = (ArrayList) this.a.clone();
                i = arrayList.size();
                while (i3 < i) {
                    ((com.a.a.a.a) arrayList.get(i3)).b(this);
                    i3++;
                }
            }
        }
    }

    public void a(long j) {
        this.j = j;
    }

    public void a(Interpolator interpolator) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a.a(interpolator);
        }
    }

    public void a(Object obj) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            a aVar = ((e) it.next()).a;
            if (aVar instanceof d) {
                ((d) aVar).a(obj);
            } else if (aVar instanceof l) {
                ((l) aVar).a(obj);
            }
        }
    }

    public void a(Collection<a> collection) {
        if (collection != null && collection.size() > 0) {
            this.g = true;
            b bVar = null;
            for (a aVar : collection) {
                b a;
                if (bVar == null) {
                    a = a(aVar);
                } else {
                    bVar.a(aVar);
                    a = bVar;
                }
                bVar = a;
            }
        }
    }

    public void a(List<a> list) {
        if (list != null && list.size() > 0) {
            this.g = true;
            if (list.size() == 1) {
                a((a) list.get(0));
                return;
            }
            for (int i = 0; i < list.size() - 1; i++) {
                a((a) list.get(i)).b((a) list.get(i + 1));
            }
        }
    }

    public void a(a... aVarArr) {
        int i = 1;
        if (aVarArr != null) {
            this.g = true;
            b a = a(aVarArr[0]);
            while (i < aVarArr.length) {
                a.a(aVarArr[i]);
                i++;
            }
        }
    }

    public /* synthetic */ a b(long j) {
        return c(j);
    }

    public void b() {
        this.b = true;
        if (g()) {
            Iterator it;
            ArrayList arrayList;
            if (this.a != null) {
                ArrayList arrayList2 = (ArrayList) this.a.clone();
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((com.a.a.a.a) it.next()).c(this);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            if (this.k != null && this.k.f()) {
                this.k.b();
            } else if (this.f.size() > 0) {
                it = this.f.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a.b();
                }
            }
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((com.a.a.a.a) it2.next()).b(this);
                }
            }
            this.i = false;
        }
    }

    public void b(a... aVarArr) {
        int i = 0;
        if (aVarArr != null) {
            this.g = true;
            if (aVarArr.length == 1) {
                a(aVarArr[0]);
                return;
            }
            while (i < aVarArr.length - 1) {
                a(aVarArr[i]).b(aVarArr[i + 1]);
                i++;
            }
        }
    }

    public d c(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("duration must be a value of zero or greater");
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a.b(j);
        }
        this.l = j;
        return this;
    }

    public void c() {
        this.b = true;
        if (g()) {
            Iterator it;
            if (this.f.size() != this.e.size()) {
                o();
                it = this.f.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (this.h == null) {
                        this.h = new a(this, this);
                    }
                    eVar.a.a(this.h);
                }
            }
            if (this.k != null) {
                this.k.b();
            }
            if (this.f.size() > 0) {
                it = this.f.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a.c();
                }
            }
            if (this.a != null) {
                it = ((ArrayList) this.a.clone()).iterator();
                while (it.hasNext()) {
                    ((com.a.a.a.a) it.next()).b(this);
                }
            }
            this.i = false;
        }
    }

    public /* synthetic */ Object clone() {
        return n();
    }

    public long d() {
        return this.j;
    }

    public long e() {
        return this.l;
    }

    public boolean f() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            if (((e) it.next()).a.f()) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        return this.i;
    }

    public /* synthetic */ a j() {
        return n();
    }

    public void k() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a.k();
        }
    }

    public void l() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a.l();
        }
    }

    public ArrayList<a> m() {
        ArrayList<a> arrayList = new ArrayList();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            arrayList.add(((e) it.next()).a);
        }
        return arrayList;
    }

    public d n() {
        d dVar = (d) super.j();
        dVar.g = true;
        dVar.b = false;
        dVar.i = false;
        dVar.c = new ArrayList();
        dVar.d = new HashMap();
        dVar.e = new ArrayList();
        dVar.f = new ArrayList();
        HashMap hashMap = new HashMap();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            e a = eVar.a();
            hashMap.put(eVar, a);
            dVar.e.add(a);
            dVar.d.put(a.a, a);
            a.b = null;
            a.c = null;
            a.e = null;
            a.d = null;
            ArrayList h = a.a.h();
            if (h != null) {
                Iterator it2 = h.iterator();
                ArrayList arrayList = null;
                while (it2.hasNext()) {
                    com.a.a.a.a aVar = (com.a.a.a.a) it2.next();
                    if (aVar instanceof a) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(aVar);
                    }
                }
                if (arrayList != null) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        h.remove((com.a.a.a.a) it3.next());
                    }
                }
            }
        }
        it = this.e.iterator();
        while (it.hasNext()) {
            eVar = (e) it.next();
            a = (e) hashMap.get(eVar);
            if (eVar.b != null) {
                Iterator it4 = eVar.b.iterator();
                while (it4.hasNext()) {
                    c cVar = (c) it4.next();
                    a.a(new c((e) hashMap.get(cVar.c), cVar.d));
                }
            }
        }
        return dVar;
    }
}
