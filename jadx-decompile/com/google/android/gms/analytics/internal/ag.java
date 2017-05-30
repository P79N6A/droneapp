package com.google.android.gms.analytics.internal;

import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import com.fimi.soul.entity.User;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

abstract class ag<T extends af> extends s {
    a<T> a;

    public interface a<U extends af> {
        void a(String str, int i);

        void a(String str, String str2);

        void a(String str, boolean z);

        U b();

        void b(String str, String str2);
    }

    public ag(v vVar, a<T> aVar) {
        super(vVar);
        this.a = aVar;
    }

    private T a(XmlResourceParser xmlResourceParser) {
        Object trim;
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String toLowerCase = xmlResourceParser.getName().toLowerCase();
                    String trim2;
                    if (toLowerCase.equals("screenname")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, User.FN_NAME);
                        trim2 = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim2))) {
                            this.a.a(toLowerCase, trim2);
                        }
                    } else if (toLowerCase.equals("string")) {
                        Object attributeValue = xmlResourceParser.getAttributeValue(null, User.FN_NAME);
                        trim2 = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(attributeValue) || trim2 == null)) {
                            this.a.b(attributeValue, trim2);
                        }
                    } else if (toLowerCase.equals("bool")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, User.FN_NAME);
                        trim = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim))) {
                            try {
                                this.a.a(toLowerCase, Boolean.parseBoolean(trim));
                            } catch (NumberFormatException e) {
                                c("Error parsing bool configuration value", trim, e);
                            }
                        }
                    } else if (toLowerCase.equals("integer")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, User.FN_NAME);
                        trim = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim))) {
                            try {
                                this.a.a(toLowerCase, Integer.parseInt(trim));
                            } catch (NumberFormatException e2) {
                                c("Error parsing int configuration value", trim, e2);
                            }
                        }
                    } else {
                        continue;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (XmlPullParserException e3) {
            e("Error parsing tracker configuration file", e3);
        } catch (IOException e4) {
            e("Error parsing tracker configuration file", e4);
        }
        return this.a.b();
    }

    public T a(int i) {
        try {
            return a(k().c().getResources().getXml(i));
        } catch (NotFoundException e) {
            d("inflate() called with unknown resourceId", e);
            return null;
        }
    }
}
