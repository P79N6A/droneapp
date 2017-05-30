.class Lcom/fimi/soul/module/update/UpgradingActivity$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/update/UpgradingActivity;->q()V
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

    iput-object p1, p0, Lcom/fimi/soul/module/update/UpgradingActivity$2;->a:Lcom/fimi/soul/module/update/UpgradingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    sget-object v0, Lcom/fimi/soul/drone/d/o;->a:Lcom/fimi/soul/drone/c/a/a/z;

    const/4 v1, 0x0

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/z;->d:B

    sget-object v0, Lcom/fimi/soul/drone/d/o;->a:Lcom/fimi/soul/drone/c/a/a/z;

    const/4 v1, 0x2

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/z;->e:B

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity$2;->a:Lcom/fimi/soul/module/update/UpgradingActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/update/UpgradingActivity;->k(Lcom/fimi/soul/module/update/UpgradingActivity;)Lcom/fimi/soul/drone/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/drone/d/o;->a:Lcom/fimi/soul/drone/c/a/a/z;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/c/a/a/z;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method
