.class public Lcom/fimi/soul/drone/h/i;
.super Lcom/fimi/soul/drone/h/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/drone/h/i$a;,
        Lcom/fimi/soul/drone/h/i$b;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Z

.field private c:Lcom/fimi/soul/drone/h/i$b;

.field private d:Lcom/fimi/soul/drone/h/i$a;

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/fimi/soul/drone/h/a;-><init>()V

    iput-boolean v1, p0, Lcom/fimi/soul/drone/h/i;->a:Z

    iput-boolean v1, p0, Lcom/fimi/soul/drone/h/i;->b:Z

    sget-object v0, Lcom/fimi/soul/drone/h/i$b;->a:Lcom/fimi/soul/drone/h/i$b;

    iput-object v0, p0, Lcom/fimi/soul/drone/h/i;->c:Lcom/fimi/soul/drone/h/i$b;

    sget-object v0, Lcom/fimi/soul/drone/h/i$a;->a:Lcom/fimi/soul/drone/h/i$a;

    iput-object v0, p0, Lcom/fimi/soul/drone/h/i;->d:Lcom/fimi/soul/drone/h/i$a;

    iput v1, p0, Lcom/fimi/soul/drone/h/i;->e:I

    iput v1, p0, Lcom/fimi/soul/drone/h/i;->f:I

    return-void
.end method

.method private a(B)Lcom/fimi/soul/drone/h/i$a;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    sget-object v0, Lcom/fimi/soul/drone/h/i$a;->b:Lcom/fimi/soul/drone/h/i$a;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    sget-object v0, Lcom/fimi/soul/drone/h/i$a;->c:Lcom/fimi/soul/drone/h/i$a;

    goto :goto_0

    :cond_1
    const/4 v0, 0x6

    if-ne p1, v0, :cond_2

    sget-object v0, Lcom/fimi/soul/drone/h/i$a;->d:Lcom/fimi/soul/drone/h/i$a;

    goto :goto_0

    :cond_2
    const/16 v0, 0x9

    if-ne p1, v0, :cond_3

    sget-object v0, Lcom/fimi/soul/drone/h/i$a;->e:Lcom/fimi/soul/drone/h/i$a;

    goto :goto_0

    :cond_3
    const/4 v0, 0x5

    if-ne p1, v0, :cond_4

    sget-object v0, Lcom/fimi/soul/drone/h/i$a;->f:Lcom/fimi/soul/drone/h/i$a;

    goto :goto_0

    :cond_4
    sget-object v0, Lcom/fimi/soul/drone/h/i$a;->a:Lcom/fimi/soul/drone/h/i$a;

    goto :goto_0
.end method

.method private b(B)Lcom/fimi/soul/drone/h/i$b;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    sget-object v0, Lcom/fimi/soul/drone/h/i$b;->a:Lcom/fimi/soul/drone/h/i$b;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    sget-object v0, Lcom/fimi/soul/drone/h/i$b;->b:Lcom/fimi/soul/drone/h/i$b;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/fimi/soul/drone/h/i$b;->a:Lcom/fimi/soul/drone/h/i$b;

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/fimi/soul/drone/c/a/d;)V
    .locals 5

    const/4 v4, 0x1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->c()V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v1

    invoke-virtual {p0}, Lcom/fimi/soul/drone/h/i;->a()I

    move-result v2

    const/16 v3, 0x33

    if-ne v2, v3, :cond_0

    mul-int/lit8 v2, v1, 0x64

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v3

    add-int/2addr v2, v3

    iput v2, p0, Lcom/fimi/soul/drone/h/i;->e:I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v2

    iput v2, p0, Lcom/fimi/soul/drone/h/i;->f:I

    :cond_0
    invoke-direct {p0, v0}, Lcom/fimi/soul/drone/h/i;->a(B)Lcom/fimi/soul/drone/h/i$a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/drone/h/i;->a(Lcom/fimi/soul/drone/h/i$a;)V

    invoke-direct {p0, v1}, Lcom/fimi/soul/drone/h/i;->b(B)Lcom/fimi/soul/drone/h/i$b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/drone/h/i;->a(Lcom/fimi/soul/drone/h/i$b;)V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    if-ne v0, v4, :cond_1

    invoke-virtual {p0, v4}, Lcom/fimi/soul/drone/h/i;->b(Z)V

    :cond_1
    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    if-ne v0, v4, :cond_2

    invoke-virtual {p0, v4}, Lcom/fimi/soul/drone/h/i;->a(Z)V

    :cond_2
    return-void
.end method

.method public a(Lcom/fimi/soul/drone/h/i$a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/h/i;->d:Lcom/fimi/soul/drone/h/i$a;

    return-void
.end method

.method public a(Lcom/fimi/soul/drone/h/i$b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/h/i;->c:Lcom/fimi/soul/drone/h/i$b;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/drone/h/i;->b:Z

    return-void
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/drone/h/i;->f:I

    return v0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/drone/h/i;->f:I

    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/drone/h/i;->a:Z

    return-void
.end method

.method public c()Lcom/fimi/soul/drone/h/i$b;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/h/i;->c:Lcom/fimi/soul/drone/h/i$b;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/drone/h/i;->e:I

    return v0
.end method

.method public e()Lcom/fimi/soul/drone/h/i$a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/h/i;->d:Lcom/fimi/soul/drone/h/i$a;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/drone/h/i;->b:Z

    return v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/drone/h/i;->a:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CloudCamraActionVariable{isFormatSDCard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/fimi/soul/drone/h/i;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isResetFactory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/fimi/soul/drone/h/i;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cameraRequestType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/drone/h/i;->c:Lcom/fimi/soul/drone/h/i$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cameraActionType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/drone/h/i;->d:Lcom/fimi/soul/drone/h/i$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
