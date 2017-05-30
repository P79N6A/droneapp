package com.xiaomi.account.openauth;

import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.xiaomi.account.IXiaomiAuthResponse;
import com.xiaomi.account.IXiaomiAuthResponse$Stub;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

class XiaomiOAuthorize$XiaomiTokenFuture extends FutureTask<Bundle> {
    private final Activity mActivity;
    private final Class<? extends AuthorizeActivityBase> mAuthorizeActivityClazz;
    private final XiaomiOAuthFutureImpl<XiaomiOAuthResults> mRealFuture;

    public XiaomiOAuthorize$XiaomiTokenFuture(Activity activity, XiaomiOAuthFutureImpl<XiaomiOAuthResults> xiaomiOAuthFutureImpl, Class<? extends AuthorizeActivityBase> cls) {
        super(new Callable<Bundle>() {
            public Bundle call() {
                throw new IllegalStateException("this should never be called");
            }
        });
        this.mActivity = activity;
        this.mRealFuture = xiaomiOAuthFutureImpl;
        this.mAuthorizeActivityClazz = cls;
    }

    private IXiaomiAuthResponse wrapWithinResponse() {
        return new IXiaomiAuthResponse$Stub() {
            public void onCancel() {
                XiaomiOAuthorize$XiaomiTokenFuture.this.setException(new OperationCanceledException());
            }

            public void onResult(Bundle bundle) {
                XiaomiOAuthorize$XiaomiTokenFuture.this.set(bundle);
            }
        };
    }

    public Bundle get() {
        throw new IllegalStateException("this should never be called");
    }

    public Bundle get(long j, TimeUnit timeUnit) {
        throw new IllegalStateException("this should never be called");
    }

    public boolean handleIntentResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        extras.setClassLoader(getClass().getClassLoader());
        if (!extras.containsKey(XiaomiOAuthConstants.EXTRA_RESPONSE)) {
            intent = AuthorizeActivityBase.asMiddleActivity(this.mActivity, intent, wrapWithinResponse(), this.mAuthorizeActivityClazz);
        }
        this.mActivity.startActivity(intent);
        return true;
    }

    public void set(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("extra_intent")) {
            this.mRealFuture.set(XiaomiOAuthResults.parseBundle(bundle));
            return;
        }
        handleIntentResult((Intent) bundle.getParcelable("extra_intent"));
    }

    protected void setException(Throwable th) {
        this.mRealFuture.setException(th);
    }
}
