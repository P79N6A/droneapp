package com.google.android.gms.location.places.internal;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity.SubstringEntity;
import java.util.Collection;
import java.util.List;

public class c {
    public static CharSequence a(String str, List<SubstringEntity> list, CharacterStyle characterStyle) {
        if (characterStyle == null) {
            return str;
        }
        CharSequence spannableString = new SpannableString(str);
        for (SubstringEntity substringEntity : list) {
            spannableString.setSpan(CharacterStyle.wrap(characterStyle), substringEntity.a(), substringEntity.b() + substringEntity.a(), 0);
        }
        return spannableString;
    }

    public static String a(Collection<String> collection) {
        return (collection == null || collection.isEmpty()) ? null : ak.a(", ").a(collection);
    }
}
