.class public Lcom/fimi/soul/drone/d/i;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/fimi/soul/drone/c/a/a/a;

.field public static final b:Lcom/fimi/soul/drone/c/a/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/a;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/a;-><init>()V

    sput-object v0, Lcom/fimi/soul/drone/d/i;->a:Lcom/fimi/soul/drone/c/a/a/a;

    sget-object v0, Lcom/fimi/soul/drone/d/i;->a:Lcom/fimi/soul/drone/c/a/a/a;

    const/16 v1, 0x98

    iput v1, v0, Lcom/fimi/soul/drone/c/a/a/a;->a:I

    sget-object v0, Lcom/fimi/soul/drone/d/i;->a:Lcom/fimi/soul/drone/c/a/a/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/c/a/a/a;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v0

    sput-object v0, Lcom/fimi/soul/drone/d/i;->b:Lcom/fimi/soul/drone/c/a/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/fimi/soul/drone/a;)V
    .locals 2

    sget-object v0, Lcom/fimi/soul/drone/d/i;->a:Lcom/fimi/soul/drone/c/a/a/a;

    const/4 v1, 0x1

    iput-short v1, v0, Lcom/fimi/soul/drone/c/a/a/a;->d:S

    invoke-virtual {p0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/drone/d/i;->a:Lcom/fimi/soul/drone/c/a/a/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/a/a;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method
