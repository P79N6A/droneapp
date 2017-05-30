package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;

class JsonReader$1 extends JsonReaderInternalAccess {
    JsonReader$1() {
    }

    public void promoteNameToValue(JsonReader jsonReader) {
        if (jsonReader instanceof JsonTreeReader) {
            ((JsonTreeReader) jsonReader).promoteNameToValue();
            return;
        }
        int access$000 = JsonReader.access$000(jsonReader);
        if (access$000 == 0) {
            access$000 = JsonReader.access$100(jsonReader);
        }
        if (access$000 == 13) {
            JsonReader.access$002(jsonReader, 9);
        } else if (access$000 == 12) {
            JsonReader.access$002(jsonReader, 8);
        } else if (access$000 == 14) {
            JsonReader.access$002(jsonReader, 10);
        } else {
            throw new IllegalStateException("Expected a name but was " + jsonReader.peek() + " " + " at line " + JsonReader.access$200(jsonReader) + " column " + JsonReader.access$300(jsonReader) + " path " + jsonReader.getPath());
        }
    }
}
