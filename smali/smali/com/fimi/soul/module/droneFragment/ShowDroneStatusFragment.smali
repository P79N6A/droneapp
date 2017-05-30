.class public Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;
.super Landroid/support/v4/app/Fragment;

# interfaces
.implements Lcom/fimi/soul/drone/d$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;
    }
.end annotation


# static fields
.field private static M:F = 0.0f

.field private static final T:I = 0x1

.field private static final U:I = 0x0

.field private static final Z:D = 0.20000000298023224

.field private static final aa:D = 0.4000000059604645

.field private static final ad:I = 0x1

.field private static final ae:I = 0x2

.field private static final af:I = 0x3

.field public static e:I


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Landroid/widget/TextView;

.field private C:Landroid/widget/TextView;

.field private D:Landroid/widget/TextView;

.field private E:Landroid/content/Context;

.field private F:Lcom/fimi/soul/drone/a;

.field private G:Lcom/fimi/soul/base/DroidPlannerApp;

.field private H:Z

.field private I:I

.field private J:Lcom/fimi/soul/view/EVview;

.field private K:Landroid/widget/LinearLayout;

.field private L:Landroid/widget/TextView;

.field private N:Lcom/fimi/soul/view/LightView;

.field private O:D

.field private P:I

.field private Q:Z

.field private R:Z

.field private S:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;

.field private V:Z

.field private W:Z

.field private X:Z

.field private Y:Z

.field a:Lcom/fimi/soul/biz/manager/t;

.field private ab:Lcom/fimi/soul/entity/BatteryOverDischange;

.field private ac:Lcom/fimi/soul/utils/d;

.field private ag:Landroid/os/Handler;

.field private ah:Z

.field private ai:D

.field private aj:D

.field b:Ljava/util/Timer;

.field c:Ljava/util/Timer;

.field d:Lcom/fimi/soul/module/setting/newhand/c;

.field f:Z

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

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
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    iput-boolean v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->H:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->O:D

    iput v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->P:I

    iput-boolean v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->Q:Z

    iput-boolean v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->R:Z

    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->S:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;

    iput-boolean v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->V:Z

    iput-boolean v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->W:Z

    iput-boolean v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->X:Z

    iput-boolean v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->Y:Z

    new-instance v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$1;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ag:Landroid/os/Handler;

    iput-boolean v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ah:Z

    iput-boolean v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->f:Z

    return-void
.end method

.method private a()D
    .locals 12

    const/4 v0, 0x0

    const/4 v10, 0x4

    const-wide/high16 v8, 0x4059000000000000L    # 100.0

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    new-array v5, v10, [D

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/d;->a()I

    move-result v1

    int-to-double v2, v1

    div-double/2addr v2, v8

    add-double/2addr v2, v6

    aput-wide v2, v5, v0

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/d;->b()I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v2, v8

    add-double/2addr v2, v6

    aput-wide v2, v5, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/d;->c()I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v2, v8

    add-double/2addr v2, v6

    aput-wide v2, v5, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/d;->d()I

    move-result v2

    int-to-double v2, v2

    div-double/2addr v2, v8

    add-double/2addr v2, v6

    aput-wide v2, v5, v1

    const-wide/16 v2, 0x0

    move v4, v0

    :goto_0
    if-ge v4, v10, :cond_2

    add-int/lit8 v0, v4, 0x1

    move v11, v0

    move-wide v0, v2

    move v2, v11

    :goto_1
    if-ge v2, v10, :cond_1

    aget-wide v6, v5, v2

    aget-wide v8, v5, v4

    sub-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    cmpl-double v3, v6, v0

    if-lez v3, :cond_0

    aget-wide v0, v5, v2

    aget-wide v6, v5, v4

    sub-double/2addr v0, v6

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v4, 0x1

    move v4, v2

    move-wide v2, v0

    goto :goto_0

    :cond_2
    return-wide v2
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;)Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->K:Landroid/widget/LinearLayout;

    return-object v0
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

