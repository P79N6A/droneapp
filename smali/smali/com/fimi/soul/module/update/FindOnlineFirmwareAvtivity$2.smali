.class Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity$2;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;
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

    iput-object p1, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity$2;->a:Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    const/4 v2, 0x1

    const v1, -0x19000001

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity$2;->a:Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;

    invoke-static {v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->b(Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity$2;->a:Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;

    invoke-static {v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->c(Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity$2;->a:Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;

    invoke-static {v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->b(Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setClickable(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity$2;->a:Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;

    invoke-static {v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->c(Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setClickable(Z)V

    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity$2;->a:Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->b()V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity$2;->a:Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;

    const v1, 0x7f0a02a9

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
