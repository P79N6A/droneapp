.class public Lcom/fimi/soul/module/droneTrack/b/a;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/fimi/soul/module/droneTrack/b/a;

.field private static b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/fimi/soul/biz/j/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lcom/fimi/soul/module/droneTrack/b/a;->b:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/fimi/soul/module/droneTrack/b/a;
    .locals 1

    sget-object v0, Lcom/fimi/soul/module/droneTrack/b/a;->a:Lcom/fimi/soul/module/droneTrack/b/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/module/droneTrack/b/a;

    invoke-direct {v0}, Lcom/fimi/soul/module/droneTrack/b/a;-><init>()V

    sput-object v0, Lcom/fimi/soul/module/droneTrack/b/a;->a:Lcom/fimi/soul/module/droneTrack/b/a;

    :cond_0
    sget-object v0, Lcom/fimi/soul/module/droneTrack/b/a;->a:Lcom/fimi/soul/module/droneTrack/b/a;

    return-object v0
.end method

.method public static b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/fimi/soul/biz/j/f;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/fimi/soul/module/droneTrack/b/a;->b:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/fimi/soul/module/droneTrack/a/a;)Lcom/fimi/soul/entity/ErrorMode;
    .locals 11

    const/4 v10, 0x4

    const/4 v9, 0x3

    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->b()Lcom/fimi/soul/drone/h/q;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->j()Z

    move-result v3

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->m()Z

    move-result v0

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->n()Z

    move-result v4

    new-instance v1, Lcom/fimi/soul/entity/ErrorMode;

    invoke-direct {v1}, Lcom/fimi/soul/entity/ErrorMode;-><init>()V

    invoke-virtual {v1, v4}, Lcom/fimi/soul/entity/ErrorMode;->setIsMiddleFault(Z)V

    if-eqz v0, :cond_36

    if-eqz v3, :cond_35

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v5, 0x7f0a03cf

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    const v0, 0x7f0a0266

    invoke-virtual {p0, v3, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_2
    if-eqz v4, :cond_1

    if-eqz v3, :cond_37

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03d0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_3
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    if-eq v0, v10, :cond_2

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    const/16 v4, 0xc

    if-ne v0, v4, :cond_3

    :cond_2
    if-nez v3, :cond_3

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a025b

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->ak()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/4 v4, 0x5

    if-eq v0, v4, :cond_4

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    const/16 v4, 0x8

    if-ne v0, v4, :cond_5

    :cond_4
    if-nez v3, :cond_5

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0256

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/4 v4, 0x6

    if-ne v0, v4, :cond_6

    if-nez v3, :cond_6

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0257

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/16 v4, 0x9

    if-ne v0, v4, :cond_7

    if-nez v3, :cond_7

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a025a

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/16 v4, 0x11

    if-eq v0, v4, :cond_8

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    if-ne v0, v10, :cond_9

    :cond_8
    if-nez v3, :cond_9

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0254

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->aj()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/16 v4, 0x15

    if-eq v0, v4, :cond_a

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    const/16 v4, 0xe

    if-ne v0, v4, :cond_b

    :cond_a
    if-nez v3, :cond_b

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0259

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/16 v4, 0xb

    if-ne v0, v4, :cond_c

    if-nez v3, :cond_c

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0255

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->I()Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/entity/ErrorMode;->setIsCompassFault(Z)V

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->f()Z

    move-result v0

    if-eqz v0, :cond_39

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-nez v0, :cond_39

    if-eqz v3, :cond_38

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03ad

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03ad

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_4
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->g()Z

    move-result v0

    if-nez v0, :cond_d

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->c()Lcom/fimi/soul/drone/h/a/b;

    move-result-object v0

    if-eqz v0, :cond_3c

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->c()Lcom/fimi/soul/drone/h/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/b;->f()B

    move-result v0

    if-ne v0, v9, :cond_3c

    :cond_d
    if-eqz v3, :cond_3b

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03cc

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03cc

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_5
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->c()Lcom/fimi/soul/drone/h/a/b;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->c()Lcom/fimi/soul/drone/h/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/b;->f()B

    move-result v0

    if-ne v0, v7, :cond_e

    if-eqz v3, :cond_3d

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03cb

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    :goto_6
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->h()Z

    move-result v0

    if-nez v0, :cond_f

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->i()Z

    move-result v0

    if-eqz v0, :cond_10

    :cond_f
    if-eqz v3, :cond_3e

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03c3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    :goto_7
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->j()Z

    move-result v0

    if-eqz v0, :cond_11

    if-eqz v3, :cond_3f

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03c6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_11
    :goto_8
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->k()Z

    move-result v0

    if-eqz v0, :cond_12

    if-eqz v3, :cond_40

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03c7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_12
    :goto_9
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->l()Z

    move-result v0

    if-eqz v0, :cond_13

    if-eqz v3, :cond_41

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03ab

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    :goto_a
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->m()Z

    move-result v0

    if-eqz v0, :cond_43

    if-eqz v3, :cond_42

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03a4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03a4

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_b
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->n()Z

    move-result v0

    if-eqz v0, :cond_14

    if-nez v3, :cond_14

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a023d

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_14
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->o()Z

    move-result v0

    if-nez v0, :cond_15

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/16 v4, 0x16

    if-eq v0, v4, :cond_15

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    const/16 v4, 0xf

    if-ne v0, v4, :cond_16

    :cond_15
    if-nez v3, :cond_16

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0263

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_16
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->p()Z

    move-result v0

    if-eqz v0, :cond_45

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-eqz v0, :cond_45

    if-eqz v3, :cond_44

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03b9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03b9

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_c
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->q()Z

    move-result v0

    if-eqz v0, :cond_47

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-eqz v0, :cond_47

    if-eqz v3, :cond_46

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03bc

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03bc

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_d
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->r()Z

    move-result v0

    if-nez v0, :cond_17

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/16 v4, 0xc

    if-eq v0, v4, :cond_17

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    const/4 v4, 0x6

    if-ne v0, v4, :cond_18

    :cond_17
    if-nez v3, :cond_18

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0253

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_18
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->x()Z

    move-result v0

    if-eqz v0, :cond_19

    if-nez v3, :cond_19

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a023e

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_19
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/16 v4, 0xd

    if-eq v0, v4, :cond_1a

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    if-ne v0, v7, :cond_49

    :cond_1a
    if-nez v3, :cond_48

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0258

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1b
    :goto_e
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->I()Z

    move-result v0

    if-eqz v0, :cond_1c

    if-eqz v3, :cond_4b

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03ac

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1c
    :goto_f
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->J()Z

    move-result v0

    if-eqz v0, :cond_1d

    if-nez v3, :cond_1d

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a024b

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1d
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->K()Z

    move-result v0

    if-eqz v0, :cond_1e

    if-nez v3, :cond_1e

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0251

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1e
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->L()Z

    move-result v0

    if-eqz v0, :cond_1f

    if-nez v3, :cond_1f

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a024d

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1f
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->M()Z

    move-result v0

    if-nez v0, :cond_20

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    if-eq v0, v8, :cond_20

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    const/4 v4, 0x7

    if-ne v0, v4, :cond_21

    :cond_20
    if-nez v3, :cond_21

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0249

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_21
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/16 v4, 0x13

    if-eq v0, v4, :cond_22

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    const/16 v4, 0xa

    if-ne v0, v4, :cond_23

    :cond_22
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03f2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_23
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->P()Z

    move-result v0

    if-nez v0, :cond_24

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    if-eq v0, v9, :cond_24

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    const/4 v4, 0x5

    if-ne v0, v4, :cond_4e

    :cond_24
    if-eqz v3, :cond_4d

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->e()B

    move-result v0

    const/16 v4, 0x9

    if-ne v0, v4, :cond_4c

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03c8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_10
    const v0, 0x7f0a03b1

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_11
    new-array v0, v9, [I

    fill-array-data v0, :array_0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    :cond_25
    :goto_12
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->Q()Z

    move-result v0

    if-eqz v0, :cond_54

    if-eqz v3, :cond_52

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03b7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_13
    if-eqz v3, :cond_53

    const v0, 0x7f0a03b7

    :goto_14
    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_15
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->ae()Z

    move-result v0

    if-eqz v0, :cond_57

    if-nez v3, :cond_56

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03a8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03a8

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_16
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->af()Z

    move-result v0

    if-eqz v0, :cond_58

    if-eqz v3, :cond_26

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03b5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03b5

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :cond_26
    :goto_17
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->ag()Z

    move-result v0

    if-eqz v0, :cond_59

    if-eqz v3, :cond_27

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03b6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03b6

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :cond_27
    :goto_18
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->ah()Z

    move-result v0

    if-eqz v0, :cond_28

    if-nez v3, :cond_28

    :cond_28
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->ai()Z

    move-result v0

    if-eqz v0, :cond_29

    if-nez v3, :cond_29

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0240

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_29
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->v()Z

    move-result v0

    if-eqz v0, :cond_5a

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0250

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a0250

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :goto_19
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->R()Z

    move-result v0

    if-eqz v0, :cond_5b

    if-nez v3, :cond_2a

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0268

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a0268

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :cond_2a
    :goto_1a
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->z()Z

    move-result v0

    if-eqz v0, :cond_2b

    if-eqz v3, :cond_5c

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03c4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2b
    :goto_1b
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->w()Z

    move-result v0

    if-eqz v0, :cond_2c

    if-eqz v3, :cond_5d

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03c5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2c
    :goto_1c
    if-eqz v3, :cond_2d

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->T()Z

    move-result v0

    if-eqz v0, :cond_5e

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03ea

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03e9

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :cond_2d
    :goto_1d
    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isGps()Z

    move-result v0

    if-nez v0, :cond_32

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->U()Z

    move-result v0

    if-eqz v0, :cond_2e

    if-eqz v3, :cond_5f

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03d4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2e
    :goto_1e
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->V()Z

    move-result v0

    if-eqz v0, :cond_2f

    if-eqz v3, :cond_60

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a00f6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2f
    :goto_1f
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->W()Z

    move-result v0

    if-eqz v0, :cond_30

    if-eqz v3, :cond_61

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0220

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_30
    :goto_20
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->al()Z

    move-result v0

    if-eqz v0, :cond_31

    if-nez v3, :cond_31

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03d7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_31
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->X()Z

    move-result v0

    if-eqz v0, :cond_32

    if-eqz v3, :cond_62

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0187

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_32
    :goto_21
    if-nez v3, :cond_33

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->y()Z

    move-result v0

    if-eqz v0, :cond_33

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03f3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_33
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->am()Z

    move-result v0

    if-eqz v0, :cond_34

    if-eqz v3, :cond_63

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v2, 0x7f0a023a

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a023a

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    :cond_34
    :goto_22
    move-object v0, v1

    goto/16 :goto_0

    :cond_35
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v5, 0x7f0a0266

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_36
    new-array v0, v7, [I

    const v5, 0x7f0a0266

    aput v5, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_2

    :cond_37
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0267

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_38
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0247

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a0247

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    goto/16 :goto_4

    :cond_39
    new-array v4, v7, [I

    if-eqz v3, :cond_3a

    const v0, 0x7f0a03ad

    :goto_23
    aput v0, v4, v6

    invoke-virtual {p0, v4}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_4

    :cond_3a
    const v0, 0x7f0a0247

    goto :goto_23

    :cond_3b
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0265

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a0265

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    goto/16 :goto_5

    :cond_3c
    new-array v0, v8, [I

    fill-array-data v0, :array_1

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_5

    :cond_3d
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0264

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :cond_3e
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0243

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :cond_3f
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a024a

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :cond_40
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a024c

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_9

    :cond_41
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0241

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_a

    :cond_42
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a023c

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a023c

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    goto/16 :goto_b

    :cond_43
    new-array v0, v8, [I

    fill-array-data v0, :array_2

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_b

    :cond_44
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a025c

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_c

    :cond_45
    new-array v0, v7, [I

    const v4, 0x7f0a03b9

    aput v4, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_c

    :cond_46
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a025d

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_d

    :cond_47
    new-array v0, v7, [I

    const v4, 0x7f0a03bc

    aput v4, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_d

    :cond_48
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03b8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_e

    :cond_49
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual {p1}, Lcom/fimi/soul/module/droneTrack/a/a;->a()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-nez v0, :cond_1b

    if-eqz v3, :cond_4a

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03b0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_e

    :cond_4a
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0248

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_e

    :cond_4b
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0244

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_f

    :cond_4c
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03b1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_10

    :cond_4d
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a024e

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a024e

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    goto/16 :goto_11

    :cond_4e
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->N()Z

    move-result v0

    if-eqz v0, :cond_50

    new-array v0, v9, [I

    fill-array-data v0, :array_3

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    if-eqz v3, :cond_4f

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03aa

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03aa

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    goto/16 :goto_12

    :cond_4f
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a023f

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a023f

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    goto/16 :goto_12

    :cond_50
    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/q;->O()Z

    move-result v0

    if-eqz v0, :cond_51

    new-array v0, v10, [I

    fill-array-data v0, :array_4

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    if-eqz v3, :cond_25

    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03b4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03b4

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    goto/16 :goto_12

    :cond_51
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_5

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_12

    :cond_52
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0252

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_13

    :cond_53
    const v0, 0x7f0a0252

    goto/16 :goto_14

    :cond_54
    new-array v4, v7, [I

    if-eqz v3, :cond_55

    const v0, 0x7f0a03b7

    :goto_24
    aput v0, v4, v6

    invoke-virtual {p0, v4}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_15

    :cond_55
    const v0, 0x7f0a0252

    goto :goto_24

    :cond_56
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03a9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03a9

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a(ZZI)V

    goto/16 :goto_16

    :cond_57
    new-array v0, v8, [I

    fill-array-data v0, :array_6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_16

    :cond_58
    new-array v0, v7, [I

    const v4, 0x7f0a03b5

    aput v4, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_17

    :cond_59
    new-array v0, v7, [I

    const v4, 0x7f0a03b6

    aput v4, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_18

    :cond_5a
    new-array v0, v7, [I

    const v4, 0x7f0a0250

    aput v4, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_19

    :cond_5b
    new-array v0, v7, [I

    const v4, 0x7f0a0268

    aput v4, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_1a

    :cond_5c
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0261

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1b

    :cond_5d
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0262

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1c

    :cond_5e
    new-array v0, v7, [I

    const v4, 0x7f0a03e9

    aput v4, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_1d

    :cond_5f
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a03d3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1e

    :cond_60
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a00f5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1f

    :cond_61
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a021f

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_20

    :cond_62
    invoke-virtual {v1}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v4, 0x7f0a0186

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_21

    :cond_63
    new-array v0, v7, [I

    const v2, 0x7f0a023a

    aput v2, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    goto/16 :goto_22

    :array_0
    .array-data 4
        0x7f0a03aa
        0x7f0a023f
        0x7f0a03b4
    .end array-data

    :array_1
    .array-data 4
        0x7f0a03cc
        0x7f0a0265
    .end array-data

    :array_2
    .array-data 4
        0x7f0a03a4
        0x7f0a023c
    .end array-data

    :array_3
    .array-data 4
        0x7f0a03b1
        0x7f0a024e
        0x7f0a03b4
    .end array-data

    :array_4
    .array-data 4
        0x7f0a03b1
        0x7f0a024e
        0x7f0a03aa
        0x7f0a023f
    .end array-data

    :array_5
    .array-data 4
        0x7f0a03aa
        0x7f0a03b4
        0x7f0a023f
        0x7f0a03c8
        0x7f0a03b1
    .end array-data

    :array_6
    .array-data 4
        0x7f0a03a9
        0x7f0a03a8
    .end array-data
.end method

.method public a(ZZI)V
    .locals 3

    sget-object v0, Lcom/fimi/soul/module/droneTrack/b/a;->b:Ljava/util/Map;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/fimi/soul/module/droneTrack/b/a;->b:Ljava/util/Map;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/biz/j/f;

    invoke-direct {v2, p1, p2, p3}, Lcom/fimi/soul/biz/j/f;-><init>(ZZI)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public varargs a([I)V
    .locals 5

    array-length v1, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    aget v2, p1, v0

    sget-object v3, Lcom/fimi/soul/module/droneTrack/b/a;->b:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lcom/fimi/soul/module/droneTrack/b/a;->b:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/b/a;->a([I)V

    return-void

    :array_0
    .array-data 4
        0x7f0a03c8
        0x7f0a03b4
    .end array-data
.end method
