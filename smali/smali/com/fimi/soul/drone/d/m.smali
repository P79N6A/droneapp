.class public Lcom/fimi/soul/drone/d/m;
.super Ljava/lang/Object;


# static fields
.field public static a:I

.field public static final b:Lcom/fimi/soul/drone/c/a/a/bb;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x1

    sput v0, Lcom/fimi/soul/drone/d/m;->a:I

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bb;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/bb;-><init>()V

    sput-object v0, Lcom/fimi/soul/drone/d/m;->b:Lcom/fimi/soul/drone/c/a/a/bb;

    sget-object v0, Lcom/fimi/soul/drone/d/m;->b:Lcom/fimi/soul/drone/c/a/a/bb;

    const/16 v1, 0x83

    iput v1, v0, Lcom/fimi/soul/drone/c/a/a/bb;->a:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/fimi/soul/drone/a;)V
    .locals 3

    const/4 v2, 0x0

    sget-object v0, Lcom/fimi/soul/drone/d/m;->b:Lcom/fimi/soul/drone/c/a/a/bb;

    iput-short v2, v0, Lcom/fimi/soul/drone/c/a/a/bb;->h:S

    sget-object v0, Lcom/fimi/soul/drone/d/m;->b:Lcom/fimi/soul/drone/c/a/a/bb;

    iput-byte v2, v0, Lcom/fimi/soul/drone/c/a/a/bb;->i:B

    sget-object v0, Lcom/fimi/soul/drone/d/m;->b:Lcom/fimi/soul/drone/c/a/a/bb;

    const/4 v1, 0x3

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/bb;->k:B

    sget-object v0, Lcom/fimi/soul/drone/d/m;->b:Lcom/fimi/soul/drone/c/a/a/bb;

    iput-short v2, v0, Lcom/fimi/soul/drone/c/a/a/bb;->l:S

    invoke-virtual {p0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/drone/d/m;->b:Lcom/fimi/soul/drone/c/a/a/bb;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/a/bb;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method
