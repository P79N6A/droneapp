.class public Lcom/fimi/soul/module/droneFragment/h;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/view/View;

.field private b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

.field private c:Ljava/lang/String;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/fimi/soul/biz/camera/e;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->c:Ljava/lang/String;

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/h;->a:Landroid/view/View;

    const v0, 0x7f0f0264

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/media/player/widget/FimiVideoView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    const v0, 0x7f0f0279

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->d:Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/fimi/soul/module/droneFragment/h;->e:Landroid/content/Context;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/h;)Lcom/fimi/soul/media/player/widget/FimiVideoView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    return-object v0
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneFragment/h;)Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->d:Landroid/widget/ImageView;

    return-object v0
.end method

.method private c()V
    .locals 3

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setKeepScreenOn(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setHideSurfaceView(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setZOrderMediaOverlay(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setDecodeType(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/h;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setVideoPath(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->start()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/h$1;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/h$1;-><init>(Lcom/fimi/soul/module/droneFragment/h;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setOnPreparedListener(Lcom/fimi/soul/media/player/IMediaPlayer$OnPreparedListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/h$2;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/h$2;-><init>(Lcom/fimi/soul/module/droneFragment/h;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setOnInfoListener(Lcom/fimi/soul/media/player/IMediaPlayer$OnInfoListener;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setVisibility(I)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/h;->c()V

    return-void
.end method

.method public b()V
    .locals 4

    const/16 v3, 0x8

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->stopPlayback()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setKeepScreenOn(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setZOrderMediaOverlay(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->destroyDrawingCache()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->release(Z)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setHideSurfaceView(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h;->b:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->setVisibility(I)V

    return-void
.end method
