.class public Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;
.super Lcom/fimi/soul/base/BaseActivity;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;
.implements Lcom/fimi/soul/module/droneTrack/d;
.implements Lcom/fimi/soul/module/droneTrack/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;
    }
.end annotation


# static fields
.field private static final J:I = 0x3


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Landroid/widget/TextView;

.field private C:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

.field private D:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

.field private E:Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;

.field private F:Landroid/support/v4/app/FragmentManager;

.field private G:Lcom/fimi/soul/view/RemotesimulatorView;

.field private H:Lcom/fimi/soul/module/droneTrack/a/c;

.field private final I:I

.field private K:I

.field private L:I

.field private M:Lcom/fimi/soul/module/droneTrack/a/b;

.field private N:Lcom/fimi/soul/module/droneTrack/a/a;

.field private O:Ljava/util/Timer;

.field private final P:I

.field private Q:Z

.field private R:Landroid/widget/TextView;

.field private S:Landroid/widget/RelativeLayout;

.field private T:Landroid/widget/TextView;

.field private U:Landroid/widget/TextView;

.field private V:Landroid/widget/TextView;

.field private W:Landroid/widget/TextView;

.field private X:Landroid/widget/TextView;

.field private Y:Landroid/widget/TextView;

.field private Z:Landroid/widget/TextView;

.field a:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

.field private aa:Landroid/widget/TextView;

.field private ab:Landroid/widget/TextView;

.field private ac:Landroid/widget/TextView;

.field private ad:Landroid/widget/TextView;

.field private ae:Landroid/widget/TextView;

.field private af:Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;

.field private ag:I

.field private ah:Landroid/os/Handler;

.field private ai:Lcom/fimi/soul/module/droneui/a;

.field private aj:D

.field b:I

.field c:I

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/widget/ImageView;

.field private j:Landroid/widget/ImageView;

.field private k:Landroid/widget/ImageView;

.field private l:Landroid/widget/ImageView;

.field private m:Landroid/widget/ImageView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/SeekBar;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/widget/TextView;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/TextView;

.field private z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/fimi/soul/base/BaseActivity;-><init>()V

    invoke-static {}, Lcom/fimi/soul/module/droneTrack/a/c;->a()Lcom/fimi/soul/module/droneTrack/a/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->H:Lcom/fimi/soul/module/droneTrack/a/c;

    const/16 v0, 0x64

    iput v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->I:I

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->K:I

    iput v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->L:I

    invoke-static {}, Lcom/fimi/soul/module/droneTrack/a/b;->a()Lcom/fimi/soul/module/droneTrack/a/b;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->M:Lcom/fimi/soul/module/droneTrack/a/b;

    const/4 v0, 0x1

    iput v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->P:I

    sget-object v0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;->a:Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->af:Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;

    iput v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ag:I

    new-instance v0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$1;-><init>(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ah:Landroid/os/Handler;

    iput v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->b:I

    iput v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->aj:D

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ag:I

    return v0
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;I)I
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ag:I

    return p1
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;)Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->af:Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;

    return-object p1
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;Lcom/fimi/soul/module/droneui/a;)Lcom/fimi/soul/module/droneui/a;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ai:Lcom/fimi/soul/module/droneui/a;

    return-object p1
.end method

