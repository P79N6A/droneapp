.class public Lcom/fimi/soul/module/login/LoginActivity;
.super Lcom/fimi/soul/base/BaseActivity;

# interfaces
.implements Lcom/fimi/soul/drone/d$b;
.implements Lcom/fimi/soul/module/login/LoginFragment$a;
.implements Lcom/fimi/soul/module/login/UsbConnectFragment$a;
.implements Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment$a;


# static fields
.field private static final A:I = 0x4

.field private static final D:I = 0x8

.field private static final N:I = 0x0

.field private static final o:I = 0x0

.field private static final p:I = 0x1

.field private static final u:I = 0x2

.field private static final v:I = 0x3

.field private static final w:I = 0x0

.field private static final x:I = 0x1

.field private static final y:I = 0x2

.field private static final z:I = 0x3


# instance fields
.field private B:Z

.field private C:I

.field private E:Z

.field private F:Z

.field private final G:I

.field private H:I

.field private I:Landroid/widget/ImageView;

.field private J:Landroid/animation/ValueAnimator;

.field private K:Lcom/fimi/soul/biz/update/b;

.field private L:I

.field private M:Ljava/lang/Thread;

.field private final O:Landroid/os/Handler;

.field private P:Ljava/lang/Runnable;

.field private Q:Ljava/lang/Runnable;

.field private R:Ljava/lang/Runnable;

.field a:Z

.field b:Lcom/fimi/kernel/utils/v;

.field c:Z

.field d:Lcom/fimi/soul/biz/e/d;

.field e:Lcom/fimi/soul/biz/e/c;

.field f:Lcom/fimi/soul/biz/i/a;

.field private g:Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;

.field private h:Lcom/fimi/soul/module/login/LoginFragment;

.field private i:Lcom/fimi/soul/module/login/UsbConnectFragment;

.field private j:Landroid/widget/ImageView;

.field private k:Landroid/graphics/drawable/AnimationDrawable;

.field private l:Lcom/fimi/soul/view/TranslationView;

.field private m:Lcom/fimi/soul/view/BreathLeapView;

.field private n:I

.field private q:Lcom/fimi/kernel/view/progress/ProgressView;

.field private final r:I

.field private s:Landroid/animation/ValueAnimator;

.field private t:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/fimi/soul/base/BaseActivity;-><init>()V

    iput v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->n:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->a:Z

    const/16 v0, 0xc8

    iput v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->r:I

    iput v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->C:I

    iput-boolean v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->E:Z

    iput-boolean v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->F:Z

    const v0, 0x88b8

    iput v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->G:I

    iput v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->H:I

    iput v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->L:I

    new-instance v0, Lcom/fimi/soul/module/login/LoginActivity$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/login/LoginActivity$1;-><init>(Lcom/fimi/soul/module/login/LoginActivity;)V

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->O:Landroid/os/Handler;

    new-instance v0, Lcom/fimi/soul/module/login/LoginActivity$6;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/login/LoginActivity$6;-><init>(Lcom/fimi/soul/module/login/LoginActivity;)V

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->P:Ljava/lang/Runnable;

    new-instance v0, Lcom/fimi/soul/module/login/LoginActivity$7;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/login/LoginActivity$7;-><init>(Lcom/fimi/soul/module/login/LoginActivity;)V

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->Q:Ljava/lang/Runnable;

    new-instance v0, Lcom/fimi/soul/module/login/LoginActivity$8;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/login/LoginActivity$8;-><init>(Lcom/fimi/soul/module/login/LoginActivity;)V

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->R:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/login/LoginActivity;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->C:I

    return v0
.end method

.method static synthetic a(Lcom/fimi/soul/module/login/LoginActivity;I)I
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/login/LoginActivity;->C:I

    return p1
.end method

.method static synthetic a(Lcom/fimi/soul/module/login/LoginActivity;Landroid/graphics/drawable/AnimationDrawable;)Landroid/graphics/drawable/AnimationDrawable;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/login/LoginActivity;->k:Landroid/graphics/drawable/AnimationDrawable;

    return-object p1
.end method

