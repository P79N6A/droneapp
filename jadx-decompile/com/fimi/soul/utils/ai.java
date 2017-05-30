package com.fimi.soul.utils;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.fimi.kernel.c;
import com.fimi.overseas.soul.R;
import com.fimi.soul.biz.m.k;
import com.fimi.soul.biz.manager.f;
import com.fimi.soul.biz.manager.x;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.utils.aj.a;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.account.openauth.XiaomiOAuthFuture;
import com.xiaomi.account.openauth.XiaomiOAuthResults;
import com.xiaomi.account.openauth.XiaomiOAuthorize;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.io.File;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class ai implements aj {
    private static final String a = "http://dev.xiaomi.com";
    private XiaomiOAuthResults b;
    private User c = new User();
    private x d;
    private Context e;
    private a f;
    private String g;

    private void a() {
        f.a(this.e).a(new k(this) {
            final /* synthetic */ ai a;

            {
                this.a = r1;
            }

            public void a(PlaneMsg planeMsg, File file) {
            }
        });
        final XiaomiOAuthFuture callOpenApi = new XiaomiOAuthorize().callOpenApi(this.e, Long.parseLong("2882303761517518920"), XiaomiOAuthConstants.OPEN_API_PATH_PHONE, this.b.getAccessToken(), this.b.getMacKey(), this.b.getMacAlgorithm());
        new AsyncTask<Void, Void, String>(this) {
            Exception a;
            final /* synthetic */ ai c;

            protected String a(Void... voidArr) {
                try {
                    return (String) callOpenApi.getResult();
                } catch (Exception e) {
                    this.a = e;
                    return null;
                } catch (Exception e2) {
                    this.a = e2;
                    return null;
                } catch (Exception e22) {
                    this.a = e22;
                    return null;
                }
            }

            protected void a(String str) {
                if (str != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(str).getJSONObject(UriUtil.DATA_SCHEME);
                        if (jSONObject.getString("phone") != null && jSONObject.getString("phone").length() > 0) {
                            this.c.c.setPhone(jSONObject.getString("phone"));
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    } catch (NullPointerException e2) {
                        e2.printStackTrace();
                    }
                }
            }

            protected /* synthetic */ Object doInBackground(Object[] objArr) {
                return a((Void[]) objArr);
            }

            protected /* synthetic */ void onPostExecute(Object obj) {
                a((String) obj);
            }

            protected void onPreExecute() {
                com.fimi.soul.base.a.a("waiting for Future result...", LoginActivity.class);
            }
        }.execute(new Void[0]);
        callOpenApi = new XiaomiOAuthorize().callOpenApi(this.e, Long.parseLong("2882303761517518920"), XiaomiOAuthConstants.OPEN_API_PATH_PROFILE, this.b.getAccessToken(), this.b.getMacKey(), this.b.getMacAlgorithm());
        new AsyncTask<Void, Void, String>(this) {
            Exception a;
            final /* synthetic */ ai c;

            protected String a(Void... voidArr) {
                try {
                    return (String) callOpenApi.getResult();
                } catch (Exception e) {
                    this.a = e;
                    return null;
                } catch (Exception e2) {
                    this.a = e2;
                    return null;
                } catch (Exception e22) {
                    this.a = e22;
                    return null;
                }
            }

            protected void a(String str) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str).getJSONObject(UriUtil.DATA_SCHEME);
                        this.c.c.setXiaomiID(jSONObject.getString("userId"));
                        this.c.c.setName(jSONObject.getString("miliaoNick"));
                        this.c.c.setNickName(jSONObject.getString("miliaoNick"));
                        this.c.c.setDevice(ao.a(c.a()));
                        if (jSONObject.has("sex")) {
                            if (jSONObject.getString("sex").equals(this.c.e.getResources().getString(R.string.man))) {
                                this.c.c.setSex("1");
                            } else if (jSONObject.getString("sex").equals(this.c.e.getResources().getString(R.string.woman))) {
                                this.c.c.setSex("0");
                            }
                        }
                        if (jSONObject.has("miliaoIcon_orig")) {
                            this.c.c.setUserImgUrl(jSONObject.getString("miliaoIcon_orig"));
                        }
                        this.c.d.d(this.c.c, new k(this) {
                            final /* synthetic */ AnonymousClass4 a;

                            {
                                this.a = r1;
                            }

                            public void a(PlaneMsg planeMsg, File file) {
                                this.a.c.g = planeMsg.getErrorMessage();
                                if (planeMsg.isSuccess()) {
                                    MiPushClient.registerPush(this.a.c.e, "2882303761517518920", com.fimi.soul.base.a.r);
                                    if (this.a.c.f != null) {
                                        this.a.c.f.a();
                                    }
                                } else if (this.a.c.g != null) {
                                    if (this.a.c.f != null) {
                                        this.a.c.f.a(this.a.c.g);
                                    }
                                } else if (this.a.c.f != null) {
                                    this.a.c.f.a(this.a.c.e.getResources().getString(R.string.login_result_net));
                                }
                            }
                        });
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else if (this.c.f != null) {
                    this.c.f.a(this.c.e.getResources().getString(R.string.login_result));
                }
            }

            protected /* synthetic */ Object doInBackground(Object[] objArr) {
                return a((Void[]) objArr);
            }

            protected /* synthetic */ void onPostExecute(Object obj) {
                a((String) obj);
            }

            protected void onPreExecute() {
                com.fimi.soul.base.a.a("waiting for Future result...", LoginActivity.class);
            }
        }.execute(new Void[0]);
    }

    private <V> void a(final XiaomiOAuthFuture<V> xiaomiOAuthFuture) {
        new AsyncTask<Void, Void, V>(this) {
            Exception a;
            final /* synthetic */ ai c;

            protected V a(Void... voidArr) {
                V v = null;
                try {
                    v = xiaomiOAuthFuture.getResult();
                } catch (Exception e) {
                    this.a = e;
                } catch (Exception e2) {
                    this.a = e2;
                } catch (Exception e22) {
                    this.a = e22;
                }
                return v;
            }

            protected /* synthetic */ Object doInBackground(Object[] objArr) {
                return a((Void[]) objArr);
            }

            protected void onPostExecute(V v) {
                if (v != null) {
                    if (v instanceof XiaomiOAuthResults) {
                        this.c.b = (XiaomiOAuthResults) v;
                        if (this.c.b.getAccessToken() != null) {
                            com.fimi.soul.biz.g.a.c(c.a(), 0, this.c.b.getAccessToken());
                            com.fimi.soul.biz.g.a.b(c.a(), 0, this.c.b.getMacKey());
                            com.fimi.soul.biz.g.a.a(c.a(), 0, this.c.b.getMacAlgorithm());
                            this.c.a();
                        } else if (this.c.f != null) {
                            this.c.f.a(this.c.e.getResources().getString(R.string.login_result));
                        }
                    }
                } else if (this.a != null) {
                    if (this.c.f != null) {
                        this.c.f.b();
                    }
                } else if (this.c.f != null) {
                    this.c.f.a(this.c.e.getResources().getString(R.string.login_result));
                }
            }

            protected void onPreExecute() {
                com.fimi.soul.base.a.a("waiting for Future result...", LoginActivity.class);
            }
        }.execute(new Void[0]);
    }

    public void a(Context context, a aVar) {
        this.e = context;
        this.f = aVar;
        this.d = x.a(context);
        a(new XiaomiOAuthorize().setAppId(Long.parseLong("2882303761517518920")).setRedirectUrl(a).setScope(Arrays.copyOf(new int[4], 0)).setKeepCookies(true).setNoMiui(false).setSkipConfirm(false).startGetAccessToken((Activity) context));
    }
}
