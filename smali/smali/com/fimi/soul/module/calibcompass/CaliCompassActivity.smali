.class public Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;
.super Lcom/fimi/soul/base/BaseActivity;

# interfaces
.implements Lcom/fimi/soul/module/calibcompass/BaseCaliCompassFragment$a;
.implements Lcom/fimi/soul/module/calibcompass/CaliComPassFirstFragment$a;
.implements Lcom/fimi/soul/module/calibcompass/CaliComPassThirdFragment$a;
.implements Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment$a;


# instance fields
.field private a:Lcom/fimi/soul/module/calibcompass/CaliComPassFirstFragment;

.field private b:Lcom/fimi/soul/module/calibcompass/CaliCompassSecondFragment;

.field private c:Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;

.field private d:Lcom/fimi/soul/module/calibcompass/CaliComPassThirdFragment;

.field private e:Lcom/fimi/soul/module/calibcompass/CaliCompassFourFragment;

.field private f:Lcom/fimi/soul/module/calibcompass/CaliCompassErrorVertialFragment;

.field private g:Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;

.field private h:Landroid/support/v4/app/FragmentManager;

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Z

.field private final m:I

.field private final n:I

.field private final o:I

.field private p:Z

.field private q:Landroid/os/Handler;

.field private r:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/base/BaseActivity;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->k:Z

    const/16 v0, 0xb

    iput v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->m:I

    const/16 v0, 0xc

    iput v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->n:I

    const/16 v0, 0xd

    iput v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->o:I

    new-instance v0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity$1;-><init>(Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;)V

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->q:Landroid/os/Handler;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->r:Z

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;)Lcom/fimi/soul/module/calibcompass/CaliComPassFirstFragment;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->a:Lcom/fimi/soul/module/calibcompass/CaliComPassFirstFragment;

    return-object v0
.end method

