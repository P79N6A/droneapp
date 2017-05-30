.class Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity$1;
.super Ljava/lang/Thread;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity$1;->a:Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    const-string v0, "192.168.100.1"

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity$1;->a:Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;

    invoke-static {v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->a(Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity$1;->a:Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;

    invoke-static {v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->a(Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0
.end method
