.class Lcom/fimi/soul/drone/droneconnection/connection/d$1;
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

    iput-object p1, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/fimi/soul/drone/c/b;I[B)V
    .locals 5

    const/4 v0, 0x1

    if-ge p2, v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-ge v0, p2, :cond_0

    aget-byte v1, p3, v0

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {p1, v1}, Lcom/fimi/soul/drone/c/b;->a(I)Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/fimi/soul/drone/droneconnection/connection/c;->a()Lcom/fimi/soul/drone/droneconnection/connection/c;

    move-result-object v2

    iget-object v3, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    iget-boolean v3, v3, Lcom/fimi/soul/drone/droneconnection/connection/d;->e:Z

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/droneconnection/connection/c;->a(Z)V

    iget-object v3, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v3}, Lcom/fimi/soul/drone/droneconnection/connection/d;->c(Lcom/fimi/soul/drone/droneconnection/connection/d;)Lcom/fimi/soul/biz/h/b;

    move-result-object v3

    iget-object v4, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    iget-boolean v4, v4, Lcom/fimi/soul/drone/droneconnection/connection/d;->e:Z

    invoke-virtual {v3, v4}, Lcom/fimi/soul/biz/h/b;->b(Z)V

    iget v3, v1, Lcom/fimi/soul/drone/c/a/c;->c:I

    const/16 v4, 0xd3

    if-ne v3, v4, :cond_3

    iget-object v2, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v2}, Lcom/fimi/soul/drone/droneconnection/connection/d;->c(Lcom/fimi/soul/drone/droneconnection/connection/d;)Lcom/fimi/soul/biz/h/b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/fimi/soul/biz/h/b;->a(Lcom/fimi/soul/drone/c/a/c;)V

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iget-object v3, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v3}, Lcom/fimi/soul/drone/droneconnection/connection/d;->d(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/List;

    move-result-object v3

    iget v4, v1, Lcom/fimi/soul/drone/c/a/c;->c:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    iget-boolean v3, v3, Lcom/fimi/soul/drone/droneconnection/connection/d;->e:Z

    if-eqz v3, :cond_7

    invoke-virtual {v2}, Lcom/fimi/soul/drone/droneconnection/connection/c;->f()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Lcom/fimi/soul/drone/droneconnection/connection/c;->g()V

    :cond_4
    invoke-virtual {v2}, Lcom/fimi/soul/drone/droneconnection/connection/c;->e()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v2}, Lcom/fimi/soul/drone/droneconnection/connection/c;->b()V

    :cond_5
    :goto_3
    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/c;->f()Lcom/fimi/soul/drone/c/a/b;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v2, v1}, Lcom/fimi/soul/drone/droneconnection/connection/d;->a(Lcom/fimi/soul/drone/droneconnection/connection/d;Lcom/fimi/soul/drone/c/a/b;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v2, v1}, Lcom/fimi/soul/drone/droneconnection/connection/c;->a(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v2}, Lcom/fimi/soul/drone/droneconnection/connection/c;->f()Z

    move-result v3

    if-nez v3, :cond_8

    invoke-virtual {v2}, Lcom/fimi/soul/drone/droneconnection/connection/c;->c()V

    :goto_4
    invoke-virtual {v2}, Lcom/fimi/soul/drone/droneconnection/connection/c;->e()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v2}, Lcom/fimi/soul/drone/droneconnection/connection/c;->d()V

    goto :goto_3

    :cond_8
    invoke-virtual {v2}, Lcom/fimi/soul/drone/droneconnection/connection/c;->k()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v2}, Lcom/fimi/soul/drone/droneconnection/connection/c;->g()V

    goto/16 :goto_0

    :cond_9
    invoke-virtual {v2, v1}, Lcom/fimi/soul/drone/droneconnection/connection/c;->a(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_4
.end method


# virtual methods
.method public run()V
    .locals 5

    const/4 v4, 0x2

    invoke-static {}, Landroid/os/Looper;->prepare()V

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->d()V

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->a(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->b(Lcom/fimi/soul/drone/droneconnection/connection/d;)V

    new-instance v0, Lcom/fimi/soul/drone/c/b;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/b;-><init>()V

    iget-object v2, v0, Lcom/fimi/soul/drone/c/b;->c:Lcom/fimi/soul/drone/c/a/e;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/c/a/e;->b()V

    const/16 v2, 0x1000

    new-array v2, v2, [B

    :cond_0
    :goto_0
    iget-object v3, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v3}, Lcom/fimi/soul/drone/droneconnection/connection/d;->a(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v3

    if-ne v3, v4, :cond_3

    iget-object v3, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-virtual {v3, v2}, Lcom/fimi/soul/drone/droneconnection/connection/d;->b([B)I

    move-result v3

    if-lez v3, :cond_0

    invoke-direct {p0, v0, v3, v2}, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a(Lcom/fimi/soul/drone/c/b;I[B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    iget-object v2, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-static {v2}, Lcom/fimi/soul/drone/droneconnection/connection/d;->a(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->a(Lcom/fimi/soul/drone/droneconnection/connection/d;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->h()V

    :goto_1
    invoke-static {}, Landroid/os/Looper;->loop()V

    return-void

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->h()V

    goto :goto_1

    :catchall_0
    move-exception v0

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    :cond_5
    iget-object v1, p0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;->a:Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/droneconnection/connection/d;->h()V

    throw v0
.end method
