.class Lcom/fimi/soul/module/setting/newhand/c$5;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/setting/newhand/c;->a(Ljava/util/List;Lcom/fimi/soul/biz/manager/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/entity/FlyModeLog;

.field final synthetic b:Lcom/fimi/soul/biz/manager/k;

.field final synthetic c:Lcom/fimi/soul/module/setting/newhand/c;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/setting/newhand/c;Lcom/fimi/soul/entity/FlyModeLog;Lcom/fimi/soul/biz/manager/k;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/setting/newhand/c$5;->c:Lcom/fimi/soul/module/setting/newhand/c;

    iput-object p2, p0, Lcom/fimi/soul/module/setting/newhand/c$5;->a:Lcom/fimi/soul/entity/FlyModeLog;

    iput-object p3, p0, Lcom/fimi/soul/module/setting/newhand/c$5;->b:Lcom/fimi/soul/biz/manager/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c$5;->c:Lcom/fimi/soul/module/setting/newhand/c;

    const/4 v1, 0x2

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/module/setting/newhand/c;->a(II)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c$5;->c:Lcom/fimi/soul/module/setting/newhand/c;

    invoke-static {v0}, Lcom/fimi/soul/module/setting/newhand/c;->b(Lcom/fimi/soul/module/setting/newhand/c;)Lcom/fimi/soul/biz/o/a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c$5;->a:Lcom/fimi/soul/entity/FlyModeLog;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/o/a;->a(Lcom/fimi/soul/entity/FlyModeLog;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c$5;->b:Lcom/fimi/soul/biz/manager/k;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c$5;->c:Lcom/fimi/soul/module/setting/newhand/c;

    invoke-static {v1}, Lcom/fimi/soul/module/setting/newhand/c;->e(Lcom/fimi/soul/module/setting/newhand/c;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/fimi/soul/base/a;->b(Landroid/content/Context;)Lcom/fimi/soul/entity/User;

    move-result-object v1

    sget-object v2, Lcom/fimi/soul/biz/manager/k;->b:Ljava/lang/String;

    new-instance v3, Lcom/fimi/soul/module/setting/newhand/c$5$1;

    invoke-direct {v3, p0}, Lcom/fimi/soul/module/setting/newhand/c$5$1;-><init>(Lcom/fimi/soul/module/setting/newhand/c$5;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/fimi/soul/biz/manager/k;->a(Lcom/fimi/soul/entity/User;Ljava/lang/String;Lcom/fimi/soul/biz/m/k;)V

    return-void
.end method
