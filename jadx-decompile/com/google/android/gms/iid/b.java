package com.google.android.gms.iid;

import com.baidu.android.common.security.RSAUtil;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class b {
    public static KeyPair a() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance(RSAUtil.ALGORITHM_RSA);
            instance.initialize(2048);
            return instance.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
