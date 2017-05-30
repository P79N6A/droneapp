package org.codehaus.jackson.map.deser;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.introspect.AnnotatedField;
import org.codehaus.jackson.map.introspect.AnnotatedMember;
import org.codehaus.jackson.map.util.Annotations;
import org.codehaus.jackson.type.JavaType;

public final class SettableBeanProperty$FieldProperty extends SettableBeanProperty {
    protected final AnnotatedField _annotated;
    protected final Field _field;

    public SettableBeanProperty$FieldProperty(String str, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedField annotatedField) {
        super(str, javaType, typeDeserializer, annotations);
        this._annotated = annotatedField;
        this._field = annotatedField.getAnnotated();
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        set(obj, deserialize(jsonParser, deserializationContext));
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this._annotated.getAnnotation(cls);
    }

    public AnnotatedMember getMember() {
        return this._annotated;
    }

    public final void set(Object obj, Object obj2) {
        try {
            this._field.set(obj, obj2);
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
        }
    }
}
