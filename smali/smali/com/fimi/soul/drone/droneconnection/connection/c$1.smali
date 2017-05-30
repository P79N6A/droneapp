.class Lcom/fimi/soul/drone/droneconnection/connection/c$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/drone/droneconnection/connection/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/drone/droneconnection/connection/c;


# direct methods
.method constructor <init>(Lcom/fimi/soul/drone/droneconnection/connection/c;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/droneconnection/connection/c$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/c$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/c;->a(Lcom/fimi/soul/drone/droneconnection/connection/c;Z)Z

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/c$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/c;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/c;->a(Lcom/fimi/soul/drone/droneconnection/connection/c;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, 0x190

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
