.class Lcom/fimi/soul/module/setting/MapSettingFragment$7;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/setting/MapSettingFragment;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/setting/MapSettingFragment;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/setting/MapSettingFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$7;->a:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$7;->a:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-static {v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->f(Lcom/fimi/soul/module/setting/MapSettingFragment;)Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "isfirstloading"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$7;->a:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-static {v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->b(Lcom/fimi/soul/module/setting/MapSettingFragment;)Ljava/util/List;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->F:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$7;->a:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-static {v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->a(Lcom/fimi/soul/module/setting/MapSettingFragment;)Lcom/fimi/soul/module/setting/i;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$7;->a:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-static {v1}, Lcom/fimi/soul/module/setting/MapSettingFragment;->b(Lcom/fimi/soul/module/setting/MapSettingFragment;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/setting/i;->a(Ljava/util/List;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$7;->a:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-static {v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->h(Lcom/fimi/soul/module/setting/MapSettingFragment;)Lcom/fimi/soul/biz/manager/x;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$7;->a:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-static {v1}, Lcom/fimi/soul/module/setting/MapSettingFragment;->g(Lcom/fimi/soul/module/setting/MapSettingFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/fimi/soul/base/a;->b(Landroid/content/Context;)Lcom/fimi/soul/entity/User;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/setting/MapSettingFragment$7$1;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/setting/MapSettingFragment$7$1;-><init>(Lcom/fimi/soul/module/setting/MapSettingFragment$7;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/biz/manager/x;->b(Lcom/fimi/soul/entity/User;Lcom/fimi/soul/biz/m/k;)V

    return-void
.end method
