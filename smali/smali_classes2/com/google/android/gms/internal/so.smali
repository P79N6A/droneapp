.class public Lcom/google/android/gms/internal/so;
.super Lcom/google/android/gms/internal/sq;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/google/android/gms/internal/sq;-><init>(Lcom/google/android/gms/internal/rw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/df$a;II)V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 6

    const/4 v5, 0x0

    const/4 v4, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/so;->e:Lcom/google/android/gms/internal/df$a;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/df$a;->O:Ljava/lang/Integer;

    iget-object v0, p0, Lcom/google/android/gms/internal/so;->f:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    new-array v2, v4, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/gms/internal/so;->b:Lcom/google/android/gms/internal/rw;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/rw;->b()Landroid/content/Context;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/so;->e:Lcom/google/android/gms/internal/df$a;

    monitor-enter v1

    if-ne v0, v4, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/so;->e:Lcom/google/android/gms/internal/df$a;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lcom/google/android/gms/internal/df$a;->O:Ljava/lang/Integer;

    :goto_0
    monitor-exit v1

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/so;->e:Lcom/google/android/gms/internal/df$a;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v0, Lcom/google/android/gms/internal/df$a;->O:Ljava/lang/Integer;

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
