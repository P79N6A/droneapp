package com.google.ads.mediation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
public abstract class i {

    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    protected @interface b {
        String a();

        boolean b() default true;
    }

    protected void a() {
    }

    public void a(Map<String, String> map) {
        String str;
        Map hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            b bVar = (b) field.getAnnotation(b.class);
            if (bVar != null) {
                hashMap.put(bVar.a(), field);
            }
        }
        if (hashMap.isEmpty()) {
            com.google.android.gms.ads.internal.util.client.b.d("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Entry entry : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException e) {
                    str = (String) entry.getKey();
                    com.google.android.gms.ads.internal.util.client.b.d(new StringBuilder(String.valueOf(str).length() + 49).append("Server option \"").append(str).append("\" could not be set: Illegal Access").toString());
                } catch (IllegalArgumentException e2) {
                    str = (String) entry.getKey();
                    com.google.android.gms.ads.internal.util.client.b.d(new StringBuilder(String.valueOf(str).length() + 43).append("Server option \"").append(str).append("\" could not be set: Bad Type").toString());
                }
            } else {
                str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                com.google.android.gms.ads.internal.util.client.b.a(new StringBuilder((String.valueOf(str).length() + 31) + String.valueOf(str2).length()).append("Unexpected server option: ").append(str).append(" = \"").append(str2).append("\"").toString());
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Field field22 : hashMap.values()) {
            if (((b) field22.getAnnotation(b.class)).b()) {
                String str3 = "Required server option missing: ";
                str2 = String.valueOf(((b) field22.getAnnotation(b.class)).a());
                com.google.android.gms.ads.internal.util.client.b.d(str2.length() != 0 ? str3.concat(str2) : new String(str3));
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(((b) field22.getAnnotation(b.class)).a());
            }
        }
        if (stringBuilder.length() > 0) {
            String str4 = "Required server option(s) missing: ";
            str = String.valueOf(stringBuilder.toString());
            throw new a(str.length() != 0 ? str4.concat(str) : new String(str4));
        }
        a();
    }
}
