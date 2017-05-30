.class public Lcom/fimi/soul/drone/a/a;
.super Ljava/lang/Object;


# static fields
.field private static final g:I = 0x1


# instance fields
.field private a:Lcom/fimi/soul/drone/a;

.field private b:Landroid/content/Context;

.field private c:Lcom/fimi/soul/entity/SavreDroneInFoBean;

.field private d:Lcom/fimi/soul/service/b;

.field private e:Lcom/fimi/soul/module/dronemanage/b;

.field private f:Z

.field private h:J

.field private i:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/fimi/soul/drone/c/a/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/a;Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/fimi/soul/drone/a/a;->h:J

    iput-object p1, p0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    iput-object p2, p0, Lcom/fimi/soul/drone/a/a;->b:Landroid/content/Context;

    new-instance v0, Lcom/fimi/soul/entity/SavreDroneInFoBean;

    invoke-direct {v0}, Lcom/fimi/soul/entity/SavreDroneInFoBean;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/drone/a/a;->c:Lcom/fimi/soul/entity/SavreDroneInFoBean;

    iget-object v0, p0, Lcom/fimi/soul/drone/a/a;->c:Lcom/fimi/soul/entity/SavreDroneInFoBean;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/SavreDroneInFoBean;->getHashMap()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/drone/a/a;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {}, Lcom/fimi/soul/service/b;->a()Lcom/fimi/soul/service/b;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/drone/a/a;->d:Lcom/fimi/soul/service/b;

    invoke-static {}, Lcom/fimi/soul/module/dronemanage/b;->a()Lcom/fimi/soul/module/dronemanage/b;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/drone/a/a;->e:Lcom/fimi/soul/module/dronemanage/b;

    return-void
.end method


