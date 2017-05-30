package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.annotate.JacksonStdImpl;
import org.codehaus.jackson.map.ser.StdSerializers.NonTypedScalarSerializer;

@JacksonStdImpl
public final class StdSerializers$BooleanSerializer extends NonTypedScalarSerializer<Boolean> {
    final boolean _forPrimitive;

    public StdSerializers$BooleanSerializer(boolean z) {
        super(Boolean.class);
        this._forPrimitive = z;
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("boolean", !this._forPrimitive);
    }

    public void serialize(Boolean bool, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeBoolean(bool.booleanValue());
    }
}
