.class public Lcom/google/android/gms/internal/wx;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/aaa;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/wx$a;,
        Lcom/google/android/gms/internal/wx$e;,
        Lcom/google/android/gms/internal/wx$c;,
        Lcom/google/android/gms/internal/wx$d;,
        Lcom/google/android/gms/internal/wx$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Landroid/content/Context;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field private e:Lcom/google/android/gms/internal/aca;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/aca",
            "<",
            "Lcom/google/android/gms/internal/wu;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/google/android/gms/internal/aca;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/aca",
            "<",
            "Lcom/google/android/gms/internal/wu;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/google/android/gms/internal/wx$d;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/wx;->a:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/wx;->h:I

    iput-object p3, p0, Lcom/google/android/gms/internal/wx;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/wx;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/wx;->d:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    new-instance v0, Lcom/google/android/gms/internal/wx$b;

    invoke-direct {v0}, Lcom/google/android/gms/internal/wx$b;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/wx;->e:Lcom/google/android/gms/internal/aca;

    new-instance v0, Lcom/google/android/gms/internal/wx$b;

    invoke-direct {v0}, Lcom/google/android/gms/internal/wx$b;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/wx;->f:Lcom/google/android/gms/internal/aca;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/String;Lcom/google/android/gms/internal/aca;Lcom/google/android/gms/internal/aca;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/aca",
            "<",
            "Lcom/google/android/gms/internal/wu;",
            ">;",
            "Lcom/google/android/gms/internal/aca",
            "<",
            "Lcom/google/android/gms/internal/wu;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/wx;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/String;)V

    iput-object p4, p0, Lcom/google/android/gms/internal/wx;->e:Lcom/google/android/gms/internal/aca;

    iput-object p5, p0, Lcom/google/android/gms/internal/wx;->f:Lcom/google/android/gms/internal/aca;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/wx;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/wx;->h:I

    return p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/wx;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/wx;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/wx;Lcom/google/android/gms/internal/wx$d;)Lcom/google/android/gms/internal/wx$d;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/wx;->g:Lcom/google/android/gms/internal/wx$d;

    return-object p1
.end method

.method static synthetic b(Lcom/google/android/gms/internal/wx;)Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/wx;->d:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    return-object v0
.end method

.method private c(Lcom/google/android/gms/internal/ro;)Lcom/google/android/gms/internal/wx$d;
    .locals 3
    .param p1    # Lcom/google/android/gms/internal/ro;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    new-instance v0, Lcom/google/android/gms/internal/wx$d;

    iget-object v1, p0, Lcom/google/android/gms/internal/wx;->f:Lcom/google/android/gms/internal/aca;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/wx$d;-><init>(Lcom/google/android/gms/internal/aca;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/u;->e()Lcom/google/android/gms/internal/abv;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/wx$1;

    invoke-direct {v2, p0, p1, v0}, Lcom/google/android/gms/internal/wx$1;-><init>(Lcom/google/android/gms/internal/wx;Lcom/google/android/gms/internal/ro;Lcom/google/android/gms/internal/wx$d;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/abv;->a(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/wx;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/wx;->a:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/wx;)Lcom/google/android/gms/internal/aca;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/wx;->e:Lcom/google/android/gms/internal/aca;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/wx;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/wx;->h:I

    return v0
.end method

.method static synthetic f(Lcom/google/android/gms/internal/wx;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/wx;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/internal/wx;)Lcom/google/android/gms/internal/wx$d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/wx;->g:Lcom/google/android/gms/internal/wx$d;

    return-object v0
.end method


# virtual methods
.method protected a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ro;)Lcom/google/android/gms/internal/wu;
    .locals 2
    .param p3    # Lcom/google/android/gms/internal/ro;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    new-instance v0, Lcom/google/android/gms/internal/ww;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lcom/google/android/gms/internal/ww;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ro;Lcom/google/android/gms/ads/internal/d;)V

    return-object v0
.end method

.method public a()Lcom/google/android/gms/internal/wx$c;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/wx;->b(Lcom/google/android/gms/internal/ro;)Lcom/google/android/gms/internal/wx$c;

    move-result-object v0

    return-object v0
.end method

.method protected a(Lcom/google/android/gms/internal/ro;)Lcom/google/android/gms/internal/wx$d;
    .locals 3
    .param p1    # Lcom/google/android/gms/internal/ro;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/wx;->c(Lcom/google/android/gms/internal/ro;)Lcom/google/android/gms/internal/wx$d;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/wx$2;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/wx$2;-><init>(Lcom/google/android/gms/internal/wx;Lcom/google/android/gms/internal/wx$d;)V

    new-instance v2, Lcom/google/android/gms/internal/wx$3;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/wx$3;-><init>(Lcom/google/android/gms/internal/wx;Lcom/google/android/gms/internal/wx$d;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/wx$d;->a(Lcom/google/android/gms/internal/acr$c;Lcom/google/android/gms/internal/acr$a;)V

    return-object v0
.end method

.method public b(Lcom/google/android/gms/internal/ro;)Lcom/google/android/gms/internal/wx$c;
    .locals 4
    .param p1    # Lcom/google/android/gms/internal/ro;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v3, 0x2

    iget-object v1, p0, Lcom/google/android/gms/internal/wx;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/wx;->g:Lcom/google/android/gms/internal/wx$d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/wx;->g:Lcom/google/android/gms/internal/wx$d;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wx$d;->b()I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/wx;->h:I

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/wx;->a(Lcom/google/android/gms/internal/ro;)Lcom/google/android/gms/internal/wx$d;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/wx;->g:Lcom/google/android/gms/internal/wx$d;

    iget-object v0, p0, Lcom/google/android/gms/internal/wx;->g:Lcom/google/android/gms/internal/wx$d;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wx$d;->r_()Lcom/google/android/gms/internal/wx$c;

    move-result-object v0

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/wx;->h:I

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/wx;->g:Lcom/google/android/gms/internal/wx$d;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wx$d;->r_()Lcom/google/android/gms/internal/wx$c;

    move-result-object v0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    iget v0, p0, Lcom/google/android/gms/internal/wx;->h:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_3

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/wx;->h:I

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/wx;->a(Lcom/google/android/gms/internal/ro;)Lcom/google/android/gms/internal/wx$d;

    iget-object v0, p0, Lcom/google/android/gms/internal/wx;->g:Lcom/google/android/gms/internal/wx$d;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wx$d;->r_()Lcom/google/android/gms/internal/wx$c;

    move-result-object v0

    monitor-exit v1

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/wx;->h:I

    if-ne v0, v3, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/wx;->g:Lcom/google/android/gms/internal/wx$d;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wx$d;->r_()Lcom/google/android/gms/internal/wx$c;

    move-result-object v0

    monitor-exit v1

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/wx;->g:Lcom/google/android/gms/internal/wx$d;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wx$d;->r_()Lcom/google/android/gms/internal/wx$c;

    move-result-object v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method
