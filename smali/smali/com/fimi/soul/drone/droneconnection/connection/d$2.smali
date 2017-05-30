.class Lcom/fimi/soul/drone/droneconnection/connection/d$2;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/drone/droneconnection/connection/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/drone/droneconnection/connection/d;


# direct methods
.method constructor <init>(Lcom/fimi/soul/drone/droneconnection/connection/d;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$2;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    const/4 v2, 0x1

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$2;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->f(Lcom/fimi/soul/drone/droneconnection/connection/d;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$2;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v1}, Lcom/fimi/soul/drone/droneconnection/connection/d;->e(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$2;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    iput-boolean v2, v0, Lcom/fimi/soul/drone/droneconnection/connection/d;->g:Z

    :cond_0
    return-void
.end method
