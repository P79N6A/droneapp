package it.sephiroth.android.library.widget;

import android.database.DataSetObserver;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.HeterogeneousExpandableList;
import java.util.ArrayList;
import java.util.Collections;

class ExpandableHListConnector extends BaseAdapter implements Filterable {
    private ExpandableListAdapter a;
    private ArrayList<GroupMetadata> b = new ArrayList();
    private int c;
    private int d = Integer.MAX_VALUE;
    private final DataSetObserver e = new a(this);

    static class GroupMetadata implements Parcelable, Comparable<GroupMetadata> {
        public static final Creator<GroupMetadata> CREATOR = new Creator<GroupMetadata>() {
            public GroupMetadata a(Parcel parcel) {
                return GroupMetadata.a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
            }

            public GroupMetadata[] a(int i) {
                return new GroupMetadata[i];
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return a(i);
            }
        };
        static final int a = -1;
        int b;
        int c;
        int d;
        long e;

        private GroupMetadata() {
        }

        static GroupMetadata a(int i, int i2, int i3, long j) {
            GroupMetadata groupMetadata = new GroupMetadata();
            groupMetadata.b = i;
            groupMetadata.c = i2;
            groupMetadata.d = i3;
            groupMetadata.e = j;
            return groupMetadata;
        }

        public int a(GroupMetadata groupMetadata) {
            if (groupMetadata != null) {
                return this.d - groupMetadata.d;
            }
            throw new IllegalArgumentException();
        }

        public /* synthetic */ int compareTo(Object obj) {
            return a((GroupMetadata) obj);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeLong(this.e);
        }
    }

    protected class a extends DataSetObserver {
        final /* synthetic */ ExpandableHListConnector a;

        protected a(ExpandableHListConnector expandableHListConnector) {
            this.a = expandableHListConnector;
        }

        public void onChanged() {
            this.a.a(true, true);
            this.a.notifyDataSetChanged();
        }

        public void onInvalidated() {
            this.a.a(true, true);
            this.a.notifyDataSetInvalidated();
        }
    }

    public static class b {
        private static final int d = 5;
        private static ArrayList<b> e = new ArrayList(5);
        public b a;
        public GroupMetadata b;
        public int c;

        private b() {
        }

        static b a(int i, int i2, int i3, int i4, GroupMetadata groupMetadata, int i5) {
            b d = d();
            d.a = b.a(i2, i3, i4, i);
            d.b = groupMetadata;
            d.c = i5;
            return d;
        }

        private void c() {
            if (this.a != null) {
                this.a.b();
                this.a = null;
            }
            this.b = null;
            this.c = 0;
        }

        private static b d() {
            b bVar;
            synchronized (e) {
                if (e.size() > 0) {
                    bVar = (b) e.remove(0);
                    bVar.c();
                } else {
                    bVar = new b();
                }
            }
            return bVar;
        }

        public void a() {
            c();
            synchronized (e) {
                if (e.size() < 5) {
                    e.add(this);
                }
            }
        }

        public boolean b() {
            return this.b != null;
        }
    }

    public ExpandableHListConnector(ExpandableListAdapter expandableListAdapter) {
        a(expandableListAdapter);
    }

    private void a(boolean z, boolean z2) {
        int i;
        int i2;
        GroupMetadata groupMetadata;
        int a;
        int i3 = 0;
        Object obj = this.b;
        int size = obj.size();
        this.c = 0;
        if (z2) {
            i = size - 1;
            i2 = 0;
            while (i >= 0) {
                int i4;
                groupMetadata = (GroupMetadata) obj.get(i);
                a = a(groupMetadata.e, groupMetadata.d);
                if (a != groupMetadata.d) {
                    if (a == -1) {
                        obj.remove(i);
                        size--;
                    }
                    groupMetadata.d = a;
                    if (i2 == 0) {
                        i4 = 1;
                        i--;
                        i2 = i4;
                    }
                }
                i4 = i2;
                i--;
                i2 = i4;
            }
            if (i2 != 0) {
                Collections.sort(obj);
            }
        }
        i = 0;
        a = 0;
        while (i3 < size) {
            groupMetadata = (GroupMetadata) obj.get(i3);
            i2 = (groupMetadata.c == -1 || z) ? this.a.getChildrenCount(groupMetadata.d) : groupMetadata.c - groupMetadata.b;
            this.c += i2;
            a += groupMetadata.d - i;
            i = groupMetadata.d;
            groupMetadata.b = a;
            i2 += a;
            groupMetadata.c = i2;
            i3++;
            a = i2;
        }
    }

