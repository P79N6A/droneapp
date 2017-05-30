.class public Lcom/fimi/soul/drone/c/a/a/l;
.super Lcom/fimi/soul/drone/c/a/b;

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final b:I

.field private final c:B

.field private d:[B

.field private e:[B

.field private f:B


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v1, 0x89

    invoke-direct {p0}, Lcom/fimi/soul/drone/c/a/b;-><init>()V

    iput v1, p0, Lcom/fimi/soul/drone/c/a/a/l;->b:I

    const/16 v0, 0x13

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/l;->c:B

    const/4 v0, 0x2

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/fimi/soul/drone/c/a/a/l;->d:[B

    iput v1, p0, Lcom/fimi/soul/drone/c/a/a/l;->a:I

    return-void
.end method


# virtual methods
.method public a()Lcom/fimi/soul/drone/c/a/c;
    .locals 6

    new-instance v1, Lcom/fimi/soul/drone/c/a/c;

    invoke-direct {v1}, Lcom/fimi/soul/drone/c/a/c;-><init>()V

    const/16 v0, 0x89

    iput v0, v1, Lcom/fimi/soul/drone/c/a/c;->c:I

    const/16 v0, 0x13

    iput v0, v1, Lcom/fimi/soul/drone/c/a/c;->b:I

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/a/l;->e:[B

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/a/l;->e:[B

    array-length v0, v0

    if-lez v0, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/drone/c/a/a/l;->e:[B

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-byte v4, v2, v0

    iget-object v5, v1, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v5, v4}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public a(B)V
    .locals 0

    iput-byte p1, p0, Lcom/fimi/soul/drone/c/a/a/l;->f:B

    return-void
.end method

.method public a(Lcom/fimi/soul/drone/c/a/c;)V
    .locals 1

    iget-object v0, p1, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/drone/c/a/a/l;->a(Lcom/fimi/soul/drone/c/a/d;)V

    return-void
.end method

.method public a(Lcom/fimi/soul/drone/c/a/d;)V
    .locals 3

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->c()V

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/a/l;->d:[B

    const/4 v1, 0x0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v2

    aput-byte v2, v0, v1

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/a/l;->d:[B

    const/4 v1, 0x1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v2

    aput-byte v2, v0, v1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/l;->f:B

    return-void
.end method

.method public a([B)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/c/a/a/l;->d:[B

    return-void
.end method

.method public b([B)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/c/a/a/l;->e:[B

    return-void
.end method

.method public b()[B
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/a/l;->d:[B

    return-object v0
.end method

.method public c()B
    .locals 1

    iget-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/l;->f:B

    return v0
.end method
