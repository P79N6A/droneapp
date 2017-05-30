package com.google.gson.internal;

import com.google.gson.internal.$Gson.Types;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class C$Gson$Types$ParameterizedTypeImpl implements Serializable, ParameterizedType {
    private static final long serialVersionUID = 0;
    private final Type ownerType;
    private final Type rawType;
    private final Type[] typeArguments;

    public C$Gson$Types$ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
        int i = 0;
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            int i2 = (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null) ? 1 : 0;
            boolean z = (type == null && i2 == 0) ? false : true;
            C$Gson$Preconditions.checkArgument(z);
        }
        this.ownerType = type == null ? null : Types.canonicalize(type);
        this.rawType = Types.canonicalize(type2);
        this.typeArguments = (Type[]) typeArr.clone();
        while (i < this.typeArguments.length) {
            C$Gson$Preconditions.checkNotNull(this.typeArguments[i]);
            Types.access$000(this.typeArguments[i]);
            this.typeArguments[i] = Types.canonicalize(this.typeArguments[i]);
            i++;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && Types.equals(this, (ParameterizedType) obj);
    }

    public Type[] getActualTypeArguments() {
        return (Type[]) this.typeArguments.clone();
    }

    public Type getOwnerType() {
        return this.ownerType;
    }

    public Type getRawType() {
        return this.rawType;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ Types.access$100(this.ownerType);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder((this.typeArguments.length + 1) * 30);
        stringBuilder.append(Types.typeToString(this.rawType));
        if (this.typeArguments.length == 0) {
            return stringBuilder.toString();
        }
        stringBuilder.append("<").append(Types.typeToString(this.typeArguments[0]));
        for (int i = 1; i < this.typeArguments.length; i++) {
            stringBuilder.append(", ").append(Types.typeToString(this.typeArguments[i]));
        }
        return stringBuilder.append(">").toString();
    }
}
