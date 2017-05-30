.class public Lcom/fimi/soul/drone/h/ak;
.super Lcom/fimi/soul/drone/e;


# instance fields
.field public b:D

.field public c:I

.field public d:D

.field public e:D

.field public f:D

.field public g:S

.field public h:I

.field public i:I

.field public j:B

.field public k:B

.field public l:B


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/drone/e;-><init>(Lcom/fimi/soul/drone/a;)V

    return-void
.end method


# virtual methods
.method public a()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/soul/drone/h/ak;->l:B

    return v0
.end method

.method public a(DIFFDSIIBBB)V
    .locals 6

    invoke-static {}, Lcom/fimi/soul/biz/n/a;->a()Lcom/fimi/soul/biz/n/a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/biz/n/a;->b()Z

    move-result v2

    if-nez v2, :cond_0

    float-to-double v2, p5

    float-to-double v4, p4

    invoke-static {v2, v3, v4, v5}, Lcom/fimi/soul/utils/z;->a(DD)Lcom/fimi/soul/utils/af;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/utils/af;->b()D

    move-result-wide v4

    iput-wide v4, p0, Lcom/fimi/soul/drone/h/ak;->d:D

    invoke-virtual {v2}, Lcom/fimi/soul/utils/af;->a()D

    move-result-wide v2

    iput-wide v2, p0, Lcom/fimi/soul/drone/h/ak;->e:D

    :goto_0
    iput-wide p1, p0, Lcom/fimi/soul/drone/h/ak;->b:D

    iput p3, p0, Lcom/fimi/soul/drone/h/ak;->c:I

    iput-wide p6, p0, Lcom/fimi/soul/drone/h/ak;->f:D

    iput-short p8, p0, Lcom/fimi/soul/drone/h/ak;->g:S

    and-int/lit16 v2, p9, 0xff

    iput v2, p0, Lcom/fimi/soul/drone/h/ak;->h:I

    move/from16 v0, p10

    and-int/lit16 v2, v0, 0xff

    iput v2, p0, Lcom/fimi/soul/drone/h/ak;->i:I

    move/from16 v0, p11

    iput-byte v0, p0, Lcom/fimi/soul/drone/h/ak;->j:B

    move/from16 v0, p12

    iput-byte v0, p0, Lcom/fimi/soul/drone/h/ak;->k:B

    move/from16 v0, p13

    iput-byte v0, p0, Lcom/fimi/soul/drone/h/ak;->l:B

    iget-object v2, p0, Lcom/fimi/soul/drone/h/ak;->a:Lcom/fimi/soul/drone/a;

    sget-object v3, Lcom/fimi/soul/drone/d$a;->x:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v2, v3}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    return-void

    :cond_0
    float-to-double v2, p4

    iput-wide v2, p0, Lcom/fimi/soul/drone/h/ak;->d:D

    float-to-double v2, p5

    iput-wide v2, p0, Lcom/fimi/soul/drone/h/ak;->e:D

    goto :goto_0
.end method

.method public b()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/soul/drone/h/ak;->k:B

    return v0
.end method

.method public c()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/soul/drone/h/ak;->j:B

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/drone/h/ak;->i:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/drone/h/ak;->h:I

    return v0
.end method

.method public f()S
    .locals 1

    iget-short v0, p0, Lcom/fimi/soul/drone/h/ak;->g:S

    return v0
.end method

.method public g()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/ak;->f:D

    return-wide v0
.end method

.method public h()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/ak;->e:D

    return-wide v0
.end method

.method public i()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/ak;->d:D

    return-wide v0
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/drone/h/ak;->c:I

    return v0
.end method

.method public k()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/ak;->b:D

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ReceiveSettingPoint{PacketSequence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/h/ak;->b:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Opration_Code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/drone/h/ak;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", POI_Longitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/h/ak;->d:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", POI_Latitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/h/ak;->e:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", POI_Altitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/fimi/soul/drone/h/ak;->f:D

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Radius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/fimi/soul/drone/h/ak;->g:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", speek="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/drone/h/ak;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Start_Point_Pole_Angle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/drone/h/ak;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Paral="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/fimi/soul/drone/h/ak;->j:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", yaw_mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/fimi/soul/drone/h/ak;->k:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", report="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/fimi/soul/drone/h/ak;->l:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
