package com.xiaomi.account;

import android.os.Bundle;
import android.os.IInterface;

public interface IXiaomiAuthResponse extends IInterface {
    void onCancel();

    void onResult(Bundle bundle);
}
