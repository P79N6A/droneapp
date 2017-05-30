package org.codehaus.jackson.map.deser;

import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.type.JavaType;

protected final class SettableBeanProperty$NullProvider {
    private final boolean _isPrimitive;
    private final Object _nullValue;
    private final Class<?> _rawType;

    protected SettableBeanProperty$NullProvider(JavaType javaType, Object obj) {
        this._nullValue = obj;
        this._isPrimitive = javaType.isPrimitive();
        this._rawType = javaType.getRawClass();
    }

    public Object nullValue(DeserializationContext deserializationContext) {
        if (!this._isPrimitive || !deserializationContext.isEnabled(Feature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            return this._nullValue;
        }
        throw deserializationContext.mappingException("Can not map JSON null into type " + this._rawType.getName() + " (set DeserializationConfig.Feature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)");
    }
}
