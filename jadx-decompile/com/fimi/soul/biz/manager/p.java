package com.fimi.soul.biz.manager;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import cn.sharesdk.facebook.Facebook;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.Platform.ShareParams;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.twitter.Twitter;
import cn.sharesdk.wechat.friends.Wechat;
import cn.sharesdk.wechat.moments.WechatMoments;
import com.fimi.kernel.c;
import com.fimi.overseas.soul.R;
import com.fimi.soul.entity.ShareInfo;
import com.fimi.soul.module.a.d;
import com.fimi.soul.utils.ao;
import com.fimi.soul.utils.e;
import com.fimi.soul.utils.j;
import com.tencent.mm.sdk.plugin.MMPluginProviderConstants.PluginIntent;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

public class p {
    public static int a = 0;
    public static int b = 1;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public IUiListener f = new IUiListener(this) {
        final /* synthetic */ p a;

        {
            this.a = r1;
        }

        public void onCancel() {
        }

        public void onComplete(Object obj) {
            Toast.makeText(this.a.g, "Complete", 1).show();
        }

        public void onError(UiError uiError) {
            Toast.makeText(this.a.g, "Error", 1).show();
        }
    };
    private Context g;
    private ShareInfo h;
    private b i;
    private final String j = "tempImage.png";
    private Handler k = new Handler(this) {
        final /* synthetic */ p a;

        {
            this.a = r1;
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Toast.makeText(this.a.g, R.string.share_success, 1).show();
                    break;
                case 3:
                    Toast.makeText(this.a.g, R.string.share_fail, 1).show();
                    break;
            }
            super.handleMessage(message);
        }
    };

    class a extends AlertDialog {
        ImageView a;
        ImageView b;
        ImageView c;
        Button d;
        final /* synthetic */ p e;
        private Context f;
        private ShareInfo g;
        private boolean h;
        private boolean i;

        public a(p pVar, Context context, ShareInfo shareInfo) {
            this.e = pVar;
            super(context);
            this.f = context;
            this.g = shareInfo;
        }

        protected void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(R.layout.dialog_share);
            findViewById(R.id.iv_facebook_share).setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    this.a.e.a(this.a.f, Facebook.NAME, true, this.a.g);
                    this.a.dismiss();
                }
            });
            findViewById(R.id.iv_twitter_share).setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    this.a.e.a(this.a.f, Twitter.NAME, true, this.a.g);
                    this.a.dismiss();
                }
            });
            TextView textView = (TextView) findViewById(R.id.share_tv);
            this.a = (ImageView) findViewById(R.id.wechat_iv);
            this.a.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    this.a.e.a(this.a.f, Wechat.NAME, true, this.a.g);
                    this.a.dismiss();
                }
            });
            this.b = (ImageView) findViewById(R.id.wechat_friend_iv);
            this.b.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    this.a.e.a(this.a.f, WechatMoments.NAME, true, this.a.g);
                    this.a.dismiss();
                }
            });
            this.d = (Button) findViewById(R.id.cancle_btn);
            this.d.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    this.a.dismiss();
                }
            });
            ao.a(c.a().getResources().getAssets(), (ViewGroup) getWindow().getDecorView());
        }

        protected void onStart() {
            super.onStart();
            if (ao.d(this.f, PluginIntent.APP_PACKAGE_PATTERN)) {
                this.h = true;
                this.a.setAlpha(1.0f);
                this.b.setAlpha(1.0f);
                return;
            }
            this.h = false;
            this.a.setAlpha(0.3f);
            this.b.setAlpha(0.3f);
        }
    }

    public interface b {
        void a(int i);
    }

    public p(Context context) {
        this.g = context;
    }

    private boolean a(String str) {
        return str.contains("http://");
    }

    public void a(Context context, String str, boolean z, ShareInfo shareInfo) {
        ShareSDK.initSDK(this.g);
        com.fimi.soul.module.a.b bVar = new com.fimi.soul.module.a.b();
        bVar.a(!z);
        if (str != null) {
            bVar.n(str);
        }
        bVar.a(d.CLASSIC);
        bVar.e();
        bVar.d();
        bVar.b(shareInfo.getTitle());
        if (a(shareInfo.getUrl())) {
            bVar.f(shareInfo.getUrl());
        } else if (Twitter.NAME == str) {
            try {
                e.a(e.a(shareInfo.getUrl(), 480, 600), new File(j.a(), "tempImage.png"));
                bVar.e(j.a() + "/" + "tempImage.png");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            bVar.e(shareInfo.getUrl());
        }
        bVar.a(new PlatformActionListener(this) {
            final /* synthetic */ p a;

            {
                this.a = r1;
            }

            public void onCancel(Platform platform, int i) {
                if (platform.getName() == Twitter.NAME) {
                    e.f(j.a() + "/" + "tempImage.png");
                }
                this.a.k.sendEmptyMessage(2);
            }

            public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
                if (platform.getName() == Twitter.NAME) {
                    e.f(j.a() + "/" + "tempImage.png");
                }
                this.a.k.sendEmptyMessage(1);
            }

            public void onError(Platform platform, int i, Throwable th) {
                if (platform.getName() == Twitter.NAME) {
                    e.f(j.a() + "/" + "tempImage.png");
                }
                this.a.k.sendEmptyMessage(3);
            }
        });
        bVar.a(BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_launcher), "Mi Drone", new OnClickListener(this) {
            final /* synthetic */ p a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
            }
        });
        bVar.a(context);
    }

    public void a(b bVar) {
        this.i = bVar;
    }

    public void a(ShareInfo shareInfo) {
        this.h = shareInfo;
        new a(this, this.g, shareInfo).show();
    }

    public void a(ShareInfo shareInfo, String str) {
        ShareParams shareParams = new ShareParams();
        shareParams.setImagePath(shareInfo.getUrl());
        shareParams.setShareType(2);
        Platform platform = ShareSDK.getPlatform(str);
        platform.setPlatformActionListener(new PlatformActionListener(this) {
            final /* synthetic */ p a;

            {
                this.a = r1;
            }

            public void onCancel(Platform platform, int i) {
                this.a.k.sendEmptyMessage(2);
            }

            public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
                this.a.k.sendEmptyMessage(1);
            }

            public void onError(Platform platform, int i, Throwable th) {
                this.a.k.sendEmptyMessage(3);
            }
        });
        platform.share(shareParams);
    }
}
