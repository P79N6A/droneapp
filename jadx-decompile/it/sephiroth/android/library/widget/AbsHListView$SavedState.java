package it.sephiroth.android.library.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.SparseArrayCompat;
import android.view.View.BaseSavedState;

class AbsHListView$SavedState extends BaseSavedState {
    public static final Creator<AbsHListView$SavedState> CREATOR = new Creator<AbsHListView$SavedState>() {
        public AbsHListView$SavedState a(Parcel parcel) {
            return new AbsHListView$SavedState(parcel);
        }

        public AbsHListView$SavedState[] a(int i) {
            return new AbsHListView$SavedState[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }
    };
    long a;
    long b;
    int c;
    int d;
    int e;
    String f;
    boolean g;
    int h;
    SparseArrayCompat<Boolean> i;
    LongSparseArray<Integer> j;

    private AbsHListView$SavedState(Parcel parcel) {
        super(parcel);
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readByte() != (byte) 0;
        this.h = parcel.readInt();
        this.i = b(parcel);
        this.j = a(parcel);
    }

    AbsHListView$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    private LongSparseArray<Integer> a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt <= 0) {
            return null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(readInt);
        a(longSparseArray, parcel, readInt);
        return longSparseArray;
    }

    private void a(LongSparseArray<Integer> longSparseArray, Parcel parcel) {
        int i = 0;
        int size = longSparseArray != null ? longSparseArray.size() : 0;
        parcel.writeInt(size);
        while (i < size) {
            parcel.writeLong(longSparseArray.keyAt(i));
            parcel.writeInt(((Integer) longSparseArray.valueAt(i)).intValue());
            i++;
        }
    }

    private void a(LongSparseArray<Integer> longSparseArray, Parcel parcel, int i) {
        while (i > 0) {
            longSparseArray.put(parcel.readLong(), Integer.valueOf(parcel.readInt()));
            i--;
        }
    }

    private void a(SparseArrayCompat<Boolean> sparseArrayCompat, Parcel parcel) {
        if (sparseArrayCompat == null) {
            parcel.writeInt(-1);
            return;
        }
        int size = sparseArrayCompat.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            parcel.writeInt(sparseArrayCompat.keyAt(i));
            parcel.writeByte((byte) (((Boolean) sparseArrayCompat.valueAt(i)).booleanValue() ? 1 : 0));
        }
    }

    private void a(SparseArrayCompat<Boolean> sparseArrayCompat, Parcel parcel, int i) {
        while (i > 0) {
            sparseArrayCompat.append(parcel.readInt(), Boolean.valueOf(parcel.readByte() == (byte) 1));
            i--;
        }
    }

    private SparseArrayCompat<Boolean> b(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat(readInt);
        a(sparseArrayCompat, parcel, readInt);
        return sparseArrayCompat;
    }

    public String toString() {
        return "AbsListView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " selectedId=" + this.a + " firstId=" + this.b + " viewLeft=" + this.c + " position=" + this.d + " width=" + this.e + " filter=" + this.f + " checkState=" + this.i + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeByte((byte) (this.g ? 1 : 0));
        parcel.writeInt(this.h);
        a(this.i, parcel);
        a(this.j, parcel);
    }
}
