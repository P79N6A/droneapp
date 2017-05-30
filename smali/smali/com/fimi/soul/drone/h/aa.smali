.class public Lcom/fimi/soul/drone/h/aa;
.super Lcom/fimi/soul/drone/e;


# instance fields
.field public b:S

.field public c:S

.field public d:S

.field public e:S

.field public f:S

.field public g:S


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/drone/e;-><init>(Lcom/fimi/soul/drone/a;)V

    return-void
.end method


# virtual methods
.method public a(FFF)D
    .locals 8

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    float-to-double v0, p1

    invoke-static {v0, v1, v6, v7}, Ljava/lang/StrictMath;->pow(DD)D

    move-result-wide v0

    float-to-double v2, p2

    invoke-static {v2, v3, v6, v7}, Ljava/lang/StrictMath;->pow(DD)D

    move-result-wide v2

    float-to-double v4, p3

    invoke-static {v4, v5, v6, v7}, Ljava/lang/StrictMath;->pow(DD)D

    move-result-wide v4

    add-double/2addr v0, v2

    add-double/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    return-wide v0
.end method

.method public a()F
    .locals 2

    iget-short v0, p0, Lcom/fimi/soul/drone/h/aa;->b:S

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    div-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public a(SSSSSS)V
    .locals 2

    iput-short p1, p0, Lcom/fimi/soul/drone/h/aa;->b:S

    iput-short p2, p0, Lcom/fimi/soul/drone/h/aa;->c:S

    iput-short p3, p0, Lcom/fimi/soul/drone/h/aa;->d:S

    iput-short p4, p0, Lcom/fimi/soul/drone/h/aa;->e:S

    iput-short p5, p0, Lcom/fimi/soul/drone/h/aa;->f:S

    iput-short p6, p0, Lcom/fimi/soul/drone/h/aa;->g:S

    iget-object v0, p0, Lcom/fimi/soul/drone/h/aa;->a:Lcom/fimi/soul/drone/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/drone/h/aa;->a:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->h:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    :cond_0
    return-void
.end method

.method public b()F
    .locals 2

    iget-short v0, p0, Lcom/fimi/soul/drone/h/aa;->c:S

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    div-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public c()F
    .locals 2

    iget-short v0, p0, Lcom/fimi/soul/drone/h/aa;->d:S

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    div-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "##0.00"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/fimi/soul/drone/h/aa;->a()F

    move-result v1

    invoke-virtual {p0}, Lcom/fimi/soul/drone/h/aa;->b()F

    move-result v2

    invoke-virtual {p0}, Lcom/fimi/soul/drone/h/aa;->c()F

    move-result v3

    invoke-virtual {p0, v1, v2, v3}, Lcom/fimi/soul/drone/h/aa;->a(FFF)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()F
    .locals 2

    iget-short v0, p0, Lcom/fimi/soul/drone/h/aa;->e:S

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    div-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public f()F
    .locals 2

    iget-short v0, p0, Lcom/fimi/soul/drone/h/aa;->f:S

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    div-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public g()F
    .locals 2

    iget-short v0, p0, Lcom/fimi/soul/drone/h/aa;->g:S

    mul-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    div-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/fimi/soul/drone/h/aa;->e()F

    move-result v0

    invoke-virtual {p0}, Lcom/fimi/soul/drone/h/aa;->f()F

    move-result v1

    invoke-virtual {p0}, Lcom/fimi/soul/drone/h/aa;->g()F

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/fimi/soul/drone/h/aa;->a(FFF)D

    move-result-wide v0

    new-instance v2, Ljava/text/DecimalFormat;

    const-string v3, "##0.00"

    invoke-direct {v2, v3}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IMUInfo{gyroX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/fimi/soul/drone/h/aa;->b:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", gyroY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/fimi/soul/drone/h/aa;->c:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", gyroZ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/fimi/soul/drone/h/aa;->d:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accelX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/fimi/soul/drone/h/aa;->e:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accelY="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/fimi/soul/drone/h/aa;->f:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", accelZ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/fimi/soul/drone/h/aa;->g:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
