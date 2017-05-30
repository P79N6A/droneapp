.class public Lcom/fimi/soul/drone/h/al;
.super Lcom/fimi/soul/drone/e;


# instance fields
.field public volatile b:I

.field public c:D

.field public d:D

.field public e:D

.field public f:D

.field public g:D

.field public h:D

.field public i:D

.field private j:B


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/drone/e;-><init>(Lcom/fimi/soul/drone/a;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/drone/h/al;->b:I

    return v0
.end method

.method public a(IFFDDDDDB)V
    .locals 6

    invoke-static {}, Lcom/fimi/soul/biz/n/a;->a()Lcom/fimi/soul/biz/n/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/biz/n/a;->b()Z

    move-result v2

    if-nez v2, :cond_0

    float-to-double v2, p3

    float-to-double v4, p2

    invoke-static {v2, v3, v4, v5}, Lcom/fimi/soul/utils/z;->a(DD)Lcom/fimi/soul/utils/af;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/utils/af;->b()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/fimi/soul/drone/h/al;->c:D

    invoke-virtual {v2}, Lcom/fimi/soul/utils/af;->a()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/fimi/soul/drone/h/al;->d:D

    :goto_0
    iput p1, p0, Lcom/fimi/soul/drone/h/al;->b:I

    iput-wide p4, p0, Lcom/fimi/soul/drone/h/al;->e:D

    iput-wide p6, p0, Lcom/fimi/soul/drone/h/al;->f:D

    iput-wide p8, p0, Lcom/fimi/soul/drone/h/al;->g:D

    move-wide/from16 v0, p10

    iput-wide v0, p0, Lcom/fimi/soul/drone/h/al;->h:D

    move-wide/from16 v0, p12

    iput-wide v0, p0, Lcom/fimi/soul/drone/h/al;->i:D

    move/from16 v0, p14

    iput-byte v0, p0, Lcom/fimi/soul/drone/h/al;->j:B

    iget-object v2, p0, Lcom/fimi/soul/drone/h/al;->a:Lcom/fimi/soul/drone/a;

    sget-object v3, Lcom/fimi/soul/drone/d$a;->q:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    return-void

    :cond_0
    float-to-double v2, p2

    iput-wide v2, p0, Lcom/fimi/soul/drone/h/al;->c:D

    float-to-double v2, p3

    iput-wide v2, p0, Lcom/fimi/soul/drone/h/al;->d:D

    goto :goto_0
.end method

.method public b()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/al;->c:D

    return-wide v0
.end method

.method public c()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/al;->d:D

    return-wide v0
.end method

.method public d()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/al;->e:D

    return-wide v0
.end method

.method public e()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/al;->f:D

    return-wide v0
.end method

.method public f()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/al;->g:D

    return-wide v0
.end method

.method public g()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/al;->h:D

    return-wide v0
.end method

.method public h()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/al;->i:D

    return-wide v0
.end method

.method public i()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/soul/drone/h/al;->j:B

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Receivepoint [number="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/drone/h/al;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Longitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/h/al;->c:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Latitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/h/al;->d:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Altitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/h/al;->e:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", yaw_angle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/h/al;->f:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hover_time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/h/al;->g:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", report="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/h/al;->h:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Number_to_be_transmited="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/h/al;->i:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
