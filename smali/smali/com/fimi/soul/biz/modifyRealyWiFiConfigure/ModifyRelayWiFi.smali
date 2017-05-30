.class public Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi$CreatemidifyRelayWiFi;
    }
.end annotation


# instance fields
.field private volatile password:Ljava/lang/String;

.field private volatile ssid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;->password:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200(Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;->ssid:Ljava/lang/String;

    return-object v0
.end method

.method public static getInstance()Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;
    .locals 1

    # getter for: Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi$CreatemidifyRelayWiFi;->MMIDIFY_RELAY_WI_FI:Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;
    invoke-static {}, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi$CreatemidifyRelayWiFi;->access$000()Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getPassword()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;->password:Ljava/lang/String;

    return-object v0
.end method

.method public getSsid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;->ssid:Ljava/lang/String;

    return-object v0
.end method

.method public sendModifyCongigure()V
    .locals 1

    new-instance v0, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi$1;-><init>(Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;)V

    invoke-static {v0}, Lcom/fimi/kernel/utils/x;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;->password:Ljava/lang/String;

    return-void
.end method

.method public setSsid(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;->ssid:Ljava/lang/String;

    return-void
.end method
