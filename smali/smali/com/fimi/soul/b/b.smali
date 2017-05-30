.class public Lcom/fimi/soul/b/b;
.super Landroid/widget/BaseAdapter;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lcom/fimi/soul/biz/camera/b/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/b/b$a;,
        Lcom/fimi/soul/b/b$c;,
        Lcom/fimi/soul/b/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/BaseAdapter;",
        "Landroid/widget/AdapterView$OnItemClickListener;",
        "Lcom/fimi/soul/biz/camera/b/e",
        "<",
        "Lcom/fimi/soul/biz/camera/entity/X11RespCmd;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:F = 0.064f


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/fimi/soul/biz/camera/d;

.field private d:I

.field private e:I

.field private f:I

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Lcom/fimi/soul/biz/camera/entity/X11DeviceInfo;

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Lcom/fimi/soul/drone/a;

.field private o:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/fimi/soul/drone/a;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    iput-boolean v1, p0, Lcom/fimi/soul/b/b;->g:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    iput-boolean v1, p0, Lcom/fimi/soul/b/b;->l:Z

    iput-boolean v1, p0, Lcom/fimi/soul/b/b;->m:Z

    iput-object p2, p0, Lcom/fimi/soul/b/b;->n:Lcom/fimi/soul/drone/a;

    iput-object p1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-static {}, Lcom/fimi/soul/biz/camera/b;->a()Lcom/fimi/soul/biz/camera/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/b;->d()Lcom/fimi/soul/biz/camera/b/a;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/biz/camera/d;

    iput-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->i()Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;->getX11DeviceInfo()Lcom/fimi/soul/biz/camera/entity/X11DeviceInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/b/b;->j:Lcom/fimi/soul/biz/camera/entity/X11DeviceInfo;

    invoke-static {}, Lcom/fimi/soul/biz/camera/b;->a()Lcom/fimi/soul/biz/camera/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/b;->c()Z

    move-result v0

    iput-boolean v0, p0, Lcom/fimi/soul/b/b;->g:Z

    invoke-static {p1}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/b/b;->o:Landroid/content/SharedPreferences;

    invoke-virtual {p0}, Lcom/fimi/soul/b/b;->a()V

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->c()V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/b/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    return-object p1
.end method

.method private a(Lcom/fimi/soul/b/b$a;)V
    .locals 3

    const/4 v2, 0x0

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->e:Lcom/fimi/kernel/view/button/SwitchButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    :goto_0
    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->e:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    const v1, 0x7f0a0453

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->e:Lcom/fimi/kernel/view/button/SwitchButton;

    new-instance v1, Lcom/fimi/soul/b/b$1;

    invoke-direct {v1, p0}, Lcom/fimi/soul/b/b$1;-><init>(Lcom/fimi/soul/b/b;)V

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/button/SwitchButton;->setOnSwitchListener(Lcom/fimi/kernel/view/button/SwitchButton$a;)V

    return-void

    :cond_0
    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->e:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v2, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    goto :goto_0
.end method

.method private a(Lcom/fimi/soul/b/b$a;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 4

    const/16 v3, 0x8

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->e:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/view/button/SwitchButton;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->d:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e0163

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setAlpha(F)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->e:Lcom/fimi/kernel/view/button/SwitchButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/button/SwitchButton;->setOnSwitchListener(Lcom/fimi/kernel/view/button/SwitchButton$a;)V

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900f5

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;)V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->d:Landroid/widget/RelativeLayout;

    const v1, 0x7f0e00c3

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/fimi/soul/b/b$a;->a(Z)V

    return-void
.end method

.method private a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;Z)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p3, :cond_0

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e00ee

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    invoke-virtual {p1, v3}, Lcom/fimi/soul/b/b$a;->a(Z)V

    return-void

    :cond_0
    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e0164

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->c:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/fimi/soul/b/b;)Z
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->d()Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/fimi/soul/b/b;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/b/b;->l:Z

    return p1
.end method

