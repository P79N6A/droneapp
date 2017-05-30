.class public Lcom/fimi/soul/module/login/UsbConnectFragment;
.super Landroid/app/Fragment;

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/login/UsbConnectFragment$a;
    }
.end annotation


# instance fields
.field a:Landroid/net/wifi/WifiManager;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/RelativeLayout;

.field private e:Landroid/widget/RelativeLayout;

.field private f:Landroid/widget/RelativeLayout;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Landroid/widget/RelativeLayout;

.field private i:Landroid/content/Context;

.field private j:Landroid/widget/Button;

.field private k:Landroid/widget/Button;

.field private l:Landroid/widget/Button;

.field private m:Lcom/fimi/soul/module/login/UsbConnectFragment$a;

.field private n:Landroid/os/Handler;

.field private o:Lcom/fimi/soul/drone/a;

.field private p:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    const/16 v0, 0x64

    iput v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->p:I

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/login/UsbConnectFragment;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method private a()V
    .locals 3

    new-instance v0, Lcom/fimi/soul/view/a$b;

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/UsbConnectFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fimi/soul/view/a$b;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0a0205

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/login/UsbConnectFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/login/UsbConnectFragment$7;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/login/UsbConnectFragment$7;-><init>(Lcom/fimi/soul/module/login/UsbConnectFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/a$b;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/a$b;

    invoke-virtual {v0}, Lcom/fimi/soul/view/a$b;->a()Lcom/fimi/soul/view/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/a;->show()V

    return-void
.end method

.method private a(Landroid/view/View;)V
    .locals 9

    const v0, 0x7f0f0329

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0f032c

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f0f0330

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0f0334

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f0f032d

    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f0f0331

    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iget-object v6, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->i:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v6

    const/16 v7, 0x9

    new-array v7, v7, [Landroid/view/View;

    const/4 v8, 0x0

    aput-object v0, v7, v8

    const/4 v0, 0x1

    aput-object v1, v7, v0

    const/4 v0, 0x2

    aput-object v2, v7, v0

    const/4 v0, 0x3

    aput-object v3, v7, v0

    const/4 v0, 0x4

    aput-object v4, v7, v0

    const/4 v0, 0x5

    aput-object v5, v7, v0

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->j:Landroid/widget/Button;

    aput-object v1, v7, v0

    const/4 v0, 0x7

    iget-object v1, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->k:Landroid/widget/Button;

    aput-object v1, v7, v0

    const/16 v0, 0x8

    iget-object v1, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->b:Landroid/widget/TextView;

    aput-object v1, v7, v0

    invoke-static {v6, v7}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/module/login/UsbConnectFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->d:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private b()V
    .locals 8

    const/4 v7, 0x2

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->b:Landroid/widget/TextView;

    const-string v1, "translationX"

    new-array v2, v7, [F

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->d:Landroid/widget/RelativeLayout;

    const-string v2, "translationX"

    new-array v3, v7, [F

    fill-array-data v3, :array_1

    invoke-static {v1, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->e:Landroid/widget/RelativeLayout;

    const-string v3, "translationX"

    new-array v4, v7, [F

    fill-array-data v4, :array_2

    invoke-static {v2, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    iget-object v3, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->f:Landroid/widget/RelativeLayout;

    const-string v4, "translationX"

    new-array v5, v7, [F

    fill-array-data v5, :array_3

    invoke-static {v3, v4, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    iget-object v4, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->g:Landroid/widget/RelativeLayout;

    const-string v5, "translationX"

    new-array v6, v7, [F

    fill-array-data v6, :array_4

    invoke-static {v4, v5, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    iget-object v5, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->h:Landroid/widget/RelativeLayout;

    const-string v6, "translationX"

    new-array v7, v7, [F

    fill-array-data v7, :array_5

    invoke-static {v5, v6, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    new-instance v6, Landroid/animation/AnimatorSet;

    invoke-direct {v6}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-virtual {v6, v5}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    const-wide/16 v0, 0x1f4

    invoke-virtual {v6, v0, v1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    invoke-virtual {v6}, Landroid/animation/AnimatorSet;->start()V

    return-void

    :array_0
    .array-data 4
        0x0
        0x447a0000    # 1000.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x447a0000    # 1000.0f
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x447a0000    # 1000.0f
    .end array-data

    :array_3
    .array-data 4
        0x0
        0x447a0000    # 1000.0f
    .end array-data

    :array_4
    .array-data 4
        0x0
        0x447a0000    # 1000.0f
    .end array-data

    :array_5
    .array-data 4
        0x0
        0x447a0000    # 1000.0f
    .end array-data
.end method

.method private b(Landroid/view/View;)V
    .locals 14

    const v8, 0x7f0f0335

    const-wide/16 v12, 0xfa

    const/4 v7, 0x2

    const/4 v10, 0x0

    invoke-virtual {p1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->j:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->j:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f0182

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->k:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->k:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f010b

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->d:Landroid/widget/RelativeLayout;

    const v0, 0x7f0f032a

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->e:Landroid/widget/RelativeLayout;

    const v0, 0x7f0f032e

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->f:Landroid/widget/RelativeLayout;

    const v0, 0x7f0f0332

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->g:Landroid/widget/RelativeLayout;

    const v0, 0x7f0f010e

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->h:Landroid/widget/RelativeLayout;

    const v0, 0x7f0f0327

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->b:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->b:Landroid/widget/TextView;

    const-string v1, "translationX"

    new-array v2, v7, [F

    fill-array-data v2, :array_0

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->d:Landroid/widget/RelativeLayout;

    const-string v2, "translationX"

    new-array v3, v7, [F

    fill-array-data v3, :array_1

    invoke-static {v0, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->e:Landroid/widget/RelativeLayout;

    const-string v3, "translationX"

    new-array v4, v7, [F

    fill-array-data v4, :array_2

    invoke-static {v0, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->f:Landroid/widget/RelativeLayout;

    const-string v4, "translationX"

    new-array v5, v7, [F

    fill-array-data v5, :array_3

    invoke-static {v0, v4, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->g:Landroid/widget/RelativeLayout;

    const-string v5, "translationX"

    new-array v6, v7, [F

    fill-array-data v6, :array_4

    invoke-static {v0, v5, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->h:Landroid/widget/RelativeLayout;

    const-string v6, "translationX"

    new-array v7, v7, [F

    fill-array-data v7, :array_5

    invoke-static {v0, v6, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v6

    invoke-virtual {p1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->l:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->l:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const-wide/16 v8, 0x0

    invoke-virtual {v1, v8, v9}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    const-wide/16 v8, 0x46

    invoke-virtual {v2, v8, v9}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    const-wide/16 v8, 0x8c

    invoke-virtual {v3, v8, v9}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    const-wide/16 v8, 0xd2

    invoke-virtual {v4, v8, v9}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    const-wide/16 v8, 0x118

    invoke-virtual {v5, v8, v9}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    const-wide/16 v8, 0x15e

    invoke-virtual {v6, v8, v9}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    invoke-virtual {v1, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v2, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v3, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v4, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v5, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v6, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    new-instance v0, Lcom/fimi/soul/module/login/UsbConnectFragment$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/login/UsbConnectFragment$1;-><init>(Lcom/fimi/soul/module/login/UsbConnectFragment;)V

    invoke-virtual {v1, v0}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v0, Lcom/fimi/soul/module/login/UsbConnectFragment$2;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/login/UsbConnectFragment$2;-><init>(Lcom/fimi/soul/module/login/UsbConnectFragment;)V

    invoke-virtual {v2, v0}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v0, Lcom/fimi/soul/module/login/UsbConnectFragment$3;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/login/UsbConnectFragment$3;-><init>(Lcom/fimi/soul/module/login/UsbConnectFragment;)V

    invoke-virtual {v3, v0}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v0, Lcom/fimi/soul/module/login/UsbConnectFragment$4;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/login/UsbConnectFragment$4;-><init>(Lcom/fimi/soul/module/login/UsbConnectFragment;)V

    invoke-virtual {v4, v0}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v0, Lcom/fimi/soul/module/login/UsbConnectFragment$5;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/login/UsbConnectFragment$5;-><init>(Lcom/fimi/soul/module/login/UsbConnectFragment;)V

    invoke-virtual {v5, v0}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v0, Lcom/fimi/soul/module/login/UsbConnectFragment$6;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/login/UsbConnectFragment$6;-><init>(Lcom/fimi/soul/module/login/UsbConnectFragment;)V

    invoke-virtual {v6, v0}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/UsbConnectFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/UsbConnectFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v7, "isEnterLoginFragment"

    invoke-virtual {v0, v7, v10}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Landroid/animation/ObjectAnimator;->start()V

    invoke-virtual {v2}, Landroid/animation/ObjectAnimator;->start()V

    invoke-virtual {v3}, Landroid/animation/ObjectAnimator;->start()V

    invoke-virtual {v4}, Landroid/animation/ObjectAnimator;->start()V

    invoke-virtual {v5}, Landroid/animation/ObjectAnimator;->start()V

    invoke-virtual {v6}, Landroid/animation/ObjectAnimator;->start()V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v10}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v10}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->f:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v10}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v10}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v10}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    nop

    :array_0
    .array-data 4
        0x44480000    # 800.0f
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x44480000    # 800.0f
        0x0
    .end array-data

    :array_2
    .array-data 4
        0x44480000    # 800.0f
        0x0
    .end array-data

    :array_3
    .array-data 4
        0x44480000    # 800.0f
        0x0
    .end array-data

    :array_4
    .array-data 4
        0x44480000    # 800.0f
        0x0
    .end array-data

    :array_5
    .array-data 4
        0x44480000    # 800.0f
        0x0
    .end array-data
.end method

.method static synthetic c(Lcom/fimi/soul/module/login/UsbConnectFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->e:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic d(Lcom/fimi/soul/module/login/UsbConnectFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->f:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic e(Lcom/fimi/soul/module/login/UsbConnectFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->g:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic f(Lcom/fimi/soul/module/login/UsbConnectFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->h:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic g(Lcom/fimi/soul/module/login/UsbConnectFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/login/UsbConnectFragment;->b()V

    return-void
.end method

.method static synthetic h(Lcom/fimi/soul/module/login/UsbConnectFragment;)Lcom/fimi/soul/module/login/UsbConnectFragment$a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->m:Lcom/fimi/soul/module/login/UsbConnectFragment$a;

    return-object v0
.end method

.method static synthetic i(Lcom/fimi/soul/module/login/UsbConnectFragment;)Lcom/fimi/soul/drone/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->o:Lcom/fimi/soul/drone/a;

    return-object v0
.end method

.method static synthetic j(Lcom/fimi/soul/module/login/UsbConnectFragment;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->n:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic k(Lcom/fimi/soul/module/login/UsbConnectFragment;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->p:I

    return v0
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/module/login/UsbConnectFragment;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->m:Lcom/fimi/soul/module/login/UsbConnectFragment$a;

    invoke-interface {v0}, Lcom/fimi/soul/module/login/UsbConnectFragment$a;->b()V

    const/4 v0, 0x0

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    const-wide/16 v2, 0x12c

    invoke-super {p0, p1, p2, p3}, Landroid/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    if-nez p1, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->i:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->i(Landroid/content/Context;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->n:Landroid/os/Handler;

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->n:Landroid/os/Handler;

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    :cond_2
    iget v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->p:I

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/UsbConnectFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/UsbConnectFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0a0130

    const/16 v2, 0xbb8

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->n:Landroid/os/Handler;

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Fragment;->onAttach(Landroid/app/Activity;)V

    iput-object p1, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->i:Landroid/content/Context;

    check-cast p1, Lcom/fimi/soul/module/login/UsbConnectFragment$a;

    iput-object p1, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->m:Lcom/fimi/soul/module/login/UsbConnectFragment$a;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :cond_0
    :goto_0
    return-void

    :sswitch_0
    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->o:Lcom/fimi/soul/drone/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->o:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->o:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->n:Landroid/os/Handler;

    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/fimi/soul/module/login/UsbConnectFragment;->a()V

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->m:Lcom/fimi/soul/module/login/UsbConnectFragment$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->m:Lcom/fimi/soul/module/login/UsbConnectFragment$a;

    invoke-interface {v0}, Lcom/fimi/soul/module/login/UsbConnectFragment$a;->c()V

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x7f0f0182 -> :sswitch_1
        0x7f0f0335 -> :sswitch_0
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/UsbConnectFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    iput-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->a:Landroid/net/wifi/WifiManager;

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/UsbConnectFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/base/DroidPlannerApp;

    iget-object v0, v0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    iput-object v0, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->o:Lcom/fimi/soul/drone/a;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const v0, 0x7f04007d

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/login/UsbConnectFragment;->b(Landroid/view/View;)V

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/login/UsbConnectFragment;->a(Landroid/view/View;)V

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v1, p0, Lcom/fimi/soul/module/login/UsbConnectFragment;->n:Landroid/os/Handler;

    return-object v0
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    return-void
.end method
