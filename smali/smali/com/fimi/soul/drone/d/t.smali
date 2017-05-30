.class public Lcom/fimi/soul/drone/d/t;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/fimi/soul/drone/c/a/a/bq;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bq;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/bq;-><init>()V

    sput-object v0, Lcom/fimi/soul/drone/d/t;->a:Lcom/fimi/soul/drone/c/a/a/bq;

    sget-object v0, Lcom/fimi/soul/drone/d/t;->a:Lcom/fimi/soul/drone/c/a/a/bq;

    const/16 v1, 0xcb

    iput v1, v0, Lcom/fimi/soul/drone/c/a/a/bq;->a:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/fimi/soul/drone/a;II)V
    .locals 2

    sget-object v0, Lcom/fimi/soul/drone/d/t;->a:Lcom/fimi/soul/drone/c/a/a/bq;

    int-to-byte v1, p2

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/bq;->d:B

    sget-object v0, Lcom/fimi/soul/drone/d/t;->a:Lcom/fimi/soul/drone/c/a/a/bq;

    int-to-byte v1, p1

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/bq;->e:B

    invoke-virtual {p0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/drone/d/t;->a:Lcom/fimi/soul/drone/c/a/a/bq;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/a/bq;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method
