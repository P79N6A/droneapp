.class public Lcom/fimi/soul/drone/h/u;
.super Lcom/fimi/soul/drone/e;


# instance fields
.field private b:C

.field private c:S

.field private d:B

.field private e:B

.field private f:J

.field private g:J

.field private h:J

.field private i:J


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/drone/e;-><init>(Lcom/fimi/soul/drone/a;)V

    return-void
.end method


# virtual methods
.method public a()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/soul/drone/h/u;->e:B

    return v0
.end method

.method public a(BCSBJJJJ)V
    .locals 3

    iput-char p2, p0, Lcom/fimi/soul/drone/h/u;->b:C

    iput-short p3, p0, Lcom/fimi/soul/drone/h/u;->c:S

    iput-byte p4, p0, Lcom/fimi/soul/drone/h/u;->d:B

    iput-byte p1, p0, Lcom/fimi/soul/drone/h/u;->e:B

    iput-wide p5, p0, Lcom/fimi/soul/drone/h/u;->f:J

    iput-wide p7, p0, Lcom/fimi/soul/drone/h/u;->g:J

    iput-wide p9, p0, Lcom/fimi/soul/drone/h/u;->h:J

    iput-wide p11, p0, Lcom/fimi/soul/drone/h/u;->i:J

    iget-object v0, p0, Lcom/fimi/soul/drone/h/u;->a:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->Q:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    return-void
.end method

.method public b()C
    .locals 1

    iget-char v0, p0, Lcom/fimi/soul/drone/h/u;->b:C

    return v0
.end method

.method public c()S
    .locals 1

    iget-short v0, p0, Lcom/fimi/soul/drone/h/u;->c:S

    return v0
.end method

.method public d()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/soul/drone/h/u;->d:B

    return v0
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/u;->f:J

    return-wide v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/u;->g:J

    return-wide v0
.end method

.method public g()J
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/u;->h:J

    return-wide v0
.end method

.method public h()J
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/u;->i:J

    return-wide v0
.end method