.method private a(ILjava/lang/String;ZZ)V
    .locals 4

    iget-boolean v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->k:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->isVisible()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v1, p2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    instance-of v1, v2, Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;

    if-eqz v1, :cond_1

    invoke-virtual {v2}, Landroid/support/v4/app/Fragment;->isHidden()Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, v2

    check-cast v1, Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, p3, p4}, Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;->a(Ljava/lang/String;ZZ)V

    iget-object v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->g:Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->a(Z)V

    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 8

    const v7, 0x7f0f01dd

    const v6, 0x7f0f01dc

    const v5, 0x7f0f01db

    const v4, 0x7f0f01da

    const v3, 0x7f0f01d9

    invoke-virtual {p0}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    if-nez p1, :cond_7

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->g:Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->g:Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->g:Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->g:Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;

    const-string v2, "begin"

    invoke-virtual {v0, v3, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0, v4}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/calibcompass/CaliComPassFirstFragment;

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->a:Lcom/fimi/soul/module/calibcompass/CaliComPassFirstFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->a:Lcom/fimi/soul/module/calibcompass/CaliComPassFirstFragment;

    if-nez v0, :cond_1

    new-instance v0, Lcom/fimi/soul/module/calibcompass/CaliComPassFirstFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/calibcompass/CaliComPassFirstFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->a:Lcom/fimi/soul/module/calibcompass/CaliComPassFirstFragment;

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->a:Lcom/fimi/soul/module/calibcompass/CaliComPassFirstFragment;

    const-string v2, "first"

    invoke-virtual {v0, v4, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->a:Lcom/fimi/soul/module/calibcompass/CaliComPassFirstFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0, v5}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/calibcompass/CaliCompassSecondFragment;

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->b:Lcom/fimi/soul/module/calibcompass/CaliCompassSecondFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->b:Lcom/fimi/soul/module/calibcompass/CaliCompassSecondFragment;

    if-nez v0, :cond_2

    new-instance v0, Lcom/fimi/soul/module/calibcompass/CaliCompassSecondFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/calibcompass/CaliCompassSecondFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->b:Lcom/fimi/soul/module/calibcompass/CaliCompassSecondFragment;

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->b:Lcom/fimi/soul/module/calibcompass/CaliCompassSecondFragment;

    const-string v2, "second"

    invoke-virtual {v0, v5, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->b:Lcom/fimi/soul/module/calibcompass/CaliCompassSecondFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0, v6}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->c:Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->c:Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;

    if-nez v0, :cond_3

    new-instance v0, Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->c:Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->c:Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;

    iget-boolean v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->i:Z

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;->a(Z)V

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->c:Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;

    const-string v2, "error"

    invoke-virtual {v0, v6, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->c:Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0, v7}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/calibcompass/CaliComPassThirdFragment;

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->d:Lcom/fimi/soul/module/calibcompass/CaliComPassThirdFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->d:Lcom/fimi/soul/module/calibcompass/CaliComPassThirdFragment;

    if-nez v0, :cond_4

    new-instance v0, Lcom/fimi/soul/module/calibcompass/CaliComPassThirdFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/calibcompass/CaliComPassThirdFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->d:Lcom/fimi/soul/module/calibcompass/CaliComPassThirdFragment;

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->d:Lcom/fimi/soul/module/calibcompass/CaliComPassThirdFragment;

    const-string v2, "thrid"

    invoke-virtual {v0, v7, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->d:Lcom/fimi/soul/module/calibcompass/CaliComPassThirdFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    const v1, 0x7f0f01de

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/calibcompass/CaliCompassFourFragment;

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->e:Lcom/fimi/soul/module/calibcompass/CaliCompassFourFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->e:Lcom/fimi/soul/module/calibcompass/CaliCompassFourFragment;

    if-nez v0, :cond_5

    new-instance v0, Lcom/fimi/soul/module/calibcompass/CaliCompassFourFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/calibcompass/CaliCompassFourFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->e:Lcom/fimi/soul/module/calibcompass/CaliCompassFourFragment;

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->e:Lcom/fimi/soul/module/calibcompass/CaliCompassFourFragment;

    iget-boolean v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->i:Z

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/calibcompass/CaliCompassFourFragment;->a(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0f01de

    iget-object v2, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->e:Lcom/fimi/soul/module/calibcompass/CaliCompassFourFragment;

    const-string v3, "four"

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->e:Lcom/fimi/soul/module/calibcompass/CaliCompassFourFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    const v1, 0x7f0f01df

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/calibcompass/CaliCompassErrorVertialFragment;

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->f:Lcom/fimi/soul/module/calibcompass/CaliCompassErrorVertialFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->f:Lcom/fimi/soul/module/calibcompass/CaliCompassErrorVertialFragment;

    if-nez v0, :cond_6

    new-instance v0, Lcom/fimi/soul/module/calibcompass/CaliCompassErrorVertialFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/calibcompass/CaliCompassErrorVertialFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->f:Lcom/fimi/soul/module/calibcompass/CaliCompassErrorVertialFragment;

    :cond_6
    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0f01df

    iget-object v2, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->f:Lcom/fimi/soul/module/calibcompass/CaliCompassErrorVertialFragment;

    const-string v3, "errortratil"

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->f:Lcom/fimi/soul/module/calibcompass/CaliCompassErrorVertialFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    :cond_7
    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;ILjava/lang/String;ZZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->a(ILjava/lang/String;ZZ)V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->p:Z

    return p1
.end method

.method static synthetic b(Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;)Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->c:Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;

    return-object v0
.end method

.method static synthetic b(Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->l:Z

    return p1
.end method


# virtual methods
.method public a()V
    .locals 3

    new-instance v0, Lcom/fimi/soul/view/f$a;

    invoke-direct {v0, p0}, Lcom/fimi/soul/view/f$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0a0238

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    const v1, 0x7f0a0103

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity$3;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity$3;-><init>(Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    const v1, 0x7f0a017f

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity$2;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity$2;-><init>(Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$a;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V

    return-void
.end method

.method public a(Z)V
    .locals 2

    const/16 v1, 0xd

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->q:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->q:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    :cond_0
    iput-boolean p1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->r:Z

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->j:Z

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->c:Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->h:Landroid/support/v4/app/FragmentManager;

    const-string v2, "begin"

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->e:Lcom/fimi/soul/module/calibcompass/CaliCompassFourFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->e:Lcom/fimi/soul/module/calibcompass/CaliCompassFourFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/calibcompass/CaliCompassFourFragment;->a()V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    const/16 v1, 0x80

    invoke-virtual {p0}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    invoke-super {p0, p1}, Lcom/fimi/soul/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f040048

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->setContentView(I)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "isdirectcalicompass"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->i:Z

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->a(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->dpa:Lcom/fimi/soul/base/DroidPlannerApp;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/base/DroidPlannerApp;->b(Landroid/app/Activity;)V

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->q:Landroid/os/Handler;

    const/16 v1, 0xc

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onDestroy()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->r:Z

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->speakTTs:Lcom/fimi/kernel/d/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->speakTTs:Lcom/fimi/kernel/d/b;

    invoke-virtual {v0}, Lcom/fimi/kernel/d/b;->e()V

    :cond_0
    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 8

    const v7, 0x7f0a00e4

    const/16 v6, 0xd

    const/4 v5, 0x1

    const/4 v4, 0x0

    invoke-super {p0, p1, p2}, Lcom/fimi/soul/base/BaseActivity;->onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V

    sget-object v0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity$4;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    sget-object v0, Lcom/fimi/soul/drone/d$a;->as:Lcom/fimi/soul/drone/d$a;

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->g:Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->g:Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->isVisible()Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x7f0a0083

    const-string v1, "error"

    invoke-direct {p0, v0, v1, v4, v4}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->a(ILjava/lang/String;ZZ)V

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->g:Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->g:Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->isVisible()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/fimi/soul/drone/d$a;->ba:Lcom/fimi/soul/drone/d$a;

    if-ne p1, v0, :cond_3

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->i()Lcom/fimi/soul/drone/h/j;

    move-result-object v0

    iget-boolean v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->p:Z

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->d()B

    move-result v1

    if-eq v1, v5, :cond_2

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->d()B

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_5

    :cond_2
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->e()B

    move-result v1

    if-ne v1, v5, :cond_5

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->b()B

    move-result v1

    if-ne v1, v5, :cond_5

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->c()B

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_5

    const v0, 0x7f0a00e5

    const-string v1, "error"

    invoke-direct {p0, v0, v1, v4, v4}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->a(ILjava/lang/String;ZZ)V

    :cond_3
    :goto_1
    return-void

    :pswitch_0
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->g:Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->g:Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->isVisible()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->r:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->q:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->q:Landroid/os/Handler;

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v6, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    :cond_4
    const v0, 0x7f0a0084

    const-string v1, "error"

    invoke-direct {p0, v0, v1, v4, v4}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->a(ILjava/lang/String;ZZ)V

    goto/16 :goto_0

    :cond_5
    iget-boolean v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->j:Z

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->d()B

    move-result v1

    if-eq v1, v5, :cond_6

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->d()B

    move-result v1

    if-nez v1, :cond_8

    :cond_6
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->e()B

    move-result v1

    if-ne v1, v5, :cond_8

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->b()B

    move-result v1

    if-ne v1, v5, :cond_8

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->c()B

    move-result v1

    if-eq v1, v5, :cond_7

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->c()B

    move-result v1

    if-nez v1, :cond_8

    :cond_7
    iput-boolean v4, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->j:Z

    iput-boolean v5, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->k:Z

    invoke-static {p2}, Lcom/fimi/soul/module/b/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/b/d;

    move-result-object v0

    invoke-virtual {v0, v5, v5, v5}, Lcom/fimi/soul/module/b/d;->a(BBB)V

    goto :goto_1

    :cond_8
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->c()B

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_a

    iget-boolean v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->l:Z

    if-eqz v0, :cond_9

    const-string v0, "error"

    invoke-direct {p0, v7, v0, v4, v5}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->a(ILjava/lang/String;ZZ)V

    goto :goto_1

    :cond_9
    const-string v0, "error"

    invoke-direct {p0, v7, v0, v4, v4}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->a(ILjava/lang/String;ZZ)V

    goto :goto_1

    :cond_a
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->c()B

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_3

    const-string v0, "errortratil"

    invoke-direct {p0, v4, v0, v4, v4}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->a(ILjava/lang/String;ZZ)V

    goto/16 :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->g:Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->g:Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->isVisible()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->c:Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->c:Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;->isVisible()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;->a()V

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/fimi/soul/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method
