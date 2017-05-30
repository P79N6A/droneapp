package org.codehaus.jackson.map.deser;

import java.lang.annotation.Annotation;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.introspect.AnnotatedMember;
import org.codehaus.jackson.map.introspect.AnnotatedParameter;
import org.codehaus.jackson.map.util.Annotations;
import org.codehaus.jackson.type.JavaType;

public final class SettableBeanProperty$CreatorProperty extends SettableBeanProperty {
    protected final AnnotatedParameter _annotated;
    protected final int _index;

    public SettableBeanProperty$CreatorProperty(String str, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedParameter annotatedParameter, int i) {
        super(str, javaType, typeDeserializer, annotations);
        this._annotated = annotatedParameter;
        this._index = i;
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        set(obj, deserialize(jsonParser, deserializationContext));
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this._annotated.getAnnotation(cls);
    }

    public int getCreatorIndex() {
        return this._index;
    }

    public AnnotatedMember getMember() {
        return this._annotated;
    }

    public void set(Object obj, Object obj2) {
    }
}
