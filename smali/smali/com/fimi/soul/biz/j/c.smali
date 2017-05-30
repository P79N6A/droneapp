.class public Lcom/fimi/soul/biz/j/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/drone/d$b;


# instance fields
.field private a:Lcom/fimi/soul/entity/DroneModelBean;

.field private b:Lcom/fimi/soul/biz/j/d;

.field private c:Lcom/fimi/soul/drone/a;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Lcom/fimi/soul/utils/ak;

.field private i:Z

.field private j:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private k:Lcom/fimi/soul/biz/j/e;

.field private l:Landroid/os/Handler;

.field private m:Ljava/lang/Runnable;

.field private n:Lcom/fimi/soul/biz/c/h;

.field private o:Z

.field private p:Ljava/util/Observer;

.field private q:I


# direct methods
.method public constructor <init>(Lcom/fimi/soul/biz/j/d;Lcom/fimi/soul/drone/a;Landroid/content/Context;)V
    .locals 2

    const/16 v0, 0x14

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/fimi/soul/biz/j/c;->e:I

    iput v0, p0, Lcom/fimi/soul/biz/j/c;->f:I

    const/16 v0, 0x64

    iput v0, p0, Lcom/fimi/soul/biz/j/c;->g:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/biz/j/c;->i:Z

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/j/c;->l:Landroid/os/Handler;

    new-instance v0, Lcom/fimi/soul/biz/j/c$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/j/c$1;-><init>(Lcom/fimi/soul/biz/j/c;)V

    iput-object v0, p0, Lcom/fimi/soul/biz/j/c;->m:Ljava/lang/Runnable;

    new-instance v0, Lcom/fimi/soul/biz/j/c$2;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/j/c$2;-><init>(Lcom/fimi/soul/biz/j/c;)V

    iput-object v0, p0, Lcom/fimi/soul/biz/j/c;->p:Ljava/util/Observer;

    iput-object p1, p0, Lcom/fimi/soul/biz/j/c;->b:Lcom/fimi/soul/biz/j/d;

    new-instance v0, Lcom/fimi/soul/entity/DroneModelBean;

    invoke-direct {v0, p2}, Lcom/fimi/soul/entity/DroneModelBean;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/biz/j/c;->a:Lcom/fimi/soul/entity/DroneModelBean;

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->a:Lcom/fimi/soul/entity/DroneModelBean;

    iget-object v1, p0, Lcom/fimi/soul/biz/j/c;->p:Ljava/util/Observer;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/DroneModelBean;->addObserver(Ljava/util/Observer;)V

    iput-object p2, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/fimi/soul/biz/j/c;->j:Ljava/lang/ref/WeakReference;

    new-instance v0, Lcom/fimi/soul/biz/j/e;

    invoke-direct {v0, p2}, Lcom/fimi/soul/biz/j/e;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/biz/j/c;->k:Lcom/fimi/soul/biz/j/e;

    invoke-static {p3}, Lcom/fimi/soul/biz/c/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/c/h;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/j/c;->n:Lcom/fimi/soul/biz/c/h;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/biz/j/c;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/biz/j/c;->e:I

    return v0
.end method

.method static synthetic a(Lcom/fimi/soul/biz/j/c;Lcom/fimi/soul/utils/ak;)Lcom/fimi/soul/utils/ak;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/j/c;->h:Lcom/fimi/soul/utils/ak;

    return-object p1
.end method

.method private a(I)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->b:Lcom/fimi/soul/biz/j/d;

    invoke-interface {v0, p1}, Lcom/fimi/soul/biz/j/d;->a(I)V

    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/entity/DroneModelBean;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->a:Lcom/fimi/soul/entity/DroneModelBean;

    return-object v0
.end method

.method private b(I)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->b:Lcom/fimi/soul/biz/j/d;

    invoke-interface {v0, p1}, Lcom/fimi/soul/biz/j/d;->b(I)V

    return-void
.end method

