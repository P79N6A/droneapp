.class public Lcom/fimi/soul/drone/d/l;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/fimi/soul/drone/c/a/a/au;

.field public static final b:Lcom/fimi/soul/drone/c/a/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/au;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/au;-><init>()V

    sput-object v0, Lcom/fimi/soul/drone/d/l;->a:Lcom/fimi/soul/drone/c/a/a/au;

    sget-object v0, Lcom/fimi/soul/drone/d/l;->a:Lcom/fimi/soul/drone/c/a/a/au;

    const/16 v1, 0x81

    iput v1, v0, Lcom/fimi/soul/drone/c/a/a/au;->a:I

    sget-object v0, Lcom/fimi/soul/drone/d/l;->a:Lcom/fimi/soul/drone/c/a/a/au;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/c/a/a/au;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v0

    sput-object v0, Lcom/fimi/soul/drone/d/l;->b:Lcom/fimi/soul/drone/c/a/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/fimi/soul/drone/c/a/a/au;
    .locals 1

    sget-object v0, Lcom/fimi/soul/drone/d/l;->a:Lcom/fimi/soul/drone/c/a/a/au;

    return-object v0
.end method

.method public static a(Lcom/fimi/soul/drone/a;)V
    .locals 2

    sget-object v0, Lcom/fimi/soul/drone/d/l;->a:Lcom/fimi/soul/drone/c/a/a/au;

    const/16 v1, 0x11

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/au;->d:B

    invoke-virtual {p0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/drone/d/l;->a:Lcom/fimi/soul/drone/c/a/a/au;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/a/au;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method
