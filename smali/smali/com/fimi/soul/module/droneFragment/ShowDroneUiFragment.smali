.class public Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;
.super Lcom/fimi/kernel/BaseFragment;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/fimi/soul/biz/camera/b/e;
.implements Lcom/fimi/soul/biz/camera/c$d;
.implements Lcom/fimi/soul/drone/d$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$d;,
        Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$b;,
        Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;,
        Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;,
        Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fimi/kernel/BaseFragment;",
        "Landroid/view/View$OnClickListener;",
        "Lcom/fimi/soul/biz/camera/b/e",
        "<",
        "Lcom/fimi/soul/biz/camera/entity/X11RespCmd;",
        ">;",
        "Lcom/fimi/soul/biz/camera/c$d;",
        "Lcom/fimi/soul/drone/d$b;"
    }
.end annotation


# static fields
.field private static final A:I = 0x1

.field private static final B:I = 0x2

.field private static final C:I = 0x3

.field private static final D:I = 0x4

.field private static final E:I = 0x5

.field private static final F:I = 0x6

.field private static final G:I = 0x7

.field private static final H:I = 0x8

.field private static final J:I = 0x9

.field private static final K:I = 0xa

.field private static final L:I = 0xb

.field private static final M:I = 0xc

.field private static final N:I = 0xd

.field private static final O:I = 0xf


# instance fields
.field private I:Z

.field private P:Lcom/fimi/soul/drone/h/i$a;

.field private Q:J

.field private R:Z

.field private S:Z

.field private T:Z

.field private U:Ljava/util/Timer;

.field private V:Ljava/util/Timer;

.field private W:Landroid/widget/Button;

.field private X:Landroid/widget/Button;

.field private Y:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

.field private Z:Z

.field a:Ljava/lang/String;

.field private aa:Z

.field private ab:Z

.field private ac:Lcom/fimi/soul/view/f$a;

.field private ad:Lcom/fimi/soul/view/f$c;

.field private ae:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$a;

.field private af:Lcom/fimi/soul/biz/d/a;

.field private ag:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

.field private ah:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$d;

.field private ai:Lcom/fimi/soul/biz/c/h;

.field private aj:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$b;

.field private ak:Lcom/fimi/kernel/b/b/c;

.field b:Landroid/os/Handler;

.field private c:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

.field private d:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

.field private e:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

.field private f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

.field private g:Landroid/widget/ImageButton;

.field private h:Landroid/widget/ImageButton;

.field private i:Landroid/widget/ImageButton;

.field private j:Landroid/widget/ImageButton;

.field private k:Landroid/content/Context;

.field private l:Lcom/fimi/soul/drone/a;

.field private m:Lcom/fimi/soul/base/DroidPlannerApp;

.field private n:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

.field private o:Landroid/widget/ImageView;

.field private p:Landroid/widget/ImageView;

.field private q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

.field private r:Lcom/fimi/soul/biz/camera/d;

.field private s:Lcom/fimi/soul/view/UpDownSliding;

.field private t:Lcom/mi/live/openlivesdk/c;

.field private u:Lcom/fimi/soul/live/NativeAudiolive;

.field private v:Z

.field private w:Lcom/fimi/soul/view/UpDownSliding$b;

.field private x:Lcom/fimi/soul/module/droneFragment/b;

.field private y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

.field private z:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/fimi/kernel/BaseFragment;-><init>()V

    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->v:Z

    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->I:Z

    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->R:Z

    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->S:Z

    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->T:Z

    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->Z:Z

    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->aa:Z

    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ab:Z

    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$a;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$a;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ae:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$a;

    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ag:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$b;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$b;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->aj:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$b;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a:Ljava/lang/String;

    new-instance v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$2;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$2;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    invoke-static {}, Lcom/fimi/soul/biz/camera/b;->a()Lcom/fimi/soul/biz/camera/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/b;->d()Lcom/fimi/soul/biz/camera/b/a;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/biz/camera/d;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$1;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$1;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/d;->c(Lcom/fimi/kernel/b/c/d;)V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;Ljava/util/Timer;)Ljava/util/Timer;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->U:Ljava/util/Timer;

    return-object p1
.end method

.method private a(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method private a(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;)V
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->v:Z

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ag:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i()V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->c(I)V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;)V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->e(Z)V

    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    return-object v0
.end method

.method private b(I)V
    .locals 4

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->e(Z)V

    new-instance v0, Lcom/fimi/soul/view/f$c;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fimi/soul/view/f$c;-><init>(Landroid/content/Context;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/fimi/kernel/c;->d()Landroid/app/Activity;

    move-result-object v2

    const v3, 0x7f0a027e

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$c;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$c;

    move-result-object v0

    const v1, 0x7f0a017f

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$5;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$5;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$c;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$c;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V

    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b(I)V

    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b(Z)V

    return-void
.end method

.method private b(Z)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->b:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->c(Z)V

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->d(Z)V

    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)Lcom/fimi/soul/drone/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->l:Lcom/fimi/soul/drone/a;

    return-object v0
.end method

