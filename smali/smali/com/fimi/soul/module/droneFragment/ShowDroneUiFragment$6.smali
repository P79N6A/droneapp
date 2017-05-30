.class Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$6;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/live/NativeAudiolive$LiveCallBackListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$6;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public liveCallResult(II)Ljava/lang/String;
    .locals 3

    const v0, 0x4c5007

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$6;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a0276

    const/16 v2, 0x7d0

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    :cond_0
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    const v0, 0x4c5001

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$6;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->e(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)Lcom/fimi/soul/live/NativeAudiolive;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/live/NativeAudiolive;->fmLiveStop()I

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$6;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x4c5601

    if-eq p1, v0, :cond_3

    const v0, 0x4c5602

    if-eq p1, v0, :cond_3

    const v0, 0x4c5603

    if-eq p1, v0, :cond_3

    const v0, 0x4c5003

    if-eq p1, v0, :cond_3

    const v0, 0x4c5005

    if-ne p1, v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$6;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    invoke-static {v0, p2}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;I)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$6;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;

    invoke-static {v0, p2}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;I)V

    goto :goto_0
.end method
