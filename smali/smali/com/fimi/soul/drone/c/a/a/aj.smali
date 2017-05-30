.class public Lcom/fimi/soul/drone/c/a/a/aj;
.super Lcom/fimi/soul/drone/c/a/b;


# static fields
.field public static final b:I = 0x10

.field public static final c:I = 0x70

.field public static final d:I = 0x71

.field private static final g:I = 0x3


# instance fields
.field public e:Lcom/fimi/soul/drone/c/a/c;

.field private f:Lcom/fimi/soul/drone/h/x;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/drone/c/a/b;-><init>()V

    iput p1, p0, Lcom/fimi/soul/drone/c/a/a/aj;->a:I

    return-void
.end method

.method public constructor <init>(Lcom/fimi/soul/drone/c/a/c;I)V
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/drone/c/a/b;-><init>()V

    iput p2, p0, Lcom/fimi/soul/drone/c/a/a/aj;->a:I

    iput-object p1, p0, Lcom/fimi/soul/drone/c/a/a/aj;->e:Lcom/fimi/soul/drone/c/a/c;

    iget-object v0, p1, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/drone/c/a/a/aj;->a(Lcom/fimi/soul/drone/c/a/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/fimi/soul/drone/c/a/c;
    .locals 3

    new-instance v0, Lcom/fimi/soul/drone/c/a/c;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/c;-><init>()V

    const/4 v1, 0x3

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->b:I

    iget v1, p0, Lcom/fimi/soul/drone/c/a/a/aj;->a:I

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->c:I

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    iget-object v2, p0, Lcom/fimi/soul/drone/c/a/a/aj;->f:Lcom/fimi/soul/drone/h/x;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/x;->a()B

    move-result v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    iget-object v2, p0, Lcom/fimi/soul/drone/c/a/a/aj;->f:Lcom/fimi/soul/drone/h/x;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/x;->b()S

    move-result v2

    int-to-byte v2, v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    iget-object v2, p0, Lcom/fimi/soul/drone/c/a/a/aj;->f:Lcom/fimi/soul/drone/h/x;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/x;->c()B

    move-result v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    return-object v0
.end method

.method public a(Lcom/fimi/soul/drone/c/a/d;)V
    .locals 2

    new-instance v0, Lcom/fimi/soul/drone/h/x;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/fimi/soul/drone/h/x;-><init>(Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/drone/c/a/a/aj;->f:Lcom/fimi/soul/drone/h/x;

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->c()V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/a/aj;->f:Lcom/fimi/soul/drone/h/x;

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/h/x;->a(B)V

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/a/aj;->f:Lcom/fimi/soul/drone/h/x;

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v1

    int-to-short v1, v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/h/x;->a(S)V

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/a/aj;->f:Lcom/fimi/soul/drone/h/x;

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/h/x;->b(B)V

    return-void
.end method

.method public a(Lcom/fimi/soul/drone/h/x;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/drone/c/a/a/aj;->f:Lcom/fimi/soul/drone/h/x;

    return-void
.end method

.method public b()Lcom/fimi/soul/drone/h/x;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/a/aj;->f:Lcom/fimi/soul/drone/h/x;

    return-object v0
.end method
