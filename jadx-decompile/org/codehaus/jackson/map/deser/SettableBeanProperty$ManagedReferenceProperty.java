package org.codehaus.jackson.map.deser;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Map;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.introspect.AnnotatedMember;
import org.codehaus.jackson.map.util.Annotations;

public final class SettableBeanProperty$ManagedReferenceProperty extends SettableBeanProperty {
    protected final SettableBeanProperty _backProperty;
    protected final boolean _isContainer;
    protected final SettableBeanProperty _managedProperty;
    protected final String _referenceName;

    public SettableBeanProperty$ManagedReferenceProperty(String str, SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2, Annotations annotations, boolean z) {
        super(settableBeanProperty.getName(), settableBeanProperty.getType(), settableBeanProperty._valueTypeDeserializer, annotations);
        this._referenceName = str;
        this._managedProperty = settableBeanProperty;
        this._backProperty = settableBeanProperty2;
        this._isContainer = z;
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        set(obj, this._managedProperty.deserialize(jsonParser, deserializationContext));
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this._managedProperty.getAnnotation(cls);
    }

    public AnnotatedMember getMember() {
        return this._managedProperty.getMember();
    }

    public final void set(Object obj, Object obj2) {
        this._managedProperty.set(obj, obj2);
        if (obj2 == null) {
            return;
        }
        if (!this._isContainer) {
            this._backProperty.set(obj2, obj);
        } else if (obj2 instanceof Object[]) {
            for (Object obj3 : (Object[]) obj2) {
                if (obj3 != null) {
                    this._backProperty.set(obj3, obj);
                }
            }
        } else if (obj2 instanceof Collection) {
            for (Object next : (Collection) obj2) {
                if (next != null) {
                    this._backProperty.set(next, obj);
                }
            }
        } else if (obj2 instanceof Map) {
            for (Object next2 : ((Map) obj2).values()) {
                if (next2 != null) {
                    this._backProperty.set(next2, obj);
                }
            }
        } else {
            throw new IllegalStateException("Unsupported container type (" + obj2.getClass().getName() + ") when resolving reference '" + this._referenceName + "'");
        }
    }
}
