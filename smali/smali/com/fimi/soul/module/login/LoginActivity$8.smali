.class Lcom/fimi/soul/module/login/LoginActivity$8;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


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

    iput-object p1, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    const/4 v1, 0x1

    const/4 v4, 0x0

    move v3, v4

    move v2, v4

    move v0, v4

    move v5, v4

    :goto_0
    const/16 v6, 0x19

    if-ge v5, v6, :cond_8

    iget-object v3, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-object v3, v3, Lcom/fimi/soul/module/login/LoginActivity;->f:Lcom/fimi/soul/biz/i/a;

    invoke-virtual {v3}, Lcom/fimi/soul/biz/i/a;->c()Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v6, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-object v6, v6, Lcom/fimi/soul/module/login/LoginActivity;->f:Lcom/fimi/soul/biz/i/a;

    invoke-virtual {v6}, Lcom/fimi/soul/biz/i/a;->a()V

    iget-object v6, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-object v6, v6, Lcom/fimi/soul/module/login/LoginActivity;->e:Lcom/fimi/soul/biz/e/c;

    invoke-virtual {v6}, Lcom/fimi/soul/biz/e/c;->b()V

    iget-object v6, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    const/16 v7, 0x9c4

    invoke-static {v6, v7}, Lcom/fimi/soul/module/login/LoginActivity;->c(Lcom/fimi/soul/module/login/LoginActivity;I)V

    move v8, v2

    move v2, v0

    move v0, v8

    :goto_1
    add-int/lit8 v5, v5, 0x1

    move v8, v0

    move v0, v2

    move v2, v8

    goto :goto_0

    :cond_0
    if-nez v2, :cond_1

    invoke-static {}, Lcom/fimi/soul/drone/g/c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/fimi/soul/utils/ao;->d(Ljava/lang/String;)Z

    move-result v2

    :cond_1
    if-eqz v2, :cond_2

    iget-object v6, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-object v6, v6, Lcom/fimi/soul/module/login/LoginActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v6}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v6

    invoke-interface {v6}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v6

    if-nez v6, :cond_2

    iget-object v6, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v6}, Lcom/fimi/soul/module/login/LoginActivity;->u(Lcom/fimi/soul/module/login/LoginActivity;)V

    :cond_2
    iget-object v6, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    const/16 v7, 0x5dc

    invoke-static {v6, v7}, Lcom/fimi/soul/module/login/LoginActivity;->c(Lcom/fimi/soul/module/login/LoginActivity;I)V

    iget-object v6, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-object v6, v6, Lcom/fimi/soul/module/login/LoginActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v6}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v6

    invoke-interface {v6}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v6

    if-eqz v6, :cond_3

    if-nez v0, :cond_3

    sget-object v0, Lcom/fimi/soul/drone/d/o;->a:Lcom/fimi/soul/drone/c/a/a/z;

    iput-byte v4, v0, Lcom/fimi/soul/drone/c/a/a/z;->d:B

    sget-object v0, Lcom/fimi/soul/drone/d/o;->a:Lcom/fimi/soul/drone/c/a/a/z;

    const/4 v6, 0x2

    iput-byte v6, v0, Lcom/fimi/soul/drone/c/a/a/z;->e:B

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-object v0, v0, Lcom/fimi/soul/module/login/LoginActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    sget-object v6, Lcom/fimi/soul/drone/d/o;->a:Lcom/fimi/soul/drone/c/a/a/z;

    invoke-virtual {v6}, Lcom/fimi/soul/drone/c/a/a/z;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v6

    invoke-interface {v0, v6}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    move v0, v1

    :cond_3
    iget-object v6, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-object v6, v6, Lcom/fimi/soul/module/login/LoginActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v6}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v6

    invoke-interface {v6}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v6

    if-nez v6, :cond_4

    iget-object v6, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-object v6, v6, Lcom/fimi/soul/module/login/LoginActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v6}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v6

    if-eqz v6, :cond_7

    :cond_4
    if-eqz v3, :cond_7

    move v0, v3

    :goto_2
    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v2}, Lcom/fimi/soul/module/login/LoginActivity;->e(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v2}, Lcom/fimi/soul/module/login/LoginActivity;->e(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v2}, Lcom/fimi/soul/module/login/LoginActivity;->e(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/os/Handler;->removeMessages(I)V

    :cond_5
    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-object v2, v2, Lcom/fimi/soul/module/login/LoginActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v2

    invoke-interface {v2}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v2

    if-eqz v2, :cond_6

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->e(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v2}, Lcom/fimi/soul/module/login/LoginActivity;->d(Lcom/fimi/soul/module/login/LoginActivity;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->e(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :goto_3
    return-void

    :cond_6
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$8;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->e(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_3

    :cond_7
    move v8, v2

    move v2, v0

    move v0, v8

    goto/16 :goto_1

    :cond_8
    move v0, v3

    goto :goto_2
.end method
