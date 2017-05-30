.class public Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ChangeWifiPAs;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private command:Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/CommadBean;

.field private fwdap:Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/Fwap;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getmCommadBean()Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/CommadBean;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ChangeWifiPAs;->command:Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/CommadBean;

    return-object v0
.end method

.method public getmFwap()Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/Fwap;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ChangeWifiPAs;->fwdap:Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/Fwap;

    return-object v0
.end method

.method public setmCommadBean(Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/CommadBean;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ChangeWifiPAs;->command:Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/CommadBean;

    return-void
.end method

.method public setmFwap(Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/Fwap;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ChangeWifiPAs;->fwdap:Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/Fwap;

    return-void
.end method
