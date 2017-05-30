.class public Lcom/fimi/soul/drone/h/h;
.super Lcom/fimi/soul/drone/h/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/drone/h/h$a;,
        Lcom/fimi/soul/drone/h/h$e;,
        Lcom/fimi/soul/drone/h/h$c;,
        Lcom/fimi/soul/drone/h/h$b;,
        Lcom/fimi/soul/drone/h/h$f;,
        Lcom/fimi/soul/drone/h/h$d;
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Lcom/fimi/soul/drone/h/h$d;

.field private c:Lcom/fimi/soul/drone/h/h$f;

.field private d:Lcom/fimi/soul/drone/h/h$e;

.field private e:Lcom/fimi/soul/drone/h/h$a;

.field private f:Lcom/fimi/soul/drone/h/h$c;

.field private g:Lcom/fimi/soul/drone/h/h$b;

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:I

.field private l:S

.field private m:S


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x1

    invoke-direct {p0}, Lcom/fimi/soul/drone/h/a;-><init>()V

    iput-boolean v1, p0, Lcom/fimi/soul/drone/h/h;->a:Z

    sget-object v0, Lcom/fimi/soul/drone/h/h$d;->b:Lcom/fimi/soul/drone/h/h$d;

    iput-object v0, p0, Lcom/fimi/soul/drone/h/h;->b:Lcom/fimi/soul/drone/h/h$d;

    sget-object v0, Lcom/fimi/soul/drone/h/h$f;->c:Lcom/fimi/soul/drone/h/h$f;

    iput-object v0, p0, Lcom/fimi/soul/drone/h/h;->c:Lcom/fimi/soul/drone/h/h$f;

    sget-object v0, Lcom/fimi/soul/drone/h/h$e;->i:Lcom/fimi/soul/drone/h/h$e;

    iput-object v0, p0, Lcom/fimi/soul/drone/h/h;->d:Lcom/fimi/soul/drone/h/h$e;

    sget-object v0, Lcom/fimi/soul/drone/h/h$a;->b:Lcom/fimi/soul/drone/h/h$a;

    iput-object v0, p0, Lcom/fimi/soul/drone/h/h;->e:Lcom/fimi/soul/drone/h/h$a;

    sget-object v0, Lcom/fimi/soul/drone/h/h$c;->a:Lcom/fimi/soul/drone/h/h$c;

    iput-object v0, p0, Lcom/fimi/soul/drone/h/h;->f:Lcom/fimi/soul/drone/h/h$c;

    sget-object v0, Lcom/fimi/soul/drone/h/h$b;->c:Lcom/fimi/soul/drone/h/h$b;

    iput-object v0, p0, Lcom/fimi/soul/drone/h/h;->g:Lcom/fimi/soul/drone/h/h$b;

    iput-boolean v1, p0, Lcom/fimi/soul/drone/h/h;->h:Z

    iput-boolean v1, p0, Lcom/fimi/soul/drone/h/h;->i:Z

    iput-boolean v1, p0, Lcom/fimi/soul/drone/h/h;->j:Z

    iput v2, p0, Lcom/fimi/soul/drone/h/h;->k:I

    iput-short v2, p0, Lcom/fimi/soul/drone/h/h;->l:S

    iput-short v2, p0, Lcom/fimi/soul/drone/h/h;->m:S

    return-void
.end method

.method private a(B)Lcom/fimi/soul/drone/h/h$d;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    sget-object v0, Lcom/fimi/soul/drone/h/h$d;->a:Lcom/fimi/soul/drone/h/h$d;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    sget-object v0, Lcom/fimi/soul/drone/h/h$d;->b:Lcom/fimi/soul/drone/h/h$d;

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    sget-object v0, Lcom/fimi/soul/drone/h/h$d;->c:Lcom/fimi/soul/drone/h/h$d;

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/fimi/soul/drone/h/h$d;->b:Lcom/fimi/soul/drone/h/h$d;

    goto :goto_0
.end method

