package com.baidu.tts.f;

import com.facebook.common.util.UriUtil;
import com.fimi.soul.entity.User;
import com.tencent.connect.common.Constants;
import com.tencent.mm.sdk.plugin.MMPluginProviderConstants.OAuth;
import com.tencent.open.GameAppOperation;
import com.tencent.stat.DeviceInfo;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.market.sdk.j;

public enum g {
    STATE(null, XiaomiOAuthConstants.EXTRA_STATE_2, null),
    CODE(null, XiaomiOAuthConstants.EXTRA_CODE_2, null),
    DATA(null, UriUtil.DATA_SCHEME, null),
    IVERSION(null, "iversion", null),
    URL(null, "url", null),
    MD5(null, "md5", null),
    LENGTH(null, "length", null),
    ABS_PATH(null, "absPath", null),
    ID(null, "id", null),
    GENDER(null, "gender", null),
    DOMAIN(null, "domain", null),
    QUALITY(null, "quality", null),
    DATA_COUNT(null, "data_count", null),
    DATA_LIST(null, "data_list", null),
    NAME(null, User.FN_NAME, null),
    VERSION_MIN(null, "version_min", null),
    VERSION_MAX(null, "version_max", null),
    TEXT_DATA_ID(null, "text_data_id", null),
    SPEECH_DATA_ID(null, "speech_data_id", null),
    FUNCTION("func", "function", ""),
    ERROR_NUMBER("err_no", "errorNumber", ""),
    ERROR_MESSAGE("err_msg", "errorMessage", ""),
    MIX_MODE(null, "mixMode", null),
    NOTIFICATION_COUNT_PER_SECOND("ncps", "notificationCountPerSecond", ""),
    PERCENT("pct", "percent", ""),
    APP_CODE("ac", "appCode", ""),
    PACKAGE_NAME("pn", j.W, GameAppOperation.QQFAV_DATALINE_APPNAME),
    PLATFORM("", Constants.PARAM_PLATFORM, ""),
    SPEED("spd", "speed", ""),
    VOLUME("vol", MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, ""),
    PITCH("pit", "pitch", ""),
    LANGUAGE("lan", "language", ""),
    TEXT_ENCODE("cod", "textEncode", ""),
    STREAM_TYPE("st", "streamType", ""),
    AUDIO_ENCODE("aue", "audioEncode", ""),
    BITRATE("rate", "audioRate", ""),
    SPEAKER("per", "speaker", ""),
    STYLE("sty", "style", ""),
    BACKGROUND("bcg", "background", ""),
    PRODUCT_ID("pdt", "productId", ""),
    TEXT_DAT_PATH("tdp", "textDatPath", ""),
    SPEECH_DAT_PATH("sdp", "speechDatPath", ""),
    TTS_LICENSE_FILE_PATH("tlfp", "ttsLicenseFilePath", ""),
    CUSTOM_SYNTH("cs", "custom_synth", ""),
    OPEN_XML("xml", "open_xml", ""),
    TTS_VOCODER_OPTIMIZATION("tvo", "ttsVocoderOptimzation", ""),
    SAMPLE_RATE("sr", "sampleRate", ""),
    SERIAL_NUMBER("sn", "serialNumber", ""),
    INDEX("idx", "index", ""),
    TEXT("tex", "text", ""),
    CTP("ctp", "clientPath", ""),
    CUID("cuid", j.as, "wise_cuid"),
    VERSION(DeviceInfo.TAG_VERSION, "version", "sdk_version"),
    NUMBER("num", "number", ""),
    ENGINE("en", "engine", ""),
    TERRITORY("ter", "territory", ""),
    PUNCTUATION("puc", "punctuation", ""),
    CONTEXT("ctx", "context", ""),
    API_KEY("", OAuth.API_KEY, ""),
    SECRET_KEY("", "secretKey", ""),
    TOKEN("tok", com.xiaomi.mipush.sdk.Constants.EXTRA_KEY_TOKEN, "");
    
    private final String aj;
    private final String ak;
    private final String al;

    private g(String str, String str2, String str3) {
        this.aj = str;
        this.ak = str2;
        this.al = str3;
    }

    public static String a(g gVar) {
        return gVar == null ? null : gVar.name();
    }

    public String a() {
        return this.aj;
    }

    public String b() {
        return this.ak;
    }
}
