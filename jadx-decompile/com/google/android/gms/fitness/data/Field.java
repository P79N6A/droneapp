package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v7.media.MediaRouteProviderProtocol;
import com.fimi.soul.media.player.FimiMediaMeta;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;

public final class Field extends AbstractSafeParcelable {
    public static final Field A = a("meal_type");
    public static final int B = 0;
    public static final int C = 1;
    public static final Creator<Field> CREATOR = new t();
    public static final int D = 2;
    public static final int E = 3;
    public static final int F = 4;
    public static final Field G = e("food_item");
    public static final Field H = f("nutrients");
    public static final String I = "calories";
    public static final String J = "fat.total";
    public static final String K = "fat.saturated";
    public static final String L = "fat.unsaturated";
    public static final String M = "fat.polyunsaturated";
    public static final String N = "fat.monounsaturated";
    public static final String O = "fat.trans";
    public static final String P = "cholesterol";
    public static final String Q = "sodium";
    public static final String R = "potassium";
    public static final String S = "carbs.total";
    public static final String T = "dietary_fiber";
    public static final String U = "sugar";
    public static final String V = "protein";
    public static final String W = "vitamin_a";
    public static final String X = "vitamin_c";
    public static final String Y = "calcium";
    public static final String Z = "iron";
    public static final Field a = a("activity");
    public static final Field aA = a("sensor_type");
    public static final Field aB = g("timestamps");
    public static final Field aC = h("sensor_values");
    public static final int aD = 1;
    public static final int aE = 2;
    public static final int aF = 3;
    public static final int aG = 4;
    public static final Field aa = c("elevation.change");
    public static final Field ab = f("elevation.gain");
    public static final Field ac = f("elevation.loss");
    public static final Field ad = c("floors");
    public static final Field ae = f("floor.gain");
    public static final Field af = f("floor.loss");
    public static final Field ag = e("exercise");
    public static final Field ah = a("repetitions");
    public static final Field ai = c("resistance");
    public static final Field aj = a("resistance_type");
    public static final int ak = 0;
    public static final int al = 1;
    public static final int am = 2;
    public static final int an = 3;
    public static final int ao = 4;
    public static final int ap = 5;
    public static final int aq = 6;
    public static final Field ar = a("num_segments");
    public static final Field as = c("average");
    public static final Field at = c("max");
    public static final Field au = c("min");
    public static final Field av = c("low_latitude");
    public static final Field aw = c("low_longitude");
    public static final Field ax = c("high_latitude");
    public static final Field ay = c("high_longitude");
    public static final Field az = a("occurrences");
    public static final Field b = c("confidence");
    public static final Field c = f("activity_confidence");
    public static final Field d = a("steps");
    public static final Field e = a("duration");
    public static final Field f = b("duration");
    public static final Field g = f("activity_duration");
    public static final Field h = f("activity_duration.ascending");
    public static final Field i = f("activity_duration.descending");
    public static final Field j = c("bpm");
    public static final Field k = c("latitude");
    public static final Field l = c("longitude");
    public static final Field m = c("accuracy");
    public static final Field n = d("altitude");
    public static final Field o = c("distance");
    public static final Field p = c(FimiMediaMeta.IJKM_KEY_HEIGHT);
    public static final Field q = c("weight");
    public static final Field r = c("circumference");
    public static final Field s = c("percentage");
    public static final Field t = c("speed");
    public static final Field u = c("rpm");
    public static final Field v = i("google.android.fitness.StrideModel");
    public static final Field w = a("revolutions");
    public static final Field x = c(I);
    public static final Field y = c("watts");
    public static final Field z = c(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME);
    private final int aH;
    private final String aI;
    private final int aJ;
    private final Boolean aK;

    public static class a {
        public static final Field a = Field.c("x");
        public static final Field b = Field.c("y");
        public static final Field c = Field.c("z");
        public static final Field d = Field.j("debug_session");
    }

    Field(int i, String str, int i2, Boolean bool) {
        this.aH = i;
        this.aI = (String) d.a(str);
        this.aJ = i2;
        this.aK = bool;
    }

    private Field(String str, int i) {
        this(2, str, i, null);
    }

    private Field(String str, int i, Boolean bool) {
        this(2, str, i, bool);
    }

    static Field a(String str) {
        return new Field(str, 1);
    }

    public static Field a(String str, int i) {
        return a(str, i, null);
    }

