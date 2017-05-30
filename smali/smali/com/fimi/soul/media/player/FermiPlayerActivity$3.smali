.class Lcom/fimi/soul/media/player/FermiPlayerActivity$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/media/player/IMediaPlayer$OnCompletionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/media/player/FermiPlayerActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/fimi/soul/media/player/FermiPlayerActivity;


# direct methods
.method constructor <init>(Lcom/fimi/soul/media/player/FermiPlayerActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/media/player/FermiPlayerActivity$3;->this$0:Lcom/fimi/soul/media/player/FermiPlayerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Lcom/fimi/soul/media/player/IMediaPlayer;)V
    .locals 5

    const/4 v4, 0x1

    iget-object v0, p0, Lcom/fimi/soul/media/player/FermiPlayerActivity$3;->this$0:Lcom/fimi/soul/media/player/FermiPlayerActivity;

    # getter for: Lcom/fimi/soul/media/player/FermiPlayerActivity;->player:Lcom/fimi/soul/media/player/widget/FimiVideoView;
    invoke-static {v0}, Lcom/fimi/soul/media/player/FermiPlayerActivity;->access$200(Lcom/fimi/soul/media/player/FermiPlayerActivity;)Lcom/fimi/soul/media/player/widget/FimiVideoView;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/media/player/FermiPlayerActivity$3;->this$0:Lcom/fimi/soul/media/player/FermiPlayerActivity;

    # getter for: Lcom/fimi/soul/media/player/FermiPlayerActivity;->player:Lcom/fimi/soul/media/player/widget/FimiVideoView;
    invoke-static {v1}, Lcom/fimi/soul/media/player/FermiPlayerActivity;->access$200(Lcom/fimi/soul/media/player/FermiPlayerActivity;)Lcom/fimi/soul/media/player/widget/FimiVideoView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->getCurrentPosition()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->seekTo(I)V

    iget-object v0, p0, Lcom/fimi/soul/media/player/FermiPlayerActivity$3;->this$0:Lcom/fimi/soul/media/player/FermiPlayerActivity;

    # getter for: Lcom/fimi/soul/media/player/FermiPlayerActivity;->preferencesUtil:Lcom/fimi/kernel/utils/v;
    invoke-static {v0}, Lcom/fimi/soul/media/player/FermiPlayerActivity;->access$300(Lcom/fimi/soul/media/player/FermiPlayerActivity;)Lcom/fimi/kernel/utils/v;

    move-result-object v0

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/fimi/kernel/utils/v;->a(J)V

    iget-object v0, p0, Lcom/fimi/soul/media/player/FermiPlayerActivity$3;->this$0:Lcom/fimi/soul/media/player/FermiPlayerActivity;

    # getter for: Lcom/fimi/soul/media/player/FermiPlayerActivity;->playBtn:Landroid/widget/ImageButton;
    invoke-static {v0}, Lcom/fimi/soul/media/player/FermiPlayerActivity;->access$400(Lcom/fimi/soul/media/player/FermiPlayerActivity;)Landroid/widget/ImageButton;

    move-result-object v0

    const v1, 0x7f02018a

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/fimi/soul/media/player/FermiPlayerActivity$3;->this$0:Lcom/fimi/soul/media/player/FermiPlayerActivity;

    # getter for: Lcom/fimi/soul/media/player/FermiPlayerActivity;->player:Lcom/fimi/soul/media/player/widget/FimiVideoView;
    invoke-static {v0}, Lcom/fimi/soul/media/player/FermiPlayerActivity;->access$200(Lcom/fimi/soul/media/player/FermiPlayerActivity;)Lcom/fimi/soul/media/player/widget/FimiVideoView;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/fimi/soul/media/player/widget/FimiVideoView;->release(Z)V

    iget-object v0, p0, Lcom/fimi/soul/media/player/FermiPlayerActivity$3;->this$0:Lcom/fimi/soul/media/player/FermiPlayerActivity;

    iput-boolean v4, v0, Lcom/fimi/soul/media/player/FermiPlayerActivity;->finishPlay:Z

    return-void
.end method
