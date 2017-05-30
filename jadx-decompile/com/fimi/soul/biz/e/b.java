package com.fimi.soul.biz.e;

import android.os.Message;
import android.util.Log;
import com.fimi.kernel.b.d;
import com.fimi.kernel.b.e;
import com.fimi.kernel.c;
import com.fimi.soul.entity.APConfig;
import com.fimi.soul.entity.APStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b extends com.fimi.kernel.b {
    public static final String a = "PSK_KEY";
    public static final String b = "AP_SSID";
    public static final String c = "AP_PRIMARY_CH";
    public static final String d = "DEF_ATH_countrycode";
    public static final String e = "VERSION";
    public static final String f = "AP_IPADDR";
    public static final String g = "ATH_txpower";
    public static final String h = "ERROR_INFO";
    public static final String i = "SIGNAL_INFO";
    public static String j = "UNCONNECT_CAMERA";
    public static final String k = "SP_KEY_CACHE_APCONFIG";
    private static String l = "http://192.168.42.100/cgi-bin";
    private static String m = "\".*\"";
    private com.fimi.kernel.b.e.b n;
    private Map<String, String> o;
    private Pattern p;
    private com.fimi.kernel.b.a q;

    private class a {
        final /* synthetic */ b a;
        private StringBuilder b = new StringBuilder();

        public a(b bVar, String str) {
            this.a = bVar;
            this.b.append(str);
            this.b.append("?");
        }

        public String a() {
            return this.b.toString();
        }

        public void a(String str, String str2) {
            if (str != null && str2 != null && str2.trim().length() > 0) {
                this.b.append(String.format("%s=%s&", new Object[]{str, str2}));
            }
        }
    }

    public b() {
        this.n = null;
        this.n = (com.fimi.kernel.b.e.b) c.a(d.Volley);
        this.q = (com.fimi.kernel.b.a) c.a(d.Http);
        this.p = Pattern.compile(m);
        this.o = new HashMap();
    }

    private boolean a(String[] strArr, String str) {
        for (String equals : strArr) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void b(String str, String str2, final e<Boolean> eVar) {
        Map hashMap = new HashMap();
        hashMap.put(str, str2);
        this.n.a(c("VAPcfg"), hashMap, new e<String>(this) {
            final /* synthetic */ b b;

            public void a(String str) {
                if (str != null) {
                    eVar.a(Boolean.valueOf(true));
                } else {
                    eVar.a(Boolean.valueOf(false));
                }
            }

            public void b(String str) {
                if (str == null) {
                    eVar.a(Boolean.valueOf(true));
                } else {
                    eVar.a(Boolean.valueOf(false));
                }
            }
        });
    }

    private String c(String str) {
        return String.format("%s/%s", new Object[]{l, str});
    }

    private APConfig d() {
        APConfig aPConfig = new APConfig();
        if (this.o != null && this.o.size() > 0) {
            aPConfig.setApPwd((String) this.o.get(a));
            aPConfig.setSsid((String) this.o.get(b));
            aPConfig.setPrimaryChannel((String) this.o.get(c));
            aPConfig.setCountryCode((String) this.o.get(d));
            aPConfig.setVersion((String) this.o.get(e));
            aPConfig.setIpAddr((String) this.o.get(f));
            aPConfig.setPower((String) this.o.get(g));
            aPConfig.setConCameraStatus((String) this.o.get(h));
            if (this.o.get(i) != null) {
                aPConfig.setSignalInfo(Integer.parseInt((String) this.o.get(i)));
            }
        }
        return aPConfig;
    }

    protected void a(Message message) {
    }

    public void a(final e<APStatus> eVar) {
        this.n.b(c("status.cgi"), new e<String>(this) {
            final /* synthetic */ b b;

            public void a(String str) {
                Log.d("Good", str + "SUCCESS");
                APStatus aPStatus = new APStatus();
                Matcher matcher = this.b.p.matcher(str);
                if (matcher.find()) {
                    aPStatus.setSsid(matcher.group().replace("\"", ""));
                }
                eVar.a(aPStatus);
            }

            public void b(String str) {
                eVar.b(null);
            }
        });
    }

    public void a(APConfig aPConfig, final e<Boolean> eVar) {
        if (aPConfig != null) {
            a aVar = new a(this, String.format("%s/setting.cgi", new Object[]{l}));
            aVar.a(a, aPConfig.getApPwd());
            aVar.a(d, aPConfig.getCountryCode());
            aVar.a(g, aPConfig.getPower());
            aVar.a(b, aPConfig.getSsid());
            aVar.a(e, aPConfig.getVersion());
            String a = aVar.a();
            Log.d("Good", a);
            this.q.a(a, new e<String>(this) {
                final /* synthetic */ b b;

                public void a(String str) {
                    this.b.c(new e<Boolean>(this) {
                        final /* synthetic */ AnonymousClass3 a;

                        {
                            this.a = r1;
                        }

                        public void a(Boolean bool) {
                            eVar.a(bool);
                        }

                        public void b(Boolean bool) {
                            eVar.b(bool);
                        }
                    });
                }

                public void b(String str) {
                    eVar.a(Boolean.valueOf(false));
                }
            });
        }
    }

    public void a(String str, String str2, final e<Boolean> eVar) {
        a aVar = new a(this, String.format("%s/setting.cgi", new Object[]{l}));
        aVar.a(str, str2);
        this.q.a(aVar.a(), new e<String>(this) {
            final /* synthetic */ b b;

            public void a(String str) {
                Log.d("Good", str);
                eVar.a(Boolean.valueOf(true));
            }

            public void b(String str) {
                eVar.a(Boolean.valueOf(false));
            }
        });
    }

    public boolean a(String str) {
        return a(c(), str);
    }

    public boolean a(String str, String str2) {
        return a(b(str), str2);
    }

    public APConfig b() {
        APConfig aPConfig = (APConfig) c.c().a(k, APConfig.class);
        return aPConfig == null ? new APConfig() : aPConfig;
    }

    public void b(final e<APConfig> eVar) {
        this.o.clear();
        this.n.b(c("config.cgi"), new e<String>(this) {
            final /* synthetic */ b b;

            public void a(String str) {
                if (str != null && str.length() > 3) {
                    Scanner scanner = new Scanner(str.substring(4));
                    while (scanner.hasNextLine()) {
                        String[] split = scanner.nextLine().split("=");
                        if (split != null && split.length == 2) {
                            this.b.o.put(split[0], split[1]);
                        }
                    }
                }
                Object c = this.b.d();
                c.c().a(b.k, c);
                eVar.a(c);
            }

            public void b(String str) {
                eVar.b(new APConfig());
            }
        });
    }

    public String[] b(String str) {
        return a(a.a, str) ? a.d : a(a.c, str) ? a.f : a(a.b, str) ? a.b : null;
    }

    public void c(final e<Boolean> eVar) {
        Map hashMap = new HashMap();
        hashMap.put("INDEX", "1");
        hashMap.put("COMMIT", "Save");
        this.n.a(c("VAPcfg"), hashMap, new e<String>(this) {
            final /* synthetic */ b b;

            public void a(String str) {
                eVar.a(Boolean.valueOf(true));
            }

            public void b(String str) {
                eVar.b(Boolean.valueOf(false));
            }
        });
    }

    public String[] c() {
        return b(b().getCountryCode());
    }

    public void d(e<Boolean> eVar) {
        b("RebootButton", "Reboot", eVar);
    }

    public void e(e<Boolean> eVar) {
        b("", "FactoryReset", eVar);
    }
}
