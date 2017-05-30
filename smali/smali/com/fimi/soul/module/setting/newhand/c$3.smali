.class Lcom/fimi/soul/module/setting/newhand/c$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/setting/newhand/c;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/setting/newhand/c;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/setting/newhand/c;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/setting/newhand/c$3;->a:Lcom/fimi/soul/module/setting/newhand/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c$3;->a:Lcom/fimi/soul/module/setting/newhand/c;

    const-string v1, "1"

    invoke-static {v0, v1}, Lcom/fimi/soul/module/setting/newhand/c;->a(Lcom/fimi/soul/module/setting/newhand/c;Ljava/lang/String;)Lcom/fimi/soul/entity/FlyModeLog;

    move-result-object v0

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->l()I

    move-result v1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c$3;->a:Lcom/fimi/soul/module/setting/newhand/c;

    const/4 v2, 0x4

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/fimi/soul/module/setting/newhand/c;->a(II)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c$3;->a:Lcom/fimi/soul/module/setting/newhand/c;

    invoke-static {v1}, Lcom/fimi/soul/module/setting/newhand/c;->b(Lcom/fimi/soul/module/setting/newhand/c;)Lcom/fimi/soul/biz/o/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/fimi/soul/biz/o/a;->a(Lcom/fimi/soul/entity/FlyModeLog;)V

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v1}, Lcom/fimi/kernel/utils/v;->b(I)V

    new-instance v1, Lcom/fimi/soul/view/f$d;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/c$3;->a:Lcom/fimi/soul/module/setting/newhand/c;

    invoke-static {v2}, Lcom/fimi/soul/module/setting/newhand/c;->e(Lcom/fimi/soul/module/setting/newhand/c;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/fimi/soul/view/f$d;-><init>(Landroid/content/Context;)V

    const v2, 0x7f0202d3

    invoke-virtual {v1, v2}, Lcom/fimi/soul/view/f$d;->a(I)Lcom/fimi/soul/view/f$d;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/c$3;->a:Lcom/fimi/soul/module/setting/newhand/c;

    invoke-static {v2}, Lcom/fimi/soul/module/setting/newhand/c;->e(Lcom/fimi/soul/module/setting/newhand/c;)Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0a0386

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/view/f$d;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$d;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/c$3;->a:Lcom/fimi/soul/module/setting/newhand/c;

    invoke-static {v2}, Lcom/fimi/soul/module/setting/newhand/c;->e(Lcom/fimi/soul/module/setting/newhand/c;)Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f0a017f

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/fimi/soul/module/setting/newhand/c$3$1;

    invoke-direct {v3, p0, v0}, Lcom/fimi/soul/module/setting/newhand/c$3$1;-><init>(Lcom/fimi/soul/module/setting/newhand/c$3;Lcom/fimi/soul/entity/FlyModeLog;)V

    invoke-virtual {v1, v2, v3}, Lcom/fimi/soul/view/f$d;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$d;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V

    goto :goto_0
.end method