.method private b(B)Lcom/fimi/soul/drone/h/h$f;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    sget-object v0, Lcom/fimi/soul/drone/h/h$f;->a:Lcom/fimi/soul/drone/h/h$f;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    sget-object v0, Lcom/fimi/soul/drone/h/h$f;->b:Lcom/fimi/soul/drone/h/h$f;

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    sget-object v0, Lcom/fimi/soul/drone/h/h$f;->c:Lcom/fimi/soul/drone/h/h$f;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/drone/h/h;->c:Lcom/fimi/soul/drone/h/h$f;

    sget-object v0, Lcom/fimi/soul/drone/h/h$f;->a:Lcom/fimi/soul/drone/h/h$f;

    goto :goto_0
.end method

.method private c(B)Lcom/fimi/soul/drone/h/h$e;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    sget-object v0, Lcom/fimi/soul/drone/h/h$e;->a:Lcom/fimi/soul/drone/h/h$e;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    sget-object v0, Lcom/fimi/soul/drone/h/h$e;->b:Lcom/fimi/soul/drone/h/h$e;

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    sget-object v0, Lcom/fimi/soul/drone/h/h$e;->c:Lcom/fimi/soul/drone/h/h$e;

    goto :goto_0

    :cond_2
    const/4 v0, 0x4

    if-ne p1, v0, :cond_3

    sget-object v0, Lcom/fimi/soul/drone/h/h$e;->d:Lcom/fimi/soul/drone/h/h$e;

    goto :goto_0

    :cond_3
    const/4 v0, 0x5

    if-ne p1, v0, :cond_4

    sget-object v0, Lcom/fimi/soul/drone/h/h$e;->e:Lcom/fimi/soul/drone/h/h$e;

    goto :goto_0

    :cond_4
    const/4 v0, 0x6

    if-ne p1, v0, :cond_5

    sget-object v0, Lcom/fimi/soul/drone/h/h$e;->f:Lcom/fimi/soul/drone/h/h$e;

    goto :goto_0

    :cond_5
    const/4 v0, 0x7

    if-ne p1, v0, :cond_6

    sget-object v0, Lcom/fimi/soul/drone/h/h$e;->g:Lcom/fimi/soul/drone/h/h$e;

    goto :goto_0

    :cond_6
    const/16 v0, 0x8

    if-ne p1, v0, :cond_7

    sget-object v0, Lcom/fimi/soul/drone/h/h$e;->h:Lcom/fimi/soul/drone/h/h$e;

    goto :goto_0

    :cond_7
    const/16 v0, 0x9

    if-ne p1, v0, :cond_8

    sget-object v0, Lcom/fimi/soul/drone/h/h$e;->i:Lcom/fimi/soul/drone/h/h$e;

    goto :goto_0

    :cond_8
    const/16 v0, 0xa

    if-ne p1, v0, :cond_9

    sget-object v0, Lcom/fimi/soul/drone/h/h$e;->j:Lcom/fimi/soul/drone/h/h$e;

    goto :goto_0

    :cond_9
    sget-object v0, Lcom/fimi/soul/drone/h/h$e;->i:Lcom/fimi/soul/drone/h/h$e;

    goto :goto_0
.end method

.method private d(B)Lcom/fimi/soul/drone/h/h$a;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    sget-object v0, Lcom/fimi/soul/drone/h/h$a;->a:Lcom/fimi/soul/drone/h/h$a;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    sget-object v0, Lcom/fimi/soul/drone/h/h$a;->b:Lcom/fimi/soul/drone/h/h$a;

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    sget-object v0, Lcom/fimi/soul/drone/h/h$a;->c:Lcom/fimi/soul/drone/h/h$a;

    goto :goto_0

    :cond_2
    const/4 v0, 0x4

    if-ne p1, v0, :cond_3

    sget-object v0, Lcom/fimi/soul/drone/h/h$a;->d:Lcom/fimi/soul/drone/h/h$a;

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/fimi/soul/drone/h/h$a;->a:Lcom/fimi/soul/drone/h/h$a;

    goto :goto_0
.end method