.method private a(D)Ljava/lang/String;
    .locals 5

    const-string v0, "%.2f"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(DZ)V
    .locals 9

    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    const v4, 0x7f0e0163

    if-eqz p3, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->M:Lcom/fimi/soul/module/droneTrack/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/b;->j()[D

    move-result-object v0

    :goto_0
    if-nez v0, :cond_2

    :cond_0
    :goto_1
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->M:Lcom/fimi/soul/module/droneTrack/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/b;->i()[D

    move-result-object v0

    goto :goto_0

    :cond_2
    aget-wide v2, v0, v5

    cmpg-double v1, p1, v2

    if-gez v1, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->o:Landroid/widget/TextView;

    const-string v1, "0%"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e0012

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    :cond_3
    aget-wide v2, v0, v5

    cmpl-double v1, p1, v2

    if-ltz v1, :cond_4

    aget-wide v2, v0, v6

    cmpg-double v1, p1, v2

    if-gez v1, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->o:Landroid/widget/TextView;

    const-string v1, "25%"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e0012

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    :cond_4
    aget-wide v2, v0, v6

    cmpl-double v1, p1, v2

    if-ltz v1, :cond_5

    aget-wide v2, v0, v7

    cmpg-double v1, p1, v2

    if-gez v1, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->o:Landroid/widget/TextView;

    const-string v1, "50%"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    :cond_5
    aget-wide v2, v0, v7

    cmpl-double v1, p1, v2

    if-ltz v1, :cond_6

    aget-wide v2, v0, v8

    cmpg-double v1, p1, v2

    if-gez v1, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->o:Landroid/widget/TextView;

    const-string v1, "75%"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_1

    :cond_6
    aget-wide v0, v0, v8

    cmpl-double v0, p1, v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->o:Landroid/widget/TextView;

    const-string v1, "100%"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_1
.end method

.method private a(III)V
    .locals 8

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ai:Lcom/fimi/soul/module/droneui/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ai:Lcom/fimi/soul/module/droneui/a;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneui/a;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ai:Lcom/fimi/soul/module/droneui/a;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneui/a;->dismiss()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ai:Lcom/fimi/soul/module/droneui/a;

    :cond_0
    new-instance v0, Lcom/fimi/soul/module/droneui/a;

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p2}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x3

    const/4 v6, 0x0

    new-instance v7, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$2;

    invoke-direct {v7, p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$2;-><init>(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;)V

    move-object v1, p0

    move v4, p3

    invoke-direct/range {v0 .. v7}, Lcom/fimi/soul/module/droneui/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IIZLcom/fimi/soul/module/droneui/a$a;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ai:Lcom/fimi/soul/module/droneui/a;

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ai:Lcom/fimi/soul/module/droneui/a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneui/a;->setCancelable(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ai:Lcom/fimi/soul/module/droneui/a;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneui/a;->show()V

    return-void
.end method

.method private a(Landroid/widget/ImageView;I)V
    .locals 0

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method private a(Landroid/widget/TextView;)V
    .locals 5

    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x106000d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    const/4 v2, 0x1

    const/4 v3, 0x3

    const/16 v4, 0x21

    invoke-virtual {v1, v0, v2, v3, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private a(Lcom/fimi/soul/drone/h/a/e;)V
    .locals 3

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/a/e;->d()B

    move-result v0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/a/e;->e()B

    move-result v1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/a/e;->f()B

    move-result v2

    invoke-direct {p0, v0, v1, v2}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->b(III)V

    return-void
.end method

.method private a(Lcom/fimi/soul/drone/h/ad;)V
    .locals 9

    const/4 v8, 0x1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->M:Lcom/fimi/soul/module/droneTrack/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/b;->k()Lcom/fimi/soul/drone/h/c;

    move-result-object v0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/ad;->b()S

    move-result v1

    const/16 v2, 0xc

    invoke-static {v1, v2}, Lcom/fimi/soul/utils/ao;->a(II)I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/ad;->b()S

    move-result v1

    const/16 v2, 0xd

    invoke-static {v1, v2}, Lcom/fimi/soul/utils/ao;->a(II)I

    move-result v1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/c;->d()B

    move-result v0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    if-ne v1, v8, :cond_3

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->G:Lcom/fimi/soul/view/RemotesimulatorView;

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/ad;->i()S

    move-result v1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/ad;->h()S

    move-result v2

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/ad;->g()S

    move-result v3

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/ad;->f()S

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/fimi/soul/view/RemotesimulatorView;->a(IIII)V

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/ad;->b()S

    move-result v0

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ao;->a(II)I

    move-result v0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/ad;->c()S

    move-result v1

    int-to-double v2, v1

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    div-double/2addr v2, v4

    iget-wide v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->aj:D

    sub-double v4, v2, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    const-wide v6, 0x3fa999999999999aL    # 0.05

    cmpl-double v1, v4, v6

    if-lez v1, :cond_2

    if-lez v0, :cond_4

    invoke-direct {p0, v2, v3, v8}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(DZ)V

    :goto_1
    iput-wide v2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->aj:D

    :cond_2
    return-void

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->G:Lcom/fimi/soul/view/RemotesimulatorView;

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/ad;->i()S

    move-result v1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/ad;->g()S

    move-result v2

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/ad;->h()S

    move-result v3

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/ad;->f()S

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/fimi/soul/view/RemotesimulatorView;->a(IIII)V

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    invoke-direct {p0, v2, v3, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(DZ)V

    goto :goto_1
.end method

.method private a(Lcom/fimi/soul/drone/h/ag;)V
    .locals 8

    const-wide v0, -0x3f70c80000000000L    # -999.0

    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/ag;->f()D

    move-result-wide v2

    const-wide v4, 0x4124aac000000000L    # 677216.0

    sub-double/2addr v2, v4

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    div-double/2addr v2, v4

    const-wide v4, 0x40a7700000000000L    # 3000.0

    cmpg-double v4, v2, v4

    if-gez v4, :cond_1

    cmpl-double v4, v2, v6

    if-gez v4, :cond_0

    const-wide/16 v4, 0x0

    cmpg-double v4, v2, v4

    if-gez v4, :cond_4

    :cond_0
    cmpg-double v4, v2, v0

    if-gez v4, :cond_6

    :goto_0
    cmpg-double v2, v0, v6

    if-gez v2, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->b(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "m"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->x:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    :cond_1
    :goto_2
    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/ag;->g()D

    move-result-wide v0

    const-wide/high16 v2, -0x3fb7000000000000L    # -50.0

    cmpl-double v2, v0, v2

    if-lez v2, :cond_2

    const-wide v2, 0x40c3880000000000L    # 10000.0

    cmpg-double v2, v0, v2

    if-gez v2, :cond_2

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v2

    if-nez v2, :cond_2

    cmpl-double v2, v0, v6

    if-ltz v2, :cond_5

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    double-to-int v0, v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "m"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->z:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    :cond_2
    :goto_3
    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/ag;->c()B

    move-result v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->g(I)V

    return-void

    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    double-to-int v0, v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "m"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    invoke-direct {p0, v2, v3}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->b(D)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "m"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->x:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    goto :goto_2

    :cond_5
    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->b(D)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "m"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->z:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    goto :goto_3

    :cond_6
    move-wide v0, v2

    goto/16 :goto_0
.end method

.method private a(Lcom/fimi/soul/drone/h/ao;)V
    .locals 1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/ao;->a()B

    move-result v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->h(I)V

    return-void
.end method

.method private a(Lcom/fimi/soul/drone/h/d;)V
    .locals 12

    const-wide/high16 v10, 0x4059000000000000L    # 100.0

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->T:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/d;->i()I

    move-result v2

    add-int/lit8 v2, v2, -0x3c

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const v2, 0x7f0a040e

    invoke-virtual {p0, v2}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->U:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/d;->h()S

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "mA"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/d;->a()I

    move-result v0

    int-to-double v0, v0

    div-double/2addr v0, v10

    add-double/2addr v0, v8

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/d;->b()I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v2, v10

    add-double/2addr v2, v8

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/d;->c()I

    move-result v4

    int-to-double v4, v4

    div-double/2addr v4, v10

    add-double/2addr v4, v8

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/d;->d()I

    move-result v6

    int-to-double v6, v6

    div-double/2addr v6, v10

    add-double/2addr v6, v8

    iget-object v8, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->V:Landroid/widget/TextView;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "V"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->W:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, v2, v3}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "V"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->X:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, v4, v5}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "V"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->Y:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, v6, v7}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "V"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private a(Lcom/fimi/soul/drone/h/y;)V
    .locals 7

    const/4 v6, 0x2

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/y;->a()D

    move-result-wide v0

    div-double/2addr v0, v4

    invoke-static {v0, v1, v6}, Lcom/fimi/kernel/utils/t;->a(DI)D

    move-result-wide v0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/y;->b()D

    move-result-wide v2

    div-double/2addr v2, v4

    invoke-static {v2, v3, v6}, Lcom/fimi/kernel/utils/t;->a(DI)D

    move-result-wide v2

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->t:Landroid/widget/TextView;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "m/s"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->v:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "m/s"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/y;->k()D

    move-result-wide v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    div-double/2addr v0, v2

    double-to-float v0, v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->E:Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;->a(F)V

    return-void
.end method

.method private a(Ljava/lang/String;Landroid/widget/TextView;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->Q:Z

    return p1
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->B:Landroid/widget/TextView;

    return-object v0
.end method

.method private b(D)Ljava/lang/String;
    .locals 5

    const-string v0, "%.1f"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "mm:ss"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/Long;

    invoke-direct {v1, p0}, Ljava/lang/Long;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b()V
    .locals 5

    const v4, 0x7f02035e

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {}, Lcom/fimi/soul/module/droneTrack/b/a;->a()Lcom/fimi/soul/module/droneTrack/b/a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneTrack/b/a;->a(Lcom/fimi/soul/module/droneTrack/a/a;)Lcom/fimi/soul/entity/ErrorMode;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/ErrorMode;->getLightErrorList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget v2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->b:I

    if-gt v1, v2, :cond_2

    iput v3, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->b:I

    :cond_2
    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->ad()Lcom/fimi/soul/drone/h/q;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/q;->S()Z

    move-result v1

    if-eqz v1, :cond_4

    iget v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c:I

    iget v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c:I

    const/4 v2, 0x3

    if-lt v1, v2, :cond_3

    const v1, 0x7f0a0424

    const v2, 0x7f0a014e

    invoke-direct {p0, v1, v2, v4}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(III)V

    iput v3, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c:I

    :cond_3
    :goto_1
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_5

    invoke-direct {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d()V

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->q:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0e0161

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->b:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(Ljava/lang/String;)V

    :goto_2
    iget v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->b:I

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->ad()Lcom/fimi/soul/drone/h/q;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/q;->P()Z

    move-result v1

    if-eqz v1, :cond_3

    iget v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c:I

    iget v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c:I

    const/4 v2, 0x7

    if-lt v1, v2, :cond_3

    const v1, 0x7f0a0425

    const v2, 0x7f0a014f

    invoke-direct {p0, v1, v2, v4}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(III)V

    iput v3, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c:I

    goto :goto_1

    :cond_5
    const-string v0, ""

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c()V

    goto :goto_2
.end method

.method private b(I)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->M:Lcom/fimi/soul/module/droneTrack/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/b;->b()Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_a

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v2, v0, Lcom/fimi/soul/drone/h/ag;

    if-eqz v2, :cond_1

    check-cast v0, Lcom/fimi/soul/drone/h/ag;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v2, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/ag;)V

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->E:Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;

    invoke-virtual {v2, v0}, Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;->a(Lcom/fimi/soul/drone/h/ag;)V

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Lcom/fimi/soul/drone/h/ag;)V

    goto :goto_0

    :cond_1
    instance-of v2, v0, Lcom/fimi/soul/drone/h/z;

    if-eqz v2, :cond_2

    check-cast v0, Lcom/fimi/soul/drone/h/z;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->E:Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v2, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/z;)V

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->E:Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;

    invoke-virtual {v2, v0}, Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;->a(Lcom/fimi/soul/drone/h/z;)V

    goto :goto_0

    :cond_2
    instance-of v2, v0, Lcom/fimi/soul/drone/h/y;

    if-eqz v2, :cond_3

    check-cast v0, Lcom/fimi/soul/drone/h/y;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Lcom/fimi/soul/drone/h/y;)V

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v2, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/y;)V

    goto :goto_0

    :cond_3
    instance-of v2, v0, Lcom/fimi/soul/drone/h/ao;

    if-eqz v2, :cond_4

    check-cast v0, Lcom/fimi/soul/drone/h/ao;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Lcom/fimi/soul/drone/h/ao;)V

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v2, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/ao;)V

    goto :goto_0

    :cond_4
    instance-of v2, v0, Lcom/fimi/soul/drone/h/e;

    if-eqz v2, :cond_5

    check-cast v0, Lcom/fimi/soul/drone/h/e;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v2, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/e;)V

    goto :goto_0

    :cond_5
    instance-of v2, v0, Lcom/fimi/soul/drone/h/d;

    if-eqz v2, :cond_6

    check-cast v0, Lcom/fimi/soul/drone/h/d;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v2, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/d;)V

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->b(Lcom/fimi/soul/drone/h/d;)V

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Lcom/fimi/soul/drone/h/d;)V

    goto :goto_0

    :cond_6
    instance-of v2, v0, Lcom/fimi/soul/drone/h/a/e;

    if-eqz v2, :cond_7

    check-cast v0, Lcom/fimi/soul/drone/h/a/e;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v2, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/a/e;)V

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Lcom/fimi/soul/drone/h/a/e;)V

    goto/16 :goto_0

    :cond_7
    instance-of v2, v0, Lcom/fimi/soul/drone/h/ad;

    if-eqz v2, :cond_8

    check-cast v0, Lcom/fimi/soul/drone/h/ad;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v2, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/ad;)V

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Lcom/fimi/soul/drone/h/ad;)V

    goto/16 :goto_0

    :cond_8
    instance-of v2, v0, Lcom/fimi/soul/drone/h/q;

    if-eqz v2, :cond_9

    check-cast v0, Lcom/fimi/soul/drone/h/q;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v2, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/q;)V

    goto/16 :goto_0

    :cond_9
    instance-of v2, v0, Lcom/fimi/soul/drone/h/a/b;

    if-eqz v2, :cond_0

    check-cast v0, Lcom/fimi/soul/drone/h/a/b;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v2, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/a/b;)V

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/b;->f()B

    move-result v2

    const/4 v3, 0x4

    if-eq v2, v3, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/b;->f()B

    move-result v2

    const/4 v3, 0x5

    if-eq v2, v3, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/b;->f()B

    move-result v2

    const/4 v3, 0x6

    if-eq v2, v3, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->E:Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;

    invoke-virtual {v2, v0}, Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;->a(Lcom/fimi/soul/drone/h/a/b;)V

    goto/16 :goto_0

    :cond_a
    return-void
