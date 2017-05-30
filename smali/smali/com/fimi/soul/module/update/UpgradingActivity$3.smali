.class Lcom/fimi/soul/module/update/UpgradingActivity$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/biz/update/f$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/update/UpgradingActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/update/UpgradingActivity;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/update/UpgradingActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/update/UpgradingActivity$3;->a:Lcom/fimi/soul/module/update/UpgradingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity$3;->a:Lcom/fimi/soul/module/update/UpgradingActivity;

    invoke-static {v0, p1}, Lcom/fimi/soul/module/update/UpgradingActivity;->b(Lcom/fimi/soul/module/update/UpgradingActivity;I)V

    return-void
.end method

.method public a(Z)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity$3;->a:Lcom/fimi/soul/module/update/UpgradingActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/update/UpgradingActivity;->b(Lcom/fimi/soul/module/update/UpgradingActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity$3;->a:Lcom/fimi/soul/module/update/UpgradingActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/update/UpgradingActivity;->c(Lcom/fimi/soul/module/update/UpgradingActivity;)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity$3;->a:Lcom/fimi/soul/module/update/UpgradingActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/fimi/soul/module/update/UpgradingActivity;->a(Lcom/fimi/soul/module/update/UpgradingActivity;Z)Z

    :cond_0
    return-void
.end method