.method private e(B)Lcom/fimi/soul/drone/h/h$c;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    sget-object v0, Lcom/fimi/soul/drone/h/h$c;->a:Lcom/fimi/soul/drone/h/h$c;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    sget-object v0, Lcom/fimi/soul/drone/h/h$c;->b:Lcom/fimi/soul/drone/h/h$c;

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    sget-object v0, Lcom/fimi/soul/drone/h/h$c;->c:Lcom/fimi/soul/drone/h/h$c;

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/fimi/soul/drone/h/h$c;->a:Lcom/fimi/soul/drone/h/h$c;

    goto :goto_0
.end method

.method private f(B)Lcom/fimi/soul/drone/h/h$b;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    sget-object v0, Lcom/fimi/soul/drone/h/h$b;->a:Lcom/fimi/soul/drone/h/h$b;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    sget-object v0, Lcom/fimi/soul/drone/h/h$b;->b:Lcom/fimi/soul/drone/h/h$b;

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    sget-object v0, Lcom/fimi/soul/drone/h/h$b;->c:Lcom/fimi/soul/drone/h/h$b;

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/fimi/soul/drone/h/h$b;->c:Lcom/fimi/soul/drone/h/h$b;

    goto :goto_0
.end method

.method private g(B)B
    .locals 1

    and-int/lit8 v0, p1, 0x3f

    int-to-byte v0, v0

    return v0
.end method

.method private h(B)B
    .locals 1

    and-int/lit16 v0, p1, 0xc0

    ushr-int/lit8 v0, v0, 0x6

    int-to-byte v0, v0

    return v0
.end method


# virtual methods
.method public a(Lcom/fimi/soul/drone/c/a/d;)V
    .locals 4

    const/4 v3, 0x2

    const/4 v2, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->c()V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/drone/h/h;->a(B)Lcom/fimi/soul/drone/h/h$d;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/drone/h/h;->a(Lcom/fimi/soul/drone/h/h$d;)V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/drone/h/h;->b(B)Lcom/fimi/soul/drone/h/h$f;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/drone/h/h;->a(Lcom/fimi/soul/drone/h/h$f;)V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/drone/h/h;->c(B)Lcom/fimi/soul/drone/h/h$e;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/drone/h/h;->a(Lcom/fimi/soul/drone/h/h$e;)V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/drone/h/h;->d(B)Lcom/fimi/soul/drone/h/h$a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/drone/h/h;->a(Lcom/fimi/soul/drone/h/h$a;)V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/drone/h/h;->e(B)Lcom/fimi/soul/drone/h/h$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/drone/h/h;->a(Lcom/fimi/soul/drone/h/h$c;)V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/drone/h/h;->f(B)Lcom/fimi/soul/drone/h/h$b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/drone/h/h;->a(Lcom/fimi/soul/drone/h/h$b;)V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    if-ne v0, v3, :cond_1

    invoke-virtual {p0, v2}, Lcom/fimi/soul/drone/h/h;->c(Z)V

    :goto_0
    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    if-ne v0, v3, :cond_2

    invoke-virtual {p0, v2}, Lcom/fimi/soul/drone/h/h;->b(Z)V

    :goto_1
    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    if-ne v0, v3, :cond_3

    invoke-virtual {p0, v2}, Lcom/fimi/soul/drone/h/h;->c(Z)V

    :goto_2
    invoke-virtual {p0}, Lcom/fimi/soul/drone/h/h;->a()I

    move-result v0

    const/16 v1, 0x33

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->f()I

    move-result v0

    iput v0, p0, Lcom/fimi/soul/drone/h/h;->k:I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->e()S

    move-result v0

    iput-short v0, p0, Lcom/fimi/soul/drone/h/h;->l:S

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->e()S

    move-result v0

    iput-short v0, p0, Lcom/fimi/soul/drone/h/h;->m:S

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0, v1}, Lcom/fimi/soul/drone/h/h;->c(Z)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v1}, Lcom/fimi/soul/drone/h/h;->b(Z)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v1}, Lcom/fimi/soul/drone/h/h;->c(Z)V

    goto :goto_2
.end method