.end method

.method private b(III)V
    .locals 6

    const v5, 0x7f02016e

    const/4 v4, 0x4

    const v3, 0x7f02033e

    const/4 v2, 0x2

    const/4 v1, 0x1

    if-ne p1, v2, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/a;->j()Z

    move-result v0

    if-nez v0, :cond_1

    if-ne p2, v1, :cond_1

    const v0, 0x7f0a0271

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    invoke-direct {p0, v3}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-ne p1, v1, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/a;->j()Z

    move-result v0

    if-nez v0, :cond_2

    if-ne p2, v1, :cond_2

    const v0, 0x7f0a0210

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    invoke-direct {p0, v3}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto :goto_0

    :cond_2
    if-nez p1, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/a;->j()Z

    move-result v0

    if-nez v0, :cond_3

    if-ne p2, v1, :cond_3

    const v0, 0x7f0a00b7

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    invoke-direct {p0, v3}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto :goto_0

    :cond_3
    if-ne p1, v2, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/a;->j()Z

    move-result v0

    if-eqz v0, :cond_4

    if-ne p2, v1, :cond_4

    const v0, 0x7f0a0270

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    invoke-direct {p0, v3}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto :goto_0

    :cond_4
    if-ne p1, v1, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/a;->j()Z

    move-result v0

    if-eqz v0, :cond_5

    if-ne p2, v1, :cond_5

    const v0, 0x7f0a020f

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    invoke-direct {p0, v3}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto :goto_0

    :cond_5
    if-nez p1, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/a;->j()Z

    move-result v0

    if-eqz v0, :cond_6

    if-ne p2, v1, :cond_6

    const v0, 0x7f0a00b6

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    invoke-direct {p0, v3}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto :goto_0

    :cond_6
    const/4 v0, 0x7

    if-ne p2, v0, :cond_7

    const v0, 0x7f0a0427

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    const v0, 0x7f0203c2

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto :goto_0

    :cond_7
    const/16 v0, 0x8

    if-ne p2, v0, :cond_8

    const v0, 0x7f0a0353

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    const v0, 0x7f0203c2

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto/16 :goto_0

    :cond_8
    const/4 v0, 0x3

    if-ne p2, v0, :cond_9

    const v0, 0x7f0a026b

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    const v0, 0x7f0202e0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto/16 :goto_0

    :cond_9
    const/16 v0, 0x9

    if-ne p2, v0, :cond_a

    const v0, 0x7f0a028c

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    const v0, 0x7f0202e0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto/16 :goto_0

    :cond_a
    if-ne p2, v2, :cond_b

    const v0, 0x7f0a03ff

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    const v0, 0x7f020404

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto/16 :goto_0

    :cond_b
    if-ne p2, v4, :cond_d

    if-ne p3, v4, :cond_c

    const v0, 0x7f0a03ed

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    invoke-direct {p0, v5}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto/16 :goto_0

    :cond_c
    if-ne p3, v2, :cond_0

    const v0, 0x7f0a01e7

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    invoke-direct {p0, v5}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto/16 :goto_0

    :cond_d
    const/4 v0, 0x5

    if-ne p2, v0, :cond_f

    if-ne p3, v4, :cond_e

    const v0, 0x7f0a03ec

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    const v0, 0x7f020170

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto/16 :goto_0

    :cond_e
    if-ne p3, v2, :cond_0

    const v0, 0x7f0a0237

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    const v0, 0x7f020170

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto/16 :goto_0

    :cond_f
    const/4 v0, 0x6

    if-ne p2, v0, :cond_11

    if-ne p3, v4, :cond_10

    const v0, 0x7f0a03ef

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    const v0, 0x7f02028c

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto/16 :goto_0

    :cond_10
    if-ne p3, v2, :cond_0

    const v0, 0x7f0a018f

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    const v0, 0x7f02028c

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto/16 :goto_0

    :cond_11
    const/16 v0, 0xa

    if-ne p2, v0, :cond_13

    if-ne p3, v4, :cond_12

    const v0, 0x7f0a03ee

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    const v0, 0x7f030007

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto/16 :goto_0

    :cond_12
    if-ne p3, v2, :cond_0

    const v0, 0x7f0a0404

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    const v0, 0x7f030007

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto/16 :goto_0

    :cond_13
    const v0, 0x7f0a012b

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->c(I)V

    invoke-direct {p0, v3}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d(I)V

    goto/16 :goto_0
