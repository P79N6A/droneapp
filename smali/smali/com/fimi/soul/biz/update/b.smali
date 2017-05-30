.class public Lcom/fimi/soul/biz/update/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/biz/update/b$b;,
        Lcom/fimi/soul/biz/update/b$a;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/fimi/soul/biz/update/b$a;

.field private c:Lcom/fimi/soul/biz/update/b$b;

.field private d:Lcom/fimi/soul/biz/manager/w;

.field private e:Lcom/fimi/soul/view/f$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/fimi/soul/biz/manager/w;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/w;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/update/b;->d:Lcom/fimi/soul/biz/manager/w;

    iput-object p1, p0, Lcom/fimi/soul/biz/update/b;->a:Landroid/content/Context;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/biz/update/b;)Lcom/fimi/soul/biz/update/b$b;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/update/b;->c:Lcom/fimi/soul/biz/update/b$b;

    return-object v0
.end method

.method private a(Lcom/xiaomi/market/sdk/UpdateResponse;Ljava/lang/String;)V
    .locals 5

    invoke-static {}, Lcom/fimi/kernel/c;->d()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lcom/fimi/kernel/c;->d()Landroid/app/Activity;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/update/b;->a:Landroid/content/Context;

    iget-object v0, p0, Lcom/fimi/soul/biz/update/b;->e:Lcom/fimi/soul/view/f$a;

    if-nez v0, :cond_2

    new-instance v0, Lcom/fimi/soul/view/f$a;

    iget-object v1, p0, Lcom/fimi/soul/biz/update/b;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/fimi/soul/view/f$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/biz/update/b;->e:Lcom/fimi/soul/view/f$a;

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/biz/update/b;->e:Lcom/fimi/soul/view/f$a;

    iget-object v1, p0, Lcom/fimi/soul/biz/update/b;->a:Landroid/content/Context;

    const v2, 0x7f0a043b

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/biz/update/b$4;

    invoke-direct {v2, p0, p1}, Lcom/fimi/soul/biz/update/b$4;-><init>(Lcom/fimi/soul/biz/update/b;Lcom/xiaomi/market/sdk/UpdateResponse;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/update/b;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e0071

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$a;->a(I)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/update/b;->a:Landroid/content/Context;

    const v2, 0x7f0a01ca

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p1, Lcom/xiaomi/market/sdk/UpdateResponse;->versionName:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/biz/update/b;->a:Landroid/content/Context;

    const v2, 0x7f0a0103

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/biz/update/b$3;

    invoke-direct {v2, p0}, Lcom/fimi/soul/biz/update/b$3;-><init>(Lcom/fimi/soul/biz/update/b;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/fimi/soul/view/f$a;->b(Ljava/lang/String;)Lcom/fimi/soul/view/f$a;

    iget-object v0, p0, Lcom/fimi/soul/biz/update/b;->e:Lcom/fimi/soul/view/f$a;

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$a;->b()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/update/b;->e:Lcom/fimi/soul/view/f$a;

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$a;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/fimi/soul/biz/update/b;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/update/b;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/biz/update/b;)Lcom/fimi/soul/biz/update/b$a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/update/b;->b:Lcom/fimi/soul/biz/update/b$a;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->setUpdateAutoPopup(Z)V

    new-instance v0, Lcom/fimi/soul/biz/update/b$2;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/update/b$2;-><init>(Lcom/fimi/soul/biz/update/b;)V

    invoke-static {v0}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->setUpdateListener(Lcom/xiaomi/market/sdk/XiaomiUpdateListener;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/update/b;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->update(Landroid/content/Context;)V

    return-void
.end method

.method public a(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->setUpdateAutoPopup(Z)V

    new-instance v0, Lcom/fimi/soul/biz/update/b$1;

    invoke-direct {v0, p0, p1}, Lcom/fimi/soul/biz/update/b$1;-><init>(Lcom/fimi/soul/biz/update/b;I)V

    invoke-static {v0}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->setUpdateListener(Lcom/xiaomi/market/sdk/XiaomiUpdateListener;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/update/b;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/xiaomi/market/sdk/XiaomiUpdateAgent;->update(Landroid/content/Context;)V

    return-void
.end method

.method public a(Lcom/fimi/soul/biz/update/b$a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/update/b;->b:Lcom/fimi/soul/biz/update/b$a;

    return-void
.end method

.method public a(Lcom/fimi/soul/biz/update/b$b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/update/b;->c:Lcom/fimi/soul/biz/update/b$b;

    return-void
.end method

.method public a(Lcom/xiaomi/market/sdk/UpdateResponse;)V
    .locals 1

    iget-object v0, p1, Lcom/xiaomi/market/sdk/UpdateResponse;->updateLog:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/fimi/soul/biz/update/b;->a(Lcom/xiaomi/market/sdk/UpdateResponse;Ljava/lang/String;)V

    return-void
.end method

.method public b()Lcom/fimi/soul/biz/update/b$b;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/update/b;->c:Lcom/fimi/soul/biz/update/b$b;

    return-object v0
.end method
