.class public Lcom/fimi/soul/base/DroidPlannerApp;
.super Lcom/fimi/soul/base/ErrorReportApp;

# interfaces
.implements Lcom/fimi/soul/drone/droneconnection/connection/f$b;


# static fields
.field static e:Lcom/fimi/soul/base/DroidPlannerApp;

.field private static i:Ljava/util/HashMap;


# instance fields
.field public a:Lcom/fimi/soul/drone/a;

.field public b:Lcom/fimi/soul/drone/a/a;

.field public c:Z

.field public d:Lcom/fimi/soul/drone/droneconnection/connection/service/a;

.field private f:Lcom/fimi/kernel/utils/v;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/fimi/soul/base/DroidPlannerApp;->e:Lcom/fimi/soul/base/DroidPlannerApp;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/fimi/soul/base/DroidPlannerApp;->i:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/base/ErrorReportApp;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->c:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->f:Lcom/fimi/kernel/utils/v;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->g:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->h:Ljava/util/List;

    return-void
.end method

.method public static c()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/fimi/soul/base/DroidPlannerApp;->i:Ljava/util/HashMap;

    return-object v0
.end method

.method public static g()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/fimi/soul/base/DroidPlannerApp;->e:Lcom/fimi/soul/base/DroidPlannerApp;

    return-object v0
.end method

.method private h()V
    .locals 3

    const-string v0, "1"

    const-string v1, "ro.kernel.qemu"

    invoke-static {v1}, Lcom/tencent/mm/sdk/platformtools/SystemProperty;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p0}, Lcom/fimi/soul/base/DroidPlannerApp;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v2, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v2, v2, 0x2

    iput v2, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    if-nez v2, :cond_0

    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_1

    :cond_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    :cond_1
    return-void
.end method

.method private i()V
    .locals 2

    new-instance v0, Lcom/fimi/soul/biz/manager/u;

    invoke-static {}, Lcom/fimi/soul/base/DroidPlannerApp;->g()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fimi/soul/biz/manager/u;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/fimi/soul/biz/manager/u;->a()V

    return-void
.end method

.method private j()Z
    .locals 5

    const-string v0, "activity"

    invoke-virtual {p0, v0}, Lcom/fimi/soul/base/DroidPlannerApp;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fimi/soul/base/DroidPlannerApp;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget v4, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    if-ne v4, v2, :cond_0

    iget-object v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private k()V
    .locals 4

    const/4 v3, 0x0

    invoke-static {p0}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {}, Lcom/fimi/soul/biz/n/a;->a()Lcom/fimi/soul/biz/n/a;

    move-result-object v1

    const-string v2, "Map_Code_Correction"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1, v3}, Lcom/fimi/soul/biz/n/a;->a(Z)V

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/fimi/soul/biz/n/a;->a(Z)V

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->h:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_1
    return-void
.end method

.method public a(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a(Lcom/fimi/soul/drone/c/a/b;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->b:Lcom/fimi/soul/drone/a/a;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/drone/a/a;->a(Lcom/fimi/soul/drone/c/a/b;)V

    return-void
.end method

.method public a(Z)V
    .locals 3

    iget-object v1, p0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->K()Lcom/fimi/soul/drone/h/ao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ao;->a()B

    move-result v0

    const/4 v2, 0x5

    if-le v0, v2, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v0}, Lcom/fimi/soul/drone/a;->b(Z)V

    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->g:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_0
    return-void
.end method

.method public b(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Z)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/drone/a;->a(Z)V

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->b(Z)V

    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->as:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->aL:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    return-void
.end method

.method public f()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->K()Lcom/fimi/soul/drone/h/ao;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/h/ao;->a(B)V

    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->b(Z)V

    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->as:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    return-void
.end method

.method public onCreate()V
    .locals 4

    invoke-super {p0}, Lcom/fimi/soul/base/ErrorReportApp;->onCreate()V

    invoke-static {p0}, Lcom/fimi/soul/utils/i;->a(Landroid/content/Context;)Lcom/fimi/soul/utils/i;

    sput-object p0, Lcom/fimi/soul/base/DroidPlannerApp;->e:Lcom/fimi/soul/base/DroidPlannerApp;

    new-instance v0, Lcom/fimi/soul/drone/droneconnection/connection/service/a;

    invoke-direct {v0, p0, p0}, Lcom/fimi/soul/drone/droneconnection/connection/service/a;-><init>(Landroid/content/Context;Lcom/fimi/soul/drone/droneconnection/connection/f$b;)V

    iput-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->d:Lcom/fimi/soul/drone/droneconnection/connection/service/a;

    invoke-static {}, Lcom/fimi/soul/utils/NetUtil;->a()Lcom/fimi/soul/utils/NetUtil;

    invoke-static {p0}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->f:Lcom/fimi/kernel/utils/v;

    new-instance v0, Lcom/fimi/soul/drone/a;

    iget-object v1, p0, Lcom/fimi/soul/base/DroidPlannerApp;->d:Lcom/fimi/soul/drone/droneconnection/connection/service/a;

    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    invoke-direct {v0, v1, p0, v2}, Lcom/fimi/soul/drone/a;-><init>(Lcom/fimi/soul/drone/droneconnection/connection/f$a;Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    new-instance v0, Lcom/fimi/soul/drone/a/a;

    iget-object v1, p0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    invoke-static {}, Lcom/fimi/soul/base/DroidPlannerApp;->g()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/fimi/soul/drone/a/a;-><init>(Lcom/fimi/soul/drone/a;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->b:Lcom/fimi/soul/drone/a/a;

    invoke-direct {p0}, Lcom/fimi/soul/base/DroidPlannerApp;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/base/DroidPlannerApp;->f:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "isfirstloading"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "2882303761517518920"

    const-string v1, "5761751863920"

    invoke-static {p0, v0, v1}, Lcom/xiaomi/mipush/sdk/MiPushClient;->registerPush(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    new-instance v0, Lcom/fimi/soul/base/DroidPlannerApp$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/base/DroidPlannerApp$1;-><init>(Lcom/fimi/soul/base/DroidPlannerApp;)V

    invoke-static {p0, v0}, Lcom/xiaomi/mipush/sdk/Logger;->setLogger(Landroid/content/Context;Lcom/xiaomi/channel/commonutils/logger/LoggerInterface;)V

    const-string v0, "2882303761517518920"

    const-string v1, "5761751863920"

    const-string v2, "Xiao Mi"

    invoke-static {p0, v0, v1, v2}, Lcom/xiaomi/mistatistic/sdk/MiStatInterface;->initialize(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x3

    const-wide/16 v2, 0x0

    invoke-static {v0, v2, v3}, Lcom/xiaomi/mistatistic/sdk/MiStatInterface;->setUploadPolicy(IJ)V

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/xiaomi/mistatistic/sdk/MiStatInterface;->enableExceptionCatcher(Z)V

    invoke-direct {p0}, Lcom/fimi/soul/base/DroidPlannerApp;->i()V

    invoke-static {p0}, Lcom/fimi/soul/biz/camera/b;->a(Lcom/fimi/soul/base/DroidPlannerApp;)V

    invoke-static {}, Lcom/fimi/soul/utils/x;->a()V

    invoke-direct {p0}, Lcom/fimi/soul/base/DroidPlannerApp;->k()V

    return-void
.end method

.method public onTerminate()V
    .locals 0

    invoke-super {p0}, Lcom/fimi/soul/base/ErrorReportApp;->onTerminate()V

    invoke-static {}, Lcom/fimi/soul/utils/x;->b()V

    return-void
.end method