    public static Field a(String str, int i, Boolean bool) {
        Object obj = -1;
        switch (str.hashCode()) {
            case -2131707655:
                if (str.equals("accuracy")) {
                    obj = null;
                    break;
                }
                break;
            case -2083865430:
                if (str.equals("debug_session")) {
                    obj = 87;
                    break;
                }
                break;
            case -2006370880:
                if (str.equals("body_temperature_measurement_location")) {
                    obj = 21;
                    break;
                }
                break;
            case -1992012396:
                if (str.equals("duration")) {
                    obj = 32;
                    break;
                }
                break;
            case -1859447186:
                if (str.equals("blood_glucose_level")) {
                    obj = 8;
                    break;
                }
                break;
            case -1655966961:
                if (str.equals("activity")) {
                    obj = 1;
                    break;
                }
                break;
            case -1595712862:
                if (str.equals("cervical_dilation")) {
                    obj = 24;
                    break;
                }
                break;
            case -1579612127:
                if (str.equals("floor.gain")) {
                    obj = 37;
                    break;
                }
                break;
            case -1579449403:
                if (str.equals("floor.loss")) {
                    obj = 38;
                    break;
                }
                break;
            case -1569430471:
                if (str.equals("num_segments")) {
                    obj = 52;
                    break;
                }
                break;
            case -1531570079:
                if (str.equals("elevation.change")) {
                    obj = 33;
                    break;
                }
                break;
            case -1440707631:
                if (str.equals("oxygen_saturation")) {
                    obj = 56;
                    break;
                }
                break;
            case -1439978388:
                if (str.equals("latitude")) {
                    obj = 44;
                    break;
                }
                break;
            case -1271636505:
                if (str.equals("floors")) {
                    obj = 39;
                    break;
                }
                break;
            case -1248595573:
                if (str.equals("supplemental_oxygen_flow_rate_average")) {
                    obj = 67;
                    break;
                }
                break;
            case -1221029593:
                if (str.equals(FimiMediaMeta.IJKM_KEY_HEIGHT)) {
                    obj = 41;
                    break;
                }
                break;
            case -1220952307:
                if (str.equals("blood_pressure_measurement_location")) {
                    obj = 14;
                    break;
                }
                break;
            case -1133736764:
                if (str.equals("activity_duration")) {
                    obj = 3;
                    break;
                }
                break;
            case -1110756780:
                if (str.equals("food_item")) {
                    obj = 40;
                    break;
                }
                break;
            case -921832806:
                if (str.equals("percentage")) {
                    obj = 70;
                    break;
                }
                break;
            case -918978307:
                if (str.equals("cervical_position")) {
                    obj = 28;
                    break;
                }
                break;
            case -810883302:
                if (str.equals(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME)) {
                    obj = 81;
                    break;
                }
                break;
            case -803244749:
                if (str.equals("blood_pressure_systolic")) {
                    obj = 15;
                    break;
                }
                break;
            case -791592328:
                if (str.equals("weight")) {
                    obj = 83;
                    break;
                }
                break;
            case -631448035:
                if (str.equals("average")) {
                    obj = 7;
                    break;
                }
                break;
            case -626344110:
                if (str.equals("high_longitude")) {
                    obj = 43;
                    break;
                }
                break;
            case -619868540:
                if (str.equals("low_longitude")) {
                    obj = 47;
                    break;
                }
                break;
            case -511934137:
                if (str.equals("sensor_values")) {
                    obj = 65;
                    break;
                }
                break;
            case -494782871:
                if (str.equals("high_latitude")) {
                    obj = 42;
                    break;
                }
                break;
            case -437053898:
                if (str.equals("meal_type")) {
                    obj = 49;
                    break;
                }
                break;
            case -277306353:
                if (str.equals("circumference")) {
                    obj = 29;
                    break;
                }
                break;
            case -266093204:
                if (str.equals("nutrients")) {
                    obj = 53;
                    break;
                }
                break;
            case -228366862:
                if (str.equals("oxygen_saturation_measurement_method")) {
                    obj = 59;
                    break;
                }
                break;
            case -168965370:
                if (str.equals(I)) {
                    obj = 23;
                    break;
                }
                break;
            case -126538880:
                if (str.equals("resistance_type")) {
                    obj = 73;
                    break;
                }
                break;
            case -28590302:
                if (str.equals("ovulation_test_result")) {
                    obj = 55;
                    break;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    obj = 84;
                    break;
                }
                break;
            case Opcodes.LSHL /*121*/:
                if (str.equals("y")) {
                    obj = 85;
                    break;
                }
                break;
            case 122:
                if (str.equals("z")) {
                    obj = 86;
                    break;
                }
                break;
            case 97759:
                if (str.equals("bpm")) {
                    obj = 22;
                    break;
                }
                break;
            case 107876:
                if (str.equals("max")) {
                    obj = 48;
                    break;
                }
                break;
            case 108114:
                if (str.equals("min")) {
                    obj = 51;
                    break;
                }
                break;
            case 113135:
                if (str.equals("rpm")) {
                    obj = 75;
                    break;
                }
                break;
            case 66639641:
                if (str.equals("temporal_relation_to_sleep")) {
                    obj = 80;
                    break;
                }
                break;
            case 109641799:
                if (str.equals("speed")) {
                    obj = 76;
                    break;
                }
                break;
            case 109761319:
                if (str.equals("steps")) {
                    obj = 77;
                    break;
                }
                break;
            case 112903913:
                if (str.equals("watts")) {
                    obj = 82;
                    break;
                }
                break;
            case 137365935:
                if (str.equals("longitude")) {
                    obj = 45;
                    break;
                }
                break;
            case 198162679:
                if (str.equals("low_latitude")) {
                    obj = 46;
                    break;
                }
                break;
            case 220648413:
                if (str.equals("blood_pressure_diastolic_average")) {
                    obj = 11;
                    break;
                }
                break;
            case 248891292:
                if (str.equals("blood_glucose_specimen_source")) {
                    obj = 9;
                    break;
                }
                break;
            case 286612066:
                if (str.equals("activity_duration.descending")) {
                    obj = 5;
                    break;
                }
                break;
            case 288459765:
                if (str.equals("distance")) {
                    obj = 31;
                    break;
                }
                break;
            case 320627489:
                if (str.equals("cervical_mucus_texture")) {
                    obj = 27;
                    break;
                }
                break;
            case 455965230:
                if (str.equals("activity_duration.ascending")) {
                    obj = 4;
                    break;
                }
                break;
            case 475560024:
                if (str.equals("blood_pressure_systolic_max")) {
                    obj = 17;
                    break;
                }
                break;
            case 475560262:
                if (str.equals("blood_pressure_systolic_min")) {
                    obj = 18;
                    break;
                }
                break;
            case 581888402:
                if (str.equals("cervical_mucus_amount")) {
                    obj = 26;
                    break;
                }
                break;
            case 623947695:
                if (str.equals("oxygen_saturation_average")) {
                    obj = 57;
                    break;
                }
                break;
            case 738210934:
                if (str.equals("google.android.fitness.StrideModel")) {
                    obj = 78;
                    break;
                }
                break;
            case 784486594:
                if (str.equals("occurrences")) {
                    obj = 54;
                    break;
                }
                break;
            case 811264586:
                if (str.equals("revolutions")) {
                    obj = 74;
                    break;
                }
                break;
            case 815736413:
                if (str.equals("oxygen_saturation_system")) {
                    obj = 61;
                    break;
                }
                break;
            case 829251210:
                if (str.equals("confidence")) {
                    obj = 30;
                    break;
                }
                break;
            case 833248065:
                if (str.equals("temporal_relation_to_meal")) {
                    obj = 79;
                    break;
                }
                break;
            case 883161687:
                if (str.equals("body_temperature")) {
                    obj = 20;
                    break;
                }
                break;
            case 984367650:
                if (str.equals("repetitions")) {
                    obj = 71;
                    break;
                }
                break;
            case 998412730:
                if (str.equals("activity_confidence")) {
                    obj = 2;
                    break;
                }
                break;
            case 1276952063:
                if (str.equals("blood_pressure_diastolic")) {
                    obj = 10;
                    break;
                }
                break;
            case 1284575222:
                if (str.equals("oxygen_saturation_max")) {
                    obj = 58;
                    break;
                }
                break;
            case 1284575460:
                if (str.equals("oxygen_saturation_min")) {
                    obj = 60;
                    break;
                }
                break;
            case 1403812644:
                if (str.equals("blood_pressure_diastolic_max")) {
                    obj = 12;
                    break;
                }
                break;
            case 1403812882:
                if (str.equals("blood_pressure_diastolic_min")) {
                    obj = 13;
                    break;
                }
                break;
            case 1527920799:
                if (str.equals("sensor_type")) {
                    obj = 64;
                    break;
                }
                break;
            case 1708915229:
                if (str.equals("timestamps")) {
                    obj = 63;
                    break;
                }
                break;
            case 1857734768:
                if (str.equals("elevation.gain")) {
                    obj = 34;
                    break;
                }
                break;
            case 1857897492:
                if (str.equals("elevation.loss")) {
                    obj = 35;
                    break;
                }
                break;
            case 1863800889:
                if (str.equals("resistance")) {
                    obj = 72;
                    break;
                }
                break;
            case 1880897007:
                if (str.equals("oxygen_therapy_administration_mode")) {
                    obj = 62;
                    break;
                }
                break;
            case 1892583496:
                if (str.equals("menstrual_flow")) {
                    obj = 50;
                    break;
                }
                break;
            case 1958191058:
                if (str.equals("supplemental_oxygen_flow_rate_max")) {
                    obj = 68;
                    break;
                }
                break;
            case 1958191296:
                if (str.equals("supplemental_oxygen_flow_rate_min")) {
                    obj = 69;
                    break;
                }
                break;
            case 1983072038:
                if (str.equals("body_position")) {
                    obj = 19;
                    break;
                }
                break;
            case 2020153105:
                if (str.equals("blood_pressure_systolic_average")) {
                    obj = 16;
                    break;
                }
                break;
            case 2036550306:
                if (str.equals("altitude")) {
                    obj = 6;
                    break;
                }
                break;
            case 2056323544:
                if (str.equals("exercise")) {
                    obj = 36;
                    break;
                }
                break;
            case 2072582505:
                if (str.equals("cervical_firmness")) {
                    obj = 25;
                    break;
                }
                break;
            case 2078370221:
                if (str.equals("supplemental_oxygen_flow_rate")) {
                    obj = 66;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
                return m;
            case 1:
                return a;
            case 2:
                return c;
            case 3:
                return g;
            case 4:
                return h;
            case 5:
                return i;
            case 6:
                return n;
            case 7:
                return as;
            case 8:
                return x.k;
            case 9:
                return x.n;
            case 10:
                return x.e;
            case 11:
                return x.f;
            case 12:
                return x.h;
            case 13:
                return x.g;
            case 14:
                return x.j;
            case 15:
                return x.a;
            case 16:
                return x.b;
            case 17:
                return x.d;
            case 18:
                return x.c;
            case 19:
                return x.i;
            case 20:
                return x.z;
            case 21:
                return x.A;
            case 22:
                return j;
            case 23:
                return x;
            case 24:
                return x.E;
            case 25:
                return x.F;
            case 26:
                return x.C;
            case 27:
                return x.B;
            case 28:
                return x.D;
            case 29:
                return r;
            case 30:
                return b;
            case 31:
                return o;
            case 32:
                return (bool == null || !bool.booleanValue()) ? e : f;
            case 33:
                return aa;
            case 34:
                return ab;
            case 35:
                return ac;
            case 36:
                return ag;
            case 37:
                return ae;
            case 38:
                return af;
            case 39:
                return ad;
            case 40:
                return G;
            case 41:
                return p;
            case 42:
                return ax;
            case 43:
                return ay;
            case 44:
                return k;
            case 45:
                return l;
            case 46:
                return av;
            case 47:
                return aw;
            case 48:
                return at;
            case 49:
                return A;
            case 50:
                return x.G;
            case 51:
                return au;
            case 52:
                return ar;
            case 53:
                return H;
            case 54:
                return az;
            case 55:
                return x.H;
            case 56:
                return x.o;
            case 57:
                return x.p;
            case 58:
                return x.r;
            case 59:
                return x.y;
            case 60:
                return x.q;
            case 61:
                return x.x;
            case 62:
                return x.w;
            case 63:
                return aB;
            case 64:
                return aA;
            case 65:
                return aC;
            case 66:
                return x.s;
            case 67:
                return x.t;
            case 68:
                return x.v;
            case 69:
                return x.u;
            case 70:
                return s;
            case 71:
                return ah;
            case 72:
                return ai;
            case 73:
                return aj;
            case 74:
                return w;
            case 75:
                return u;
            case 76:
                return t;
            case 77:
                return d;
            case 78:
                return v;
            case 79:
                return x.l;
            case 80:
                return x.m;
            case 81:
                return z;
            case 82:
                return y;
            case 83:
                return q;
            case 84:
                return a.a;
            case 85:
                return a.b;
            case 86:
                return a.c;
            case 87:
                return a.d;
            default:
                return new Field(str, i, bool);
        }
    }

    private boolean a(Field field) {
        return this.aI.equals(field.aI) && this.aJ == field.aJ;
    }

    static Field b(String str) {
        return new Field(str, 1, Boolean.valueOf(true));
    }

    static Field c(String str) {
        return new Field(str, 2);
    }

    static Field d(String str) {
        return new Field(str, 2, Boolean.valueOf(true));
    }

    static Field e(String str) {
        return new Field(str, 3);
    }

    static Field f(String str) {
        return new Field(str, 4);
    }

    static Field g(String str) {
        return new Field(str, 5);
    }

    static Field h(String str) {
        return new Field(str, 6);
    }

    static Field i(String str) {
        return new Field(str, 7);
    }

    static Field j(String str) {
        return new Field(str, 7, Boolean.valueOf(true));
    }

    public String a() {
        return this.aI;
    }

    public int b() {
        return this.aJ;
    }

    public Boolean c() {
        return this.aK;
    }

    int d() {
        return this.aH;
    }

    public boolean equals(Object obj) {
        return this == obj ? true : (obj instanceof Field) && a((Field) obj);
    }

    public int hashCode() {
        return this.aI.hashCode();
    }

    public String toString() {
        String str = "%s(%s)";
        Object[] objArr = new Object[2];
        objArr[0] = this.aI;
        objArr[1] = this.aJ == 1 ? "i" : "f";
        return String.format(str, objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.a(this, parcel, i);
    }
}
