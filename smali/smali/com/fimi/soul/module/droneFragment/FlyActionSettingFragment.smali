.class public Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;
.super Landroid/support/v4/app/Fragment;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/fimi/soul/drone/d$b;


# instance fields
.field private a:Landroid/widget/Button;

.field private b:Landroid/widget/Button;

.field private c:Landroid/widget/TextView;

.field private d:Lcom/fimi/soul/drone/a;

.field private e:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

.field private f:Lcom/fimi/soul/biz/c/h;

.field private g:Lcom/fimi/kernel/utils/v;

.field private h:Lcom/fimi/soul/module/droneFragment/f;

.field private i:Lcom/fimi/soul/module/droneFragment/h;

.field private j:Landroid/widget/ImageButton;

.field private k:Z

.field private l:Lcom/fimi/soul/module/droneFragment/a;

.field private m:Landroid/view/View;

.field private n:Landroid/app/Dialog;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;)Lcom/fimi/soul/biz/c/h;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->f:Lcom/fimi/soul/biz/c/h;

    return-object v0
.end method

.method private a(Landroid/view/View;)V
    .locals 5

    const/4 v4, 0x0

    const v0, 0x7f0f02b6

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->j:Landroid/widget/ImageButton;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f02a0

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->e:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v0, 0x7f0f0265

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->a:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->a:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f0266

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->b:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->b:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f009c

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->a:Landroid/widget/Button;

    aput-object v2, v1, v4

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->b:Landroid/widget/Button;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->c:Landroid/widget/TextView;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-array v1, v4, [Landroid/view/View;

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ao;->b(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->n:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->n:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->n:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->n:Landroid/app/Dialog;

    :cond_0
    new-instance v0, Lcom/fimi/soul/view/e$a;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fimi/soul/view/e$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lcom/fimi/soul/view/e$a;->a(Ljava/lang/String;)Lcom/fimi/soul/view/e$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/e$a;->a(Z)Lcom/fimi/soul/view/e$a;

    const v1, 0x7f0a01cb

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment$1;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment$1;-><init>(Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/e$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/e$a;

    invoke-virtual {v0}, Lcom/fimi/soul/view/e$a;->a()Lcom/fimi/soul/view/e;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->n:Landroid/app/Dialog;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->n:Landroid/app/Dialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->n:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;)Lcom/fimi/soul/module/droneFragment/f;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->h:Lcom/fimi/soul/module/droneFragment/f;

    return-object v0
.end method

.method private b(Landroid/view/View;)Z
    .locals 3

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v2

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    sub-int v0, v2, v0

    int-to-float v0, v0

    const/high16 v2, 0x42c80000    # 100.0f

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bq:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bS:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    return-void
.end method

.method private d()V
    .locals 5

    const/16 v4, 0x7d0

    const/16 v3, 0x8

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->f:Lcom/fimi/soul/biz/c/h;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/h;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->c:Landroid/widget/TextView;

    const v1, 0x7f0a0391

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->l:Lcom/fimi/soul/module/droneFragment/a;

    const v1, 0x7f0a014d

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/a;->c(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->h:Lcom/fimi/soul/module/droneFragment/f;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/f;->e()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->g:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "REMEBERACTIONTIP"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x7f0a01d6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->a(Ljava/lang/String;)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->u()Lcom/fimi/soul/drone/h/ag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ag;->f()D

    move-result-wide v0

    const-wide v2, 0x4124aac000000000L    # 677216.0

    sub-double/2addr v0, v2

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    div-double/2addr v0, v2

    double-to-int v0, v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->l:Lcom/fimi/soul/module/droneFragment/a;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/droneFragment/a;->a(I)V

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/fimi/soul/biz/c/d;->a(I)V

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->m()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bj:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->l:Lcom/fimi/soul/module/droneFragment/a;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/a;->b()V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a031c

    invoke-static {v0, v1, v4}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->f:Lcom/fimi/soul/biz/c/h;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/h;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->c:Landroid/widget/TextView;

    const v1, 0x7f0a0390

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->l:Lcom/fimi/soul/module/droneFragment/a;

    const v1, 0x7f0a014a

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/a;->c(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->h:Lcom/fimi/soul/module/droneFragment/f;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/f;->e()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->g:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "REMEBERACTIONTIPFlYTO"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    const v0, 0x7f0a01d4

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a031b

    invoke-static {v0, v1, v4}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->f:Lcom/fimi/soul/biz/c/h;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/h;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->c:Landroid/widget/TextView;

    const v1, 0x7f0a037b

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->g:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "REMEBERACTIONTIPPOI"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_5

    const v0, 0x7f0a01d5

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->h:Lcom/fimi/soul/module/droneFragment/f;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/f;->a()V

    goto/16 :goto_0
.end method

.method private e()V
    .locals 2

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->b:Landroid/widget/Button;

    const v1, 0x7f0201b7

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->b:Landroid/widget/Button;

    const v1, 0x7f0201b6

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    goto :goto_0
.end method

.method private f()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->b:Landroid/widget/Button;

    const v1, 0x7f0201b6

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->h:Lcom/fimi/soul/module/droneFragment/f;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/f;->d()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->h:Lcom/fimi/soul/module/droneFragment/f;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/f;->e()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->i:Lcom/fimi/soul/module/droneFragment/h;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/h;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->j:Landroid/widget/ImageButton;

    const v1, 0x7f0203fc

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    iput-boolean v2, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->k:Z

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->m()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/c/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/c/h;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/fimi/soul/biz/c/h;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bi:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->n:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->n:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->m:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->b(Landroid/view/View;)Z

    move-result v0

    goto :goto_0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/base/DroidPlannerApp;

    iget-object v0, v0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    const/4 v1, 0x1

    const/16 v2, 0xbb8

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :cond_0
    :goto_0
    return-void

    :sswitch_0
    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->k:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->W()Z

    move-result v0

    if-eqz v0, :cond_1

    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->k:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->i:Lcom/fimi/soul/module/droneFragment/h;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/h;->a()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->j:Landroid/widget/ImageButton;

    const v1, 0x7f0203fd

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v1, 0x7f0a0160

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->k:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->i:Lcom/fimi/soul/module/droneFragment/h;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/h;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->j:Landroid/widget/ImageButton;

    const v1, 0x7f0203fc

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_0

    :sswitch_1
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->a()V

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a022e

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isEnforcementAtti()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a022d

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->f:Lcom/fimi/soul/biz/c/h;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/h;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->r:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->f:Lcom/fimi/soul/biz/c/h;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/h;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->u:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :cond_6
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->f:Lcom/fimi/soul/biz/c/h;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/h;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->w:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x7f0f0265 -> :sswitch_1
        0x7f0f0266 -> :sswitch_2
        0x7f0f02b6 -> :sswitch_0
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/biz/c/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/c/h;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->f:Lcom/fimi/soul/biz/c/h;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->g:Lcom/fimi/kernel/utils/v;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const v0, 0x7f040067

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->m:Landroid/view/View;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/f;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    invoke-direct {v1, v0, v2}, Lcom/fimi/soul/module/droneFragment/f;-><init>(Landroid/view/View;Lcom/fimi/soul/drone/a;)V

    iput-object v1, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->h:Lcom/fimi/soul/module/droneFragment/f;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/h;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    iget-object v2, v2, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-direct {v1, v0, v2}, Lcom/fimi/soul/module/droneFragment/h;-><init>(Landroid/view/View;Landroid/content/Context;)V

    iput-object v1, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->i:Lcom/fimi/soul/module/droneFragment/h;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/a;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    invoke-direct {v1, v2, v0}, Lcom/fimi/soul/module/droneFragment/a;-><init>(Lcom/fimi/soul/drone/a;Landroid/view/View;)V

    iput-object v1, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->l:Lcom/fimi/soul/module/droneFragment/a;

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->a(Landroid/view/View;)V

    return-object v0
.end method

.method public onDetach()V
    .locals 2

    const/4 v1, 0x0

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->h:Lcom/fimi/soul/module/droneFragment/f;

    if-eqz v0, :cond_0

    iput-object v1, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->h:Lcom/fimi/soul/module/droneFragment/f;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->i:Lcom/fimi/soul/module/droneFragment/h;

    if-eqz v0, :cond_1

    iput-object v1, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->i:Lcom/fimi/soul/module/droneFragment/h;

    :cond_1
    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 4

    const v3, 0x7f0203fc

    const/4 v2, 0x0

    sget-object v0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment$2;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->a()V

    goto :goto_0

    :pswitch_2
    iput-boolean v2, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->k:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->i:Lcom/fimi/soul/module/droneFragment/h;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/h;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->h:Lcom/fimi/soul/module/droneFragment/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->h:Lcom/fimi/soul/module/droneFragment/f;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/module/droneFragment/f;->a(Z)V

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->l:Lcom/fimi/soul/module/droneFragment/a;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/a;->a()V

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->j()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->l:Lcom/fimi/soul/module/droneFragment/a;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/module/droneFragment/a;->a(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->l:Lcom/fimi/soul/module/droneFragment/a;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getSpeek()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/droneFragment/a;->d(I)V

    :cond_1
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->e()V

    goto :goto_0

    :pswitch_5
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->e()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->l:Lcom/fimi/soul/module/droneFragment/a;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/a;->b()V

    goto :goto_0

    :pswitch_6
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->judgeNoAction()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d()V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->c()V

    goto :goto_0

    :pswitch_7
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->e()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->h:Lcom/fimi/soul/module/droneFragment/f;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/f;->g()V

    goto :goto_0

    :pswitch_8
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->h:Lcom/fimi/soul/module/droneFragment/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->h:Lcom/fimi/soul/module/droneFragment/f;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/f;->d()V

    goto :goto_0

    :pswitch_9
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->h:Lcom/fimi/soul/module/droneFragment/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->h:Lcom/fimi/soul/module/droneFragment/f;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/f;->d()V

    goto/16 :goto_0

    :pswitch_a
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->i:Lcom/fimi/soul/module/droneFragment/h;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/h;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->h:Lcom/fimi/soul/module/droneFragment/f;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/f;->j()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setImageResource(I)V

    iput-boolean v2, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->k:Z

    goto/16 :goto_0

    :pswitch_b
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->e()V

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
    .end packed-switch
.end method

.method public onHiddenChanged(Z)V
    .locals 2

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onHiddenChanged(Z)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->f()V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d()V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->c()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->n:Landroid/app/Dialog;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->n:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->k:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->i:Lcom/fimi/soul/module/droneFragment/h;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->i:Lcom/fimi/soul/module/droneFragment/h;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/h;->b()V

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->j:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->j:Landroid/widget/ImageButton;

    const v1, 0x7f0203fc

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    goto :goto_0
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/FlyActionSettingFragment;->d:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->b(Lcom/fimi/soul/drone/d$b;)V

    return-void
.end method
