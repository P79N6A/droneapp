.class Lcom/fimi/soul/module/update/DowningActivity$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/biz/update/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/update/DowningActivity;->a(Lcom/fimi/soul/entity/UpdateVersonBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/update/DowningActivity;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/update/DowningActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/update/DowningActivity$1;->a:Lcom/fimi/soul/module/update/DowningActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZJJI)V
    .locals 4

    const-wide/16 v2, 0x12c

    if-nez p1, :cond_0

    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    const/16 v1, 0x64

    iput v1, v0, Landroid/os/Message;->what:I

    long-to-int v1, p2

    iput v1, v0, Landroid/os/Message;->arg1:I

    long-to-int v1, p4

    iput v1, v0, Landroid/os/Message;->arg2:I

    iget-object v1, p0, Lcom/fimi/soul/module/update/DowningActivity$1;->a:Lcom/fimi/soul/module/update/DowningActivity;

    invoke-static {v1}, Lcom/fimi/soul/module/update/DowningActivity;->a(Lcom/fimi/soul/module/update/DowningActivity;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :goto_0
    return-void

    :cond_0
    const-wide/16 v0, -0x2

    cmp-long v0, p2, v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/update/DowningActivity$1;->a:Lcom/fimi/soul/module/update/DowningActivity;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/DowningActivity;->c()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/update/DowningActivity$1;->a:Lcom/fimi/soul/module/update/DowningActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/update/DowningActivity;->b(Lcom/fimi/soul/module/update/DowningActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/module/update/DowningActivity$1;->a:Lcom/fimi/soul/module/update/DowningActivity;

    invoke-static {v1}, Lcom/fimi/soul/module/update/DowningActivity;->c(Lcom/fimi/soul/module/update/DowningActivity;)I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/update/DowningActivity$1;->a:Lcom/fimi/soul/module/update/DowningActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/update/DowningActivity;->d(Lcom/fimi/soul/module/update/DowningActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/update/DowningActivity$1;->a:Lcom/fimi/soul/module/update/DowningActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/update/DowningActivity;->e(Lcom/fimi/soul/module/update/DowningActivity;)Lcom/fimi/soul/drone/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/update/DowningActivity$1;->a:Lcom/fimi/soul/module/update/DowningActivity;

    const v1, 0x7f0a01cc

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/DowningActivity$1;->a:Lcom/fimi/soul/module/update/DowningActivity;

    const-class v1, Lcom/fimi/soul/module/droneui/FlightActivity;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/update/DowningActivity;->a(Ljava/lang/Class;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/update/DowningActivity$1;->a:Lcom/fimi/soul/module/update/DowningActivity;

    const-class v1, Lcom/fimi/soul/module/update/FindNewFirmwareAvtivity;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/update/DowningActivity;->a(Ljava/lang/Class;)V

    goto :goto_0
.end method