.method static synthetic a(Lcom/fimi/soul/module/login/LoginActivity;Lcom/fimi/soul/view/BreathLeapView;)Lcom/fimi/soul/view/BreathLeapView;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/login/LoginActivity;->m:Lcom/fimi/soul/view/BreathLeapView;

    return-object p1
.end method

.method static synthetic a(Lcom/fimi/soul/module/login/LoginActivity;Ljava/lang/Thread;)Ljava/lang/Thread;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/login/LoginActivity;->M:Ljava/lang/Thread;

    return-object p1
.end method

.method private a(I)V
    .locals 2

    int-to-long v0, p1

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/fimi/soul/module/login/LoginActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/fimi/soul/module/login/LoginActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const/4 v3, 0x0

    invoke-direct {p0}, Lcom/fimi/soul/module/login/LoginActivity;->g()Z

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->g:Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;

    if-nez v1, :cond_0

    new-instance v1, Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;

    invoke-direct {v1}, Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;-><init>()V

    iput-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->g:Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;

    :cond_0
    iget-boolean v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->F:Z

    if-eqz v1, :cond_1

    :goto_0
    return-void

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->g:Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;

    invoke-virtual {v0, v1}, Landroid/app/FragmentTransaction;->show(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->g:Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->g:Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;

    invoke-virtual {v0, p2}, Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->g:Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;

    const v1, 0x7f0a02cd

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/login/LoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->g:Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;->c(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->g:Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;->a(Z)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    const/high16 v1, 0x10a0000

    const v2, 0x10a0001

    invoke-virtual {v0, v1, v2}, Landroid/app/FragmentTransaction;->setCustomAnimations(II)Landroid/app/FragmentTransaction;

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0f015b

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginActivity;->g:Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;

    invoke-virtual {v0, v1, v2}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_1
.end method

.method static synthetic a(Lcom/fimi/soul/module/login/LoginActivity;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/login/LoginActivity;->B:Z

    return p1
.end method

.method static synthetic b(Lcom/fimi/soul/module/login/LoginActivity;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->H:I

    return v0
.end method

.method static synthetic b(Lcom/fimi/soul/module/login/LoginActivity;I)I
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/login/LoginActivity;->n:I

    return p1
.end method

.method static synthetic c(Lcom/fimi/soul/module/login/LoginActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/login/LoginActivity;->k()V

    return-void
.end method

.method static synthetic c(Lcom/fimi/soul/module/login/LoginActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/login/LoginActivity;->a(I)V

    return-void
.end method

.method static synthetic d(Lcom/fimi/soul/module/login/LoginActivity;)Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->Q:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic e(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->O:Landroid/os/Handler;

    return-object v0
.end method

.method private f()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->M:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->M:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->M:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->M:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    return-void
.end method

.method static synthetic f(Lcom/fimi/soul/module/login/LoginActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/login/LoginActivity;->f()V

    return-void
.end method

.method static synthetic g(Lcom/fimi/soul/module/login/LoginActivity;)Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->R:Ljava/lang/Runnable;

    return-object v0
.end method

.method private g()Z
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const v1, 0x7f0f015b

    invoke-virtual {v0, v1}, Landroid/app/FragmentManager;->findFragmentById(I)Landroid/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->g:Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->g:Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic h(Lcom/fimi/soul/module/login/LoginActivity;)Ljava/lang/Thread;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->M:Ljava/lang/Thread;

    return-object v0
.end method

.method private h()V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://play.google.com/store/apps/details?id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    new-instance v2, Lcom/fimi/soul/biz/update/e;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-direct {v2, p0, v0}, Lcom/fimi/soul/biz/update/e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v1, v0, v3

    invoke-virtual {v2, v0}, Lcom/fimi/soul/biz/update/e;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic i(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/animation/ValueAnimator;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->J:Landroid/animation/ValueAnimator;

    return-object v0
.end method

.method private i()V
    .locals 1

    sget-object v0, Lcom/fimi/soul/drone/g/c;->d:Ljava/lang/String;

    invoke-static {v0}, Lcom/fimi/soul/drone/droneconnection/connection/a/a;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->b()V

    return-void
.end method

.method static synthetic j(Lcom/fimi/soul/module/login/LoginActivity;)Lcom/fimi/kernel/view/progress/ProgressView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->q:Lcom/fimi/kernel/view/progress/ProgressView;

    return-object v0
.end method

.method private j()V
    .locals 4

    iget-boolean v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->B:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->finish()V

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->B:Z

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0a00aa

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->O:Landroid/os/Handler;

    const/4 v1, 0x3

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0
.end method

.method static synthetic k(Lcom/fimi/soul/module/login/LoginActivity;)Lcom/fimi/soul/view/BreathLeapView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->m:Lcom/fimi/soul/view/BreathLeapView;

    return-object v0
.end method

.method private k()V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fimi/soul/module/droneui/FlightActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LoginActivity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->finish()V

    return-void
.end method

.method static synthetic l(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->I:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic m(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/graphics/drawable/AnimationDrawable;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->k:Landroid/graphics/drawable/AnimationDrawable;

    return-object v0
.end method

.method static synthetic n(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->j:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic o(Lcom/fimi/soul/module/login/LoginActivity;)Lcom/fimi/soul/module/login/UsbConnectFragment;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->i:Lcom/fimi/soul/module/login/UsbConnectFragment;

    return-object v0
.end method

.method static synthetic p(Lcom/fimi/soul/module/login/LoginActivity;)Lcom/fimi/soul/view/TranslationView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->l:Lcom/fimi/soul/view/TranslationView;

    return-object v0
.end method

.method static synthetic q(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/animation/ValueAnimator;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->s:Landroid/animation/ValueAnimator;

    return-object v0
.end method

.method static synthetic r(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->t:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic s(Lcom/fimi/soul/module/login/LoginActivity;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->n:I

    return v0
.end method

.method static synthetic t(Lcom/fimi/soul/module/login/LoginActivity;)I
    .locals 2

    iget v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->n:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->n:I

    return v0
.end method

.method static synthetic u(Lcom/fimi/soul/module/login/LoginActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/login/LoginActivity;->i()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    const/16 v4, 0x80

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->k:Landroid/graphics/drawable/AnimationDrawable;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->C:I

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->k:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->k:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/module/login/LoginActivity$5;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/login/LoginActivity$5;-><init>(Lcom/fimi/soul/module/login/LoginActivity;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const-wide/16 v2, 0x2d0

    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v4, v4}, Landroid/view/Window;->setFlags(II)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->O:Landroid/os/Handler;

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->P:Ljava/lang/Runnable;

    const-wide/16 v2, 0x44c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public b()V
    .locals 5

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->d:Lcom/fimi/soul/biz/e/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/d;->o()Lcom/fimi/kernel/b/d/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/b/d/c;->f()Lcom/fimi/kernel/b/d/d;

    move-result-object v0

    invoke-static {}, Lcom/fimi/soul/biz/camera/e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/b/d/d;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->e:Lcom/fimi/soul/biz/e/c;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/c;->f()Lcom/fimi/kernel/b/d/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/b/d/c;->f()Lcom/fimi/kernel/b/d/d;

    move-result-object v0

    invoke-static {}, Lcom/fimi/soul/biz/camera/e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/b/d/d;->a(Ljava/lang/String;)V

    invoke-static {}, Lcom/fimi/soul/biz/camera/b;->a()Lcom/fimi/soul/biz/camera/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/b;->e()Lcom/fimi/soul/biz/camera/b/c;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Lcom/fimi/soul/biz/camera/a/b;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/fimi/soul/biz/camera/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/a/b;->g()Lcom/fimi/kernel/b/d/c;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/fimi/kernel/b/d/c;->f()Lcom/fimi/kernel/b/d/d;

    move-result-object v1

    invoke-static {}, Lcom/fimi/soul/biz/camera/e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/kernel/b/d/d;->a(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/a/b;->f()Lcom/fimi/kernel/b/d/c;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/fimi/kernel/b/d/c;->f()Lcom/fimi/kernel/b/d/d;

    move-result-object v0

    invoke-static {}, Lcom/fimi/soul/biz/camera/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/b/d/d;->a(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x1

    iput v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->C:I

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->j:Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->j:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->l:Lcom/fimi/soul/view/TranslationView;

    invoke-virtual {v0, v4}, Lcom/fimi/soul/view/TranslationView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->l:Lcom/fimi/soul/view/TranslationView;

    const/16 v1, 0x1f4

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/TranslationView;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->O:Landroid/os/Handler;

    const/4 v1, 0x4

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iput v4, p0, Lcom/fimi/soul/module/login/LoginActivity;->n:I

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->I:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->i:Lcom/fimi/soul/module/login/UsbConnectFragment;

    invoke-virtual {v0, v1}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    return-void
.end method

.method public c()V
    .locals 3

    iget-boolean v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->E:Z

    if-eqz v0, :cond_0

    const-string v0, "connect_success"

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->b:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->dpa:Lcom/fimi/soul/base/DroidPlannerApp;

    invoke-virtual {v0}, Lcom/fimi/soul/base/DroidPlannerApp;->d()V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fimi/soul/module/droneui/FlightActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LoginActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public d()V
    .locals 3

    iget-boolean v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->E:Z

    if-eqz v0, :cond_0

    const-string v0, "connect_success"

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->b:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->dpa:Lcom/fimi/soul/base/DroidPlannerApp;

    invoke-virtual {v0}, Lcom/fimi/soul/base/DroidPlannerApp;->d()V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fimi/soul/module/droneui/FlightActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LoginActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method public e()V
    .locals 4

    const/4 v3, 0x4

    const/4 v2, 0x0

    iput v2, p0, Lcom/fimi/soul/module/login/LoginActivity;->C:I

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->g:Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;

    invoke-virtual {v0, v1}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->a:Z

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->q:Lcom/fimi/kernel/view/progress/ProgressView;

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/view/progress/ProgressView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->m:Lcom/fimi/soul/view/BreathLeapView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/BreathLeapView;->setAlpha(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->l:Lcom/fimi/soul/view/TranslationView;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/TranslationView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->l:Lcom/fimi/soul/view/TranslationView;

    invoke-virtual {v0}, Lcom/fimi/soul/view/TranslationView;->a()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0f015b

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginActivity;->i:Lcom/fimi/soul/module/login/UsbConnectFragment;

    invoke-virtual {v0, v1, v2}, Landroid/app/FragmentTransaction;->replace(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    const/4 v2, 0x4

    if-nez p1, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->a:Z

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->q:Lcom/fimi/kernel/view/progress/ProgressView;

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/progress/ProgressView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->m:Lcom/fimi/soul/view/BreathLeapView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->m:Lcom/fimi/soul/view/BreathLeapView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/BreathLeapView;->setAlpha(F)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->j:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->l:Lcom/fimi/soul/view/TranslationView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/TranslationView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->l:Lcom/fimi/soul/view/TranslationView;

    invoke-virtual {v0}, Lcom/fimi/soul/view/TranslationView;->a()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0f015b

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginActivity;->i:Lcom/fimi/soul/module/login/UsbConnectFragment;

    invoke-virtual {v0, v1, v2}, Landroid/app/FragmentTransaction;->replace(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    :cond_2
    invoke-super {p0, p1, p2, p3}, Lcom/fimi/soul/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    const v3, 0x7f0f015b

    const/16 v2, 0x80

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    invoke-super {p0, p1}, Lcom/fimi/soul/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f04002e

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LoginActivity;->setContentView(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->dpa:Lcom/fimi/soul/base/DroidPlannerApp;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/base/DroidPlannerApp;->b(Landroid/app/Activity;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fimi/soul/service/UsbStatus;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LoginActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    const v0, 0x7f0f015d

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->I:Landroid/widget/ImageView;

    const v0, 0x7f0f0108

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/TranslationView;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->l:Lcom/fimi/soul/view/TranslationView;

    new-instance v0, Lcom/fimi/soul/module/login/LoginFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/login/LoginFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->h:Lcom/fimi/soul/module/login/LoginFragment;

    new-instance v0, Lcom/fimi/soul/module/login/UsbConnectFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/login/UsbConnectFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->i:Lcom/fimi/soul/module/login/UsbConnectFragment;

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->d:Lcom/fimi/soul/biz/e/d;

    invoke-static {}, Lcom/fimi/soul/biz/e/c;->a()Lcom/fimi/soul/biz/e/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->e:Lcom/fimi/soul/biz/e/c;

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "islaunchexit"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_0
    invoke-static {p0}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->b:Lcom/fimi/kernel/utils/v;

    const-string v0, "is_setting_enter"

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->b:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1, v0, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->E:Z

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "login"

    invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    iput v4, p0, Lcom/fimi/soul/module/login/LoginActivity;->C:I

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->l:Lcom/fimi/soul/view/TranslationView;

    invoke-virtual {v0, v4}, Lcom/fimi/soul/view/TranslationView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->l:Lcom/fimi/soul/view/TranslationView;

    invoke-virtual {v0}, Lcom/fimi/soul/view/TranslationView;->a()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "isenterLoginFragment"

    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->i:Lcom/fimi/soul/module/login/UsbConnectFragment;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/login/UsbConnectFragment;->setArguments(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->i:Lcom/fimi/soul/module/login/UsbConnectFragment;

    invoke-virtual {v0, v3, v1}, Landroid/app/FragmentTransaction;->replace(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setFlags(II)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->I:Landroid/widget/ImageView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    :goto_0
    new-array v0, v6, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->s:Landroid/animation/ValueAnimator;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->s:Landroid/animation/ValueAnimator;

    const-wide/32 v2, 0x88b8

    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->s:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/fimi/soul/module/login/LoginActivity$2;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/login/LoginActivity$2;-><init>(Lcom/fimi/soul/module/login/LoginActivity;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v0, v6, [F

    fill-array-data v0, :array_1

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->J:Landroid/animation/ValueAnimator;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->J:Landroid/animation/ValueAnimator;

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->J:Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/fimi/soul/module/login/LoginActivity$3;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/login/LoginActivity$3;-><init>(Lcom/fimi/soul/module/login/LoginActivity;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "exit"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    const v0, 0x7f0f00f1

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/progress/ProgressView;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->q:Lcom/fimi/kernel/view/progress/ProgressView;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->q:Lcom/fimi/kernel/view/progress/ProgressView;

    const/high16 v1, 0x43480000    # 200.0f

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/progress/ProgressView;->setMaxCount(F)V

    const v0, 0x7f0f015f

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->t:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-array v1, v5, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginActivity;->t:Landroid/widget/TextView;

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->O:Landroid/os/Handler;

    new-instance v1, Lcom/fimi/soul/module/login/LoginActivity$4;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/login/LoginActivity$4;-><init>(Lcom/fimi/soul/module/login/LoginActivity;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "sp_upgrade_skip"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->L:I

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "launchBundle"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/fimi/soul/module/push/MessageDetailActivity;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "redirectURL"

    const-string v3, "redirectURL"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/login/LoginActivity;->startActivity(Landroid/content/Intent;)V

    :cond_1
    return-void

    :cond_2
    const v0, 0x7f0f015c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    const v0, 0x7f0f0476

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->j:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->j:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iput v6, p0, Lcom/fimi/soul/module/login/LoginActivity;->C:I

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->h:Lcom/fimi/soul/module/login/LoginFragment;

    invoke-virtual {v0, v3, v1}, Landroid/app/FragmentTransaction;->replace(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->I:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    goto/16 :goto_0

    nop

    :array_0
    .array-data 4
        0x0
        0x43480000    # 200.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method protected onDestroy()V
    .locals 2

    const/4 v1, 0x0

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onDestroy()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->F:Z

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->l:Lcom/fimi/soul/view/TranslationView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->m:Lcom/fimi/soul/view/BreathLeapView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->l:Lcom/fimi/soul/view/TranslationView;

    invoke-virtual {v0}, Lcom/fimi/soul/view/TranslationView;->c()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->m:Lcom/fimi/soul/view/BreathLeapView;

    invoke-virtual {v0}, Lcom/fimi/soul/view/BreathLeapView;->a()V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->b(Lcom/fimi/soul/drone/d$b;)V

    invoke-direct {p0}, Lcom/fimi/soul/module/login/LoginActivity;->f()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->O:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->O:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    :cond_1
    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 2

    sget-object v0, Lcom/fimi/soul/module/login/LoginActivity$9;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 7

    const v6, 0x7f0f015b

    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v3, 0x4

    const/4 v0, 0x0

    if-ne p1, v3, :cond_0

    iget v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->C:I

    packed-switch v1, :pswitch_data_0

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/fimi/soul/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    :goto_0
    return v0

    :pswitch_0
    iget-boolean v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->E:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->finish()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/fimi/soul/module/login/LoginActivity;->j()V

    goto :goto_0

    :pswitch_1
    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->J:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->J:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_2
    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->s:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->s:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_3
    iput v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->C:I

    iput-boolean v5, p0, Lcom/fimi/soul/module/login/LoginActivity;->a:Z

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->O:Landroid/os/Handler;

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginActivity;->Q:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->O:Landroid/os/Handler;

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginActivity;->R:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->q:Lcom/fimi/kernel/view/progress/ProgressView;

    invoke-virtual {v1, v3}, Lcom/fimi/kernel/view/progress/ProgressView;->setVisibility(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->m:Lcom/fimi/soul/view/BreathLeapView;

    invoke-virtual {v1, v4}, Lcom/fimi/soul/view/BreathLeapView;->setAlpha(F)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginActivity;->i:Lcom/fimi/soul/module/login/UsbConnectFragment;

    invoke-virtual {v1, v6, v2}, Landroid/app/FragmentTransaction;->replace(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/FragmentTransaction;->commit()I

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->l:Lcom/fimi/soul/view/TranslationView;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/TranslationView;->setVisibility(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->l:Lcom/fimi/soul/view/TranslationView;

    invoke-virtual {v1}, Lcom/fimi/soul/view/TranslationView;->b()V

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->l:Lcom/fimi/soul/view/TranslationView;

    invoke-virtual {v1}, Lcom/fimi/soul/view/TranslationView;->a()V

    goto :goto_0

    :pswitch_2
    iget-boolean v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->E:Z

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->finish()V

    goto :goto_0

    :cond_4
    invoke-direct {p0}, Lcom/fimi/soul/module/login/LoginActivity;->j()V

    goto :goto_0

    :pswitch_3
    iput v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->C:I

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginActivity;->g:Lcom/fimi/soul/module/update/UpdateConnectDefeaFrgment;

    invoke-virtual {v1, v2}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/FragmentTransaction;->commit()I

    iput-boolean v5, p0, Lcom/fimi/soul/module/login/LoginActivity;->a:Z

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->q:Lcom/fimi/kernel/view/progress/ProgressView;

    invoke-virtual {v1, v3}, Lcom/fimi/kernel/view/progress/ProgressView;->setVisibility(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->m:Lcom/fimi/soul/view/BreathLeapView;

    invoke-virtual {v1, v4}, Lcom/fimi/soul/view/BreathLeapView;->setAlpha(F)V

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->l:Lcom/fimi/soul/view/TranslationView;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/TranslationView;->setVisibility(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->l:Lcom/fimi/soul/view/TranslationView;

    invoke-virtual {v1}, Lcom/fimi/soul/view/TranslationView;->a()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginActivity;->i:Lcom/fimi/soul/module/login/UsbConnectFragment;

    invoke-virtual {v1, v6, v2}, Landroid/app/FragmentTransaction;->replace(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/FragmentTransaction;->commit()I

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method protected onResume()V
    .locals 2

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onResume()V

    iget v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->L:I

    const/16 v1, 0x14

    if-ne v0, v1, :cond_0

    const v0, 0x7f0a030b

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0a0344

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/login/LoginActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/login/LoginActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected onStart()V
    .locals 2

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onStart()V

    invoke-static {}, Lcom/fimi/soul/biz/i/a;->b()Lcom/fimi/soul/biz/i/a;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->f:Lcom/fimi/soul/biz/i/a;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->F:Z

    iget v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->C:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->O:Landroid/os/Handler;

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->Q:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method protected onStop()V
    .locals 2

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onStop()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->F:Z

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->O:Landroid/os/Handler;

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->Q:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->O:Landroid/os/Handler;

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity;->P:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->K:Lcom/fimi/soul/biz/update/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->K:Lcom/fimi/soul/biz/update/b;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/update/b;->b()Lcom/fimi/soul/biz/update/b$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity;->K:Lcom/fimi/soul/biz/update/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/update/b;->a(Lcom/fimi/soul/biz/update/b$b;)V

    :cond_0
    return-void
.end method
