package com.tencent.qqconnect.dataprovider.datatype;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class TextOnly implements Parcelable {
    public static final Creator<TextOnly> CREATOR = new Creator<TextOnly>() {
        public TextOnly createFromParcel(Parcel parcel) {
            return new TextOnly(parcel);
        }

        public TextOnly[] newArray(int i) {
            return new TextOnly[i];
        }
    };
    private String a;

    private TextOnly(Parcel parcel) {
        this.a = parcel.readString();
    }

    public TextOnly(String str) {
        this.a = str;
    }

    public int describeContents() {
        return 0;
    }

    public String getText() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}