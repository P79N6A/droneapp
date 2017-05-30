package org.a.a.i.a;

import org.a.a.a.c;
import org.a.a.e;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.InvalidCredentialsException;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.auth.NTCredentials;
import org.apache.http.impl.auth.NTLMEngine;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;

@c
public class j extends a {
    private final NTLMEngine a;
    private a b;
    private String c;

    enum a {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        MSG_TYPE1_GENERATED,
        MSG_TYPE2_RECEVIED,
        MSG_TYPE3_GENERATED,
        FAILED
    }

    public j() {
        this(new h());
    }

    public j(NTLMEngine nTLMEngine) {
        org.a.a.o.a.a((Object) nTLMEngine, "NTLM engine");
        this.a = nTLMEngine;
        this.b = a.UNINITIATED;
        this.c = null;
    }

    protected void a(CharArrayBuffer charArrayBuffer, int i, int i2) {
        this.c = charArrayBuffer.substringTrimmed(i, i2);
        if (this.c.length() == 0) {
            if (this.b == a.UNINITIATED) {
                this.b = a.CHALLENGE_RECEIVED;
            } else {
                this.b = a.FAILED;
            }
        } else if (this.b.compareTo(a.MSG_TYPE1_GENERATED) < 0) {
            this.b = a.FAILED;
            throw new MalformedChallengeException("Out of sequence NTLM response message");
        } else if (this.b == a.MSG_TYPE1_GENERATED) {
            this.b = a.MSG_TYPE2_RECEVIED;
        }
    }

    public Header authenticate(Credentials credentials, HttpRequest httpRequest) {
        try {
            NTCredentials nTCredentials = (NTCredentials) credentials;
            if (this.b == a.FAILED) {
                throw new AuthenticationException("NTLM authentication failed");
            }
            String generateType1Msg;
            if (this.b == a.CHALLENGE_RECEIVED) {
                generateType1Msg = this.a.generateType1Msg(nTCredentials.getDomain(), nTCredentials.getWorkstation());
                this.b = a.MSG_TYPE1_GENERATED;
            } else if (this.b == a.MSG_TYPE2_RECEVIED) {
                generateType1Msg = this.a.generateType3Msg(nTCredentials.getUserName(), nTCredentials.getPassword(), nTCredentials.getDomain(), nTCredentials.getWorkstation(), this.c);
                this.b = a.MSG_TYPE3_GENERATED;
            } else {
                throw new AuthenticationException("Unexpected state: " + this.b);
            }
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
            if (a()) {
                charArrayBuffer.append(e.N);
            } else {
                charArrayBuffer.append("Authorization");
            }
            charArrayBuffer.append(": NTLM ");
            charArrayBuffer.append(generateType1Msg);
            return new BufferedHeader(charArrayBuffer);
        } catch (ClassCastException e) {
            throw new InvalidCredentialsException("Credentials cannot be used for NTLM authentication: " + credentials.getClass().getName());
        }
    }

    public String getParameter(String str) {
        return null;
    }

    public String getRealm() {
        return null;
    }

    public String getSchemeName() {
        return "ntlm";
    }

    public boolean isComplete() {
        return this.b == a.MSG_TYPE3_GENERATED || this.b == a.FAILED;
    }

    public boolean isConnectionBased() {
        return true;
    }
}
