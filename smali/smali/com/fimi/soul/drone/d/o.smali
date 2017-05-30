.class public Lcom/fimi/soul/drone/d/o;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lcom/fimi/soul/drone/c/a/a/z;

.field public static final b:B = 0x1t

.field public static final c:B = 0x2t


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/z;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/z;-><init>()V

    sput-object v0, Lcom/fimi/soul/drone/d/o;->a:Lcom/fimi/soul/drone/c/a/a/z;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/fimi/soul/drone/a;BB)V
    .locals 2

    sget-object v0, Lcom/fimi/soul/drone/d/o;->a:Lcom/fimi/soul/drone/c/a/a/z;

    iput-byte p1, v0, Lcom/fimi/soul/drone/c/a/a/z;->d:B

    sget-object v0, Lcom/fimi/soul/drone/d/o;->a:Lcom/fimi/soul/drone/c/a/a/z;

    iput-byte p2, v0, Lcom/fimi/soul/drone/c/a/a/z;->e:B

    invoke-virtual {p0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/drone/d/o;->a:Lcom/fimi/soul/drone/c/a/a/z;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/a/z;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method