# virtual methods
.method public a(Lcom/fimi/soul/drone/c/a/b;)V
    .locals 27

    move-object/from16 v0, p1

    iget v2, v0, Lcom/fimi/soul/drone/c/a/b;->a:I

    sparse-switch v2, :sswitch_data_0

    :cond_0
    :goto_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    move-object/from16 v0, p1

    invoke-static {v0, v2}, Lcom/fimi/soul/drone/c/a/a/f;->a(Lcom/fimi/soul/drone/c/a/b;Lcom/fimi/soul/drone/a;)Z

    return-void

    :sswitch_0
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/bo;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->N()Lcom/fimi/soul/drone/h/az;

    move-result-object v3

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/bo;->d:B

    iget-short v5, v2, Lcom/fimi/soul/drone/c/a/a/bo;->e:S

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/bo;->f:B

    invoke-virtual {v3, v4, v5, v2}, Lcom/fimi/soul/drone/h/az;->a(BSB)V

    goto :goto_0

    :sswitch_1
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/bm;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->O()Lcom/fimi/soul/drone/h/ay;

    move-result-object v3

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/bm;->d:B

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/bm;->e:B

    invoke-virtual {v3, v4, v2}, Lcom/fimi/soul/drone/h/ay;->a(BB)V

    goto :goto_0

    :sswitch_2
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/bj;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->P()Lcom/fimi/soul/drone/h/ax;

    move-result-object v3

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/bj;->d:B

    iget-byte v5, v2, Lcom/fimi/soul/drone/c/a/a/bj;->e:B

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/bj;->f:B

    invoke-virtual {v3, v4, v5, v2}, Lcom/fimi/soul/drone/h/ax;->a(BBB)V

    goto :goto_0

    :sswitch_3
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/br;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->Q()Lcom/fimi/soul/drone/h/av;

    move-result-object v3

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/br;->d:B

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/br;->e:B

    invoke-virtual {v3, v4, v2}, Lcom/fimi/soul/drone/h/av;->a(BB)V

    goto :goto_0

    :sswitch_4
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/bq;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->R()Lcom/fimi/soul/drone/h/aw;

    move-result-object v3

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/bq;->d:B

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/bq;->e:B

    invoke-virtual {v3, v4, v2}, Lcom/fimi/soul/drone/h/aw;->a(BB)V

    goto :goto_0

    :sswitch_5
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/y;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->Y()Lcom/fimi/soul/drone/h/an;

    move-result-object v3

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/y;->d:B

    iget-byte v5, v2, Lcom/fimi/soul/drone/c/a/a/y;->e:B

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/y;->f:B

    invoke-virtual {v3, v4, v5, v2}, Lcom/fimi/soul/drone/h/an;->a(III)V

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/av;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->t()Lcom/fimi/soul/drone/h/ai;

    move-result-object v3

    iget-short v4, v2, Lcom/fimi/soul/drone/c/a/a/av;->d:S

    int-to-double v4, v4

    iget-short v6, v2, Lcom/fimi/soul/drone/c/a/a/av;->e:S

    int-to-double v6, v6

    iget-short v8, v2, Lcom/fimi/soul/drone/c/a/a/av;->f:S

    int-to-double v8, v8

    iget-short v10, v2, Lcom/fimi/soul/drone/c/a/a/av;->g:S

    int-to-double v10, v10

    iget-short v2, v2, Lcom/fimi/soul/drone/c/a/a/av;->h:S

    int-to-double v12, v2

    invoke-virtual/range {v3 .. v13}, Lcom/fimi/soul/drone/h/ai;->a(DDDDD)V

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/a;->b(Z)V

    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/am;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->i:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v4, "2"

    iget-object v5, v2, Lcom/fimi/soul/drone/c/a/a/am;->d:Lcom/fimi/soul/drone/c/a/c;

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->r()Lcom/fimi/soul/drone/h/y;

    move-result-object v3

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/am;->h:B

    int-to-double v4, v4

    iget-byte v6, v2, Lcom/fimi/soul/drone/c/a/a/am;->f:B

    int-to-double v6, v6

    iget-short v8, v2, Lcom/fimi/soul/drone/c/a/a/am;->j:S

    int-to-double v8, v8

    iget-short v10, v2, Lcom/fimi/soul/drone/c/a/a/am;->k:S

    int-to-double v10, v10

    iget-short v12, v2, Lcom/fimi/soul/drone/c/a/a/am;->l:S

    int-to-double v12, v12

    iget-byte v14, v2, Lcom/fimi/soul/drone/c/a/a/am;->i:B

    int-to-double v14, v14

    iget-byte v0, v2, Lcom/fimi/soul/drone/c/a/a/am;->g:B

    move/from16 v16, v0

    move/from16 v0, v16

    int-to-double v0, v0

    move-wide/from16 v16, v0

    iget-byte v0, v2, Lcom/fimi/soul/drone/c/a/a/am;->e:B

    move/from16 v18, v0

    iget-byte v0, v2, Lcom/fimi/soul/drone/c/a/a/am;->m:B

    move/from16 v19, v0

    iget-byte v0, v2, Lcom/fimi/soul/drone/c/a/a/am;->n:B

    move/from16 v20, v0

    iget-byte v0, v2, Lcom/fimi/soul/drone/c/a/a/am;->q:B

    move/from16 v21, v0

    iget-byte v0, v2, Lcom/fimi/soul/drone/c/a/a/am;->r:B

    move/from16 v22, v0

    iget-short v0, v2, Lcom/fimi/soul/drone/c/a/a/am;->o:S

    move/from16 v23, v0

    move/from16 v0, v23

    int-to-double v0, v0

    move-wide/from16 v23, v0

    iget-short v0, v2, Lcom/fimi/soul/drone/c/a/a/am;->p:S

    move/from16 v25, v0

    move/from16 v0, v25

    int-to-double v0, v0

    move-wide/from16 v25, v0

    invoke-virtual/range {v3 .. v26}, Lcom/fimi/soul/drone/h/y;->a(DDDDDDDBBIBBDD)V

    iget-byte v3, v2, Lcom/fimi/soul/drone/c/a/a/am;->r:B

    and-int/lit16 v3, v3, 0xf0

    shr-int/lit8 v3, v3, 0x4

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v3

    const/4 v4, 0x1

    invoke-interface {v3, v4}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->b(Z)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/a;->c(Z)V

    const/4 v3, 0x1

    move-object/from16 v0, p0

    iput-boolean v3, v0, Lcom/fimi/soul/drone/a/a;->f:Z

    :goto_1
    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/am;->r:B

    and-int/lit8 v2, v2, 0xf

    const/4 v3, 0x1

    if-ne v2, v3, :cond_3

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/a;->d(Z)V

    :goto_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-static {v2}, Lcom/fimi/soul/drone/d/u;->a(Lcom/fimi/soul/drone/a;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    sget-object v3, Lcom/fimi/soul/drone/d$a;->bW:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :cond_1
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/a;->c(Z)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->b(Z)V

    move-object/from16 v0, p0

    iget-boolean v3, v0, Lcom/fimi/soul/drone/a/a;->f:Z

    if-eqz v3, :cond_2

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    sget-object v4, Lcom/fimi/soul/drone/d$a;->bH:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    :cond_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    iget-object v3, v3, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-static {v3}, Lcom/fimi/soul/biz/c/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/c/h;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lcom/fimi/soul/biz/c/h;->a(I)V

    const/4 v3, 0x0

    move-object/from16 v0, p0

    iput-boolean v3, v0, Lcom/fimi/soul/drone/a/a;->f:Z

    goto :goto_1

    :cond_3
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/a;->d(Z)V

    goto :goto_2

    :sswitch_8
    move-object/from16 v12, p1

    check-cast v12, Lcom/fimi/soul/drone/c/a/a/ar;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->i:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v3, "3"

    iget-object v4, v12, Lcom/fimi/soul/drone/c/a/a/ar;->k:Lcom/fimi/soul/drone/c/a/c;

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->u()Lcom/fimi/soul/drone/h/ag;

    move-result-object v2

    iget-short v3, v12, Lcom/fimi/soul/drone/c/a/a/ar;->d:S

    int-to-double v3, v3

    iget-byte v5, v12, Lcom/fimi/soul/drone/c/a/a/ar;->e:B

    iget v6, v12, Lcom/fimi/soul/drone/c/a/a/ar;->f:F

    iget v7, v12, Lcom/fimi/soul/drone/c/a/a/ar;->g:F

    iget v8, v12, Lcom/fimi/soul/drone/c/a/a/ar;->h:F

    float-to-double v8, v8

    iget v10, v12, Lcom/fimi/soul/drone/c/a/a/ar;->i:F

    float-to-double v10, v10

    iget-byte v12, v12, Lcom/fimi/soul/drone/c/a/a/ar;->j:B

    invoke-virtual/range {v2 .. v12}, Lcom/fimi/soul/drone/h/ag;->a(DBFFDDB)V

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/ap;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->i:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v4, "4"

    iget-object v5, v2, Lcom/fimi/soul/drone/c/a/a/ap;->i:Lcom/fimi/soul/drone/c/a/c;

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->v()Lcom/fimi/soul/drone/h/z;

    move-result-object v3

    iget v4, v2, Lcom/fimi/soul/drone/c/a/a/ap;->d:F

    float-to-double v4, v4

    iget v6, v2, Lcom/fimi/soul/drone/c/a/a/ap;->e:F

    float-to-double v6, v6

    iget v8, v2, Lcom/fimi/soul/drone/c/a/a/ap;->f:F

    float-to-double v8, v8

    iget-byte v10, v2, Lcom/fimi/soul/drone/c/a/a/ap;->g:B

    iget v11, v2, Lcom/fimi/soul/drone/c/a/a/ap;->h:F

    iget-byte v12, v2, Lcom/fimi/soul/drone/c/a/a/ap;->j:B

    invoke-virtual/range {v3 .. v12}, Lcom/fimi/soul/drone/h/z;->a(DDDIFB)V

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v15, p1

    check-cast v15, Lcom/fimi/soul/drone/c/a/a/e;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->i:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v3, "5"

    iget-object v4, v15, Lcom/fimi/soul/drone/c/a/a/e;->r:Lcom/fimi/soul/drone/c/a/c;

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v2

    iget-byte v3, v15, Lcom/fimi/soul/drone/c/a/a/e;->d:B

    iget-byte v4, v15, Lcom/fimi/soul/drone/c/a/a/e;->e:B

    iget-byte v5, v15, Lcom/fimi/soul/drone/c/a/a/e;->f:B

    iget-byte v6, v15, Lcom/fimi/soul/drone/c/a/a/e;->g:B

    iget-byte v7, v15, Lcom/fimi/soul/drone/c/a/a/e;->h:B

    iget-byte v8, v15, Lcom/fimi/soul/drone/c/a/a/e;->i:B

    iget-short v9, v15, Lcom/fimi/soul/drone/c/a/a/e;->j:S

    iget-short v10, v15, Lcom/fimi/soul/drone/c/a/a/e;->k:S

    iget-byte v11, v15, Lcom/fimi/soul/drone/c/a/a/e;->l:B

    iget-byte v12, v15, Lcom/fimi/soul/drone/c/a/a/e;->n:B

    iget-byte v13, v15, Lcom/fimi/soul/drone/c/a/a/e;->o:B

    iget-byte v14, v15, Lcom/fimi/soul/drone/c/a/a/e;->p:B

    iget-byte v15, v15, Lcom/fimi/soul/drone/c/a/a/e;->q:B

    invoke-virtual/range {v2 .. v15}, Lcom/fimi/soul/drone/h/d;->a(BBBBBBSSBBBBB)V

    goto/16 :goto_0

    :sswitch_b
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/bd;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->s()Lcom/fimi/soul/drone/h/v;

    move-result-object v3

    iget v4, v2, Lcom/fimi/soul/drone/c/a/a/bd;->d:F

    float-to-double v4, v4

    iget v6, v2, Lcom/fimi/soul/drone/c/a/a/bd;->e:F

    float-to-double v6, v6

    iget v8, v2, Lcom/fimi/soul/drone/c/a/a/bd;->f:F

    float-to-double v8, v8

    iget-short v10, v2, Lcom/fimi/soul/drone/c/a/a/bd;->g:S

    int-to-double v10, v10

    iget-short v12, v2, Lcom/fimi/soul/drone/c/a/a/bd;->h:S

    int-to-double v12, v12

    iget-byte v14, v2, Lcom/fimi/soul/drone/c/a/a/bd;->i:B

    iget-short v2, v2, Lcom/fimi/soul/drone/c/a/a/bd;->j:S

    int-to-double v15, v2

    invoke-virtual/range {v3 .. v16}, Lcom/fimi/soul/drone/h/v;->a(DDDDDBD)V

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v13, p1

    check-cast v13, Lcom/fimi/soul/drone/c/a/a/w;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->h()Lcom/fimi/soul/drone/h/a/b;

    move-result-object v2

    iget-byte v3, v13, Lcom/fimi/soul/drone/c/a/a/w;->d:B

    iget-short v4, v13, Lcom/fimi/soul/drone/c/a/a/w;->e:S

    iget v5, v13, Lcom/fimi/soul/drone/c/a/a/w;->f:F

    iget v6, v13, Lcom/fimi/soul/drone/c/a/a/w;->g:F

    iget-byte v7, v13, Lcom/fimi/soul/drone/c/a/a/w;->h:B

    iget-short v8, v13, Lcom/fimi/soul/drone/c/a/a/w;->i:S

    iget-byte v9, v13, Lcom/fimi/soul/drone/c/a/a/w;->j:B

    iget-byte v10, v13, Lcom/fimi/soul/drone/c/a/a/w;->k:B

    iget-byte v11, v13, Lcom/fimi/soul/drone/c/a/a/w;->l:B

    iget-byte v12, v13, Lcom/fimi/soul/drone/c/a/a/w;->m:B

    iget-byte v13, v13, Lcom/fimi/soul/drone/c/a/a/w;->n:B

    invoke-virtual/range {v2 .. v13}, Lcom/fimi/soul/drone/h/a/b;->a(BSFFBSBBBBB)V

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/at;

    goto/16 :goto_0

    :sswitch_e
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/o;

    goto/16 :goto_0

    :sswitch_f
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-static {v2}, Lcom/fimi/soul/module/b/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/b/d;

    move-result-object v2

    const/16 v3, 0x81

    invoke-virtual {v2, v3}, Lcom/fimi/soul/module/b/d;->c(I)V

    move-object/from16 v15, p1

    check-cast v15, Lcom/fimi/soul/drone/c/a/a/au;

    iget-byte v2, v15, Lcom/fimi/soul/drone/c/a/a/au;->n:B

    invoke-static {v2}, Lcom/fimi/soul/biz/j/b;->a(I)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->q()Lcom/fimi/soul/drone/h/ak;

    move-result-object v2

    iget-byte v3, v15, Lcom/fimi/soul/drone/c/a/a/au;->d:B

    int-to-double v3, v3

    iget-byte v5, v15, Lcom/fimi/soul/drone/c/a/a/au;->e:B

    iget v6, v15, Lcom/fimi/soul/drone/c/a/a/au;->f:F

    iget v7, v15, Lcom/fimi/soul/drone/c/a/a/au;->g:F

    iget-short v8, v15, Lcom/fimi/soul/drone/c/a/a/au;->h:S

    int-to-double v8, v8

    iget-short v10, v15, Lcom/fimi/soul/drone/c/a/a/au;->i:S

    iget-byte v11, v15, Lcom/fimi/soul/drone/c/a/a/au;->j:B

    iget-byte v12, v15, Lcom/fimi/soul/drone/c/a/a/au;->k:B

    iget-byte v13, v15, Lcom/fimi/soul/drone/c/a/a/au;->l:B

    iget-byte v14, v15, Lcom/fimi/soul/drone/c/a/a/au;->m:B

    iget-byte v15, v15, Lcom/fimi/soul/drone/c/a/a/au;->n:B

    invoke-virtual/range {v2 .. v15}, Lcom/fimi/soul/drone/h/ak;->a(DIFFDSIIBBB)V

    goto/16 :goto_0

    :sswitch_10
    move-object/from16 v14, p1

    check-cast v14, Lcom/fimi/soul/drone/c/a/a/ae;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->m()Lcom/fimi/soul/drone/h/am;

    move-result-object v2

    iget-short v3, v14, Lcom/fimi/soul/drone/c/a/a/ae;->d:S

    iget v4, v14, Lcom/fimi/soul/drone/c/a/a/ae;->e:F

    iget v5, v14, Lcom/fimi/soul/drone/c/a/a/ae;->f:F

    iget-short v6, v14, Lcom/fimi/soul/drone/c/a/a/ae;->g:S

    int-to-double v6, v6

    iget-short v8, v14, Lcom/fimi/soul/drone/c/a/a/ae;->h:S

    int-to-double v8, v8

    iget-byte v10, v14, Lcom/fimi/soul/drone/c/a/a/ae;->i:B

    int-to-double v10, v10

    iget-byte v12, v14, Lcom/fimi/soul/drone/c/a/a/ae;->j:B

    int-to-double v12, v12

    iget-short v14, v14, Lcom/fimi/soul/drone/c/a/a/ae;->k:S

    invoke-virtual/range {v2 .. v14}, Lcom/fimi/soul/drone/h/am;->a(IFFDDDDI)V

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Lcom/fimi/soul/module/calibcompass/a;->a()Lcom/fimi/soul/module/calibcompass/a;

    move-result-object v2

    const-string v3, "131"

    invoke-virtual {v2, v3}, Lcom/fimi/soul/module/calibcompass/a;->a(Ljava/lang/String;)V

    move-object/from16 v16, p1

    check-cast v16, Lcom/fimi/soul/drone/c/a/a/bb;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->l()Lcom/fimi/soul/drone/h/al;

    move-result-object v2

    move-object/from16 v0, v16

    iget-short v3, v0, Lcom/fimi/soul/drone/c/a/a/bb;->d:S

    move-object/from16 v0, v16

    iget v4, v0, Lcom/fimi/soul/drone/c/a/a/bb;->e:F

    move-object/from16 v0, v16

    iget v5, v0, Lcom/fimi/soul/drone/c/a/a/bb;->f:F

    move-object/from16 v0, v16

    iget-short v6, v0, Lcom/fimi/soul/drone/c/a/a/bb;->g:S

    int-to-double v6, v6

    move-object/from16 v0, v16

    iget-short v8, v0, Lcom/fimi/soul/drone/c/a/a/bb;->h:S

    int-to-double v8, v8

    move-object/from16 v0, v16

    iget-byte v10, v0, Lcom/fimi/soul/drone/c/a/a/bb;->i:B

    int-to-double v10, v10

    move-object/from16 v0, v16

    iget-byte v12, v0, Lcom/fimi/soul/drone/c/a/a/bb;->k:B

    int-to-double v12, v12

    move-object/from16 v0, v16

    iget-short v14, v0, Lcom/fimi/soul/drone/c/a/a/bb;->l:S

    int-to-double v14, v14

    move-object/from16 v0, v16

    iget-byte v0, v0, Lcom/fimi/soul/drone/c/a/a/bb;->j:B

    move/from16 v16, v0

    invoke-virtual/range {v2 .. v16}, Lcom/fimi/soul/drone/h/al;->a(IFFDDDDDB)V

    goto/16 :goto_0

    :sswitch_12
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/be;

    goto/16 :goto_0

    :sswitch_13
    move-object/from16 v16, p1

    check-cast v16, Lcom/fimi/soul/drone/c/a/a/p;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->o()Lcom/fimi/soul/drone/h/as;

    move-result-object v2

    move-object/from16 v0, v16

    iget-byte v3, v0, Lcom/fimi/soul/drone/c/a/a/p;->d:B

    int-to-double v3, v3

    move-object/from16 v0, v16

    iget v5, v0, Lcom/fimi/soul/drone/c/a/a/p;->f:F

    move-object/from16 v0, v16

    iget v6, v0, Lcom/fimi/soul/drone/c/a/a/p;->g:F

    move-object/from16 v0, v16

    iget-short v7, v0, Lcom/fimi/soul/drone/c/a/a/p;->h:S

    int-to-double v7, v7

    move-object/from16 v0, v16

    iget-byte v9, v0, Lcom/fimi/soul/drone/c/a/a/p;->i:B

    move-object/from16 v0, v16

    iget-byte v10, v0, Lcom/fimi/soul/drone/c/a/a/p;->j:B

    int-to-double v10, v10

    move-object/from16 v0, v16

    iget-byte v12, v0, Lcom/fimi/soul/drone/c/a/a/p;->k:B

    int-to-double v12, v12

    move-object/from16 v0, v16

    iget-byte v14, v0, Lcom/fimi/soul/drone/c/a/a/p;->l:B

    int-to-double v14, v14

    move-object/from16 v0, v16

    iget-byte v0, v0, Lcom/fimi/soul/drone/c/a/a/p;->e:B

    move/from16 v16, v0

    invoke-virtual/range {v2 .. v16}, Lcom/fimi/soul/drone/h/as;->a(DFFDBDDDB)V

    goto/16 :goto_0

    :sswitch_14
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/j;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->p()Lcom/fimi/soul/drone/h/n;

    move-result-object v3

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/j;->d:B

    iget-byte v5, v2, Lcom/fimi/soul/drone/c/a/a/j;->e:B

    iget v6, v2, Lcom/fimi/soul/drone/c/a/a/j;->f:F

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/j;->g:B

    invoke-virtual {v3, v4, v5, v6, v2}, Lcom/fimi/soul/drone/h/n;->a(BBFB)V

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/ai;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->j()Lcom/fimi/soul/drone/h/u;

    move-result-object v3

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/ai;->d:B

    iget-char v5, v2, Lcom/fimi/soul/drone/c/a/a/ai;->f:C

    iget-short v6, v2, Lcom/fimi/soul/drone/c/a/a/ai;->g:S

    iget-byte v7, v2, Lcom/fimi/soul/drone/c/a/a/ai;->e:B

    iget-wide v8, v2, Lcom/fimi/soul/drone/c/a/a/ai;->h:J

    iget-wide v10, v2, Lcom/fimi/soul/drone/c/a/a/ai;->i:J

    iget-wide v12, v2, Lcom/fimi/soul/drone/c/a/a/ai;->j:J

    iget-wide v14, v2, Lcom/fimi/soul/drone/c/a/a/ai;->k:J

    invoke-virtual/range {v3 .. v15}, Lcom/fimi/soul/drone/h/u;->a(BCSBJJJJ)V

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v13, p1

    check-cast v13, Lcom/fimi/soul/drone/c/a/a/bh;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->i:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v3, "100"

    iget-object v4, v13, Lcom/fimi/soul/drone/c/a/a/bh;->o:Lcom/fimi/soul/drone/c/a/c;

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->M()Lcom/fimi/soul/drone/h/at;

    move-result-object v2

    iget-byte v3, v13, Lcom/fimi/soul/drone/c/a/a/bh;->d:B

    iget-byte v4, v13, Lcom/fimi/soul/drone/c/a/a/bh;->e:B

    iget-byte v5, v13, Lcom/fimi/soul/drone/c/a/a/bh;->f:B

    iget-byte v6, v13, Lcom/fimi/soul/drone/c/a/a/bh;->g:B

    iget-byte v7, v13, Lcom/fimi/soul/drone/c/a/a/bh;->h:B

    iget-byte v8, v13, Lcom/fimi/soul/drone/c/a/a/bh;->i:B

    iget-byte v9, v13, Lcom/fimi/soul/drone/c/a/a/bh;->j:B

    iget-byte v10, v13, Lcom/fimi/soul/drone/c/a/a/bh;->k:B

    iget-byte v11, v13, Lcom/fimi/soul/drone/c/a/a/bh;->l:B

    iget-byte v12, v13, Lcom/fimi/soul/drone/c/a/a/bh;->m:B

    iget-byte v13, v13, Lcom/fimi/soul/drone/c/a/a/bh;->n:B

    invoke-virtual/range {v2 .. v13}, Lcom/fimi/soul/drone/h/at;->a(BBBBBBBBBBB)V

    goto/16 :goto_0

    :sswitch_17
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/bf;

    iget-byte v3, v2, Lcom/fimi/soul/drone/c/a/a/bf;->d:B

    const/16 v4, 0x72

    if-ne v3, v4, :cond_4

    invoke-static {}, Lcom/fimi/soul/biz/h/a;->a()Lcom/fimi/soul/biz/h/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/fimi/soul/biz/h/a;->b()Ljava/util/HashMap;

    move-result-object v3

    const/16 v4, 0x62

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v5, v2, Lcom/fimi/soul/drone/c/a/a/bf;->g:Lcom/fimi/soul/drone/c/a/c;

    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/fimi/soul/drone/droneconnection/connection/c;->a()Lcom/fimi/soul/drone/droneconnection/connection/c;

    move-result-object v3

    iget-object v4, v2, Lcom/fimi/soul/drone/c/a/a/bf;->g:Lcom/fimi/soul/drone/c/a/c;

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/droneconnection/connection/c;->a(Lcom/fimi/soul/drone/c/a/c;)V

    :cond_4
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->L()Lcom/fimi/soul/drone/h/c;

    move-result-object v3

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/bf;->d:B

    iget-byte v5, v2, Lcom/fimi/soul/drone/c/a/a/bf;->e:B

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/bf;->f:B

    invoke-virtual {v3, v4, v5, v2}, Lcom/fimi/soul/drone/h/c;->a(BBB)V

    goto/16 :goto_0

    :sswitch_18
    move-object/from16 v8, p1

    check-cast v8, Lcom/fimi/soul/drone/c/a/a/bg;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->K()Lcom/fimi/soul/drone/h/ao;

    move-result-object v2

    iget-byte v3, v8, Lcom/fimi/soul/drone/c/a/a/bg;->d:B

    iget-byte v4, v8, Lcom/fimi/soul/drone/c/a/a/bg;->e:B

    iget-byte v5, v8, Lcom/fimi/soul/drone/c/a/a/bg;->f:B

    iget-byte v6, v8, Lcom/fimi/soul/drone/c/a/a/bg;->g:B

    iget-byte v7, v8, Lcom/fimi/soul/drone/c/a/a/bg;->h:B

    iget-byte v8, v8, Lcom/fimi/soul/drone/c/a/a/bg;->i:B

    invoke-virtual/range {v2 .. v8}, Lcom/fimi/soul/drone/h/ao;->a(BBBBBB)V

    goto/16 :goto_0

    :sswitch_19
    move-object/from16 v7, p1

    check-cast v7, Lcom/fimi/soul/drone/c/a/a/af;

    invoke-static {}, Lcom/fimi/soul/biz/h/a;->a()Lcom/fimi/soul/biz/h/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/biz/h/a;->b()Ljava/util/HashMap;

    move-result-object v2

    const/16 v3, 0xc6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, v7, Lcom/fimi/soul/drone/c/a/a/af;->i:Lcom/fimi/soul/drone/c/a/c;

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/fimi/soul/drone/droneconnection/connection/c;->a()Lcom/fimi/soul/drone/droneconnection/connection/c;

    move-result-object v2

    iget-object v3, v7, Lcom/fimi/soul/drone/c/a/a/af;->i:Lcom/fimi/soul/drone/c/a/c;

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/droneconnection/connection/c;->a(Lcom/fimi/soul/drone/c/a/c;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->D()Lcom/fimi/soul/drone/h/e;

    move-result-object v2

    iget-short v3, v7, Lcom/fimi/soul/drone/c/a/a/af;->d:S

    iget-short v4, v7, Lcom/fimi/soul/drone/c/a/a/af;->e:S

    iget-short v5, v7, Lcom/fimi/soul/drone/c/a/a/af;->g:S

    iget-short v6, v7, Lcom/fimi/soul/drone/c/a/a/af;->h:S

    iget-short v7, v7, Lcom/fimi/soul/drone/c/a/a/af;->f:S

    invoke-virtual/range {v2 .. v7}, Lcom/fimi/soul/drone/h/e;->a(SSSSS)V

    goto/16 :goto_0

    :sswitch_1a
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/ak;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    sget-object v4, Lcom/fimi/soul/drone/d$a;->z:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/ak;->e:B

    invoke-static {v2}, Lcom/fimi/soul/biz/j/b;->a(I)V

    goto/16 :goto_0

    :sswitch_1b
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/ao;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    sget-object v4, Lcom/fimi/soul/drone/d$a;->A:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/ao;->e:B

    invoke-static {v2}, Lcom/fimi/soul/biz/j/b;->a(I)V

    goto/16 :goto_0

    :sswitch_1c
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/bc;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->e:Lcom/fimi/soul/module/dronemanage/b;

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/bc;->e:B

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/fimi/soul/drone/a/a;->b:Landroid/content/Context;

    invoke-virtual {v3, v2, v4}, Lcom/fimi/soul/module/dronemanage/b;->a(ILandroid/content/Context;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    sget-object v3, Lcom/fimi/soul/drone/d$a;->B:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :sswitch_1d
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/an;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->J()Lcom/fimi/soul/drone/h/ar;

    move-result-object v3

    iget-short v4, v2, Lcom/fimi/soul/drone/c/a/a/an;->d:S

    iget-byte v5, v2, Lcom/fimi/soul/drone/c/a/a/an;->e:B

    invoke-virtual {v3, v4, v5}, Lcom/fimi/soul/drone/h/ar;->a(SB)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-static {v3}, Lcom/fimi/soul/module/b/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/b/d;

    move-result-object v3

    const/16 v4, 0x93

    invoke-virtual {v3, v4}, Lcom/fimi/soul/module/b/d;->c(I)V

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/an;->f:B

    invoke-static {v2}, Lcom/fimi/soul/biz/j/b;->a(I)V

    goto/16 :goto_0

    :sswitch_1e
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-static {v2}, Lcom/fimi/soul/module/b/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/b/d;

    move-result-object v2

    const/16 v3, 0x94

    invoke-virtual {v2, v3}, Lcom/fimi/soul/module/b/d;->c(I)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    sget-object v3, Lcom/fimi/soul/drone/d$a;->bw:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/ag;

    iget-byte v3, v2, Lcom/fimi/soul/drone/c/a/a/ag;->e:B

    invoke-static {v3}, Lcom/fimi/soul/biz/j/b;->a(I)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->F()Lcom/fimi/soul/drone/h/r;

    move-result-object v3

    iget-short v4, v2, Lcom/fimi/soul/drone/c/a/a/ag;->d:S

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/ag;->e:B

    invoke-virtual {v3, v4, v2}, Lcom/fimi/soul/drone/h/r;->a(SB)V

    goto/16 :goto_0

    :sswitch_1f
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/b;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    sget-object v4, Lcom/fimi/soul/drone/d$a;->R:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->n()Lcom/fimi/soul/drone/h/aj;

    move-result-object v3

    iget-short v4, v2, Lcom/fimi/soul/drone/c/a/a/b;->d:S

    int-to-double v4, v4

    iget-byte v6, v2, Lcom/fimi/soul/drone/c/a/a/b;->e:B

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/b;->f:B

    invoke-virtual {v3, v4, v5, v6, v2}, Lcom/fimi/soul/drone/h/aj;->a(DBB)V

    goto/16 :goto_0

    :sswitch_20
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/aj;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->i:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v4, "16"

    iget-object v5, v2, Lcom/fimi/soul/drone/c/a/a/aj;->e:Lcom/fimi/soul/drone/c/a/c;

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->S()Lcom/fimi/soul/drone/h/x;

    move-result-object v3

    invoke-virtual {v2}, Lcom/fimi/soul/drone/c/a/a/aj;->b()Lcom/fimi/soul/drone/h/x;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/x;->b()S

    move-result v2

    invoke-virtual {v3, v2}, Lcom/fimi/soul/drone/h/x;->a(S)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    sget-object v3, Lcom/fimi/soul/drone/d$a;->aC:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :sswitch_21
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    sget-object v3, Lcom/fimi/soul/drone/d$a;->aD:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :sswitch_22
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/d;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->X()Lcom/fimi/soul/drone/h/f;

    move-result-object v3

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/d;->d:B

    iget-byte v5, v2, Lcom/fimi/soul/drone/c/a/a/d;->e:B

    iget-byte v6, v2, Lcom/fimi/soul/drone/c/a/a/d;->f:B

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/d;->g:B

    invoke-virtual {v3, v4, v5, v6, v2}, Lcom/fimi/soul/drone/h/f;->a(BBBB)V

    goto/16 :goto_0

    :sswitch_23
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/n;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->i:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v4, "9"

    iget-object v5, v2, Lcom/fimi/soul/drone/c/a/a/n;->b:Lcom/fimi/soul/drone/c/a/c;

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->ad()Lcom/fimi/soul/drone/h/q;

    move-result-object v3

    invoke-virtual {v2}, Lcom/fimi/soul/drone/c/a/a/n;->b()I

    move-result v4

    invoke-virtual {v2}, Lcom/fimi/soul/drone/c/a/a/n;->c()I

    move-result v2

    invoke-virtual {v3, v4, v2}, Lcom/fimi/soul/drone/h/q;->a(II)V

    goto/16 :goto_0

    :sswitch_24
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/aa;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->Z()Lcom/fimi/soul/drone/h/ap;

    move-result-object v3

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/aa;->d:B

    invoke-virtual {v3, v2}, Lcom/fimi/soul/drone/h/ap;->a(I)V

    goto/16 :goto_0

    :sswitch_25
    move-object/from16 v7, p1

    check-cast v7, Lcom/fimi/soul/drone/c/a/a/c;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->i()Lcom/fimi/soul/drone/h/j;

    move-result-object v2

    iget-byte v3, v7, Lcom/fimi/soul/drone/c/a/a/c;->d:B

    iget-byte v4, v7, Lcom/fimi/soul/drone/c/a/a/c;->e:B

    iget-byte v5, v7, Lcom/fimi/soul/drone/c/a/a/c;->f:B

    iget-byte v6, v7, Lcom/fimi/soul/drone/c/a/a/c;->g:B

    iget-byte v7, v7, Lcom/fimi/soul/drone/c/a/a/c;->h:B

    invoke-virtual/range {v2 .. v7}, Lcom/fimi/soul/drone/h/j;->a(BBBBB)V

    goto/16 :goto_0

    :sswitch_26
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-static {v2}, Lcom/fimi/soul/module/b/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/b/d;

    move-result-object v2

    const/16 v3, 0x99

    invoke-virtual {v2, v3}, Lcom/fimi/soul/module/b/d;->c(I)V

    move-object/from16 v8, p1

    check-cast v8, Lcom/fimi/soul/drone/c/a/a/r;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/h/aa;

    move-result-object v2

    iget-short v3, v8, Lcom/fimi/soul/drone/c/a/a/r;->f:S

    iget-short v4, v8, Lcom/fimi/soul/drone/c/a/a/r;->g:S

    iget-short v5, v8, Lcom/fimi/soul/drone/c/a/a/r;->h:S

    iget-short v6, v8, Lcom/fimi/soul/drone/c/a/a/r;->i:S

    iget-short v7, v8, Lcom/fimi/soul/drone/c/a/a/r;->j:S

    iget-short v8, v8, Lcom/fimi/soul/drone/c/a/a/r;->k:S

    invoke-virtual/range {v2 .. v8}, Lcom/fimi/soul/drone/h/aa;->a(SSSSSS)V

    goto/16 :goto_0

    :sswitch_27
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-static {v2}, Lcom/fimi/soul/module/b/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/b/d;

    move-result-object v2

    const/16 v3, 0x99

    invoke-virtual {v2, v3}, Lcom/fimi/soul/module/b/d;->c(I)V

    move-object/from16 v8, p1

    check-cast v8, Lcom/fimi/soul/drone/c/a/a/i;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->z()Lcom/fimi/soul/drone/h/k;

    move-result-object v2

    iget-short v3, v8, Lcom/fimi/soul/drone/c/a/a/i;->f:S

    iget-short v4, v8, Lcom/fimi/soul/drone/c/a/a/i;->g:S

    iget-short v5, v8, Lcom/fimi/soul/drone/c/a/a/i;->h:S

    iget-short v6, v8, Lcom/fimi/soul/drone/c/a/a/i;->i:S

    iget-short v7, v8, Lcom/fimi/soul/drone/c/a/a/i;->j:S

    iget-short v8, v8, Lcom/fimi/soul/drone/c/a/a/i;->k:S

    invoke-virtual/range {v2 .. v8}, Lcom/fimi/soul/drone/h/k;->a(SSSSSS)V

    goto/16 :goto_0

    :sswitch_28
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/s;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->y()Lcom/fimi/soul/drone/h/ab;

    move-result-object v3

    iget v4, v2, Lcom/fimi/soul/drone/c/a/a/s;->g:I

    iget v5, v2, Lcom/fimi/soul/drone/c/a/a/s;->h:I

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/s;->f:B

    invoke-virtual {v3, v4, v5, v2}, Lcom/fimi/soul/drone/h/ab;->a(IIB)V

    goto/16 :goto_0

    :sswitch_29
    move-object/from16 v9, p1

    check-cast v9, Lcom/fimi/soul/drone/c/a/a/u;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v2

    iget-byte v3, v9, Lcom/fimi/soul/drone/c/a/a/u;->d:B

    iget-byte v4, v9, Lcom/fimi/soul/drone/c/a/a/u;->e:B

    iget-byte v5, v9, Lcom/fimi/soul/drone/c/a/a/u;->f:B

    iget-byte v6, v9, Lcom/fimi/soul/drone/c/a/a/u;->g:B

    iget-byte v7, v9, Lcom/fimi/soul/drone/c/a/a/u;->h:B

    iget-byte v8, v9, Lcom/fimi/soul/drone/c/a/a/u;->i:B

    iget-byte v9, v9, Lcom/fimi/soul/drone/c/a/a/u;->j:B

    invoke-virtual/range {v2 .. v9}, Lcom/fimi/soul/drone/h/a/e;->a(BBBBBBB)V

    goto/16 :goto_0

    :sswitch_2a
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/q;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->ak()Lcom/fimi/soul/drone/h/w;

    move-result-object v3

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/q;->d:B

    iget-byte v5, v2, Lcom/fimi/soul/drone/c/a/a/q;->e:B

    iget-byte v6, v2, Lcom/fimi/soul/drone/c/a/a/q;->f:B

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/q;->g:B

    invoke-virtual {v3, v4, v5, v6, v2}, Lcom/fimi/soul/drone/h/w;->a(BBBB)V

    goto/16 :goto_0

    :sswitch_2b
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/v;

    iget-object v3, v2, Lcom/fimi/soul/drone/c/a/a/v;->j:Lcom/fimi/soul/drone/c/a/c;

    iget v3, v3, Lcom/fimi/soul/drone/c/a/c;->b:I

    const/16 v4, 0x8

    if-ne v3, v4, :cond_6

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v3

    iget-object v2, v2, Lcom/fimi/soul/drone/c/a/a/v;->j:Lcom/fimi/soul/drone/c/a/c;

    invoke-virtual {v3, v2}, Lcom/fimi/soul/drone/h/ac;->a(Lcom/fimi/soul/drone/c/a/c;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v2

    iget-byte v2, v2, Lcom/fimi/soul/drone/h/ac;->g:B

    if-nez v2, :cond_5

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/h/ac;->a(Z)V

    goto/16 :goto_0

    :cond_5
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/h/ac;->a(Z)V

    goto/16 :goto_0

    :cond_6
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v3

    iget-object v2, v2, Lcom/fimi/soul/drone/c/a/a/v;->j:Lcom/fimi/soul/drone/c/a/c;

    invoke-virtual {v3, v2}, Lcom/fimi/soul/drone/h/ac;->b(Lcom/fimi/soul/drone/c/a/c;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v2

    iget-byte v2, v2, Lcom/fimi/soul/drone/h/ac;->h:B

    const/4 v3, 0x1

    if-ne v2, v3, :cond_7

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v2

    iget-byte v2, v2, Lcom/fimi/soul/drone/h/ac;->g:B

    if-nez v2, :cond_7

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/h/ac;->a(Z)V

    goto/16 :goto_0

    :cond_7
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v2

    iget-byte v2, v2, Lcom/fimi/soul/drone/h/ac;->h:B

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/h/ac;->a(Z)V

    goto/16 :goto_0

    :sswitch_2c
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/bi;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->g()Lcom/fimi/soul/drone/h/ad;

    move-result-object v3

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/bi;->d:B

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/ad;->a(B)V

    iget-short v4, v2, Lcom/fimi/soul/drone/c/a/a/bi;->e:S

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/ad;->h(S)V

    iget-short v4, v2, Lcom/fimi/soul/drone/c/a/a/bi;->f:S

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/ad;->g(S)V

    iget-short v4, v2, Lcom/fimi/soul/drone/c/a/a/bi;->g:S

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/ad;->f(S)V

    iget-short v4, v2, Lcom/fimi/soul/drone/c/a/a/bi;->h:S

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/ad;->e(S)V

    iget-short v4, v2, Lcom/fimi/soul/drone/c/a/a/bi;->i:S

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/ad;->d(S)V

    iget-short v4, v2, Lcom/fimi/soul/drone/c/a/a/bi;->j:S

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/ad;->c(S)V

    iget-short v4, v2, Lcom/fimi/soul/drone/c/a/a/bi;->k:S

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/ad;->b(S)V

    iget-short v4, v2, Lcom/fimi/soul/drone/c/a/a/bi;->l:S

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/ad;->a(S)V

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/bi;->m:B

    invoke-virtual {v3, v2}, Lcom/fimi/soul/drone/h/ad;->b(B)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    move-object/from16 v0, p0

    iget-wide v4, v0, Lcom/fimi/soul/drone/a/a;->h:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x3e8

    cmp-long v2, v2, v4

    if-ltz v2, :cond_8

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    sget-object v3, Lcom/fimi/soul/drone/d$a;->ag:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    move-object/from16 v0, p0

    iput-wide v2, v0, Lcom/fimi/soul/drone/a/a;->h:J

    :cond_8
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    sget-object v3, Lcom/fimi/soul/drone/d$a;->bf:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :sswitch_2d
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/ab;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/ab;->h:B

    invoke-virtual {v3, v2}, Lcom/fimi/soul/drone/a;->b(I)V

    goto/16 :goto_0

    :sswitch_2e
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/t;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->e()Lcom/fimi/soul/drone/h/ae;

    move-result-object v3

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/t;->k:B

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/ae;->a(B)V

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/t;->l:B

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/ae;->b(B)V

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/t;->m:B

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/ae;->c(B)V

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/t;->n:B

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/ae;->d(B)V

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/t;->o:B

    invoke-virtual {v3, v2}, Lcom/fimi/soul/drone/h/ae;->e(B)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    sget-object v3, Lcom/fimi/soul/drone/d$a;->bU:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :sswitch_2f
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/k;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->d()Lcom/fimi/soul/drone/h/o;

    move-result-object v3

    invoke-virtual {v2}, Lcom/fimi/soul/drone/c/a/a/k;->f()[B

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/o;->a([B)V

    invoke-virtual {v2}, Lcom/fimi/soul/drone/c/a/a/k;->l()B

    move-result v4

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/o;->d(B)V

    invoke-virtual {v2}, Lcom/fimi/soul/drone/c/a/a/k;->m()B

    move-result v4

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/o;->e(B)V

    invoke-virtual {v2}, Lcom/fimi/soul/drone/c/a/a/k;->n()B

    move-result v2

    invoke-virtual {v3, v2}, Lcom/fimi/soul/drone/h/o;->f(B)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    sget-object v3, Lcom/fimi/soul/drone/d$a;->bX:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :sswitch_30
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/l;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->d()Lcom/fimi/soul/drone/h/o;

    move-result-object v3

    invoke-virtual {v2}, Lcom/fimi/soul/drone/c/a/a/l;->b()[B

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/o;->a([B)V

    invoke-virtual {v2}, Lcom/fimi/soul/drone/c/a/a/l;->c()B

    move-result v2

    invoke-virtual {v3, v2}, Lcom/fimi/soul/drone/h/o;->f(B)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    sget-object v3, Lcom/fimi/soul/drone/d$a;->bX:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :sswitch_31
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-static {v2}, Lcom/fimi/soul/module/b/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/b/d;

    move-result-object v2

    const/16 v3, 0x86

    invoke-virtual {v2, v3}, Lcom/fimi/soul/module/b/d;->c(I)V

    move-object/from16 v12, p1

    check-cast v12, Lcom/fimi/soul/drone/c/a/a/ac;

    iget-byte v2, v12, Lcom/fimi/soul/drone/c/a/a/ac;->m:B

    invoke-static {v2}, Lcom/fimi/soul/biz/j/b;->a(I)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->ap()Lcom/fimi/soul/drone/h/a/a;

    move-result-object v2

    iget-byte v3, v12, Lcom/fimi/soul/drone/c/a/a/ac;->d:B

    iget-byte v4, v12, Lcom/fimi/soul/drone/c/a/a/ac;->e:B

    iget-byte v5, v12, Lcom/fimi/soul/drone/c/a/a/ac;->f:B

    iget-short v6, v12, Lcom/fimi/soul/drone/c/a/a/ac;->g:S

    iget-short v7, v12, Lcom/fimi/soul/drone/c/a/a/ac;->h:S

    iget-byte v8, v12, Lcom/fimi/soul/drone/c/a/a/ac;->i:B

    int-to-short v8, v8

    iget-short v9, v12, Lcom/fimi/soul/drone/c/a/a/ac;->j:S

    iget v10, v12, Lcom/fimi/soul/drone/c/a/a/ac;->k:F

    iget v11, v12, Lcom/fimi/soul/drone/c/a/a/ac;->l:F

    iget-byte v12, v12, Lcom/fimi/soul/drone/c/a/a/ac;->m:B

    invoke-virtual/range {v2 .. v12}, Lcom/fimi/soul/drone/h/a/a;->a(BBBSSSSFFB)V

    goto/16 :goto_0

    :sswitch_32
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/m;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->f()Lcom/fimi/soul/drone/h/p;

    move-result-object v3

    iget v4, v2, Lcom/fimi/soul/drone/c/a/a/m;->a:I

    int-to-byte v4, v4

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/p;->a(B)V

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/m;->g:B

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/p;->b(B)V

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/m;->h:B

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/p;->c(B)V

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/m;->i:B

    invoke-virtual {v3, v4}, Lcom/fimi/soul/drone/h/p;->d(B)V

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/m;->j:B

    invoke-virtual {v3, v2}, Lcom/fimi/soul/drone/h/p;->e(B)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    sget-object v3, Lcom/fimi/soul/drone/d$a;->bV:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :sswitch_33
    move-object/from16 v2, p1

    check-cast v2, Lcom/fimi/soul/drone/c/a/a/x;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/fimi/soul/drone/a/a;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->ar()Lcom/fimi/soul/drone/h/ah;

    move-result-object v3

    iget-byte v4, v2, Lcom/fimi/soul/drone/c/a/a/x;->d:B

    iget-byte v5, v2, Lcom/fimi/soul/drone/c/a/a/x;->f:B

    iget-byte v2, v2, Lcom/fimi/soul/drone/c/a/a/x;->e:B

    invoke-virtual {v3, v4, v5, v2}, Lcom/fimi/soul/drone/h/ah;->a(BBB)V

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_6
        0x2 -> :sswitch_7
        0x3 -> :sswitch_8
        0x4 -> :sswitch_9
        0x5 -> :sswitch_a
        0x6 -> :sswitch_b
        0x7 -> :sswitch_c
        0x9 -> :sswitch_23
        0xa -> :sswitch_2d
        0xb -> :sswitch_29
        0xc -> :sswitch_33
        0x10 -> :sswitch_20
        0x26 -> :sswitch_28
        0x27 -> :sswitch_27
        0x28 -> :sswitch_26
        0x34 -> :sswitch_32
        0x62 -> :sswitch_17
        0x63 -> :sswitch_18
        0x64 -> :sswitch_16
        0x66 -> :sswitch_22
        0x69 -> :sswitch_2c
        0x6a -> :sswitch_24
        0x6c -> :sswitch_2e
        0x71 -> :sswitch_21
        0x7a -> :sswitch_2a
        0x80 -> :sswitch_d
        0x81 -> :sswitch_f
        0x82 -> :sswitch_10
        0x83 -> :sswitch_11
        0x84 -> :sswitch_12
        0x85 -> :sswitch_13
        0x86 -> :sswitch_14
        0x87 -> :sswitch_2b
        0x88 -> :sswitch_2f
        0x89 -> :sswitch_30
        0x8a -> :sswitch_e
        0x90 -> :sswitch_1a
        0x91 -> :sswitch_1b
        0x92 -> :sswitch_1c
        0x93 -> :sswitch_1d
        0x94 -> :sswitch_1e
        0x98 -> :sswitch_1f
        0x99 -> :sswitch_25
        0xc1 -> :sswitch_15
        0xc6 -> :sswitch_19
        0xc7 -> :sswitch_1
        0xc8 -> :sswitch_2
        0xc9 -> :sswitch_0
        0xca -> :sswitch_3
        0xcb -> :sswitch_4
        0xcc -> :sswitch_5
        0x123 -> :sswitch_31
    .end sparse-switch
.end method