.end method

.method private b(Lcom/fimi/soul/drone/h/d;)V
    .locals 12

    const-wide v10, 0x40b4500000000000L    # 5200.0

    const-wide/16 v8, 0x0

    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/a;->i()Lcom/fimi/soul/drone/h/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/e;->d()S

    move-result v1

    int-to-double v2, v1

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/e;->e()S

    move-result v0

    int-to-double v0, v0

    cmpl-double v4, v8, v0

    if-eqz v4, :cond_0

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/d;->g()S

    move-result v4

    int-to-double v4, v4

    div-double v0, v4, v0

    mul-double/2addr v0, v6

    double-to-int v0, v0

    move v1, v0

    :goto_0
    cmpl-double v0, v8, v2

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/d;->g()S

    move-result v0

    int-to-double v4, v0

    div-double v2, v4, v2

    mul-double/2addr v2, v6

    double-to-int v0, v2

    :goto_1
    if-gez v1, :cond_2

    :goto_2
    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/d;->g()S

    move-result v0

    int-to-double v0, v0

    div-double/2addr v0, v10

    mul-double/2addr v0, v6

    double-to-int v0, v0

    move v1, v0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/d;->g()S

    move-result v0

    int-to-double v2, v0

    div-double/2addr v2, v10

    mul-double/2addr v2, v6

    double-to-int v0, v2

    goto :goto_1

    :cond_2
    if-lez v0, :cond_3

    const/16 v2, 0x1e

    if-ge v0, v2, :cond_3

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->p:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "%"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->p:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e0012

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->p:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0e0163

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->p:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->b(I)V

    return-void
