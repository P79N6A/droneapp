package cn.sharesdk.wechat.utils;

import android.os.Bundle;
import cn.sharesdk.framework.utils.d;
import cn.sharesdk.wechat.utils.WXMediaMessage.IMediaObject;
import com.baidu.android.common.logging.Log;
import java.io.File;

public class WXFileObject implements IMediaObject {
    public byte[] fileData;
    public String filePath;

    public WXFileObject() {
        this.fileData = null;
        this.filePath = null;
    }

    public WXFileObject(String str) {
        this.filePath = str;
    }

    public WXFileObject(byte[] bArr) {
        this.fileData = bArr;
    }

    public boolean checkArgs() {
        if ((this.fileData == null || this.fileData.length == 0) && (this.filePath == null || this.filePath.length() == 0)) {
            d.a().d("checkArgs fail, both arguments is null", new Object[0]);
            return false;
        } else if (this.fileData != null && this.fileData.length > Log.FILE_LIMETE) {
            d.a().d("checkArgs fail, fileData is too large", new Object[0]);
            return false;
        } else if (this.filePath == null || new File(this.filePath).length() <= 10485760) {
            return true;
        } else {
            d.a().d("checkArgs fail, fileSize is too large", new Object[0]);
            return false;
        }
    }

    public void serialize(Bundle bundle) {
        bundle.putByteArray("_wxfileobject_fileData", this.fileData);
        bundle.putString("_wxfileobject_filePath", this.filePath);
    }

    public void setFileData(byte[] bArr) {
        this.fileData = bArr;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public int type() {
        return 6;
    }

    public void unserialize(Bundle bundle) {
        this.fileData = bundle.getByteArray("_wxfileobject_fileData");
        this.filePath = bundle.getString("_wxfileobject_filePath");
    }
}