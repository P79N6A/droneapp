.class public Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;
.super Landroid/support/v4/app/Fragment;

# interfaces
.implements Lcom/fimi/soul/drone/d$b;


# instance fields
.field a:Lcom/fimi/kernel/utils/v;

.field private b:Lcom/fimi/soul/module/droneFragment/k;

.field private c:Lcom/fimi/soul/module/droneFragment/j;

.field private d:Lcom/fimi/soul/drone/a;

.field private e:Landroid/view/View;

.field private f:Landroid/app/Dialog;

.field private g:I

.field private h:D


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->f:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->f:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->f:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->f:Landroid/app/Dialog;

    :cond_0
    new-instance v0, Lcom/fimi/soul/view/e$a;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fimi/soul/view/e$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Lcom/fimi/soul/view/e$a;->a(Ljava/lang/String;)Lcom/fimi/soul/view/e$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/e$a;->a(Z)Lcom/fimi/soul/view/e$a;

    const v1, 0x7f0a01cb

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment$1;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment$1;-><init>(Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/e$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/e$a;

    invoke-virtual {v0}, Lcom/fimi/soul/view/e$a;->a()Lcom/fimi/soul/view/e;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->f:Landroid/app/Dialog;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->f:Landroid/app/Dialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->f:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method private a(Landroid/view/View;)Z
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


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->f:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->f:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->e:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->a(Landroid/view/View;)Z

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

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->d:Lcom/fimi/soul/drone/a;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->a:Lcom/fimi/kernel/utils/v;

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

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

    const v0, 0x7f04005e

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->e:Landroid/view/View;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/k;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->d:Lcom/fimi/soul/drone/a;

    invoke-direct {v1, v0, v2}, Lcom/fimi/soul/module/droneFragment/k;-><init>(Landroid/view/View;Lcom/fimi/soul/drone/a;)V

    iput-object v1, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->b:Lcom/fimi/soul/module/droneFragment/k;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/j;

    invoke-direct {v1, v0}, Lcom/fimi/soul/module/droneFragment/j;-><init>(Landroid/view/View;)V

    iput-object v1, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->c:Lcom/fimi/soul/module/droneFragment/j;

    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->d:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->b(Lcom/fimi/soul/drone/d$b;)V

    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 4

    sget-object v0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment$2;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/c/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/c/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/h;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->b:Lcom/fimi/soul/module/droneFragment/k;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/k;->b()V

    goto :goto_0

    :pswitch_1
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->S()Lcom/fimi/soul/drone/h/x;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/x;->b()S

    move-result v0

    iget v1, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->g:I

    sub-int/2addr v1, v0

    if-gez v1, :cond_1

    add-int/lit16 v1, v0, -0xff

    mul-int/lit8 v1, v1, 0x5a

    div-int/lit16 v1, v1, 0xff

    int-to-double v2, v1

    iput-wide v2, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->h:D

    :goto_1
    iput v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->g:I

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->b:Lcom/fimi/soul/module/droneFragment/k;

    iget-wide v2, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->h:D

    double-to-int v1, v2

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/k;->a(I)V

    goto :goto_0

    :cond_1
    mul-int/lit8 v1, v0, 0x5a

    div-int/lit16 v1, v1, 0xff

    add-int/lit8 v1, v1, -0x5a

    int-to-double v2, v1

    iput-wide v2, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->h:D

    goto :goto_1

    :pswitch_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->b:Lcom/fimi/soul/module/droneFragment/k;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/k;->a()V

    goto :goto_0

    :pswitch_3
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ap()Lcom/fimi/soul/drone/h/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/a;->j()B

    move-result v1

    const/16 v2, 0x13

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->b:Lcom/fimi/soul/module/droneFragment/k;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/droneFragment/k;->a(Lcom/fimi/soul/drone/h/a/a;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public onHiddenChanged(Z)V
    .locals 3

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onHiddenChanged(Z)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_2

    const-string v0, "REMEBERACTIONTAKEPHOTO"

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->a:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f0a01df

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->b:Lcom/fimi/soul/module/droneFragment/k;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/k;->d()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->b:Lcom/fimi/soul/module/droneFragment/k;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/k;->e()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->b:Lcom/fimi/soul/module/droneFragment/k;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/k;->h()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->c:Lcom/fimi/soul/module/droneFragment/j;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/j;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->d:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bM:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->d:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bj:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->f:Landroid/app/Dialog;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->f:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->c:Lcom/fimi/soul/module/droneFragment/j;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->c:Lcom/fimi/soul/module/droneFragment/j;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/j;->a()V

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->b:Lcom/fimi/soul/module/droneFragment/k;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->b:Lcom/fimi/soul/module/droneFragment/k;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/k;->f()V

    goto :goto_0
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/DroneTakePhotoFragment;->d:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    return-void
.end method
