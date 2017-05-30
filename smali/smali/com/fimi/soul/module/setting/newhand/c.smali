.class public Lcom/fimi/soul/module/setting/newhand/c;
.super Lcom/fimi/soul/module/setting/newhand/d;


# static fields
.field private static final F:I = 0xbb8

.field private static final G:I = 0x1

.field public static final a:I = 0x9

.field public static final b:B = 0x0t

.field public static final c:B = 0x1t

.field public static final d:B = 0x2t

.field public static final e:B = 0x3t

.field public static final f:B = 0x55t

.field public static final g:B = -0x56t

.field public static final h:B = 0x0t

.field public static final i:B = 0x1t

.field public static final j:I = 0x3c

.field private static final l:I = 0x2

.field private static final m:I = 0x3

.field private static final n:I = 0x4

.field private static final o:I = 0x5

.field private static final p:I = 0x6

.field private static final q:I = 0x7

.field private static final r:I = 0x8

.field private static final s:I = 0x9

.field private static final t:I = 0xa

.field private static final u:I = 0xb

.field private static final v:Ljava/lang/String; = "0"

.field private static final w:Ljava/lang/String; = "1"

.field private static final x:Ljava/lang/String; = "2"

.field private static final y:Ljava/lang/String; = "3"


# instance fields
.field private A:I

.field private B:I

.field private C:Z

.field private D:Landroid/content/Context;

.field private E:Lcom/fimi/soul/biz/o/a;

.field private H:Landroid/os/Handler;

.field k:Lcom/fimi/soul/drone/a;

.field private z:I


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/a;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/newhand/d;-><init>()V

    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->z:I

    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->A:I

    iput v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->B:I

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->C:Z

    new-instance v0, Lcom/fimi/soul/module/setting/newhand/c$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/setting/newhand/c$1;-><init>(Lcom/fimi/soul/module/setting/newhand/c;)V

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->H:Landroid/os/Handler;

    iput-object p1, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    iput-object p2, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    invoke-static {p2}, Lcom/fimi/soul/biz/o/a;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/o/a;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->E:Lcom/fimi/soul/biz/o/a;

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->m()Z

    move-result v0

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->C:Z

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/setting/newhand/c;I)I
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/setting/newhand/c;->A:I

    return p1
.end method

.method private a(B)Lcom/fimi/soul/drone/c/a/c;
    .locals 4

    const/4 v3, 0x0

    new-instance v0, Lcom/fimi/soul/drone/c/a/c;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/c;-><init>()V

    const/16 v1, 0x9

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->b:I

    const/16 v1, 0x87

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->c:I

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/16 v2, 0x55

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, p1}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(I)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    return-object v0
.end method

