package org.codehaus.jackson.map;

public class AnnotationIntrospector$ReferenceProperty {
    private final String _name;
    private final Type _type;

    public enum Type {
        MANAGED_REFERENCE,
        BACK_REFERENCE
    }

    public AnnotationIntrospector$ReferenceProperty(Type type, String str) {
        this._type = type;
        this._name = str;
    }

    public static AnnotationIntrospector$ReferenceProperty back(String str) {
        return new AnnotationIntrospector$ReferenceProperty(Type.BACK_REFERENCE, str);
    }

    public static AnnotationIntrospector$ReferenceProperty managed(String str) {
        return new AnnotationIntrospector$ReferenceProperty(Type.MANAGED_REFERENCE, str);
    }

    public String getName() {
        return this._name;
    }

    public Type getType() {
        return this._type;
    }

    public boolean isBackReference() {
        return this._type == Type.BACK_REFERENCE;
    }

    public boolean isManagedReference() {
        return this._type == Type.MANAGED_REFERENCE;
    }
}