    int a(long j, int i) {
        int groupCount = this.a.getGroupCount();
        if (groupCount == 0) {
            return -1;
        }
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        int min = Math.min(groupCount - 1, Math.max(0, i));
        long uptimeMillis = SystemClock.uptimeMillis() + 100;
        Object obj = null;
        ExpandableListAdapter a = a();
        if (a == null) {
            return -1;
        }
        int i2 = min;
        int i3 = min;
        while (SystemClock.uptimeMillis() <= uptimeMillis) {
            if (a.getGroupId(i3) != j) {
                Object obj2 = min == groupCount + -1 ? 1 : null;
                Object obj3 = i2 == 0 ? 1 : null;
                if (obj2 != null && obj3 != null) {
                    break;
                } else if (obj3 != null || (r0 != null && obj2 == null)) {
                    min++;
                    obj = null;
                    i3 = min;
                } else if (obj2 != null || (r0 == null && obj3 == null)) {
                    i2--;
                    obj = 1;
                    i3 = i2;
                }
            } else {
                return i3;
            }
        }
        return -1;
    }

    ExpandableListAdapter a() {
        return this.a;
    }

    b a(int i) {
        int i2 = 0;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = size - 1;
        if (size == 0) {
            return b.a(i, 2, i, -1, null, 0);
        }
        size = i3;
        int i4 = 0;
        while (i4 <= size) {
            i2 = ((size - i4) / 2) + i4;
            GroupMetadata groupMetadata = (GroupMetadata) arrayList.get(i2);
            if (i > groupMetadata.c) {
                i4 = i2 + 1;
            } else if (i < groupMetadata.b) {
                size = i2 - 1;
            } else if (i == groupMetadata.b) {
                return b.a(i, 2, groupMetadata.d, -1, groupMetadata, i2);
            } else if (i <= groupMetadata.c) {
                return b.a(i, 1, groupMetadata.d, i - (groupMetadata.b + 1), groupMetadata, i2);
            }
        }
        GroupMetadata groupMetadata2;
        if (i4 > i2) {
            groupMetadata2 = (GroupMetadata) arrayList.get(i4 - 1);
            size = (i - groupMetadata2.c) + groupMetadata2.d;
            i2 = i4;
        } else if (size < i2) {
            i2 = size + 1;
            groupMetadata2 = (GroupMetadata) arrayList.get(i2);
            size = groupMetadata2.d - (groupMetadata2.b - i);
        } else {
            throw new RuntimeException("Unknown state");
        }
        return b.a(i, 2, size, -1, null, i2);
    }

    b a(b bVar) {
        int i = 0;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i2 = size - 1;
        if (size == 0) {
            return b.a(bVar.c, bVar.f, bVar.c, bVar.d, null, 0);
        }
        size = i2;
        int i3 = 0;
        while (i3 <= size) {
            i = ((size - i3) / 2) + i3;
            GroupMetadata groupMetadata = (GroupMetadata) arrayList.get(i);
            if (bVar.c > groupMetadata.d) {
                i3 = i + 1;
            } else if (bVar.c < groupMetadata.d) {
                size = i - 1;
            } else if (bVar.c == groupMetadata.d) {
                return bVar.f == 2 ? b.a(groupMetadata.b, bVar.f, bVar.c, bVar.d, groupMetadata, i) : bVar.f == 1 ? b.a((groupMetadata.b + bVar.d) + 1, bVar.f, bVar.c, bVar.d, groupMetadata, i) : null;
            }
        }
        if (bVar.f != 2) {
            return null;
        }
        GroupMetadata groupMetadata2;
        if (i3 > i) {
            groupMetadata2 = (GroupMetadata) arrayList.get(i3 - 1);
            return b.a((bVar.c - groupMetadata2.d) + groupMetadata2.c, bVar.f, bVar.c, bVar.d, null, i3);
        } else if (size >= i) {
            return null;
        } else {
            i = size + 1;
            groupMetadata2 = (GroupMetadata) arrayList.get(i);
            return b.a(groupMetadata2.b - (groupMetadata2.d - bVar.c), bVar.f, bVar.c, bVar.d, null, i);
        }
    }

    public void a(ExpandableListAdapter expandableListAdapter) {
        if (this.a != null) {
            this.a.unregisterDataSetObserver(this.e);
        }
        this.a = expandableListAdapter;
        expandableListAdapter.registerDataSetObserver(this.e);
    }

    void a(ArrayList<GroupMetadata> arrayList) {
        if (arrayList != null && this.a != null) {
            int groupCount = this.a.getGroupCount();
            int size = arrayList.size() - 1;
            while (size >= 0) {
                if (((GroupMetadata) arrayList.get(size)).d < groupCount) {
                    size--;
                } else {
                    return;
                }
            }
            this.b = arrayList;
            a(true, false);
        }
    }

    boolean a(b bVar) {
        if (bVar.b == null) {
            return false;
        }
        this.b.remove(bVar.b);
        a(false, false);
        notifyDataSetChanged();
        this.a.onGroupCollapsed(bVar.b.d);
        return true;
    }

