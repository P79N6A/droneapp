package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.Writer;

public final class Streams {
    public static JsonElement parse(JsonReader jsonReader) {
        Object obj = 1;
        try {
            jsonReader.peek();
            obj = null;
            return (JsonElement) TypeAdapters.JSON_ELEMENT.read(jsonReader);
        } catch (Throwable e) {
            if (obj != null) {
                return JsonNull.INSTANCE;
            }
            throw new JsonSyntaxException(e);
        } catch (Throwable e2) {
            throw new JsonSyntaxException(e2);
        } catch (Throwable e22) {
            throw new JsonIOException(e22);
        } catch (Throwable e222) {
            throw new JsonSyntaxException(e222);
        }
    }

    public static void write(JsonElement jsonElement, JsonWriter jsonWriter) {
        TypeAdapters.JSON_ELEMENT.write(jsonWriter, jsonElement);
    }

    public static Writer writerForAppendable(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new AppendableWriter(appendable, null);
    }
}
