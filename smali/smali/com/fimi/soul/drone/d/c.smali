.class public Lcom/fimi/soul/drone/d/c;
.super Ljava/lang/Object;


# static fields
.field static a:I

.field public static final b:Lcom/fimi/soul/drone/c/a/a/ao;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x1

    sput v0, Lcom/fimi/soul/drone/d/c;->a:I

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/ao;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/ao;-><init>()V

    sput-object v0, Lcom/fimi/soul/drone/d/c;->b:Lcom/fimi/soul/drone/c/a/a/ao;

    sget-object v0, Lcom/fimi/soul/drone/d/c;->b:Lcom/fimi/soul/drone/c/a/a/ao;

    const/16 v1, 0x91

    iput v1, v0, Lcom/fimi/soul/drone/c/a/a/ao;->a:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/fimi/soul/drone/a;)V
    .locals 3

    sget-object v0, Lcom/fimi/soul/drone/d/c;->b:Lcom/fimi/soul/drone/c/a/a/ao;

    sget v1, Lcom/fimi/soul/drone/d/c;->a:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/fimi/soul/drone/d/c;->a:I

    int-to-short v1, v1

    iput-short v1, v0, Lcom/fimi/soul/drone/c/a/a/ao;->d:S

    invoke-virtual {p0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/drone/d/c;->b:Lcom/fimi/soul/drone/c/a/a/ao;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/a/ao;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method
