.class Lcom/fimi/soul/media/player/widget/FimiVideoView$7;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/media/player/widget/IRenderView$IRenderCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/media/player/widget/FimiVideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;


# direct methods
.method constructor <init>(Lcom/fimi/soul/media/player/widget/FimiVideoView;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSurfaceChanged(Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;III)V
    .locals 4
    .param p1    # Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {p1}, Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;->getRenderView()Lcom/fimi/soul/media/player/widget/IRenderView;

    move-result-object v0

    iget-object v3, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # getter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->mRenderView:Lcom/fimi/soul/media/player/widget/IRenderView;
    invoke-static {v3}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$400(Lcom/fimi/soul/media/player/widget/FimiVideoView;)Lcom/fimi/soul/media/player/widget/IRenderView;

    move-result-object v3

    if-eq v0, v3, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # getter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$1700(Lcom/fimi/soul/media/player/widget/FimiVideoView;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onSurfaceChanged: unmatched render callback\n"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # setter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->mSurfaceWidth:I
    invoke-static {v0, p3}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$1002(Lcom/fimi/soul/media/player/widget/FimiVideoView;I)I

    iget-object v0, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # setter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->mSurfaceHeight:I
    invoke-static {v0, p4}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$1102(Lcom/fimi/soul/media/player/widget/FimiVideoView;I)I

    iget-object v0, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # getter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->mTargetState:I
    invoke-static {v0}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$1200(Lcom/fimi/soul/media/player/widget/FimiVideoView;)I

    move-result v0

    const/4 v3, 0x3

    if-ne v0, v3, :cond_5

    move v0, v1

    :goto_1
    iget-object v3, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # getter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->mRenderView:Lcom/fimi/soul/media/player/widget/IRenderView;
    invoke-static {v3}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$400(Lcom/fimi/soul/media/player/widget/FimiVideoView;)Lcom/fimi/soul/media/player/widget/IRenderView;

    move-result-object v3

    invoke-interface {v3}, Lcom/fimi/soul/media/player/widget/IRenderView;->shouldWaitForResize()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # getter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->mVideoWidth:I
    invoke-static {v3}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$000(Lcom/fimi/soul/media/player/widget/FimiVideoView;)I

    move-result v3

    if-ne v3, p3, :cond_3

    iget-object v3, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # getter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->mVideoHeight:I
    invoke-static {v3}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$100(Lcom/fimi/soul/media/player/widget/FimiVideoView;)I

    move-result v3

    if-ne v3, p4, :cond_3

    :cond_2
    move v2, v1

    :cond_3
    iget-object v1, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # getter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->mMediaPlayer:Lcom/fimi/soul/media/player/IMediaPlayer;
    invoke-static {v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$700(Lcom/fimi/soul/media/player/widget/FimiVideoView;)Lcom/fimi/soul/media/player/IMediaPlayer;

    move-result-object v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # getter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->mSeekWhenPrepared:I
    invoke-static {v0}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$900(Lcom/fimi/soul/media/player/widget/FimiVideoView;)I

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    iget-object v1, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # getter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->mSeekWhenPrepared:I
    invoke-static {v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$900(Lcom/fimi/soul/media/player/widget/FimiVideoView;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->seekTo(I)V

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->start()V

    goto :goto_0

    :cond_5
    move v0, v2

    goto :goto_1
.end method

.method public onSurfaceCreated(Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;II)V
    .locals 2
    .param p1    # Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;->getRenderView()Lcom/fimi/soul/media/player/widget/IRenderView;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # getter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->mRenderView:Lcom/fimi/soul/media/player/widget/IRenderView;
    invoke-static {v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$400(Lcom/fimi/soul/media/player/widget/FimiVideoView;)Lcom/fimi/soul/media/player/widget/IRenderView;

    move-result-object v1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # getter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$1700(Lcom/fimi/soul/media/player/widget/FimiVideoView;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onSurfaceCreated: unmatched render callback\n"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # setter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->mSurfaceHolder:Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;
    invoke-static {v0, p1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$2002(Lcom/fimi/soul/media/player/widget/FimiVideoView;Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;)Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;

    iget-object v0, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # getter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->mMediaPlayer:Lcom/fimi/soul/media/player/IMediaPlayer;
    invoke-static {v0}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$700(Lcom/fimi/soul/media/player/widget/FimiVideoView;)Lcom/fimi/soul/media/player/IMediaPlayer;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    iget-object v1, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # getter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->mMediaPlayer:Lcom/fimi/soul/media/player/IMediaPlayer;
    invoke-static {v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$700(Lcom/fimi/soul/media/player/widget/FimiVideoView;)Lcom/fimi/soul/media/player/IMediaPlayer;

    move-result-object v1

    # invokes: Lcom/fimi/soul/media/player/widget/FimiVideoView;->bindSurfaceHolder(Lcom/fimi/soul/media/player/IMediaPlayer;Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;)V
    invoke-static {v0, v1, p1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$2100(Lcom/fimi/soul/media/player/widget/FimiVideoView;Lcom/fimi/soul/media/player/IMediaPlayer;Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    iget-object v1, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # getter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->decodeType:I
    invoke-static {v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$2200(Lcom/fimi/soul/media/player/widget/FimiVideoView;)I

    move-result v1

    # invokes: Lcom/fimi/soul/media/player/widget/FimiVideoView;->openVideo(I)V
    invoke-static {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$2300(Lcom/fimi/soul/media/player/widget/FimiVideoView;I)V

    goto :goto_0
.end method

.method public onSurfaceDestroyed(Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;)V
    .locals 2
    .param p1    # Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;->getRenderView()Lcom/fimi/soul/media/player/widget/IRenderView;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # getter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->mRenderView:Lcom/fimi/soul/media/player/widget/IRenderView;
    invoke-static {v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$400(Lcom/fimi/soul/media/player/widget/FimiVideoView;)Lcom/fimi/soul/media/player/widget/IRenderView;

    move-result-object v1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    # getter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$1700(Lcom/fimi/soul/media/player/widget/FimiVideoView;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onSurfaceDestroyed: unmatched render callback\n"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    const/4 v1, 0x0

    # setter for: Lcom/fimi/soul/media/player/widget/FimiVideoView;->mSurfaceHolder:Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;
    invoke-static {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->access$2002(Lcom/fimi/soul/media/player/widget/FimiVideoView;Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;)Lcom/fimi/soul/media/player/widget/IRenderView$ISurfaceHolder;

    iget-object v0, p0, Lcom/fimi/soul/media/player/widget/FimiVideoView$7;->this$0:Lcom/fimi/soul/media/player/widget/FimiVideoView;

    invoke-virtual {v0}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->releaseWithoutStop()V

    goto :goto_0
.end method
