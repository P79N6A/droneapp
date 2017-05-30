package org.codehaus.jackson.map.deser;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.introspect.AnnotatedMember;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.util.Annotations;
import org.codehaus.jackson.type.JavaType;

public final class SettableBeanProperty$MethodProperty extends SettableBeanProperty {
    protected final AnnotatedMethod _annotated;
    protected final Method _setter;

    public SettableBeanProperty$MethodProperty(String str, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedMethod annotatedMethod) {
        super(str, javaType, typeDeserializer, annotations);
        this._annotated = annotatedMethod;
        this._setter = annotatedMethod.getAnnotated();
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
            this._setter.invoke(obj, new Object[]{obj2});
        } catch (Exception e) {
            _throwAsIOE(e, obj2);
        }
    }
}
