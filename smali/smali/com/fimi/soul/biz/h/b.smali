.class public Lcom/fimi/soul/biz/h/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/biz/h/b$a;,
        Lcom/fimi/soul/biz/h/b$b;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private c:Lcom/fimi/soul/biz/h/b$b;

.field private final d:Lcom/fimi/soul/biz/h/d;

.field private e:Z

.field private f:Landroid/os/Handler;

.field private g:I

.field private h:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/fimi/soul/drone/c/a/c;",
            ">;"
        }
    .end annotation
.end field

.field private volatile i:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x64

    iput v0, p0, Lcom/fimi/soul/biz/h/b;->a:I

    const/16 v0, 0x2710

    iput v0, p0, Lcom/fimi/soul/biz/h/b;->b:I

    sget-object v0, Lcom/fimi/soul/biz/h/b$b;->a:Lcom/fimi/soul/biz/h/b$b;

    iput-object v0, p0, Lcom/fimi/soul/biz/h/b;->c:Lcom/fimi/soul/biz/h/b$b;

    invoke-static {}, Lcom/fimi/soul/biz/h/d;->a()Lcom/fimi/soul/biz/h/d;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/h/b;->d:Lcom/fimi/soul/biz/h/d;

    new-instance v0, Lcom/fimi/soul/biz/h/b$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/h/b$1;-><init>(Lcom/fimi/soul/biz/h/b;)V

    iput-object v0, p0, Lcom/fimi/soul/biz/h/b;->f:Landroid/os/Handler;

    const/16 v0, 0x4b0

    iput v0, p0, Lcom/fimi/soul/biz/h/b;->g:I

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/h/b;->h:Ljava/util/LinkedList;

    return-void
.end method

.method synthetic constructor <init>(Lcom/fimi/soul/biz/h/b$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/biz/h/b;-><init>()V

    return-void
.end method

.method public static a()Lcom/fimi/soul/biz/h/b;
    .locals 1

    sget-object v0, Lcom/fimi/soul/biz/h/b$a;->a:Lcom/fimi/soul/biz/h/b;

    return-object v0
.end method

.method static synthetic a(Lcom/fimi/soul/biz/h/b;)Ljava/util/LinkedList;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->h:Ljava/util/LinkedList;

    return-object v0
.end method

.method static synthetic b(Lcom/fimi/soul/biz/h/b;)Lcom/fimi/soul/biz/h/d;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->d:Lcom/fimi/soul/biz/h/d;

    return-object v0
.end method

.method private i()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->h:Ljava/util/LinkedList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->h:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-lez v0, :cond_0

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->h:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->h:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/drone/c/a/c;

    iget-object v1, p0, Lcom/fimi/soul/biz/h/b;->d:Lcom/fimi/soul/biz/h/d;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/biz/h/d;->a(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/biz/h/b$b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/h/b;->c:Lcom/fimi/soul/biz/h/b$b;

    return-void
.end method

.method public a(Lcom/fimi/soul/drone/c/a/c;)V
    .locals 2

    iget-boolean v0, p0, Lcom/fimi/soul/biz/h/b;->e:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->d:Lcom/fimi/soul/biz/h/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/h/d;->j()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->d:Lcom/fimi/soul/biz/h/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/h/d;->b()V

    invoke-direct {p0}, Lcom/fimi/soul/biz/h/b;->i()V

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->d:Lcom/fimi/soul/biz/h/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/h/d;->e()V

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->d:Lcom/fimi/soul/biz/h/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/h/d;->f()V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->d:Lcom/fimi/soul/biz/h/d;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/biz/h/d;->a(Lcom/fimi/soul/drone/c/a/c;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->d:Lcom/fimi/soul/biz/h/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/h/d;->d()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->d:Lcom/fimi/soul/biz/h/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/h/d;->c()V

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->d:Lcom/fimi/soul/biz/h/d;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/biz/h/d;->b(Lcom/fimi/soul/drone/c/a/c;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->h:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    iget v1, p0, Lcom/fimi/soul/biz/h/b;->g:I

    if-ge v0, v1, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->h:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->d:Lcom/fimi/soul/biz/h/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/h/d;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/fimi/soul/biz/h/b;->g()V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->h:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->h:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    goto :goto_1
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/biz/h/b;->i:Z

    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/biz/h/b;->e:Z

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->d:Lcom/fimi/soul/biz/h/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/h/d;->j()Z

    move-result v0

    return v0
.end method

.method public c()Ljava/util/LinkedList;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->h:Ljava/util/LinkedList;

    return-object v0
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->h:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/biz/h/b;->i:Z

    return v0
.end method

.method public f()Lcom/fimi/soul/biz/h/b$b;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->c:Lcom/fimi/soul/biz/h/b$b;

    return-object v0
.end method

.method public g()V
    .locals 4

    const/16 v1, 0x64

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->f:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/h/b;->f:Landroid/os/Handler;

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_0
    return-void
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/biz/h/b;->e:Z

    return v0
.end method
