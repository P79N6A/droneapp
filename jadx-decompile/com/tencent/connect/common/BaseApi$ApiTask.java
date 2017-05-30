package com.tencent.connect.common;

import com.tencent.tauth.IUiListener;

public class BaseApi$ApiTask {
    public IUiListener mListener;
    public int mRequestCode;
    final /* synthetic */ BaseApi this$0;

    public BaseApi$ApiTask(BaseApi baseApi, int i, IUiListener iUiListener) {
        this.this$0 = baseApi;
        this.mRequestCode = i;
        this.mListener = iUiListener;
    }
}