.method public a(Lcom/fimi/soul/drone/h/h$a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/h/h;->e:Lcom/fimi/soul/drone/h/h$a;

    return-void
.end method

.method public a(Lcom/fimi/soul/drone/h/h$b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/h/h;->g:Lcom/fimi/soul/drone/h/h$b;

    return-void
.end method

.method public a(Lcom/fimi/soul/drone/h/h$c;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/h/h;->f:Lcom/fimi/soul/drone/h/h$c;

    return-void
.end method

.method public a(Lcom/fimi/soul/drone/h/h$d;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/h/h;->b:Lcom/fimi/soul/drone/h/h$d;

    return-void
.end method

.method public a(Lcom/fimi/soul/drone/h/h$e;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/h/h;->d:Lcom/fimi/soul/drone/h/h$e;

    return-void
.end method

.method public a(Lcom/fimi/soul/drone/h/h$f;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/h/h;->c:Lcom/fimi/soul/drone/h/h$f;

    return-void
.end method

.method public a(S)V
    .locals 0

    iput-short p1, p0, Lcom/fimi/soul/drone/h/h;->l:S

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/drone/h/h;->h:Z

    return-void
.end method

.method public b()Lcom/fimi/soul/drone/h/h$a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/h/h;->e:Lcom/fimi/soul/drone/h/h$a;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/drone/h/h;->k:I

    return-void
.end method

.method public b(S)V
    .locals 0

    iput-short p1, p0, Lcom/fimi/soul/drone/h/h;->m:S

    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/drone/h/h;->i:Z

    return-void
.end method

.method public c()Lcom/fimi/soul/drone/h/h$b;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/h/h;->g:Lcom/fimi/soul/drone/h/h$b;

    return-object v0
.end method

.method public c(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/drone/h/h;->j:Z

    return-void
.end method

.method public d(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/drone/h/h;->a:Z

    return-void
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/drone/h/h;->h:Z

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/drone/h/h;->i:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/drone/h/h;->j:Z

    return v0
.end method

.method public g()Lcom/fimi/soul/drone/h/h$e;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/h/h;->d:Lcom/fimi/soul/drone/h/h$e;

    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/drone/h/h;->a:Z

    return v0
.end method

.method public i()Lcom/fimi/soul/drone/h/h$f;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/h/h;->c:Lcom/fimi/soul/drone/h/h$f;

    return-object v0
.end method

.method public j()Lcom/fimi/soul/drone/h/h$d;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/h/h;->b:Lcom/fimi/soul/drone/h/h$d;

    return-object v0
.end method

.method public k()Lcom/fimi/soul/drone/h/h$c;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/h/h;->f:Lcom/fimi/soul/drone/h/h$c;

    return-object v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/drone/h/h;->k:I

    return v0
.end method

.method public m()S
    .locals 1

    iget-short v0, p0, Lcom/fimi/soul/drone/h/h;->l:S

    return v0
.end method

.method public n()S
    .locals 1

    iget-short v0, p0, Lcom/fimi/soul/drone/h/h;->m:S

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CloudCameraVariable{isLenAC="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/fimi/soul/drone/h/h;->a:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", videoQualityType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/drone/h/h;->b:Lcom/fimi/soul/drone/h/h$d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", videoTimeStampType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/drone/h/h;->c:Lcom/fimi/soul/drone/h/h$f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", videoResolutionType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/drone/h/h;->d:Lcom/fimi/soul/drone/h/h$e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imageResolutionType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/drone/h/h;->e:Lcom/fimi/soul/drone/h/h$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shotModeType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/drone/h/h;->f:Lcom/fimi/soul/drone/h/h$c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", photoTimeStampType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/drone/h/h;->g:Lcom/fimi/soul/drone/h/h$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", enableAutoLowLight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/fimi/soul/drone/h/h;->h:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", enableRecycleRecord="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/fimi/soul/drone/h/h;->i:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", enableAutoAC="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/fimi/soul/drone/h/h;->j:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cameraTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/drone/h/h;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cameraTotalStorage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/fimi/soul/drone/h/h;->l:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cameraRemainStorage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-short v1, p0, Lcom/fimi/soul/drone/h/h;->m:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