.end method

.method static synthetic c(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;I)I
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->L:I

    return p1
.end method

.method static synthetic c(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;)Landroid/widget/SeekBar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->r:Landroid/widget/SeekBar;

    return-object v0
.end method

.method private c()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->f:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private c(I)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0
.end method

.method private c(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->q:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->q:Landroid/widget/TextView;

    sget-object v1, Landroid/widget/TextView$BufferType;->NORMAL:Landroid/widget/TextView$BufferType;

    invoke-virtual {v0, p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->L:I

    return v0
.end method

.method private d()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->f:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method private d(I)V
    .locals 3

    const v2, 0x7f02033f

    const v0, 0x7f0a0371

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->e:Landroid/widget/ImageView;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->e:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->e:Landroid/widget/ImageView;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->e:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->e:Landroid/widget/ImageView;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method static synthetic d(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->i(I)V

    return-void
.end method

.method static synthetic e(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->A:Landroid/widget/TextView;

    return-object v0
.end method

.method private e()V
    .locals 9

    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v1, 0x0

    const v0, 0x7f0f025f

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->m:Landroid/widget/ImageView;

    const v0, 0x7f0f024a

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->D:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v0, 0x7f0f024b

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->Z:Landroid/widget/TextView;

    const v0, 0x7f0f024d

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->aa:Landroid/widget/TextView;

    const v0, 0x7f0f024f

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ab:Landroid/widget/TextView;

    const v0, 0x7f0f0251

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ac:Landroid/widget/TextView;

    const v0, 0x7f0f0253

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ad:Landroid/widget/TextView;

    const v0, 0x7f0f0255

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ae:Landroid/widget/TextView;

    const v0, 0x7f0f024c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->T:Landroid/widget/TextView;

    const v0, 0x7f0f024e

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->U:Landroid/widget/TextView;

    const v0, 0x7f0f0250

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->V:Landroid/widget/TextView;

    const v0, 0x7f0f0252

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->W:Landroid/widget/TextView;

    const v0, 0x7f0f0254

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->X:Landroid/widget/TextView;

    const v0, 0x7f0f0256

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->Y:Landroid/widget/TextView;

    const v0, 0x7f0f0259

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->S:Landroid/widget/RelativeLayout;

    const v0, 0x7f0f023c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->R:Landroid/widget/TextView;

    const v0, 0x7f0f0262

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v0, 0x7f0f0261

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/RemotesimulatorView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->G:Lcom/fimi/soul/view/RemotesimulatorView;

    const v0, 0x7f0f0240

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->C:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v0, 0x7f0f023f

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->q:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->q:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->requestFocus()Z

    const v0, 0x7f0f0241

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->r:Landroid/widget/SeekBar;

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->r:Landroid/widget/SeekBar;

    invoke-virtual {v0, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    const v0, 0x7f0f0260

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->l:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->l:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f0192

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d:Landroid/widget/ImageView;

    const v0, 0x7f0f0231

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->e:Landroid/widget/ImageView;

    const v0, 0x7f0f0235

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->f:Landroid/widget/ImageView;

    const v0, 0x7f0f0238

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->g:Landroid/widget/ImageView;

    const v0, 0x7f0f023d

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->h:Landroid/widget/ImageView;

    const v0, 0x7f0f025c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->i:Landroid/widget/ImageView;

    const v0, 0x7f0f025d

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->j:Landroid/widget/ImageView;

    const v0, 0x7f0f025e

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->k:Landroid/widget/ImageView;

    const v0, 0x7f0f0234

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->n:Landroid/widget/TextView;

    const v0, 0x7f0f0236

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->o:Landroid/widget/TextView;

    const v0, 0x7f0f023a

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->p:Landroid/widget/TextView;

    const v0, 0x7f0f0242

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->s:Landroid/widget/TextView;

    const v0, 0x7f0f0243

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->t:Landroid/widget/TextView;

    const v0, 0x7f0f0244

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->u:Landroid/widget/TextView;

    const v0, 0x7f0f0245

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->v:Landroid/widget/TextView;

    const v0, 0x7f0f0246

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->w:Landroid/widget/TextView;

    const v0, 0x7f0f0247

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->x:Landroid/widget/TextView;

    const v0, 0x7f0f0248

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->y:Landroid/widget/TextView;

    const v0, 0x7f0f0249

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->z:Landroid/widget/TextView;

    const v0, 0x7f0f0258

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->A:Landroid/widget/TextView;

    const v0, 0x7f0f025b

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->B:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/16 v2, 0xe

    new-array v2, v2, [Landroid/view/View;

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->p:Landroid/widget/TextView;

    aput-object v3, v2, v1

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->o:Landroid/widget/TextView;

    aput-object v3, v2, v5

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->t:Landroid/widget/TextView;

    aput-object v3, v2, v6

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->v:Landroid/widget/TextView;

    aput-object v3, v2, v7

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->x:Landroid/widget/TextView;

    aput-object v3, v2, v8

    const/4 v3, 0x5

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->z:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x6

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->A:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x7

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->B:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0x8

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->Z:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0x9

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->aa:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0xa

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ab:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0xb

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ac:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0xc

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ad:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0xd

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ae:Landroid/widget/TextView;

    aput-object v4, v2, v3

    invoke-static {v0, v2}, Lcom/fimi/soul/utils/ao;->b(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/16 v2, 0xc

    new-array v2, v2, [Landroid/view/View;

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->n:Landroid/widget/TextView;

    aput-object v3, v2, v1

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->s:Landroid/widget/TextView;

    aput-object v3, v2, v5

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->u:Landroid/widget/TextView;

    aput-object v3, v2, v6

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->w:Landroid/widget/TextView;

    aput-object v3, v2, v7

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->y:Landroid/widget/TextView;

    aput-object v3, v2, v8

    const/4 v3, 0x5

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->q:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x6

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->T:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x7

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->U:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0x8

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->V:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0x9

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->W:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0xa

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->X:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0xb

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->Y:Landroid/widget/TextView;

    aput-object v4, v2, v3

    invoke-static {v0, v2}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    const/4 v0, 0x7

    new-array v2, v0, [Landroid/view/View;

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->d:Landroid/widget/ImageView;

    aput-object v0, v2, v1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->l:Landroid/widget/ImageView;

    aput-object v0, v2, v5

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->k:Landroid/widget/ImageView;

    aput-object v0, v2, v6

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->j:Landroid/widget/ImageView;

    aput-object v0, v2, v7

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->S:Landroid/widget/RelativeLayout;

    aput-object v0, v2, v8

    const/4 v0, 0x5

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->i:Landroid/widget/ImageView;

    aput-object v3, v2, v0

    const/4 v0, 0x6

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->m:Landroid/widget/ImageView;

    aput-object v3, v2, v0

    array-length v3, v2

    move v0, v1

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v1, v2, v0

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private e(I)V
    .locals 10

    invoke-static {}, Lcom/fimi/soul/module/droneTrack/a/b;->a()Lcom/fimi/soul/module/droneTrack/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/b;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p1, :cond_f

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->M:Lcom/fimi/soul/module/droneTrack/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/b;->b()Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_d

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v4, v0, Lcom/fimi/soul/drone/h/ag;

    if-eqz v4, :cond_1

    check-cast v0, Lcom/fimi/soul/drone/h/ag;

    if-eqz v0, :cond_0

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v4, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/ag;)V

    new-instance v4, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ag;->e()D

    move-result-wide v6

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ag;->d()D

    move-result-wide v8

    invoke-direct {v4, v6, v7, v8, v9}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    instance-of v4, v0, Lcom/fimi/soul/drone/h/z;

    if-eqz v4, :cond_2

    check-cast v0, Lcom/fimi/soul/drone/h/z;

    if-eqz v0, :cond_0

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->E:Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v4, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/z;)V

    goto :goto_1

    :cond_2
    instance-of v4, v0, Lcom/fimi/soul/drone/h/y;

    if-eqz v4, :cond_3

    check-cast v0, Lcom/fimi/soul/drone/h/y;

    if-eqz v0, :cond_0

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v4, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/y;)V

    goto :goto_1

    :cond_3
    instance-of v4, v0, Lcom/fimi/soul/drone/h/ao;

    if-eqz v4, :cond_4

    check-cast v0, Lcom/fimi/soul/drone/h/ao;

    if-eqz v0, :cond_0

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v4, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/ao;)V

    goto :goto_1

    :cond_4
    instance-of v4, v0, Lcom/fimi/soul/drone/h/e;

    if-eqz v4, :cond_5

    check-cast v0, Lcom/fimi/soul/drone/h/e;

    if-eqz v0, :cond_0

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v4, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/e;)V

    goto :goto_1

    :cond_5
    instance-of v4, v0, Lcom/fimi/soul/drone/h/d;

    if-eqz v4, :cond_6

    check-cast v0, Lcom/fimi/soul/drone/h/d;

    if-eqz v0, :cond_0

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v4, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/d;)V

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->b(Lcom/fimi/soul/drone/h/d;)V

    goto :goto_1

    :cond_6
    instance-of v4, v0, Lcom/fimi/soul/drone/h/a/e;

    if-eqz v4, :cond_7

    check-cast v0, Lcom/fimi/soul/drone/h/a/e;

    if-eqz v0, :cond_0

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v4, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/a/e;)V

    goto/16 :goto_1

    :cond_7
    instance-of v4, v0, Lcom/fimi/soul/drone/h/ad;

    if-eqz v4, :cond_8

    check-cast v0, Lcom/fimi/soul/drone/h/ad;

    if-eqz v0, :cond_0

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v4, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/ad;)V

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Lcom/fimi/soul/drone/h/ad;)V

    goto/16 :goto_1

    :cond_8
    instance-of v4, v0, Lcom/fimi/soul/drone/h/e;

    if-eqz v4, :cond_9

    check-cast v0, Lcom/fimi/soul/drone/h/e;

    if-eqz v0, :cond_0

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v4, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/e;)V

    goto/16 :goto_1

    :cond_9
    instance-of v4, v0, Lcom/fimi/soul/drone/h/c;

    if-eqz v4, :cond_a

    check-cast v0, Lcom/fimi/soul/drone/h/c;

    if-eqz v0, :cond_0

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v4, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/c;)V

    goto/16 :goto_1

    :cond_a
    instance-of v4, v0, Lcom/fimi/soul/drone/h/e;

    if-eqz v4, :cond_b

    check-cast v0, Lcom/fimi/soul/drone/h/e;

    if-eqz v0, :cond_0

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v4, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/e;)V

    goto/16 :goto_1

    :cond_b
    instance-of v4, v0, Lcom/fimi/soul/drone/h/c;

    if-eqz v4, :cond_c

    check-cast v0, Lcom/fimi/soul/drone/h/c;

    if-eqz v0, :cond_0

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v4, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/c;)V

    goto/16 :goto_1

    :cond_c
    instance-of v4, v0, Lcom/fimi/soul/drone/h/a/b;

    if-eqz v4, :cond_0

    check-cast v0, Lcom/fimi/soul/drone/h/a/b;

    if-eqz v0, :cond_0

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-virtual {v4, v0}, Lcom/fimi/soul/module/droneTrack/a/a;->a(Lcom/fimi/soul/drone/h/a/b;)V

    goto/16 :goto_1

    :cond_d
    add-int/lit8 v0, p1, -0x1

    if-ne v1, v0, :cond_e

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_e

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->E:Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v3, v0, v2}, Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;->a(Lcom/google/android/gms/maps/model/LatLng;Ljava/util/List;)V

    :cond_e
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto/16 :goto_0

    :cond_f
    return-void
