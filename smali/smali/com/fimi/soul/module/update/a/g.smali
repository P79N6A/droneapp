.class public Lcom/fimi/soul/module/update/a/g;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/drone/d$b;


# instance fields
.field a:Landroid/content/Context;

.field b:Lcom/fimi/soul/drone/a;

.field c:Lcom/fimi/soul/module/update/a/a;

.field d:Lcom/fimi/soul/biz/camera/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/fimi/soul/drone/a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/fimi/soul/module/update/a/g;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/fimi/soul/module/update/a/g;->b:Lcom/fimi/soul/drone/a;

    invoke-virtual {p2, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    invoke-static {}, Lcom/fimi/soul/module/update/a/a;->a()Lcom/fimi/soul/module/update/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/update/a/g;->c:Lcom/fimi/soul/module/update/a/a;

    invoke-static {}, Lcom/fimi/soul/biz/camera/b;->a()Lcom/fimi/soul/biz/camera/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/b;->d()Lcom/fimi/soul/biz/camera/b/a;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/biz/camera/d;

    iput-object v0, p0, Lcom/fimi/soul/module/update/a/g;->d:Lcom/fimi/soul/biz/camera/d;

    invoke-static {}, Lcom/fimi/kernel/c;->c()Lcom/fimi/kernel/c/a;

    move-result-object v0

    const-string v1, "firmware_info"

    const-class v2, Lcom/fimi/soul/entity/DroneInfoBean;

    invoke-interface {v0, v1, v2}, Lcom/fimi/kernel/c/a;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    return-void
.end method

.method private a(Lcom/fimi/soul/drone/h/u;)V
    .locals 20

    invoke-virtual/range {p1 .. p1}, Lcom/fimi/soul/drone/h/u;->c()S

    move-result v2

    const v3, 0xffff

    and-int v6, v2, v3

    invoke-virtual/range {p1 .. p1}, Lcom/fimi/soul/drone/h/u;->b()C

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lcom/fimi/soul/drone/h/u;->a()B

    move-result v3

    and-int/lit16 v4, v3, 0xff

    invoke-virtual/range {p1 .. p1}, Lcom/fimi/soul/drone/h/u;->d()B

    move-result v5

    invoke-virtual/range {p1 .. p1}, Lcom/fimi/soul/drone/h/u;->e()J

    move-result-wide v8

    invoke-virtual/range {p1 .. p1}, Lcom/fimi/soul/drone/h/u;->f()J

    move-result-wide v10

    invoke-virtual/range {p1 .. p1}, Lcom/fimi/soul/drone/h/u;->g()J

    move-result-wide v12

    invoke-virtual/range {p1 .. p1}, Lcom/fimi/soul/drone/h/u;->h()J

    move-result-wide v14

    if-lez v6, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/fimi/soul/module/update/a/g;->c:Lcom/fimi/soul/module/update/a/a;

    move-object/from16 v16, v0

    new-instance v3, Lcom/fimi/soul/module/update/a/e;

    int-to-long v0, v2

    move-wide/from16 v18, v0

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct/range {v3 .. v15}, Lcom/fimi/soul/module/update/a/e;-><init>(IIILjava/lang/String;JJJJ)V

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lcom/fimi/soul/module/update/a/a;->a(Lcom/fimi/soul/module/update/a/e;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/fimi/soul/module/update/a/g;->c:Lcom/fimi/soul/module/update/a/a;

    invoke-virtual {v2, v4, v6}, Lcom/fimi/soul/module/update/a/a;->a(II)V

    :cond_0
    return-void
.end method

.method private d()V
    .locals 6

    const/16 v5, 0xd

    const/4 v4, 0x4

    iget-object v0, p0, Lcom/fimi/soul/module/update/a/g;->b:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->c:Lcom/fimi/soul/drone/c/a;

    invoke-interface {v0}, Lcom/fimi/soul/drone/c/a;->a()I

    move-result v0

    const/16 v1, 0x33

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/update/a/g;->b:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->c:Lcom/fimi/soul/drone/c/a;

    check-cast v0, Lcom/fimi/soul/drone/h/i;

    iget-object v1, p0, Lcom/fimi/soul/module/update/a/g;->d:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/d;->i()Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/i;->d()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;->setDvVersion(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/fimi/soul/module/update/a/g;->d:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/d;->i()Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;

    move-result-object v1

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/i;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;->setCameraType(I)V

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/e/d;->k()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/module/update/a/g;->c:Lcom/fimi/soul/module/update/a/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/i;->d()I

    move-result v2

    invoke-virtual {v1, v5, v2}, Lcom/fimi/soul/module/update/a/a;->a(II)V

    iget-object v1, p0, Lcom/fimi/soul/module/update/a/g;->c:Lcom/fimi/soul/module/update/a/a;

    new-instance v2, Lcom/fimi/soul/module/update/a/e;

    const-string v3, ""

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/i;->d()I

    move-result v0

    invoke-direct {v2, v3, v5, v0}, Lcom/fimi/soul/module/update/a/e;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v1, v2}, Lcom/fimi/soul/module/update/a/a;->a(Lcom/fimi/soul/module/update/a/e;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/fimi/soul/module/update/a/g;->c:Lcom/fimi/soul/module/update/a/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/i;->d()I

    move-result v2

    invoke-virtual {v1, v4, v2}, Lcom/fimi/soul/module/update/a/a;->a(II)V

    iget-object v1, p0, Lcom/fimi/soul/module/update/a/g;->c:Lcom/fimi/soul/module/update/a/a;

    new-instance v2, Lcom/fimi/soul/module/update/a/e;

    const-string v3, ""

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/i;->d()I

    move-result v0

    invoke-direct {v2, v3, v4, v0}, Lcom/fimi/soul/module/update/a/e;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v1, v2}, Lcom/fimi/soul/module/update/a/a;->a(Lcom/fimi/soul/module/update/a/e;)V

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/update/a/g;->b:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/drone/d/f;->k(Lcom/fimi/soul/drone/a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/a/g;->d:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->u()Lcom/fimi/soul/biz/camera/c/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/e;->j()V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/update/a/g;->b:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/drone/d/f;->j(Lcom/fimi/soul/drone/a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/a/g;->d:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->u()Lcom/fimi/soul/biz/camera/c/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/e;->j()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/update/a/g;->b:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->b(Lcom/fimi/soul/drone/d$b;)V

    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 2

    sget-object v0, Lcom/fimi/soul/module/update/a/g$1;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->j()Lcom/fimi/soul/drone/h/u;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/update/a/g;->a(Lcom/fimi/soul/drone/h/u;)V

    goto :goto_0

    :pswitch_1
    invoke-direct {p0}, Lcom/fimi/soul/module/update/a/g;->d()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