.method static synthetic b(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->E:Landroid/content/Context;

    return-object v0
.end method

.method private b(I)Ljava/lang/String;
    .locals 4

    int-to-double v0, p1

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    add-double/2addr v0, v2

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/t;->b(DI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b()Z
    .locals 11

    const/4 v10, 0x4

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/high16 v8, 0x4059000000000000L    # 100.0

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    new-array v3, v10, [D

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/d;->a()I

    move-result v2

    int-to-double v4, v2

    div-double/2addr v4, v8

    add-double/2addr v4, v6

    aput-wide v4, v3, v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/d;->b()I

    move-result v2

    int-to-double v4, v2

    div-double/2addr v4, v8

    add-double/2addr v4, v6

    aput-wide v4, v3, v0

    const/4 v2, 0x2

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v4}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v4

    invoke-virtual {v4}, Lcom/fimi/soul/drone/h/d;->c()I

    move-result v4

    int-to-double v4, v4

    div-double/2addr v4, v8

    add-double/2addr v4, v6

    aput-wide v4, v3, v2

    const/4 v2, 0x3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v4}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v4

    invoke-virtual {v4}, Lcom/fimi/soul/drone/h/d;->d()I

    move-result v4

    int-to-double v4, v4

    div-double/2addr v4, v8

    add-double/2addr v4, v6

    aput-wide v4, v3, v2

    move v2, v1

    :goto_0
    if-ge v2, v10, :cond_1

    aget-wide v4, v3, v2

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    cmpg-double v4, v4, v6

    if-gez v4, :cond_0

    :goto_1
    return v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_1
.end method

.method static synthetic c(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->B:Landroid/widget/TextView;

    return-object v0
.end method

.method private c()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->d:Lcom/fimi/soul/module/setting/newhand/c;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/newhand/c;->e()V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->e()V

    return-void
.end method

.method private c(I)V
    .locals 10

    const-wide/high16 v8, 0x4059000000000000L    # 100.0

    const/4 v6, 0x5

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ac:Lcom/fimi/soul/utils/d;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->E:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/utils/d;->a(Landroid/content/Context;)Lcom/fimi/soul/utils/d;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ac:Lcom/fimi/soul/utils/d;

    :cond_0
    new-instance v0, Lcom/fimi/soul/entity/BatteryOverDischange;

    invoke-direct {v0}, Lcom/fimi/soul/entity/BatteryOverDischange;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/d;->a()I

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/d;->b()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/d;->c()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/d;->d()I

    move-result v1

    add-int/2addr v0, v1

    int-to-double v0, v0

    div-double/2addr v0, v8

    const-wide/high16 v2, 0x4020000000000000L    # 8.0

    add-double/2addr v0, v2

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    const/4 v3, 0x2

    invoke-static {v0, v1, v3}, Lcom/fimi/kernel/utils/t;->b(DI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/fimi/soul/entity/BatteryOverDischange;->setVoltage(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/d;->g()S

    move-result v0

    if-gez v0, :cond_1

    const/4 v0, 0x0

    :cond_1
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/entity/BatteryOverDischange;->setBatteryCurrent(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/d;->i()I

    move-result v2

    add-int/lit8 v2, v2, -0x3c

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    invoke-virtual {v2, v1}, Lcom/fimi/soul/entity/BatteryOverDischange;->setTemperature(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->D()Lcom/fimi/soul/drone/h/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/e;->e()S

    move-result v1

    int-to-double v2, v1

    iput-wide v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ai:D

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->D()Lcom/fimi/soul/drone/h/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/e;->d()S

    move-result v1

    int-to-double v2, v1

    iput-wide v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->aj:D

    iget-wide v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->aj:D

    iget-wide v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ai:D

    cmpl-double v1, v2, v4

    if-lez v1, :cond_3

    iget-wide v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->aj:D

    double-to-int v1, v2

    :goto_0
    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ""

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/fimi/soul/entity/BatteryOverDischange;->setBatteryFull(Ljava/lang/String;)V

    int-to-double v0, v0

    iget-wide v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ai:D

    div-double/2addr v0, v2

    mul-double/2addr v0, v8

    double-to-int v0, v0

    sput v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->e:I

    sget v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->e:I

    const/16 v1, 0x1e

    if-gt v0, v1, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/BatteryOverDischange;->setBatteryLevel(Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->E:Landroid/content/Context;

    invoke-static {v1}, Lcom/fimi/soul/base/a;->b(Landroid/content/Context;)Lcom/fimi/soul/entity/User;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/entity/User;->getUserID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/BatteryOverDischange;->setUserId(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    invoke-static {}, Lcom/fimi/soul/module/update/a/a;->a()Lcom/fimi/soul/module/update/a/a;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/fimi/soul/module/update/a/a;->a(I)Lcom/fimi/soul/module/update/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/e;->i()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    const-string v0, "0"

    :goto_2
    invoke-virtual {v1, v0}, Lcom/fimi/soul/entity/BatteryOverDischange;->setBatteryId(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/d;->j()S

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/BatteryOverDischange;->setBatteryLevel(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/d;->a()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/BatteryOverDischange;->setBatteryOne(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/d;->b()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/BatteryOverDischange;->setBatteryTwo(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/d;->c()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/BatteryOverDischange;->setBatteryThree(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/d;->d()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/BatteryOverDischange;->setBatteryFour(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->D()Lcom/fimi/soul/drone/h/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/e;->c()S

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/BatteryOverDischange;->setBatteryRecyle(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/fimi/soul/module/update/a/a;->a()Lcom/fimi/soul/module/update/a/a;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/fimi/soul/module/update/a/a;->a(I)Lcom/fimi/soul/module/update/a/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/module/update/a/e;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/BatteryOverDischange;->setVersion(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    const-string v1, "0"

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/BatteryOverDischange;->setAppType(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/entity/BatteryOverDischange;->setAccidentType(I)V

    invoke-static {}, Lcom/fimi/kernel/c;->c()Lcom/fimi/kernel/c/a;

    move-result-object v0

    const-string v1, "sp_firmware_cache"

    const-class v2, Lcom/fimi/soul/module/update/a/b;

    invoke-interface {v0, v1, v2}, Lcom/fimi/kernel/c/a;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/update/a/b;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/b;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/fimi/soul/entity/BatteryOverDischange;->setFcVersion(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/d;->m()B

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/BatteryOverDischange;->setUpdateTimes(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/d;->h()S

    move-result v1

    neg-int v1, v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/BatteryOverDischange;->setUpdateTimes(Ljava/lang/String;)V

    new-instance v0, Lcom/fimi/soul/biz/f/a;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fimi/soul/biz/f/a;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/f/a;->a(Lcom/fimi/soul/entity/BatteryOverDischange;)V

    return-void

    :cond_3
    iget-wide v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ai:D

    double-to-int v1, v2

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ab:Lcom/fimi/soul/entity/BatteryOverDischange;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/BatteryOverDischange;->setBatteryLevel(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_5
    invoke-static {}, Lcom/fimi/soul/module/update/a/a;->a()Lcom/fimi/soul/module/update/a/a;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/fimi/soul/module/update/a/a;->a(I)Lcom/fimi/soul/module/update/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/e;->i()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_2
.end method

.method private d(I)F
    .locals 5

    const/16 v4, 0x138

    const/16 v3, 0xea

    const/16 v2, 0x9c

    const/16 v1, 0x4e

    const/4 v0, 0x0

    if-ltz p1, :cond_1

    if-gt p1, v1, :cond_1

    const/high16 v0, -0x40000000    # -2.0f

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-le p1, v1, :cond_2

    if-gt p1, v2, :cond_2

    const v0, -0x40266666    # -1.7f

    goto :goto_0

    :cond_2
    if-le p1, v2, :cond_3

    if-gt p1, v3, :cond_3

    const v0, -0x4059999a    # -1.3f

    goto :goto_0

    :cond_3
    if-le p1, v3, :cond_4

    if-gt p1, v4, :cond_4

    const/high16 v0, -0x40800000    # -1.0f

    goto :goto_0

    :cond_4
    if-le p1, v4, :cond_5

    const/16 v1, 0x186

    if-gt p1, v1, :cond_5

    const v0, -0x40cccccd    # -0.7f

    goto :goto_0

    :cond_5
    const/16 v1, 0x186

    if-le p1, v1, :cond_6

    const/16 v1, 0x1d4

    if-gt p1, v1, :cond_6

    const v0, -0x41666666    # -0.3f

    goto :goto_0

    :cond_6
    const/16 v1, 0x1d4

    if-le p1, v1, :cond_7

    const/16 v1, 0x222

    if-le p1, v1, :cond_0

    :cond_7
    const/16 v1, 0x222

    if-le p1, v1, :cond_8

    const/16 v1, 0x270

    if-gt p1, v1, :cond_8

    const v0, 0x3e99999a    # 0.3f

    goto :goto_0

    :cond_8
    const/16 v1, 0x270

    if-le p1, v1, :cond_9

    const/16 v1, 0x2be

    if-gt p1, v1, :cond_9

    const v0, 0x3f333333    # 0.7f

    goto :goto_0

    :cond_9
    const/16 v1, 0x2be

    if-le p1, v1, :cond_a

    const/16 v1, 0x30c

    if-gt p1, v1, :cond_a

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_a
    const/16 v1, 0x30c

    if-le p1, v1, :cond_b

    const/16 v1, 0x35a

    if-gt p1, v1, :cond_b

    const v0, 0x3fa66666    # 1.3f

    goto :goto_0

    :cond_b
    const/16 v1, 0x35a

    if-le p1, v1, :cond_c

    const/16 v1, 0x3a8

    if-gt p1, v1, :cond_c

    const v0, 0x3fd9999a    # 1.7f

    goto :goto_0

    :cond_c
    const/16 v1, 0x3a8

    if-le p1, v1, :cond_0

    const/16 v1, 0x400

    if-gt p1, v1, :cond_0

    const/high16 v0, 0x40000000    # 2.0f

    goto :goto_0
.end method

.method static synthetic d(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ag:Landroid/os/Handler;

    return-object v0
.end method

.method private d()V
    .locals 11

    const/16 v10, 0x1e

    const/4 v1, 0x0

    const-wide/16 v8, 0x0

    const v7, 0x7f0e003e

    const v6, 0x7f0e003d

    iget-wide v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ai:D

    cmpl-double v0, v2, v8

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->w()Lcom/fimi/soul/drone/h/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/d;->g()S

    move-result v0

    if-gez v0, :cond_0

    move v0, v1

    :cond_0
    int-to-double v2, v0

    iget-wide v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ai:D

    div-double/2addr v2, v4

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    mul-double/2addr v2, v4

    double-to-int v0, v2

    sput v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->e:I

    sget v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->e:I

    if-gez v0, :cond_2

    :cond_1
    :goto_0
    return-void

    :cond_2
    sget v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->e:I

    const/16 v2, 0x64

    if-le v0, v2, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ah:Z

    iput-wide v8, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ai:D

    goto :goto_0

    :cond_3
    sget v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->e:I

    if-lez v0, :cond_4

    sget v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->e:I

    if-ge v0, v10, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->m:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->i:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->q:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->r:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_1
    sget v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->e:I

    if-gt v0, v10, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->i:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget v3, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->e:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->r:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    const-string v0, "%"

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->q:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    const v0, 0x7f0a017c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->m:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->q:Landroid/widget/TextView;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->aP:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->m:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->i:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->q:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->r:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_1

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->i:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget v3, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->e:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2
.end method

.method private e(I)F
    .locals 5

    const/16 v4, 0x222

    const/16 v3, 0x1d4

    const/16 v2, 0x138

    const/16 v1, 0x9c

    const/4 v0, 0x0

    if-ltz p1, :cond_1

    if-gt p1, v1, :cond_1

    const/high16 v0, -0x40000000    # -2.0f

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-le p1, v1, :cond_2

    if-gt p1, v2, :cond_2

    const v0, -0x4059999a    # -1.3f

    goto :goto_0

    :cond_2
    if-le p1, v2, :cond_3

    if-gt p1, v3, :cond_3

    const v0, -0x40cccccd    # -0.7f

    goto :goto_0

    :cond_3
    if-le p1, v3, :cond_4

    if-le p1, v4, :cond_0

    :cond_4
    if-le p1, v4, :cond_5

    const/16 v1, 0x2be

    if-gt p1, v1, :cond_5

    const v0, 0x3f333333    # 0.7f

    goto :goto_0

    :cond_5
    const/16 v1, 0x2be

    if-le p1, v1, :cond_6

    const/16 v1, 0x35a

    if-gt p1, v1, :cond_6

    const v0, 0x3fa66666    # 1.3f

    goto :goto_0

    :cond_6
    const/16 v1, 0x35a

    if-le p1, v1, :cond_0

    const/16 v1, 0x400

    if-gt p1, v1, :cond_0

    const/high16 v0, 0x40000000    # 2.0f

    goto :goto_0
.end method

.method private e()V
    .locals 2

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bf;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/bf;-><init>()V

    const/16 v1, 0x73

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/bf;->d:B

    const/4 v1, 0x1

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/bf;->e:B

    const/4 v1, 0x0

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/bf;->f:B

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/fimi/soul/drone/c/a/a/bf;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->B:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->A:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public a(Z)V
    .locals 2

    const/16 v1, 0x8

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->K:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->C:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->D:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    iput-boolean p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->f:Z

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->E:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/base/DroidPlannerApp;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->G:Lcom/fimi/soul/base/DroidPlannerApp;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/t;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/t;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a:Lcom/fimi/soul/biz/manager/t;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v9, 0x3

    const/4 v8, 0x2

    const/4 v7, 0x4

    const/4 v6, 0x0

    const/4 v5, 0x1

    const v0, 0x7f0400d4

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f0f043c

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    const v0, 0x7f0f043d

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->s:Landroid/widget/TextView;

    const v0, 0x7f0f043e

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->t:Landroid/widget/TextView;

    const v0, 0x7f0f029c

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/EVview;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->J:Lcom/fimi/soul/view/EVview;

    const v0, 0x7f0f029d

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/LightView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->N:Lcom/fimi/soul/view/LightView;

    const v0, 0x7f0f029b

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->L:Landroid/widget/TextView;

    const v0, 0x7f0f043f

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->u:Landroid/widget/TextView;

    const v0, 0x7f0f0440

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->v:Landroid/widget/TextView;

    const v0, 0x7f0f0441

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->w:Landroid/widget/TextView;

    const v0, 0x7f0f0442

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->x:Landroid/widget/TextView;

    const v0, 0x7f0f0443

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->y:Landroid/widget/TextView;

    const v0, 0x7f0f0444

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->z:Landroid/widget/TextView;

    const v0, 0x7f0f0445

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->A:Landroid/widget/TextView;

    const v0, 0x7f0f0446

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->B:Landroid/widget/TextView;

    const v0, 0x7f0f0447

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->C:Landroid/widget/TextView;

    const v0, 0x7f0f0448

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->D:Landroid/widget/TextView;

    const v0, 0x7f0f043b

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->K:Landroid/widget/LinearLayout;

    const v0, 0x7f0f042e

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->k:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->k:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    const v0, 0x7f0f0431

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->l:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->l:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    const v0, 0x7f0f0436

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->m:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->m:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    const v0, 0x7f0f042f

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->o:Landroid/widget/TextView;

    const v0, 0x7f0f0434

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->n:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->n:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    const v0, 0x7f0f0435

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->j:Landroid/widget/TextView;

    const v0, 0x7f0f0433

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->p:Landroid/widget/TextView;

    const v0, 0x7f0f0439

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->q:Landroid/widget/TextView;

    const v0, 0x7f0f043a

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->r:Landroid/widget/TextView;

    const v0, 0x7f0f0430

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->g:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->g:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    const v0, 0x7f0f0438

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->i:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->i:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    const v0, 0x7f0f0432

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->h:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->h:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    const v0, 0x7f0f0435

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->j:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->j:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/text/TextPaint;->setFakeBoldText(Z)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/16 v2, 0x8

    new-array v2, v2, [Landroid/view/View;

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->g:Landroid/widget/TextView;

    aput-object v3, v2, v6

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->h:Landroid/widget/TextView;

    aput-object v3, v2, v5

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->i:Landroid/widget/TextView;

    aput-object v3, v2, v8

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->o:Landroid/widget/TextView;

    aput-object v3, v2, v9

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->p:Landroid/widget/TextView;

    aput-object v3, v2, v7

    const/4 v3, 0x5

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->q:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x6

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->t:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x7

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->v:Landroid/widget/TextView;

    aput-object v4, v2, v3

    invoke-static {v0, v2}, Lcom/fimi/soul/utils/ao;->b(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/16 v2, 0xe

    new-array v2, v2, [Landroid/view/View;

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->j:Landroid/widget/TextView;

    aput-object v3, v2, v6

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->k:Landroid/widget/TextView;

    aput-object v3, v2, v5

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->l:Landroid/widget/TextView;

    aput-object v3, v2, v8

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->m:Landroid/widget/TextView;

    aput-object v3, v2, v9

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->n:Landroid/widget/TextView;

    aput-object v3, v2, v7

    const/4 v3, 0x5

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->r:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x6

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->s:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x7

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->u:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0x8

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->w:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0x9

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->y:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0xa

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->x:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0xb

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->z:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0xc

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->A:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/16 v3, 0xd

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->B:Landroid/widget/TextView;

    aput-object v4, v2, v3

    invoke-static {v0, v2}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->G:Lcom/fimi/soul/base/DroidPlannerApp;

    iget-object v0, v0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a:Lcom/fimi/soul/biz/manager/t;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$2;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$2;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/biz/manager/t;->a(Lcom/fimi/soul/biz/manager/t$a;)V

    return-object v1

    :cond_0
    const v0, 0x7f0f043c

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->b(Lcom/fimi/soul/drone/d$b;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a:Lcom/fimi/soul/biz/manager/t;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/manager/t;->a()V

    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 11

    const v10, 0x7f0a02e0

    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    const/16 v9, 0x8

    const/4 v8, 0x1

    const/4 v1, 0x0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v0

    if-eqz v0, :cond_2d

    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$5;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v2

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ah:Z

    if-eqz v0, :cond_1

    invoke-static {p2}, Lcom/fimi/soul/drone/d/e;->a(Lcom/fimi/soul/drone/a;)V

    :cond_1
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->r()Lcom/fimi/soul/drone/h/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/y;->a()D

    move-result-wide v0

    div-double/2addr v0, v6

    invoke-static {v0, v1, v8}, Lcom/fimi/kernel/utils/t;->a(DI)D

    move-result-wide v0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->r()Lcom/fimi/soul/drone/h/y;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/y;->b()D

    move-result-wide v2

    div-double/2addr v2, v6

    invoke-static {v2, v3, v8}, Lcom/fimi/kernel/utils/t;->a(DI)D

    move-result-wide v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "m/s"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->t:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "m/s"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->v:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->W:Z

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a()D

    move-result-wide v0

    const-wide v2, 0x3fc99999a0000000L    # 0.20000000298023224

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a()D

    move-result-wide v0

    const-wide v2, 0x3fd99999a0000000L    # 0.4000000059604645

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_2

    iput-boolean v8, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->W:Z

    invoke-direct {p0, v8}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->c(I)V

    :cond_2
    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->X:Z

    if-nez v0, :cond_3

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a()D

    move-result-wide v0

    const-wide v2, 0x3fd99999a0000000L    # 0.4000000059604645

    cmpl-double v0, v0, v2

    if-lez v0, :cond_3

    iput-boolean v8, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->X:Z

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->c(I)V

    :cond_3
    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->Y:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-boolean v8, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->Y:Z

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->c(I)V

    goto/16 :goto_0

    :pswitch_2
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->K()Lcom/fimi/soul/drone/h/ao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ao;->a()B

    move-result v0

    const/16 v1, 0x1e

    if-gt v1, v0, :cond_4

    const/16 v1, 0x50

    if-ge v0, v1, :cond_4

    const v0, 0x7f0a034a

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->x:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    goto/16 :goto_0

    :cond_4
    const/16 v1, 0x50

    if-lt v0, v1, :cond_5

    const v0, 0x7f0a03f7

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->x:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    goto/16 :goto_0

    :cond_5
    const/4 v1, 0x5

    if-ge v1, v0, :cond_6

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_6

    const v0, 0x7f0a0348

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->x:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    goto/16 :goto_0

    :cond_6
    invoke-virtual {p0, v10}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->x:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    goto/16 :goto_0

    :pswitch_3
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->g()Lcom/fimi/soul/drone/h/ad;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ad;->e()S

    move-result v0

    int-to-double v2, v0

    iput-wide v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->O:D

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->Q:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->R:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->D:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->C:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setVisibility(I)V

    iget-wide v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->O:D

    mul-double/2addr v2, v6

    double-to-int v0, v2

    div-int/lit16 v0, v0, 0x40a

    if-gtz v0, :cond_9

    move v0, v1

    :goto_1
    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->N:Lcom/fimi/soul/view/LightView;

    iget v3, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->P:I

    invoke-virtual {v2, v3}, Lcom/fimi/soul/view/LightView;->setLightPercent(I)V

    iget v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->P:I

    if-eq v0, v2, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->S:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;

    sget-object v3, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;->b:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;

    if-ne v2, v3, :cond_0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->K:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->N:Lcom/fimi/soul/view/LightView;

    invoke-virtual {v2, v1}, Lcom/fimi/soul/view/LightView;->setVisibility(I)V

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->P:I

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ag:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->c:Ljava/util/Timer;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->c:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->c:Ljava/util/Timer;

    :cond_7
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->c:Ljava/util/Timer;

    if-nez v0, :cond_8

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->c:Ljava/util/Timer;

    :cond_8
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->c:Ljava/util/Timer;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$3;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$3;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    goto/16 :goto_0

    :cond_9
    iget-wide v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->O:D

    mul-double/2addr v2, v6

    double-to-int v0, v2

    div-int/lit16 v0, v0, 0x3fc

    const/16 v2, 0x64

    if-lt v0, v2, :cond_a

    const/16 v0, 0x64

    goto :goto_1

    :cond_a
    iget-wide v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->O:D

    mul-double/2addr v2, v6

    double-to-int v0, v2

    div-int/lit16 v0, v0, 0x3fc

    goto :goto_1

    :pswitch_4
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->u()Lcom/fimi/soul/drone/h/ag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ag;->f()D

    move-result-wide v2

    const-wide v4, 0x4124aac000000000L    # 677216.0

    sub-double/2addr v2, v4

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    div-double/2addr v2, v4

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-nez v0, :cond_b

    const-wide/16 v2, 0x0

    :cond_b
    const-wide v4, 0x40a7700000000000L    # 3000.0

    cmpg-double v0, v2, v4

    if-gez v0, :cond_e

    cmpl-double v0, v2, v6

    if-gez v0, :cond_c

    const-wide/16 v4, 0x0

    cmpg-double v0, v2, v4

    if-gez v0, :cond_14

    :cond_c
    const-wide v4, -0x3f70c80000000000L    # -999.0

    cmpg-double v0, v2, v4

    if-gez v0, :cond_d

    const-wide v2, -0x3f70c80000000000L    # -999.0

    :cond_d
    cmpg-double v0, v2, v6

    if-gez v0, :cond_13

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v2, v3, v8}, Lcom/fimi/kernel/utils/t;->a(DI)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->g:Landroid/widget/TextView;

    invoke-direct {p0, v0, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    :cond_e
    :goto_3
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->u()Lcom/fimi/soul/drone/h/ag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ag;->g()D

    move-result-wide v2

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-nez v0, :cond_f

    const-wide/16 v2, 0x0

    :cond_f
    const-wide/high16 v4, -0x3fb7000000000000L    # -50.0

    cmpl-double v0, v2, v4

    if-lez v0, :cond_10

    const-wide v4, 0x40c3880000000000L    # 10000.0

    cmpg-double v0, v2, v4

    if-gez v0, :cond_10

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-nez v0, :cond_10

    cmpl-double v0, v2, v6

    if-ltz v0, :cond_15

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    double-to-int v4, v2

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ""

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->h:Landroid/widget/TextView;

    invoke-direct {p0, v0, v4}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    :cond_10
    :goto_4
    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/d;->f()I

    move-result v4

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v5

    invoke-virtual {v5}, Lcom/fimi/soul/biz/e/d;->m()Z

    move-result v5

    if-eqz v5, :cond_16

    const/16 v5, 0x32

    if-ge v4, v5, :cond_16

    const-wide v6, 0x4072c00000000000L    # 300.0

    cmpg-double v2, v2, v6

    if-gez v2, :cond_16

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v2

    if-nez v2, :cond_16

    iget-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->V:Z

    if-nez v1, :cond_11

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/e/d;->k()Z

    move-result v1

    if-nez v1, :cond_11

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ag:Landroid/os/Handler;

    invoke-virtual {v1, v8}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    iput-boolean v8, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->V:Z

    :cond_11
    :goto_5
    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/d;->n()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/d;->m()Z

    move-result v0

    if-nez v0, :cond_17

    :cond_12
    invoke-virtual {p0, v10}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->z:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    :goto_6
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->g()Lcom/fimi/soul/entity/DroneModelType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/DroneModelType;->isLightStream()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual {p0, v10}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->j:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    goto/16 :goto_0

    :cond_13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    double-to-int v2, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_2

    :cond_14
    invoke-static {v2, v3, v8}, Lcom/fimi/kernel/utils/t;->a(DI)D

    move-result-wide v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->g:Landroid/widget/TextView;

    invoke-direct {p0, v0, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    goto/16 :goto_3

    :cond_15
    invoke-static {v2, v3, v8}, Lcom/fimi/kernel/utils/t;->a(DI)D

    move-result-wide v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ""

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->h:Landroid/widget/TextView;

    invoke-direct {p0, v0, v4}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    goto/16 :goto_4

    :cond_16
    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->V:Z

    goto/16 :goto_5

    :cond_17
    const/16 v0, 0x1e

    if-gt v0, v4, :cond_18

    const/16 v0, 0x3c

    if-ge v4, v0, :cond_18

    const v0, 0x7f0a034a

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->z:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    goto/16 :goto_6

    :cond_18
    const/16 v0, 0x3c

    if-lt v4, v0, :cond_19

    const v0, 0x7f0a03f7

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->z:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    goto/16 :goto_6

    :cond_19
    if-lez v4, :cond_1a

    const/16 v0, 0x1e

    if-ge v4, v0, :cond_1a

    const v0, 0x7f0a0348

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->z:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    goto/16 :goto_6

    :cond_1a
    invoke-virtual {p0, v10}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->z:Landroid/widget/TextView;

    invoke-direct {p0, v0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    goto/16 :goto_6

    :cond_1b
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->u()Lcom/fimi/soul/drone/h/ag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ag;->c()B

    move-result v0

    const/16 v1, 0xd

    if-le v0, v1, :cond_1c

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->j:Landroid/widget/TextView;

    invoke-direct {p0, v1, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    :goto_7
    if-gt v0, v9, :cond_1f

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->j:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e003e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e003e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    :cond_1c
    if-ge v9, v0, :cond_1d

    const/16 v1, 0xd

    if-gt v0, v1, :cond_1d

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->j:Landroid/widget/TextView;

    invoke-direct {p0, v1, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    goto :goto_7

    :cond_1d
    if-gt v0, v9, :cond_1e

    const/4 v1, 0x4

    if-le v0, v1, :cond_1e

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->j:Landroid/widget/TextView;

    invoke-direct {p0, v1, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    goto :goto_7

    :cond_1e
    invoke-virtual {p0, v10}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->j:Landroid/widget/TextView;

    invoke-direct {p0, v1, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    goto :goto_7

    :cond_1f
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->j:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e003d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e003d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    :pswitch_5
    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ah:Z

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->D()Lcom/fimi/soul/drone/h/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/e;->e()S

    move-result v0

    int-to-double v0, v0

    iput-wide v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ai:D

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->D()Lcom/fimi/soul/drone/h/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/e;->d()S

    move-result v0

    int-to-double v0, v0

    iput-wide v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->aj:D

    goto/16 :goto_0

    :pswitch_6
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->f()B

    move-result v0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_20

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->d()B

    move-result v0

    const/16 v2, 0x33

    if-ne v0, v2, :cond_20

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->g()B

    move-result v0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_20

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->h()F

    move-result v0

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v2

    if-nez v0, :cond_23

    iput-boolean v8, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->R:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->K:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v9}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_20
    :goto_8
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->d()B

    move-result v0

    const/16 v2, 0x22

    if-ne v0, v2, :cond_0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->f()B

    move-result v0

    if-eq v0, v8, :cond_21

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->f()B

    move-result v0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_0

    :cond_21
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->d()B

    move-result v0

    const/16 v2, 0x22

    if-ne v0, v2, :cond_22

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->h()F

    move-result v0

    float-to-int v0, v0

    and-int/lit8 v0, v0, 0x4

    const/4 v2, 0x4

    if-ne v0, v2, :cond_25

    iput-boolean v8, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->R:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->K:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v9}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_22
    :goto_9
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->f()B

    move-result v0

    if-ne v0, v8, :cond_0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->e()B

    move-result v0

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->R:Z

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->e()V

    goto/16 :goto_0

    :cond_23
    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->R:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->S:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;

    sget-object v2, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;->b:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;

    if-ne v0, v2, :cond_24

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->K:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_24
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ag:Landroid/os/Handler;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_8

    :cond_25
    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->R:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->S:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;

    sget-object v2, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;->b:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;

    if-ne v0, v2, :cond_26

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->K:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_26
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ag:Landroid/os/Handler;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_9

    :pswitch_7
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->d()V

    goto/16 :goto_0

    :pswitch_8
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->L()Lcom/fimi/soul/drone/h/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/c;->b()B

    move-result v2

    const/16 v3, 0x73

    if-ne v2, v3, :cond_0

    iget-byte v2, v0, Lcom/fimi/soul/drone/h/c;->c:B

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    iget-byte v0, v0, Lcom/fimi/soul/drone/h/c;->d:B

    packed-switch v0, :pswitch_data_1

    goto/16 :goto_0

    :pswitch_9
    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->f:Z

    if-nez v0, :cond_27

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Z)V

    :cond_27
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->L:Landroid/widget/TextView;

    const v2, 0x7f0a018a

    invoke-virtual {p0, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->Q:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->N:Lcom/fimi/soul/view/LightView;

    invoke-virtual {v0, v9}, Lcom/fimi/soul/view/LightView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->J:Lcom/fimi/soul/view/EVview;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/EVview;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->C:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->D:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->D:Landroid/widget/TextView;

    sget v1, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->M:F

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    :pswitch_a
    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->R:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->L:Landroid/widget/TextView;

    const v2, 0x7f0a026f

    invoke-virtual {p0, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->N:Lcom/fimi/soul/view/LightView;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/LightView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->J:Lcom/fimi/soul/view/EVview;

    invoke-virtual {v0, v9}, Lcom/fimi/soul/view/EVview;->setVisibility(I)V

    iput-boolean v8, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->Q:Z

    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;->b:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->S:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;

    goto/16 :goto_0

    :pswitch_b
    sget-object v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;->c:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->S:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$a;

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->f()Lcom/fimi/soul/drone/h/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/p;->c()B

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/p;->d()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/p;->e()B

    move-result v0

    and-int/lit16 v3, v0, 0xff

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/d;->k()Z

    move-result v0

    if-eqz v0, :cond_2c

    shl-int/lit8 v0, v3, 0x8

    or-int/2addr v0, v2

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->e(I)F

    move-result v0

    :goto_a
    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->L:Landroid/widget/TextView;

    const v5, 0x7f0a018a

    invoke-virtual {p0, v5}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v4, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->M:F

    cmpl-float v4, v4, v0

    if-eqz v4, :cond_0

    const/16 v4, 0xff

    if-ne v3, v4, :cond_28

    const/16 v3, 0xff

    if-eq v2, v3, :cond_0

    :cond_28
    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ag:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeMessages(I)V

    sput v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->M:F

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->D:Landroid/widget/TextView;

    sget v3, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->M:F

    invoke-static {v3}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->J:Lcom/fimi/soul/view/EVview;

    invoke-virtual {v2, v0}, Lcom/fimi/soul/view/EVview;->a(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->K:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-ne v0, v9, :cond_29

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->f:Z

    if-nez v0, :cond_29

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->D:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->C:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->K:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_29
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->b:Ljava/util/Timer;

    if-eqz v0, :cond_2a

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->b:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->b:Ljava/util/Timer;

    :cond_2a
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->b:Ljava/util/Timer;

    if-nez v0, :cond_2b

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->b:Ljava/util/Timer;

    :cond_2b
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->b:Ljava/util/Timer;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$4;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment$4;-><init>(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    goto/16 :goto_0

    :cond_2c
    shl-int/lit8 v0, v3, 0x8

    or-int/2addr v0, v2

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->d(I)F

    move-result v0

    goto :goto_a

    :cond_2d
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v0

    if-nez v0, :cond_2e

    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->W:Z

    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->X:Z

    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->Y:Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->r:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    const-string v0, "0.0"

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->h:Landroid/widget/TextView;

    invoke-direct {p0, v0, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    const-string v0, "0.0"

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->g:Landroid/widget/TextView;

    invoke-direct {p0, v0, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    const-string v0, "0"

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->i:Landroid/widget/TextView;

    invoke-direct {p0, v0, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    const-string v0, "0.0m/s"

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->t:Landroid/widget/TextView;

    invoke-direct {p0, v0, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    const-string v0, "0.0m/s"

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->v:Landroid/widget/TextView;

    invoke-direct {p0, v0, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    const v0, 0x7f0a017c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->m:Landroid/widget/TextView;

    invoke-direct {p0, v0, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    const-string v0, "%"

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->q:Landroid/widget/TextView;

    invoke-direct {p0, v0, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    invoke-virtual {p0, v10}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->j:Landroid/widget/TextView;

    invoke-direct {p0, v0, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    invoke-virtual {p0, v10}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->x:Landroid/widget/TextView;

    invoke-direct {p0, v0, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    invoke-virtual {p0, v10}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->z:Landroid/widget/TextView;

    invoke-direct {p0, v0, v2}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->a(Ljava/lang/String;Landroid/widget/TextView;)V

    :cond_2e
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ai:D

    iput-boolean v8, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->ah:Z

    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->W:Z

    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->X:Z

    iput-boolean v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->Y:Z

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_b
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->c()V

    return-void
.end method

.method public onStart()V
    .locals 3

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    new-instance v0, Lcom/fimi/soul/module/setting/newhand/c;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->F:Lcom/fimi/soul/drone/a;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->E:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lcom/fimi/soul/module/setting/newhand/c;-><init>(Lcom/fimi/soul/drone/a;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusFragment;->d:Lcom/fimi/soul/module/setting/newhand/c;

    return-void
.end method

.method public onStop()V
    .locals 0

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    return-void
.end method
