.class final Landroid/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/media/MediaRouter$GlobalMediaRouter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "MediaSessionRecord"
.end annotation


# instance fields
.field private mControlType:I

.field private mMaxVolume:I

.field private final mMsCompat:Landroid/support/v4/media/session/MediaSessionCompat;

.field private mVpCompat:Landroid/support/v4/media/VolumeProviderCompat;

.field final synthetic this$0:Landroid/support/v7/media/MediaRouter$GlobalMediaRouter;


# direct methods
.method public constructor <init>(Landroid/support/v7/media/MediaRouter$GlobalMediaRouter;Ljava/lang/Object;)V
    .locals 1

    iput-object p1, p0, Landroid/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord;->this$0:Landroid/support/v7/media/MediaRouter$GlobalMediaRouter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    # getter for: Landroid/support/v7/media/MediaRouter$GlobalMediaRouter;->mApplicationContext:Landroid/content/Context;
    invoke-static {p1}, Landroid/support/v7/media/MediaRouter$GlobalMediaRouter;->access$1100(Landroid/support/v7/media/MediaRouter$GlobalMediaRouter;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, Landroid/support/v4/media/session/MediaSessionCompat;->obtain(Landroid/content/Context;Ljava/lang/Object;)Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord;->mMsCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    return-void
.end method


# virtual methods
.method public clearVolumeHandling()V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord;->mMsCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    iget-object v1, p0, Landroid/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord;->this$0:Landroid/support/v7/media/MediaRouter$GlobalMediaRouter;

    # getter for: Landroid/support/v7/media/MediaRouter$GlobalMediaRouter;->mPlaybackInfo:Landroid/support/v7/media/RemoteControlClientCompat$PlaybackInfo;
    invoke-static {v1}, Landroid/support/v7/media/MediaRouter$GlobalMediaRouter;->access$1400(Landroid/support/v7/media/MediaRouter$GlobalMediaRouter;)Landroid/support/v7/media/RemoteControlClientCompat$PlaybackInfo;

    move-result-object v1

    iget v1, v1, Landroid/support/v7/media/RemoteControlClientCompat$PlaybackInfo;->playbackStream:I

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->setPlaybackToLocal(I)V

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord;->mVpCompat:Landroid/support/v4/media/VolumeProviderCompat;

    return-void
.end method

.method public configureVolume(III)V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord;->mVpCompat:Landroid/support/v4/media/VolumeProviderCompat;

    if-eqz v0, :cond_0

    iget v0, p0, Landroid/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord;->mControlType:I

    if-ne p1, v0, :cond_0

    iget v0, p0, Landroid/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord;->mMaxVolume:I

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord;->mVpCompat:Landroid/support/v4/media/VolumeProviderCompat;

    invoke-virtual {v0, p3}, Landroid/support/v4/media/VolumeProviderCompat;->setCurrentVolume(I)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord$1;

    invoke-direct {v0, p0, p1, p2, p3}, Landroid/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord$1;-><init>(Landroid/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord;III)V

    iput-object v0, p0, Landroid/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord;->mVpCompat:Landroid/support/v4/media/VolumeProviderCompat;

    iget-object v0, p0, Landroid/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord;->mMsCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    iget-object v1, p0, Landroid/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord;->mVpCompat:Landroid/support/v4/media/VolumeProviderCompat;

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->setPlaybackToRemote(Landroid/support/v4/media/VolumeProviderCompat;)V

    goto :goto_0
.end method

.method public getToken()Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .locals 1

    iget-object v0, p0, Landroid/support/v7/media/MediaRouter$GlobalMediaRouter$MediaSessionRecord;->mMsCompat:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->getSessionToken()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v0

    return-object v0
.end method
