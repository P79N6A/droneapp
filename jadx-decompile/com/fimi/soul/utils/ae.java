package com.fimi.soul.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.DeserializationProblemHandler;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

public class ae {
    private static ObjectMapper a = new ObjectMapper();

    static {
        a.getDeserializationConfig().set(Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        a.getSerializationConfig().setSerializationInclusion(Inclusion.NON_NULL);
        a.getSerializationConfig().setSerializationInclusion(Inclusion.NON_DEFAULT);
        a.configure(Feature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
        a.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        a.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        a.configure(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS, false);
        a.configure(Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
    }

    public static <T> T a(Class<T> cls, File file) {
        return a.readValue(file, (Class) cls);
    }

    public static <T> ArrayList<T> a(Class<? extends T[]> cls, String str) {
        Object[] objArr = (Object[]) a.readValue(str, (Class) cls);
        ArrayList<T> arrayList = new ArrayList();
        for (Object add : objArr) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public static List<LinkedHashMap<String, Object>> a(String str) {
        return (List) a.readValue(str, List.class);
    }

    public static void a(DeserializationProblemHandler deserializationProblemHandler) {
        a.getDeserializationConfig().addHandler(deserializationProblemHandler);
    }

    public static <T> T b(Class<T> cls, String str) {
        return a.readValue(str, (Class) cls);
    }
}
