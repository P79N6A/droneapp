package com.google.android.gms.internal;

import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.d;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;

public class aqf {
    public static double a(ea<?> eaVar, ea<?> eaVar2) {
        boolean z = true;
        d.b(eaVar != null);
        if (eaVar2 == null) {
            z = false;
        }
        d.b(z);
        double b = b(eaVar);
        double b2 = b(eaVar2);
        return (Double.isNaN(b) || Double.isNaN(b2)) ? Double.NaN : ((b == MediaQueueItem.b && b2 == Double.NEGATIVE_INFINITY) || (b == Double.NEGATIVE_INFINITY && b2 == MediaQueueItem.b)) ? Double.NaN : (!Double.isInfinite(b) || Double.isInfinite(b2)) ? (Double.isInfinite(b) || !Double.isInfinite(b2)) ? b + b2 : b2 : b;
    }

    public static boolean a(ea<?> eaVar) {
        d.b(eaVar != null);
        if (eaVar == ee.e || eaVar == ee.d) {
            return false;
        }
        if (eaVar instanceof eb) {
            return ((Boolean) ((eb) eaVar).b()).booleanValue();
        }
        if (eaVar instanceof ec) {
            if (((Double) ((ec) eaVar).b()).doubleValue() == 0.0d || ((Double) ((ec) eaVar).b()).doubleValue() == -0.0d || Double.isNaN(((Double) ((ec) eaVar).b()).doubleValue())) {
                return false;
            }
        } else if (eaVar instanceof ej) {
            if (((String) ((ej) eaVar).b()).isEmpty()) {
                return false;
            }
        } else if (f(eaVar)) {
            String valueOf = String.valueOf(eaVar.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("Illegal type given to isTruthy: ").append(valueOf).append(".").toString());
        }
        return true;
    }

