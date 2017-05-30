.class public Lcom/fimi/soul/drone/h/ag;
.super Lcom/fimi/soul/drone/e;


# instance fields
.field private b:D

.field private c:B

.field private d:D

.field private e:D

.field private f:D

.field private g:D

.field private h:B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/drone/e;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/fimi/soul/drone/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/drone/e;-><init>(Lcom/fimi/soul/drone/a;)V

    return-void
.end method


# virtual methods
.method public a()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/soul/drone/h/ag;->h:B

    return v0
.end method

.method public a(DBFFDDB)V
    .locals 4

    iput-wide p1, p0, Lcom/fimi/soul/drone/h/ag;->b:D

    iput-byte p3, p0, Lcom/fimi/soul/drone/h/ag;->c:B

    invoke-static {}, Lcom/fimi/soul/biz/n/a;->a()Lcom/fimi/soul/biz/n/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/n/a;->b()Z

    move-result v0

    if-nez v0, :cond_1

    float-to-double v0, p5

    float-to-double v2, p4

    invoke-static {v0, v1, v2, v3}, Lcom/fimi/soul/utils/z;->a(DD)Lcom/fimi/soul/utils/af;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/utils/af;->b()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/fimi/soul/drone/h/ag;->d:D

    invoke-virtual {v0}, Lcom/fimi/soul/utils/af;->a()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/fimi/soul/drone/h/ag;->e:D

    :goto_0
    iput-wide p8, p0, Lcom/fimi/soul/drone/h/ag;->g:D

    iput-byte p10, p0, Lcom/fimi/soul/drone/h/ag;->h:B

    iput-wide p6, p0, Lcom/fimi/soul/drone/h/ag;->f:D

    iget-object v0, p0, Lcom/fimi/soul/drone/h/ag;->a:Lcom/fimi/soul/drone/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/drone/h/ag;->a:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->K:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    :cond_0
    return-void

    :cond_1
    float-to-double v0, p4

    iput-wide v0, p0, Lcom/fimi/soul/drone/h/ag;->d:D

    float-to-double v0, p5

    iput-wide v0, p0, Lcom/fimi/soul/drone/h/ag;->e:D

    goto :goto_0
.end method

.method public b()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/ag;->b:D

    return-wide v0
.end method

.method public c()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/soul/drone/h/ag;->c:B

    return v0
.end method

.method public d()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/ag;->d:D

    return-wide v0
.end method

.method public e()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/ag;->e:D

    return-wide v0
.end method

.method public f()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/ag;->f:D

    return-wide v0
.end method

.method public g()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/ag;->g:D

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Pert{flighttime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/h/ag;->b:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", SatelliteNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/fimi/soul/drone/h/ag;->c:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", CurrentLongitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/h/ag;->d:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", CurrentLatitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/h/ag;->e:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/h/ag;->f:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/h/ag;->g:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", RFsignalstrength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/fimi/soul/drone/h/ag;->h:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
