.class public Lcom/fimi/soul/drone/h/v;
.super Lcom/fimi/soul/drone/e;


# instance fields
.field private b:D

.field private c:D

.field private d:D

.field private e:D

.field private f:B

.field private g:D

.field private h:D


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/drone/e;-><init>(Lcom/fimi/soul/drone/a;)V

    return-void
.end method


# virtual methods
.method public a()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/v;->h:D

    return-wide v0
.end method

.method public a(DDDDDBD)V
    .locals 7

    invoke-static {}, Lcom/fimi/soul/biz/n/a;->a()Lcom/fimi/soul/biz/n/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/biz/n/a;->b()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {p3, p4, p1, p2}, Lcom/fimi/soul/utils/z;->a(DD)Lcom/fimi/soul/utils/af;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/utils/af;->b()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/fimi/soul/drone/h/v;->b:D

    invoke-virtual {v2}, Lcom/fimi/soul/utils/af;->a()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/fimi/soul/drone/h/v;->c:D

    :goto_0
    iput-wide p5, p0, Lcom/fimi/soul/drone/h/v;->d:D

    iput-wide p7, p0, Lcom/fimi/soul/drone/h/v;->e:D

    move/from16 v0, p11

    iput-byte v0, p0, Lcom/fimi/soul/drone/h/v;->f:B

    move-wide/from16 v0, p9

    iput-wide v0, p0, Lcom/fimi/soul/drone/h/v;->g:D

    move-wide/from16 v0, p12

    iput-wide v0, p0, Lcom/fimi/soul/drone/h/v;->h:D

    iget-object v2, p0, Lcom/fimi/soul/drone/h/v;->a:Lcom/fimi/soul/drone/a;

    sget-object v3, Lcom/fimi/soul/drone/d$a;->n:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    return-void

    :cond_0
    iput-wide p1, p0, Lcom/fimi/soul/drone/h/v;->b:D

    iput-wide p3, p0, Lcom/fimi/soul/drone/h/v;->c:D

    goto :goto_0
.end method

.method public b()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/v;->b:D

    return-wide v0
.end method

.method public c()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/v;->c:D

    return-wide v0
.end method

.method public d()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/v;->d:D

    return-wide v0
.end method

.method public e()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/v;->e:D

    return-wide v0
.end method

.method public f()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/soul/drone/h/v;->f:B

    return v0
.end method

.method public g()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/v;->g:D

    return-wide v0
.end method
