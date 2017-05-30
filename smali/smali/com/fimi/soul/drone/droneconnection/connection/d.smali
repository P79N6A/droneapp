.class public abstract Lcom/fimi/soul/drone/droneconnection/connection/d;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String;

.field public static final b:I = 0x0

.field public static final c:I = 0x1

.field public static final d:I = 0x2

.field private static final i:I = 0x1000

.field private static final q:I = 0x1


# instance fields
.field protected volatile e:Z

.field f:Ljava/io/BufferedWriter;

.field g:Z

.field private h:Ljava/io/File;

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/fimi/soul/drone/droneconnection/connection/e;",
            ">;"
        }
    .end annotation
.end field

.field private l:Lcom/fimi/soul/biz/h/b;

.field private final m:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final n:Ljava/lang/Runnable;

.field private o:Ljava/lang/Thread;

.field private p:Landroid/os/Handler;

.field private final r:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/fimi/soul/drone/droneconnection/connection/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/fimi/soul/drone/droneconnection/connection/d;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->j:Ljava/util/List;

    iput-boolean v1, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->e:Z

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {}, Lcom/fimi/soul/biz/h/b;->a()Lcom/fimi/soul/biz/h/b;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->l:Lcom/fimi/soul/biz/h/b;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Lcom/fimi/soul/drone/droneconnection/connection/d$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/droneconnection/connection/d$1;-><init>(Lcom/fimi/soul/drone/droneconnection/connection/d;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->n:Ljava/lang/Runnable;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->g:Z

    new-instance v0, Lcom/fimi/soul/drone/droneconnection/connection/d$2;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/droneconnection/connection/d$2;-><init>(Lcom/fimi/soul/drone/droneconnection/connection/d;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->p:Landroid/os/Handler;

    new-instance v0, Lcom/fimi/soul/drone/droneconnection/connection/d$3;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/droneconnection/connection/d$3;-><init>(Lcom/fimi/soul/drone/droneconnection/connection/d;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->r:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method private a()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/drone/droneconnection/connection/e;

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/e;->a()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private a(Lcom/fimi/soul/drone/c/a/b;)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-boolean v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->g:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->g:Z

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->p:Landroid/os/Handler;

    iget-object v1, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->r:Ljava/lang/Runnable;

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/drone/droneconnection/connection/e;

    invoke-interface {v0, p1}, Lcom/fimi/soul/drone/droneconnection/connection/e;->a(Lcom/fimi/soul/drone/c/a/b;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/fimi/soul/drone/droneconnection/connection/d;Lcom/fimi/soul/drone/c/a/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/drone/droneconnection/connection/d;->a(Lcom/fimi/soul/drone/c/a/b;)V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/drone/droneconnection/connection/d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/drone/droneconnection/connection/d;->b(Ljava/lang/String;)V

    return-void
.end method

.method private b()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/drone/droneconnection/connection/e;

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/e;->b()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->g:Z

    goto :goto_0
.end method

.method static synthetic b(Lcom/fimi/soul/drone/droneconnection/connection/d;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->a()V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/drone/droneconnection/connection/e;

    invoke-interface {v0, p1}, Lcom/fimi/soul/drone/droneconnection/connection/e;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/fimi/soul/drone/droneconnection/connection/d;)Lcom/fimi/soul/biz/h/b;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->l:Lcom/fimi/soul/biz/h/b;

    return-object v0
.end method

.method static synthetic d(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->j:Ljava/util/List;

    return-object v0
.end method

.method static synthetic e(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->r:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic f(Lcom/fimi/soul/drone/droneconnection/connection/d;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->p:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic g(Lcom/fimi/soul/drone/droneconnection/connection/d;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->k:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/fimi/soul/drone/c/a/c;)V
    .locals 5

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/c;->d()[B

    move-result-object v1

    :try_start_0
    iget v0, p1, Lcom/fimi/soul/drone/c/a/c;->c:I

    const/16 v2, 0x12

    if-ne v0, v2, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->f:Ljava/io/BufferedWriter;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->f()Ljava/io/BufferedWriter;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->f:Ljava/io/BufferedWriter;

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->f:Ljava/io/BufferedWriter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->f:Ljava/io/BufferedWriter;

    invoke-static {}, Lcom/fimi/soul/utils/q;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->f:Ljava/io/BufferedWriter;

    const-string v2, "    "

    invoke-virtual {v0, v2}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuffer;

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    const/4 v0, 0x0

    :goto_1
    array-length v3, v1

    if-ge v0, v3, :cond_3

    aget-byte v3, v1, v0

    and-int/lit16 v3, v3, 0xf0

    shr-int/lit8 v3, v3, 0x4

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Character;->forDigit(II)C

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    aget-byte v3, v1, v0

    and-int/lit8 v3, v3, 0xf

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Character;->forDigit(II)C

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->f:Ljava/io/BufferedWriter;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->f:Ljava/io/BufferedWriter;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->f:Ljava/io/BufferedWriter;

    invoke-virtual {v0}, Ljava/io/BufferedWriter;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Ljava/lang/String;Lcom/fimi/soul/drone/droneconnection/connection/e;)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->k:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->i()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-interface {p2}, Lcom/fimi/soul/drone/droneconnection/connection/e;->a()V

    :cond_0
    return-void
.end method

.method protected abstract b([B)I
.end method

.method public b(Lcom/fimi/soul/drone/c/a/c;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/c;->d()[B

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->d([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method public c([B)V
    .locals 1

    if-eqz p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/fimi/soul/drone/droneconnection/connection/d;->d([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method protected abstract d()V
.end method

.method protected abstract d([B)V
.end method

.method protected abstract e()V
.end method

.method public f()Ljava/io/BufferedWriter;
    .locals 4

    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/fimi/soul/utils/j;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/updateLog/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/fimi/soul/utils/q;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".txt"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_0
    new-instance v0, Ljava/io/BufferedOutputStream;

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v2, Ljava/io/OutputStreamWriter;

    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v0, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    return-object v0
.end method

.method public g()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->n:Ljava/lang/Runnable;

    const-string v2, "MiLinkConnection-Connecting Thread"

    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->o:Ljava/lang/Thread;

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->o:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_0
    return-void
.end method

.method public h()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->o:Ljava/lang/Thread;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->o:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->o:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->o:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_2
    invoke-virtual {p0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->e()V

    invoke-direct {p0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->b()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/drone/droneconnection/connection/d;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public i()I
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/droneconnection/connection/d;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public abstract j()I
.end method
