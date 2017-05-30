.class public Lcom/fimi/soul/biz/h/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/biz/h/c$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/fimi/soul/base/LoadKey;->getKeyToken()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/h/c;->a:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/fimi/soul/biz/h/c$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/biz/h/c;-><init>()V

    return-void
.end method

.method public static a()Lcom/fimi/soul/biz/h/c;
    .locals 1

    invoke-static {}, Lcom/fimi/soul/biz/h/c$a;->a()Lcom/fimi/soul/biz/h/c;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/h/c;->a:Ljava/lang/String;

    return-object v0
.end method
