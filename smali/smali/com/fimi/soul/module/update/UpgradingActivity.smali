.class public Lcom/fimi/soul/module/update/UpgradingActivity;
.super Lcom/fimi/soul/base/BaseActivity;

# interfaces
.implements Lcom/fimi/soul/biz/camera/b/e;
.implements Lcom/fimi/soul/module/update/c$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/update/UpgradingActivity$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/fimi/soul/base/BaseActivity;",
        "Lcom/fimi/soul/biz/camera/b/e",
        "<",
        "Lcom/fimi/soul/biz/camera/entity/X11RespCmd;",
        ">;",
        "Lcom/fimi/soul/module/update/c$a;"
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String; = "sp_upgrade_skip"

.field private static final q:I = 0x99

.field private static final r:I = 0x100

.field private static final s:I = 0x88

.field private static final t:I = 0x66

.field private static final u:I = 0x32

.field private static w:I


# instance fields
.field private A:I

.field private B:Lcom/fimi/soul/biz/camera/d;

.field private C:Lcom/fimi/soul/biz/update/d;

.field private D:Ljava/lang/String;

.field private E:Lcom/fimi/soul/module/update/UpgradingActivity$a;

.field private F:Ljava/lang/Boolean;

.field private G:Z

.field private H:Ljava/lang/StringBuffer;

.field private I:Z

.field private J:Landroid/widget/TextView;

.field private K:Z

.field private L:Z

.field private M:Z

.field private N:Lcom/fimi/kernel/utils/v;

.field private O:Ljava/lang/String;

.field private P:Landroid/widget/Toast;

.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/FirmwareInfo;",
            ">;"
        }
    .end annotation
.end field

.field c:Lcom/fimi/soul/biz/update/a;

.field d:Lcom/fimi/soul/module/update/c;

.field e:Lcom/fimi/soul/biz/e/d;

.field f:Lcom/fimi/soul/biz/e/d$a;

.field g:Lcom/fimi/soul/biz/e/c;

.field h:Lcom/fimi/soul/biz/e/c$a;

.field i:J

.field private j:Lcom/fimi/kernel/view/progress/ProgressView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/ImageView;

.field private m:Lcom/fimi/soul/drone/a;

.field private n:Landroid/widget/TextView;

.field private o:Lcom/fimi/soul/biz/update/f;

.field private p:Landroid/widget/TextView;

.field private final v:I

.field private x:Z

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    sput v0, Lcom/fimi/soul/module/update/UpgradingActivity;->w:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/fimi/soul/base/BaseActivity;-><init>()V

    const/16 v0, 0x20

    iput v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->v:I

    iput v2, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->y:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    iput v2, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->A:I

    iput-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->c:Lcom/fimi/soul/biz/update/a;

    iput-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->B:Lcom/fimi/soul/biz/camera/d;

    iput-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->D:Ljava/lang/String;

    iput-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->d:Lcom/fimi/soul/module/update/c;

    iput-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->H:Ljava/lang/StringBuffer;

    iput-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->e:Lcom/fimi/soul/biz/e/d;

    iput-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->g:Lcom/fimi/soul/biz/e/c;

    iput-boolean v2, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->K:Z

    iput-boolean v2, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->L:Z

    iput-boolean v2, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->M:Z

    const-string v0, "is_setting_enter"

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->O:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/update/UpgradingActivity;I)I
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    return p1
.end method

.method private a(III)V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->i:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1f4

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    if-eq p2, p3, :cond_0

    const/16 v0, 0x100

    if-ne p1, v0, :cond_1

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->i:J

    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    iput p1, v0, Landroid/os/Message;->what:I

    iput p2, v0, Landroid/os/Message;->arg1:I

    iput p3, v0, Landroid/os/Message;->arg2:I

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->getHandler()Landroid/os/Handler;

    move-result-object v1

    const-wide/16 v2, 0x32

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_1
    return-void
.end method

