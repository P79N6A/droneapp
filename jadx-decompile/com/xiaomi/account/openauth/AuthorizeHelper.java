package com.xiaomi.account.openauth;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.Util;
import com.xiaomi.account.openauth.utils.Base64Coder;
import java.io.File;
import java.net.URLEncoder;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

public class AuthorizeHelper {
    private static final String HMAC_SHA1 = "HmacSHA1";
    public static final String OAUTH2_HOST = (USE_PREVIEW ? "http://account.preview.n.xiaomi.net" : "https://account.xiaomi.com");
    public static final boolean USE_PREVIEW = new File("/data/system/oauth_staging_preview").exists();
    private static final String UTF8 = "UTF-8";
    private static Random random = new Random();

    protected static HashMap<String, String> buildMacRequestHead(String str, String str2, String str3) {
        String format = String.format("MAC access_token=\"%s\", nonce=\"%s\",mac=\"%s\"", new Object[]{URLEncoder.encode(str, "UTF-8"), URLEncoder.encode(str2, "UTF-8"), URLEncoder.encode(str3, "UTF-8")});
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("Authorization", format);
        return hashMap;
    }

    protected static String encodeSign(byte[] bArr) {
        return new String(Base64Coder.encode(bArr));
    }

    protected static byte[] encryptHMACSha1(byte[] bArr, byte[] bArr2) {
        Key secretKeySpec = new SecretKeySpec(bArr2, "HmacSHA1");
        Mac instance = Mac.getInstance("HmacSHA1");
        instance.init(secretKeySpec);
        instance.update(bArr);
        return instance.doFinal();
    }

    protected static String generateNonce() {
        return random.nextLong() + ":" + ((int) (System.currentTimeMillis() / Util.MILLSECONDS_OF_MINUTE));
    }

    protected static String generateUrl(String str, List<NameValuePair> list) {
        if (list == null || list.size() <= 0) {
            return str;
        }
        Builder buildUpon = Uri.parse(str).buildUpon();
        for (NameValuePair nameValuePair : list) {
            buildUpon.appendQueryParameter(nameValuePair.getName(), nameValuePair.getValue());
        }
        return buildUpon.build().toString();
    }

    protected static String getMacAccessTokenSignatureString(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if ("HmacSHA1".equalsIgnoreCase(str7)) {
            StringBuilder stringBuilder = new StringBuilder("");
            stringBuilder.append(str + "\n");
            stringBuilder.append(str2.toUpperCase() + "\n");
            stringBuilder.append(str3 + "\n");
            stringBuilder.append(str4 + "\n");
            if (!TextUtils.isEmpty(str5)) {
                StringBuffer stringBuffer = new StringBuffer();
                List arrayList = new ArrayList();
                URLEncodedUtils.parse(arrayList, new Scanner(str5), "UTF-8");
                Collections.sort(arrayList, new Comparator<NameValuePair>() {
                    public int compare(NameValuePair nameValuePair, NameValuePair nameValuePair2) {
                        return nameValuePair.getName().compareTo(nameValuePair2.getName());
                    }
                });
                stringBuffer.append(URLEncodedUtils.format(arrayList, "UTF-8"));
                stringBuilder.append(stringBuffer.toString() + "\n");
            }
            return encodeSign(encryptHMACSha1(stringBuilder.toString().getBytes("UTF-8"), str6.getBytes("UTF-8")));
        }
        throw new NoSuchAlgorithmException("error mac algorithm : " + str7);
    }
}
