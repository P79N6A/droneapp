.class public Lcom/fimi/soul/biz/manager/e;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/biz/manager/e$a;
    }
.end annotation


# static fields
.field private static a:Lcom/fimi/soul/biz/manager/e; = null

.field private static final b:I = 0x0

.field private static final c:I = 0x1

.field private static final d:I = 0x2

.field private static final e:I = 0x3


# instance fields
.field private f:Lcom/fimi/soul/biz/m/d;

.field private g:Landroid/os/Handler;

.field private h:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/fimi/soul/biz/m/k;",
            ">;"
        }
    .end annotation
.end field

.field private i:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/fimi/soul/biz/manager/e;->a:Lcom/fimi/soul/biz/manager/e;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/biz/manager/e;->i:Landroid/content/Context;

    new-instance v0, Lcom/fimi/soul/biz/l/c;

    invoke-direct {v0}, Lcom/fimi/soul/biz/l/c;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/manager/e;->f:Lcom/fimi/soul/biz/m/d;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/fimi/soul/biz/manager/e;->g:Landroid/os/Handler;

    iput-object p1, p0, Lcom/fimi/soul/biz/manager/e;->i:Landroid/content/Context;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/manager/e;->h:Ljava/util/HashMap;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/biz/manager/e;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/e;->g:Landroid/os/Handler;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/e;
    .locals 1

    sget-object v0, Lcom/fimi/soul/biz/manager/e;->a:Lcom/fimi/soul/biz/manager/e;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/biz/manager/e;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/manager/e;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/fimi/soul/biz/manager/e;->a:Lcom/fimi/soul/biz/manager/e;

    :cond_0
    sget-object v0, Lcom/fimi/soul/biz/manager/e;->a:Lcom/fimi/soul/biz/manager/e;

    return-object v0
.end method

.method static synthetic b(Lcom/fimi/soul/biz/manager/e;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/e;->i:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/biz/manager/e;)Lcom/fimi/soul/biz/m/d;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/e;->f:Lcom/fimi/soul/biz/m/d;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/fimi/soul/biz/m/k;)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/e;->h:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/fimi/soul/biz/manager/e$a;

    invoke-direct {v0, p0, v2}, Lcom/fimi/soul/biz/manager/e$a;-><init>(Lcom/fimi/soul/biz/manager/e;I)V

    invoke-static {v0}, Lcom/fimi/kernel/utils/x;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Lcom/fimi/soul/biz/m/k;)V
    .locals 3

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/e;->h:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/fimi/soul/biz/manager/e$a;

    invoke-direct {v0, p0, v2}, Lcom/fimi/soul/biz/manager/e$a;-><init>(Lcom/fimi/soul/biz/manager/e;I)V

    invoke-static {v0}, Lcom/fimi/kernel/utils/x;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(Lcom/fimi/soul/biz/m/k;)V
    .locals 3

    const/4 v2, 0x2

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/e;->h:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/fimi/soul/biz/manager/e$a;

    invoke-direct {v0, p0, v2}, Lcom/fimi/soul/biz/manager/e$a;-><init>(Lcom/fimi/soul/biz/manager/e;I)V

    invoke-static {v0}, Lcom/fimi/kernel/utils/x;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d(Lcom/fimi/soul/biz/m/k;)V
    .locals 3

    const/4 v2, 0x3

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/e;->h:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/fimi/soul/biz/manager/e$a;

    invoke-direct {v0, p0, v2}, Lcom/fimi/soul/biz/manager/e$a;-><init>(Lcom/fimi/soul/biz/manager/e;I)V

    invoke-static {v0}, Lcom/fimi/kernel/utils/x;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 3

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/e;->h:Ljava/util/HashMap;

    iget v1, p1, Landroid/os/Message;->what:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/biz/m/k;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/fimi/soul/entity/PlaneMsg;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/fimi/soul/biz/m/k;->a(Lcom/fimi/soul/entity/PlaneMsg;Ljava/io/File;)V

    :cond_0
    const/4 v0, 0x0

    return v0
.end method