.class Lcom/fimi/soul/module/login/LoginActivity$1;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/module/login/LoginActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/login/LoginActivity;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/login/LoginActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    const/4 v2, 0x1

    const/4 v4, 0x0

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->a(Lcom/fimi/soul/module/login/LoginActivity;)I

    move-result v0

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->b(Lcom/fimi/soul/module/login/LoginActivity;)I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-object v0, v0, Lcom/fimi/soul/module/login/LoginActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    const v2, 0x7f0a01b4

    invoke-virtual {v1, v2}, Lcom/fimi/soul/module/login/LoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    const v3, 0x7f0a042c

    invoke-virtual {v2, v3}, Lcom/fimi/soul/module/login/LoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/fimi/soul/module/login/LoginActivity;->a(Lcom/fimi/soul/module/login/LoginActivity;Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-object v0, v0, Lcom/fimi/soul/module/login/LoginActivity;->f:Lcom/fimi/soul/biz/i/a;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/i/a;->d()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-object v0, v0, Lcom/fimi/soul/module/login/LoginActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->c(Lcom/fimi/soul/module/login/LoginActivity;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0, v4}, Lcom/fimi/soul/module/login/LoginActivity;->a(Lcom/fimi/soul/module/login/LoginActivity;I)I

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-object v0, v0, Lcom/fimi/soul/module/login/LoginActivity;->dpa:Lcom/fimi/soul/base/DroidPlannerApp;

    invoke-virtual {v0}, Lcom/fimi/soul/base/DroidPlannerApp;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-object v0, v0, Lcom/fimi/soul/module/login/LoginActivity;->dpa:Lcom/fimi/soul/base/DroidPlannerApp;

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/base/DroidPlannerApp;->b(Landroid/app/Activity;)V

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    const-class v2, Lcom/fimi/soul/module/update/CheckFirmwareActvity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-virtual {v1, v0, v4}, Lcom/fimi/soul/module/login/LoginActivity;->startActivityForResult(Landroid/content/Intent;I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    const/high16 v1, 0x10a0000

    const v2, 0x10a0001

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/module/login/LoginActivity;->overridePendingTransition(II)V

    goto :goto_1

    :pswitch_2
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->e(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v1}, Lcom/fimi/soul/module/login/LoginActivity;->d(Lcom/fimi/soul/module/login/LoginActivity;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->a(Lcom/fimi/soul/module/login/LoginActivity;)I

    move-result v0

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->b(Lcom/fimi/soul/module/login/LoginActivity;)I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/fimi/soul/module/login/LoginActivity;->a(Lcom/fimi/soul/module/login/LoginActivity;I)I

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    const v2, 0x7f0a031e

    invoke-virtual {v1, v2}, Lcom/fimi/soul/module/login/LoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    const v3, 0x7f0a042d

    invoke-virtual {v2, v3}, Lcom/fimi/soul/module/login/LoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/fimi/soul/module/login/LoginActivity;->a(Lcom/fimi/soul/module/login/LoginActivity;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->f(Lcom/fimi/soul/module/login/LoginActivity;)V

    goto/16 :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0, v4}, Lcom/fimi/soul/module/login/LoginActivity;->a(Lcom/fimi/soul/module/login/LoginActivity;Z)Z

    goto/16 :goto_0

    :pswitch_4
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->a(Lcom/fimi/soul/module/login/LoginActivity;)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-object v0, v0, Lcom/fimi/soul/module/login/LoginActivity;->f:Lcom/fimi/soul/biz/i/a;

    invoke-virtual {v0, v4}, Lcom/fimi/soul/biz/i/a;->a(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->f(Lcom/fimi/soul/module/login/LoginActivity;)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    new-instance v1, Ljava/lang/Thread;

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v2}, Lcom/fimi/soul/module/login/LoginActivity;->g(Lcom/fimi/soul/module/login/LoginActivity;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v0, v1}, Lcom/fimi/soul/module/login/LoginActivity;->a(Lcom/fimi/soul/module/login/LoginActivity;Ljava/lang/Thread;)Ljava/lang/Thread;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->h(Lcom/fimi/soul/module/login/LoginActivity;)Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->i(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->e(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v1}, Lcom/fimi/soul/module/login/LoginActivity;->d(Lcom/fimi/soul/module/login/LoginActivity;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$1;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->e(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/os/Handler;

    move-result-object v0

    const-wide/32 v2, 0x88b8

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
