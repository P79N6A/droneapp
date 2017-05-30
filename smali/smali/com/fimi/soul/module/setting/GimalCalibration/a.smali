.class public Lcom/fimi/soul/module/setting/GimalCalibration/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/drone/d$b;
.implements Lcom/fimi/soul/module/dronemanage/h$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/setting/GimalCalibration/a$a;
    }
.end annotation


# static fields
.field public static a:I = 0x0

.field public static final b:B = 0x7t

.field public static final c:B = 0x8t

.field public static final d:I = 0x2

.field private static final h:B


# instance fields
.field e:Lcom/fimi/soul/module/dronemanage/h;

.field f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

.field g:Lcom/fimi/soul/drone/a;

.field private final i:I

.field private final j:I

.field private final k:I

.field private final l:I

.field private final m:I

.field private final n:I

.field private o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x64

    sput v0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->a:I

    return-void
.end method

.method public constructor <init>(Lcom/fimi/soul/module/setting/GimalCalibration/a$a;Lcom/fimi/soul/drone/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->e:Lcom/fimi/soul/module/dronemanage/h;

    const/4 v0, 0x0

    iput v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->i:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->j:I

    const/4 v0, 0x2

    iput v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->k:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->l:I

    const/4 v0, 0x4

    iput v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->m:I

    const/4 v0, 0x5

    iput v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->n:I

    iput-object p1, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

    iput-object p2, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->g:Lcom/fimi/soul/drone/a;

    return-void
.end method

.method private b(B)V
    .locals 3

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/setting/GimalCalibration/a;->a(B)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->o:Z

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

    invoke-interface {v1, v0}, Lcom/fimi/soul/module/setting/GimalCalibration/a$a;->a(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->g:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v2, 0x7f0a0087

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/module/setting/GimalCalibration/a$a;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private h()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->g:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ak()Lcom/fimi/soul/drone/h/w;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/w;->b()B

    move-result v0

    if-lez v0, :cond_1

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/setting/GimalCalibration/a;->b(B)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->g:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ak()Lcom/fimi/soul/drone/h/w;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/w;->d()B

    move-result v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

    invoke-interface {v1, v0}, Lcom/fimi/soul/module/setting/GimalCalibration/a$a;->a(I)V

    sget v1, Lcom/fimi/soul/module/setting/GimalCalibration/a;->a:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->o:Z

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

    invoke-interface {v0}, Lcom/fimi/soul/module/setting/GimalCalibration/a$a;->c()V

    goto :goto_0
.end method


# virtual methods
.method public a(B)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x8

    if-ge v0, v1, :cond_1

    invoke-static {p1, v0}, Lcom/fimi/soul/utils/ao;->a(II)I

    move-result v1

    if-lez v1, :cond_0

    packed-switch v0, :pswitch_data_0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :pswitch_0
    const v0, 0x7f0a0089

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/GimalCalibration/a;->b(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0

    :pswitch_1
    const v0, 0x7f0a008b

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/GimalCalibration/a;->b(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :pswitch_2
    const v0, 0x7f0a008c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/GimalCalibration/a;->b(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :pswitch_3
    const v0, 0x7f0a008a

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/GimalCalibration/a;->b(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :pswitch_4
    const v0, 0x7f0a0088

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/GimalCalibration/a;->b(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :pswitch_5
    const v0, 0x7f0a008d

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/GimalCalibration/a;->b(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public a()V
    .locals 3

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/GimalCalibration/a;->c()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->g:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->e:Lcom/fimi/soul/module/dronemanage/h;

    if-nez v1, :cond_0

    invoke-static {p0}, Lcom/fimi/soul/module/dronemanage/h;->a(Lcom/fimi/soul/module/dronemanage/h$a;)Lcom/fimi/soul/module/dronemanage/h;

    move-result-object v1

    iput-object v1, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->e:Lcom/fimi/soul/module/dronemanage/h;

    :cond_0
    iget-object v1, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->e:Lcom/fimi/soul/module/dronemanage/h;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->g:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1, v2, v0}, Lcom/fimi/soul/module/dronemanage/h;->a(Lcom/fimi/soul/drone/a;Lcom/fimi/soul/drone/c/a/c;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->e:Lcom/fimi/soul/module/dronemanage/h;

    invoke-virtual {v0}, Lcom/fimi/soul/module/dronemanage/h;->b()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->o:Z

    return-void
.end method

.method public a(I)V
    .locals 0

    return-void
.end method

.method public b(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->g:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->e:Lcom/fimi/soul/module/dronemanage/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

    invoke-interface {v0}, Lcom/fimi/soul/module/setting/GimalCalibration/a$a;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->e:Lcom/fimi/soul/module/dronemanage/h;

    invoke-virtual {v0}, Lcom/fimi/soul/module/dronemanage/h;->d()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->e:Lcom/fimi/soul/module/dronemanage/h;

    invoke-virtual {v0}, Lcom/fimi/soul/module/dronemanage/h;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->e:Lcom/fimi/soul/module/dronemanage/h;

    :cond_0
    return-void
.end method

.method public c()Lcom/fimi/soul/drone/c/a/c;
    .locals 3

    new-instance v0, Lcom/fimi/soul/drone/c/a/c;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/c;-><init>()V

    const/4 v1, 0x2

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->b:I

    const/16 v1, 0x7a

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->c:I

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    iget-object v1, v0, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    return-object v0
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->g:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/b/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/b/d;->r()V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->g:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->g:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->b(Lcom/fimi/soul/drone/d$b;)V

    return-void
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

    :cond_0
    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 2

    sget-object v0, Lcom/fimi/soul/module/setting/GimalCalibration/a$1;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/GimalCalibration/a;->b()V

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/GimalCalibration/a;->h()V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->o:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

    const v1, 0x7f0a0083

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/GimalCalibration/a;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/module/setting/GimalCalibration/a$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->o:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

    invoke-interface {v0}, Lcom/fimi/soul/module/setting/GimalCalibration/a$a;->d()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->o:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

    const v1, 0x7f0a0084

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/GimalCalibration/a;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/module/setting/GimalCalibration/a$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ad()Lcom/fimi/soul/drone/h/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->Z()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

    const v1, 0x7f0a0089

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/GimalCalibration/a;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/module/setting/GimalCalibration/a$a;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ad()Lcom/fimi/soul/drone/h/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/GimalCalibration/a;->f:Lcom/fimi/soul/module/setting/GimalCalibration/a$a;

    const v1, 0x7f0a015f

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/GimalCalibration/a;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/module/setting/GimalCalibration/a$a;->a(Ljava/lang/String;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
