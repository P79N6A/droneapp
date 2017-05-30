.class public Lcom/fimi/soul/biz/j/g;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/fimi/soul/biz/j/g;

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

    sput-object v0, Lcom/fimi/soul/biz/j/g;->b:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/fimi/soul/biz/j/g;
    .locals 1

    sget-object v0, Lcom/fimi/soul/biz/j/g;->a:Lcom/fimi/soul/biz/j/g;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/biz/j/g;

    invoke-direct {v0}, Lcom/fimi/soul/biz/j/g;-><init>()V

    sput-object v0, Lcom/fimi/soul/biz/j/g;->a:Lcom/fimi/soul/biz/j/g;

    :cond_0
    sget-object v0, Lcom/fimi/soul/biz/j/g;->a:Lcom/fimi/soul/biz/j/g;

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

    sget-object v0, Lcom/fimi/soul/biz/j/g;->b:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/entity/ErrorMode;
    .locals 11

    const/4 v10, 0x3

    const/4 v9, 0x4

    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->ad()Lcom/fimi/soul/drone/h/q;

    move-result-object v3

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v4

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/d;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->g()Lcom/fimi/soul/drone/h/ad;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ad;->m()Z

    move-result v1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->g()Lcom/fimi/soul/drone/h/ad;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ad;->n()Z

    move-result v0

    :goto_0
    new-instance v2, Lcom/fimi/soul/entity/ErrorMode;

    invoke-direct {v2}, Lcom/fimi/soul/entity/ErrorMode;-><init>()V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v5

    invoke-interface {v5}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v5

    if-nez v5, :cond_1

    move-object v0, v2

    :goto_1
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->K()Lcom/fimi/soul/drone/h/ao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ao;->g()Z

    move-result v1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->K()Lcom/fimi/soul/drone/h/ao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ao;->h()Z

    move-result v0

    goto :goto_0

    :cond_1
    invoke-virtual {v2, v0}, Lcom/fimi/soul/entity/ErrorMode;->setIsMiddleFault(Z)V

    if-eqz v1, :cond_4

    if-eqz v4, :cond_3

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v1

    const v5, 0x7f0a03cf

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    const v1, 0x7f0a0266

    invoke-virtual {p0, v4, v6, v1}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    :goto_3
    if-eqz v0, :cond_2

    if-eqz v4, :cond_5

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03d0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_4
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_6

    move-object v0, v2

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v1

    const v5, 0x7f0a0266

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-array v1, v7, [I

    const v5, 0x7f0a0266

    aput v5, v1, v6

    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/j/g;->a([I)V

    goto :goto_3

    :cond_5
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0267

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    if-eq v0, v9, :cond_7

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_8

    :cond_7
    if-nez v4, :cond_8

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a025b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->ak()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_9

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_a

    :cond_9
    if-nez v4, :cond_a

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0256

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_b

    if-nez v4, :cond_b

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0257

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_c

    if-nez v4, :cond_c

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a025a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/16 v1, 0x11

    if-eq v0, v1, :cond_d

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    if-ne v0, v9, :cond_e

    :cond_d
    if-nez v4, :cond_e

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0254

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->aj()Z

    move-result v0

    if-nez v0, :cond_f

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/16 v1, 0x15

    if-eq v0, v1, :cond_f

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    const/16 v1, 0xe

    if-ne v0, v1, :cond_10

    :cond_f
    if-nez v4, :cond_10

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0259

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_11

    if-nez v4, :cond_11

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0255

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_11
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->I()Z

    move-result v0

    invoke-virtual {v2, v0}, Lcom/fimi/soul/entity/ErrorMode;->setIsCompassFault(Z)V

    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->f()Z

    move-result v0

    if-eqz v0, :cond_40

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-nez v0, :cond_40

    if-eqz v4, :cond_3f

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03ad

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03ad

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    :goto_5
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->g()Z

    move-result v0

    if-nez v0, :cond_12

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->h()Lcom/fimi/soul/drone/h/a/b;

    move-result-object v0

    if-eqz v0, :cond_43

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->h()Lcom/fimi/soul/drone/h/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/b;->f()B

    move-result v0

    if-ne v0, v10, :cond_43

    :cond_12
    if-eqz v4, :cond_42

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03cc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03cc

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    :goto_6
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->h()Lcom/fimi/soul/drone/h/a/b;

    move-result-object v0

    if-eqz v0, :cond_13

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->h()Lcom/fimi/soul/drone/h/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/b;->f()B

    move-result v0

    if-ne v0, v7, :cond_13

    if-eqz v4, :cond_44

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03cb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    :goto_7
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->h()Z

    move-result v0

    if-nez v0, :cond_14

    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->i()Z

    move-result v0

    if-eqz v0, :cond_15

    :cond_14
    if-eqz v4, :cond_45

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03c3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_15
    :goto_8
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->j()Z

    move-result v0

    if-eqz v0, :cond_16

    if-eqz v4, :cond_46

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03c6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_16
    :goto_9
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->k()Z

    move-result v0

    if-eqz v0, :cond_17

    if-eqz v4, :cond_47

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03c7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_17
    :goto_a
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->l()Z

    move-result v0

    if-eqz v0, :cond_18

    if-eqz v4, :cond_48

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03ab

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_18
    :goto_b
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->m()Z

    move-result v0

    if-eqz v0, :cond_4a

    if-eqz v4, :cond_49

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03a4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03a4

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    :goto_c
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->n()Z

    move-result v0

    if-eqz v0, :cond_19

    if-nez v4, :cond_19

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a023d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_19
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->o()Z

    move-result v0

    if-nez v0, :cond_1a

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/16 v1, 0x16

    if-eq v0, v1, :cond_1a

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    const/16 v1, 0xf

    if-ne v0, v1, :cond_1b

    :cond_1a
    if-nez v4, :cond_1b

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0263

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1b
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->p()Z

    move-result v0

    if-eqz v0, :cond_4c

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-eqz v0, :cond_4c

    if-eqz v4, :cond_4b

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03b9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03b9

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    :goto_d
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->q()Z

    move-result v0

    if-eqz v0, :cond_4e

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-eqz v0, :cond_4e

    if-eqz v4, :cond_4d

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03bc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03bc

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    :goto_e
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->r()Z

    move-result v0

    if-nez v0, :cond_1c

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_1c

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1d

    :cond_1c
    if-nez v4, :cond_1d

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0253

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1d
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->s()Z

    move-result v0

    if-eqz v0, :cond_1e

    if-nez v4, :cond_1e

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->an()I

    move-result v0

    if-ne v0, v9, :cond_4f

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0269

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1e
    :goto_f
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->x()Z

    move-result v0

    if-eqz v0, :cond_1f

    if-nez v4, :cond_1f

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a023e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1f
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_20

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    if-ne v0, v7, :cond_51

    :cond_20
    if-nez v4, :cond_50

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0258

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_21
    :goto_10
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->I()Z

    move-result v0

    if-eqz v0, :cond_22

    if-eqz v4, :cond_53

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03ac

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_22
    :goto_11
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->J()Z

    move-result v0

    if-eqz v0, :cond_23

    if-nez v4, :cond_23

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a024b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_23
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->K()Z

    move-result v0

    if-eqz v0, :cond_24

    if-nez v4, :cond_24

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0251

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_24
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->L()Z

    move-result v0

    if-eqz v0, :cond_25

    if-nez v4, :cond_25

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a024d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_25
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->M()Z

    move-result v0

    if-nez v0, :cond_26

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    if-eq v0, v8, :cond_26

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_27

    :cond_26
    if-nez v4, :cond_27

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0249

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_27
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    const/16 v1, 0x13

    if-eq v0, v1, :cond_28

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_29

    :cond_28
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03f2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_29
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->P()Z

    move-result v0

    if-nez v0, :cond_2a

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->c()B

    move-result v0

    if-eq v0, v10, :cond_2a

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->a()B

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_57

    :cond_2a
    if-eqz v4, :cond_56

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->e()B

    move-result v0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_2b

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->e()B

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_54

    :cond_2b
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03c9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03c9

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    :goto_12
    new-array v0, v10, [I

    fill-array-data v0, :array_0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/g;->a([I)V

    :cond_2c
    :goto_13
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->Q()Z

    move-result v0

    if-eqz v0, :cond_5d

    if-eqz v4, :cond_5b

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03b7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_14
    if-eqz v4, :cond_5c

    const v0, 0x7f0a03b7

    :goto_15
    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    :goto_16
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->ae()Z

    move-result v0

    if-eqz v0, :cond_60

    if-nez v4, :cond_5f

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03a8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03a8

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    :goto_17
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->af()Z

    move-result v0

    if-eqz v0, :cond_61

    if-eqz v4, :cond_2d

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03b5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03b5

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    :cond_2d
    :goto_18
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->ag()Z

    move-result v0

    if-eqz v0, :cond_62

    if-eqz v4, :cond_2e

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03b6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03b6

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    :cond_2e
    :goto_19
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->ah()Z

    move-result v0

    if-eqz v0, :cond_2f

    if-nez v4, :cond_2f

    :cond_2f
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->ai()Z

    move-result v0

    if-eqz v0, :cond_30

    if-nez v4, :cond_30

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0240

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_30
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->v()Z

    move-result v0

    if-eqz v0, :cond_63

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0250

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a0250

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    :goto_1a
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->R()Z

    move-result v0

    if-eqz v0, :cond_64

    if-nez v4, :cond_31

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0268

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a0268

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    :cond_31
    :goto_1b
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->z()Z

    move-result v0

    if-eqz v0, :cond_32

    if-eqz v4, :cond_65

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03c4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_32
    :goto_1c
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->w()Z

    move-result v0

    if-eqz v0, :cond_33

    if-eqz v4, :cond_66

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03c5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_33
    :goto_1d
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->D()Z

    move-result v0

    if-eqz v0, :cond_34

    if-nez v4, :cond_34

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0374

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_34
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->E()Z

    move-result v0

    if-eqz v0, :cond_68

    if-nez v4, :cond_67

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a025f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1e
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->F()Z

    move-result v0

    if-eqz v0, :cond_6a

    if-eqz v4, :cond_69

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03bf

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03bf

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    :goto_1f
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->G()Z

    move-result v0

    if-eqz v0, :cond_35

    if-nez v4, :cond_35

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0242

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_35
    if-eqz v4, :cond_36

    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->T()Z

    move-result v0

    if-eqz v0, :cond_6b

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03ea

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03e9

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    :cond_36
    :goto_20
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isEnforcementAtti()Z

    move-result v0

    if-nez v0, :cond_37

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-eqz v0, :cond_3c

    :cond_37
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->a()Z

    move-result v0

    if-eqz v0, :cond_3c

    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->U()Z

    move-result v0

    if-eqz v0, :cond_38

    if-eqz v4, :cond_6c

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03d4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_38
    :goto_21
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->V()Z

    move-result v0

    if-eqz v0, :cond_39

    if-eqz v4, :cond_6d

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a00f6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_39
    :goto_22
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->W()Z

    move-result v0

    if-eqz v0, :cond_3a

    if-eqz v4, :cond_6e

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0220

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3a
    :goto_23
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->al()Z

    move-result v0

    if-eqz v0, :cond_3b

    if-nez v4, :cond_3b

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03d7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3b
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->X()Z

    move-result v0

    if-eqz v0, :cond_3c

    if-eqz v4, :cond_6f

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0187

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3c
    :goto_24
    if-nez v4, :cond_3d

    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->y()Z

    move-result v0

    if-eqz v0, :cond_3d

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03f3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3d
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->am()Z

    move-result v0

    if-eqz v0, :cond_3e

    if-eqz v4, :cond_70

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a023a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a023a

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    :cond_3e
    :goto_25
    move-object v0, v2

    goto/16 :goto_1

    :cond_3f
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0247

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a0247

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    goto/16 :goto_5

    :cond_40
    new-array v1, v7, [I

    if-eqz v4, :cond_41

    const v0, 0x7f0a03ad

    :goto_26
    aput v0, v1, v6

    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/j/g;->a([I)V

    goto/16 :goto_5

    :cond_41
    const v0, 0x7f0a0247

    goto :goto_26

    :cond_42
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0265

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a0265

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    goto/16 :goto_6

    :cond_43
    new-array v0, v8, [I

    fill-array-data v0, :array_1

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/g;->a([I)V

    goto/16 :goto_6

    :cond_44
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0264

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_7

    :cond_45
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0243

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :cond_46
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a024a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_9

    :cond_47
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a024c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_a

    :cond_48
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0241

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_b

    :cond_49
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a023c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a023c

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    goto/16 :goto_c

    :cond_4a
    new-array v0, v8, [I

    fill-array-data v0, :array_2

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/g;->a([I)V

    goto/16 :goto_c

    :cond_4b
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a025c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_d

    :cond_4c
    new-array v0, v7, [I

    const v1, 0x7f0a03b9

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/g;->a([I)V

    goto/16 :goto_d

    :cond_4d
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a025d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_e

    :cond_4e
    new-array v0, v7, [I

    const v1, 0x7f0a03bc

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/g;->a([I)V

    goto/16 :goto_e

    :cond_4f
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a024f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_f

    :cond_50
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03b8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_10

    :cond_51
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->H()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-nez v0, :cond_21

    if-eqz v4, :cond_52

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03b0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_10

    :cond_52
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0248

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_10

    :cond_53
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0244

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_11

    :cond_54
    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->e()B

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_55

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03c8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03c8

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    goto/16 :goto_12

    :cond_55
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03b1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03b1

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    goto/16 :goto_12

    :cond_56
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a024e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a024e

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    goto/16 :goto_12

    :cond_57
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->N()Z

    move-result v0

    if-eqz v0, :cond_59

    new-array v0, v9, [I

    fill-array-data v0, :array_3

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/g;->a([I)V

    if-eqz v4, :cond_58

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03aa

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03aa

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    goto/16 :goto_13

    :cond_58
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a023f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a023f

    invoke-virtual {p0, v6, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    goto/16 :goto_13

    :cond_59
    invoke-virtual {v3}, Lcom/fimi/soul/drone/h/q;->O()Z

    move-result v0

    if-eqz v0, :cond_5a

    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_4

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/g;->a([I)V

    if-eqz v4, :cond_2c

    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03b4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03b4

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    goto/16 :goto_13

    :cond_5a
    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_5

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/g;->a([I)V

    goto/16 :goto_13

    :cond_5b
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0252

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_14

    :cond_5c
    const v0, 0x7f0a0252

    goto/16 :goto_15

    :cond_5d
    new-array v1, v7, [I

    if-eqz v4, :cond_5e

    const v0, 0x7f0a03b7

    :goto_27
    aput v0, v1, v6

    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/j/g;->a([I)V

    goto/16 :goto_16

    :cond_5e
    const v0, 0x7f0a0252

    goto :goto_27

    :cond_5f
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03a9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03a9

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    goto/16 :goto_17

    :cond_60
    new-array v0, v8, [I

    fill-array-data v0, :array_6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/g;->a([I)V

    goto/16 :goto_17

    :cond_61
    new-array v0, v7, [I

    const v1, 0x7f0a03b5

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/g;->a([I)V

    goto/16 :goto_18

    :cond_62
    new-array v0, v7, [I

    const v1, 0x7f0a03b6

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/g;->a([I)V

    goto/16 :goto_19

    :cond_63
    new-array v0, v7, [I

    const v1, 0x7f0a0250

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/g;->a([I)V

    goto/16 :goto_1a

    :cond_64
    new-array v0, v7, [I

    const v1, 0x7f0a0268

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/g;->a([I)V

    goto/16 :goto_1b

    :cond_65
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0261

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1c

    :cond_66
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0262

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1d

    :cond_67
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03c0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v0, 0x7f0a03c0

    invoke-virtual {p0, v7, v6, v0}, Lcom/fimi/soul/biz/j/g;->a(ZZI)V

    goto/16 :goto_1e

    :cond_68
    new-array v0, v7, [I

    const v1, 0x7f0a03c0

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/g;->a([I)V

    goto/16 :goto_1e

    :cond_69
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a025e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1f

    :cond_6a
    new-array v0, v7, [I

    const v1, 0x7f0a03bf

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/g;->a([I)V

    goto/16 :goto_1f

    :cond_6b
    new-array v0, v7, [I

    const v1, 0x7f0a03e9

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/g;->a([I)V

    goto/16 :goto_20

    :cond_6c
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a03d3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_21

    :cond_6d
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a00f5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_22

    :cond_6e
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a021f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_23

    :cond_6f
    invoke-virtual {v2}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    const v1, 0x7f0a0186

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_24

    :cond_70
    new-array v0, v7, [I

    const v1, 0x7f0a023a

    aput v1, v0, v6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/g;->a([I)V

    goto/16 :goto_25

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
        0x7f0a03c9
    .end array-data

    :array_4
    .array-data 4
        0x7f0a03b1
        0x7f0a024e
        0x7f0a03aa
        0x7f0a023f
        0x7f0a03c9
    .end array-data

    :array_5
    .array-data 4
        0x7f0a03aa
        0x7f0a03b4
        0x7f0a023f
        0x7f0a03c8
        0x7f0a03b1
        0x7f0a03c9
    .end array-data

    :array_6
    .array-data 4
        0x7f0a03a9
        0x7f0a03a8
    .end array-data
.end method

.method public a(ZZI)V
    .locals 3

    sget-object v0, Lcom/fimi/soul/biz/j/g;->b:Ljava/util/Map;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/fimi/soul/biz/j/g;->b:Ljava/util/Map;

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

    sget-object v3, Lcom/fimi/soul/biz/j/g;->b:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lcom/fimi/soul/biz/j/g;->b:Ljava/util/Map;

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

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/g;->a([I)V

    return-void

    :array_0
    .array-data 4
        0x7f0a03c8
        0x7f0a03b4
    .end array-data
.end method

.method public d()V
    .locals 6

    invoke-static {}, Lcom/fimi/soul/biz/j/g;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_1

    invoke-static {}, Lcom/fimi/soul/biz/j/g;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {}, Lcom/fimi/soul/biz/j/g;->b()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fimi/soul/biz/j/f;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/fimi/soul/biz/j/f;->c()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {}, Lcom/fimi/kernel/c;->d()Landroid/app/Activity;

    move-result-object v3

    invoke-static {v3}, Lcom/fimi/kernel/d/b;->b(Landroid/content/Context;)Lcom/fimi/kernel/d/b;

    move-result-object v3

    invoke-static {}, Lcom/fimi/kernel/c;->d()Landroid/app/Activity;

    move-result-object v4

    invoke-virtual {v1}, Lcom/fimi/soul/biz/j/f;->a()I

    move-result v1

    invoke-virtual {v4, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/fimi/kernel/d/b;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/fimi/soul/biz/j/g;->b()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fimi/soul/biz/j/f;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Lcom/fimi/soul/biz/j/f;->b(Z)V

    invoke-static {}, Lcom/fimi/soul/biz/j/g;->b()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/biz/j/f;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/j/f;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/fimi/kernel/c;->d()Landroid/app/Activity;

    move-result-object v0

    const-wide/16 v4, 0x7d0

    invoke-static {v0, v4, v5}, Lcom/fimi/soul/utils/ap;->a(Landroid/app/Activity;J)V

    goto :goto_0

    :cond_1
    return-void
.end method
