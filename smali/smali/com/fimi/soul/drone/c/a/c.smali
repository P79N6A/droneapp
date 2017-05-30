.class public Lcom/fimi/soul/drone/c/a/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final a:I = 0xfe

.field private static final serialVersionUID:J = 0x1d164d64a3ce3d92L


# instance fields
.field public b:I

.field public c:I

.field public d:Lcom/fimi/soul/drone/c/a/d;

.field public e:Lcom/fimi/soul/drone/c/a/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/fimi/soul/drone/c/a/d;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/d;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    return-void
.end method

.method public constructor <init>(Lcom/fimi/soul/drone/c/a/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 3

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/d;->b()I

    move-result v1

    const/16 v2, 0x1ff

    if-lt v1, v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/d;->b()I

    move-result v1

    iget v2, p0, Lcom/fimi/soul/drone/c/a/c;->b:I

    if-eq v1, v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()V
    .locals 3

    new-instance v0, Lcom/fimi/soul/drone/c/a/a;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/drone/c/a/c;->e:Lcom/fimi/soul/drone/c/a/a;

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/c;->e:Lcom/fimi/soul/drone/c/a/a;

    iget v1, p0, Lcom/fimi/soul/drone/c/a/c;->b:I

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/c/a/a;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/c;->e:Lcom/fimi/soul/drone/c/a/a;

    iget v1, p0, Lcom/fimi/soul/drone/c/a/c;->c:I

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/c/a/a;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/c/a/d;->c()V

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/d;->b()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/drone/c/a/c;->e:Lcom/fimi/soul/drone/c/a/a;

    iget-object v2, p0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/a;->a(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c()V
    .locals 3

    new-instance v0, Lcom/fimi/soul/drone/c/a/a;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/drone/c/a/c;->e:Lcom/fimi/soul/drone/c/a/a;

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/c;->e:Lcom/fimi/soul/drone/c/a/a;

    iget v1, p0, Lcom/fimi/soul/drone/c/a/c;->b:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/c/a/a;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/c;->e:Lcom/fimi/soul/drone/c/a/a;

    iget v1, p0, Lcom/fimi/soul/drone/c/a/c;->c:I

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/c/a/a;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/c/a/d;->c()V

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/d;->b()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/drone/c/a/c;->e:Lcom/fimi/soul/drone/c/a/a;

    iget-object v2, p0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/a;->a(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d()[B
    .locals 5

    const/4 v0, 0x0

    iget v1, p0, Lcom/fimi/soul/drone/c/a/c;->b:I

    add-int/lit8 v1, v1, 0x3

    add-int/lit8 v1, v1, 0x2

    new-array v3, v1, [B

    const/4 v1, 0x1

    const/4 v2, -0x2

    aput-byte v2, v3, v0

    const/4 v2, 0x2

    iget v4, p0, Lcom/fimi/soul/drone/c/a/c;->b:I

    add-int/lit8 v4, v4, 0x1

    int-to-byte v4, v4

    aput-byte v4, v3, v1

    const/4 v1, 0x3

    iget v4, p0, Lcom/fimi/soul/drone/c/a/c;->c:I

    int-to-byte v4, v4

    aput-byte v4, v3, v2

    :goto_0
    iget-object v2, p0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/c/a/d;->b()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v0, v2, :cond_0

    add-int/lit8 v2, v1, 0x1

    iget-object v4, p0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    iget-object v4, v4, Lcom/fimi/soul/drone/c/a/d;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v4, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    aput-byte v4, v3, v1

    add-int/lit8 v0, v0, 0x1

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/fimi/soul/drone/c/a/c;->c()V

    add-int/lit8 v0, v1, 0x1

    iget-object v2, p0, Lcom/fimi/soul/drone/c/a/c;->e:Lcom/fimi/soul/drone/c/a/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/c/a/a;->c()I

    move-result v2

    int-to-byte v2, v2

    aput-byte v2, v3, v1

    add-int/lit8 v1, v0, 0x1

    iget-object v1, p0, Lcom/fimi/soul/drone/c/a/c;->e:Lcom/fimi/soul/drone/c/a/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/a;->b()I

    move-result v1

    int-to-byte v1, v1

    aput-byte v1, v3, v0

    return-object v3
.end method

.method public e()[B
    .locals 5

    const/4 v0, 0x0

    iget v1, p0, Lcom/fimi/soul/drone/c/a/c;->b:I

    add-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x2

    new-array v3, v1, [B

    const/4 v1, 0x1

    const/4 v2, -0x2

    aput-byte v2, v3, v0

    const/4 v2, 0x2

    iget v4, p0, Lcom/fimi/soul/drone/c/a/c;->b:I

    int-to-byte v4, v4

    aput-byte v4, v3, v1

    const/4 v1, 0x3

    iget v4, p0, Lcom/fimi/soul/drone/c/a/c;->c:I

    int-to-byte v4, v4

    aput-byte v4, v3, v2

    :goto_0
    iget-object v2, p0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/c/a/d;->b()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v0, v2, :cond_0

    add-int/lit8 v2, v1, 0x1

    iget-object v4, p0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    iget-object v4, v4, Lcom/fimi/soul/drone/c/a/d;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v4, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v4

    aput-byte v4, v3, v1

    add-int/lit8 v0, v0, 0x1

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/fimi/soul/drone/c/a/c;->b()V

    add-int/lit8 v0, v1, 0x1

    iget-object v2, p0, Lcom/fimi/soul/drone/c/a/c;->e:Lcom/fimi/soul/drone/c/a/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/c/a/a;->c()I

    move-result v2

    int-to-byte v2, v2

    aput-byte v2, v3, v1

    add-int/lit8 v1, v0, 0x1

    iget-object v1, p0, Lcom/fimi/soul/drone/c/a/c;->e:Lcom/fimi/soul/drone/c/a/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/a;->b()I

    move-result v1

    int-to-byte v1, v1

    aput-byte v1, v3, v0

    return-object v3
.end method

.method public f()Lcom/fimi/soul/drone/c/a/b;
    .locals 3

    const/4 v1, 0x1

    const/4 v2, 0x5

    iget v0, p0, Lcom/fimi/soul/drone/c/a/c;->c:I

    sparse-switch v0, :sswitch_data_0

    iget v0, p0, Lcom/fimi/soul/drone/c/a/c;->c:I

    invoke-static {v0, p0}, Lcom/fimi/soul/drone/c/a/a/h;->a(ILcom/fimi/soul/drone/c/a/c;)Lcom/fimi/soul/drone/c/a/a/g;

    move-result-object v0

    if-eqz v0, :cond_5

    :goto_0
    return-object v0

    :sswitch_0
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bh;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/bh;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :sswitch_1
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bo;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/bo;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :sswitch_2
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bm;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/bm;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :sswitch_3
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bj;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/bj;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :sswitch_4
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/br;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/br;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :sswitch_5
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bq;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/bq;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :sswitch_6
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/av;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/av;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :sswitch_7
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/am;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/am;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :sswitch_8
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/ar;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/ar;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :sswitch_9
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/ap;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/ap;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :sswitch_a
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/e;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/e;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :sswitch_b
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bd;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/bd;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :sswitch_c
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/au;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/au;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :sswitch_d
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/ae;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/ae;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :sswitch_e
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bb;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/bb;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :sswitch_f
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/be;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/be;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :sswitch_10
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/p;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/p;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :sswitch_11
    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/c/a/d;->c(I)V

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    const/16 v1, 0x12

    if-eq v0, v1, :cond_0

    const/16 v1, 0x13

    if-ne v0, v1, :cond_1

    :cond_0
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/ac;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/ac;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/j;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/j;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_12
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/ag;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/ag;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_13
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/ah;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/ah;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_14
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/aq;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/aq;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_15
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/ax;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/ax;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_16
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/ak;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/ak;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_17
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bc;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/bc;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_18
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/an;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/an;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_19
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/ao;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/ao;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_1a
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/b;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/b;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_1b
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/al;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/al;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_1c
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/ai;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/ai;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_1d
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bg;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/bg;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_1e
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/ay;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/ay;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_1f
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/af;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/af;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_20
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bf;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/bf;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_21
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/aj;

    const/16 v1, 0x10

    invoke-direct {v0, p0, v1}, Lcom/fimi/soul/drone/c/a/a/aj;-><init>(Lcom/fimi/soul/drone/c/a/c;I)V

    goto/16 :goto_0

    :sswitch_22
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/aj;

    const/16 v1, 0x71

    invoke-direct {v0, p0, v1}, Lcom/fimi/soul/drone/c/a/a/aj;-><init>(Lcom/fimi/soul/drone/c/a/c;I)V

    goto/16 :goto_0

    :sswitch_23
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/d;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/d;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_24
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/y;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/y;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_25
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/n;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/n;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_26
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/w;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/w;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_27
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/o;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/o;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_28
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/aa;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/aa;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_29
    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/c/a/d;->c(I)V

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    iget v1, p0, Lcom/fimi/soul/drone/c/a/c;->b:I

    if-le v1, v2, :cond_2

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/r;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/r;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :cond_2
    iget v1, p0, Lcom/fimi/soul/drone/c/a/c;->b:I

    if-le v1, v2, :cond_3

    if-ne v0, v2, :cond_3

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/i;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/i;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :cond_3
    iget v1, p0, Lcom/fimi/soul/drone/c/a/c;->b:I

    if-le v1, v2, :cond_4

    const/4 v1, 0x7

    if-ne v0, v1, :cond_4

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/s;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/s;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :cond_4
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/c;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/c;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_2a
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/u;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/u;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_2b
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/v;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/v;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_2c
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/q;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/q;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_2d
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bi;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/bi;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_2e
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/ab;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/ab;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_2f
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/at;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/at;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_30
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/t;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/t;-><init>()V

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/c/a/a/t;->a(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_31
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/m;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/m;-><init>()V

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/c/a/a/m;->a(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_32
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/x;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/x;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_33
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/k;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/k;-><init>()V

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/c/a/a/k;->a(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_34
    new-instance v0, Lcom/fimi/soul/drone/c/a/a/l;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/l;-><init>()V

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/c/a/a/l;->a(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :cond_5
    const-string v0, "MILink"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UNKNOW MESSAGE - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/fimi/soul/drone/c/a/c;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/ad;

    invoke-direct {v0, p0}, Lcom/fimi/soul/drone/c/a/a/ad;-><init>(Lcom/fimi/soul/drone/c/a/c;)V

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_6
        0x2 -> :sswitch_7
        0x3 -> :sswitch_8
        0x4 -> :sswitch_9
        0x5 -> :sswitch_a
        0x6 -> :sswitch_b
        0x7 -> :sswitch_26
        0x9 -> :sswitch_25
        0xa -> :sswitch_2e
        0xb -> :sswitch_2a
        0xc -> :sswitch_32
        0x10 -> :sswitch_21
        0x34 -> :sswitch_31
        0x62 -> :sswitch_20
        0x63 -> :sswitch_1d
        0x64 -> :sswitch_0
        0x66 -> :sswitch_23
        0x69 -> :sswitch_2d
        0x6a -> :sswitch_28
        0x6c -> :sswitch_30
        0x71 -> :sswitch_22
        0x7a -> :sswitch_2c
        0x80 -> :sswitch_2f
        0x81 -> :sswitch_c
        0x82 -> :sswitch_d
        0x83 -> :sswitch_e
        0x84 -> :sswitch_f
        0x85 -> :sswitch_10
        0x86 -> :sswitch_11
        0x87 -> :sswitch_2b
        0x88 -> :sswitch_33
        0x89 -> :sswitch_34
        0x8a -> :sswitch_27
        0x90 -> :sswitch_16
        0x91 -> :sswitch_19
        0x92 -> :sswitch_17
        0x93 -> :sswitch_18
        0x94 -> :sswitch_12
        0x95 -> :sswitch_14
        0x96 -> :sswitch_15
        0x97 -> :sswitch_13
        0x98 -> :sswitch_1a
        0x99 -> :sswitch_29
        0xc0 -> :sswitch_1b
        0xc1 -> :sswitch_1c
        0xc5 -> :sswitch_1e
        0xc6 -> :sswitch_1f
        0xc7 -> :sswitch_2
        0xc8 -> :sswitch_3
        0xc9 -> :sswitch_1
        0xca -> :sswitch_4
        0xcb -> :sswitch_5
        0xcc -> :sswitch_24
    .end sparse-switch
.end method
