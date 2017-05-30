package com.google.gson.internal;

import com.google.gson.internal.$Gson.Types;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

final class C$Gson$Types$WildcardTypeImpl implements Serializable, WildcardType {
    private static final long serialVersionUID = 0;
    private final Type lowerBound;
    private final Type upperBound;

    public C$Gson$Types$WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
        boolean z = true;
        C$Gson$Preconditions.checkArgument(typeArr2.length <= 1);
        C$Gson$Preconditions.checkArgument(typeArr.length == 1);
        if (typeArr2.length == 1) {
            C$Gson$Preconditions.checkNotNull(typeArr2[0]);
            Types.access$000(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                z = false;
            }
            C$Gson$Preconditions.checkArgument(z);
            this.lowerBound = Types.canonicalize(typeArr2[0]);
            this.upperBound = Object.class;
            return;
        }
        C$Gson$Preconditions.checkNotNull(typeArr[0]);
        Types.access$000(typeArr[0]);
        this.lowerBound = null;
        this.upperBound = Types.canonicalize(typeArr[0]);
    }

    public boolean equals(Object obj) {
        return (obj instanceof WildcardType) && Types.equals(this, (WildcardType) obj);
    }

    public Type[] getLowerBounds() {
        if (this.lowerBound == null) {
            return Types.EMPTY_TYPE_ARRAY;
        }
        return new Type[]{this.lowerBound};
    }

    public Type[] getUpperBounds() {
        return new Type[]{this.upperBound};
    }

    public int hashCode() {
        return (this.lowerBound != null ? this.lowerBound.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
    }

    public String toString() {
        return this.lowerBound != null ? "? super " + Types.typeToString(this.lowerBound) : this.upperBound == Object.class ? "?" : "? extends " + Types.typeToString(this.upperBound);
    }
}
