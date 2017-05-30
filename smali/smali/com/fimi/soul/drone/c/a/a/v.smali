.class public Lcom/fimi/soul/drone/c/a/a/v;
.super Lcom/fimi/soul/drone/c/a/b;


# static fields
.field public static final b:I = 0x87

.field public static final c:I = 0x9

.field private static final serialVersionUID:J = 0x87L


# instance fields
.field public d:B

.field public e:B

.field public f:B

.field public g:B

.field public h:I

.field public i:B

.field public j:Lcom/fimi/soul/drone/c/a/c;


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/c/a/c;)V
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/drone/c/a/b;-><init>()V

    const/16 v0, 0x87

    iput v0, p0, Lcom/fimi/soul/drone/c/a/a/v;->a:I

    iput-object p1, p0, Lcom/fimi/soul/drone/c/a/a/v;->j:Lcom/fimi/soul/drone/c/a/c;

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

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/v;->d:B

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/v;->e:B

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/v;->f:B

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/v;->g:B

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->f()I

    move-result v0

    iput v0, p0, Lcom/fimi/soul/drone/c/a/a/v;->h:I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/v;->i:B

    return-void
.end method
