.class public Lcom/fimi/soul/module/droneui/FlightActivity;
.super Lcom/fimi/soul/base/BaseActivity;

# interfaces
.implements Lcom/fimi/soul/drone/d$b;
.implements Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$d;
.implements Lcom/fimi/soul/module/droneFragment/d;
.implements Lcom/fimi/soul/module/dronemanage/FlightMapFragment$a;
.implements Lcom/fimi/soul/module/login/FirstLeadFragment$a;
.implements Lcom/fimi/soul/module/setting/MapSettingFragment$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/droneui/FlightActivity$a;,
        Lcom/fimi/soul/module/droneui/FlightActivity$b;
    }
.end annotation


# static fields
.field private static final m:I = 0x1

.field private static final u:I = 0x7b

.field private static final z:I = 0xf


# instance fields
.field a:Landroid/view/View;

.field public b:Lcom/fimi/soul/module/droneui/FlightActivity$b;

.field c:Ljava/util/Timer;

.field d:Lcom/fimi/soul/module/droneui/FlightActivity$a;

.field private e:Landroid/support/v4/app/FragmentManager;

.field private f:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

.field private g:Lcom/fimi/soul/module/login/FirstLeadFragment;

.field private h:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

.field private i:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;

.field private j:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

.field private k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

.field private l:Lcom/fimi/soul/module/setting/MapSettingFragment;

.field private n:Z

.field private o:Landroid/widget/ProgressBar;

.field private p:Landroid/os/Handler;

.field private q:Landroid/widget/RelativeLayout;

.field private r:Landroid/support/v4/widget/DrawerLayout;

.field private s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

.field private t:Landroid/widget/TextView;

.field private v:I

.field private w:Lcom/fimi/kernel/utils/v;

.field private x:Z

.field private y:Landroid/widget/Toast;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/base/BaseActivity;-><init>()V

    sget-object v0, Lcom/fimi/soul/module/droneui/FlightActivity$b;->a:Lcom/fimi/soul/module/droneui/FlightActivity$b;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->b:Lcom/fimi/soul/module/droneui/FlightActivity$b;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->n:Z

    new-instance v0, Lcom/fimi/soul/module/droneui/FlightActivity$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/droneui/FlightActivity$1;-><init>(Lcom/fimi/soul/module/droneui/FlightActivity;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->p:Landroid/os/Handler;

    const/4 v0, 0x5

    iput v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->v:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->c:Ljava/util/Timer;

    return-void
.end method

.method private a(I)V
    .locals 5

    const/4 v4, 0x1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->o:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->isShown()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->o:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->p:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->p:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeMessages(I)V

    :cond_0
    iput-boolean v4, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->n:Z

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v0, v4, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->p:Landroid/os/Handler;

    int-to-long v2, p1

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->p:Landroid/os/Handler;

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/c/d;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/lit16 v1, v1, 0x7d0

    int-to-long v2, v1

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneui/FlightActivity;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->n:Z

    return v0
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneui/FlightActivity;)Landroid/widget/ProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->o:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/module/droneui/FlightActivity;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->v:I

    return v0
.end method

.method static synthetic d(Lcom/fimi/soul/module/droneui/FlightActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->t:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lcom/fimi/soul/module/droneui/FlightActivity;)I
    .locals 2

    iget v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->v:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->v:I

    return v0
.end method

.method static synthetic f(Lcom/fimi/soul/module/droneui/FlightActivity;)Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->h:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    return-object v0
.end method

