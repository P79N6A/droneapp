.class public Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;
.super Lcom/fimi/soul/base/BaseActivity;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field a:Lcom/fimi/soul/view/TranslationView;

.field b:Landroid/widget/TextView;

.field c:Landroid/widget/TextView;

.field d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/UpdateVersonBean;",
            ">;"
        }
    .end annotation
.end field

.field private e:Landroid/widget/Button;

.field private f:Landroid/widget/Button;

.field private g:Landroid/widget/Button;

.field private h:Ljava/lang/Boolean;

.field private i:Landroid/widget/ListView;

.field private j:Landroid/widget/TextView;

.field private k:Lcom/fimi/soul/b/h;

.field private l:Z

.field private m:Ljava/lang/String;

.field private n:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/base/BaseActivity;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->d:Ljava/util/List;

    const-string v0, "is_setting_enter"

    iput-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->m:Ljava/lang/String;

    new-instance v0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity$2;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity$2;-><init>(Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;)V

    iput-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->n:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->n:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic b(Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;)Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->f:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;)Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->g:Landroid/widget/Button;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    const v2, 0x33ffffff

    const/4 v1, 0x0

    invoke-static {p0}, Lcom/fimi/soul/utils/ao;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f0a02a9

    invoke-static {p0, v0}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Lcom/fimi/soul/biz/a/a;->a()Lcom/fimi/soul/biz/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/a/a;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->f:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->g:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->f:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setClickable(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->g:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setClickable(Z)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->c()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->b()V

    goto :goto_0
.end method

.method public b()V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fimi/soul/module/update/DowningActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->finish()V

    const/high16 v0, 0x10a0000

    const v1, 0x10a0001

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->overridePendingTransition(II)V

    return-void
.end method

.method public c()V
    .locals 1

    new-instance v0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity$1;-><init>(Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;)V

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity$1;->start()V

    return-void
.end method

.method public d()V
    .locals 6

    const/16 v5, 0x8

    const/4 v3, 0x1

    const/4 v4, 0x0

    const v0, 0x7f0f0172

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->e:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-array v1, v3, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->e:Landroid/widget/Button;

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->e:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f0173

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->f:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-array v1, v3, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->f:Landroid/widget/Button;

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->f:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f0174

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->g:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-array v1, v3, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->g:Landroid/widget/Button;

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->g:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f0108

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/TranslationView;

    iput-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->a:Lcom/fimi/soul/view/TranslationView;

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->a:Lcom/fimi/soul/view/TranslationView;

    invoke-virtual {v0, v4}, Lcom/fimi/soul/view/TranslationView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->a:Lcom/fimi/soul/view/TranslationView;

    invoke-virtual {v0}, Lcom/fimi/soul/view/TranslationView;->a()V

    const v0, 0x7f0f0109

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->b:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-array v1, v3, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->b:Landroid/widget/TextView;

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    const v0, 0x7f0f010a

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-array v1, v3, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->c:Landroid/widget/TextView;

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    const v0, 0x7f0f010d

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->j:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-array v1, v3, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->j:Landroid/widget/TextView;

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x7f0a0433

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x7f0a016c

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->l:Z

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->e:Landroid/widget/Button;

    invoke-virtual {v2, v5}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v2, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->f:Landroid/widget/Button;

    invoke-virtual {v2, v5}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v2, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->g:Landroid/widget/Button;

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setVisibility(I)V

    const v2, 0x7f0a0434

    invoke-virtual {p0, v2}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    iget-object v2, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->c:Landroid/widget/TextView;

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {}, Lcom/fimi/soul/biz/update/l;->b()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0f010c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->i:Landroid/widget/ListView;

    return-void

    :cond_0
    iget-object v2, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->e:Landroid/widget/Button;

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v2, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->f:Landroid/widget/Button;

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v2, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->g:Landroid/widget/Button;

    invoke-virtual {v2, v5}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_0
.end method

.method public e()V
    .locals 2

    new-instance v0, Lcom/fimi/soul/b/h;

    iget-object v1, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->d:Ljava/util/List;

    invoke-direct {v0, p0, v1}, Lcom/fimi/soul/b/h;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->k:Lcom/fimi/soul/b/h;

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->i:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->k:Lcom/fimi/soul/b/h;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    invoke-static {}, Lcom/fimi/kernel/c;->c()Lcom/fimi/kernel/c/a;

    move-result-object v0

    const-string v1, "sp_new_hand"

    invoke-interface {v0, v1}, Lcom/fimi/kernel/c/a;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fimi/soul/module/setting/newhand/NewHandActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->finish()V

    const/high16 v0, 0x10a0000

    const v1, 0x10a0001

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->overridePendingTransition(II)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->h:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "connect_success"

    iget-object v1, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->preferencesUtil:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->dpa:Lcom/fimi/soul/base/DroidPlannerApp;

    invoke-virtual {v0}, Lcom/fimi/soul/base/DroidPlannerApp;->d()V

    goto :goto_0

    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fimi/soul/module/droneui/FlightActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->a()V

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->a()V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x7f0f0172
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    const/16 v2, 0x80

    const/4 v0, 0x0

    const/4 v4, 0x1

    invoke-super {p0, p1}, Lcom/fimi/soul/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    iget-object v1, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->dpa:Lcom/fimi/soul/base/DroidPlannerApp;

    invoke-virtual {v1, p0}, Lcom/fimi/soul/base/DroidPlannerApp;->b(Landroid/app/Activity;)V

    const v1, 0x7f040032

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->setContentView(I)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v2, v2}, Landroid/view/Window;->setFlags(II)V

    sput-boolean v4, Lcom/fimi/soul/biz/update/c;->c:Z

    sput-boolean v4, Lcom/fimi/soul/biz/update/c;->b:Z

    invoke-static {p0}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v1

    iput-object v1, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->preferencesUtil:Lcom/fimi/kernel/utils/v;

    const-string v1, "is_setting_enter"

    iput-object v1, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->m:Ljava/lang/String;

    iget-object v1, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->preferencesUtil:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->m:Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->h:Ljava/lang/Boolean;

    invoke-static {}, Lcom/fimi/kernel/c;->c()Lcom/fimi/kernel/c/a;

    move-result-object v1

    const-string v2, "sp_need_down_firmwares"

    const-class v3, Lcom/fimi/soul/entity/UpdateVersonBean;

    invoke-interface {v1, v2, v3}, Lcom/fimi/kernel/c/a;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->d:Ljava/util/List;

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    const-string v2, "2"

    iget-object v0, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/UpdateVersonBean;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/UpdateVersonBean;->getForceSign()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-boolean v4, p0, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->l:Z

    :cond_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->d()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;->e()V

    return-void

    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/fimi/soul/base/BaseActivity;->onWindowFocusChanged(Z)V

    return-void
.end method