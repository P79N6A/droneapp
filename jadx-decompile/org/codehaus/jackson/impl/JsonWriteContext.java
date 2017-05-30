package org.codehaus.jackson.impl;

import org.codehaus.jackson.JsonStreamContext;

public class JsonWriteContext extends JsonStreamContext {
    public static final int STATUS_EXPECT_NAME = 5;
    public static final int STATUS_EXPECT_VALUE = 4;
    public static final int STATUS_OK_AFTER_COLON = 2;
    public static final int STATUS_OK_AFTER_COMMA = 1;
    public static final int STATUS_OK_AFTER_SPACE = 3;
    public static final int STATUS_OK_AS_IS = 0;
    protected JsonWriteContext _child = null;
    protected String _currentName;
    protected final JsonWriteContext _parent;

    protected JsonWriteContext(int i, JsonWriteContext jsonWriteContext) {
        this._type = i;
        this._parent = jsonWriteContext;
        this._index = -1;
    }

    public static JsonWriteContext createRootContext() {
        return new JsonWriteContext(0, null);
    }

    private final JsonWriteContext reset(int i) {
        this._type = i;
        this._index = -1;
        this._currentName = null;
        return this;
    }

    protected final void appendDesc(StringBuilder stringBuilder) {
        if (this._type == 2) {
            stringBuilder.append('{');
            if (this._currentName != null) {
                stringBuilder.append(l.e);
                stringBuilder.append(this._currentName);
                stringBuilder.append(l.e);
            } else {
                stringBuilder.append('?');
            }
            stringBuilder.append('}');
        } else if (this._type == 1) {
            stringBuilder.append('[');
            stringBuilder.append(getCurrentIndex());
            stringBuilder.append(']');
        } else {
            stringBuilder.append("/");
        }
    }

    public final JsonWriteContext createChildArrayContext() {
        JsonWriteContext jsonWriteContext = this._child;
        if (jsonWriteContext != null) {
            return jsonWriteContext.reset(1);
        }
        jsonWriteContext = new JsonWriteContext(1, this);
        this._child = jsonWriteContext;
        return jsonWriteContext;
    }

    public final JsonWriteContext createChildObjectContext() {
        JsonWriteContext jsonWriteContext = this._child;
        if (jsonWriteContext != null) {
            return jsonWriteContext.reset(2);
        }
        jsonWriteContext = new JsonWriteContext(2, this);
        this._child = jsonWriteContext;
        return jsonWriteContext;
    }

    public final String getCurrentName() {
        return this._currentName;
    }

    public final JsonWriteContext getParent() {
        return this._parent;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        appendDesc(stringBuilder);
        return stringBuilder.toString();
    }

    public final int writeFieldName(String str) {
        if (this._type != 2 || this._currentName != null) {
            return 4;
        }
        this._currentName = str;
        return this._index < 0 ? 0 : 1;
    }

    public final int writeValue() {
        if (this._type == 2) {
            if (this._currentName == null) {
                return 5;
            }
            this._currentName = null;
            this._index++;
            return 2;
        } else if (this._type == 1) {
            int i = this._index;
            this._index++;
            return i >= 0 ? 1 : 0;
        } else {
            this._index++;
            return this._index != 0 ? 3 : 0;
        }
    }
}
