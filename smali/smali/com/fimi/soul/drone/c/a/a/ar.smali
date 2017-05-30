.class public Lcom/fimi/soul/drone/c/a/a/ar;
.super Lcom/fimi/soul/drone/c/a/b;


# static fields
.field public static final b:I = 0x3

.field public static final c:I = 0x13

.field private static final serialVersionUID:J = 0x3L


# instance fields
.field public d:S

.field public e:B

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:B

.field public k:Lcom/fimi/soul/drone/c/a/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/drone/c/a/b;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/fimi/soul/drone/c/a/a/ar;->a:I

    return-void
.end method

.method public constructor <init>(Lcom/fimi/soul/drone/c/a/c;)V
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/drone/c/a/b;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/fimi/soul/drone/c/a/a/ar;->a:I

    iput-object p1, p0, Lcom/fimi/soul/drone/c/a/a/ar;->k:Lcom/fimi/soul/drone/c/a/c;

    iget-object v0, p1, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/drone/c/a/a/ar;->a(Lcom/fimi/soul/drone/c/a/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/fimi/soul/drone/c/a/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/fimi/soul/drone/c/a/d;)V
    .locals 1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->c()V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->e()S

    move-result v0

    iput-short v0, p0, Lcom/fimi/soul/drone/c/a/a/ar;->d:S

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/ar;->e:B

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->i()F

    move-result v0

    iput v0, p0, Lcom/fimi/soul/drone/c/a/a/ar;->f:F

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->i()F

    move-result v0

    iput v0, p0, Lcom/fimi/soul/drone/c/a/a/ar;->g:F

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->j()F

    move-result v0

    iput v0, p0, Lcom/fimi/soul/drone/c/a/a/ar;->h:F

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->i()F

    move-result v0

    iput v0, p0, Lcom/fimi/soul/drone/c/a/a/ar;->i:F

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/ar;->j:B

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "msg_PosionDownlink{flightTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/fimi/soul/drone/c/a/a/ar;->d:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", SatelliteNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/fimi/soul/drone/c/a/a/ar;->e:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", CurrentLongitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/drone/c/a/a/ar;->f:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", CurrentLatitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/drone/c/a/a/ar;->g:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/drone/c/a/a/ar;->h:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", Distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/drone/c/a/a/ar;->i:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", RFsignalstrength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/fimi/soul/drone/c/a/a/ar;->j:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
