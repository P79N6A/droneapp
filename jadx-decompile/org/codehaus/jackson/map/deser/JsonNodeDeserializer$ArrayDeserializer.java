package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.node.ArrayNode;

final class JsonNodeDeserializer$ArrayDeserializer extends BaseNodeDeserializer<ArrayNode> {
    protected static final JsonNodeDeserializer$ArrayDeserializer _instance = new JsonNodeDeserializer$ArrayDeserializer();

    protected JsonNodeDeserializer$ArrayDeserializer() {
        super(ArrayNode.class);
    }

    public static JsonNodeDeserializer$ArrayDeserializer getInstance() {
        return _instance;
    }

    public ArrayNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.isExpectedStartArrayToken()) {
            return deserializeArray(jsonParser, deserializationContext);
        }
        throw deserializationContext.mappingException(ArrayNode.class);
    }
}
