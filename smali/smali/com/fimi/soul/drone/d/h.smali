.class public Lcom/fimi/soul/drone/d/h;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/fimi/soul/drone/c/a/a/p;

.field public static final b:Lcom/fimi/soul/drone/c/a/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/p;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/p;-><init>()V

    sput-object v0, Lcom/fimi/soul/drone/d/h;->a:Lcom/fimi/soul/drone/c/a/a/p;

    sget-object v0, Lcom/fimi/soul/drone/d/h;->a:Lcom/fimi/soul/drone/c/a/a/p;

    const/16 v1, 0x85

    iput v1, v0, Lcom/fimi/soul/drone/c/a/a/p;->a:I

    sget-object v0, Lcom/fimi/soul/drone/d/h;->a:Lcom/fimi/soul/drone/c/a/a/p;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/c/a/a/p;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v0

    sput-object v0, Lcom/fimi/soul/drone/d/h;->b:Lcom/fimi/soul/drone/c/a/c;

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

    sget-object v0, Lcom/fimi/soul/drone/d/h;->a:Lcom/fimi/soul/drone/c/a/a/p;

    const/4 v1, 0x1

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/p;->d:B

    sget-object v0, Lcom/fimi/soul/drone/d/h;->a:Lcom/fimi/soul/drone/c/a/a/p;

    iput-byte v2, v0, Lcom/fimi/soul/drone/c/a/a/p;->i:B

    sget-object v0, Lcom/fimi/soul/drone/d/h;->a:Lcom/fimi/soul/drone/c/a/a/p;

    iput-byte v2, v0, Lcom/fimi/soul/drone/c/a/a/p;->j:B

    sget-object v0, Lcom/fimi/soul/drone/d/h;->a:Lcom/fimi/soul/drone/c/a/a/p;

    iput-byte v2, v0, Lcom/fimi/soul/drone/c/a/a/p;->k:B

    sget-object v0, Lcom/fimi/soul/drone/d/h;->a:Lcom/fimi/soul/drone/c/a/a/p;

    iput-byte v2, v0, Lcom/fimi/soul/drone/c/a/a/p;->l:B

    invoke-virtual {p0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/drone/d/h;->a:Lcom/fimi/soul/drone/c/a/a/p;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/a/p;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method
