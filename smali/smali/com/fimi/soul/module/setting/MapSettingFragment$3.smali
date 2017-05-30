.class Lcom/fimi/soul/module/setting/MapSettingFragment$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/setting/MapSettingFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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

    iput-object p1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$3;->a:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$3;->a:Lcom/fimi/soul/module/setting/MapSettingFragment;

    iget-boolean v0, v0, Lcom/fimi/soul/module/setting/MapSettingFragment;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$3;->a:Lcom/fimi/soul/module/setting/MapSettingFragment;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/fimi/soul/module/setting/MapSettingFragment;->a:Z

    invoke-static {}, Lcom/fimi/soul/biz/camera/b;->a()Lcom/fimi/soul/biz/camera/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/b;->d()Lcom/fimi/soul/biz/camera/b/a;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->r()Lcom/fimi/soul/biz/camera/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/c;->e()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$3;->a:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-static {v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->c(Lcom/fimi/soul/module/setting/MapSettingFragment;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$3;->a:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-static {v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->d(Lcom/fimi/soul/module/setting/MapSettingFragment;)Lcom/fimi/soul/module/setting/MapSettingFragment$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/module/setting/MapSettingFragment$a;->c()V

    goto :goto_0
.end method
