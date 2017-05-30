package com.fimi.soul.biz.update;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;
import android.util.Log;
import com.fimi.overseas.soul.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;

public class e extends AsyncTask<String, Void, Boolean> {
    Context a;
    String b;
    String c;

    public e(Context context, String str) {
        this.a = context;
        this.c = str;
    }

    private void a() {
        String packageName = this.a.getPackageName();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=" + packageName));
        this.a.startActivity(intent);
    }

    protected Boolean a(String... strArr) {
        BufferedReader bufferedReader;
        ClientProtocolException e;
        IOException e2;
        Throwable th;
        boolean z = true;
        HttpUriRequest httpPost = new HttpPost(strArr[0]);
        AndroidHttpClient newInstance = AndroidHttpClient.newInstance(SystemMediaRouteProvider.PACKAGE_NAME);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(newInstance.execute(httpPost).getEntity().getContent()));
            try {
                String str = "";
                Pattern compile = Pattern.compile("\"softwareVersion\"\\W*([\\d\\.]+)");
                while (true) {
                    Object readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        Matcher matcher = compile.matcher(readLine);
                        if (matcher.find()) {
                            Log.v("ids", "ver.:" + matcher.group(1));
                            this.b = matcher.group(1);
                        }
                        str = str + readLine;
                    } else {
                        try {
                            break;
                        } catch (ClientProtocolException e3) {
                            e = e3;
                            try {
                                e.printStackTrace();
                                Log.v("ids", "close reader");
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e22) {
                                        e22.printStackTrace();
                                    }
                                }
                                if (newInstance != null) {
                                    newInstance.close();
                                }
                                return Boolean.valueOf(z);
                            } catch (Throwable th2) {
                                th = th2;
                                Log.v("ids", "close reader");
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e222) {
                                        e222.printStackTrace();
                                        throw th;
                                    }
                                }
                                if (newInstance != null) {
                                    newInstance.close();
                                }
                                throw th;
                            }
                        } catch (IOException e4) {
                            e222 = e4;
                            e222.printStackTrace();
                            Log.v("ids", "close reader");
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e2222) {
                                    e2222.printStackTrace();
                                }
                            }
                            if (newInstance != null) {
                                newInstance.close();
                            }
                            return Boolean.valueOf(z);
                        }
                    }
                }
                Log.v("ids", str);
                Log.v("ids", "close reader");
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e22222) {
                        e22222.printStackTrace();
                    }
                }
                if (newInstance != null) {
                    newInstance.close();
                }
            } catch (ClientProtocolException e5) {
                e = e5;
                z = false;
                e.printStackTrace();
                Log.v("ids", "close reader");
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (newInstance != null) {
                    newInstance.close();
                }
                return Boolean.valueOf(z);
            } catch (IOException e6) {
                e22222 = e6;
                z = false;
                e22222.printStackTrace();
                Log.v("ids", "close reader");
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (newInstance != null) {
                    newInstance.close();
                }
                return Boolean.valueOf(z);
            }
        } catch (ClientProtocolException e52) {
            bufferedReader = null;
            e = e52;
            z = false;
            e.printStackTrace();
            Log.v("ids", "close reader");
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (newInstance != null) {
                newInstance.close();
            }
            return Boolean.valueOf(z);
        } catch (IOException e62) {
            bufferedReader = null;
            e22222 = e62;
            z = false;
            e22222.printStackTrace();
            Log.v("ids", "close reader");
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (newInstance != null) {
                newInstance.close();
            }
            return Boolean.valueOf(z);
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            Log.v("ids", "close reader");
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (newInstance != null) {
                newInstance.close();
            }
            throw th;
        }
        return Boolean.valueOf(z);
    }

    protected void a(Boolean bool) {
        super.onPostExecute(bool);
        if (bool.booleanValue()) {
            new Builder(this.a, R.style.MyDialog).setTitle("Update").setMessage("App have update,please update!").setOnCancelListener(new OnCancelListener(this) {
                final /* synthetic */ e a;

                {
                    this.a = r1;
                }

                public void onCancel(DialogInterface dialogInterface) {
                    dialogInterface.dismiss();
                }
            }).setNegativeButton("cancel", new OnClickListener(this) {
                final /* synthetic */ e a;

                {
                    this.a = r1;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).setPositiveButton("update", new OnClickListener(this) {
                final /* synthetic */ e a;

                {
                    this.a = r1;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    this.a.a();
                }
            }).create().show();
        }
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a((String[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((Boolean) obj);
    }
}
