.class Lcom/fimi/soul/drone/droneconnection/connection/service/a$1$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/drone/droneconnection/connection/service/a$1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/drone/droneconnection/connection/service/a$1;


# direct methods
.method constructor <init>(Lcom/fimi/soul/drone/droneconnection/connection/service/a$1;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/droneconnection/connection/service/a$1$2;->a:Lcom/fimi/soul/drone/droneconnection/connection/service/a$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/service/a$1$2;->a:Lcom/fimi/soul/drone/droneconnection/connection/service/a$1;

    iget-object v0, v0, Lcom/fimi/soul/drone/droneconnection/connection/service/a$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/service/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/service/a;->a(Lcom/fimi/soul/drone/droneconnection/connection/service/a;Z)Z

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/service/a$1$2;->a:Lcom/fimi/soul/drone/droneconnection/connection/service/a$1;

    iget-object v0, v0, Lcom/fimi/soul/drone/droneconnection/connection/service/a$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/service/a;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/service/a;->a(Lcom/fimi/soul/drone/droneconnection/connection/service/a;)Lcom/fimi/soul/drone/droneconnection/connection/f$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$b;->f()V

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/service/a$1$2;->a:Lcom/fimi/soul/drone/droneconnection/connection/service/a$1;

    iget-object v0, v0, Lcom/fimi/soul/drone/droneconnection/connection/service/a$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/service/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/droneconnection/connection/service/a;->g()V

    return-void
.end method
