.class public Lcom/fimi/soul/drone/c/a/a/s;
.super Lcom/fimi/soul/drone/c/a/b;


# static fields
.field public static final b:I = 0x26

.field public static final c:I = 0xb

.field private static final serialVersionUID:J = 0x26L


# instance fields
.field public d:B

.field public e:B

.field public f:B

.field public g:I

.field public h:I

.field public i:Lcom/fimi/soul/drone/c/a/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/drone/c/a/b;-><init>()V

    const/16 v0, 0x26

    iput v0, p0, Lcom/fimi/soul/drone/c/a/a/s;->a:I

    return-void
.end method

.method public constructor <init>(Lcom/fimi/soul/drone/c/a/c;)V
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/drone/c/a/b;-><init>()V

    const/16 v0, 0x26

    iput v0, p0, Lcom/fimi/soul/drone/c/a/a/s;->a:I

    iput-object p1, p0, Lcom/fimi/soul/drone/c/a/a/s;->i:Lcom/fimi/soul/drone/c/a/c;

    iget-object v0, p1, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/drone/c/a/a/s;->a(Lcom/fimi/soul/drone/c/a/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/fimi/soul/drone/c/a/c;
    .locals 2

    new-instance v0, Lcom/fimi/soul/drone/c/a/c;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/c;-><init>()V

    const/16 v1, 0xb

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->b:I

    const/16 v1, 0x26

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->c:I

    return-object v0
.end method

.method public a(Lcom/fimi/soul/drone/c/a/d;)V
    .locals 1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->c()V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/s;->d:B

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/s;->e:B

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/s;->f:B

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->f()I

    move-result v0

    iput v0, p0, Lcom/fimi/soul/drone/c/a/a/s;->g:I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->f()I

    move-result v0

    iput v0, p0, Lcom/fimi/soul/drone/c/a/a/s;->h:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IMUWorkStateInfoDwonLink{ISCHECK="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/fimi/soul/drone/c/a/a/s;->f:B

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "imuWorkState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/drone/c/a/a/s;->g:I

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", magWorkState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/drone/c/a/a/s;->h:I

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", miLinkPacket="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/drone/c/a/a/s;->i:Lcom/fimi/soul/drone/c/a/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