    public static double b(ea<?> eaVar) {
        d.b(eaVar != null);
        if (eaVar == ee.e) {
            return Double.NaN;
        }
        if (eaVar == ee.d) {
            return 0.0d;
        }
        if (eaVar instanceof eb) {
            return ((Boolean) ((eb) eaVar).b()).booleanValue() ? 1.0d : 0.0d;
        } else {
            if (eaVar instanceof ec) {
                return ((Double) ((ec) eaVar).b()).doubleValue();
            }
            if (eaVar instanceof ef) {
                ef efVar = (ef) eaVar;
                if (((List) efVar.b()).isEmpty()) {
                    return 0.0d;
                }
                if (((List) efVar.b()).size() == 1) {
                    return b(new ej(d(efVar.b(0))));
                }
            } else if (eaVar instanceof ej) {
                ej ejVar = (ej) eaVar;
                if (((String) ejVar.b()).isEmpty()) {
                    return 0.0d;
                }
                try {
                    return Double.parseDouble((String) ejVar.b());
                } catch (NumberFormatException e) {
                    return Double.NaN;
                }
            }
            if (!f(eaVar)) {
                return Double.NaN;
            }
            String valueOf = String.valueOf(eaVar.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 41).append("Illegal type given to numberEquivalent: ").append(valueOf).append(".").toString());
        }
    }

    public static boolean b(ea<?> eaVar, ea<?> eaVar2) {
        d.b(eaVar != null);
        d.b(eaVar2 != null);
        String valueOf;
        if (f(eaVar)) {
            valueOf = String.valueOf(eaVar.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Illegal type given to abstractRelationalCompare: ").append(valueOf).append(".").toString());
        } else if (f(eaVar2)) {
            valueOf = String.valueOf(eaVar2.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Illegal type given to abstractRelationalCompare: ").append(valueOf).append(".").toString());
        } else {
            ea ejVar;
            ea ejVar2;
            if ((eaVar instanceof eh) || (eaVar instanceof ef) || (eaVar instanceof ed)) {
                ejVar = new ej(d(eaVar));
            } else {
                ea<?> eaVar3 = eaVar;
            }
            if ((eaVar2 instanceof eh) || (eaVar2 instanceof ef) || (eaVar2 instanceof ed)) {
                ejVar2 = new ej(d(eaVar2));
            } else {
                ea<?> eaVar4 = eaVar2;
            }
            if ((ejVar instanceof ej) && (ejVar2 instanceof ej)) {
                return ((String) ((ej) ejVar).b()).compareTo((String) ((ej) ejVar2).b()) < 0;
            } else {
                double b = b(ejVar);
                double b2 = b(ejVar2);
                return (Double.isNaN(b) || Double.isNaN(b2)) ? false : (b == 0.0d && b2 == -0.0d) ? false : ((b == -0.0d && b2 == 0.0d) || b == MediaQueueItem.b) ? false : b2 == MediaQueueItem.b ? true : b2 != Double.NEGATIVE_INFINITY ? b == Double.NEGATIVE_INFINITY ? true : Double.compare(b, b2) < 0 : false;
            }
        }
    }

    public static double c(ea<?> eaVar) {
        double b = b(eaVar);
        return Double.isNaN(b) ? 0.0d : (b == 0.0d || b == -0.0d || Double.isInfinite(b)) ? b : Math.signum(b) * Math.floor(Math.abs(b));
    }

    public static boolean c(ea<?> eaVar, ea<?> eaVar2) {
        d.b(eaVar != null);
        d.b(eaVar2 != null);
        String valueOf;
        if (f(eaVar)) {
            valueOf = String.valueOf(eaVar.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 48).append("Illegal type given to abstractEqualityCompare: ").append(valueOf).append(".").toString());
        } else if (f(eaVar2)) {
            valueOf = String.valueOf(eaVar2.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 48).append("Illegal type given to abstractEqualityCompare: ").append(valueOf).append(".").toString());
        } else {
            valueOf = e(eaVar);
            String e = e(eaVar2);
            if (!valueOf.equals(e)) {
                return ((eaVar == ee.e || eaVar == ee.d) && (eaVar2 == ee.e || eaVar2 == ee.d)) ? true : (valueOf.equals("Number") && e.equals("String")) ? c(eaVar, new ec(Double.valueOf(b(eaVar2)))) : (valueOf.equals("String") && e.equals("Number")) ? c(new ec(Double.valueOf(b(eaVar))), eaVar2) : valueOf.equals("Boolean") ? c(new ec(Double.valueOf(b(eaVar))), eaVar2) : e.equals("Boolean") ? c(eaVar, new ec(Double.valueOf(b(eaVar2)))) : ((valueOf.equals("String") || valueOf.equals("Number")) && e.equals("Object")) ? c(eaVar, new ej(d(eaVar2))) : (valueOf.equals("Object") && (e.equals("String") || e.equals("Number"))) ? c(new ej(d(eaVar)), eaVar2) : false;
            } else {
                boolean z = true;
                switch (valueOf.hashCode()) {
                    case -1950496919:
                        if (valueOf.equals("Number")) {
                            z = true;
                            break;
                        }
                        break;
                    case -1939501217:
                        if (valueOf.equals("Object")) {
                            z = true;
                            break;
                        }
                        break;
                    case -1808118735:
                        if (valueOf.equals("String")) {
                            z = true;
                            break;
                        }
                        break;
                    case 2439591:
                        if (valueOf.equals("Null")) {
                            z = true;
                            break;
                        }
                        break;
                    case 965837104:
                        if (valueOf.equals("Undefined")) {
                            z = false;
                            break;
                        }
                        break;
                    case 1729365000:
                        if (valueOf.equals("Boolean")) {
                            z = true;
                            break;
                        }
                        break;
                }
                switch (z) {
                    case false:
                    case true:
                        return true;
                    case true:
                        double doubleValue = ((Double) ((ec) eaVar).b()).doubleValue();
                        double doubleValue2 = ((Double) ((ec) eaVar2).b()).doubleValue();
                        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2)) ? false : doubleValue == doubleValue2;
                    case true:
                        return ((String) ((ej) eaVar).b()).equals((String) ((ej) eaVar2).b());
                    case true:
                        return ((Boolean) ((eb) eaVar).b()) == ((Boolean) ((eb) eaVar2).b());
                    case true:
                        return eaVar == eaVar2;
                    default:
                        return false;
                }
            }
        }
    }

    public static String d(ea<?> eaVar) {
        int i = 1;
        d.b(eaVar != null);
        if (eaVar == ee.e) {
            return "undefined";
        }
        if (eaVar == ee.d) {
            return "null";
        }
        if (eaVar instanceof eb) {
            return ((Boolean) ((eb) eaVar).b()).booleanValue() ? "true" : "false";
        } else {
            String d;
            if (eaVar instanceof ec) {
                d = Double.toString(((Double) ((ec) eaVar).b()).doubleValue());
                int indexOf = d.indexOf("E");
                if (indexOf > 0) {
                    int parseInt = Integer.parseInt(d.substring(indexOf + 1, d.length()));
                    int i2;
                    if (parseInt < 0) {
                        if (parseInt <= -7) {
                            return d.replace("E", "e");
                        }
                        String replace = d.substring(0, indexOf).replace(".", "");
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("0.");
                        for (i2 = parseInt; i2 + 1 < 0; i2++) {
                            stringBuilder.append("0");
                        }
                        stringBuilder.append(replace);
                        return stringBuilder.toString();
                    } else if (parseInt >= 21) {
                        return d.replace("E", "e+");
                    } else {
                        String replace2 = d.substring(0, indexOf).replace(".", "");
                        i2 = parseInt + 1;
                        parseInt = replace2.length();
                        if (!replace2.startsWith(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
                            i = 0;
                        }
                        i2 -= parseInt - i;
                        StringBuilder stringBuilder2 = new StringBuilder();
                        if (i2 < 0) {
                            i2 += replace2.length();
                            stringBuilder2.append(replace2.substring(0, i2));
                            stringBuilder2.append(".");
                            stringBuilder2.append(replace2.substring(i2, replace2.length()));
                        } else {
                            stringBuilder2.append(replace2);
                            while (i2 > 0) {
                                stringBuilder2.append("0");
                                i2--;
                            }
                        }
                        return stringBuilder2.toString();
                    }
                } else if (!d.endsWith(".0")) {
                    return d;
                } else {
                    d = d.substring(0, d.length() - 2);
                    return d.equals("-0") ? "0" : d;
                }
            } else {
                if (eaVar instanceof ed) {
                    aqe com_google_android_gms_internal_aqe = (aqe) ((ed) eaVar).b();
                    if (com_google_android_gms_internal_aqe instanceof aqd) {
                        return ((aqd) com_google_android_gms_internal_aqe).a();
                    }
                } else if (eaVar instanceof ef) {
                    Iterable arrayList = new ArrayList();
                    for (ea eaVar2 : (List) ((ef) eaVar).b()) {
                        if (eaVar2 == ee.d || eaVar2 == ee.e) {
                            arrayList.add("");
                        } else {
                            arrayList.add(d(eaVar2));
                        }
                    }
                    return ak.a(Constants.ACCEPT_TIME_SEPARATOR_SP).a(arrayList);
                } else if (eaVar instanceof eh) {
                    return "[object Object]";
                } else {
                    if (eaVar instanceof ej) {
                        return (String) ((ej) eaVar).b();
                    }
                }
                if (f(eaVar)) {
                    d = String.valueOf(eaVar.toString());
                    d = new StringBuilder(String.valueOf(d).length() + 41).append("Illegal type given to stringEquivalent: ").append(d).append(".").toString();
                } else {
                    d = "Unknown type in stringEquivalent.";
                }
                throw new IllegalArgumentException(d);
            }
        }
    }

    public static boolean d(ea<?> eaVar, ea<?> eaVar2) {
        d.b(eaVar != null);
        d.b(eaVar2 != null);
        String valueOf;
        if (f(eaVar)) {
            valueOf = String.valueOf(eaVar.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 46).append("Illegal type given to strictEqualityCompare: ").append(valueOf).append(".").toString());
        } else if (f(eaVar2)) {
            valueOf = String.valueOf(eaVar2.toString());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 46).append("Illegal type given to strictEqualityCompare: ").append(valueOf).append(".").toString());
        } else {
            valueOf = e(eaVar);
            if (!valueOf.equals(e(eaVar2))) {
                return false;
            }
            boolean z = true;
            switch (valueOf.hashCode()) {
                case -1950496919:
                    if (valueOf.equals("Number")) {
                        z = true;
                        break;
                    }
                    break;
                case -1808118735:
                    if (valueOf.equals("String")) {
                        z = true;
                        break;
                    }
                    break;
                case 2439591:
                    if (valueOf.equals("Null")) {
                        z = true;
                        break;
                    }
                    break;
                case 965837104:
                    if (valueOf.equals("Undefined")) {
                        z = false;
                        break;
                    }
                    break;
                case 1729365000:
                    if (valueOf.equals("Boolean")) {
                        z = true;
                        break;
                    }
                    break;
            }
            switch (z) {
                case false:
                case true:
                    return true;
                case true:
                    double doubleValue = ((Double) ((ec) eaVar).b()).doubleValue();
                    double doubleValue2 = ((Double) ((ec) eaVar2).b()).doubleValue();
                    return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2)) ? false : doubleValue == doubleValue2;
                case true:
                    return ((String) ((ej) eaVar).b()).equals((String) ((ej) eaVar2).b());
                case true:
                    return ((Boolean) ((eb) eaVar).b()) == ((Boolean) ((eb) eaVar2).b());
                default:
                    return eaVar == eaVar2;
            }
        }
    }

    private static String e(ea<?> eaVar) {
        return eaVar == ee.e ? "Undefined" : eaVar == ee.d ? "Null" : eaVar instanceof eb ? "Boolean" : eaVar instanceof ec ? "Number" : eaVar instanceof ej ? "String" : "Object";
    }

    private static boolean f(ea<?> eaVar) {
        return (eaVar instanceof ei) || !(!(eaVar instanceof ee) || eaVar == ee.e || eaVar == ee.d);
    }
}
