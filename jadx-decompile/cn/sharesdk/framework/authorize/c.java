package cn.sharesdk.framework.authorize;

import android.content.Intent;

public class c extends a {
    protected SSOListener b;
    private d c;

    public void a(SSOListener sSOListener) {
        this.b = sSOListener;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.c.a(i, i2, intent);
    }

    public void onCreate() {
        this.c = this.a.getSSOProcessor(this);
        if (this.c == null) {
            finish();
            AuthorizeListener authorizeListener = this.a.getAuthorizeListener();
            if (authorizeListener != null) {
                authorizeListener.onError(new Throwable("Failed to start SSO for " + this.a.getPlatform().getName()));
                return;
            }
            return;
        }
        this.c.a(32973);
        this.c.a();
    }

    public void onNewIntent(Intent intent) {
        this.c.a(intent);
    }
}