.method static synthetic g(Lcom/fimi/soul/module/droneui/FlightActivity;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->p:Landroid/os/Handler;

    return-object v0
.end method

.method private l()V
    .locals 5

    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lcom/fimi/soul/utils/ao;->o(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "NoFlyZone-V1.0.0-DB.sqlite"

    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/16 v0, 0x800

    new-array v0, v0, [B

    :goto_0
    invoke-virtual {v1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    const/4 v4, 0x0

    invoke-virtual {v2, v0, v4, v3}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_1
    return-void

    :cond_1
    :try_start_1
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V

    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method private m()V
    .locals 0

    return-void
.end method

.method private n()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->isShown()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->q:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->drone:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->br:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    :cond_1
    return-void
.end method

.method private o()V
    .locals 5

    const/4 v4, 0x0

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->x:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->y:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->finish()V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->h:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->e()V

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->x:Z

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0a00aa

    invoke-static {v0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->y:Landroid/widget/Toast;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->y:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0
.end method

.method private p()V
    .locals 2

    invoke-static {p0}, Lcom/fimi/soul/biz/manager/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/h;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/module/droneui/FlightActivity$5;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneui/FlightActivity$5;-><init>(Lcom/fimi/soul/module/droneui/FlightActivity;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/manager/h;->a(Lcom/fimi/soul/biz/m/k;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->a()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    :cond_0
    return-void
.end method

.method public a(Lcom/fimi/soul/module/droneui/FlightActivity$b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->b:Lcom/fimi/soul/module/droneui/FlightActivity$b;

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/c;)V
    .locals 2

    const v0, 0x7f0f0161

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/FlightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/MapWrapperLayout;

    const/high16 v1, 0x41e00000    # 28.0f

    invoke-static {p0, v1}, Lcom/fimi/soul/utils/g;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/fimi/soul/view/MapWrapperLayout;->a(Lcom/google/android/gms/maps/c;I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/view/MapWrapperLayout;)V

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/drone/h/ba;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public b()Lcom/fimi/soul/module/droneui/FlightActivity$b;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->b:Lcom/fimi/soul/module/droneui/FlightActivity$b;

    return-object v0
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->h:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->h:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->onStart()V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->f:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->f:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->b()V

    :cond_1
    invoke-static {}, Lcom/fimi/soul/biz/j/g;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->f:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->executePendingTransactions()Z

    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->f:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    return-void
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->a:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public h()V
    .locals 2

    const v1, 0x7f0f043c

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneui/FlightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneui/FlightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method public i()V
    .locals 6

    :try_start_0
    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->o()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Lcom/fimi/kernel/utils/v;->c(I)V

    new-instance v0, Lcom/fimi/soul/view/f$d;

    invoke-direct {v0, p0}, Lcom/fimi/soul/view/f$d;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/text/SpannableStringBuilder;

    const v2, 0x7f0a015a

    invoke-virtual {p0, v2}, Lcom/fimi/soul/module/droneui/FlightActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0e0126

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v3, 0xd

    const/16 v4, 0x1d

    const/16 v5, 0x21

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0e0126

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v3, 0x22

    const/16 v4, 0x31

    const/16 v5, 0x21

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    const v2, 0x7f0a0159

    invoke-virtual {p0, v2}, Lcom/fimi/soul/module/droneui/FlightActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/f$d;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$d;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0e007e

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/f$d;->b(I)Lcom/fimi/soul/view/f$d;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$d;->b(Ljava/lang/CharSequence;)Lcom/fimi/soul/view/f$d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$d;->a(Z)Lcom/fimi/soul/view/f$d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$d;->b(Z)Lcom/fimi/soul/view/f$d;

    move-result-object v0

    const v1, 0x7f0202d1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$d;->a(I)Lcom/fimi/soul/view/f$d;

    move-result-object v0

    const v1, 0x7f0a017f

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneui/FlightActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/droneui/FlightActivity$2;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneui/FlightActivity$2;-><init>(Lcom/fimi/soul/module/droneui/FlightActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$d;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$d;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_0
.end method

.method public j()V
    .locals 5

    invoke-static {p0}, Lcom/fimi/soul/utils/ao;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Lcom/fimi/kernel/utils/v;

    invoke-direct {v0, p0}, Lcom/fimi/kernel/utils/v;-><init>(Landroid/content/Context;)V

    const-string v1, "insurance_ret"

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/utils/v;->e(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x2

    if-eq v1, v2, :cond_0

    const/16 v2, 0x64

    if-eq v1, v2, :cond_0

    new-instance v2, Lcom/fimi/soul/view/c$c;

    invoke-direct {v2, p0}, Lcom/fimi/soul/view/c$c;-><init>(Landroid/content/Context;)V

    const v3, 0x7f0a0233

    invoke-virtual {p0, v3}, Lcom/fimi/soul/module/droneui/FlightActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/view/c$c;->b(Ljava/lang/String;)Lcom/fimi/soul/view/c$c;

    const v3, 0x7f0a0236

    invoke-virtual {p0, v3}, Lcom/fimi/soul/module/droneui/FlightActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/view/c$c;->a(Ljava/lang/String;)Lcom/fimi/soul/view/c$c;

    const v3, 0x7f0a0232

    invoke-virtual {p0, v3}, Lcom/fimi/soul/module/droneui/FlightActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/fimi/soul/module/droneui/FlightActivity$4;

    invoke-direct {v4, p0, v0, v1}, Lcom/fimi/soul/module/droneui/FlightActivity$4;-><init>(Lcom/fimi/soul/module/droneui/FlightActivity;Lcom/fimi/kernel/utils/v;I)V

    invoke-virtual {v2, v3, v4}, Lcom/fimi/soul/view/c$c;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/c$c;

    move-result-object v2

    const v3, 0x7f0a0103

    invoke-virtual {p0, v3}, Lcom/fimi/soul/module/droneui/FlightActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/fimi/soul/module/droneui/FlightActivity$3;

    invoke-direct {v4, p0, v0, v1}, Lcom/fimi/soul/module/droneui/FlightActivity$3;-><init>(Lcom/fimi/soul/module/droneui/FlightActivity;Lcom/fimi/kernel/utils/v;I)V

    invoke-virtual {v2, v3, v4}, Lcom/fimi/soul/view/c$c;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/c$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/c$c;->a()Lcom/fimi/soul/view/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/c;->show()V

    goto :goto_0
.end method

.method public k()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->g:Lcom/fimi/soul/module/login/FirstLeadFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    const/4 v3, 0x0

    invoke-super {p0, p1, p2, p3}, Lcom/fimi/soul/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    const-string v0, "is_setting_enter"

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->w:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1, v0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->w:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    const-string v0, "connect_success"

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->w:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1, v0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/MapSettingFragment;->isHidden()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    :cond_0
    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->w:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v0, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    const/16 v1, 0x80

    const/4 v2, 0x3

    const v6, 0x7f0f0169

    const/4 v5, 0x1

    const/4 v4, 0x0

    invoke-super {p0, p1}, Lcom/fimi/soul/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->dpa:Lcom/fimi/soul/base/DroidPlannerApp;

    invoke-virtual {v0}, Lcom/fimi/soul/base/DroidPlannerApp;->d()V

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/fimi/soul/media/player/FimiMediaPlayer;->loadLibrariesOnce(Lcom/fimi/soul/media/player/FimiLibLoader;)V

    const-string v0, "libfmplayer.so"

    invoke-static {v0}, Lcom/fimi/soul/media/player/FimiMediaPlayer;->native_profileBegin(Ljava/lang/String;)V

    invoke-virtual {p0, v6}, Lcom/fimi/soul/module/droneui/FlightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->a:Landroid/view/View;

    const v0, 0x7f04002f

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/FlightActivity;->setContentView(I)V

    invoke-static {p0}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->w:Lcom/fimi/kernel/utils/v;

    const v0, 0x7f0f016c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/FlightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->t:Landroid/widget/TextView;

    new-instance v0, Lcom/fimi/soul/module/login/FirstLeadFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/login/FirstLeadFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->g:Lcom/fimi/soul/module/login/FirstLeadFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->g:Lcom/fimi/soul/module/login/FirstLeadFragment;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/module/login/FirstLeadFragment;->a(Lcom/fimi/soul/module/login/FirstLeadFragment$a;)V

    const v0, 0x7f0f016b

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/FlightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->o:Landroid/widget/ProgressBar;

    const v0, 0x7f0f0165

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/FlightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->q:Landroid/widget/RelativeLayout;

    const v0, 0x7f0f0160

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/FlightActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/widget/DrawerLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->r:Landroid/support/v4/widget/DrawerLayout;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->r:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0, v5}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->r:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0, v4}, Landroid/support/v4/widget/DrawerLayout;->setFocusableInTouchMode(Z)V

    invoke-static {p0}, Lcom/fimi/soul/biz/manager/o;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/manager/o;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "audio"

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/FlightActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v1

    invoke-virtual {v0, v2, v1, v4}, Landroid/media/AudioManager;->setStreamVolume(III)V

    :cond_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    const v1, 0x7f0f0164

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    if-nez v0, :cond_8

    new-instance v0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0f0164

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    const-string v3, "takephoto"

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    const v1, 0x7f0f0163

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    if-nez v0, :cond_9

    new-instance v0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0f0163

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    const-string v3, "fly"

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    const v1, 0x7f0f0162

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->f:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->f:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    if-nez v0, :cond_1

    new-instance v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->f:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0f0162

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->f:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    const v1, 0x7f0f0168

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->j:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->j:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    if-nez v0, :cond_2

    new-instance v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->j:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0f0168

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->j:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0, v6}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->i:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->i:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;

    if-nez v0, :cond_3

    new-instance v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->i:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->i:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;

    invoke-virtual {v0, v6, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    const v1, 0x7f0f0167

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->h:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->h:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    if-nez v0, :cond_4

    new-instance v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->h:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->h:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->j:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->i:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0f0167

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->h:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    const v1, 0x7f0f00ce

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/setting/MapSettingFragment;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    if-nez v0, :cond_5

    new-instance v0, Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0f00ce

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    :cond_5
    invoke-direct {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->l()V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fimi/soul/service/CheckCampassCaliService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/FlightActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    const-string v0, "curModel"

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->w:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1, v0, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v5, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0f016d

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->g:Lcom/fimi/soul/module/login/FirstLeadFragment;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    :cond_6
    new-instance v0, Lcom/fimi/soul/biz/f/a;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/f/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/fimi/soul/biz/f/a;->a()V

    invoke-static {}, Lcom/fimi/soul/module/update/a/a;->a()Lcom/fimi/soul/module/update/a/a;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/fimi/soul/module/update/a/a;->a(I)Lcom/fimi/soul/module/update/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/e;->b()I

    move-result v0

    if-gtz v0, :cond_7

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fimi/soul/service/RequestVersionService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/FlightActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_7
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->i()V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->p()V

    return-void

    :cond_8
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    goto/16 :goto_0

    :cond_9
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    goto/16 :goto_1
.end method

.method protected onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onDestroy()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->h:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->h:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Z)V

    :cond_0
    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 7

    const/4 v6, 0x4

    const/16 v5, 0x7b

    const/16 v4, 0x8

    const/4 v3, 0x1

    const/4 v2, 0x0

    sget-object v0, Lcom/fimi/soul/module/droneui/FlightActivity$6;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->p:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->p:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->removeMessages(I)V

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->p:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->p:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->o:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iput-boolean v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->n:Z

    goto :goto_0

    :pswitch_2
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ap()Lcom/fimi/soul/drone/h/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/a;->j()B

    move-result v0

    const/16 v1, 0x12

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->p:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x5

    iput v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->v:I

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->p:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->p:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->p:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->o:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iput-boolean v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->n:Z

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->isShown()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_6
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->p:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->p:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    :cond_7
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->o:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iput-boolean v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->n:Z

    goto/16 :goto_0

    :pswitch_5
    const/16 v0, 0x1388

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneui/FlightActivity;->a(I)V

    goto/16 :goto_0

    :pswitch_6
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isExceAction()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    sget-object v0, Lcom/fimi/soul/drone/d$a;->br:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {p2, v0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :pswitch_7
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->setUserVisibleHint(Z)V

    sget-object v0, Lcom/fimi/soul/drone/d$a;->br:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {p2, v0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :pswitch_8
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :pswitch_9
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/c/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/c/h;

    move-result-object v0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/h;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/entity/DroneModelType;->judgeNoAction()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v6}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/h;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-ne v0, v6, :cond_9

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    :cond_8
    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->r:Landroid/support/v4/widget/DrawerLayout;

    const v1, 0x800005

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->closeDrawer(I)V

    goto/16 :goto_0

    :cond_9
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_1

    :cond_a
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_1

    :pswitch_a
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->r:Landroid/support/v4/widget/DrawerLayout;

    const v1, 0x800005

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->openDrawer(I)V

    goto/16 :goto_0

    :pswitch_b
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->b:Lcom/fimi/soul/module/droneui/FlightActivity$b;

    sget-object v1, Lcom/fimi/soul/module/droneui/FlightActivity$b;->b:Lcom/fimi/soul/module/droneui/FlightActivity$b;

    if-ne v0, v1, :cond_d

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->e()V

    :goto_2
    :pswitch_c
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->isShown()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_b
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    :cond_c
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto/16 :goto_0

    :cond_d
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->d()V

    goto :goto_2

    :pswitch_d
    invoke-direct {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->n()V

    goto/16 :goto_0

    :pswitch_e
    invoke-direct {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->n()V

    goto/16 :goto_0

    :pswitch_f
    invoke-direct {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->n()V

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_0
        :pswitch_d
        :pswitch_e
        :pswitch_f
    .end packed-switch
.end method

.method public onHandleMessage(Landroid/os/Message;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/fimi/soul/base/BaseActivity;->onHandleMessage(Landroid/os/Message;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->x:Z

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 4

    const v3, 0x800005

    const/4 v1, 0x0

    const/4 v0, 0x1

    const/4 v2, 0x4

    if-ne p1, v2, :cond_a

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->r:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v2, v3}, Landroid/support/v4/widget/DrawerLayout;->isDrawerOpen(I)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->r:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v1, v3}, Landroid/support/v4/widget/DrawerLayout;->closeDrawer(I)V

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    invoke-virtual {v2}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->b()Z

    move-result v2

    if-nez v2, :cond_0

    :cond_2
    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    invoke-virtual {v2}, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->a()Z

    move-result v2

    if-nez v2, :cond_0

    :cond_3
    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    invoke-virtual {v2}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->isHidden()Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    invoke-virtual {v2}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->a()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->isShown()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_4
    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    invoke-virtual {v1}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->isVisible()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->s:Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_0

    :cond_5
    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    invoke-virtual {v2}, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->isHidden()Z

    move-result v2

    if-nez v2, :cond_7

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->isShown()Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_6
    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    invoke-virtual {v1}, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->isVisible()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->k:Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->isHidden()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->c()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    :cond_8
    move v0, v1

    goto/16 :goto_0

    :cond_9
    invoke-direct {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->o()V

    move v0, v1

    goto/16 :goto_0

    :cond_a
    invoke-super {p0, p1, p2}, Lcom/fimi/soul/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto/16 :goto_0
.end method

.method protected onPause()V
    .locals 0

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 3

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onResume()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->e:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0f00ce

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->l:Lcom/fimi/soul/module/setting/MapSettingFragment;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->h:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->h:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->W()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Z)V

    :cond_1
    invoke-static {}, Lcom/fimi/soul/biz/j/g;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method protected onStart()V
    .locals 3

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onStart()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bf;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/bf;-><init>()V

    const/16 v1, 0x73

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/bf;->d:B

    const/4 v1, 0x1

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/bf;->e:B

    const/4 v1, 0x0

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/bf;->f:B

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/fimi/soul/drone/c/a/a/bf;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    :cond_0
    new-instance v0, Lcom/fimi/soul/module/droneui/FlightActivity$a;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/droneui/FlightActivity$a;-><init>(Lcom/fimi/soul/module/droneui/FlightActivity;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->d:Lcom/fimi/soul/module/droneui/FlightActivity$a;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->d:Lcom/fimi/soul/module/droneui/FlightActivity$a;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "resetRTSP"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/module/droneui/FlightActivity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method protected onStop()V
    .locals 2

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onStop()V

    invoke-static {}, Lcom/fimi/soul/media/player/FimiMediaPlayer;->native_profileEnd()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/FlightActivity;->d:Lcom/fimi/soul/module/droneui/FlightActivity$a;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/FlightActivity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/kernel/d/b;->b(Landroid/content/Context;)Lcom/fimi/kernel/d/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/d/b;->a(Z)V

    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/fimi/soul/base/BaseActivity;->onWindowFocusChanged(Z)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneui/FlightActivity;->m()V

    return-void
.end method
