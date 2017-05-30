.class public Lcom/fimi/soul/drone/d/a;
.super Ljava/lang/Object;


# static fields
.field static a:I

.field public static final b:Lcom/fimi/soul/drone/c/a/a/ag;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x1

    sput v0, Lcom/fimi/soul/drone/d/a;->a:I

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/ag;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/ag;-><init>()V

    sput-object v0, Lcom/fimi/soul/drone/d/a;->b:Lcom/fimi/soul/drone/c/a/a/ag;

    sget-object v0, Lcom/fimi/soul/drone/d/a;->b:Lcom/fimi/soul/drone/c/a/a/ag;

    const/16 v1, 0x94

    iput v1, v0, Lcom/fimi/soul/drone/c/a/a/ag;->a:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()V
    .locals 1

    const/4 v0, 0x1

    sput v0, Lcom/fimi/soul/drone/d/a;->a:I

    return-void
.end method

.method public static a(Lcom/fimi/soul/drone/a;)V
    .locals 3

    sget-object v0, Lcom/fimi/soul/drone/d/a;->b:Lcom/fimi/soul/drone/c/a/a/ag;

    sget v1, Lcom/fimi/soul/drone/d/a;->a:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/fimi/soul/drone/d/a;->a:I

    int-to-short v1, v1

    iput-short v1, v0, Lcom/fimi/soul/drone/c/a/a/ag;->d:S

    invoke-virtual {p0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/drone/d/a;->b:Lcom/fimi/soul/drone/c/a/a/ag;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/a/ag;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method
