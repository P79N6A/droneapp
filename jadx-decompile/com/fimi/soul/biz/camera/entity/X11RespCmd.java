package com.fimi.soul.biz.camera.entity;

import com.fimi.soul.biz.camera.e;
import java.io.Serializable;
import java.util.Arrays;

public class X11RespCmd<T> implements Serializable {
    private String api_ver;
    private String app_type;
    private String brand;
    private String chip;
    private String duration;
    private String fw_ver;
    private String http;
    private Object listing;
    private String logo;
    private String md5sum;
    private String model;
    private int msg_id;
    private NotificationType notificationType = NotificationType.None;
    private String[] options;
    private T param;
    private String permission;
    private String pwd;
    private String readonly;
    private int rval;
    private String settable;
    private long size;
    private String thumb_file;
    private String type;

    public enum NotificationType {
        None,
        DisconnectHDMI,
        DisconnectShutDown,
        StartingVideoRecord,
        VideoRecordComplete,
        PhotoTaken,
        ContinueCaputureStarted,
        ContinueCaptureStoped,
        ContiuneBurstStated,
        ContiuneBurstCompleted,
        LowBatteryWarning,
        LowStorageWarning,
        TimeLapseVideoStatus,
        TimeLapsePhotoStatus,
        CameraConnectToPc,
        LogUpdated,
        PowerModeChange,
        VFStarted,
        VFStoped,
        AutoFileDelete,
        StorageRunOut,
        StorageIOError,
        LowSpeedCard,
        MuxerIndexLimit,
        MuxerFileSizeLimit,
        CardRemoved,
        CannotIssuePIV,
        CardInsert,
        CARD_FILE_SYS_ERROR,
        CARD_PARAM_ERR,
        CARD_NO_PROPOSE,
        CARD_NO_PROPOSE_AND_PARAM_ERR,
        CARD_WRITE_LOW,
        CARD_WRITE_LOW_AND_PARAM_ERR,
        CARD_SETROOT_ERROR,
        PutFileComplete,
        FmLsEnd,
        PhotoFinish
    }

    public String getApi_ver() {
        return this.api_ver;
    }

    public String getApp_type() {
        return this.app_type;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getChip() {
        return this.chip;
    }

    public String getDuration() {
        return this.duration;
    }

    public String getErrorMsg() {
        switch (this.rval) {
            case e.bx /*-26*/:
                return "ERROR_INVALID_PATH";
            case -25:
                return "ERROR_INVALID_PARAM";
            case -24:
                return "ERROR_INVALID_TYPE";
            case e.bu /*-23*/:
                return "ERROR_OPERATION_UNSUPPORTED";
            case e.bt /*-22*/:
                return "ERROR_APP_NOT_READY";
            case e.bs /*-21*/:
                return "ERROR_SYSTEM_BUSY";
            case e.br /*-20*/:
                return "ERROR_PIV_NOT_ALLOWED";
            case e.bq /*-19*/:
                return "ERROR_NO_MORE_MEMORY";
            case e.bp /*-18*/:
                return "ERROR_CARD_PROTECTED";
            case e.bo /*-17*/:
                return "ERROR_NO_MORE_SPACE";
            case e.bn /*-16*/:
                return "ERROR_HDMI_INSERTED";
            case -14:
                return "ERROR_INVALID_OPERATION";
            case -13:
                return "ERROR_INVALID_OPTION_VALUE";
            case -9:
                return "ERROR_JSON_SYNTAX_ERROR";
            case -8:
                return "ERROR_JSON_PACKAGE_TIMEOUT";
            case -7:
                return "ERROR_JSON_PACKAGE_ERROR";
            case -5:
                return "ERROR_REACH_MAX_CLNT";
            case -4:
                return "ERROR_INVALID_TOKEN";
            case -3:
                return "ERROR_SESSION_START_FAIL";
            case -1:
                return "ERROR_UNKNOWN_ERROR";
            default:
                return "";
        }
    }

    public String getFw_ver() {
        return this.fw_ver;
    }

    public String getHttp() {
        return this.http;
    }

    public Object getListing() {
        return this.listing;
    }

    public String getLogo() {
        return this.logo;
    }

    public String getMd5sum() {
        return this.md5sum;
    }

    public String getModel() {
        return this.model;
    }

    public int getMsg_id() {
        return this.msg_id;
    }

    public NotificationType getNotificationType() {
        return this.notificationType;
    }

    public String[] getOptions() {
        return this.options;
    }

    public T getParam() {
        return this.param;
    }

    public String getPermission() {
        return this.permission;
    }

    public String getPwd() {
        return this.pwd;
    }

    public String getReadonly() {
        return this.readonly;
    }

    public int getRval() {
        return this.rval;
    }

    public String getSettable() {
        return this.settable;
    }

    public long getSize() {
        return this.size;
    }

    public String getThumb_file() {
        return this.thumb_file;
    }

    public String getType() {
        return this.type;
    }

    public boolean isNotification() {
        return this.msg_id == 7;
    }

    public void setApi_ver(String str) {
        this.api_ver = str;
    }

    public void setApp_type(String str) {
        this.app_type = str;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setChip(String str) {
        this.chip = str;
    }

    public void setDuration(String str) {
        this.duration = str;
    }

    public void setFw_ver(String str) {
        this.fw_ver = str;
    }

    public void setHttp(String str) {
        this.http = str;
    }

    public void setListing(Object obj) {
        this.listing = obj;
    }

    public void setLogo(String str) {
        this.logo = str;
    }

    public void setMd5sum(String str) {
        this.md5sum = str;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setMsg_id(int i) {
        this.msg_id = i;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public void setOptions(String[] strArr) {
        this.options = strArr;
    }

    public void setParam(T t) {
        this.param = t;
    }

    public void setPermission(String str) {
        this.permission = str;
    }

    public void setPwd(String str) {
        this.pwd = str;
    }

    public void setReadonly(String str) {
        this.readonly = str;
    }

    public void setRval(int i) {
        this.rval = i;
    }

    public void setSettable(String str) {
        this.settable = str;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setThumb_file(String str) {
        this.thumb_file = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "X11RespCmd{rval=" + this.rval + ", msg_id=" + this.msg_id + ", type='" + this.type + '\'' + ", param=" + this.param + ", settable='" + this.settable + '\'' + ", readonly='" + this.readonly + '\'' + ", listing=" + this.listing + ", pwd='" + this.pwd + '\'' + ", notificationType=" + this.notificationType + ", options=" + Arrays.toString(this.options) + ", permission='" + this.permission + '\'' + ", brand='" + this.brand + '\'' + ", model='" + this.model + '\'' + ", api_ver='" + this.api_ver + '\'' + ", fw_ver='" + this.fw_ver + '\'' + ", app_type='" + this.app_type + '\'' + ", logo='" + this.logo + '\'' + ", chip='" + this.chip + '\'' + ", http='" + this.http + '\'' + ", thumb_file='" + this.thumb_file + '\'' + ", size=" + this.size + ", duration=" + this.duration + ", md5sum='" + this.md5sum + '\'' + '}';
    }
}
