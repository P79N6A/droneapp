.class public Lcom/fimi/soul/module/droneTrack/a/e;
.super Ljava/lang/Object;


# static fields
.field private static final c:Ljava/lang/String;


# instance fields
.field a:I

.field b:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

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

.field private g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/fimi/soul/biz/h/c;->a()Lcom/fimi/soul/biz/h/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/h/c;->b()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/fimi/soul/module/droneTrack/a/e;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/e;->e:Ljava/util/List;

    const/4 v0, 0x0

    iput v0, p0, Lcom/fimi/soul/module/droneTrack/a/e;->a:I

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneTrack/a/e;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneTrack/a/e;->f:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneTrack/a/e;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/e;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneTrack/a/e;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneTrack/a/e;->d:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneTrack/a/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/e;->f:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic c()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/fimi/soul/module/droneTrack/a/e;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/module/droneTrack/a/e;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/e;->e:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a(ILcom/fimi/soul/module/droneTrack/f;)Ljava/lang/Object;
    .locals 30

    sparse-switch p1, :sswitch_data_0

    const/4 v2, 0x0

    :goto_0
    return-object v2

    :sswitch_0
    new-instance v2, Lcom/fimi/soul/drone/h/y;

    invoke-direct {v2}, Lcom/fimi/soul/drone/h/y;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v3

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v4

    int-to-double v4, v4

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v6

    int-to-double v6, v6

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v8

    int-to-double v8, v8

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v10

    int-to-double v10, v10

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v12

    int-to-double v12, v12

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v14

    int-to-double v14, v14

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v16

    move/from16 v0, v16

    int-to-double v0, v0

    move-wide/from16 v16, v0

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v18

    move/from16 v0, v18

    int-to-double v0, v0

    move-wide/from16 v18, v0

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v20

    move/from16 v0, v20

    int-to-double v0, v0

    move-wide/from16 v20, v0

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v22

    move/from16 v0, v22

    int-to-double v0, v0

    move-wide/from16 v22, v0

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v24

    move/from16 v0, v24

    int-to-double v0, v0

    move-wide/from16 v24, v0

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v26

    move/from16 v0, v26

    int-to-double v0, v0

    move-wide/from16 v26, v0

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v28

    move/from16 v0, v28

    int-to-double v0, v0

    move-wide/from16 v28, v0

    invoke-virtual/range {v2 .. v29}, Lcom/fimi/soul/drone/h/y;->a(BDDDDDDDDDDDDD)V

    goto :goto_0

    :sswitch_1
    new-instance v2, Lcom/fimi/soul/drone/h/ag;

    invoke-direct {v2}, Lcom/fimi/soul/drone/h/ag;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v3

    int-to-double v3, v3

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v5

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->f()F

    move-result v6

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->f()F

    move-result v7

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->g()F

    move-result v8

    float-to-double v8, v8

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->f()F

    move-result v10

    float-to-double v10, v10

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v12

    invoke-virtual/range {v2 .. v12}, Lcom/fimi/soul/drone/h/ag;->a(DBFFDDB)V

    goto/16 :goto_0

    :sswitch_2
    new-instance v3, Lcom/fimi/soul/drone/h/z;

    invoke-direct {v3}, Lcom/fimi/soul/drone/h/z;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->f()F

    move-result v2

    float-to-double v4, v2

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->f()F

    move-result v2

    float-to-double v6, v2

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->g()F

    move-result v2

    float-to-double v8, v2

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v10

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v11

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v12

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v13

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v14

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v15

    invoke-virtual/range {v3 .. v15}, Lcom/fimi/soul/drone/h/z;->a(DDDIBBBBB)V

    move-object v2, v3

    goto/16 :goto_0

    :sswitch_3
    new-instance v2, Lcom/fimi/soul/drone/h/d;

    invoke-direct {v2}, Lcom/fimi/soul/drone/h/d;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v3

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v4

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v5

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v6

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v7

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v8

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v9

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v10

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v11

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v12

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v13

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v14

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v15

    invoke-virtual/range {v2 .. v15}, Lcom/fimi/soul/drone/h/d;->a(BBBBBBSSBBBBB)V

    goto/16 :goto_0

    :sswitch_4
    new-instance v2, Lcom/fimi/soul/drone/h/a/b;

    invoke-direct {v2}, Lcom/fimi/soul/drone/h/a/b;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v3

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v4

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->f()F

    move-result v5

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->f()F

    move-result v6

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v7

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v8

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v9

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v10

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v11

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v12

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v13

    invoke-virtual/range {v2 .. v13}, Lcom/fimi/soul/drone/h/a/b;->a(BSFFBSBBBBB)V

    goto/16 :goto_0

    :sswitch_5
    new-instance v2, Lcom/fimi/soul/drone/h/q;

    invoke-direct {v2}, Lcom/fimi/soul/drone/h/q;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->c()I

    move-result v3

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->c()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lcom/fimi/soul/drone/h/q;->a(II)V

    goto/16 :goto_0

    :sswitch_6
    new-instance v2, Lcom/fimi/soul/drone/h/a/e;

    invoke-direct {v2}, Lcom/fimi/soul/drone/h/a/e;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v3

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v4

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v5

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v6

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v7

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v8

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v9

    invoke-virtual/range {v2 .. v9}, Lcom/fimi/soul/drone/h/a/e;->a(BBBBBBB)V

    goto/16 :goto_0

    :sswitch_7
    new-instance v2, Lcom/fimi/soul/drone/h/ao;

    invoke-direct {v2}, Lcom/fimi/soul/drone/h/ao;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v3

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v4

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v5

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v6

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v7

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v8

    invoke-virtual/range {v2 .. v8}, Lcom/fimi/soul/drone/h/ao;->a(BBBBBB)V

    goto/16 :goto_0

    :sswitch_8
    new-instance v2, Lcom/fimi/soul/drone/h/e;

    invoke-direct {v2}, Lcom/fimi/soul/drone/h/e;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v3

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v4

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v5

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v6

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v7

    invoke-virtual/range {v2 .. v7}, Lcom/fimi/soul/drone/h/e;->a(SSSSS)V

    invoke-static {}, Lcom/fimi/soul/module/droneTrack/a/b;->a()Lcom/fimi/soul/module/droneTrack/a/b;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/fimi/soul/module/droneTrack/a/b;->a(Lcom/fimi/soul/drone/h/e;)V

    goto/16 :goto_0

    :sswitch_9
    new-instance v2, Lcom/fimi/soul/drone/h/ad;

    invoke-direct {v2}, Lcom/fimi/soul/drone/h/ad;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/h/ad;->a(B)V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/h/ad;->h(S)V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/h/ad;->g(S)V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/h/ad;->f(S)V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/h/ad;->e(S)V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/h/ad;->d(S)V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/h/ad;->c(S)V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/h/ad;->b(S)V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->b()S

    move-result v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/h/ad;->a(S)V

    goto/16 :goto_0

    :sswitch_a
    new-instance v2, Lcom/fimi/soul/drone/h/c;

    invoke-direct {v2}, Lcom/fimi/soul/drone/h/c;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v3

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v4

    invoke-virtual/range {p2 .. p2}, Lcom/fimi/soul/module/droneTrack/f;->a()B

    move-result v5

    invoke-virtual {v2, v3, v4, v5}, Lcom/fimi/soul/drone/h/c;->a(BBB)V

    invoke-static {}, Lcom/fimi/soul/module/droneTrack/a/b;->a()Lcom/fimi/soul/module/droneTrack/a/b;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/fimi/soul/module/droneTrack/a/b;->a(Lcom/fimi/soul/drone/h/c;)V

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
        0x4 -> :sswitch_2
        0x5 -> :sswitch_3
        0x7 -> :sswitch_4
        0x9 -> :sswitch_5
        0xb -> :sswitch_6
        0x62 -> :sswitch_a
        0x63 -> :sswitch_7
        0x69 -> :sswitch_9
        0xc6 -> :sswitch_8
    .end sparse-switch
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/droneTrack/a/e;->g:Z

    return-void
.end method

.method public a([Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/fimi/soul/module/droneTrack/a/e$1;

    invoke-direct {v0, p0, p1}, Lcom/fimi/soul/module/droneTrack/a/e$1;-><init>(Lcom/fimi/soul/module/droneTrack/a/e;[Ljava/lang/String;)V

    invoke-static {v0}, Lcom/fimi/kernel/utils/x;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneTrack/a/e;->g:Z

    return v0
.end method

.method public b()Ljava/util/LinkedHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/e;->b:Ljava/util/LinkedHashMap;

    return-object v0
.end method
