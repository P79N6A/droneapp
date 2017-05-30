package org.codehaus.jackson.map.deser;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.introspect.AnnotatedMember;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.util.Annotations;
import org.codehaus.jackson.type.JavaType;

public final class SettableBeanProperty$SetterlessProperty extends SettableBeanProperty {
    protected final AnnotatedMethod _annotated;
    protected final Method _getter;

    public SettableBeanProperty$SetterlessProperty(String str, JavaType javaType, TypeDeserializer typeDeserializer, Annotations annotations, AnnotatedMethod annotatedMethod) {
        super(str, javaType, typeDeserializer, annotations);
        this._annotated = annotatedMethod;
        this._getter = annotatedMethod.getAnnotated();
    }

    public final void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
            try {
                Object invoke = this._getter.invoke(obj, new Object[0]);
                if (invoke == null) {
                    throw new JsonMappingException("Problem deserializing 'setterless' property '" + getName() + "': get method returned null");
                }
                this._valueDeserializer.deserialize(jsonParser, deserializationContext, invoke);
            } catch (Exception e) {
                _throwAsIOE(e);
            }
        }
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this._annotated.getAnnotation(cls);
    }

    public AnnotatedMember getMember() {
        return this._annotated;
    }

    public final void set(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should never call 'set' on setterless property");
    }
}
