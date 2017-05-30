.class public final enum Lcom/fimi/soul/drone/h/a/f;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/fimi/soul/drone/h/a/f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/fimi/soul/drone/h/a/f;

.field public static final enum b:Lcom/fimi/soul/drone/h/a/f;

.field public static final enum c:Lcom/fimi/soul/drone/h/a/f;

.field public static final enum d:Lcom/fimi/soul/drone/h/a/f;

.field public static final enum e:Lcom/fimi/soul/drone/h/a/f;

.field private static final synthetic f:[Lcom/fimi/soul/drone/h/a/f;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-instance v0, Lcom/fimi/soul/drone/h/a/f;

    const-string v1, "WP_UPLOAD"

    invoke-direct {v0, v1, v2}, Lcom/fimi/soul/drone/h/a/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/fimi/soul/drone/h/a/f;->a:Lcom/fimi/soul/drone/h/a/f;

    new-instance v0, Lcom/fimi/soul/drone/h/a/f;

    const-string v1, "WP_DOWNLOAD"

    invoke-direct {v0, v1, v3}, Lcom/fimi/soul/drone/h/a/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/fimi/soul/drone/h/a/f;->b:Lcom/fimi/soul/drone/h/a/f;

    new-instance v0, Lcom/fimi/soul/drone/h/a/f;

    const-string v1, "WP_RETRY"

    invoke-direct {v0, v1, v4}, Lcom/fimi/soul/drone/h/a/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/fimi/soul/drone/h/a/f;->c:Lcom/fimi/soul/drone/h/a/f;

    new-instance v0, Lcom/fimi/soul/drone/h/a/f;

    const-string v1, "WP_CONTINUE"

    invoke-direct {v0, v1, v5}, Lcom/fimi/soul/drone/h/a/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/fimi/soul/drone/h/a/f;->d:Lcom/fimi/soul/drone/h/a/f;

    new-instance v0, Lcom/fimi/soul/drone/h/a/f;

    const-string v1, "WP_TIMEDOUT"

    invoke-direct {v0, v1, v6}, Lcom/fimi/soul/drone/h/a/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/fimi/soul/drone/h/a/f;->e:Lcom/fimi/soul/drone/h/a/f;

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/fimi/soul/drone/h/a/f;

    sget-object v1, Lcom/fimi/soul/drone/h/a/f;->a:Lcom/fimi/soul/drone/h/a/f;

    aput-object v1, v0, v2

    sget-object v1, Lcom/fimi/soul/drone/h/a/f;->b:Lcom/fimi/soul/drone/h/a/f;

    aput-object v1, v0, v3

    sget-object v1, Lcom/fimi/soul/drone/h/a/f;->c:Lcom/fimi/soul/drone/h/a/f;

    aput-object v1, v0, v4

    sget-object v1, Lcom/fimi/soul/drone/h/a/f;->d:Lcom/fimi/soul/drone/h/a/f;

    aput-object v1, v0, v5

    sget-object v1, Lcom/fimi/soul/drone/h/a/f;->e:Lcom/fimi/soul/drone/h/a/f;

    aput-object v1, v0, v6

    sput-object v0, Lcom/fimi/soul/drone/h/a/f;->f:[Lcom/fimi/soul/drone/h/a/f;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fimi/soul/drone/h/a/f;
    .locals 1

    const-class v0, Lcom/fimi/soul/drone/h/a/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/drone/h/a/f;

    return-object v0
.end method

.method public static values()[Lcom/fimi/soul/drone/h/a/f;
    .locals 1

    sget-object v0, Lcom/fimi/soul/drone/h/a/f;->f:[Lcom/fimi/soul/drone/h/a/f;

    invoke-virtual {v0}, [Lcom/fimi/soul/drone/h/a/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fimi/soul/drone/h/a/f;

    return-object v0
.end method
