.class public Lcom/fimi/soul/module/droneTrack/a/d;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/fimi/soul/module/droneTrack/a/e;

.field private b:Lcom/fimi/soul/module/droneTrack/a/e;

.field private c:Lcom/fimi/soul/module/droneTrack/a/e;

.field private d:Lcom/fimi/soul/module/droneTrack/a/e;

.field private e:Lcom/fimi/soul/module/droneTrack/e;

.field private f:Landroid/os/Handler;

.field private g:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/fimi/soul/module/droneTrack/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d;->f:Landroid/os/Handler;

    new-instance v0, Lcom/fimi/soul/module/droneTrack/a/d$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/droneTrack/a/d$1;-><init>(Lcom/fimi/soul/module/droneTrack/a/d;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d;->g:Ljava/lang/Runnable;

    iput-object p1, p0, Lcom/fimi/soul/module/droneTrack/a/d;->e:Lcom/fimi/soul/module/droneTrack/e;

    new-instance v0, Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-direct {v0}, Lcom/fimi/soul/module/droneTrack/a/e;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d;->a:Lcom/fimi/soul/module/droneTrack/a/e;

    new-instance v0, Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-direct {v0}, Lcom/fimi/soul/module/droneTrack/a/e;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    new-instance v0, Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-direct {v0}, Lcom/fimi/soul/module/droneTrack/a/e;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d;->c:Lcom/fimi/soul/module/droneTrack/a/e;

    new-instance v0, Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-direct {v0}, Lcom/fimi/soul/module/droneTrack/a/e;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d;->d:Lcom/fimi/soul/module/droneTrack/a/e;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/a/e;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d;->a:Lcom/fimi/soul/module/droneTrack/a/e;

    return-object v0
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneTrack/a/d;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/fimi/soul/module/droneTrack/a/d;->a(Ljava/util/HashMap;Ljava/util/HashMap;)V

    return-void
.end method

.method private a(Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    move-result v2

    invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/a/e;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/a/e;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d;->c:Lcom/fimi/soul/module/droneTrack/a/e;

    return-object v0
.end method

.method static synthetic d(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/a/e;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d;->d:Lcom/fimi/soul/module/droneTrack/a/e;

    return-object v0
.end method

.method static synthetic e(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/e;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d;->e:Lcom/fimi/soul/module/droneTrack/e;

    return-object v0
.end method

.method static synthetic f(Lcom/fimi/soul/module/droneTrack/a/d;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d;->f:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/fimi/soul/module/droneTrack/a/e;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d;->d:Lcom/fimi/soul/module/droneTrack/a/e;

    return-object v0
.end method

.method public b()Lcom/fimi/soul/module/droneTrack/a/e;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d;->c:Lcom/fimi/soul/module/droneTrack/a/e;

    return-object v0
.end method

.method public c()Lcom/fimi/soul/module/droneTrack/a/e;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    return-object v0
.end method

.method public d()Lcom/fimi/soul/module/droneTrack/a/e;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d;->a:Lcom/fimi/soul/module/droneTrack/a/e;

    return-object v0
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/a/d;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
