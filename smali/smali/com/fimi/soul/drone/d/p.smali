.class public Lcom/fimi/soul/drone/d/p;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/fimi/soul/drone/c/a/a/bn;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bn;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/bn;-><init>()V

    sput-object v0, Lcom/fimi/soul/drone/d/p;->a:Lcom/fimi/soul/drone/c/a/a/bn;

    sget-object v0, Lcom/fimi/soul/drone/d/p;->a:Lcom/fimi/soul/drone/c/a/a/bn;

    const/16 v1, 0xc9

    iput v1, v0, Lcom/fimi/soul/drone/c/a/a/bn;->a:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/fimi/soul/drone/a;)V
    .locals 2

    invoke-virtual {p0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/drone/d/p;->a:Lcom/fimi/soul/drone/c/a/a/bn;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/a/bn;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method
