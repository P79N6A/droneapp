.class public Lcom/fimi/soul/module/paircode/PairCodeActivity;
.super Lcom/fimi/soul/base/BaseActivity;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/fimi/soul/drone/d$b;


# static fields
.field public static a:Z


# instance fields
.field private b:Landroid/app/FragmentManager;

.field private c:Lcom/fimi/soul/module/paircode/PairResultFragment;

.field private d:Lcom/fimi/soul/module/paircode/PairErrorFragment;

.field private e:Lcom/fimi/soul/module/paircode/PairFragment;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/ImageView;

.field private h:Lcom/fimi/soul/module/paircode/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->a:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/base/BaseActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/paircode/PairCodeActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/paircode/PairCodeActivity;->c()V

    return-void
.end method

.method private b()V
    .locals 3

    new-instance v0, Lcom/fimi/soul/view/f$a;

    invoke-direct {v0, p0}, Lcom/fimi/soul/view/f$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0a0191

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/paircode/PairCodeActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$a;

    const v1, 0x7f0a0103

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/paircode/PairCodeActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/paircode/PairCodeActivity$1;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/paircode/PairCodeActivity$1;-><init>(Lcom/fimi/soul/module/paircode/PairCodeActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    const v1, 0x7f0a017f

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/paircode/PairCodeActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/paircode/PairCodeActivity$2;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/paircode/PairCodeActivity$2;-><init>(Lcom/fimi/soul/module/paircode/PairCodeActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$a;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V

    return-void
.end method

.method private c()V
    .locals 2

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/t;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/t;-><init>()V

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/c/a/a/t;->a(B)V

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/e/d;->k()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/c/a/a/t;->a(Z)V

    iget-object v1, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/fimi/soul/drone/c/a/a/t;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->b:Landroid/app/FragmentManager;

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0f03e7

    iget-object v2, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->e:Lcom/fimi/soul/module/paircode/PairFragment;

    invoke-virtual {v0, v1, v2}, Landroid/app/FragmentTransaction;->replace(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    return-void
.end method

.method public a(Lcom/fimi/soul/module/paircode/a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->h:Lcom/fimi/soul/module/paircode/a;

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->c:Lcom/fimi/soul/module/paircode/PairResultFragment;

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/fimi/soul/module/paircode/PairCodeActivity;->b()V

    :goto_0
    return-void

    :cond_0
    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onBackPressed()V

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->c:Lcom/fimi/soul/module/paircode/PairResultFragment;

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/fimi/soul/module/paircode/PairCodeActivity;->b()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/paircode/PairCodeActivity;->finish()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x7f0f03e5
        :pswitch_0
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Lcom/fimi/soul/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0400ba

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/paircode/PairCodeActivity;->setContentView(I)V

    const v0, 0x7f0f03e6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/paircode/PairCodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->f:Landroid/widget/TextView;

    const v0, 0x7f0f03e5

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/paircode/PairCodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->g:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->g:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/paircode/PairCodeActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Landroid/view/View;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->f:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->g:Landroid/widget/ImageView;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/paircode/PairCodeActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->b:Landroid/app/FragmentManager;

    new-instance v0, Lcom/fimi/soul/module/paircode/PairResultFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/paircode/PairResultFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->c:Lcom/fimi/soul/module/paircode/PairResultFragment;

    new-instance v0, Lcom/fimi/soul/module/paircode/PairFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/paircode/PairFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->e:Lcom/fimi/soul/module/paircode/PairFragment;

    new-instance v0, Lcom/fimi/soul/module/paircode/PairErrorFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/paircode/PairErrorFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->d:Lcom/fimi/soul/module/paircode/PairErrorFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->b:Landroid/app/FragmentManager;

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0f03e7

    iget-object v2, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->e:Lcom/fimi/soul/module/paircode/PairFragment;

    invoke-virtual {v0, v1, v2}, Landroid/app/FragmentTransaction;->replace(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    invoke-virtual {p0}, Lcom/fimi/soul/module/paircode/PairCodeActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 7

    const v6, 0x7f0f03e7

    const/4 v5, 0x2

    const/4 v4, 0x0

    invoke-super {p0, p1, p2}, Lcom/fimi/soul/base/BaseActivity;->onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V

    sget-object v0, Lcom/fimi/soul/module/paircode/PairCodeActivity$3;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->e()Lcom/fimi/soul/drone/h/ae;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ae;->c()B

    move-result v1

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ae;->d()B

    move-result v2

    const/16 v3, 0x9

    if-ne v2, v3, :cond_3

    if-ne v1, v5, :cond_2

    invoke-virtual {p0}, Lcom/fimi/soul/module/paircode/PairCodeActivity;->finish()V

    :cond_1
    :goto_1
    iget-object v2, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->h:Lcom/fimi/soul/module/paircode/a;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->h:Lcom/fimi/soul/module/paircode/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ae;->e()B

    move-result v0

    invoke-interface {v2, v1, v0}, Lcom/fimi/soul/module/paircode/a;->a(II)V

    goto :goto_0

    :cond_2
    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    const v0, 0x7f0a02fb

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/paircode/PairCodeActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;)V

    sput-boolean v4, Lcom/fimi/soul/module/paircode/PairCodeActivity;->a:Z

    invoke-virtual {p0}, Lcom/fimi/soul/module/paircode/PairCodeActivity;->finish()V

    goto :goto_0

    :cond_3
    iget-object v2, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->b:Landroid/app/FragmentManager;

    invoke-virtual {v2}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v2

    iget-object v3, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->c:Lcom/fimi/soul/module/paircode/PairResultFragment;

    invoke-virtual {v2, v6, v3}, Landroid/app/FragmentTransaction;->replace(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/FragmentTransaction;->commit()I

    goto :goto_1

    :pswitch_1
    sget-boolean v0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->a:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->b:Landroid/app/FragmentManager;

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->d:Lcom/fimi/soul/module/paircode/PairErrorFragment;

    invoke-virtual {v0, v6, v1}, Landroid/app/FragmentTransaction;->replace(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    sput-boolean v4, Lcom/fimi/soul/module/paircode/PairCodeActivity;->a:Z

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->h:Lcom/fimi/soul/module/paircode/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->h:Lcom/fimi/soul/module/paircode/a;

    invoke-interface {v0, v5}, Lcom/fimi/soul/module/paircode/a;->a(I)V

    sput-boolean v4, Lcom/fimi/soul/module/paircode/PairCodeActivity;->a:Z

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->h:Lcom/fimi/soul/module/paircode/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/paircode/PairCodeActivity;->h:Lcom/fimi/soul/module/paircode/a;

    const/16 v1, 0x10

    invoke-interface {v0, v1}, Lcom/fimi/soul/module/paircode/a;->a(I)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
