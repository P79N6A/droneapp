.class abstract Lcom/google/android/gms/analytics/internal/aj;
.super Ljava/lang/Object;


# static fields
.field private static volatile b:Landroid/os/Handler;


# instance fields
.field private final a:Lcom/google/android/gms/analytics/internal/v;

.field private final c:Ljava/lang/Runnable;

.field private volatile d:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/analytics/internal/v;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/analytics/internal/aj;->a:Lcom/google/android/gms/analytics/internal/v;

    new-instance v0, Lcom/google/android/gms/analytics/internal/aj$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/internal/aj$1;-><init>(Lcom/google/android/gms/analytics/internal/aj;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/aj;->c:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/analytics/internal/aj;J)J
    .locals 1

    iput-wide p1, p0, Lcom/google/android/gms/analytics/internal/aj;->d:J

    return-wide p1
.end method

.method static synthetic a(Lcom/google/android/gms/analytics/internal/aj;)Lcom/google/android/gms/analytics/internal/v;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aj;->a:Lcom/google/android/gms/analytics/internal/v;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/analytics/internal/aj;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method private e()Landroid/os/Handler;
    .locals 3

    sget-object v0, Lcom/google/android/gms/analytics/internal/aj;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/analytics/internal/aj;->b:Landroid/os/Handler;

    :goto_0
    return-object v0

    :cond_0
    const-class v1, Lcom/google/android/gms/analytics/internal/aj;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/analytics/internal/aj;->b:Landroid/os/Handler;

    if-nez v0, :cond_1

    new-instance v0, Landroid/os/Handler;

    iget-object v2, p0, Lcom/google/android/gms/analytics/internal/aj;->a:Lcom/google/android/gms/analytics/internal/v;

    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/v;->b()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/google/android/gms/analytics/internal/aj;->b:Landroid/os/Handler;

    :cond_1
    sget-object v0, Lcom/google/android/gms/analytics/internal/aj;->b:Landroid/os/Handler;

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public abstract a()V
.end method

.method public a(J)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/aj;->d()V

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aj;->a:Lcom/google/android/gms/analytics/internal/v;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/v;->d()Lcom/google/android/gms/common/util/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/analytics/internal/aj;->d:J

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/aj;->e()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/aj;->c:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aj;->a:Lcom/google/android/gms/analytics/internal/v;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/v;->f()Lcom/google/android/gms/analytics/internal/g;

    move-result-object v0

    const-string v1, "Failed to schedule delayed post. time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/analytics/internal/g;->e(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public b()J
    .locals 4

    const-wide/16 v0, 0x0

    iget-wide v2, p0, Lcom/google/android/gms/analytics/internal/aj;->d:J

    cmp-long v2, v2, v0

    if-nez v2, :cond_0

    :goto_0
    return-wide v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/aj;->a:Lcom/google/android/gms/analytics/internal/v;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/internal/v;->d()Lcom/google/android/gms/common/util/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/analytics/internal/aj;->d:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    goto :goto_0
.end method

.method public b(J)V
    .locals 7

    const-wide/16 v0, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/aj;->c()Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    cmp-long v2, p1, v0

    if-gez v2, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/internal/aj;->d()V

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/analytics/internal/aj;->a:Lcom/google/android/gms/analytics/internal/v;

    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/v;->d()Lcom/google/android/gms/common/util/e;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/google/android/gms/analytics/internal/aj;->d:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    sub-long v2, p1, v2

    cmp-long v4, v2, v0

    if-gez v4, :cond_3

    :goto_1
    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/aj;->e()Landroid/os/Handler;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/analytics/internal/aj;->c:Ljava/lang/Runnable;

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/aj;->e()Landroid/os/Handler;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/analytics/internal/aj;->c:Ljava/lang/Runnable;

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/analytics/internal/aj;->a:Lcom/google/android/gms/analytics/internal/v;

    invoke-virtual {v2}, Lcom/google/android/gms/analytics/internal/v;->f()Lcom/google/android/gms/analytics/internal/g;

    move-result-object v2

    const-string v3, "Failed to adjust delayed post. time"

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/analytics/internal/g;->e(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    move-wide v0, v2

    goto :goto_1
.end method

.method public c()Z
    .locals 4

    iget-wide v0, p0, Lcom/google/android/gms/analytics/internal/aj;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/analytics/internal/aj;->d:J

    invoke-direct {p0}, Lcom/google/android/gms/analytics/internal/aj;->e()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/analytics/internal/aj;->c:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method
