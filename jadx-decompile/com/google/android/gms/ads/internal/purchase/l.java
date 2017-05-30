package com.google.android.gms.ads.internal.purchase;

import android.text.TextUtils;
import android.util.Base64;
import com.baidu.android.common.security.RSAUtil;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.aaa;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;

@aaa
public class l {
    public static PublicKey a(String str) {
        try {
            return KeyFactory.getInstance(RSAUtil.ALGORITHM_RSA).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } catch (Throwable e2) {
            b.b("Invalid key specification.");
            throw new IllegalArgumentException(e2);
        }
    }

    public static boolean a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            return a(a(str), str2, str3);
        }
        b.b("Purchase verification failed: missing data.");
        return false;
    }

    public static boolean a(PublicKey publicKey, String str, String str2) {
        try {
            Signature instance = Signature.getInstance("SHA1withRSA");
            instance.initVerify(publicKey);
            instance.update(str.getBytes());
            if (instance.verify(Base64.decode(str2, 0))) {
                return true;
            }
            b.b("Signature verification failed.");
            return false;
        } catch (NoSuchAlgorithmException e) {
            b.b("NoSuchAlgorithmException.");
            return false;
        } catch (InvalidKeyException e2) {
            b.b("Invalid key specification.");
            return false;
        } catch (SignatureException e3) {
            b.b("Signature exception.");
            return false;
        }
    }
}
