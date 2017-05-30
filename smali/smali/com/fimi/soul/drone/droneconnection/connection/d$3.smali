.class Lcom/fimi/soul/drone/droneconnection/connection/d$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


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

    iput-object p1, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    const-wide/16 v4, 0x5dc

    const/4 v3, 0x0

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->d(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v0, v2, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->g(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->g(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/drone/droneconnection/connection/e;

    invoke-interface {v0, v3}, Lcom/fimi/soul/drone/droneconnection/connection/e;->a(Z)V

    invoke-interface {v0, v3}, Lcom/fimi/soul/drone/droneconnection/connection/e;->b(Z)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->f(Lcom/fimi/soul/drone/droneconnection/connection/d;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->d(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->d(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->d(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->d(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->d(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/List;

    move-result-object v0

    const/16 v1, 0xb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->g(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->g(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/drone/droneconnection/connection/e;

    invoke-interface {v0, v2}, Lcom/fimi/soul/drone/droneconnection/connection/e;->a(Z)V

    invoke-interface {v0, v2}, Lcom/fimi/soul/drone/droneconnection/connection/e;->b(Z)V

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->g(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->d(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/List;

    move-result-object v0

    const/16 v1, 0x63

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->d(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/List;

    move-result-object v0

    const/16 v1, 0x62

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->d(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/List;

    move-result-object v0

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->d(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/List;

    move-result-object v0

    const/16 v1, 0x69

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    :cond_6
    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->g(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/drone/droneconnection/connection/e;

    invoke-interface {v0, v2}, Lcom/fimi/soul/drone/droneconnection/connection/e;->b(Z)V

    invoke-interface {v0, v3}, Lcom/fimi/soul/drone/droneconnection/connection/e;->a(Z)V

    goto :goto_3

    :cond_7
    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->d(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->f(Lcom/fimi/soul/drone/droneconnection/connection/d;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_0
.end method
