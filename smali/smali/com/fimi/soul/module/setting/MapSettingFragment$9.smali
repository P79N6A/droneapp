.class Lcom/fimi/soul/module/setting/MapSettingFragment$9;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/setting/MapSettingFragment;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/view/i$a;

.field final synthetic b:Lcom/fimi/soul/module/setting/MapSettingFragment;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/setting/MapSettingFragment;Lcom/fimi/soul/view/i$a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$9;->b:Lcom/fimi/soul/module/setting/MapSettingFragment;

    iput-object p2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$9;->a:Lcom/fimi/soul/view/i$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    const v2, 0x7f0a0332

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$9;->a:Lcom/fimi/soul/view/i$a;

    invoke-virtual {v0}, Lcom/fimi/soul/view/i$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/a/a/o/f;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$9;->a:Lcom/fimi/soul/view/i$a;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$9;->b:Lcom/fimi/soul/module/setting/MapSettingFragment;

    const v2, 0x7f0a0333

    invoke-virtual {v1, v2}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/i$a;->b(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$9;->a:Lcom/fimi/soul/view/i$a;

    invoke-virtual {v0}, Lcom/fimi/soul/view/i$a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/a/a/o/f;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$9;->a:Lcom/fimi/soul/view/i$a;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$9;->b:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-virtual {v1, v2}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/i$a;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$9;->a:Lcom/fimi/soul/view/i$a;

    invoke-virtual {v0}, Lcom/fimi/soul/view/i$a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-ge v0, v1, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$9;->a:Lcom/fimi/soul/view/i$a;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$9;->b:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-virtual {v1, v2}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/i$a;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;->getInstance()Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$9;->a:Lcom/fimi/soul/view/i$a;

    invoke-virtual {v1}, Lcom/fimi/soul/view/i$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;->setSsid(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment$9;->a:Lcom/fimi/soul/view/i$a;

    invoke-virtual {v1}, Lcom/fimi/soul/view/i$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;->setPassword(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/fimi/soul/biz/modifyRealyWiFiConfigure/ModifyRelayWiFi;->sendModifyCongigure()V

    goto :goto_0
.end method
