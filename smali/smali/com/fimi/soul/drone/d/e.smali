.class public Lcom/fimi/soul/drone/d/e;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/fimi/soul/drone/c/a/a/ba;

.field public static b:Lcom/fimi/soul/drone/c/a/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/ba;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/ba;-><init>()V

    sput-object v0, Lcom/fimi/soul/drone/d/e;->a:Lcom/fimi/soul/drone/c/a/a/ba;

    sget-object v0, Lcom/fimi/soul/drone/d/e;->a:Lcom/fimi/soul/drone/c/a/a/ba;

    const/16 v1, 0xc6

    iput v1, v0, Lcom/fimi/soul/drone/c/a/a/ba;->a:I

    sget-object v0, Lcom/fimi/soul/drone/d/e;->a:Lcom/fimi/soul/drone/c/a/a/ba;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/c/a/a/ba;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v0

    sput-object v0, Lcom/fimi/soul/drone/d/e;->b:Lcom/fimi/soul/drone/c/a/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/fimi/soul/drone/a;)V
    .locals 2

    sget-object v0, Lcom/fimi/soul/drone/d/e;->a:Lcom/fimi/soul/drone/c/a/a/ba;

    const/16 v1, 0x64

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/ba;->d:B

    sget-object v0, Lcom/fimi/soul/drone/d/e;->a:Lcom/fimi/soul/drone/c/a/a/ba;

    const/4 v1, 0x1

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/ba;->e:B

    invoke-virtual {p0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/drone/d/e;->a:Lcom/fimi/soul/drone/c/a/a/ba;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/a/ba;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method