.method private c(I)V
    .locals 4

    const/4 v1, -0x1

    const/4 v0, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->u:Lcom/fimi/soul/live/NativeAudiolive;

    invoke-virtual {v2}, Lcom/fimi/soul/live/NativeAudiolive;->fmLiveStop()I

    :goto_0
    if-gez v1, :cond_0

    const/4 v2, 0x4

    if-ge v0, v2, :cond_0

    const-wide/16 v2, 0x7d0

    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->u:Lcom/fimi/soul/live/NativeAudiolive;

    invoke-static {}, Lcom/fimi/soul/biz/camera/e;->d()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/fimi/soul/live/NativeAudiolive;->fmLiveStart(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    if-gez v1, :cond_1

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1
.end method

.method private c(Z)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    const/16 v2, 0xff

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->l:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->W()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->a()I

    move-result v0

    const v1, 0x7f0a019e

    if-ne v0, v1, :cond_0

    const v0, 0x7f0a0418

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->b:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setImageAlpha(I)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    const/16 v1, 0x55

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageAlpha(I)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setImageAlpha(I)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->I:Z

    return p1
.end method

.method static synthetic d(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ag:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

    return-object v0
.end method

.method private d(Z)V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    const/16 v3, 0x55

    const/16 v2, 0xff

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->j:Landroid/widget/ImageButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setImageAlpha(I)V

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->h:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->h:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setImageAlpha(I)V

    :goto_1
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setImageAlpha(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setImageAlpha(I)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->h:Landroid/widget/ImageButton;

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setImageAlpha(I)V

    goto :goto_1
.end method

.method static synthetic d(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->Z:Z

    return p1
.end method

.method static synthetic e(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)Lcom/fimi/soul/live/NativeAudiolive;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->u:Lcom/fimi/soul/live/NativeAudiolive;

    return-object v0
.end method

.method private e(Z)V
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    const/16 v6, 0xff

    const/16 v5, 0x55

    const/4 v1, 0x1

    const/4 v2, 0x0

    iput-boolean p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->v:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    sget-object v3, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->b:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/fimi/kernel/c;->d()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    invoke-static {}, Lcom/fimi/kernel/c;->d()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    if-nez p1, :cond_4

    const v0, 0x7f0200c4

    :goto_0
    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->h:Landroid/widget/ImageButton;

    if-nez p1, :cond_5

    move v0, v1

    :goto_1
    invoke-virtual {v3, v0}, Landroid/widget/ImageButton;->setEnabled(Z)V

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->j:Landroid/widget/ImageButton;

    if-nez p1, :cond_6

    move v0, v1

    :goto_2
    invoke-virtual {v3, v0}, Landroid/widget/ImageButton;->setEnabled(Z)V

    if-eqz p1, :cond_7

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, v5}, Landroid/widget/ImageButton;->setImageAlpha(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->h:Landroid/widget/ImageButton;

    invoke-virtual {v0, v5}, Landroid/widget/ImageButton;->setImageAlpha(I)V

    :cond_1
    :goto_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->s:Lcom/fimi/soul/view/UpDownSliding;

    if-nez p1, :cond_8

    :goto_4
    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/UpDownSliding;->setEnabled(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->z:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->z:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;

    if-eqz p1, :cond_9

    :goto_5
    invoke-virtual {v0, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(I)V

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->b(Z)V

    :cond_3
    return-void

    :cond_4
    const v0, 0x7f0200c5

    goto :goto_0

    :cond_5
    move v0, v2

    goto :goto_1

    :cond_6
    move v0, v2

    goto :goto_2

    :cond_7
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->h:Landroid/widget/ImageButton;

    invoke-virtual {v0, v6}, Landroid/widget/ImageButton;->setImageAlpha(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, v6}, Landroid/widget/ImageButton;->setImageAlpha(I)V

    goto :goto_3

    :cond_8
    move v1, v2

    goto :goto_4

    :cond_9
    const/16 v2, 0x8

    goto :goto_5
.end method

.method static synthetic e(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->aa:Z

    return p1
.end method

.method private f()V
    .locals 3

    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->b:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->s:Lcom/fimi/soul/view/UpDownSliding;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/UpDownSliding;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020108

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->af:Lcom/fimi/soul/biz/d/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->af:Lcom/fimi/soul/biz/d/a;

    const v1, 0x7f020359

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/d/a;->a(I)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->g:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020304

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/d;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/b;->a(Z)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/droneui/FlightActivity;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneui/FlightActivity;->d()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/b;->d()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/b;->g()V

    return-void
.end method

.method static synthetic f(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->v:Z

    return v0
.end method

.method static synthetic f(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->R:Z

    return p1
.end method

.method static synthetic g(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)Lcom/fimi/soul/biz/camera/d;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    return-object v0
.end method

.method private g()V
    .locals 3

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ac:Lcom/fimi/soul/view/f$a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/view/f$a;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fimi/soul/view/f$a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ac:Lcom/fimi/soul/view/f$a;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ac:Lcom/fimi/soul/view/f$a;

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$a;->b()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ac:Lcom/fimi/soul/view/f$a;

    const v1, 0x7f0a0113

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e006e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$a;->a(I)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    const v1, 0x7f0a017f

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$9;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$9;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    const v1, 0x7f0a0103

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$8;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$8;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$a;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V

    :cond_1
    return-void
.end method

.method static synthetic h(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)Ljava/util/Timer;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->U:Ljava/util/Timer;

    return-object v0
.end method

.method private h()V
    .locals 3

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ad:Lcom/fimi/soul/view/f$c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/view/f$c;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fimi/soul/view/f$c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ad:Lcom/fimi/soul/view/f$c;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ad:Lcom/fimi/soul/view/f$c;

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$c;->b()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->isShowing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ad:Lcom/fimi/soul/view/f$c;

    const v1, 0x7f0a0414

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$c;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$c;

    move-result-object v0

    const v1, 0x7f0a017f

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$10;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$10;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$c;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$c;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V

    :cond_1
    return-void
.end method

.method static synthetic i(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)J
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->Q:J

    return-wide v0
.end method

.method private i()V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v2}, Lcom/fimi/soul/biz/camera/d;->f()Lcom/fimi/soul/biz/camera/c$a;

    move-result-object v2

    sget-object v3, Lcom/fimi/soul/biz/camera/c$a;->d:Lcom/fimi/soul/biz/camera/c$a;

    if-eq v2, v3, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v2}, Lcom/fimi/soul/biz/camera/d;->f()Lcom/fimi/soul/biz/camera/c$a;

    move-result-object v2

    sget-object v3, Lcom/fimi/soul/biz/camera/c$a;->c:Lcom/fimi/soul/biz/camera/c$a;

    if-eq v2, v3, :cond_0

    iget-boolean v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->v:Z

    if-eqz v2, :cond_1

    :cond_0
    move v2, v0

    :goto_0
    if-nez v2, :cond_2

    :goto_1
    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->d(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_2
    return-void

    :cond_1
    move v2, v1

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ag:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

    if-eq v0, v1, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->i()Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;->isContinueCaptureMode()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;->b:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;)V

    :cond_4
    sget-object v0, Lcom/fimi/soul/biz/camera/c$a;->c:Lcom/fimi/soul/biz/camera/c$a;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/d;->f()Lcom/fimi/soul/biz/camera/c$a;

    move-result-object v1

    if-ne v0, v1, :cond_5

    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;)V

    :cond_5
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->l()V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->j()V

    goto :goto_2
.end method

.method private j()V
    .locals 5

    const v4, 0x7f0203a5

    const/4 v3, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->v:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0200c5

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$3;->d:[I

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/d;->f()Lcom/fimi/soul/biz/camera/c$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/c$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->s:Lcom/fimi/soul/view/UpDownSliding;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/UpDownSliding;->setEnabled(Z)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->s:Lcom/fimi/soul/view/UpDownSliding;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/UpDownSliding;->setEnabled(Z)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->s:Lcom/fimi/soul/view/UpDownSliding;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/view/UpDownSliding;->setEnabled(Z)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->s:Lcom/fimi/soul/view/UpDownSliding;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/view/UpDownSliding;->setEnabled(Z)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic j(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->T:Z

    return v0
.end method

.method static synthetic k(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)Lcom/fimi/soul/module/droneFragment/SectorProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->d:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    return-object v0
.end method

.method private k()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->U:Ljava/util/Timer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->U:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->U:Ljava/util/Timer;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->a(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic l(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)Lcom/fimi/soul/module/droneFragment/SectorProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    return-object v0
.end method

.method private l()V
    .locals 4

    const v2, 0x7f020450

    const/4 v3, 0x0

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$3;->c:[I

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ag:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

    invoke-virtual {v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->s:Lcom/fimi/soul/view/UpDownSliding;

    sget-object v1, Lcom/fimi/soul/view/UpDownSliding$b;->a:Lcom/fimi/soul/view/UpDownSliding$b;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/UpDownSliding;->setState(Lcom/fimi/soul/view/UpDownSliding$b;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->z:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->z:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Z)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->s:Lcom/fimi/soul/view/UpDownSliding;

    sget-object v1, Lcom/fimi/soul/view/UpDownSliding$b;->b:Lcom/fimi/soul/view/UpDownSliding$b;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/UpDownSliding;->setState(Lcom/fimi/soul/view/UpDownSliding$b;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020108

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->z:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->z:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Z)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->s:Lcom/fimi/soul/view/UpDownSliding;

    sget-object v1, Lcom/fimi/soul/view/UpDownSliding$b;->c:Lcom/fimi/soul/view/UpDownSliding$b;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/UpDownSliding;->setState(Lcom/fimi/soul/view/UpDownSliding$b;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0200c4

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->z:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->z:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Z)V

    goto :goto_0

    :pswitch_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic m(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)Lcom/fimi/soul/module/droneFragment/SectorProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->e:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    return-object v0
.end method

.method static synthetic n(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)Lcom/fimi/soul/module/droneFragment/SectorProgressBar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->c:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->c(I)V

    :cond_0
    return-void
.end method

.method public a(J)V
    .locals 7

    iput-wide p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->Q:J

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->U:Ljava/util/Timer;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->U:Ljava/util/Timer;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->U:Ljava/util/Timer;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$11;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$11;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)V

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x3e8

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    :cond_0
    return-void
.end method

.method public a(Lcom/fimi/soul/biz/camera/c$a;Lcom/fimi/soul/biz/camera/c$a;)V
    .locals 3

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u72b6\u6001\u53d8\u5316\u5566"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-->"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x3e8

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

.method public a(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    iput-object p2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->z:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;

    return-void
.end method

.method public a(Z)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->b:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/b;->d()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/b;->e()V

    goto :goto_0
.end method

.method public a(ZLcom/fimi/soul/biz/camera/entity/X11RespCmd;)V
    .locals 5

    const v4, 0x7f0a0418

    const/4 v2, 0x0

    const/4 v3, 0x1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lcom/fimi/soul/biz/camera/entity/X11RespCmd;->getNotificationType()Lcom/fimi/soul/biz/camera/entity/X11RespCmd$NotificationType;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/biz/camera/entity/X11RespCmd$NotificationType;->CardRemoved:Lcom/fimi/soul/biz/camera/entity/X11RespCmd$NotificationType;

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/biz/camera/d;->a(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/biz/camera/d;->b(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    sget-object v1, Lcom/fimi/soul/biz/camera/c$a;->b:Lcom/fimi/soul/biz/camera/c$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/c$a;)V

    :cond_0
    :goto_0
    if-nez p1, :cond_1

    invoke-virtual {p2}, Lcom/fimi/soul/biz/camera/entity/X11RespCmd;->getRval()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :cond_1
    :goto_1
    invoke-virtual {p2}, Lcom/fimi/soul/biz/camera/entity/X11RespCmd;->getMsg_id()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :cond_2
    :goto_2
    return-void

    :cond_3
    sget-object v1, Lcom/fimi/soul/biz/camera/entity/X11RespCmd$NotificationType;->CardInsert:Lcom/fimi/soul/biz/camera/entity/X11RespCmd$NotificationType;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/biz/camera/d;->b(Z)V

    goto :goto_0

    :cond_4
    sget-object v1, Lcom/fimi/soul/biz/camera/entity/X11RespCmd$NotificationType;->PhotoFinish:Lcom/fimi/soul/biz/camera/entity/X11RespCmd$NotificationType;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, v3}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Z)V

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->t()Lcom/fimi/soul/biz/camera/c/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/f;->b()V

    goto :goto_1

    :sswitch_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->r()Lcom/fimi/soul/biz/camera/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/c;->e()V

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->v:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->r()Lcom/fimi/soul/biz/camera/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/c;->g()V

    :goto_3
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i()V

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->r()Lcom/fimi/soul/biz/camera/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/c;->h()V

    goto :goto_3

    :sswitch_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->l:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->W()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->f()Lcom/fimi/soul/biz/camera/c$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/biz/camera/c$a;->c:Lcom/fimi/soul/biz/camera/c$a;

    if-eq v0, v1, :cond_6

    invoke-virtual {p0, v4}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    invoke-virtual {p0, v3}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Z)V

    :cond_6
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->d()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->t()Lcom/fimi/soul/biz/camera/c/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/f;->b()V

    goto :goto_2

    :sswitch_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->l:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_7

    const v0, 0x7f0a019e

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    :cond_7
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    sget-object v1, Lcom/fimi/soul/biz/camera/c$a;->b:Lcom/fimi/soul/biz/camera/c$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/c$a;)V

    invoke-virtual {p0, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Z)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i()V

    goto/16 :goto_2

    :sswitch_3
    invoke-virtual {p0, v3}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->k()Lcom/fimi/soul/biz/camera/entity/X11FileSystem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/entity/X11FileSystem;->getFileList()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v4}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    goto/16 :goto_2

    :sswitch_4
    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->b:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i()V

    goto/16 :goto_2

    :sswitch_5
    if-eqz p1, :cond_8

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->k:Landroid/content/Context;

    const v1, 0x7f0a01f3

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->c:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->r()Lcom/fimi/soul/biz/camera/c/c;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/biz/camera/e;->cy:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/c/c;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/biz/camera/d;->a(Z)V

    :goto_4
    invoke-static {}, Lcom/fimi/kernel/c;->b()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->c()V

    goto/16 :goto_2

    :cond_8
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->k:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->k:Landroid/content/Context;

    const v2, 0x7f0a01f1

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->c:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_4

    :pswitch_data_0
    .packed-switch -0x4
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_4
        0x4 -> :sswitch_5
        0x101 -> :sswitch_3
        0x104 -> :sswitch_0
        0x777777 -> :sswitch_2
        0x999999 -> :sswitch_1
    .end sparse-switch
.end method

.method public bridge synthetic a(ZLjava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/fimi/soul/biz/camera/entity/X11RespCmd;

    invoke-virtual {p0, p1, p2}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(ZLcom/fimi/soul/biz/camera/entity/X11RespCmd;)V

    return-void
.end method

.method public d()V
    .locals 6

    const/4 v3, 0x1

    new-instance v0, Lcom/fimi/soul/live/NativeAudiolive;

    invoke-direct {v0}, Lcom/fimi/soul/live/NativeAudiolive;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->u:Lcom/fimi/soul/live/NativeAudiolive;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->u:Lcom/fimi/soul/live/NativeAudiolive;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$6;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$6;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/live/NativeAudiolive;->setLiveCallBackListener(Lcom/fimi/soul/live/NativeAudiolive$LiveCallBackListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->u:Lcom/fimi/soul/live/NativeAudiolive;

    invoke-virtual {v0}, Lcom/fimi/soul/live/NativeAudiolive;->isLivePushing()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, v3}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->e(Z)V

    :cond_0
    new-instance v0, Lcom/mi/live/openlivesdk/c;

    const-string v1, "1465961173"

    const-string v2, "f423350548790693b784577448fd7d15"

    new-instance v4, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$7;

    invoke-direct {v4, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$7;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)V

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->m:Lcom/fimi/soul/base/DroidPlannerApp;

    invoke-direct/range {v0 .. v5}, Lcom/mi/live/openlivesdk/c;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/mi/live/openlivesdk/a/a;Landroid/app/Application;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->t:Lcom/mi/live/openlivesdk/c;

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->m()V

    :cond_0
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/fimi/kernel/BaseFragment;->onActivityCreated(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/kernel/b/b/c;->a(Landroid/content/Context;)Lcom/fimi/kernel/b/b/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ak:Lcom/fimi/kernel/b/b/c;

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/fimi/kernel/BaseFragment;->onAttach(Landroid/app/Activity;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->k:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/base/DroidPlannerApp;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->m:Lcom/fimi/soul/base/DroidPlannerApp;

    check-cast p1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$d;

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ah:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$d;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->m:Lcom/fimi/soul/base/DroidPlannerApp;

    iget-object v0, v0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->l:Lcom/fimi/soul/drone/a;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    const/16 v2, 0x8

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x7

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :cond_0
    :goto_0
    return-void

    :sswitch_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->l:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/b/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/b/d;->d()V

    goto :goto_0

    :sswitch_1
    const v0, 0x7f0a00a5

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->X:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->l:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/b/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/b/d;->f()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->l:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/b/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/b/d;->e()V

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/c/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/c/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/h;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-eq v0, v6, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->l:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->e()B

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->Y:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->isShown()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->Y:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    :cond_3
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f()V

    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->l:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->c(Z)V

    goto :goto_0

    :cond_4
    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->s:Lcom/fimi/soul/view/UpDownSliding;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/UpDownSliding;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02031e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->af:Lcom/fimi/soul/biz/d/a;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->af:Lcom/fimi/soul/biz/d/a;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/d/a;->b()V

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->g:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02044f

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/droneui/FlightActivity;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneui/FlightActivity;->e()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/b;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, v5}, Landroid/widget/ImageButton;->setEnabled(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->j:Landroid/widget/ImageButton;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageAlpha(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/b;->e()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/b;->h()V

    goto :goto_1

    :sswitch_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ah:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$d;

    invoke-interface {v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$d;->a()V

    goto/16 :goto_0

    :sswitch_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->l:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->judgeOpenDrawLayout()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->l:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->aR:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :cond_6
    const/16 v0, 0xfa0

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a()Lcom/fimi/kernel/view/b;

    move-result-object v1

    invoke-interface {v1}, Lcom/fimi/kernel/view/b;->b()Landroid/app/Dialog;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a()Lcom/fimi/kernel/view/b;

    move-result-object v1

    invoke-interface {v1}, Lcom/fimi/kernel/view/b;->b()Landroid/app/Dialog;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Dialog;->isShowing()Z

    move-result v1

    if-nez v1, :cond_0

    :cond_7
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a()Lcom/fimi/kernel/view/b;

    move-result-object v1

    invoke-interface {v1}, Lcom/fimi/kernel/view/b;->a()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a()Lcom/fimi/kernel/view/b;

    move-result-object v1

    invoke-interface {v1}, Lcom/fimi/kernel/view/b;->b()Landroid/app/Dialog;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a()Lcom/fimi/kernel/view/b;

    move-result-object v1

    invoke-interface {v1}, Lcom/fimi/kernel/view/b;->b()Landroid/app/Dialog;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/app/Dialog;->setCancelable(Z)V

    :cond_8
    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$3;->c:[I

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ag:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

    invoke-virtual {v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    :goto_2
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    invoke-virtual {v1, v4}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    int-to-long v2, v0

    invoke-virtual {v1, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    :pswitch_0
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/d;->f()Lcom/fimi/soul/biz/camera/c$a;

    move-result-object v1

    sget-object v2, Lcom/fimi/soul/biz/camera/c$a;->c:Lcom/fimi/soul/biz/camera/c$a;

    if-ne v1, v2, :cond_9

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/d;->u()Lcom/fimi/soul/biz/camera/c/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/c/e;->g()V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v1, v6, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_2

    :cond_9
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/d;->u()Lcom/fimi/soul/biz/camera/c/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/c/e;->f()V

    goto :goto_2

    :pswitch_1
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/d;->f()Lcom/fimi/soul/biz/camera/c$a;

    move-result-object v1

    sget-object v2, Lcom/fimi/soul/biz/camera/c$a;->d:Lcom/fimi/soul/biz/camera/c$a;

    if-ne v1, v2, :cond_a

    const-string v0, "Good"

    const-string v1, "\u8fde\u62cd\u4e2d--\u300b\u505c\u6b62\u8fde\u62cd"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/16 v0, 0x32c8

    iput-boolean v5, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->S:Z

    invoke-direct {p0, v3}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b(Z)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/d;->u()Lcom/fimi/soul/biz/camera/c/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/c/e;->d()V

    goto :goto_2

    :cond_a
    const-string v1, "Good"

    const-string v2, "\u5f00\u59cb\u8fde\u62cd"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/d;->u()Lcom/fimi/soul/biz/camera/c/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/c/e;->e()V

    goto :goto_2

    :pswitch_2
    const-string v1, "JPG+DNG"

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v2}, Lcom/fimi/soul/biz/camera/d;->i()Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;->getImage_format()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    const/16 v0, 0x2710

    :cond_b
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/d;->u()Lcom/fimi/soul/biz/camera/c/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/c/e;->c()V

    goto/16 :goto_2

    :pswitch_3
    iget-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->v:Z

    if-nez v1, :cond_e

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/fimi/soul/utils/ao;->b(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_c

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0x7f0a02aa

    invoke-static {v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    invoke-virtual {v1, v4}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    int-to-long v2, v0

    invoke-virtual {v1, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    :cond_c
    invoke-static {}, Lcom/fimi/soul/biz/a/a;->a()Lcom/fimi/soul/biz/a/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/a/a;->c()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0x7f0a02aa

    invoke-static {v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    invoke-virtual {v1, v4}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    int-to-long v2, v0

    invoke-virtual {v1, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    :cond_d
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/d;->r()Lcom/fimi/soul/biz/camera/c/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/c/c;->f()V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->u:Lcom/fimi/soul/live/NativeAudiolive;

    invoke-virtual {v1}, Lcom/fimi/soul/live/NativeAudiolive;->fmLiveStop()I

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->t:Lcom/mi/live/openlivesdk/c;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/mi/live/openlivesdk/c;->a(Landroid/content/Context;)V

    goto/16 :goto_2

    :cond_e
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->t:Lcom/mi/live/openlivesdk/c;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/mi/live/openlivesdk/c;->b(Landroid/content/Context;)V

    goto/16 :goto_2

    :sswitch_5
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->af:Lcom/fimi/soul/biz/d/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->af:Lcom/fimi/soul/biz/d/a;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/d/a;->d()V

    goto/16 :goto_0

    :cond_f
    invoke-virtual {p0, v3}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Z)V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/fimi/soul/module/flyplannermedia/DroneMediaTabActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    :sswitch_6
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->f()Lcom/fimi/soul/biz/camera/c$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/biz/camera/c$a;->c:Lcom/fimi/soul/biz/camera/c$a;

    if-ne v0, v1, :cond_0

    const-string v0, ""

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->i()Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/entity/X11SystemConfig;->getVideoResolution()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, ""

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "1280x720 120P 16:9"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "3840x2160 30P 16:9"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "2560x1440 60P 16:9"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->b()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->b()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    :cond_10
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->a()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->b()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->b()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/Dialog;->setCancelable(Z)V

    :cond_11
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->u()Lcom/fimi/soul/biz/camera/c/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/e;->k()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    const-wide/16 v2, 0xfa0

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0f02e2 -> :sswitch_6
        0x7f0f044a -> :sswitch_2
        0x7f0f044e -> :sswitch_3
        0x7f0f044f -> :sswitch_4
        0x7f0f0450 -> :sswitch_5
        0x7f0f0455 -> :sswitch_0
        0x7f0f0456 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/fimi/kernel/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/c/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/c/h;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ai:Lcom/fimi/soul/biz/c/h;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v1, 0x0

    const v0, 0x7f0400d2

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    const v0, 0x7f0f042b

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->n:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v0, 0x7f0f02e2

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v3, Lcom/fimi/soul/module/droneFragment/b;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-direct {v3, v4, v0}, Lcom/fimi/soul/module/droneFragment/b;-><init>(Landroid/app/Activity;Landroid/view/View;)V

    iput-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->n:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v3, 0x7f0f0449

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->o:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->n:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v3, 0x7f0f044d

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->p:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->n:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v3, 0x7f0f044b

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->c:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->c:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    sget-object v3, Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;->a:Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setSectorProgressBarType(Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->n:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v3, 0x7f0f044c

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->d:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->d:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    sget-object v3, Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;->b:Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setSectorProgressBarType(Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->n:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v3, 0x7f0f0452

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->e:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    sget v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->e:I

    const/16 v3, 0x1e

    if-gt v0, v3, :cond_0

    sget v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->e:I

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->e:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    sget-object v3, Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;->c:Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setSectorProgressBarType(Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;)V

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->n:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v3, 0x7f0f0453

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    sget-object v3, Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;->d:Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setSectorProgressBarType(Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->n:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v3, 0x7f0f0454

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->Y:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->n:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v3, 0x7f0f0455

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->W:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->n:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v3, 0x7f0f0456

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->X:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-array v3, v6, [Landroid/view/View;

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->W:Landroid/widget/Button;

    aput-object v4, v3, v1

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->X:Landroid/widget/Button;

    aput-object v4, v3, v5

    invoke-static {v0, v3}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->n:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v3, 0x7f0f044a

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->g:Landroid/widget/ImageButton;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->n:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v3, 0x7f0f044e

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->h:Landroid/widget/ImageButton;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->n:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v3, 0x7f0f044f

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->n:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v3, 0x7f0f0450

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->j:Landroid/widget/ImageButton;

    const/4 v0, 0x6

    new-array v3, v0, [Landroid/view/View;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->g:Landroid/widget/ImageButton;

    aput-object v0, v3, v1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->h:Landroid/widget/ImageButton;

    aput-object v0, v3, v5

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    aput-object v0, v3, v6

    const/4 v0, 0x3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->j:Landroid/widget/ImageButton;

    aput-object v4, v3, v0

    const/4 v0, 0x4

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->W:Landroid/widget/Button;

    aput-object v4, v3, v0

    const/4 v0, 0x5

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->X:Landroid/widget/Button;

    aput-object v4, v3, v0

    array-length v4, v3

    move v0, v1

    :goto_1
    if-ge v0, v4, :cond_2

    aget-object v1, v3, v0

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->e:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    sget-object v3, Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;->e:Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setSectorProgressBarType(Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;)V

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->n:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v1, 0x7f0f0451

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/UpDownSliding;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->s:Lcom/fimi/soul/view/UpDownSliding;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->s:Lcom/fimi/soul/view/UpDownSliding;

    invoke-virtual {v0}, Lcom/fimi/soul/view/UpDownSliding;->getCurrentState()Lcom/fimi/soul/view/UpDownSliding$b;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/view/UpDownSliding$b;->a:Lcom/fimi/soul/view/UpDownSliding$b;

    if-ne v0, v1, :cond_4

    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;)V

    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->s:Lcom/fimi/soul/view/UpDownSliding;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$4;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$4;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/UpDownSliding;->setOnUpDownSliding(Lcom/fimi/soul/view/UpDownSliding$c;)V

    return-object v2

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->s:Lcom/fimi/soul/view/UpDownSliding;

    invoke-virtual {v0}, Lcom/fimi/soul/view/UpDownSliding;->getCurrentState()Lcom/fimi/soul/view/UpDownSliding$b;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/view/UpDownSliding$b;->b:Lcom/fimi/soul/view/UpDownSliding$b;

    if-ne v0, v1, :cond_5

    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;->c:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;)V

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->s:Lcom/fimi/soul/view/UpDownSliding;

    invoke-virtual {v0}, Lcom/fimi/soul/view/UpDownSliding;->getCurrentState()Lcom/fimi/soul/view/UpDownSliding$b;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/view/UpDownSliding$b;->c:Lcom/fimi/soul/view/UpDownSliding$b;

    if-ne v0, v1, :cond_3

    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;->d:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;)V

    goto :goto_2
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/fimi/kernel/BaseFragment;->onDestroy()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->l:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->b(Lcom/fimi/soul/drone/d$b;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->T:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->c:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->d:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->e:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->t:Lcom/mi/live/openlivesdk/c;

    invoke-virtual {v0}, Lcom/mi/live/openlivesdk/c;->a()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->U:Ljava/util/Timer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->U:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :cond_0
    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 9

    const-wide/16 v0, 0x0

    const/16 v5, 0x8

    const/4 v4, 0x0

    const/4 v6, 0x1

    const/4 v8, 0x0

    sget-object v2, Lcom/fimi/soul/drone/d$a;->bZ:Lcom/fimi/soul/drone/d$a;

    if-ne p1, v2, :cond_2

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    sget-object v3, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->b:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    invoke-virtual {v2}, Lcom/fimi/soul/module/droneFragment/b;->g()V

    :cond_0
    :goto_0
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v2

    if-eqz v2, :cond_38

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v2

    invoke-interface {v2}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v2

    if-eqz v2, :cond_38

    sget-object v2, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$3;->b:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    :cond_1
    :goto_1
    :pswitch_0
    return-void

    :cond_2
    sget-object v2, Lcom/fimi/soul/drone/d$a;->ca:Lcom/fimi/soul/drone/d$a;

    if-ne p1, v2, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    invoke-virtual {v2}, Lcom/fimi/soul/module/droneFragment/b;->h()V

    goto :goto_0

    :pswitch_1
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f()V

    goto :goto_1

    :pswitch_2
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->f()B

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->X:Landroid/widget/Button;

    const v1, 0x7f0a00a6

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    :cond_3
    :goto_2
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isExceAction()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->Y:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->isShown()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->Y:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0, v4}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    goto :goto_1

    :cond_4
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->f()B

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->X:Landroid/widget/Button;

    const v1, 0x7f0a00a5

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->b:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/c/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/c/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/h;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_7

    :cond_6
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->e()B

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    :cond_7
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->Y:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->Y:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0, v5}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    goto/16 :goto_1

    :cond_8
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->Y:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->Y:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0, v5}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    goto/16 :goto_1

    :pswitch_3
    invoke-static {p2}, Lcom/fimi/soul/module/b/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/b/d;

    move-result-object v0

    const/16 v1, 0x93

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/b/d;->c(I)V

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->J()Lcom/fimi/soul/drone/h/ar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ar;->a()B

    move-result v0

    const/16 v1, 0x50

    if-ne v0, v1, :cond_9

    const v0, 0x7f0a00a5

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->X:Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->X:Landroid/widget/Button;

    const v1, 0x7f0a00a6

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_9
    const/16 v1, 0x52

    if-ne v0, v1, :cond_a

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->X:Landroid/widget/Button;

    const v1, 0x7f0a00a5

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_a
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->Y:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->isShown()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->Y:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0, v5}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    :cond_b
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ai:Lcom/fimi/soul/biz/c/h;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/h;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    packed-switch v0, :pswitch_data_1

    :goto_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ai:Lcom/fimi/soul/biz/c/h;

    invoke-virtual {v0, v4}, Lcom/fimi/soul/biz/c/h;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->X:Landroid/widget/Button;

    const v1, 0x7f0a00a5

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_4
    sget-object v0, Lcom/fimi/soul/drone/d$a;->bm:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {p2, v0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto :goto_3

    :pswitch_5
    sget-object v0, Lcom/fimi/soul/drone/d$a;->bv:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {p2, v0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto :goto_3

    :pswitch_6
    sget-object v0, Lcom/fimi/soul/drone/d$a;->bD:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {p2, v0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto :goto_3

    :pswitch_7
    sget-object v0, Lcom/fimi/soul/drone/d$a;->bL:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {p2, v0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto :goto_3

    :pswitch_8
    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->af:Lcom/fimi/soul/biz/d/a;

    if-eqz v2, :cond_c

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->af:Lcom/fimi/soul/biz/d/a;

    invoke-virtual {v2}, Lcom/fimi/soul/biz/d/a;->e()Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    sget-object v3, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    invoke-virtual {v2, v3}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->af:Lcom/fimi/soul/biz/d/a;

    invoke-virtual {v2}, Lcom/fimi/soul/biz/d/a;->b()V

    :goto_4
    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->af:Lcom/fimi/soul/biz/d/a;

    invoke-virtual {v2}, Lcom/fimi/soul/biz/d/a;->c()Lcom/fimi/soul/biz/d/a$a;

    move-result-object v2

    sget-object v3, Lcom/fimi/soul/biz/d/a$a;->c:Lcom/fimi/soul/biz/d/a$a;

    if-ne v2, v3, :cond_c

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->u()Lcom/fimi/soul/drone/h/ag;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/ag;->e()D

    move-result-wide v4

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/ag;->d()D

    move-result-wide v6

    invoke-direct {v3, v4, v5, v6, v7}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->af:Lcom/fimi/soul/biz/d/a;

    invoke-virtual {v2, v3}, Lcom/fimi/soul/biz/d/a;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    :cond_c
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->u()Lcom/fimi/soul/drone/h/ag;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/ag;->f()D

    move-result-wide v2

    const-wide v4, 0x4124aac000000000L    # 677216.0

    sub-double/2addr v2, v4

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    div-double/2addr v2, v4

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v4

    if-nez v4, :cond_d

    move-wide v2, v0

    :cond_d
    cmpl-double v4, v2, v0

    if-ltz v4, :cond_11

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    cmpl-double v4, v2, v4

    if-ltz v4, :cond_10

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->c:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    const/high16 v3, 0x42c80000    # 100.0f

    invoke-virtual {v2, v3}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setProgress(F)V

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->c:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    const/high16 v3, 0x428c0000    # 70.0f

    invoke-virtual {v2, v3}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->a(F)V

    :goto_5
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->u()Lcom/fimi/soul/drone/h/ag;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/ag;->g()D

    move-result-wide v2

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v4

    if-nez v4, :cond_e

    move-wide v2, v0

    :cond_e
    cmpl-double v0, v2, v0

    if-lez v0, :cond_13

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->d:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    double-to-float v0, v2

    const/high16 v4, 0x42c80000    # 100.0f

    cmpl-float v0, v0, v4

    if-lez v0, :cond_12

    const/high16 v0, 0x42c80000    # 100.0f

    :goto_6
    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setProgress(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->d:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    const-wide v4, 0x3fe6666666666666L    # 0.7

    mul-double/2addr v2, v4

    double-to-float v1, v2

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->a(F)V

    goto/16 :goto_1

    :cond_f
    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->af:Lcom/fimi/soul/biz/d/a;

    const v3, 0x7f020359

    invoke-virtual {v2, v3}, Lcom/fimi/soul/biz/d/a;->a(I)V

    goto/16 :goto_4

    :cond_10
    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->c:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    const-wide v6, 0x3fe6666666666666L    # 0.7

    mul-double/2addr v6, v2

    double-to-float v5, v6

    invoke-virtual {v4, v5}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setProgress(F)V

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->c:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    const-wide v6, 0x3fe6666666666666L    # 0.7

    mul-double/2addr v2, v6

    double-to-float v2, v2

    invoke-virtual {v4, v2}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->a(F)V

    goto :goto_5

    :cond_11
    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->c:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v2, v8}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setProgress(F)V

    goto :goto_5

    :cond_12
    const-wide v4, 0x3fe6666666666666L    # 0.7

    mul-double/2addr v4, v2

    double-to-float v0, v4

    goto :goto_6

    :cond_13
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->d:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0, v8}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setProgress(F)V

    goto/16 :goto_1

    :pswitch_9
    sget v2, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->e:I

    int-to-double v2, v2

    cmpg-double v0, v0, v2

    if-gez v0, :cond_14

    const-wide/high16 v0, 0x403e000000000000L    # 30.0

    cmpg-double v0, v2, v0

    if-gez v0, :cond_14

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->e:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    sget-object v1, Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;->e:Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setSectorProgressBarType(Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;)V

    :goto_7
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->e:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    double-to-float v1, v2

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setProgress(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->e:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    const-wide v4, 0x3fe6666666666666L    # 0.7

    mul-double/2addr v2, v4

    double-to-float v1, v2

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->a(F)V

    goto/16 :goto_1

    :cond_14
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->e:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    sget-object v1, Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;->c:Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setSectorProgressBarType(Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;)V

    goto :goto_7

    :pswitch_a
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->c(Z)V

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-nez v0, :cond_18

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->u()Lcom/fimi/soul/drone/h/ag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ag;->c()B

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_1

    if-gt v0, v5, :cond_15

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    sget-object v2, Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;

    invoke-virtual {v1, v2}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setSectorProgressBarType(Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;)V

    :goto_8
    if-gt v0, v5, :cond_16

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    int-to-float v2, v0

    const v3, 0x40866666    # 4.2f

    mul-float/2addr v2, v3

    invoke-virtual {v1, v2}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setProgress(F)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    int-to-float v0, v0

    const v2, 0x4037ae14    # 2.87f

    mul-float/2addr v0, v2

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->a(F)V

    goto/16 :goto_1

    :cond_15
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    sget-object v2, Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;->d:Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;

    invoke-virtual {v1, v2}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setSectorProgressBarType(Lcom/fimi/soul/module/droneFragment/SectorProgressBar$a;)V

    goto :goto_8

    :cond_16
    if-le v0, v5, :cond_17

    const/16 v1, 0xd

    if-gt v0, v1, :cond_17

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    int-to-float v2, v0

    const/high16 v3, 0x40b00000    # 5.5f

    mul-float/2addr v2, v3

    const/high16 v3, 0x41300000    # 11.0f

    sub-float/2addr v2, v3

    invoke-virtual {v1, v2}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setProgress(F)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    int-to-float v0, v0

    const v2, 0x40933333    # 4.6f

    mul-float/2addr v0, v2

    float-to-double v2, v0

    const-wide v4, 0x402b99999999999aL    # 13.8

    sub-double/2addr v2, v4

    double-to-float v0, v2

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->a(F)V

    goto/16 :goto_1

    :cond_17
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    int-to-float v2, v0

    const v3, 0x40966666    # 4.7f

    mul-float/2addr v2, v3

    const/high16 v3, 0x40a00000    # 5.0f

    add-float/2addr v2, v3

    invoke-virtual {v1, v2}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setProgress(F)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    int-to-float v0, v0

    const v2, 0x40528f5c    # 3.29f

    mul-float/2addr v0, v2

    float-to-double v2, v0

    const-wide v4, 0x400999999999999aL    # 3.2

    add-double/2addr v2, v4

    double-to-float v0, v2

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->a(F)V

    goto/16 :goto_1

    :cond_18
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->getProgress()F

    move-result v0

    cmpl-float v0, v0, v8

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0, v8}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setProgress(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0, v8}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->a(F)V

    goto/16 :goto_1

    :pswitch_b
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->W()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Z)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i()V

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ad()Lcom/fimi/soul/drone/h/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->Z()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->u()Z

    move-result v1

    if-nez v1, :cond_19

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    const v1, 0x7f0a01af

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/b;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_19
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->ab()Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->u()Z

    move-result v1

    if-nez v1, :cond_1a

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    const v1, 0x7f0a01ad

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/b;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_1a
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->ah()Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->u()Z

    move-result v1

    if-nez v1, :cond_1b

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    const v1, 0x7f0a0245

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/b;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_1b
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->t()Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->u()Z

    move-result v1

    if-nez v1, :cond_1c

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    const v1, 0x7f0a0246

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/b;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_1c
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->Y()Z

    move-result v1

    if-eqz v1, :cond_1d

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->u()Z

    move-result v1

    if-nez v1, :cond_1d

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    const v1, 0x7f0a01fa

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/b;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_1d
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->aa()Z

    move-result v1

    if-eqz v1, :cond_1e

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->u()Z

    move-result v1

    if-nez v1, :cond_1e

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    const v1, 0x7f0a01ac

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/b;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_1e
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->ac()Z

    move-result v1

    if-eqz v1, :cond_1f

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->u()Z

    move-result v1

    if-nez v1, :cond_1f

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    const v1, 0x7f0a01a1

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/b;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_1f
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->ad()Z

    move-result v1

    if-eqz v1, :cond_20

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->u()Z

    move-result v1

    if-nez v1, :cond_20

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    const v1, 0x7f0a0198

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/b;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_20
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->u()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->W()Z

    move-result v0

    if-nez v0, :cond_21

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    const v1, 0x7f0a019e

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/b;->a(Ljava/lang/String;)V

    const v0, 0x7f0a019e

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    goto/16 :goto_1

    :cond_21
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/b;->a(Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_d
    iget-object v0, p2, Lcom/fimi/soul/drone/a;->c:Lcom/fimi/soul/drone/c/a;

    invoke-interface {v0}, Lcom/fimi/soul/drone/c/a;->a()I

    move-result v0

    const/16 v1, 0x31

    if-ne v0, v1, :cond_2f

    iget-object v0, p2, Lcom/fimi/soul/drone/a;->c:Lcom/fimi/soul/drone/c/a;

    check-cast v0, Lcom/fimi/soul/drone/h/i;

    iget-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->S:Z

    if-nez v1, :cond_22

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/i;->e()Lcom/fimi/soul/drone/h/i$a;

    move-result-object v1

    sget-object v2, Lcom/fimi/soul/drone/h/i$a;->e:Lcom/fimi/soul/drone/h/i$a;

    if-eq v1, v2, :cond_22

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a()Lcom/fimi/kernel/view/b;

    move-result-object v1

    invoke-interface {v1}, Lcom/fimi/kernel/view/b;->c()V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeMessages(I)V

    :cond_22
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/i;->e()Lcom/fimi/soul/drone/h/i$a;

    move-result-object v1

    sget-object v2, Lcom/fimi/soul/drone/h/i$a;->b:Lcom/fimi/soul/drone/h/i$a;

    if-ne v1, v2, :cond_26

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->u()Lcom/fimi/soul/biz/camera/c/e;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/biz/camera/e$a;->a:Lcom/fimi/soul/biz/camera/e$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/c/e;->a(Lcom/fimi/soul/biz/camera/e$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->b:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_23

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0203a4

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_23
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    sget-object v1, Lcom/fimi/soul/biz/camera/c$a;->c:Lcom/fimi/soul/biz/camera/c$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/c$a;)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->R:Z

    if-nez v0, :cond_24

    iput-boolean v6, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->R:Z

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->m(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    const/16 v1, 0xc

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_24
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a0324

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x5dc

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(J)V

    sget-object v0, Lcom/fimi/soul/drone/d$a;->bQ:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {p2, v0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    :cond_25
    :goto_9
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i()V

    goto/16 :goto_1

    :cond_26
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/i;->e()Lcom/fimi/soul/drone/h/i$a;

    move-result-object v1

    sget-object v2, Lcom/fimi/soul/drone/h/i$a;->c:Lcom/fimi/soul/drone/h/i$a;

    if-ne v1, v2, :cond_29

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->u()Lcom/fimi/soul/biz/camera/c/e;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/biz/camera/e$a;->c:Lcom/fimi/soul/biz/camera/e$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/c/e;->a(Lcom/fimi/soul/biz/camera/e$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->b:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_27

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0203a4

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_27
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a0323

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x5dc

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->aa:Z

    if-nez v0, :cond_28

    iput-boolean v6, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->aa:Z

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->l(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    const/16 v1, 0xb

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_28
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    sget-object v1, Lcom/fimi/soul/biz/camera/c$a;->b:Lcom/fimi/soul/biz/camera/c$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/c$a;)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->k()V

    goto :goto_9

    :cond_29
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/i;->e()Lcom/fimi/soul/drone/h/i$a;

    move-result-object v1

    sget-object v2, Lcom/fimi/soul/drone/h/i$a;->f:Lcom/fimi/soul/drone/h/i$a;

    if-ne v1, v2, :cond_2d

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->u()Lcom/fimi/soul/biz/camera/c/e;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/biz/camera/e$a;->b:Lcom/fimi/soul/biz/camera/e$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/c/e;->a(Lcom/fimi/soul/biz/camera/e$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->f()Lcom/fimi/soul/biz/camera/c$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/biz/camera/c$a;->c:Lcom/fimi/soul/biz/camera/c$a;

    if-ne v0, v1, :cond_2b

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a010d

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x5dc

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    :goto_a
    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->Z:Z

    if-nez v0, :cond_2a

    iput-boolean v6, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->Z:Z

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->n(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    const/16 v1, 0xa

    const-wide/16 v2, 0x5dc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_2a
    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;->c:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0, v6}, Lcom/fimi/soul/biz/camera/d;->a(Z)V

    goto/16 :goto_9

    :cond_2b
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->b:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2c

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0203a4

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_2c
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a0407

    const/16 v2, 0x5dc

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    const v0, 0x7f0a0418

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    sget-object v1, Lcom/fimi/soul/biz/camera/c$a;->b:Lcom/fimi/soul/biz/camera/c$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/c$a;)V

    goto :goto_a

    :cond_2d
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/i;->e()Lcom/fimi/soul/drone/h/i$a;

    move-result-object v1

    sget-object v2, Lcom/fimi/soul/drone/h/i$a;->d:Lcom/fimi/soul/drone/h/i$a;

    if-ne v1, v2, :cond_2e

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "\u5f00\u59cb\u8fde\u62cd"

    const/16 v2, 0x5dc

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    const/4 v1, 0x7

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    sget-object v1, Lcom/fimi/soul/biz/camera/c$a;->d:Lcom/fimi/soul/biz/camera/c$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/c$a;)V

    goto/16 :goto_9

    :cond_2e
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/i;->e()Lcom/fimi/soul/drone/h/i$a;

    move-result-object v0

    sget-object v1, Lcom/fimi/soul/drone/h/i$a;->e:Lcom/fimi/soul/drone/h/i$a;

    if-ne v0, v1, :cond_25

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "\u505c\u6b62\u8fde\u62cd"

    const/16 v2, 0xbb8

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    sget-object v1, Lcom/fimi/soul/biz/camera/c$a;->b:Lcom/fimi/soul/biz/camera/c$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/c$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_9

    :cond_2f
    const/16 v1, 0x32

    if-ne v0, v1, :cond_1

    iget-object v0, p2, Lcom/fimi/soul/drone/a;->c:Lcom/fimi/soul/drone/c/a;

    check-cast v0, Lcom/fimi/soul/drone/h/g;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/g;->f()Lcom/fimi/soul/drone/h/g$a;

    move-result-object v1

    sget-object v2, Lcom/fimi/soul/drone/h/g$a;->f:Lcom/fimi/soul/drone/h/g$a;

    if-eq v1, v2, :cond_31

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v1, v6}, Lcom/fimi/soul/biz/camera/d;->b(Z)V

    :goto_b
    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$3;->a:[I

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/g;->f()Lcom/fimi/soul/drone/h/g$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/g$a;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_2

    :cond_30
    :goto_c
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i()V

    goto/16 :goto_1

    :cond_31
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v1, v4}, Lcom/fimi/soul/biz/camera/d;->b(Z)V

    goto :goto_b

    :pswitch_e
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/d;->d()Z

    move-result v1

    if-eqz v1, :cond_30

    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    sget-object v2, Lcom/fimi/soul/biz/camera/c$a;->c:Lcom/fimi/soul/biz/camera/c$a;

    invoke-virtual {v1, v2}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/c$a;)V

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/g;->d()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-eqz v1, :cond_32

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/g;->d()J

    move-result-wide v0

    sub-long v0, v2, v0

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(J)V

    :cond_32
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0, v6}, Lcom/fimi/soul/biz/camera/d;->a(Z)V

    goto :goto_c

    :pswitch_f
    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;->b:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    sget-object v2, Lcom/fimi/soul/biz/camera/c$a;->d:Lcom/fimi/soul/biz/camera/c$a;

    invoke-virtual {v1, v2}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/c$a;)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    if-eqz v1, :cond_33

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/g;->d()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\u5f20"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->a(Ljava/lang/String;)V

    :cond_33
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0, v6}, Lcom/fimi/soul/biz/camera/d;->a(Z)V

    goto :goto_c

    :pswitch_10
    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->S:Z

    if-eqz v0, :cond_34

    const v0, 0x7f0a0418

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->c()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    iput-boolean v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->S:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    invoke-direct {p0, v6}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b(Z)V

    :cond_34
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->d()Z

    move-result v0

    if-nez v0, :cond_35

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_35

    const v0, 0x7f0a0418

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    :cond_35
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    if-eqz v0, :cond_37

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->a()I

    move-result v0

    const v1, 0x7f0a0419

    if-eq v0, v1, :cond_36

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->a()I

    move-result v0

    const v1, 0x7f0a0415

    if-eq v0, v1, :cond_36

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->a()I

    move-result v0

    const v1, 0x7f0a041a

    if-eq v0, v1, :cond_36

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->y:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->a()I

    move-result v0

    const v1, 0x7f0a0416

    if-ne v0, v1, :cond_37

    :cond_36
    const v0, 0x7f0a0418

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    :cond_37
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->k()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    sget-object v1, Lcom/fimi/soul/biz/camera/c$a;->b:Lcom/fimi/soul/biz/camera/c$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/c$a;)V

    goto/16 :goto_c

    :pswitch_11
    const v0, 0x7f0a041a

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    sget-object v1, Lcom/fimi/soul/biz/camera/c$a;->b:Lcom/fimi/soul/biz/camera/c$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/c$a;)V

    goto/16 :goto_c

    :pswitch_12
    const v0, 0x7f0a0415

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    sget-object v1, Lcom/fimi/soul/biz/camera/c$a;->b:Lcom/fimi/soul/biz/camera/c$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/c$a;)V

    goto/16 :goto_c

    :pswitch_13
    const v0, 0x7f0a0419

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    sget-object v1, Lcom/fimi/soul/biz/camera/c$a;->b:Lcom/fimi/soul/biz/camera/c$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/c$a;)V

    goto/16 :goto_c

    :pswitch_14
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->d()Z

    move-result v0

    if-nez v0, :cond_30

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_30

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/d;->m()Z

    move-result v0

    if-nez v0, :cond_30

    const v0, 0x7f0a0410

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    goto/16 :goto_c

    :pswitch_15
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->d()Z

    move-result v0

    if-nez v0, :cond_30

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_30

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/d;->m()Z

    move-result v0

    if-nez v0, :cond_30

    const v0, 0x7f0a0411

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    goto/16 :goto_c

    :pswitch_16
    const v0, 0x7f0a0416

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    sget-object v1, Lcom/fimi/soul/biz/camera/c$a;->b:Lcom/fimi/soul/biz/camera/c$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/c$a;)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->k()V

    goto/16 :goto_c

    :pswitch_17
    iput-boolean v6, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->S:Z

    const v0, 0x7f0a041c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    goto/16 :goto_c

    :pswitch_18
    const v0, 0x7f0a0417

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->h()V

    goto/16 :goto_c

    :pswitch_19
    const v0, 0x7f0a0416

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    goto/16 :goto_c

    :pswitch_1a
    const v0, 0x7f0a0416

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->g()V

    goto/16 :goto_c

    :pswitch_1b
    const v0, 0x7f0a01f4

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    goto/16 :goto_c

    :pswitch_1c
    const v0, 0x7f0a00f7

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    goto/16 :goto_c

    :cond_38
    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$3;->b:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_3

    :goto_d
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v0

    if-nez v0, :cond_3c

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->d:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->getProgress()F

    move-result v0

    cmpl-float v0, v0, v8

    if-eqz v0, :cond_39

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->d:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0, v8}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setProgress(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->d:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0, v8}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->a(F)V

    :cond_39
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->getProgress()F

    move-result v0

    cmpl-float v0, v0, v8

    if-eqz v0, :cond_3a

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0, v8}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setProgress(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->f:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0, v8}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->a(F)V

    :cond_3a
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->e:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->getProgress()F

    move-result v0

    cmpl-float v0, v0, v8

    if-eqz v0, :cond_3b

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->e:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0, v8}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setProgress(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->e:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0, v8}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->a(F)V

    :cond_3b
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->c:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->getProgress()F

    move-result v0

    cmpl-float v0, v0, v8

    if-eqz v0, :cond_3c

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->c:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0, v8}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->setProgress(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->c:Lcom/fimi/soul/module/droneFragment/SectorProgressBar;

    invoke-virtual {v0, v8}, Lcom/fimi/soul/module/droneFragment/SectorProgressBar;->a(F)V

    :cond_3c
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->W()Z

    move-result v0

    if-nez v0, :cond_3d

    invoke-virtual {p0, v4}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Z)V

    :cond_3d
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_3e

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->af:Lcom/fimi/soul/biz/d/a;

    if-eqz v0, :cond_3e

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->q:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    sget-object v1, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_40

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->af:Lcom/fimi/soul/biz/d/a;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/d/a;->b()V

    :cond_3e
    :goto_e
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    sget-object v1, Lcom/fimi/soul/biz/camera/c$a;->b:Lcom/fimi/soul/biz/camera/c$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/c$a;)V

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->W()Z

    move-result v0

    if-nez v0, :cond_3f

    const v0, 0x7f0a019e

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->k()Lcom/fimi/soul/biz/camera/entity/X11FileSystem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/entity/X11FileSystem;->getFileList()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    :cond_3f
    invoke-direct {p0, v4}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->e(Z)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->i()V

    invoke-direct {p0, v4}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->c(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/b;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0, v6}, Lcom/fimi/soul/biz/camera/d;->a(Z)V

    goto/16 :goto_1

    :pswitch_1d
    invoke-virtual {p0, v4}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Z)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->k()V

    goto/16 :goto_d

    :cond_40
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->af:Lcom/fimi/soul/biz/d/a;

    const v1, 0x7f020359

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/d/a;->a(I)V

    goto :goto_e

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
        :pswitch_14
        :pswitch_15
        :pswitch_16
        :pswitch_17
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_19
        :pswitch_1a
        :pswitch_1a
        :pswitch_1b
        :pswitch_1c
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0xc
        :pswitch_1d
    .end packed-switch
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Lcom/fimi/kernel/BaseFragment;->onResume()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->s:Lcom/fimi/soul/view/UpDownSliding;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/UpDownSliding;->b(Landroid/content/Context;)V

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/d;->k()Z

    move-result v0

    iget-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ab:Z

    if-eq v0, v1, :cond_0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;->c:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ag:Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment$e;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/d;->c(Z)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->I:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_1
    return-void
.end method

.method public onStart()V
    .locals 4

    const/4 v3, 0x0

    invoke-super {p0}, Lcom/fimi/kernel/BaseFragment;->onStart()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->af:Lcom/fimi/soul/biz/d/a;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/fimi/soul/biz/d/a;->a()Lcom/fimi/soul/biz/d/a;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->af:Lcom/fimi/soul/biz/d/a;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->af:Lcom/fimi/soul/biz/d/a;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->j:Landroid/widget/ImageButton;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->l:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/biz/d/a;->a(Landroid/widget/ImageButton;Lcom/fimi/soul/drone/a;)V

    :cond_0
    iput-boolean v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->aa:Z

    iput-boolean v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->Z:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->l:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/c$d;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/b/e;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->d()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->l:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->W()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->t()Lcom/fimi/soul/biz/camera/c/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/f;->b()V

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->r:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->r()Lcom/fimi/soul/biz/camera/c/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/c/c;->b()V

    :cond_2
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->b:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/d;->k()Z

    move-result v0

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->ab:Z

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Lcom/fimi/kernel/BaseFragment;->onStop()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->a(Z)V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1
    .param p2    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-super {p0, p1, p2}, Lcom/fimi/kernel/BaseFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->x:Lcom/fimi/soul/module/droneFragment/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/b;->c()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneUiFragment;->d()V

    return-void
.end method