.end method

.method static synthetic f(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;)I
    .locals 2

    iget v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->L:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->L:I

    return v0
.end method

.method private f(I)V
    .locals 2

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->k:Landroid/widget/ImageView;

    const v1, 0x7f0200d2

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->k:Landroid/widget/ImageView;

    const v1, 0x7f0200d1

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    goto :goto_0
.end method

.method static synthetic g(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;)Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->E:Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;

    return-object v0
.end method

.method private g(I)V
    .locals 8

    const/16 v7, 0x10

    const/16 v6, 0xc

    const/16 v5, 0x8

    const/4 v4, 0x4

    const/4 v3, 0x2

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->R:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-ge p1, v3, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->h:Landroid/widget/ImageView;

    const v1, 0x7f03000e

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-lt p1, v3, :cond_2

    if-ge p1, v4, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->h:Landroid/widget/ImageView;

    const v1, 0x7f03000f

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    goto :goto_0

    :cond_2
    if-lt p1, v4, :cond_3

    if-ge p1, v5, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->h:Landroid/widget/ImageView;

    const v1, 0x7f030010

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    goto :goto_0

    :cond_3
    if-lt p1, v5, :cond_4

    if-ge p1, v6, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->h:Landroid/widget/ImageView;

    const v1, 0x7f030011

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    goto :goto_0

    :cond_4
    if-lt p1, v6, :cond_5

    if-ge p1, v7, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->h:Landroid/widget/ImageView;

    const v1, 0x7f030012

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    goto :goto_0

    :cond_5
    if-lt p1, v7, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->h:Landroid/widget/ImageView;

    const v1, 0x7f030013

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    goto :goto_0
.end method

