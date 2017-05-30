.class Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;->sendModifyCongigure()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;


# direct methods
.method constructor <init>(Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi$1;->this$0:Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    new-instance v0, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/CommadBean;

    invoke-direct {v0}, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/CommadBean;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/CommadBean;->setType(Ljava/lang/String;)V

    const-string v1, "fwdap"

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/CommadBean;->setData(Ljava/lang/String;)V

    const-string v1, "modify"

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/CommadBean;->setName(Ljava/lang/String;)V

    new-instance v1, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/Fwap;

    invoke-direct {v1}, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/Fwap;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi$1;->this$0:Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;

    # getter for: Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;->password:Ljava/lang/String;
    invoke-static {v2}, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;->access$100(Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/Fwap;->setKey(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi$1;->this$0:Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;

    # getter for: Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;->ssid:Ljava/lang/String;
    invoke-static {v2}, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;->access$200(Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/Fwap;->setSsid(Ljava/lang/String;)V

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/biz/e/d;->o()Lcom/fimi/kernel/b/d/c;

    move-result-object v2

    new-instance v3, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ChangeWifiPAs;

    invoke-direct {v3}, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ChangeWifiPAs;-><init>()V

    invoke-virtual {v3, v0}, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ChangeWifiPAs;->setmCommadBean(Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/CommadBean;)V

    invoke-virtual {v3, v1}, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ChangeWifiPAs;->setmFwap(Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/Fwap;)V

    invoke-static {v3}, Lcom/fimi/soul/utils/ad;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/fimi/kernel/b/d/c;->a([B)V

    return-void
.end method