    public boolean areAllItemsEnabled() {
        return this.a.areAllItemsEnabled();
    }

    ArrayList<GroupMetadata> b() {
        return this.b;
    }

    boolean b(int i) {
        b a = b.a(2, i, -1, -1);
        b a2 = a(a);
        a.b();
        if (a2 == null) {
            return false;
        }
        boolean a3 = a(a2);
        a2.a();
        return a3;
    }

    boolean b(b bVar) {
        if (bVar.a.c < 0) {
            throw new RuntimeException("Need group");
        } else if (this.d == 0) {
            return false;
        } else {
            if (bVar.b != null) {
                return false;
            }
            GroupMetadata groupMetadata;
            if (this.b.size() >= this.d) {
                groupMetadata = (GroupMetadata) this.b.get(0);
                int indexOf = this.b.indexOf(groupMetadata);
                b(groupMetadata.d);
                if (bVar.c > indexOf) {
                    bVar.c--;
                }
            }
            groupMetadata = GroupMetadata.a(-1, -1, bVar.a.c, this.a.getGroupId(bVar.a.c));
            this.b.add(bVar.c, groupMetadata);
            a(false, false);
            notifyDataSetChanged();
            this.a.onGroupExpanded(groupMetadata.d);
            return true;
        }
    }

    boolean c(int i) {
        b a = b.a(2, i, -1, -1);
        b a2 = a(a);
        a.b();
        boolean b = b(a2);
        a2.a();
        return b;
    }

    public boolean d(int i) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            if (((GroupMetadata) this.b.get(size)).d == i) {
                return true;
            }
        }
        return false;
    }

    public void e(int i) {
        this.d = i;
    }

    public int getCount() {
        return this.a.getGroupCount() + this.c;
    }

    public Filter getFilter() {
        ExpandableListAdapter a = a();
        return a instanceof Filterable ? ((Filterable) a).getFilter() : null;
    }

    public Object getItem(int i) {
        Object group;
        b a = a(i);
        if (a.a.f == 2) {
            group = this.a.getGroup(a.a.c);
        } else if (a.a.f == 1) {
            group = this.a.getChild(a.a.c, a.a.d);
        } else {
            throw new RuntimeException("Flat list position is of unknown type");
        }
        a.a();
        return group;
    }

    public long getItemId(int i) {
        b a = a(i);
        long groupId = this.a.getGroupId(a.a.c);
        if (a.a.f == 2) {
            groupId = this.a.getCombinedGroupId(groupId);
        } else if (a.a.f == 1) {
            groupId = this.a.getCombinedChildId(groupId, this.a.getChildId(a.a.c, a.a.d));
        } else {
            throw new RuntimeException("Flat list position is of unknown type");
        }
        a.a();
        return groupId;
    }

    public int getItemViewType(int i) {
        int groupType;
        b a = a(i);
        b bVar = a.a;
        if (this.a instanceof HeterogeneousExpandableList) {
            HeterogeneousExpandableList heterogeneousExpandableList = (HeterogeneousExpandableList) this.a;
            groupType = bVar.f == 2 ? heterogeneousExpandableList.getGroupType(bVar.c) : heterogeneousExpandableList.getGroupTypeCount() + heterogeneousExpandableList.getChildType(bVar.c, bVar.d);
        } else {
            groupType = bVar.f == 2 ? 0 : 1;
        }
        a.a();
        return groupType;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View groupView;
        boolean z = true;
        b a = a(i);
        if (a.a.f == 2) {
            groupView = this.a.getGroupView(a.a.c, a.b(), view, viewGroup);
        } else if (a.a.f == 1) {
            if (a.b.c != i) {
                z = false;
            }
            groupView = this.a.getChildView(a.a.c, a.a.d, z, view, viewGroup);
        } else {
            throw new RuntimeException("Flat list position is of unknown type");
        }
        a.a();
        return groupView;
    }

    public int getViewTypeCount() {
        if (!(this.a instanceof HeterogeneousExpandableList)) {
            return 2;
        }
        HeterogeneousExpandableList heterogeneousExpandableList = (HeterogeneousExpandableList) this.a;
        return heterogeneousExpandableList.getChildTypeCount() + heterogeneousExpandableList.getGroupTypeCount();
    }

    public boolean hasStableIds() {
        return this.a.hasStableIds();
    }

    public boolean isEmpty() {
        ExpandableListAdapter a = a();
        return a != null ? a.isEmpty() : true;
    }

    public boolean isEnabled(int i) {
        boolean z = true;
        b a = a(i);
        b bVar = a.a;
        if (bVar.f == 1) {
            z = this.a.isChildSelectable(bVar.c, bVar.d);
        }
        a.a();
        return z;
    }
}