.method static synthetic h(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;)Lcom/fimi/soul/module/droneTrack/a/b;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->M:Lcom/fimi/soul/module/droneTrack/a/b;

    return-object v0
.end method

.method private h(I)V
    .locals 5

    const/16 v4, 0x50

    const/16 v3, 0x41

    const/16 v2, 0x32

    const/16 v1, 0x23

    const/16 v0, 0x19

    if-ge p1, v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->g:Landroid/widget/ImageView;

    const v1, 0x7f03000e

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-lt p1, v0, :cond_2

    if-ge p1, v1, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->g:Landroid/widget/ImageView;

    const v1, 0x7f03000f

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    goto :goto_0

    :cond_2
    if-lt p1, v1, :cond_3

    if-ge p1, v2, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->g:Landroid/widget/ImageView;

    const v1, 0x7f030010

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    goto :goto_0

    :cond_3
    if-lt p1, v2, :cond_4

    if-ge p1, v3, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->g:Landroid/widget/ImageView;

    const v1, 0x7f030011

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    goto :goto_0

    :cond_4
    if-lt p1, v3, :cond_5

    if-ge p1, v4, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->g:Landroid/widget/ImageView;

    const v1, 0x7f030012

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    goto :goto_0

    :cond_5
    if-lt p1, v4, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->g:Landroid/widget/ImageView;

    const v1, 0x7f030013

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    goto :goto_0
.end method

