.class public Lcom/fimi/soul/drone/d/d;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/fimi/soul/drone/c/a/a/aw;

.field public static final b:Lcom/fimi/soul/drone/c/a/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/aw;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/aw;-><init>()V

    sput-object v0, Lcom/fimi/soul/drone/d/d;->a:Lcom/fimi/soul/drone/c/a/a/aw;

    sget-object v0, Lcom/fimi/soul/drone/d/d;->a:Lcom/fimi/soul/drone/c/a/a/aw;

    const/16 v1, 0x82

    iput v1, v0, Lcom/fimi/soul/drone/c/a/a/aw;->a:I

    sget-object v0, Lcom/fimi/soul/drone/d/d;->a:Lcom/fimi/soul/drone/c/a/a/aw;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/c/a/a/aw;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v0

    sput-object v0, Lcom/fimi/soul/drone/d/d;->b:Lcom/fimi/soul/drone/c/a/c;

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

    sget-object v1, Lcom/fimi/soul/drone/d/d;->a:Lcom/fimi/soul/drone/c/a/a/aw;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/a/aw;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method
