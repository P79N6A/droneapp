package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.node.ObjectNode;

final class JsonNodeDeserializer$ObjectDeserializer extends BaseNodeDeserializer<ObjectNode> {
    protected static final JsonNodeDeserializer$ObjectDeserializer _instance = new JsonNodeDeserializer$ObjectDeserializer();

    protected JsonNodeDeserializer$ObjectDeserializer() {
        super(ObjectNode.class);
    }

    public static JsonNodeDeserializer$ObjectDeserializer getInstance() {
        return _instance;
    }

    public ObjectNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
            jsonParser.nextToken();
            return deserializeObject(jsonParser, deserializationContext);
        } else if (jsonParser.getCurrentToken() == JsonToken.FIELD_NAME) {
            return deserializeObject(jsonParser, deserializationContext);
        } else {
            throw deserializationContext.mappingException(ObjectNode.class);
        }
    }
}
