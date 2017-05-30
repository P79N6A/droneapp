.class public Lcom/fimi/soul/drone/h/a/b;
.super Lcom/fimi/soul/drone/e;


# instance fields
.field public b:B

.field public c:S

.field public d:F

.field public e:F

.field public f:B

.field public g:S

.field public h:B

.field public i:B

.field public j:B

.field public k:B

.field public l:B


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/drone/e;-><init>()V

    const/16 v0, 0xa

    iput-byte v0, p0, Lcom/fimi/soul/drone/h/a/b;->h:B

    return-void
.end method

.method public constructor <init>(Lcom/fimi/soul/drone/a;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/fimi/soul/drone/e;-><init>(Lcom/fimi/soul/drone/a;)V

    const/16 v0, 0xa

    iput-byte v0, p0, Lcom/fimi/soul/drone/h/a/b;->h:B

    return-void
.end method


# virtual methods
.method public a()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/soul/drone/h/a/b;->b:B

    return v0
.end method

.method public a(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/soul/drone/h/a/b;->f:B

    return-void
.end method

.method public a(BSFFBSBBBBB)V
    .locals 4

    invoke-static {}, Lcom/fimi/soul/biz/n/a;->a()Lcom/fimi/soul/biz/n/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/n/a;->b()Z

    move-result v0

    if-nez v0, :cond_1

    float-to-double v0, p4

    float-to-double v2, p3

    invoke-static {v0, v1, v2, v3}, Lcom/fimi/soul/utils/z;->a(DD)Lcom/fimi/soul/utils/af;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/utils/af;->b()D

    move-result-wide v2

    double-to-float v1, v2

    iput v1, p0, Lcom/fimi/soul/drone/h/a/b;->d:F

    invoke-virtual {v0}, Lcom/fimi/soul/utils/af;->a()D

    move-result-wide v0

    double-to-float v0, v0

    iput v0, p0, Lcom/fimi/soul/drone/h/a/b;->e:F

    :goto_0
    iput-byte p1, p0, Lcom/fimi/soul/drone/h/a/b;->b:B

    iput-short p2, p0, Lcom/fimi/soul/drone/h/a/b;->c:S

    iput-byte p5, p0, Lcom/fimi/soul/drone/h/a/b;->f:B

    iput-short p6, p0, Lcom/fimi/soul/drone/h/a/b;->g:S

    iput-byte p7, p0, Lcom/fimi/soul/drone/h/a/b;->h:B

    iput-byte p8, p0, Lcom/fimi/soul/drone/h/a/b;->i:B

    iput-byte p9, p0, Lcom/fimi/soul/drone/h/a/b;->j:B

    iput-byte p10, p0, Lcom/fimi/soul/drone/h/a/b;->k:B

    iput-byte p11, p0, Lcom/fimi/soul/drone/h/a/b;->l:B

    iget-object v0, p0, Lcom/fimi/soul/drone/h/a/b;->a:Lcom/fimi/soul/drone/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/drone/h/a/b;->a:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->aE:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    :cond_0
    return-void

    :cond_1
    iput p3, p0, Lcom/fimi/soul/drone/h/a/b;->d:F

    iput p4, p0, Lcom/fimi/soul/drone/h/a/b;->e:F

    goto :goto_0
.end method

.method public a(F)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/drone/h/a/b;->e:F

    return-void
.end method

.method public a(S)V
    .locals 0

    iput-short p1, p0, Lcom/fimi/soul/drone/h/a/b;->c:S

    return-void
.end method

.method public b()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/soul/drone/h/a/b;->l:B

    return v0
.end method

.method public b(F)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/drone/h/a/b;->d:F

    return-void
.end method

.method public b(S)V
    .locals 0

    iput-short p1, p0, Lcom/fimi/soul/drone/h/a/b;->g:S

    return-void
.end method

.method public c()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/soul/drone/h/a/b;->k:B

    return v0
.end method

.method public d()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/soul/drone/h/a/b;->j:B

    return v0
.end method

.method public e()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/soul/drone/h/a/b;->i:B

    return v0
.end method

.method public f()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/soul/drone/h/a/b;->h:B

    return v0
.end method

.method public g()S
    .locals 1

    iget-short v0, p0, Lcom/fimi/soul/drone/h/a/b;->g:S

    return v0
.end method

.method public h()S
    .locals 1

    iget-short v0, p0, Lcom/fimi/soul/drone/h/a/b;->c:S

    return v0
.end method

.method public i()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/soul/drone/h/a/b;->f:B

    return v0
.end method

.method public j()F
    .locals 1

    iget v0, p0, Lcom/fimi/soul/drone/h/a/b;->e:F

    return v0
.end method

.method public k()F
    .locals 1

    iget v0, p0, Lcom/fimi/soul/drone/h/a/b;->d:F

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FlyZone{Opration_code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/fimi/soul/drone/h/a/b;->b:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", number="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/fimi/soul/drone/h/a/b;->c:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Forbiden_Longitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/drone/h/a/b;->d:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Forbiden_Latitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/drone/h/a/b;->e:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/fimi/soul/drone/h/a/b;->f:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", radius="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/fimi/soul/drone/h/a/b;->g:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/fimi/soul/drone/h/a/b;->h:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", reserve1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/fimi/soul/drone/h/a/b;->i:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", reserve2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/fimi/soul/drone/h/a/b;->j:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", reserve3="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/fimi/soul/drone/h/a/b;->k:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", report="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/fimi/soul/drone/h/a/b;->l:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
