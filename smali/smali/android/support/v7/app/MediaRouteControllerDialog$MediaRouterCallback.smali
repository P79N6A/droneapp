.class final Landroid/support/v7/app/MediaRouteControllerDialog$MediaRouterCallback;
.super Landroid/support/v7/media/MediaRouter$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/app/MediaRouteControllerDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "MediaRouterCallback"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/app/MediaRouteControllerDialog;


# direct methods
.method private constructor <init>(Landroid/support/v7/app/MediaRouteControllerDialog;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/app/MediaRouteControllerDialog$MediaRouterCallback;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    invoke-direct {p0}, Landroid/support/v7/media/MediaRouter$Callback;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/app/MediaRouteControllerDialog;Landroid/support/v7/app/MediaRouteControllerDialog$1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/v7/app/MediaRouteControllerDialog$MediaRouterCallback;-><init>(Landroid/support/v7/app/MediaRouteControllerDialog;)V

    return-void
.end method


# virtual methods
.method public onRouteChanged(Landroid/support/v7/media/MediaRouter;Landroid/support/v7/media/MediaRouter$RouteInfo;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteControllerDialog$MediaRouterCallback;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    const/4 v1, 0x1

    # invokes: Landroid/support/v7/app/MediaRouteControllerDialog;->update(Z)V
    invoke-static {v0, v1}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$2200(Landroid/support/v7/app/MediaRouteControllerDialog;Z)V

    return-void
.end method

.method public onRouteUnselected(Landroid/support/v7/media/MediaRouter;Landroid/support/v7/media/MediaRouter$RouteInfo;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteControllerDialog$MediaRouterCallback;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    const/4 v1, 0x0

    # invokes: Landroid/support/v7/app/MediaRouteControllerDialog;->update(Z)V
    invoke-static {v0, v1}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$2200(Landroid/support/v7/app/MediaRouteControllerDialog;Z)V

    return-void
.end method

.method public onRouteVolumeChanged(Landroid/support/v7/media/MediaRouter;Landroid/support/v7/media/MediaRouter$RouteInfo;)V
    .locals 5

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteControllerDialog$MediaRouterCallback;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    # getter for: Landroid/support/v7/app/MediaRouteControllerDialog;->mVolumeSliderMap:Ljava/util/Map;
    invoke-static {v0}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$2300(Landroid/support/v7/app/MediaRouteControllerDialog;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    invoke-virtual {p2}, Landroid/support/v7/media/MediaRouter$RouteInfo;->getVolume()I

    move-result v1

    # getter for: Landroid/support/v7/app/MediaRouteControllerDialog;->DEBUG:Z
    invoke-static {}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$2400()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "MediaRouteCtrlDialog"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onRouteVolumeChanged(), route.getVolume:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    if-eqz v0, :cond_1

    iget-object v2, p0, Landroid/support/v7/app/MediaRouteControllerDialog$MediaRouterCallback;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    # getter for: Landroid/support/v7/app/MediaRouteControllerDialog;->mRouteInVolumeSliderTouched:Landroid/support/v7/media/MediaRouter$RouteInfo;
    invoke-static {v2}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$2500(Landroid/support/v7/app/MediaRouteControllerDialog;)Landroid/support/v7/media/MediaRouter$RouteInfo;

    move-result-object v2

    if-eq v2, p2, :cond_1

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    :cond_1
    return-void
.end method
