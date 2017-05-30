package com.a.a;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

public class b {
    private static final int[] a = new int[]{16843490};
    private static final int b = 0;
    private static final int[] c = new int[]{16843489};
    private static final int d = 0;
    private static final int[] e = new int[]{16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};
    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 2;
    private static final int i = 3;
    private static final int j = 4;
    private static final int k = 5;
    private static final int l = 6;
    private static final int m = 7;
    private static final int n = 0;
    private static final int o = 0;

    public static a a(Context context, int i) {
        NotFoundException notFoundException;
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = context.getResources().getAnimation(i);
            a a = a(context, (XmlPullParser) xmlResourceParser);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            return a;
        } catch (Throwable e) {
            notFoundException = new NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (Throwable e2) {
            notFoundException = new NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e2);
            throw notFoundException;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static a a(Context context, XmlPullParser xmlPullParser) {
        return a(context, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0);
    }

    private static a a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, d dVar, int i) {
        int i2 = 0;
        int depth = xmlPullParser.getDepth();
        ArrayList arrayList = null;
        a aVar = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    ArrayList arrayList2;
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        aVar = a(context, attributeSet);
                    } else if (name.equals("animator")) {
                        aVar = a(context, attributeSet, null);
                    } else if (name.equals("set")) {
                        aVar = new d();
                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
                        TypedValue typedValue = new TypedValue();
                        obtainStyledAttributes.getValue(0, typedValue);
                        a(context, xmlPullParser, attributeSet, (d) aVar, typedValue.type == 16 ? typedValue.data : 0);
                        obtainStyledAttributes.recycle();
                    } else {
                        throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                    }
                    if (dVar != null) {
                        arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                        arrayList2.add(aVar);
                    } else {
                        arrayList2 = arrayList;
                    }
                    arrayList = arrayList2;
                }
            }
        }
        if (!(dVar == null || arrayList == null)) {
            a[] aVarArr = new a[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i3 = i2 + 1;
                aVarArr[i2] = (a) it.next();
                i2 = i3;
            }
            if (i == 0) {
                dVar.a(aVarArr);
            } else {
                dVar.b(aVarArr);
            }
        }
        return aVar;
    }

    private static l a(Context context, AttributeSet attributeSet) {
        q lVar = new l();
        a(context, attributeSet, lVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c);
        lVar.a(obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
        return lVar;
    }

    private static q a(Context context, AttributeSet attributeSet, q qVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e);
        long j = (long) obtainStyledAttributes.getInt(1, 0);
        long j2 = (long) obtainStyledAttributes.getInt(2, 0);
        int i = obtainStyledAttributes.getInt(7, 0);
        if (qVar == null) {
            qVar = new q();
        }
        Object obj = i == 0 ? 1 : null;
        TypedValue peekValue = obtainStyledAttributes.peekValue(5);
        Object obj2 = peekValue != null ? 1 : null;
        int i2 = obj2 != null ? peekValue.type : 0;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(6);
        Object obj3 = peekValue2 != null ? 1 : null;
        int i3 = obj3 != null ? peekValue2.type : 0;
        if ((obj2 != null && i2 >= 28 && i2 <= 31) || (obj3 != null && i3 >= 28 && i3 <= 31)) {
            obj = null;
            qVar.a(new e());
        }
        if (obj != null) {
            float dimension;
            if (obj2 != null) {
                float dimension2 = i2 == 5 ? obtainStyledAttributes.getDimension(5, 0.0f) : obtainStyledAttributes.getFloat(5, 0.0f);
                if (obj3 != null) {
                    dimension = i3 == 5 ? obtainStyledAttributes.getDimension(6, 0.0f) : obtainStyledAttributes.getFloat(6, 0.0f);
                    qVar.a(dimension2, dimension);
                } else {
                    qVar.a(dimension2);
                }
            } else {
                dimension = i3 == 5 ? obtainStyledAttributes.getDimension(6, 0.0f) : obtainStyledAttributes.getFloat(6, 0.0f);
                qVar.a(dimension);
            }
        } else if (obj2 != null) {
            i2 = i2 == 5 ? (int) obtainStyledAttributes.getDimension(5, 0.0f) : (i2 < 28 || i2 > 31) ? obtainStyledAttributes.getInt(5, 0) : obtainStyledAttributes.getColor(5, 0);
            if (obj3 != null) {
                i = i3 == 5 ? (int) obtainStyledAttributes.getDimension(6, 0.0f) : (i3 < 28 || i3 > 31) ? obtainStyledAttributes.getInt(6, 0) : obtainStyledAttributes.getColor(6, 0);
                qVar.a(i2, i);
            } else {
                qVar.a(i2);
            }
        } else if (obj3 != null) {
            i = i3 == 5 ? (int) obtainStyledAttributes.getDimension(6, 0.0f) : (i3 < 28 || i3 > 31) ? obtainStyledAttributes.getInt(6, 0) : obtainStyledAttributes.getColor(6, 0);
            qVar.a(i);
        }
        qVar.d(j);
        qVar.a(j2);
        if (obtainStyledAttributes.hasValue(3)) {
            qVar.a(obtainStyledAttributes.getInt(3, 0));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            qVar.b(obtainStyledAttributes.getInt(4, 1));
        }
        i = obtainStyledAttributes.getResourceId(0, 0);
        if (i > 0) {
            qVar.a(AnimationUtils.loadInterpolator(context, i));
        }
        obtainStyledAttributes.recycle();
        return qVar;
    }
}