.method private a(Lcom/fimi/soul/entity/FirmwareInfo;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/update/UpgradingActivity;->b(Lcom/fimi/soul/entity/FirmwareInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->c:Lcom/fimi/soul/biz/update/a;

    new-instance v1, Lcom/fimi/soul/module/update/UpgradingActivity$4;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/update/UpgradingActivity$4;-><init>(Lcom/fimi/soul/module/update/UpgradingActivity;)V

    invoke-virtual {v0, v1, p0, p1}, Lcom/fimi/soul/biz/update/a;->a(Lcom/fimi/soul/biz/update/i;Landroid/content/Context;Lcom/fimi/soul/entity/FirmwareInfo;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->o:Lcom/fimi/soul/biz/update/f;

    iget v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    invoke-virtual {v0, p1, v1}, Lcom/fimi/soul/biz/update/f;->a(Lcom/fimi/soul/entity/FirmwareInfo;I)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/fimi/soul/module/update/UpgradingActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->k()V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/update/UpgradingActivity;III)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/fimi/soul/module/update/UpgradingActivity;->a(III)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    const-string v0, "="

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x99

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x32

    const/16 v2, 0x64

    invoke-direct {p0, v1, v0, v2}, Lcom/fimi/soul/module/update/UpgradingActivity;->a(III)V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/update/UpgradingActivity;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->I:Z

    return p1
.end method

.method private b()V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->o:Lcom/fimi/soul/biz/update/f;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/update/f;->e()V

    invoke-static {}, Lcom/fimi/soul/module/update/a/a;->a()Lcom/fimi/soul/module/update/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/a;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->b:Ljava/util/List;

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->finish()V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->p:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0a044a

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->b:Ljava/util/List;

    iget v3, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FirmwareInfo;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FirmwareInfo;->getSysName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->b:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/UpgradingActivity;->a(Ljava/util/List;)Lcom/fimi/soul/module/update/UpgradingActivity$a;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->E:Lcom/fimi/soul/module/update/UpgradingActivity$a;

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->A:I

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    iput v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->y:I

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->j:Lcom/fimi/kernel/view/progress/ProgressView;

    iget v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->y:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/progress/ProgressView;->setMaxCount(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->o:Lcom/fimi/soul/biz/update/f;

    new-instance v1, Lcom/fimi/soul/module/update/UpgradingActivity$1;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/update/UpgradingActivity$1;-><init>(Lcom/fimi/soul/module/update/UpgradingActivity;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/update/f;->a(Lcom/fimi/soul/biz/update/i;)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->o:Lcom/fimi/soul/biz/update/f;

    new-instance v1, Lcom/fimi/soul/module/update/UpgradingActivity$3;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/update/UpgradingActivity$3;-><init>(Lcom/fimi/soul/module/update/UpgradingActivity;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/update/f;->a(Lcom/fimi/soul/biz/update/f$b;)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FirmwareInfo;

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->d:Lcom/fimi/soul/module/update/c;

    invoke-virtual {v1}, Lcom/fimi/soul/module/update/c;->a()V

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FirmwareInfo;->getSysId()I

    move-result v1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_3

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FirmwareInfo;->getSysId()I

    move-result v1

    const/16 v2, 0xd

    if-ne v1, v2, :cond_4

    :cond_3
    invoke-virtual {v0}, Lcom/fimi/soul/entity/FirmwareInfo;->getSysId()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/update/UpgradingActivity;->b(I)V

    goto/16 :goto_0

    :cond_4
    invoke-direct {p0, v0}, Lcom/fimi/soul/module/update/UpgradingActivity;->a(Lcom/fimi/soul/entity/FirmwareInfo;)V

    goto/16 :goto_0
.end method

.method private b(I)V
    .locals 2

    const-string v0, "firmware.zip"

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->D:Ljava/lang/String;

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/fimi/soul/module/update/UpgradingActivity$7;

    invoke-direct {v1, p0, p1}, Lcom/fimi/soul/module/update/UpgradingActivity$7;-><init>(Lcom/fimi/soul/module/update/UpgradingActivity;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/module/update/UpgradingActivity;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/update/UpgradingActivity;->c(I)V

    return-void
.end method

.method private b(Lcom/fimi/soul/entity/FirmwareInfo;)Z
    .locals 2

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FirmwareInfo;->getSysId()I

    move-result v0

    const/16 v1, 0xb

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FirmwareInfo;->getSysId()I

    move-result v0

    const/16 v1, 0xf

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FirmwareInfo;->getSysId()I

    move-result v0

    const/16 v1, 0xe

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lcom/fimi/soul/module/update/UpgradingActivity;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->I:Z

    return v0
.end method

.method static synthetic b(Lcom/fimi/soul/module/update/UpgradingActivity;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->L:Z

    return p1
.end method

.method private c(I)V
    .locals 3

    const/16 v0, 0x99

    div-int/lit8 v1, p1, 0x2

    add-int/lit8 v1, v1, 0x32

    const/16 v2, 0x64

    invoke-direct {p0, v0, v1, v2}, Lcom/fimi/soul/module/update/UpgradingActivity;->a(III)V

    return-void
.end method

.method private c(Lcom/fimi/soul/entity/FirmwareInfo;)V
    .locals 4

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/update/UpgradingActivity;->b(Lcom/fimi/soul/entity/FirmwareInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->c:Lcom/fimi/soul/biz/update/a;

    new-instance v1, Lcom/fimi/soul/module/update/UpgradingActivity$10;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/update/UpgradingActivity$10;-><init>(Lcom/fimi/soul/module/update/UpgradingActivity;)V

    invoke-virtual {v0, v1, p0, p1}, Lcom/fimi/soul/biz/update/a;->a(Lcom/fimi/soul/biz/update/i;Landroid/content/Context;Lcom/fimi/soul/entity/FirmwareInfo;)V

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0, p1}, Lcom/fimi/soul/module/update/UpgradingActivity;->d(Lcom/fimi/soul/entity/FirmwareInfo;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->o:Lcom/fimi/soul/biz/update/f;

    iget v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    invoke-virtual {v0, p1, v1}, Lcom/fimi/soul/biz/update/f;->a(Lcom/fimi/soul/entity/FirmwareInfo;I)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lcom/fimi/soul/module/update/UpgradingActivity;->d(Lcom/fimi/soul/entity/FirmwareInfo;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->o:Lcom/fimi/soul/biz/update/f;

    iget v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    invoke-virtual {v0, p1, v1}, Lcom/fimi/soul/biz/update/f;->a(Lcom/fimi/soul/entity/FirmwareInfo;I)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->m:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x20

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->o:Lcom/fimi/soul/biz/update/f;

    iget v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    invoke-virtual {v0, p1, v1}, Lcom/fimi/soul/biz/update/f;->a(Lcom/fimi/soul/entity/FirmwareInfo;I)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/fimi/soul/module/update/UpgradingActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->f()V

    return-void
.end method

.method private c()Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->o:Lcom/fimi/soul/biz/update/f;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/update/f;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->k()V

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic c(Lcom/fimi/soul/module/update/UpgradingActivity;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->K:Z

    return p1
.end method

.method static synthetic d(Lcom/fimi/soul/module/update/UpgradingActivity;)Landroid/os/Handler;
    .locals 1

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->getHandler()Landroid/os/Handler;

    move-result-object v0

    return-object v0
.end method

.method private d()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->d:Lcom/fimi/soul/module/update/c;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/c;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->d:Lcom/fimi/soul/module/update/c;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/c;->a()V

    :try_start_0
    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->c:Lcom/fimi/soul/biz/update/a;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/update/a;->e()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->e:Lcom/fimi/soul/biz/e/d;

    new-instance v0, Lcom/fimi/soul/module/update/UpgradingActivity$5;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/update/UpgradingActivity$5;-><init>(Lcom/fimi/soul/module/update/UpgradingActivity;)V

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->f:Lcom/fimi/soul/biz/e/d$a;

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->e:Lcom/fimi/soul/biz/e/d;

    iget-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->f:Lcom/fimi/soul/biz/e/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/e/d;->a(Lcom/fimi/soul/biz/e/d$a;)V

    invoke-static {}, Lcom/fimi/soul/biz/e/c;->a()Lcom/fimi/soul/biz/e/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->g:Lcom/fimi/soul/biz/e/c;

    new-instance v0, Lcom/fimi/soul/module/update/UpgradingActivity$6;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/update/UpgradingActivity$6;-><init>(Lcom/fimi/soul/module/update/UpgradingActivity;)V

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->h:Lcom/fimi/soul/biz/e/c$a;

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->g:Lcom/fimi/soul/biz/e/c;

    iget-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->h:Lcom/fimi/soul/biz/e/c$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/e/c;->a(Lcom/fimi/soul/biz/e/c$a;)V

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "e:closeFtpNetwork:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/update/l;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private d(Lcom/fimi/soul/entity/FirmwareInfo;)Z
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FirmwareInfo;->getSysId()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private e()V
    .locals 2

    const/4 v1, 0x0

    new-instance v0, Lcom/fimi/soul/module/update/c;

    invoke-direct {v0, v1, p0}, Lcom/fimi/soul/module/update/c;-><init>(ILcom/fimi/soul/module/update/c$a;)V

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->d:Lcom/fimi/soul/module/update/c;

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->H:Ljava/lang/StringBuffer;

    sget-object v0, Lcom/fimi/soul/module/update/UpgradingActivity$a;->d:Lcom/fimi/soul/module/update/UpgradingActivity$a;

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->E:Lcom/fimi/soul/module/update/UpgradingActivity$a;

    const/4 v0, 0x1

    sput v0, Lcom/fimi/soul/module/update/UpgradingActivity;->w:I

    new-instance v0, Lcom/fimi/soul/biz/update/a;

    invoke-direct {v0}, Lcom/fimi/soul/biz/update/a;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->c:Lcom/fimi/soul/biz/update/a;

    new-instance v0, Lcom/fimi/soul/biz/update/d;

    invoke-direct {v0}, Lcom/fimi/soul/biz/update/d;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->C:Lcom/fimi/soul/biz/update/d;

    invoke-static {}, Lcom/fimi/soul/biz/camera/b;->a()Lcom/fimi/soul/biz/camera/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/b;->d()Lcom/fimi/soul/biz/camera/b/a;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/biz/camera/d;

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->B:Lcom/fimi/soul/biz/camera/d;

    iput-boolean v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->I:Z

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->B:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/d;->c(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->B:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/biz/camera/d;->a(Lcom/fimi/soul/biz/camera/b/e;)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->B:Lcom/fimi/soul/biz/camera/d;

    new-instance v1, Lcom/fimi/soul/module/update/UpgradingActivity$8;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/update/UpgradingActivity$8;-><init>(Lcom/fimi/soul/module/update/UpgradingActivity;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/d;->c(Lcom/fimi/kernel/b/c/d;)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->B:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->s()Lcom/fimi/soul/biz/camera/c/d;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/module/update/UpgradingActivity$9;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/update/UpgradingActivity$9;-><init>(Lcom/fimi/soul/module/update/UpgradingActivity;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/c/d;->a(Lcom/fimi/soul/biz/update/i;)V

    invoke-static {}, Lcom/fimi/soul/biz/update/l;->e()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/base/DroidPlannerApp;

    iget-object v0, v0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->m:Lcom/fimi/soul/drone/a;

    new-instance v0, Lcom/fimi/soul/biz/update/f;

    iget-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->m:Lcom/fimi/soul/drone/a;

    invoke-direct {v0, p0, v1}, Lcom/fimi/soul/biz/update/f;-><init>(Landroid/content/Context;Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->o:Lcom/fimi/soul/biz/update/f;

    return-void
.end method

.method static synthetic e(Lcom/fimi/soul/module/update/UpgradingActivity;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->L:Z

    return v0
.end method

.method static synthetic f(Lcom/fimi/soul/module/update/UpgradingActivity;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->A:I

    return v0
.end method

.method private f()V
    .locals 2

    const-string v0, "fw_upgrade_complete"

    invoke-static {v0}, Lcom/fimi/soul/biz/update/l;->c(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->I:Z

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FirmwareInfo;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FirmwareInfo;->getVersion()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/update/l;->e(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->g()V

    return-void
.end method

.method private g()V
    .locals 3

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FirmwareInfo;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/FirmwareInfo;->setIsUpgradeSuccess(Ljava/lang/Boolean;)V

    iget v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->A:I

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->b:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FirmwareInfo;

    iget v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/update/UpgradingActivity;->a(Lcom/fimi/soul/entity/FirmwareInfo;)V

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->h()V

    goto :goto_0
.end method

.method static synthetic g(Lcom/fimi/soul/module/update/UpgradingActivity;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->K:Z

    return v0
.end method

.method static synthetic h(Lcom/fimi/soul/module/update/UpgradingActivity;)Lcom/fimi/soul/biz/update/d;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->C:Lcom/fimi/soul/biz/update/d;

    return-object v0
.end method

.method private h()V
    .locals 2

    const/4 v0, 0x0

    sput v0, Lcom/fimi/soul/module/update/UpgradingActivity;->w:I

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->d:Lcom/fimi/soul/module/update/c;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/c;->d()V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->o:Lcom/fimi/soul/biz/update/f;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/update/f;->m()V

    iget-boolean v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->G:Z

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->H:Ljava/lang/StringBuffer;

    iget-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->H:Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    iget-boolean v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->M:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->E:Lcom/fimi/soul/module/update/UpgradingActivity$a;

    sget-object v1, Lcom/fimi/soul/module/update/UpgradingActivity$a;->b:Lcom/fimi/soul/module/update/UpgradingActivity$a;

    if-ne v0, v1, :cond_2

    const-string v0, "reset rc"

    invoke-static {v0}, Lcom/fimi/soul/biz/update/l;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->o:Lcom/fimi/soul/biz/update/f;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/update/f;->k()V

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->i()V

    :goto_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->M:Z

    :cond_1
    return-void

    :cond_2
    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->i()V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic i(Lcom/fimi/soul/module/update/UpgradingActivity;)Lcom/fimi/soul/biz/camera/d;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->B:Lcom/fimi/soul/biz/camera/d;

    return-object v0
.end method

.method private i()V
    .locals 2

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->n()V

    const-wide/16 v0, 0x3e8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const/4 v0, 0x0

    sput v0, Lcom/fimi/soul/module/update/UpgradingActivity;->w:I

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->m()V

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic j(Lcom/fimi/soul/module/update/UpgradingActivity;)Landroid/os/Handler;
    .locals 1

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->getHandler()Landroid/os/Handler;

    move-result-object v0

    return-object v0
.end method

.method private j()V
    .locals 3

    iget-boolean v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->G:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->H:Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0a043a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    const v0, 0x7f0a0442

    invoke-static {p0, v0}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    goto :goto_0
.end method

.method static synthetic k(Lcom/fimi/soul/module/update/UpgradingActivity;)Lcom/fimi/soul/drone/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->m:Lcom/fimi/soul/drone/a;

    return-object v0
.end method

.method private k()V
    .locals 4

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->G:Z

    iput-boolean v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->I:Z

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->B:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->s()Lcom/fimi/soul/biz/camera/c/d;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/c/d;->a(Z)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x20

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method private l()V
    .locals 4

    iget-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->H:Ljava/lang/StringBuffer;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->b:Ljava/util/List;

    iget v3, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FirmwareInfo;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FirmwareInfo;->getSysName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->m:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->c()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FirmwareInfo;

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/update/UpgradingActivity;->c(Lcom/fimi/soul/entity/FirmwareInfo;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->m()V

    goto :goto_0
.end method

.method private m()V
    .locals 3

    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/fimi/soul/module/update/UpgradeResultActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "result_list"

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->b:Ljava/util/List;

    check-cast v0, Ljava/io/Serializable;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/update/UpgradingActivity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->finish()V

    const/high16 v0, 0x10a0000

    const v1, 0x10a0001

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/module/update/UpgradingActivity;->overridePendingTransition(II)V

    return-void
.end method

.method private n()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->B:Lcom/fimi/soul/biz/camera/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->B:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->s()Lcom/fimi/soul/biz/camera/c/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/c/d;->a(Z)V

    iput-object v2, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->B:Lcom/fimi/soul/biz/camera/d;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->o:Lcom/fimi/soul/biz/update/f;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/update/f;->e()V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->o:Lcom/fimi/soul/biz/update/f;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/update/f;->l()V

    iput-object v2, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->c:Lcom/fimi/soul/biz/update/a;

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->d:Lcom/fimi/soul/module/update/c;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/c;->d()V

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->o()V

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->p()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->getHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->gc()V

    return-void
.end method

.method private o()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->e:Lcom/fimi/soul/biz/e/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->f:Lcom/fimi/soul/biz/e/d$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->e:Lcom/fimi/soul/biz/e/d;

    iget-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->f:Lcom/fimi/soul/biz/e/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/e/d;->b(Lcom/fimi/soul/biz/e/d$a;)V

    :cond_0
    return-void
.end method

.method private p()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->g:Lcom/fimi/soul/biz/e/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->h:Lcom/fimi/soul/biz/e/c$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->g:Lcom/fimi/soul/biz/e/c;

    iget-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->h:Lcom/fimi/soul/biz/e/c$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/e/c;->b(Lcom/fimi/soul/biz/e/c$a;)V

    :cond_0
    return-void
.end method

.method private q()V
    .locals 4

    const/4 v1, 0x1

    iget-boolean v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->x:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->B:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/d;->s()Lcom/fimi/soul/biz/camera/c/d;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/camera/c/d;->a(Z)V

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/fimi/soul/module/update/UpgradingActivity$2;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/update/UpgradingActivity$2;-><init>(Lcom/fimi/soul/module/update/UpgradingActivity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->P:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fimi/soul/module/update/FindNewFirmwareAvtivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/UpgradingActivity;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->finish()V

    :goto_0
    return-void

    :cond_0
    iput-boolean v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->x:Z

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f0a044b

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->P:Landroid/widget/Toast;

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->P:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x88

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/util/List;)Lcom/fimi/soul/module/update/UpgradingActivity$a;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/FirmwareInfo;",
            ">;)",
            "Lcom/fimi/soul/module/update/UpgradingActivity$a;"
        }
    .end annotation

    const/4 v5, 0x1

    sget-object v0, Lcom/fimi/soul/module/update/UpgradingActivity$a;->d:Lcom/fimi/soul/module/update/UpgradingActivity$a;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FirmwareInfo;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FirmwareInfo;->getSysId()I

    move-result v3

    const/16 v4, 0xb

    if-ne v3, v4, :cond_0

    sget-object v0, Lcom/fimi/soul/module/update/UpgradingActivity$a;->a:Lcom/fimi/soul/module/update/UpgradingActivity$a;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FirmwareInfo;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FirmwareInfo;->getSysId()I

    move-result v0

    if-ne v0, v5, :cond_3

    sget-object v0, Lcom/fimi/soul/module/update/UpgradingActivity$a;->c:Lcom/fimi/soul/module/update/UpgradingActivity$a;

    :goto_2
    move-object v1, v0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lcom/fimi/soul/entity/FirmwareInfo;->getSysId()I

    move-result v0

    if-ne v0, v5, :cond_2

    sget-object v0, Lcom/fimi/soul/module/update/UpgradingActivity$a;->b:Lcom/fimi/soul/module/update/UpgradingActivity$a;

    :goto_3
    move-object v1, v0

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    move-object v0, v1

    goto :goto_3

    :cond_3
    move-object v0, v1

    goto :goto_2
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    return-void
.end method

.method public a(Z)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->k()V

    :cond_0
    return-void
.end method

.method public a(ZLcom/fimi/soul/biz/camera/entity/X11RespCmd;)V
    .locals 2

    if-eqz p1, :cond_4

    invoke-virtual {p2}, Lcom/fimi/soul/biz/camera/entity/X11RespCmd;->isNotification()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "put_file_complete"

    invoke-virtual {p2}, Lcom/fimi/soul/biz/camera/entity/X11RespCmd;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "put_file_complete"

    invoke-static {v0}, Lcom/fimi/soul/biz/update/l;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->d:Lcom/fimi/soul/module/update/c;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/c;->b()V

    :cond_0
    const-string v0, "fw_upgrade_complete"

    invoke-virtual {p2}, Lcom/fimi/soul/biz/camera/entity/X11RespCmd;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->f()V

    :cond_1
    const-string v0, "fw_unzip_finish"

    invoke-virtual {p2}, Lcom/fimi/soul/biz/camera/entity/X11RespCmd;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "fw_unzip_finish"

    invoke-static {v0}, Lcom/fimi/soul/biz/update/l;->c(Ljava/lang/String;)V

    :cond_2
    const-string v0, "fw_unzipping"

    invoke-virtual {p2}, Lcom/fimi/soul/biz/camera/entity/X11RespCmd;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "fw_unzipping"

    invoke-static {v0}, Lcom/fimi/soul/biz/update/l;->c(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p2}, Lcom/fimi/soul/biz/camera/entity/X11RespCmd;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "progress"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->I:Z

    if-nez v0, :cond_4

    invoke-virtual {p2}, Lcom/fimi/soul/biz/camera/entity/X11RespCmd;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/update/l;->c(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/update/UpgradingActivity;->a(Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public bridge synthetic a(ZLjava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/fimi/soul/biz/camera/entity/X11RespCmd;

    invoke-virtual {p0, p1, p2}, Lcom/fimi/soul/module/update/UpgradingActivity;->a(ZLcom/fimi/soul/biz/camera/entity/X11RespCmd;)V

    return-void
.end method

.method public a()Z
    .locals 2

    iget v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->A:I

    iget v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    const/16 v2, 0x80

    const/4 v4, 0x1

    const/4 v3, 0x0

    invoke-super {p0, p1}, Lcom/fimi/soul/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->dpa:Lcom/fimi/soul/base/DroidPlannerApp;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/base/DroidPlannerApp;->b(Landroid/app/Activity;)V

    invoke-static {p0}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->N:Lcom/fimi/kernel/utils/v;

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->N:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->O:Ljava/lang/String;

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->F:Ljava/lang/Boolean;

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setFlags(II)V

    const v0, 0x7f04003b

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/UpgradingActivity;->setContentView(I)V

    const v0, 0x7f0f0191

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/UpgradingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/progress/ProgressView;

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->j:Lcom/fimi/kernel/view/progress/ProgressView;

    const v0, 0x7f0f0190

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/UpgradingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->k:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-array v1, v4, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->k:Landroid/widget/TextView;

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ao;->b(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    const v0, 0x7f0f018f

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/UpgradingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->l:Landroid/widget/ImageView;

    const v0, 0x7f0f00fb

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/UpgradingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->p:Landroid/widget/TextView;

    const v0, 0x7f0f00fc

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/UpgradingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->J:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->p:Landroid/widget/TextView;

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->J:Landroid/widget/TextView;

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    const v0, 0x7f0f00fa

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/update/UpgradingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-array v1, v4, [Landroid/view/View;

    iget-object v2, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->n:Landroid/widget/TextView;

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ao;->b(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    iput v4, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->e()V

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->b()V

    return-void
.end method

.method protected onDestroy()V
    .locals 0

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onDestroy()V

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->n()V

    return-void
.end method

.method public onHandleMessage(Landroid/os/Message;)V
    .locals 5

    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x99

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->d:Lcom/fimi/soul/module/update/c;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/c;->b()V

    iget-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->p:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0a044a

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->b:Ljava/util/List;

    iget v3, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FirmwareInfo;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FirmwareInfo;->getSysName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget v0, p1, Landroid/os/Message;->arg1:I

    mul-int/lit8 v0, v0, 0x64

    iget v1, p1, Landroid/os/Message;->arg2:I

    div-int/2addr v0, v1

    iget v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    add-int/lit8 v1, v1, -0x1

    mul-int/lit8 v1, v1, 0x64

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->k:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    mul-int/lit8 v3, v0, 0x64

    iget v4, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->y:I

    div-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->j:Lcom/fimi/kernel/view/progress/ProgressView;

    int-to-float v0, v0

    invoke-virtual {v1, v0}, Lcom/fimi/kernel/view/progress/ProgressView;->setCurrentCount(F)V

    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x100

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->o:Lcom/fimi/soul/biz/update/f;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/update/f;->f()V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->b:Ljava/util/List;

    iget v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FirmwareInfo;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/FirmwareInfo;->setIsUpgradeSuccess(Ljava/lang/Boolean;)V

    iget-object v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->o:Lcom/fimi/soul/biz/update/f;

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->b:Ljava/util/List;

    iget v2, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FirmwareInfo;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/biz/update/f;->a(Lcom/fimi/soul/entity/FirmwareInfo;)V

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->c()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    :goto_0
    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    iget v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->b:Ljava/util/List;

    iget v1, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->z:I

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FirmwareInfo;

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/update/UpgradingActivity;->a(Lcom/fimi/soul/entity/FirmwareInfo;)V

    :cond_3
    :goto_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x88

    if-ne v0, v1, :cond_4

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->x:Z

    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x66

    if-ne v0, v1, :cond_5

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->d()V

    :cond_5
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x20

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->l()V

    goto :goto_0

    :cond_6
    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->h()V

    goto :goto_1
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->q()V

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/fimi/soul/base/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onResume()V
    .locals 1

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onResume()V

    sget v0, Lcom/fimi/soul/module/update/UpgradingActivity;->w:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    sput v0, Lcom/fimi/soul/module/update/UpgradingActivity;->w:I

    invoke-direct {p0}, Lcom/fimi/soul/module/update/UpgradingActivity;->m()V

    :cond_0
    return-void
.end method

.method protected onStart()V
    .locals 0

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onStart()V

    return-void
.end method

.method protected onStop()V
    .locals 0

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onStop()V

    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 2

    invoke-super {p0, p1}, Lcom/fimi/soul/base/BaseActivity;->onWindowFocusChanged(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->l:Landroid/widget/ImageView;

    const v1, 0x7f020441

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/update/UpgradingActivity;->l:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    return-void
.end method
