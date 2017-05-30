package com.xiaomi.market.sdk;

class w {
    String bi;
    int bj;
    int bk;
    String bl;
    String bm;
    long bn;
    String bo = "";
    String bp = "";
    long bq;
    String updateLog;
    int versionCode;
    String versionName;

    w() {
    }

    public String toString() {
        return "UpdateInfo:\nhost = " + this.bi + "\nfitness = " + this.bk + "\nupdateLog = " + this.updateLog + "\nversionCode = " + this.versionCode + "\nversionName = " + this.versionName + "\napkUrl = " + this.bl + "\napkHash = " + this.bm + "\napkSize = " + this.bn + "\ndiffUrl = " + this.bo + "\ndiffHash = " + this.bp + "\ndiffSize = " + this.bq;
    }
}