.method static synthetic a(Lcom/fimi/soul/module/setting/newhand/c;Ljava/lang/String;)Lcom/fimi/soul/entity/FlyModeLog;
    .locals 1

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/setting/newhand/c;->a(Ljava/lang/String;)Lcom/fimi/soul/entity/FlyModeLog;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;)Lcom/fimi/soul/entity/FlyModeLog;
    .locals 6

    invoke-static {}, Lcom/fimi/kernel/c;->c()Lcom/fimi/kernel/c/a;

    move-result-object v0

    const-string v1, "sp_firmware_cache"

    const-class v2, Lcom/fimi/soul/module/update/a/b;

    invoke-interface {v0, v1, v2}, Lcom/fimi/kernel/c/a;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/b;->a()I

    move-result v1

    invoke-static {}, Lcom/fimi/kernel/c;->c()Lcom/fimi/kernel/c/a;

    move-result-object v0

    const-string v2, "sp_firmware_cache"

    const-class v3, Lcom/fimi/soul/module/update/a/b;

    invoke-interface {v0, v2, v3}, Lcom/fimi/kernel/c/a;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/b;->f()I

    move-result v0

    new-instance v2, Lcom/fimi/soul/entity/FlyModeLog;

    invoke-direct {v2}, Lcom/fimi/soul/entity/FlyModeLog;-><init>()V

    iget-object v3, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    invoke-static {v3}, Lcom/fimi/soul/base/a;->b(Landroid/content/Context;)Lcom/fimi/soul/entity/User;

    move-result-object v3

    invoke-virtual {v3}, Lcom/fimi/soul/entity/User;->getUserID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/entity/FlyModeLog;->setUserID(Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ""

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/fimi/soul/entity/FlyModeLog;->setFcVersion(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Lcom/fimi/soul/entity/FlyModeLog;->setOpenType(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/fimi/soul/utils/ao;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/fimi/soul/entity/FlyModeLog;->setApplyTime(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/fimi/soul/entity/FlyModeLog;->setX2Version(Ljava/lang/String;)V

    const-string v0, "0"

    invoke-virtual {v2, v0}, Lcom/fimi/soul/entity/FlyModeLog;->setAppType(Ljava/lang/String;)V

    return-object v2
.end method

.method static synthetic a(Lcom/fimi/soul/module/setting/newhand/c;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/newhand/c;->k()V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/setting/newhand/c;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/setting/newhand/c;->b(B)V

    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/module/setting/newhand/c;I)I
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/setting/newhand/c;->B:I

    return p1
.end method

.method static synthetic b(Lcom/fimi/soul/module/setting/newhand/c;)Lcom/fimi/soul/biz/o/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->E:Lcom/fimi/soul/biz/o/a;

    return-object v0
.end method

.method private b(II)Lcom/fimi/soul/drone/c/a/c;
    .locals 4

    const/4 v3, 0x0

    new-instance v0, Lcom/fimi/soul/drone/c/a/c;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/c;-><init>()V

    const/16 v1, 0x9

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->b:I

    const/16 v1, 0x87

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->c:I

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/16 v2, 0x55

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    int-to-byte v2, p1

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    int-to-byte v2, p2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(I)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    return-object v0
.end method

.method private b(B)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/setting/newhand/c;->a(B)Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method

.method static synthetic c(Lcom/fimi/soul/module/setting/newhand/c;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->A:I

    return v0
.end method

.method static synthetic d(Lcom/fimi/soul/module/setting/newhand/c;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->B:I

    return v0
.end method

.method private d(I)Lcom/fimi/soul/drone/c/a/c;
    .locals 4

    const/4 v3, 0x0

    new-instance v0, Lcom/fimi/soul/drone/c/a/c;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/c;-><init>()V

    const/16 v1, 0x9

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->b:I

    const/16 v1, 0x87

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->c:I

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/16 v2, 0x55

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    int-to-float v2, p1

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->a(F)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    return-object v0
.end method

.method static synthetic e(Lcom/fimi/soul/module/setting/newhand/c;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    return-object v0
.end method

.method private e(I)Lcom/fimi/soul/drone/c/a/c;
    .locals 4

    const/4 v3, 0x0

    new-instance v0, Lcom/fimi/soul/drone/c/a/c;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/c;-><init>()V

    const/16 v1, 0x9

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->b:I

    const/16 v1, 0x87

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->c:I

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/16 v2, 0x55

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    int-to-float v2, p1

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->a(F)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    return-object v0
.end method

.method private f()Lcom/fimi/soul/drone/c/a/c;
    .locals 4

    const/4 v3, 0x0

    new-instance v0, Lcom/fimi/soul/drone/c/a/c;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/c;-><init>()V

    const/16 v1, 0x9

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->b:I

    const/16 v1, 0x87

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->c:I

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/16 v2, -0x56

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(I)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    return-object v0
.end method

.method private f(I)Lcom/fimi/soul/drone/c/a/c;
    .locals 4

    const/4 v3, 0x0

    new-instance v0, Lcom/fimi/soul/drone/c/a/c;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/c;-><init>()V

    const/16 v1, 0x9

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->b:I

    const/16 v1, 0x87

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->c:I

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/16 v2, 0x55

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    int-to-float v2, p1

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->a(F)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    return-object v0
.end method

.method private g()Lcom/fimi/soul/drone/c/a/c;
    .locals 4

    const/4 v3, 0x0

    new-instance v0, Lcom/fimi/soul/drone/c/a/c;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/c;-><init>()V

    const/16 v1, 0x9

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->b:I

    const/16 v1, 0x87

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->c:I

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/16 v2, -0x56

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(I)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    return-object v0
.end method

.method private h()Lcom/fimi/soul/drone/c/a/c;
    .locals 4

    const/4 v3, 0x0

    new-instance v0, Lcom/fimi/soul/drone/c/a/c;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/c;-><init>()V

    const/16 v1, 0x9

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->b:I

    const/16 v1, 0x87

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->c:I

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/16 v2, -0x56

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->a(F)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    return-object v0
.end method

.method private i()Lcom/fimi/soul/drone/c/a/c;
    .locals 4

    const/4 v3, 0x0

    new-instance v0, Lcom/fimi/soul/drone/c/a/c;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/c;-><init>()V

    const/16 v1, 0x9

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->b:I

    const/16 v1, 0x87

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->c:I

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/16 v2, -0x56

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->a(F)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    return-object v0
.end method

.method private j()Lcom/fimi/soul/drone/c/a/c;
    .locals 4

    const/4 v3, 0x0

    new-instance v0, Lcom/fimi/soul/drone/c/a/c;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/c;-><init>()V

    const/16 v1, 0x9

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->b:I

    const/16 v1, 0x87

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->c:I

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/16 v2, -0x56

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->a(F)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    return-object v0
.end method

.method private k()V
    .locals 1

    invoke-static {}, Lcom/fimi/kernel/c;->b()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->b()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/fimi/kernel/c;->b()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->b()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/fimi/kernel/c;->b()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->c()V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/newhand/c;->h()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method

.method public a(I)V
    .locals 2

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->C:Z

    if-eqz v0, :cond_0

    int-to-double v0, p1

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->d(D)D

    move-result-wide v0

    double-to-int p1, v0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/setting/newhand/c;->d(I)Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method

.method public a(II)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-direct {p0, p1, p2}, Lcom/fimi/soul/module/setting/newhand/c;->b(II)Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method

.method public a(ILcom/fimi/soul/module/setting/newhand/e;)V
    .locals 4

    const/16 v1, 0x1f4

    iput p1, p0, Lcom/fimi/soul/module/setting/newhand/c;->z:I

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v1, 0x7f0a037e

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v2, 0x7f0a02db

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    const/16 v0, 0x1388

    if-ne p1, v0, :cond_2

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/newhand/c;->a(I)V

    invoke-interface {p2, v1}, Lcom/fimi/soul/module/setting/newhand/e;->a(I)V

    goto :goto_0

    :cond_2
    const-string v0, "2"

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/setting/newhand/c;->a(Ljava/lang/String;)Lcom/fimi/soul/entity/FlyModeLog;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/view/f$a;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/fimi/soul/view/f$a;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v3, 0x7f0a0387

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$a;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v3, 0x7f0a02a3

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/view/f$a;->b(Ljava/lang/String;)Lcom/fimi/soul/view/f$a;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0e006e

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/view/f$a;->a(I)Lcom/fimi/soul/view/f$a;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v3, 0x7f0a0385

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/fimi/soul/module/setting/newhand/c$7;

    invoke-direct {v3, p0, p2, v0}, Lcom/fimi/soul/module/setting/newhand/c$7;-><init>(Lcom/fimi/soul/module/setting/newhand/c;Lcom/fimi/soul/module/setting/newhand/e;Lcom/fimi/soul/entity/FlyModeLog;)V

    invoke-virtual {v1, v2, v3}, Lcom/fimi/soul/view/f$a;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v2, 0x7f0a0103

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/setting/newhand/c$6;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/setting/newhand/c$6;-><init>(Lcom/fimi/soul/module/setting/newhand/c;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$a;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V

    goto/16 :goto_0
.end method

.method public a(Lcom/fimi/kernel/view/button/SwitchButton;Lcom/fimi/soul/entity/Setting;)V
    .locals 3

    const/4 v2, 0x0

    const/4 v1, 0x1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v1, 0x7f0a037e

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v2, 0x7f0a02de

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1, v2, v1}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/setting/newhand/c;->b(B)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1, v1, v1}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    invoke-direct {p0, v2}, Lcom/fimi/soul/module/setting/newhand/c;->b(B)V

    goto :goto_0
.end method

.method public a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/Setting;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v1, 0x7f0a037e

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v2, 0x7f0a02d9

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/module/setting/newhand/c;->a(II)V

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/fimi/soul/view/f$a;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/fimi/soul/view/f$a;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v2, 0x7f0a0387

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v2, 0x7f0a01ee

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$a;->b(Ljava/lang/String;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e006e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$a;->a(I)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v2, 0x7f0a0385

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/setting/newhand/c$3;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/setting/newhand/c$3;-><init>(Lcom/fimi/soul/module/setting/newhand/c;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v2, 0x7f0a0103

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/setting/newhand/c$2;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/setting/newhand/c$2;-><init>(Lcom/fimi/soul/module/setting/newhand/c;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$a;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V

    goto/16 :goto_0
.end method

.method public a(Ljava/util/List;Lcom/fimi/soul/biz/manager/k;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/Setting;",
            ">;",
            "Lcom/fimi/soul/biz/manager/k;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v1, 0x7f0a037e

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v2, 0x7f0a02df

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->h:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/module/setting/newhand/c;->a(II)V

    goto :goto_0

    :cond_4
    const-string v0, "0"

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/setting/newhand/c;->a(Ljava/lang/String;)Lcom/fimi/soul/entity/FlyModeLog;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/view/f$a;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/fimi/soul/view/f$a;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v3, 0x7f0a0387

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$a;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v3, 0x7f0a00b5

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/view/f$a;->b(Ljava/lang/String;)Lcom/fimi/soul/view/f$a;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0e006e

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/view/f$a;->a(I)Lcom/fimi/soul/view/f$a;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v3, 0x7f0a017f

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/fimi/soul/module/setting/newhand/c$5;

    invoke-direct {v3, p0, v0, p2}, Lcom/fimi/soul/module/setting/newhand/c$5;-><init>(Lcom/fimi/soul/module/setting/newhand/c;Lcom/fimi/soul/entity/FlyModeLog;Lcom/fimi/soul/biz/manager/k;)V

    invoke-virtual {v1, v2, v3}, Lcom/fimi/soul/view/f$a;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v2, 0x7f0a0330

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/setting/newhand/c$4;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/setting/newhand/c$4;-><init>(Lcom/fimi/soul/module/setting/newhand/c;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$a;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V

    goto/16 :goto_0
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/newhand/c;->i()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method

.method public b(I)V
    .locals 2

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->C:Z

    if-eqz v0, :cond_0

    int-to-double v0, p1

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->c(D)D

    move-result-wide v0

    double-to-int p1, v0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/setting/newhand/c;->e(I)Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method

.method public b(ILcom/fimi/soul/module/setting/newhand/e;)V
    .locals 6

    iput p1, p0, Lcom/fimi/soul/module/setting/newhand/c;->A:I

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v1, 0x7f0a037e

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v2, 0x7f0a02dd

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->C:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v1, 0x7f0a03d6

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    iget-boolean v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->C:Z

    if-eqz v1, :cond_3

    const-wide/high16 v2, 0x4032000000000000L    # 18.0

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v2

    double-to-int v1, v2

    :goto_2
    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/kernel/utils/v;->m()Z

    move-result v2

    if-eqz v2, :cond_4

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v2

    double-to-int v2, v2

    :goto_3
    iget-boolean v3, p0, Lcom/fimi/soul/module/setting/newhand/c;->C:Z

    if-eqz v3, :cond_5

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v3

    invoke-virtual {v3}, Lcom/fimi/kernel/utils/v;->g()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    int-to-double v4, v3

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->b(D)D

    move-result-wide v4

    double-to-int v3, v4

    :goto_4
    new-instance v3, Lcom/fimi/soul/view/f$b;

    iget-object v4, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    invoke-direct {v3, v4}, Lcom/fimi/soul/view/f$b;-><init>(Landroid/content/Context;)V

    iget-object v4, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v5, 0x7f0a01d2

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/fimi/soul/view/f$b;->c(Ljava/lang/String;)Lcom/fimi/soul/view/f$b;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/fimi/soul/view/f$b;->a(I)Lcom/fimi/soul/view/f$b;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/fimi/soul/view/f$b;->b(I)Lcom/fimi/soul/view/f$b;

    move-result-object v1

    iget-object v3, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0e006e

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/fimi/soul/view/f$b;->d(I)Lcom/fimi/soul/view/f$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/fimi/soul/view/f$b;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$b;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v3, 0x7f0a015c

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$b;->b(Ljava/lang/String;)Lcom/fimi/soul/view/f$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$b;->a(Z)Lcom/fimi/soul/view/f$b;

    move-result-object v0

    iget v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->A:I

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$b;->c(I)Lcom/fimi/soul/view/f$b;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v3, 0x7f0a0103

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/fimi/soul/module/setting/newhand/c$10;

    invoke-direct {v3, p0}, Lcom/fimi/soul/module/setting/newhand/c$10;-><init>(Lcom/fimi/soul/module/setting/newhand/c;)V

    invoke-virtual {v0, v1, v3}, Lcom/fimi/soul/view/f$b;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$b;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v3, 0x7f0a017f

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/fimi/soul/module/setting/newhand/c$9;

    invoke-direct {v3, p0}, Lcom/fimi/soul/module/setting/newhand/c$9;-><init>(Lcom/fimi/soul/module/setting/newhand/c;)V

    invoke-virtual {v0, v1, v3}, Lcom/fimi/soul/view/f$b;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$b;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/module/setting/newhand/c$8;

    invoke-direct {v1, p0, v2}, Lcom/fimi/soul/module/setting/newhand/c$8;-><init>(Lcom/fimi/soul/module/setting/newhand/c;I)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$b;->a(Landroid/widget/SeekBar$OnSeekBarChangeListener;)Lcom/fimi/soul/view/f$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$b;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v1, 0x7f0a03d5

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :cond_3
    const/16 v1, 0x12

    goto/16 :goto_2

    :cond_4
    const/4 v2, 0x3

    goto/16 :goto_3

    :cond_5
    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v3

    invoke-virtual {v3}, Lcom/fimi/kernel/utils/v;->g()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    goto/16 :goto_4
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/newhand/c;->j()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method

.method public c(I)V
    .locals 2

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->C:Z

    if-eqz v0, :cond_0

    int-to-double v0, p1

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/t;->d(D)D

    move-result-wide v0

    double-to-int p1, v0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/setting/newhand/c;->f(I)Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method

.method public c(ILcom/fimi/soul/module/setting/newhand/e;)V
    .locals 7

    iput p1, p0, Lcom/fimi/soul/module/setting/newhand/c;->B:I

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v1, 0x7f0a037e

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v2, 0x7f0a02dc

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->C:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v1, 0x7f0a0166

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    iget-boolean v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->C:Z

    if-eqz v1, :cond_3

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    int-to-double v2, v1

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/t;->a(D)D

    move-result-wide v2

    double-to-int v1, v2

    :goto_2
    iget-boolean v2, p0, Lcom/fimi/soul/module/setting/newhand/c;->C:Z

    if-eqz v2, :cond_4

    const-wide/high16 v2, 0x403e000000000000L    # 30.0

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/t;->a(D)D

    move-result-wide v2

    double-to-int v2, v2

    :goto_3
    iget-boolean v3, p0, Lcom/fimi/soul/module/setting/newhand/c;->C:Z

    if-eqz v3, :cond_5

    const-wide v4, 0x407f400000000000L    # 500.0

    invoke-static {v4, v5}, Lcom/fimi/kernel/utils/t;->a(D)D

    move-result-wide v4

    double-to-int v3, v4

    :goto_4
    new-instance v4, Lcom/fimi/soul/view/f$b;

    iget-object v5, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    invoke-direct {v4, v5}, Lcom/fimi/soul/view/f$b;-><init>(Landroid/content/Context;)V

    iget-object v5, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v6, 0x7f0a01d0

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/fimi/soul/view/f$b;->c(Ljava/lang/String;)Lcom/fimi/soul/view/f$b;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/fimi/soul/view/f$b;->a(I)Lcom/fimi/soul/view/f$b;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/fimi/soul/view/f$b;->b(I)Lcom/fimi/soul/view/f$b;

    move-result-object v3

    iget-object v4, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0e006e

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/fimi/soul/view/f$b;->d(I)Lcom/fimi/soul/view/f$b;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/fimi/soul/view/f$b;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$b;

    move-result-object v0

    iget-object v3, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v4, 0x7f0a015b

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/fimi/soul/view/f$b;->b(Ljava/lang/String;)Lcom/fimi/soul/view/f$b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$b;->c(I)Lcom/fimi/soul/view/f$b;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v3, 0x7f0a0103

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/fimi/soul/module/setting/newhand/c$13;

    invoke-direct {v3, p0}, Lcom/fimi/soul/module/setting/newhand/c$13;-><init>(Lcom/fimi/soul/module/setting/newhand/c;)V

    invoke-virtual {v0, v1, v3}, Lcom/fimi/soul/view/f$b;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$b;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v3, 0x7f0a017f

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/fimi/soul/module/setting/newhand/c$12;

    invoke-direct {v3, p0, p2}, Lcom/fimi/soul/module/setting/newhand/c$12;-><init>(Lcom/fimi/soul/module/setting/newhand/c;Lcom/fimi/soul/module/setting/newhand/e;)V

    invoke-virtual {v0, v1, v3}, Lcom/fimi/soul/view/f$b;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$b;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/module/setting/newhand/c$11;

    invoke-direct {v1, p0, v2}, Lcom/fimi/soul/module/setting/newhand/c$11;-><init>(Lcom/fimi/soul/module/setting/newhand/c;I)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$b;->a(Landroid/widget/SeekBar$OnSeekBarChangeListener;)Lcom/fimi/soul/view/f$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$b;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->D:Landroid/content/Context;

    const v1, 0x7f0a0167

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :cond_3
    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    goto/16 :goto_2

    :cond_4
    const/16 v2, 0x1e

    goto/16 :goto_3

    :cond_5
    const/16 v3, 0x1f4

    goto/16 :goto_4
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/newhand/c;->g()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/newhand/c;->f()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method