.method static synthetic i(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->K:I

    return v0
.end method

.method private i(I)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->l:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method static synthetic j(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ah:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic k(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->b()V

    return-void
.end method

.method static synthetic l(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;)Lcom/fimi/soul/module/droneui/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ai:Lcom/fimi/soul/module/droneui/a;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ah:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public a(I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->f(I)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 7

    const v6, 0x7f030005

    const v5, 0x10a0002

    const/4 v4, 0x3

    const/16 v3, 0x8

    const/4 v2, 0x0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :goto_0
    return-void

    :sswitch_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->finish()V

    goto :goto_0

    :sswitch_1
    iget-boolean v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->Q:Z

    if-nez v0, :cond_0

    const-string v0, "\u6b63\u5728\u52a0\u8f7d\u6570\u636e"

    const/16 v1, 0xbb8

    invoke-static {p0, v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->af:Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;

    sget-object v1, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;->a:Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;

    if-ne v0, v1, :cond_2

    iget v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->L:I

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->r:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getMax()I

    move-result v1

    if-eq v0, v1, :cond_1

    const v0, 0x7f0200ce

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->i(I)V

    sget-object v0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;->b:Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->af:Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;

    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ah:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    :cond_1
    iput v2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->L:I

    invoke-direct {p0, v6}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->i(I)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ah:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeMessages(I)V

    invoke-direct {p0, v6}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->i(I)V

    sget-object v0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;->a:Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->af:Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->E:Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;->a()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->f(I)V

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->G:Lcom/fimi/soul/view/RemotesimulatorView;

    invoke-virtual {v0}, Lcom/fimi/soul/view/RemotesimulatorView;->isShown()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->j:Landroid/widget/ImageView;

    const v1, 0x7f0200d0

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->G:Lcom/fimi/soul/view/RemotesimulatorView;

    invoke-virtual {v0, v3}, Lcom/fimi/soul/view/RemotesimulatorView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->G:Lcom/fimi/soul/view/RemotesimulatorView;

    const v1, 0x10a0003

    invoke-static {p0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/RemotesimulatorView;->setAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->j:Landroid/widget/ImageView;

    const v1, 0x7f0200cf

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->G:Lcom/fimi/soul/view/RemotesimulatorView;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/RemotesimulatorView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->G:Lcom/fimi/soul/view/RemotesimulatorView;

    const v1, 0x7f05000c

    invoke-static {p0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/RemotesimulatorView;->setAnimation(Landroid/view/animation/Animation;)V

    goto/16 :goto_0

    :sswitch_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->C:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->isShown()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->i:Landroid/widget/ImageView;

    const v1, 0x7f0200cd

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->C:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->C:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v1, 0x7f05000b

    invoke-static {p0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setAnimation(Landroid/view/animation/Animation;)V

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->i:Landroid/widget/ImageView;

    const v1, 0x7f0200cc

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->C:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->C:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-static {p0, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setAnimation(Landroid/view/animation/Animation;)V

    goto/16 :goto_0

    :sswitch_5
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->D:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->isShown()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->m:Landroid/widget/ImageView;

    const v1, 0x7f0200c9

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->D:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->D:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v1, 0x7f05000b

    invoke-static {p0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setAnimation(Landroid/view/animation/Animation;)V

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->m:Landroid/widget/ImageView;

    const v1, 0x7f0200c8

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a(Landroid/widget/ImageView;I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->D:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->D:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-static {p0, v5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setAnimation(Landroid/view/animation/Animation;)V

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x7f0f0192 -> :sswitch_0
        0x7f0f0259 -> :sswitch_1
        0x7f0f025c -> :sswitch_4
        0x7f0f025d -> :sswitch_3
        0x7f0f025e -> :sswitch_2
        0x7f0f025f -> :sswitch_5
        0x7f0f0260 -> :sswitch_1
    .end sparse-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    const v2, 0x7f0f0162

    const/16 v1, 0x80

    invoke-super {p0, p1}, Lcom/fimi/soul/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    const v0, 0x7f04005d

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->setContentView(I)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->e()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->F:Landroid/support/v4/app/FragmentManager;

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->F:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->E:Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->E:Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;

    invoke-direct {v0}, Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->E:Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->F:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->E:Lcom/fimi/soul/module/droneTrack/PalyBackMapFragment;

    invoke-virtual {v0, v2, v1}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    :cond_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "path"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->H:Lcom/fimi/soul/module/droneTrack/a/c;

    invoke-virtual {v1, v0, p0}, Lcom/fimi/soul/module/droneTrack/a/c;->a(Ljava/lang/String;Lcom/fimi/soul/module/droneTrack/e;)V

    :cond_1
    new-instance v0, Lcom/fimi/soul/module/droneTrack/a/a;

    invoke-direct {v0}, Lcom/fimi/soul/module/droneTrack/a/a;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->O:Ljava/util/Timer;

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->O:Ljava/util/Timer;

    new-instance v1, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$3;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$3;-><init>(Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;)V

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0xbb8

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method protected onDestroy()V
    .locals 2

    const/4 v1, 0x3

    invoke-static {}, Lcom/fimi/soul/module/droneTrack/a/b;->a()Lcom/fimi/soul/module/droneTrack/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/b;->d()V

    invoke-static {}, Lcom/fimi/soul/module/droneTrack/a/c;->a()Lcom/fimi/soul/module/droneTrack/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/c;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->N:Lcom/fimi/soul/module/droneTrack/a/a;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ah:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ah:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->Q:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->O:Ljava/util/Timer;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->O:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    :cond_2
    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    const/4 v1, 0x3

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ah:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ah:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    :cond_0
    iput p2, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->L:I

    return-void
.end method

.method protected onResume()V
    .locals 2

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onResume()V

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->Q:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->a:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method protected onStart()V
    .locals 0

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onStart()V

    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method protected onStop()V
    .locals 2

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onStop()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->af:Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;

    sget-object v1, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;->b:Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ah:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    const v0, 0x7f030005

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->i(I)V

    sget-object v0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;->a:Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;

    iput-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->af:Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;

    :cond_0
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 5

    const/4 v4, 0x3

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->af:Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;

    sget-object v1, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;->b:Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity$a;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ah:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->ah:Landroid/os/Handler;

    iget v1, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->K:I

    int-to-long v2, v1

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->A:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v2

    mul-int/lit16 v2, v2, 0x3e8

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneTrack/PlayBackDroneTrackActivity;->e(I)V

    return-void
.end method
