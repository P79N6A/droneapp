.class Lcom/fimi/soul/module/droneFragment/h$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/media/player/IMediaPlayer$OnInfoListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/droneFragment/h;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/droneFragment/h;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/droneFragment/h;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/h$2;->a:Lcom/fimi/soul/module/droneFragment/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInfo(Lcom/fimi/soul/media/player/IMediaPlayer;II)Z
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h$2;->a:Lcom/fimi/soul/module/droneFragment/h;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/h;->a(Lcom/fimi/soul/module/droneFragment/h;)Lcom/fimi/soul/media/player/widget/FimiVideoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h$2;->a:Lcom/fimi/soul/module/droneFragment/h;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/h;->b(Lcom/fimi/soul/module/droneFragment/h;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/h$2;->a:Lcom/fimi/soul/module/droneFragment/h;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/h;->a(Lcom/fimi/soul/module/droneFragment/h;)Lcom/fimi/soul/media/player/widget/FimiVideoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->toggleAspectRatioPOi()I

    return v1
.end method