.method static synthetic c(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/biz/j/d;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->b:Lcom/fimi/soul/biz/j/d;

    return-object v0
.end method

.method static synthetic d(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/drone/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    return-object v0
.end method

.method static synthetic e(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/biz/j/e;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->k:Lcom/fimi/soul/biz/j/e;

    return-object v0
.end method

.method private e()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->judgeNoAction()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/fimi/soul/biz/j/c;->h()V

    invoke-direct {p0}, Lcom/fimi/soul/biz/j/c;->i()V

    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/fimi/soul/biz/j/c;)Lcom/fimi/soul/utils/ak;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->h:Lcom/fimi/soul/utils/ak;

    return-object v0
.end method

.method private f()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isEnterModel()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->g()Lcom/fimi/soul/drone/h/ad;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ad;->k()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/fimi/soul/biz/j/c;->f:I

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/fimi/soul/biz/j/c;->q:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/fimi/soul/biz/j/c;->q:I

    iget v0, p0, Lcom/fimi/soul/biz/j/c;->q:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->b:Lcom/fimi/soul/biz/j/d;

    const v1, 0x7f0a0190

    invoke-interface {v0, v1, v2}, Lcom/fimi/soul/biz/j/d;->a(II)V

    iput v2, p0, Lcom/fimi/soul/biz/j/c;->q:I

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->q:I

    if-eqz v0, :cond_2

    iput v2, p0, Lcom/fimi/soul/biz/j/c;->q:I

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->b:Lcom/fimi/soul/biz/j/d;

    const/4 v1, 0x4

    invoke-interface {v0, v2, v1}, Lcom/fimi/soul/biz/j/d;->a(II)V

    goto :goto_0
.end method

.method private g()V
    .locals 7

    const/4 v6, 0x0

    const/4 v5, 0x4

    const/4 v3, 0x2

    const v2, 0x7f02033e

    const/4 v4, 0x1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->af()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x7f0a00b7

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    invoke-direct {p0, v2}, Lcom/fimi/soul/biz/j/c;->b(I)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const v0, 0x7f0a0371

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    const v0, 0x7f02033f

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->b(I)V

    goto :goto_0

    :cond_2
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->e:I

    if-ne v0, v3, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-nez v0, :cond_3

    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    if-ne v0, v4, :cond_3

    const v0, 0x7f0a0271

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    invoke-direct {p0, v2}, Lcom/fimi/soul/biz/j/c;->b(I)V

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->e:I

    if-ne v0, v4, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-nez v0, :cond_4

    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    if-ne v0, v4, :cond_4

    const v0, 0x7f0a0210

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    iput-boolean v6, p0, Lcom/fimi/soul/biz/j/c;->o:Z

    invoke-direct {p0, v2}, Lcom/fimi/soul/biz/j/c;->b(I)V

    goto :goto_0

    :cond_4
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->e:I

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-nez v0, :cond_5

    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    if-ne v0, v4, :cond_5

    const v0, 0x7f0a00b7

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    invoke-direct {p0, v2}, Lcom/fimi/soul/biz/j/c;->b(I)V

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->e:I

    if-ne v0, v3, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_6

    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    if-ne v0, v4, :cond_6

    const v0, 0x7f0a0270

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    invoke-direct {p0, v2}, Lcom/fimi/soul/biz/j/c;->b(I)V

    goto :goto_0

    :cond_6
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->e:I

    if-ne v0, v4, :cond_7

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_7

    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    if-ne v0, v4, :cond_7

    const v0, 0x7f0a020f

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    invoke-direct {p0, v2}, Lcom/fimi/soul/biz/j/c;->b(I)V

    invoke-direct {p0}, Lcom/fimi/soul/biz/j/c;->j()V

    goto/16 :goto_0

    :cond_7
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->e:I

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_8

    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    if-ne v0, v4, :cond_8

    const v0, 0x7f0a00b6

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    invoke-direct {p0, v2}, Lcom/fimi/soul/biz/j/c;->b(I)V

    goto/16 :goto_0

    :cond_8
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_9

    const v0, 0x7f0a0427

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    const v0, 0x7f0203c2

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->b(I)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->g()Lcom/fimi/soul/drone/h/ad;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ad;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/fimi/soul/biz/j/c;->e()V

    goto/16 :goto_0

    :cond_9
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_a

    invoke-direct {p0}, Lcom/fimi/soul/biz/j/c;->e()V

    const v0, 0x7f0a0353

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    const v0, 0x7f0203c2

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->b(I)V

    iget-boolean v0, p0, Lcom/fimi/soul/biz/j/c;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->h:Lcom/fimi/soul/utils/ak;

    if-nez v0, :cond_0

    iput-boolean v6, p0, Lcom/fimi/soul/biz/j/c;->i:Z

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->k:Lcom/fimi/soul/biz/j/e;

    iget-object v1, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0a0353

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/j/e;->a(Ljava/lang/String;)V

    new-instance v1, Lcom/fimi/soul/utils/ak;

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->j:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    new-instance v2, Lcom/fimi/soul/biz/j/c$3;

    invoke-direct {v2, p0}, Lcom/fimi/soul/biz/j/c$3;-><init>(Lcom/fimi/soul/biz/j/c;)V

    const/4 v3, 0x3

    invoke-direct {v1, v0, v2, v3}, Lcom/fimi/soul/utils/ak;-><init>(Landroid/content/Context;Lcom/fimi/soul/utils/ak$a;I)V

    iput-object v1, p0, Lcom/fimi/soul/biz/j/c;->h:Lcom/fimi/soul/utils/ak;

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->h:Lcom/fimi/soul/utils/ak;

    invoke-virtual {v0, v4}, Lcom/fimi/soul/utils/ak;->setCancelable(Z)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->h:Lcom/fimi/soul/utils/ak;

    invoke-virtual {v0}, Lcom/fimi/soul/utils/ak;->show()V

    goto/16 :goto_0

    :cond_a
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_b

    const v0, 0x7f0a026b

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    const v0, 0x7f0202e0

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->b(I)V

    invoke-direct {p0}, Lcom/fimi/soul/biz/j/c;->e()V

    goto/16 :goto_0

    :cond_b
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_c

    invoke-direct {p0}, Lcom/fimi/soul/biz/j/c;->e()V

    const v0, 0x7f0a028c

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    const v0, 0x7f0202e0

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->b(I)V

    goto/16 :goto_0

    :cond_c
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    if-ne v0, v3, :cond_d

    const v0, 0x7f0a03ff

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    const v0, 0x7f020404

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->b(I)V

    goto/16 :goto_0

    :cond_d
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    if-ne v0, v5, :cond_f

    iput-boolean v4, p0, Lcom/fimi/soul/biz/j/c;->o:Z

    iget v0, p0, Lcom/fimi/soul/biz/j/c;->f:I

    if-ne v0, v5, :cond_e

    const v0, 0x7f0a03ed

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    const v0, 0x7f02016e

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->b(I)V

    goto/16 :goto_0

    :cond_e
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->f:I

    if-ne v0, v3, :cond_0

    const v0, 0x7f0a01e7

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    const v0, 0x7f02016e

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->b(I)V

    goto/16 :goto_0

    :cond_f
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_11

    iget v0, p0, Lcom/fimi/soul/biz/j/c;->f:I

    if-ne v0, v5, :cond_10

    const v0, 0x7f0a03ec

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    const v0, 0x7f020170

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->b(I)V

    goto/16 :goto_0

    :cond_10
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->f:I

    if-ne v0, v3, :cond_0

    const v0, 0x7f0a0237

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    const v0, 0x7f020170

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->b(I)V

    goto/16 :goto_0

    :cond_11
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_13

    iput-boolean v4, p0, Lcom/fimi/soul/biz/j/c;->o:Z

    iget v0, p0, Lcom/fimi/soul/biz/j/c;->f:I

    if-ne v0, v5, :cond_12

    const v0, 0x7f0a03ef

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    const v0, 0x7f02028c

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->b(I)V

    goto/16 :goto_0

    :cond_12
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->f:I

    if-ne v0, v3, :cond_0

    const v0, 0x7f0a018f

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    const v0, 0x7f02028c

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->b(I)V

    goto/16 :goto_0

    :cond_13
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_15

    iget v0, p0, Lcom/fimi/soul/biz/j/c;->f:I

    if-ne v0, v5, :cond_14

    const v0, 0x7f0a03ee

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    const v0, 0x7f030007

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->b(I)V

    goto/16 :goto_0

    :cond_14
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->f:I

    if-ne v0, v3, :cond_0

    const v0, 0x7f0a0404

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    const v0, 0x7f030007

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->b(I)V

    goto/16 :goto_0

    :cond_15
    const v0, 0x7f0a012b

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/c;->a(I)V

    invoke-direct {p0, v2}, Lcom/fimi/soul/biz/j/c;->b(I)V

    goto/16 :goto_0
.end method

.method private h()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bu:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    return-void
.end method

.method private i()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/biz/j/c;->o:Z

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bn:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    return-void
.end method

.method private j()V
    .locals 2

    iget-boolean v0, p0, Lcom/fimi/soul/biz/j/c;->o:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/biz/j/c;->o:Z

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bo:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/i;->a(Z)V

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->l:Landroid/os/Handler;

    iget-object v1, p0, Lcom/fimi/soul/biz/j/c;->m:Ljava/lang/Runnable;

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/i;->a(Z)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->k:Lcom/fimi/soul/biz/j/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->k:Lcom/fimi/soul/biz/j/e;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/e;->a()V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->b(Lcom/fimi/soul/drone/d$b;)V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->k:Lcom/fimi/soul/biz/j/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->k:Lcom/fimi/soul/biz/j/e;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/e;->b()V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->c:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 5

    const/16 v4, 0xa

    const/4 v3, 0x5

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/fimi/soul/biz/j/c$4;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    invoke-static {}, Lcom/fimi/soul/module/calibcompass/a;->a()Lcom/fimi/soul/module/calibcompass/a;

    move-result-object v0

    const-string v1, "147"

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/calibcompass/a;->a(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_2
    invoke-static {}, Lcom/fimi/soul/module/calibcompass/a;->a()Lcom/fimi/soul/module/calibcompass/a;

    move-result-object v0

    const-string v1, "146"

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/calibcompass/a;->a(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_3
    invoke-static {}, Lcom/fimi/soul/module/calibcompass/a;->a()Lcom/fimi/soul/module/calibcompass/a;

    move-result-object v0

    const-string v1, "145"

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/calibcompass/a;->a(Ljava/lang/String;)V

    sget-object v0, Lcom/fimi/soul/drone/d$a;->bn:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {p2, v0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto :goto_0

    :pswitch_4
    invoke-static {}, Lcom/fimi/soul/module/calibcompass/a;->a()Lcom/fimi/soul/module/calibcompass/a;

    move-result-object v0

    const-string v1, "144"

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/calibcompass/a;->a(Ljava/lang/String;)V

    sget-object v0, Lcom/fimi/soul/drone/d$a;->bn:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {p2, v0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto :goto_0

    :pswitch_5
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->e()B

    move-result v0

    iput v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->d()B

    move-result v0

    iput v0, p0, Lcom/fimi/soul/biz/j/c;->e:I

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->f()B

    move-result v0

    iput v0, p0, Lcom/fimi/soul/biz/j/c;->f:I

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->a:Lcom/fimi/soul/entity/DroneModelBean;

    iget v1, p0, Lcom/fimi/soul/biz/j/c;->d:I

    iget v2, p0, Lcom/fimi/soul/biz/j/c;->e:I

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/entity/DroneModelBean;->setFlightModel(II)V

    invoke-direct {p0}, Lcom/fimi/soul/biz/j/c;->f()V

    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/biz/j/c;->i:Z

    :cond_1
    invoke-static {}, Lcom/fimi/soul/module/droneFragment/i;->d()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/fimi/soul/biz/j/c;->g()V

    :cond_2
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->g:I

    if-ne v0, v3, :cond_3

    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    if-eq v0, v3, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/biz/j/c;->k:Lcom/fimi/soul/biz/j/e;

    iget-object v1, p2, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v2, 0x7f0a0318

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/j/e;->a(Ljava/lang/String;)V

    :cond_3
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->g:I

    if-eq v0, v4, :cond_4

    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    if-ne v0, v4, :cond_4

    sget-object v0, Lcom/fimi/soul/drone/d$a;->bO:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {p2, v0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    :cond_4
    iget v0, p0, Lcom/fimi/soul/biz/j/c;->d:I

    iput v0, p0, Lcom/fimi/soul/biz/j/c;->g:I

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
