.class public Lcom/fimi/soul/biz/k/a;
.super Ljava/lang/Object;


# instance fields
.field final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field b:Landroid/os/Handler;

.field private c:Landroid/os/AsyncTask;

.field private d:Landroid/database/sqlite/SQLiteDatabase;

.field private e:Lcom/google/android/gms/maps/c;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/c;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/google/android/gms/maps/model/CircleOptions;

.field private h:Lcom/google/android/gms/maps/model/CircleOptions;

.field private i:Ljava/util/concurrent/ExecutorService;

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/DynamicDYZ_Entity;",
            ">;"
        }
    .end annotation
.end field

.field private k:Landroid/content/Context;

.field private final l:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/maps/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/k/a;->a:Ljava/util/List;

    const/16 v0, 0x64

    iput v0, p0, Lcom/fimi/soul/biz/k/a;->l:I

    new-instance v0, Lcom/fimi/soul/biz/k/a$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/k/a$1;-><init>(Lcom/fimi/soul/biz/k/a;)V

    iput-object v0, p0, Lcom/fimi/soul/biz/k/a;->b:Landroid/os/Handler;

    iput-object p1, p0, Lcom/fimi/soul/biz/k/a;->k:Landroid/content/Context;

    iput-object p2, p0, Lcom/fimi/soul/biz/k/a;->e:Lcom/google/android/gms/maps/c;

    invoke-static {}, Lcom/fimi/soul/biz/k/b;->a()Lcom/fimi/soul/biz/k/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/k/b;->b()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/a;->f:Ljava/util/List;

    invoke-direct {p0, p1}, Lcom/fimi/soul/biz/k/a;->a(Landroid/content/Context;)V

    invoke-static {}, Lcom/fimi/kernel/utils/x;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/a;->i:Ljava/util/concurrent/ExecutorService;

    invoke-direct {p0}, Lcom/fimi/soul/biz/k/a;->c()V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/biz/k/a;)Lcom/google/android/gms/maps/c;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/a;->e:Lcom/google/android/gms/maps/c;

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-static {p1}, Lcom/fimi/soul/utils/ao;->o(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->openDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/a;->d:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/fimi/soul/biz/k/a;Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/fimi/soul/biz/k/a;->a(Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/maps/model/LatLng;ILcom/google/android/gms/maps/model/CircleOptions;)V
    .locals 6

    invoke-static {}, Lcom/fimi/soul/biz/n/a;->a()Lcom/fimi/soul/biz/n/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/n/a;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v0, p1, Lcom/google/android/gms/maps/model/LatLng;->a:D

    iget-wide v2, p1, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-static {v0, v1, v2, v3}, Lcom/fimi/soul/utils/z;->a(DD)Lcom/fimi/soul/utils/af;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1}, Lcom/fimi/soul/utils/af;->a()D

    move-result-wide v2

    invoke-virtual {v1}, Lcom/fimi/soul/utils/af;->b()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    :goto_0
    iget-object v1, p0, Lcom/fimi/soul/biz/k/a;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/k/a;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/fimi/soul/biz/k/a;->e:Lcom/google/android/gms/maps/c;

    invoke-virtual {p3, v0}, Lcom/google/android/gms/maps/model/CircleOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    int-to-double v2, p2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->a(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/c;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/k/a;->f:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/k/a;->f:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void

    :cond_1
    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-wide v2, p1, Lcom/google/android/gms/maps/model/LatLng;->a:D

    iget-wide v4, p1, Lcom/google/android/gms/maps/model/LatLng;->b:D

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/fimi/soul/biz/k/a;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/a;->f:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/biz/k/a;)Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/a;->d:Landroid/database/sqlite/SQLiteDatabase;

    return-object v0
.end method

.method private c()V
    .locals 9

    const/high16 v8, 0x40000000    # 2.0f

    const-wide v6, 0x40bf400000000000L    # 8000.0

    const/16 v5, 0xff

    const/16 v4, 0x36

    const/4 v3, 0x0

    new-instance v0, Lcom/google/android/gms/maps/model/CircleOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/CircleOptions;-><init>()V

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/maps/model/CircleOptions;->a(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    const/16 v1, 0x7f

    invoke-static {v1, v5, v4, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/CircleOptions;->a(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/google/android/gms/maps/model/CircleOptions;->a(F)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    const/16 v1, 0x33

    invoke-static {v1, v5, v4, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/CircleOptions;->b(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    const/high16 v1, 0x42c80000    # 100.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/CircleOptions;->b(F)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/a;->g:Lcom/google/android/gms/maps/model/CircleOptions;

    new-instance v0, Lcom/google/android/gms/maps/model/CircleOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/CircleOptions;-><init>()V

    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/maps/model/CircleOptions;->a(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/k/a;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e00ac

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/CircleOptions;->a(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/google/android/gms/maps/model/CircleOptions;->a(F)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    const/16 v1, 0x33

    invoke-static {v1, v5, v4, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/CircleOptions;->b(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    const/high16 v1, 0x42c80000    # 100.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/CircleOptions;->b(F)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/k/a;->h:Lcom/google/android/gms/maps/model/CircleOptions;

    return-void
.end method

.method static synthetic d(Lcom/fimi/soul/biz/k/a;)Lcom/google/android/gms/maps/model/CircleOptions;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/a;->g:Lcom/google/android/gms/maps/model/CircleOptions;

    return-object v0
.end method

.method static synthetic e(Lcom/fimi/soul/biz/k/a;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/a;->j:Ljava/util/List;

    return-object v0
.end method

.method static synthetic f(Lcom/fimi/soul/biz/k/a;)Lcom/google/android/gms/maps/model/CircleOptions;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/a;->h:Lcom/google/android/gms/maps/model/CircleOptions;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/biz/k/a;->b:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/DynamicDYZ_Entity;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/fimi/soul/biz/k/a;->j:Ljava/util/List;

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/k/a;->d:Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/k/a;->d:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/k/a;->d:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_0
    return-void
.end method
