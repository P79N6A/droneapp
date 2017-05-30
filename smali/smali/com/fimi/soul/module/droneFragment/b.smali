.class public Lcom/fimi/soul/module/droneFragment/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# static fields
.field private static c:Landroid/view/View;


# instance fields
.field a:Landroid/util/DisplayMetrics;

.field private b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

.field private d:Landroid/app/Activity;

.field private e:I

.field private f:I

.field private g:Landroid/view/View;

.field private h:Landroid/widget/TextView;

.field private i:F

.field private j:F

.field private k:Lcom/fimi/soul/view/WriteCamera9Grid;

.field private l:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/view/View;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->a:Landroid/util/DisplayMetrics;

    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/b;->a:Landroid/util/DisplayMetrics;

    invoke-virtual {v0, v1}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->a:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v0, v0

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/b;->i:F

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->a:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v0, v0

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/b;->j:F

    invoke-direct {p0, p2}, Lcom/fimi/soul/module/droneFragment/b;->a(Landroid/view/View;)V

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/b;->d:Landroid/app/Activity;

    iput-object p2, p0, Lcom/fimi/soul/module/droneFragment/b;->g:Landroid/view/View;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/b;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->l:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->l:Landroid/content/SharedPreferences;

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/b;)Lcom/fimi/soul/media/player/widget/FimiVideoView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    return-object v0
.end method

.method private a(Landroid/view/View;)V
    .locals 2

    const/4 v1, 0x1

    const v0, 0x7f0f02e3

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/media/player/widget/FimiVideoView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setKeepScreenOn(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setZOrderMediaOverlay(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/b$1;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/b$1;-><init>(Lcom/fimi/soul/module/droneFragment/b;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setOnErrorListener(Lcom/fimi/soul/media/player/IMediaPlayer$OnErrorListener;)V

    const v0, 0x7f0f0267

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sput-object v0, Lcom/fimi/soul/module/droneFragment/b;->c:Landroid/view/View;

    sget-object v0, Lcom/fimi/soul/module/droneFragment/b;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const v0, 0x7f0f02e4

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->h:Landroid/widget/TextView;

    const v0, 0x7f0f02e5

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/WriteCamera9Grid;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->k:Lcom/fimi/soul/view/WriteCamera9Grid;

    return-void
.end method

.method static synthetic i()Landroid/view/View;
    .locals 1

    sget-object v0, Lcom/fimi/soul/module/droneFragment/b;->c:Landroid/view/View;

    return-object v0
.end method


# virtual methods
.method public a()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->d:Landroid/app/Activity;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->h:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->h:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public a(Z)V
    .locals 3

    const/16 v2, 0xa

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->g:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/module/droneFragment/b;->e:I

    if-le v1, v2, :cond_0

    iget v1, p0, Lcom/fimi/soul/module/droneFragment/b;->f:I

    if-le v1, v2, :cond_0

    iget v1, p0, Lcom/fimi/soul/module/droneFragment/b;->f:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget v1, p0, Lcom/fimi/soul/module/droneFragment/b;->e:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    :goto_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/b;->d()V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/b;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setHideSurfaceView(Z)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/b;->g:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/b;->a:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/b;->a:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_0
.end method

.method public b()V
    .locals 3

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->g:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v1, p0, Lcom/fimi/soul/module/droneFragment/b;->f:I

    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v1, p0, Lcom/fimi/soul/module/droneFragment/b;->e:I

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/b;->g:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v0, Lcom/fimi/soul/module/droneFragment/b;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setHideSurfaceView(Z)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/b;->e()V

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setDecodeType(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-static {}, Lcom/fimi/soul/biz/camera/e;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setVideoPath(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->start()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/b$2;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/b$2;-><init>(Lcom/fimi/soul/module/droneFragment/b;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setOnPreparedListener(Lcom/fimi/soul/media/player/IMediaPlayer$OnPreparedListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/b$3;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/b$3;-><init>(Lcom/fimi/soul/module/droneFragment/b;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setOnInfoListener(Lcom/fimi/soul/media/player/IMediaPlayer$OnInfoListener;)V

    return-void
.end method

.method public e()V
    .locals 2

    sget-object v0, Lcom/fimi/soul/module/droneFragment/b;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->stopPlayback()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->release(Z)V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 2

    sget-object v0, Lcom/fimi/soul/module/droneFragment/b;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setVisibility(I)V

    return-void
.end method

.method public g()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->l:Landroid/content/SharedPreferences;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->l:Landroid/content/SharedPreferences;

    const-string v1, "Show_9_Grid"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->k:Lcom/fimi/soul/view/WriteCamera9Grid;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->k:Lcom/fimi/soul/view/WriteCamera9Grid;

    invoke-virtual {v0}, Lcom/fimi/soul/view/WriteCamera9Grid;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->k:Lcom/fimi/soul/view/WriteCamera9Grid;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/WriteCamera9Grid;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public h()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->k:Lcom/fimi/soul/view/WriteCamera9Grid;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->k:Lcom/fimi/soul/view/WriteCamera9Grid;

    invoke-virtual {v0}, Lcom/fimi/soul/view/WriteCamera9Grid;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/b;->k:Lcom/fimi/soul/view/WriteCamera9Grid;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/WriteCamera9Grid;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    const/high16 v4, 0x40000000    # 2.0f

    const/high16 v3, 0x40400000    # 3.0f

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iget v2, p0, Lcom/fimi/soul/module/droneFragment/b;->i:F

    div-float/2addr v2, v3

    cmpg-float v2, v0, v2

    if-ltz v2, :cond_0

    iget v2, p0, Lcom/fimi/soul/module/droneFragment/b;->i:F

    mul-float/2addr v2, v4

    div-float/2addr v2, v3

    cmpl-float v0, v0, v2

    if-gtz v0, :cond_0

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/b;->j:F

    div-float/2addr v0, v3

    cmpg-float v0, v1, v0

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/b;->j:F

    mul-float/2addr v0, v4

    div-float/2addr v0, v3

    cmpl-float v0, v1, v0

    if-lez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
