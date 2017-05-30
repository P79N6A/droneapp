.class public Lcom/fimi/soul/module/droneTrack/a/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/droneTrack/a/c$a;
    }
.end annotation


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field a:J

.field b:I

.field private volatile d:Ljava/lang/String;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private volatile f:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/fimi/soul/biz/h/c;->a()Lcom/fimi/soul/biz/h/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/h/c;->b()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/fimi/soul/module/droneTrack/a/c;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/fimi/soul/module/droneTrack/a/c;->a:J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/c;->e:Ljava/util/List;

    const/4 v0, 0x0

    iput v0, p0, Lcom/fimi/soul/module/droneTrack/a/c;->b:I

    return-void
.end method

.method public static a()Lcom/fimi/soul/module/droneTrack/a/c;
    .locals 1

    invoke-static {}, Lcom/fimi/soul/module/droneTrack/a/c$a;->a()Lcom/fimi/soul/module/droneTrack/a/c;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a([Ljava/lang/String;I)[Ljava/lang/Object;
    .locals 1

    invoke-static {p0, p1}, Lcom/fimi/soul/module/droneTrack/a/c;->b([Ljava/lang/String;I)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private static b([Ljava/lang/String;I)[Ljava/lang/Object;
    .locals 8

    const/4 v3, 0x0

    array-length v0, p0

    rem-int/2addr v0, p1

    if-nez v0, :cond_0

    array-length v0, p0

    div-int/2addr v0, p1

    :goto_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    move v5, v3

    :goto_1
    if-ge v5, v0, :cond_2

    mul-int v1, v5, p1

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move v2, v1

    move v1, v3

    :goto_2
    if-ge v1, p1, :cond_1

    array-length v4, p0

    if-ge v2, v4, :cond_1

    add-int/lit8 v4, v2, 0x1

    aget-object v2, p0, v2

    invoke-interface {v7, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    move v2, v4

    goto :goto_2

    :cond_0
    array-length v0, p0

    div-int/2addr v0, p1

    goto :goto_0

    :cond_1
    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v5, 0x1

    move v5, v1

    goto :goto_1

    :cond_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    new-array v5, v0, [Ljava/lang/Object;

    move v2, v3

    :goto_3
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_4

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v7, v1, [Ljava/lang/String;

    move v4, v3

    :goto_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v4, v1, :cond_3

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    aput-object v1, v7, v4

    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_4

    :cond_3
    aput-object v7, v5, v2

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_3

    :cond_4
    return-object v5
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/fimi/soul/module/droneTrack/e;)V
    .locals 1

    new-instance v0, Lcom/fimi/soul/module/droneTrack/a/c$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/fimi/soul/module/droneTrack/a/c$1;-><init>(Lcom/fimi/soul/module/droneTrack/a/c;Ljava/lang/String;Lcom/fimi/soul/module/droneTrack/e;)V

    invoke-static {v0}, Lcom/fimi/kernel/utils/x;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()V
    .locals 1

    invoke-static {}, Lcom/fimi/soul/module/droneTrack/a/b;->a()Lcom/fimi/soul/module/droneTrack/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/b;->d()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/fimi/soul/module/droneTrack/a/c;->b:I

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/c;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
