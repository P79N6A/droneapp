.class public Lcom/fimi/soul/drone/d/g;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/fimi/soul/drone/c/a/a/aa;

.field public static final b:Lcom/fimi/soul/drone/c/a/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/aa;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/aa;-><init>()V

    sput-object v0, Lcom/fimi/soul/drone/d/g;->a:Lcom/fimi/soul/drone/c/a/a/aa;

    sget-object v0, Lcom/fimi/soul/drone/d/g;->a:Lcom/fimi/soul/drone/c/a/a/aa;

    const/16 v1, 0x6a

    iput v1, v0, Lcom/fimi/soul/drone/c/a/a/aa;->a:I

    sget-object v0, Lcom/fimi/soul/drone/d/g;->a:Lcom/fimi/soul/drone/c/a/a/aa;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/c/a/a/aa;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v0

    sput-object v0, Lcom/fimi/soul/drone/d/g;->b:Lcom/fimi/soul/drone/c/a/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/fimi/soul/drone/c/a/a/aa;
    .locals 1

    sget-object v0, Lcom/fimi/soul/drone/d/g;->a:Lcom/fimi/soul/drone/c/a/a/aa;

    return-object v0
.end method

.method public static a(Lcom/fimi/soul/drone/a;B)V
    .locals 2

    sget-object v0, Lcom/fimi/soul/drone/d/g;->a:Lcom/fimi/soul/drone/c/a/a/aa;

    iput-byte p1, v0, Lcom/fimi/soul/drone/c/a/a/aa;->d:B

    invoke-virtual {p0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/drone/d/g;->a:Lcom/fimi/soul/drone/c/a/a/aa;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/a/aa;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method
