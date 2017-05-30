.class public Lcom/fimi/soul/drone/c/a/a/m;
.super Lcom/fimi/soul/drone/c/a/b;

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final b:B = 0x73t

.field public static final c:B = 0x1t

.field public static final d:B = 0x0t

.field public static final e:B = 0x1t

.field public static final f:B = 0x2t


# instance fields
.field public g:B

.field public h:B

.field public i:B

.field public j:B

.field private final k:B

.field private l:B


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v1, 0x34

    invoke-direct {p0}, Lcom/fimi/soul/drone/c/a/b;-><init>()V

    iput-byte v1, p0, Lcom/fimi/soul/drone/c/a/a/m;->k:B

    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/m;->l:B

    iput v1, p0, Lcom/fimi/soul/drone/c/a/a/m;->a:I

    return-void
.end method


# virtual methods
.method public a()Lcom/fimi/soul/drone/c/a/c;
    .locals 3

    const/4 v2, 0x1

    new-instance v0, Lcom/fimi/soul/drone/c/a/c;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/c;-><init>()V

    const/16 v1, 0x34

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->c:I

    const/4 v1, 0x2

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->b:I

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    return-object v0
.end method

.method public a(B)V
    .locals 1

    packed-switch p1, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/m;->l:B

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/m;->l:B

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/m;->l:B

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public a(Lcom/fimi/soul/drone/c/a/c;)V
    .locals 1

    iget-object v0, p1, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/drone/c/a/a/m;->a(Lcom/fimi/soul/drone/c/a/d;)V

    return-void
.end method

.method public a(Lcom/fimi/soul/drone/c/a/d;)V
    .locals 1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->c()V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/m;->g:B

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/m;->h:B

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/m;->i:B

    invoke-virtual {p1}, Lcom/fimi/soul/drone/c/a/d;->d()B

    move-result v0

    iput-byte v0, p0, Lcom/fimi/soul/drone/c/a/a/m;->j:B

    return-void
.end method
