.class final Lcom/google/android/gms/internal/aiw$a;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/aiw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aiw;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/aiw;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aiw$a;->a:Lcom/google/android/gms/internal/aiw;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "TransformedResultImpl"

    iget v1, p1, Landroid/os/Message;->what:I

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x46

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "TransformationResultHandler received unknown message type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/api/i;

    iget-object v1, p0, Lcom/google/android/gms/internal/aiw$a;->a:Lcom/google/android/gms/internal/aiw;

    invoke-static {v1}, Lcom/google/android/gms/internal/aiw;->d(Lcom/google/android/gms/internal/aiw;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aiw$a;->a:Lcom/google/android/gms/internal/aiw;

    invoke-static {v0}, Lcom/google/android/gms/internal/aiw;->e(Lcom/google/android/gms/internal/aiw;)Lcom/google/android/gms/internal/aiw;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    const/16 v3, 0xd

    const-string v4, "Transform returned null"

    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/aiw;->a(Lcom/google/android/gms/internal/aiw;Lcom/google/android/gms/common/api/Status;)V

    :goto_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    instance-of v2, v0, Lcom/google/android/gms/internal/ais;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/aiw$a;->a:Lcom/google/android/gms/internal/aiw;

    invoke-static {v2}, Lcom/google/android/gms/internal/aiw;->e(Lcom/google/android/gms/internal/aiw;)Lcom/google/android/gms/internal/aiw;

    move-result-object v2

    check-cast v0, Lcom/google/android/gms/internal/ais;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ais;->b()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/aiw;->a(Lcom/google/android/gms/internal/aiw;Lcom/google/android/gms/common/api/Status;)V

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/aiw$a;->a:Lcom/google/android/gms/internal/aiw;

    invoke-static {v2}, Lcom/google/android/gms/internal/aiw;->e(Lcom/google/android/gms/internal/aiw;)Lcom/google/android/gms/internal/aiw;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/aiw;->a(Lcom/google/android/gms/common/api/i;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/RuntimeException;

    const-string v2, "TransformedResultImpl"

    const-string v3, "Runtime exception on the transformation worker thread: "

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    throw v0

    :cond_2
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method