package com.fimi.kernel.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class f {
    public static final String a = "yyyy-MM-dd HH:mm:ss";
    public static final String b = "yyyy-MM-dd";
    public static final String c = "yyyy-MM";
    public static final String d = "yyyy-MM-dd HH:mm";
    public static final String e = "yyyyMMddHHmmss";
    public static final String f = "MM/dd";
    public static final String g = "HH:mm:ss";
    public static final String h = "HH:mm";
    public static final String i = "AM";
    public static final String j = "PM";

    public static int a(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j2);
        int i = instance.get(1);
        int i2 = instance2.get(1);
        int i3 = instance.get(6);
        int i4 = instance2.get(6);
        if (i - i2 > 0) {
            return instance2.getActualMaximum(6) + (i3 - i4);
        }
        if (i - i2 >= 0) {
            return i3 - i4;
        }
        return (i3 - i4) - instance.getActualMaximum(6);
    }

    public static long a() {
        try {
            return a(a(b) + " 00:00:00", "yyyy-MM-dd HH:mm:ss").getTime();
        } catch (Exception e) {
            return -1;
        }
    }

    public static String a(long j) {
        if (j <= 1000) {
            return j + "毫秒";
        }
        if ((j / 1000) / 60 <= 1) {
            return (j / 1000) + "秒";
        }
        return ((j / 1000) / 60) + "分" + ((j / 1000) % 60) + "秒";
    }

    public static String a(long j, String str) {
        String str2 = null;
        try {
            str2 = new SimpleDateFormat(str).format(Long.valueOf(j));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str2;
    }

    public static String a(String str) {
        k.a(f.class, "getCurrentDate:" + str);
        String str2 = null;
        try {
            str2 = new SimpleDateFormat(str).format(new GregorianCalendar().getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str2;
    }

    private static String a(String str, int i) {
        try {
            Calendar gregorianCalendar = new GregorianCalendar();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            int i2 = gregorianCalendar.get(7);
            if (i2 == i) {
                return simpleDateFormat.format(gregorianCalendar.getTime());
            }
            i2 = i - i2;
            if (i == 1) {
                i2 = 7 - Math.abs(i2);
            }
            gregorianCalendar.add(5, i2);
            return simpleDateFormat.format(gregorianCalendar.getTime());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(String str, int i, int i2) {
        String str2 = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            Calendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.add(i, i2);
            str2 = simpleDateFormat.format(gregorianCalendar.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str2;
    }

    public static String a(String str, String str2, int i, int i2) {
        String str3 = null;
        try {
            Calendar gregorianCalendar = new GregorianCalendar();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
            gregorianCalendar.setTime(simpleDateFormat.parse(str));
            gregorianCalendar.add(i, i2);
            str3 = simpleDateFormat.format(gregorianCalendar.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return str3;
    }

    public static String a(Date date, String str) {
        String str2 = null;
        try {
            str2 = new SimpleDateFormat(str).format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str2;
    }

    public static String a(Date date, String str, int i, int i2) {
        String str2 = null;
        try {
            Calendar gregorianCalendar = new GregorianCalendar();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            gregorianCalendar.setTime(date);
            gregorianCalendar.add(i, i2);
            str2 = simpleDateFormat.format(gregorianCalendar.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str2;
    }

    public static Date a(String str, String str2) {
        Date date = null;
        try {
            date = new SimpleDateFormat(str2).parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static void a(String[] strArr) {
        System.out.println(c("2012-3-2 12:2:20", "MM月dd日  HH:mm"));
    }

    public static boolean a(int i) {
        return (i % 4 == 0 && i % 400 != 0) || i % 400 == 0;
    }

    public static int b(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j2);
        return (instance.get(11) - instance2.get(11)) + (a(j, j2) * 24);
    }

    public static long b() {
        try {
            return a(a(b) + " 24:00:00", "yyyy-MM-dd HH:mm:ss").getTime();
        } catch (Exception e) {
            return -1;
        }
    }

    public static String b(String str) {
        return a(str, 2);
    }

    public static String b(String str, String str2) {
        String str3 = null;
        try {
            Calendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str));
            str3 = new SimpleDateFormat(str2).format(gregorianCalendar.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str3;
    }

    public static int c(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j2);
        return (instance.get(12) - instance2.get(12)) + (b(j, j2) * 60);
    }

    public static String c(String str) {
        return a(str, 1);
    }

    public static String c(String str, String str2) {
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        try {
            instance2.setTime(simpleDateFormat.parse(str));
            instance.setTime(new Date());
            int a = a(instance.getTimeInMillis(), instance2.getTimeInMillis());
            if (a == 0) {
                a = b(instance.getTimeInMillis(), instance2.getTimeInMillis());
                if (a > 0) {
                    return "今天" + b(str, h);
                }
                if (a >= 0 && a == 0) {
                    a = c(instance.getTimeInMillis(), instance2.getTimeInMillis());
                    if (a > 0) {
                        return a + "分钟前";
                    }
                    if (a >= 0) {
                        return "刚刚";
                    }
                }
            } else if (a > 0) {
                if (a != 1 && a == 2) {
                }
            } else if (a < 0 && a != -1 && a == -2) {
            }
            String b = b(str, str2);
            return !n.b(b) ? b : str;
        } catch (Exception e) {
            return str;
        }
    }

    public static String d(String str) {
        String str2 = null;
        try {
            Calendar gregorianCalendar = new GregorianCalendar();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            gregorianCalendar.set(5, 1);
            str2 = simpleDateFormat.format(gregorianCalendar.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str2;
    }

    public static String d(String str, String str2) {
        String str3 = "星期日";
        Calendar gregorianCalendar = new GregorianCalendar();
        try {
            gregorianCalendar.setTime(new SimpleDateFormat(str2).parse(str));
            switch (gregorianCalendar.get(7) - 1) {
                case 0:
                    return "星期日";
                case 1:
                    return "星期一";
                case 2:
                    return "星期二";
                case 3:
                    return "星期三";
                case 4:
                    return "星期四";
                case 5:
                    return "星期五";
                case 6:
                    return "星期六";
                default:
                    return str3;
            }
        } catch (Exception e) {
            return "错误";
        }
    }

    public static String e(String str) {
        String str2 = null;
        try {
            Calendar gregorianCalendar = new GregorianCalendar();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            gregorianCalendar.set(5, 1);
            gregorianCalendar.roll(5, -1);
            str2 = simpleDateFormat.format(gregorianCalendar.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str2;
    }

    public static String e(String str, String str2) {
        return a(str, str2).getHours() >= 12 ? j : i;
    }

    public Date a(Date date, int i, int i2) {
        Calendar gregorianCalendar = new GregorianCalendar();
        try {
            gregorianCalendar.setTime(date);
            gregorianCalendar.add(i, i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gregorianCalendar.getTime();
    }
}