.method static synthetic b(Lcom/fimi/soul/b/b;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lcom/fimi/soul/b/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/b/b;->h:Ljava/lang/String;

    return-object p1
.end method

.method private b(Lcom/fimi/soul/b/b$a;)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/b/b;->o:Landroid/content/SharedPreferences;

    const-string v1, "Show_9_Grid"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/fimi/soul/b/b;->m:Z

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->m:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->e:Lcom/fimi/kernel/view/button/SwitchButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    :goto_0
    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->e:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    const v1, 0x7f0a0211

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->e:Lcom/fimi/kernel/view/button/SwitchButton;

    new-instance v1, Lcom/fimi/soul/b/b$2;

    invoke-direct {v1, p0}, Lcom/fimi/soul/b/b$2;-><init>(Lcom/fimi/soul/b/b;)V

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/button/SwitchButton;->setOnSwitchListener(Lcom/fimi/kernel/view/button/SwitchButton$a;)V

    return-void

    :cond_0
    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->e:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v2, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    goto :goto_0
.end method

.method private b(Lcom/fimi/soul/b/b$a;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    iget v0, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    mul-int/lit8 v0, v0, 0x0

    iput v0, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->d:Landroid/widget/RelativeLayout;

    const v1, 0x7f0e00c3

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    return-void
.end method

.method private b(Lcom/fimi/soul/b/b$a;Ljava/lang/String;Z)V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->e:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/button/SwitchButton;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p1, Lcom/fimi/soul/b/b$a;->e:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, p3}, Lcom/fimi/kernel/view/button/SwitchButton;->setSwitchState(Z)V

    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/b/b;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/b/b;->m:Z

    return p1
.end method

.method private c()V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->i()Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;->getVideoResolution()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->i()Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;->getPhotoSize()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v2}, Lcom/fimi/soul/biz/camera/d;->i()Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;->getImage_format()Ljava/lang/String;

    move-result-object v2

    if-nez v1, :cond_0

    :goto_0
    return-void

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    :cond_2
    iget-boolean v3, p0, Lcom/fimi/soul/b/b;->k:Z

    if-eqz v3, :cond_9

    const-string v2, "1920x1080 30P 16:9"

    invoke-virtual {v2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v2, Lcom/fimi/soul/b/b$b;->c:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v2}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v2

    iput v2, p0, Lcom/fimi/soul/b/b;->e:I

    :cond_3
    const-string v2, "1920x1080 60P 16:9"

    invoke-virtual {v2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Lcom/fimi/soul/b/b$b;->b:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v2}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v2

    iput v2, p0, Lcom/fimi/soul/b/b;->e:I

    :cond_4
    const-string v2, "1280x720 120P 16:9"

    invoke-virtual {v2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lcom/fimi/soul/b/b$b;->d:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    iput v1, p0, Lcom/fimi/soul/b/b;->e:I

    :cond_5
    if-eqz v0, :cond_8

    const-string v1, "12M (4608x2592 16:9)"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v1, Lcom/fimi/soul/b/b$b;->i:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    iput v1, p0, Lcom/fimi/soul/b/b;->d:I

    :cond_6
    const-string v1, "16M (4608x3456 4:3)"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v1, Lcom/fimi/soul/b/b$b;->h:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    iput v1, p0, Lcom/fimi/soul/b/b;->d:I

    :cond_7
    const-string v1, "8M (3264x2448 4:3)"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Lcom/fimi/soul/b/b$b;->j:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v0

    iput v0, p0, Lcom/fimi/soul/b/b;->d:I

    :cond_8
    :goto_1
    const-string v0, "video_only"

    iget-object v1, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/d;->i()Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;->getVideoMode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/b/b;->l:Z

    goto/16 :goto_0

    :cond_9
    const-string v3, "3840x2160 30P 16:9"

    invoke-virtual {v3, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_a

    sget-object v3, Lcom/fimi/soul/b/b$c;->b:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v3}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v3

    iput v3, p0, Lcom/fimi/soul/b/b;->e:I

    :cond_a
    const-string v3, "2560x1440 60P 16:9"

    invoke-virtual {v3, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_b

    sget-object v3, Lcom/fimi/soul/b/b$c;->c:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v3}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v3

    iput v3, p0, Lcom/fimi/soul/b/b;->e:I

    :cond_b
    const-string v3, "1920x1080 30P 16:9"

    invoke-virtual {v3, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_c

    sget-object v3, Lcom/fimi/soul/b/b$c;->f:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v3}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v3

    iput v3, p0, Lcom/fimi/soul/b/b;->e:I

    :cond_c
    const-string v3, "1920x1080 60P 16:9"

    invoke-virtual {v3, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_d

    sget-object v3, Lcom/fimi/soul/b/b$c;->e:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v3}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v3

    iput v3, p0, Lcom/fimi/soul/b/b;->e:I

    :cond_d
    const-string v3, "1920x1080 100P 16:9"

    invoke-virtual {v3, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_e

    sget-object v1, Lcom/fimi/soul/b/b$c;->d:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    iput v1, p0, Lcom/fimi/soul/b/b;->e:I

    :cond_e
    if-eqz v0, :cond_10

    const-string v1, "12M (4000x3000 4:3)"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_f

    sget-object v1, Lcom/fimi/soul/b/b$c;->h:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    iput v1, p0, Lcom/fimi/soul/b/b;->d:I

    :cond_f
    const-string v1, "8M (3840x2160 16:9)"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_10

    sget-object v0, Lcom/fimi/soul/b/b$c;->i:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v0

    iput v0, p0, Lcom/fimi/soul/b/b;->d:I

    :cond_10
    if-eqz v2, :cond_8

    const-string v0, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "JPG"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    sget-object v0, Lcom/fimi/soul/b/b$c;->k:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v0

    iput v0, p0, Lcom/fimi/soul/b/b;->f:I

    :cond_11
    const-string v0, "JPG+DNG"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Lcom/fimi/soul/b/b$c;->l:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v0

    iput v0, p0, Lcom/fimi/soul/b/b;->f:I

    goto/16 :goto_1

    :cond_12
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/b/b;->l:Z

    goto/16 :goto_0
.end method

.method static synthetic c(Lcom/fimi/soul/b/b;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->l:Z

    return v0
.end method

.method private d()Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic d(Lcom/fimi/soul/b/b;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    return v0
.end method

.method static synthetic e(Lcom/fimi/soul/b/b;)Lcom/fimi/soul/biz/camera/d;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    return-object v0
.end method

.method static synthetic f(Lcom/fimi/soul/b/b;)Landroid/content/SharedPreferences;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/b/b;->o:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method static synthetic g(Lcom/fimi/soul/b/b;)Lcom/fimi/soul/drone/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/b/b;->n:Lcom/fimi/soul/drone/a;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/d;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->r()Lcom/fimi/soul/biz/camera/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/c;->b()V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    goto :goto_0
.end method

.method public a(ZLcom/fimi/soul/biz/camera/entity/X11RespCmd;)V
    .locals 3

    invoke-virtual {p2}, Lcom/fimi/soul/biz/camera/entity/X11RespCmd;->getMsg_id()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :cond_0
    :goto_0
    return-void

    :sswitch_0
    if-eqz p1, :cond_1

    const-string v0, "camera_clock"

    invoke-virtual {p2}, Lcom/fimi/soul/biz/camera/entity/X11RespCmd;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v2, 0x7f0a0382

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->c:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->r()Lcom/fimi/soul/biz/camera/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/c;->b()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v2, 0x7f0a0388

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->c:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-static {}, Lcom/fimi/kernel/c;->b()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->c()V

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->r()Lcom/fimi/soul/biz/camera/c/c;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/b/b;->h:Ljava/lang/String;

    iget-object v2, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/biz/camera/c/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/fimi/kernel/c;->b()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->a()V

    iget-object v0, p0, Lcom/fimi/soul/b/b;->j:Lcom/fimi/soul/biz/camera/entity/X11DeviceInfo;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/entity/X11DeviceInfo;->getChip()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->r()Lcom/fimi/soul/biz/camera/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/c;->d()V

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->r()Lcom/fimi/soul/biz/camera/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/c;->b()V

    goto :goto_0

    :sswitch_3
    if-nez p1, :cond_0

    invoke-static {}, Lcom/fimi/kernel/c;->b()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->c()V

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v2, 0x7f0a00f4

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->c:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_0

    :sswitch_4
    invoke-static {}, Lcom/fimi/kernel/c;->b()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->c()V

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->c()V

    invoke-virtual {p0}, Lcom/fimi/soul/b/b;->notifyDataSetChanged()V

    goto/16 :goto_0

    :sswitch_5
    if-eqz p1, :cond_2

    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/fimi/soul/utils/j;->n()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/fimi/kernel/utils/g;->b(Ljava/io/File;)Z

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v2, 0x7f0a01f3

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->c:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->r()Lcom/fimi/soul/biz/camera/c/c;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/biz/camera/e;->cy:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/c/c;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/d;->a(Z)V

    :goto_1
    invoke-static {}, Lcom/fimi/kernel/c;->b()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->c()V

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v2, 0x7f0a01f1

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->c:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_1

    :sswitch_6
    invoke-static {}, Lcom/fimi/kernel/c;->b()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->c()V

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_4
        0x4 -> :sswitch_5
        0xb -> :sswitch_2
        0x101 -> :sswitch_3
        0x104 -> :sswitch_1
        0x999999 -> :sswitch_6
    .end sparse-switch
.end method

.method public bridge synthetic a(ZLjava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/fimi/soul/biz/camera/entity/X11RespCmd;

    invoke-virtual {p0, p1, p2}, Lcom/fimi/soul/b/b;->a(ZLcom/fimi/soul/biz/camera/entity/X11RespCmd;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/b/e;)V

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/d;->m()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->d()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/fimi/kernel/c;->b()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->a()V

    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->t()Lcom/fimi/soul/biz/camera/c/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/f;->b()V

    goto :goto_0
.end method

.method public getCount()I
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/fimi/soul/b/b$b;->values()[Lcom/fimi/soul/b/b$b;

    move-result-object v0

    array-length v0, v0

    :goto_0
    return v0

    :cond_0
    invoke-static {}, Lcom/fimi/soul/b/b$c;->values()[Lcom/fimi/soul/b/b$c;

    move-result-object v0

    array-length v0, v0

    goto :goto_0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    const v8, 0x7f0a00f9

    const v7, 0x7f0900f4

    const/16 v6, 0x8

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez p2, :cond_f

    new-instance v0, Lcom/fimi/soul/b/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/fimi/soul/b/b$a;-><init>(Lcom/fimi/soul/b/b;Lcom/fimi/soul/b/b$1;)V

    invoke-virtual {v0, p3}, Lcom/fimi/soul/b/b$a;->a(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Landroid/view/ViewGroup$LayoutParams;)V

    iget-boolean v1, p0, Lcom/fimi/soul/b/b;->k:Z

    if-eqz v1, :cond_16

    sget-object v1, Lcom/fimi/soul/b/b$b;->a:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a0325

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;)V

    :cond_0
    sget-object v1, Lcom/fimi/soul/b/b$b;->c:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a02f0

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget v1, p0, Lcom/fimi/soul/b/b;->e:I

    sget-object v5, Lcom/fimi/soul/b/b$b;->c:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v5}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v5

    if-ne v1, v5, :cond_10

    move v1, v2

    :goto_1
    invoke-direct {p0, v0, v4, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;Z)V

    :cond_1
    sget-object v1, Lcom/fimi/soul/b/b$b;->b:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_2

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a02f3

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget v1, p0, Lcom/fimi/soul/b/b;->e:I

    sget-object v5, Lcom/fimi/soul/b/b$b;->b:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v5}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v5

    if-ne v1, v5, :cond_11

    move v1, v2

    :goto_2
    invoke-direct {p0, v0, v4, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;Z)V

    :cond_2
    sget-object v1, Lcom/fimi/soul/b/b$b;->d:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_3

    const-string v4, "1280x720"

    iget v1, p0, Lcom/fimi/soul/b/b;->e:I

    sget-object v5, Lcom/fimi/soul/b/b$b;->d:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v5}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v5

    if-ne v1, v5, :cond_12

    move v1, v2

    :goto_3
    invoke-direct {p0, v0, v4, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;Z)V

    :cond_3
    sget-object v1, Lcom/fimi/soul/b/b$b;->g:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_4

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a030c

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;)V

    :cond_4
    sget-object v1, Lcom/fimi/soul/b/b$b;->h:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_5

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a02ed

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget v1, p0, Lcom/fimi/soul/b/b;->d:I

    sget-object v5, Lcom/fimi/soul/b/b$b;->h:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v5}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v5

    if-ne v1, v5, :cond_13

    move v1, v2

    :goto_4
    invoke-direct {p0, v0, v4, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;Z)V

    :cond_5
    sget-object v1, Lcom/fimi/soul/b/b$b;->i:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_6

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a02eb

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget v1, p0, Lcom/fimi/soul/b/b;->d:I

    sget-object v5, Lcom/fimi/soul/b/b$b;->i:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v5}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v5

    if-ne v1, v5, :cond_14

    move v1, v2

    :goto_5
    invoke-direct {p0, v0, v4, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;Z)V

    :cond_6
    sget-object v1, Lcom/fimi/soul/b/b$b;->j:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_7

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a02ee

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget v4, p0, Lcom/fimi/soul/b/b;->d:I

    sget-object v5, Lcom/fimi/soul/b/b$b;->j:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v5}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v5

    if-ne v4, v5, :cond_15

    :goto_6
    invoke-direct {p0, v0, v1, v2}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;Z)V

    :cond_7
    sget-object v1, Lcom/fimi/soul/b/b$b;->m:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_8

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v2, 0x7f0a035e

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;)V

    :cond_8
    sget-object v1, Lcom/fimi/soul/b/b$b;->n:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_9

    iget-object v1, v0, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, v0, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v2, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f0e0164

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_9
    sget-object v1, Lcom/fimi/soul/b/b$b;->e:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_a

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v2, 0x7f0a00b8

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;)V

    :cond_a
    sget-object v1, Lcom/fimi/soul/b/b$b;->f:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_b

    invoke-direct {p0, v0}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;)V

    :cond_b
    sget-object v1, Lcom/fimi/soul/b/b$b;->o:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_c

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v2, v0, Lcom/fimi/soul/b/b$a;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, v0, Lcom/fimi/soul/b/b$a;->d:Landroid/widget/RelativeLayout;

    const v2, 0x7f0e00c3

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    iget-object v1, v0, Lcom/fimi/soul/b/b$a;->a:Landroid/widget/TextView;

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, v0, Lcom/fimi/soul/b/b$a;->e:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v1, v6}, Lcom/fimi/kernel/view/button/SwitchButton;->setVisibility(I)V

    iget-object v1, v0, Lcom/fimi/soul/b/b$a;->c:Landroid/widget/ImageView;

    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, v0, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-virtual {v0, v3}, Lcom/fimi/soul/b/b$a;->a(Z)V

    :cond_c
    sget-object v1, Lcom/fimi/soul/b/b$b;->k:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_d

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v2, 0x7f0a0212

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;)V

    :cond_d
    sget-object v1, Lcom/fimi/soul/b/b$b;->l:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_e

    invoke-direct {p0, v0}, Lcom/fimi/soul/b/b;->b(Lcom/fimi/soul/b/b$a;)V

    iget-object v0, v0, Lcom/fimi/soul/b/b$a;->e:Lcom/fimi/kernel/view/button/SwitchButton;

    sget-object v1, Lcom/fimi/soul/b/b$b;->l:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/button/SwitchButton;->setTag(Ljava/lang/Object;)V

    :cond_e
    :goto_7
    return-object p2

    :cond_f
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/b/b$a;

    goto/16 :goto_0

    :cond_10
    move v1, v3

    goto/16 :goto_1

    :cond_11
    move v1, v3

    goto/16 :goto_2

    :cond_12
    move v1, v3

    goto/16 :goto_3

    :cond_13
    move v1, v3

    goto/16 :goto_4

    :cond_14
    move v1, v3

    goto/16 :goto_5

    :cond_15
    move v2, v3

    goto/16 :goto_6

    :cond_16
    sget-object v1, Lcom/fimi/soul/b/b$c;->a:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_17

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a0325

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;)V

    :cond_17
    sget-object v1, Lcom/fimi/soul/b/b$c;->c:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_18

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a02f5

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget v1, p0, Lcom/fimi/soul/b/b;->e:I

    sget-object v5, Lcom/fimi/soul/b/b$c;->c:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v5}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v5

    if-ne v1, v5, :cond_27

    move v1, v2

    :goto_8
    invoke-direct {p0, v0, v4, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;Z)V

    :cond_18
    sget-object v1, Lcom/fimi/soul/b/b$c;->f:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_19

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a02f2

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget v1, p0, Lcom/fimi/soul/b/b;->e:I

    sget-object v5, Lcom/fimi/soul/b/b$c;->f:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v5}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v5

    if-ne v1, v5, :cond_28

    move v1, v2

    :goto_9
    invoke-direct {p0, v0, v4, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;Z)V

    :cond_19
    sget-object v1, Lcom/fimi/soul/b/b$c;->e:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_1a

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a02f4

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget v1, p0, Lcom/fimi/soul/b/b;->e:I

    sget-object v5, Lcom/fimi/soul/b/b$c;->e:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v5}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v5

    if-ne v1, v5, :cond_29

    move v1, v2

    :goto_a
    invoke-direct {p0, v0, v4, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;Z)V

    :cond_1a
    sget-object v1, Lcom/fimi/soul/b/b$c;->d:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_1b

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a02f1

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget v1, p0, Lcom/fimi/soul/b/b;->e:I

    sget-object v5, Lcom/fimi/soul/b/b$c;->d:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v5}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v5

    if-ne v1, v5, :cond_2a

    move v1, v2

    :goto_b
    invoke-direct {p0, v0, v4, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;Z)V

    :cond_1b
    sget-object v1, Lcom/fimi/soul/b/b$c;->b:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_1c

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a02f6

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget v1, p0, Lcom/fimi/soul/b/b;->e:I

    sget-object v5, Lcom/fimi/soul/b/b$c;->b:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v5}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v5

    if-ne v1, v5, :cond_2b

    move v1, v2

    :goto_c
    invoke-direct {p0, v0, v4, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;Z)V

    :cond_1c
    sget-object v1, Lcom/fimi/soul/b/b$c;->g:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_1d

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a030c

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;)V

    :cond_1d
    sget-object v1, Lcom/fimi/soul/b/b$c;->h:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_1e

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a02ec

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget v1, p0, Lcom/fimi/soul/b/b;->d:I

    sget-object v5, Lcom/fimi/soul/b/b$c;->h:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v5}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v5

    if-ne v1, v5, :cond_2c

    move v1, v2

    :goto_d
    invoke-direct {p0, v0, v4, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;Z)V

    :cond_1e
    sget-object v1, Lcom/fimi/soul/b/b$c;->i:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_1f

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a02ef

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget v1, p0, Lcom/fimi/soul/b/b;->d:I

    sget-object v5, Lcom/fimi/soul/b/b$c;->i:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v5}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v5

    if-ne v1, v5, :cond_2d

    move v1, v2

    :goto_e
    invoke-direct {p0, v0, v4, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;Z)V

    :cond_1f
    sget-object v1, Lcom/fimi/soul/b/b$c;->o:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_20

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a035e

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;)V

    :cond_20
    sget-object v1, Lcom/fimi/soul/b/b$c;->p:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_21

    iget-object v1, v0, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, v0, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v4, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0e0164

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_21
    sget-object v1, Lcom/fimi/soul/b/b$c;->j:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_22

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a021c

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;)V

    :cond_22
    sget-object v1, Lcom/fimi/soul/b/b$c;->k:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_23

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a021d

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget v1, p0, Lcom/fimi/soul/b/b;->f:I

    sget-object v5, Lcom/fimi/soul/b/b$c;->k:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v5}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v5

    if-ne v1, v5, :cond_2e

    move v1, v2

    :goto_f
    invoke-direct {p0, v0, v4, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;Z)V

    :cond_23
    sget-object v1, Lcom/fimi/soul/b/b$c;->l:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_24

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v4, 0x7f0a021e

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget v4, p0, Lcom/fimi/soul/b/b;->f:I

    sget-object v5, Lcom/fimi/soul/b/b$c;->l:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v5}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v5

    if-ne v4, v5, :cond_2f

    :goto_10
    invoke-direct {p0, v0, v1, v2}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;Z)V

    :cond_24
    sget-object v1, Lcom/fimi/soul/b/b$c;->m:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_25

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v2, 0x7f0a0212

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/b/b;->a(Lcom/fimi/soul/b/b$a;Ljava/lang/String;)V

    :cond_25
    sget-object v1, Lcom/fimi/soul/b/b$c;->n:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_26

    invoke-direct {p0, v0}, Lcom/fimi/soul/b/b;->b(Lcom/fimi/soul/b/b$a;)V

    iget-object v1, v0, Lcom/fimi/soul/b/b$a;->e:Lcom/fimi/kernel/view/button/SwitchButton;

    sget-object v2, Lcom/fimi/soul/b/b$c;->n:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v2}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->setTag(Ljava/lang/Object;)V

    :cond_26
    sget-object v1, Lcom/fimi/soul/b/b$c;->q:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v1}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v1

    if-ne p1, v1, :cond_e

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v2, v0, Lcom/fimi/soul/b/b$a;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, v0, Lcom/fimi/soul/b/b$a;->d:Landroid/widget/RelativeLayout;

    const v2, 0x7f0e00c3

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    iget-object v1, v0, Lcom/fimi/soul/b/b$a;->a:Landroid/widget/TextView;

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, v0, Lcom/fimi/soul/b/b$a;->e:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v1, v6}, Lcom/fimi/kernel/view/button/SwitchButton;->setVisibility(I)V

    iget-object v1, v0, Lcom/fimi/soul/b/b$a;->c:Landroid/widget/ImageView;

    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, v0, Lcom/fimi/soul/b/b$a;->b:Landroid/widget/TextView;

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-virtual {v0, v3}, Lcom/fimi/soul/b/b$a;->a(Z)V

    goto/16 :goto_7

    :cond_27
    move v1, v3

    goto/16 :goto_8

    :cond_28
    move v1, v3

    goto/16 :goto_9

    :cond_29
    move v1, v3

    goto/16 :goto_a

    :cond_2a
    move v1, v3

    goto/16 :goto_b

    :cond_2b
    move v1, v3

    goto/16 :goto_c

    :cond_2c
    move v1, v3

    goto/16 :goto_d

    :cond_2d
    move v1, v3

    goto/16 :goto_e

    :cond_2e
    move v1, v3

    goto/16 :goto_f

    :cond_2f
    move v2, v3

    goto/16 :goto_10
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    const v6, 0x7f0f01b2

    const/4 v5, 0x0

    const/4 v4, 0x1

    const v3, 0x7f0a0376

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-eqz v0, :cond_2

    sget-object v0, Lcom/fimi/soul/b/b$b;->n:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v0

    if-eq p3, v0, :cond_0

    sget-object v0, Lcom/fimi/soul/b/b$b;->l:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v0

    if-eq p3, v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->r()Lcom/fimi/soul/biz/camera/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/c;->f()V

    :cond_0
    :goto_0
    sget-object v0, Lcom/fimi/soul/b/b$b;->c:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_4

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->d()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    :cond_1
    :goto_1
    return-void

    :cond_2
    sget-object v0, Lcom/fimi/soul/b/b$c;->p:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v0

    if-eq p3, v0, :cond_0

    sget-object v0, Lcom/fimi/soul/b/b$c;->n:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v0

    if-eq p3, v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->r()Lcom/fimi/soul/biz/camera/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/c;->f()V

    goto :goto_0

    :cond_3
    const-string v0, "video_resolution"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->h:Ljava/lang/String;

    const-string v0, "1920x1080 30P 16:9"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    :cond_4
    sget-object v0, Lcom/fimi/soul/b/b$b;->b:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_6

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-eqz v0, :cond_6

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->d()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_1

    :cond_5
    const-string v0, "video_resolution"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->h:Ljava/lang/String;

    const-string v0, "1920x1080 60P 16:9"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    :cond_6
    sget-object v0, Lcom/fimi/soul/b/b$b;->d:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_8

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-eqz v0, :cond_8

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->d()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_1

    :cond_7
    const-string v0, "video_resolution"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->h:Ljava/lang/String;

    const-string v0, "1280x720 120P 16:9"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    :cond_8
    sget-object v0, Lcom/fimi/soul/b/b$b;->h:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_a

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-eqz v0, :cond_a

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->d()Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_1

    :cond_9
    const-string v0, "photo_size"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->h:Ljava/lang/String;

    const-string v0, "16M (4608x3456 4:3)"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    :cond_a
    sget-object v0, Lcom/fimi/soul/b/b$b;->j:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_c

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-eqz v0, :cond_c

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->d()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_1

    :cond_b
    const-string v0, "photo_size"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->h:Ljava/lang/String;

    const-string v0, "8M (3264x2448 4:3)"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    :cond_c
    sget-object v0, Lcom/fimi/soul/b/b$b;->i:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_e

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-eqz v0, :cond_e

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->d()Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_1

    :cond_d
    const-string v0, "photo_size"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->h:Ljava/lang/String;

    const-string v0, "12M (4608x2592 16:9)"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    :cond_e
    sget-object v0, Lcom/fimi/soul/b/b$c;->b:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_10

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-nez v0, :cond_10

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->d()Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_1

    :cond_f
    const-string v0, "video_resolution"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->h:Ljava/lang/String;

    const-string v0, "3840x2160 30P 16:9"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    :cond_10
    sget-object v0, Lcom/fimi/soul/b/b$c;->c:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_12

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-nez v0, :cond_12

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->d()Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_1

    :cond_11
    const-string v0, "video_resolution"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->h:Ljava/lang/String;

    const-string v0, "2560x1440 60P 16:9"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    :cond_12
    sget-object v0, Lcom/fimi/soul/b/b$c;->f:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_14

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-nez v0, :cond_14

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->d()Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_1

    :cond_13
    const-string v0, "video_resolution"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->h:Ljava/lang/String;

    const-string v0, "1920x1080 30P 16:9"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    :cond_14
    sget-object v0, Lcom/fimi/soul/b/b$c;->e:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_16

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-nez v0, :cond_16

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->d()Z

    move-result v0

    if-nez v0, :cond_15

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_1

    :cond_15
    const-string v0, "video_resolution"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->h:Ljava/lang/String;

    const-string v0, "1920x1080 60P 16:9"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    :cond_16
    sget-object v0, Lcom/fimi/soul/b/b$c;->d:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_18

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-nez v0, :cond_18

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->d()Z

    move-result v0

    if-nez v0, :cond_17

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_1

    :cond_17
    const-string v0, "video_resolution"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->h:Ljava/lang/String;

    const-string v0, "1920x1080 100P 16:9"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    :cond_18
    sget-object v0, Lcom/fimi/soul/b/b$c;->k:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_1a

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-nez v0, :cond_1a

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->d()Z

    move-result v0

    if-nez v0, :cond_19

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_1

    :cond_19
    const-string v0, "photo_format"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->h:Ljava/lang/String;

    const-string v0, "JPG"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    :cond_1a
    sget-object v0, Lcom/fimi/soul/b/b$c;->l:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_1c

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-nez v0, :cond_1c

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->d()Z

    move-result v0

    if-nez v0, :cond_1b

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_1

    :cond_1b
    const-string v0, "photo_format"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->h:Ljava/lang/String;

    const-string v0, "JPG+DNG"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    :cond_1c
    sget-object v0, Lcom/fimi/soul/b/b$c;->n:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_1d

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-nez v0, :cond_1d

    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/button/SwitchButton;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->o:Landroid/content/SharedPreferences;

    const-string v2, "Show_9_Grid"

    invoke-interface {v1, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1f

    invoke-virtual {v0, v5, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    iget-object v0, p0, Lcom/fimi/soul/b/b;->n:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->ca:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    iget-object v0, p0, Lcom/fimi/soul/b/b;->o:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "Show_9_Grid"

    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_1d
    :goto_2
    sget-object v0, Lcom/fimi/soul/b/b$b;->l:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_1e

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-eqz v0, :cond_1e

    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/button/SwitchButton;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->o:Landroid/content/SharedPreferences;

    const-string v2, "Show_9_Grid"

    invoke-interface {v1, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_20

    invoke-virtual {v0, v5, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    iget-object v0, p0, Lcom/fimi/soul/b/b;->n:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->ca:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    iget-object v0, p0, Lcom/fimi/soul/b/b;->o:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "Show_9_Grid"

    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_1e
    :goto_3
    sget-object v0, Lcom/fimi/soul/b/b$c;->i:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_22

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-nez v0, :cond_22

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->d()Z

    move-result v0

    if-nez v0, :cond_21

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_1

    :cond_1f
    invoke-virtual {v0, v4, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    iget-object v0, p0, Lcom/fimi/soul/b/b;->n:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bZ:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    iget-object v0, p0, Lcom/fimi/soul/b/b;->o:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "Show_9_Grid"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_2

    :cond_20
    invoke-virtual {v0, v4, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    iget-object v0, p0, Lcom/fimi/soul/b/b;->n:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bZ:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    iget-object v0, p0, Lcom/fimi/soul/b/b;->o:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "Show_9_Grid"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_3

    :cond_21
    const-string v0, "photo_size"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->h:Ljava/lang/String;

    const-string v0, "8M (3840x2160 16:9)"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    :cond_22
    sget-object v0, Lcom/fimi/soul/b/b$c;->h:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_24

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-nez v0, :cond_24

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->d()Z

    move-result v0

    if-nez v0, :cond_23

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_1

    :cond_23
    const-string v0, "photo_size"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->h:Ljava/lang/String;

    const-string v0, "12M (4000x3000 4:3)"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    :cond_24
    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-eqz v0, :cond_25

    sget-object v0, Lcom/fimi/soul/b/b$b;->n:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v0

    if-eq p3, v0, :cond_26

    :cond_25
    sget-object v0, Lcom/fimi/soul/b/b$c;->p:Lcom/fimi/soul/b/b$c;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$c;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_28

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-nez v0, :cond_28

    :cond_26
    invoke-direct {p0}, Lcom/fimi/soul/b/b;->d()Z

    move-result v0

    if-nez v0, :cond_27

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v2, 0x7f0a02ce

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_1

    :cond_27
    iget-object v0, p0, Lcom/fimi/soul/b/b;->c:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->h()Z

    move-result v0

    if-eqz v0, :cond_29

    new-instance v0, Lcom/fimi/soul/view/f$a;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/fimi/soul/view/f$a;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v2, 0x7f0a046e

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e006e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$a;->a(I)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v2, 0x7f0a01f0

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/b/b$4;

    invoke-direct {v2, p0}, Lcom/fimi/soul/b/b$4;-><init>(Lcom/fimi/soul/b/b;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v2, 0x7f0a0103

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/b/b$3;

    invoke-direct {v2, p0}, Lcom/fimi/soul/b/b$3;-><init>(Lcom/fimi/soul/b/b;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$a;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V

    :cond_28
    :goto_4
    sget-object v0, Lcom/fimi/soul/b/b$b;->f:Lcom/fimi/soul/b/b$b;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b$b;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_1

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->k:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/fimi/soul/b/b;->d()Z

    move-result v0

    if-nez v0, :cond_2a

    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_1

    :cond_29
    iget-object v0, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/b/b;->b:Landroid/content/Context;

    const v2, 0x7f0a01f2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_4

    :cond_2a
    const-string v0, "video_mode"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->h:Ljava/lang/String;

    iget-boolean v0, p0, Lcom/fimi/soul/b/b;->l:Z

    if-eqz v0, :cond_2b

    iput-boolean v5, p0, Lcom/fimi/soul/b/b;->l:Z

    const-string v0, "video_only"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    goto/16 :goto_1

    :cond_2b
    iput-boolean v4, p0, Lcom/fimi/soul/b/b;->l:Z

    const-string v0, "video_av"

    iput-object v0, p0, Lcom/fimi/soul/b/b;->i:Ljava/lang/String;

    goto/16 :goto_1
.end method
