.class public Lcom/fimi/soul/module/setting/RightRollerSetActivity;
.super Landroid/support/v4/app/FragmentActivity;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/fimi/soul/drone/d$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/setting/RightRollerSetActivity$a;
    }
.end annotation


# instance fields
.field a:Lcom/fimi/soul/module/setting/g;

.field b:Lcom/fimi/soul/drone/a;

.field c:Landroid/widget/ListView;

.field d:Landroid/widget/Button;

.field e:Landroid/content/Intent;

.field f:Z

.field g:Ljava/lang/String;

.field h:I

.field i:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->f:Z

    const-string v0, ""

    iput-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->g:Ljava/lang/String;

    const/4 v0, -0x1

    iput v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->h:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->i:Z

    return-void
.end method

.method private a(Lcom/fimi/soul/module/setting/RightRollerSetActivity$a;)V
    .locals 5

    const/4 v4, 0x1

    sget-object v0, Lcom/fimi/soul/module/setting/RightRollerSetActivity$a;->c:Lcom/fimi/soul/module/setting/RightRollerSetActivity$a;

    if-eq p1, v0, :cond_1

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bf;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/bf;-><init>()V

    const/16 v1, 0x73

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/bf;->d:B

    iput-byte v4, v0, Lcom/fimi/soul/drone/c/a/a/bf;->e:B

    sget-object v1, Lcom/fimi/soul/module/setting/RightRollerSetActivity$a;->a:Lcom/fimi/soul/module/setting/RightRollerSetActivity$a;

    if-ne p1, v1, :cond_2

    iput-byte v4, v0, Lcom/fimi/soul/drone/c/a/a/bf;->f:B

    iget-object v1, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->e:Landroid/content/Intent;

    const-string v2, "content"

    const v3, 0x7f0a0189

    invoke-virtual {p0, v3}, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->b:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/fimi/soul/drone/c/a/a/bf;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->i:Z

    :cond_1
    const/4 v0, -0x1

    iget-object v1, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->e:Landroid/content/Intent;

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->setResult(ILandroid/content/Intent;)V

    return-void

    :cond_2
    sget-object v1, Lcom/fimi/soul/module/setting/RightRollerSetActivity$a;->b:Lcom/fimi/soul/module/setting/RightRollerSetActivity$a;

    if-ne p1, v1, :cond_0

    const/4 v1, 0x2

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/bf;->f:B

    iget-object v1, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->e:Landroid/content/Intent;

    const-string v2, "content"

    const v3, 0x7f0a026e

    invoke-virtual {p0, v3}, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0
.end method

.method static synthetic a(Lcom/fimi/soul/module/setting/RightRollerSetActivity;Lcom/fimi/soul/module/setting/RightRollerSetActivity$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->a(Lcom/fimi/soul/module/setting/RightRollerSetActivity$a;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->finish()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x7f0f0427
        :pswitch_0
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0400cb

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->setContentView(I)V

    const v0, 0x7f0f0427

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->d:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->d:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f0428

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->c:Landroid/widget/ListView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 5

    const/4 v4, 0x1

    const/4 v3, 0x0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/fimi/soul/module/setting/RightRollerSetActivity$3;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->L()Lcom/fimi/soul/drone/h/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/c;->b()B

    move-result v1

    const/16 v2, 0x73

    if-ne v1, v2, :cond_0

    iget-boolean v1, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->i:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/c;->c()B

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    iget-byte v0, v0, Lcom/fimi/soul/drone/h/c;->d:B

    packed-switch v0, :pswitch_data_1

    :goto_1
    const v0, 0x7f0a0382

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    :goto_2
    iput-boolean v3, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->i:Z

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->a:Lcom/fimi/soul/module/setting/g;

    invoke-virtual {v0, v4}, Lcom/fimi/soul/module/setting/g;->a(I)V

    iput v4, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->h:I

    goto :goto_1

    :pswitch_2
    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->a:Lcom/fimi/soul/module/setting/g;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/module/setting/g;->a(I)V

    iput v3, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->h:I

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/c;->c()B

    move-result v1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_3

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/c;->c()B

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    :cond_3
    const v0, 0x7f0a0388

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->h:I

    goto :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method protected onResume()V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onResume()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->e:Landroid/content/Intent;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->b:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->b:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->c:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setClickable(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->a:Lcom/fimi/soul/module/setting/g;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/module/setting/g;->a(Z)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->e:Landroid/content/Intent;

    const-string v1, "GPS_ATTI"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->f:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->e:Landroid/content/Intent;

    const-string v1, "curModel"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->e:Landroid/content/Intent;

    const-string v1, "curModel"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->g:Ljava/lang/String;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->a:Lcom/fimi/soul/module/setting/g;

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->f:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->a:Lcom/fimi/soul/module/setting/g;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/module/setting/g;->b(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->a:Lcom/fimi/soul/module/setting/g;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/setting/g;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->c:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setClickable(Z)V

    goto :goto_0

    :cond_3
    const-string v0, ""

    goto :goto_1

    :cond_4
    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->f:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->a:Lcom/fimi/soul/module/setting/g;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->c:Landroid/widget/ListView;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setClickable(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->a:Lcom/fimi/soul/module/setting/g;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/module/setting/g;->b(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->g:Ljava/lang/String;

    const v1, 0x7f0a0189

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->a:Lcom/fimi/soul/module/setting/g;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/module/setting/g;->a(I)V

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->g:Ljava/lang/String;

    const v1, 0x7f0a026e

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->a:Lcom/fimi/soul/module/setting/g;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/module/setting/g;->a(I)V

    goto :goto_0
.end method

.method public onStart()V
    .locals 7

    const/4 v1, 0x0

    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onStart()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/base/DroidPlannerApp;

    iget-object v0, v0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->b:Lcom/fimi/soul/drone/a;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->b:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0d000f

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    if-eqz v2, :cond_0

    array-length v0, v2

    if-lez v0, :cond_0

    array-length v4, v2

    move v0, v1

    :goto_0
    if-ge v0, v4, :cond_0

    aget-object v5, v2, v0

    new-instance v6, Lcom/fimi/soul/module/setting/h;

    invoke-direct {v6}, Lcom/fimi/soul/module/setting/h;-><init>()V

    invoke-virtual {v6, v1}, Lcom/fimi/soul/module/setting/h;->a(Z)V

    invoke-virtual {v6, v5}, Lcom/fimi/soul/module/setting/h;->a(Ljava/lang/String;)V

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/fimi/soul/module/setting/g;

    invoke-direct {v0, p0, v3}, Lcom/fimi/soul/module/setting/g;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->a:Lcom/fimi/soul/module/setting/g;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->c:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->a:Lcom/fimi/soul/module/setting/g;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->c:Landroid/widget/ListView;

    new-instance v1, Lcom/fimi/soul/module/setting/RightRollerSetActivity$1;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/setting/RightRollerSetActivity$1;-><init>(Lcom/fimi/soul/module/setting/RightRollerSetActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->c:Landroid/widget/ListView;

    new-instance v1, Lcom/fimi/soul/module/setting/RightRollerSetActivity$2;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/setting/RightRollerSetActivity$2;-><init>(Lcom/fimi/soul/module/setting/RightRollerSetActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method protected onStop()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onStop()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->b:Lcom/fimi/soul/drone/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/RightRollerSetActivity;->b:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->b(Lcom/fimi/soul/drone/d$b;)V

    :cond_0
    return-void
.end method
