.class public Lcom/fimi/soul/utils/ai;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/utils/aj;


# static fields
.field private static final a:Ljava/lang/String; = "http://dev.xiaomi.com"


# instance fields
.field private b:Lcom/xiaomi/account/openauth/XiaomiOAuthResults;

.field private c:Lcom/fimi/soul/entity/User;

.field private d:Lcom/fimi/soul/biz/manager/x;

.field private e:Landroid/content/Context;

.field private f:Lcom/fimi/soul/utils/aj$a;

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/fimi/soul/entity/User;

    invoke-direct {v0}, Lcom/fimi/soul/entity/User;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/utils/ai;->c:Lcom/fimi/soul/entity/User;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/utils/ai;)Lcom/xiaomi/account/openauth/XiaomiOAuthResults;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/ai;->b:Lcom/xiaomi/account/openauth/XiaomiOAuthResults;

    return-object v0
.end method

.method static synthetic a(Lcom/fimi/soul/utils/ai;Lcom/xiaomi/account/openauth/XiaomiOAuthResults;)Lcom/xiaomi/account/openauth/XiaomiOAuthResults;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/utils/ai;->b:Lcom/xiaomi/account/openauth/XiaomiOAuthResults;

    return-object p1
.end method

.method static synthetic a(Lcom/fimi/soul/utils/ai;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/utils/ai;->g:Ljava/lang/String;

    return-object p1
.end method

.method private a()V
    .locals 9

    const/4 v8, 0x0

    iget-object v0, p0, Lcom/fimi/soul/utils/ai;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/f;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/f;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/utils/ai$2;

    invoke-direct {v1, p0}, Lcom/fimi/soul/utils/ai$2;-><init>(Lcom/fimi/soul/utils/ai;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/manager/f;->a(Lcom/fimi/soul/biz/m/k;)V

    new-instance v0, Lcom/xiaomi/account/openauth/XiaomiOAuthorize;

    invoke-direct {v0}, Lcom/xiaomi/account/openauth/XiaomiOAuthorize;-><init>()V

    iget-object v1, p0, Lcom/fimi/soul/utils/ai;->e:Landroid/content/Context;

    const-string v2, "2882303761517518920"

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    const-string v4, "/user/phone"

    iget-object v5, p0, Lcom/fimi/soul/utils/ai;->b:Lcom/xiaomi/account/openauth/XiaomiOAuthResults;

    invoke-virtual {v5}, Lcom/xiaomi/account/openauth/XiaomiOAuthResults;->getAccessToken()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/fimi/soul/utils/ai;->b:Lcom/xiaomi/account/openauth/XiaomiOAuthResults;

    invoke-virtual {v6}, Lcom/xiaomi/account/openauth/XiaomiOAuthResults;->getMacKey()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/fimi/soul/utils/ai;->b:Lcom/xiaomi/account/openauth/XiaomiOAuthResults;

    invoke-virtual {v7}, Lcom/xiaomi/account/openauth/XiaomiOAuthResults;->getMacAlgorithm()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v0 .. v7}, Lcom/xiaomi/account/openauth/XiaomiOAuthorize;->callOpenApi(Landroid/content/Context;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/account/openauth/XiaomiOAuthFuture;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/utils/ai$3;

    invoke-direct {v1, p0, v0}, Lcom/fimi/soul/utils/ai$3;-><init>(Lcom/fimi/soul/utils/ai;Lcom/xiaomi/account/openauth/XiaomiOAuthFuture;)V

    new-array v0, v8, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/utils/ai$3;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    new-instance v0, Lcom/xiaomi/account/openauth/XiaomiOAuthorize;

    invoke-direct {v0}, Lcom/xiaomi/account/openauth/XiaomiOAuthorize;-><init>()V

    iget-object v1, p0, Lcom/fimi/soul/utils/ai;->e:Landroid/content/Context;

    const-string v2, "2882303761517518920"

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    const-string v4, "/user/profile"

    iget-object v5, p0, Lcom/fimi/soul/utils/ai;->b:Lcom/xiaomi/account/openauth/XiaomiOAuthResults;

    invoke-virtual {v5}, Lcom/xiaomi/account/openauth/XiaomiOAuthResults;->getAccessToken()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/fimi/soul/utils/ai;->b:Lcom/xiaomi/account/openauth/XiaomiOAuthResults;

    invoke-virtual {v6}, Lcom/xiaomi/account/openauth/XiaomiOAuthResults;->getMacKey()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/fimi/soul/utils/ai;->b:Lcom/xiaomi/account/openauth/XiaomiOAuthResults;

    invoke-virtual {v7}, Lcom/xiaomi/account/openauth/XiaomiOAuthResults;->getMacAlgorithm()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {v0 .. v7}, Lcom/xiaomi/account/openauth/XiaomiOAuthorize;->callOpenApi(Landroid/content/Context;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/xiaomi/account/openauth/XiaomiOAuthFuture;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/utils/ai$4;

    invoke-direct {v1, p0, v0}, Lcom/fimi/soul/utils/ai$4;-><init>(Lcom/fimi/soul/utils/ai;Lcom/xiaomi/account/openauth/XiaomiOAuthFuture;)V

    new-array v0, v8, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/utils/ai$4;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method private a(Lcom/xiaomi/account/openauth/XiaomiOAuthFuture;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/xiaomi/account/openauth/XiaomiOAuthFuture",
            "<TV;>;)V"
        }
    .end annotation

    new-instance v0, Lcom/fimi/soul/utils/ai$1;

    invoke-direct {v0, p0, p1}, Lcom/fimi/soul/utils/ai$1;-><init>(Lcom/fimi/soul/utils/ai;Lcom/xiaomi/account/openauth/XiaomiOAuthFuture;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/utils/ai$1;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/utils/ai;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/utils/ai;->a()V

    return-void
.end method

.method static synthetic c(Lcom/fimi/soul/utils/ai;)Lcom/fimi/soul/utils/aj$a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/ai;->f:Lcom/fimi/soul/utils/aj$a;

    return-object v0
.end method

.method static synthetic d(Lcom/fimi/soul/utils/ai;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/ai;->e:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lcom/fimi/soul/utils/ai;)Lcom/fimi/soul/entity/User;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/ai;->c:Lcom/fimi/soul/entity/User;

    return-object v0
.end method

.method static synthetic f(Lcom/fimi/soul/utils/ai;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/ai;->g:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lcom/fimi/soul/utils/ai;)Lcom/fimi/soul/biz/manager/x;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/ai;->d:Lcom/fimi/soul/biz/manager/x;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/fimi/soul/utils/aj$a;)V
    .locals 5

    const/4 v4, 0x0

    iput-object p1, p0, Lcom/fimi/soul/utils/ai;->e:Landroid/content/Context;

    iput-object p2, p0, Lcom/fimi/soul/utils/ai;->f:Lcom/fimi/soul/utils/aj$a;

    invoke-static {p1}, Lcom/fimi/soul/biz/manager/x;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/x;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/utils/ai;->d:Lcom/fimi/soul/biz/manager/x;

    const/4 v0, 0x4

    new-array v0, v0, [I

    new-instance v1, Lcom/xiaomi/account/openauth/XiaomiOAuthorize;

    invoke-direct {v1}, Lcom/xiaomi/account/openauth/XiaomiOAuthorize;-><init>()V

    const-string v2, "2882303761517518920"

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/xiaomi/account/openauth/XiaomiOAuthorize;->setAppId(J)Lcom/xiaomi/account/openauth/XiaomiOAuthorize;

    move-result-object v1

    const-string v2, "http://dev.xiaomi.com"

    invoke-virtual {v1, v2}, Lcom/xiaomi/account/openauth/XiaomiOAuthorize;->setRedirectUrl(Ljava/lang/String;)Lcom/xiaomi/account/openauth/XiaomiOAuthorize;

    move-result-object v1

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/xiaomi/account/openauth/XiaomiOAuthorize;->setScope([I)Lcom/xiaomi/account/openauth/XiaomiOAuthorize;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/xiaomi/account/openauth/XiaomiOAuthorize;->setKeepCookies(Z)Lcom/xiaomi/account/openauth/XiaomiOAuthorize;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/xiaomi/account/openauth/XiaomiOAuthorize;->setNoMiui(Z)Lcom/xiaomi/account/openauth/XiaomiOAuthorize;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/xiaomi/account/openauth/XiaomiOAuthorize;->setSkipConfirm(Z)Lcom/xiaomi/account/openauth/XiaomiOAuthorize;

    move-result-object v0

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {v0, p1}, Lcom/xiaomi/account/openauth/XiaomiOAuthorize;->startGetAccessToken(Landroid/app/Activity;)Lcom/xiaomi/account/openauth/XiaomiOAuthFuture;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/utils/ai;->a(Lcom/xiaomi/account/openauth/XiaomiOAuthFuture;)V

    return-void
.end method
