.class public Lcom/fimi/soul/drone/d/s;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/fimi/soul/drone/c/a/a/bp;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bp;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/bp;-><init>()V

    sput-object v0, Lcom/fimi/soul/drone/d/s;->a:Lcom/fimi/soul/drone/c/a/a/bp;

    sget-object v0, Lcom/fimi/soul/drone/d/s;->a:Lcom/fimi/soul/drone/c/a/a/bp;

    const/16 v1, 0xca

    iput v1, v0, Lcom/fimi/soul/drone/c/a/a/bp;->a:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/fimi/soul/drone/a;B)V
    .locals 2

    sget-object v0, Lcom/fimi/soul/drone/d/s;->a:Lcom/fimi/soul/drone/c/a/a/bp;

    iput-byte p1, v0, Lcom/fimi/soul/drone/c/a/a/bp;->d:B

    invoke-virtual {p0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/drone/d/s;->a:Lcom/fimi/soul/drone/c/a/a/bp;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/a/bp;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method
