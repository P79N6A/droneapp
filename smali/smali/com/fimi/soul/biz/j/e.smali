.class public Lcom/fimi/soul/biz/j/e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/fimi/soul/drone/d$b;


# instance fields
.field private a:Lcom/fimi/soul/drone/a;

.field private b:Lcom/fimi/kernel/d/b;

.field private c:Z

.field private d:I

.field private e:I

.field private f:Z


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/fimi/soul/biz/j/e;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {p1, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    iget-object v0, p1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/kernel/d/b;->b(Landroid/content/Context;)Lcom/fimi/kernel/d/b;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/j/e;->b:Lcom/fimi/kernel/d/b;

    return-void
.end method

.method private declared-synchronized a(Lcom/fimi/soul/drone/h/y;)V
    .locals 2

    const/4 v0, 0x1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lcom/fimi/soul/drone/h/y;->g()B

    move-result v1

    and-int/lit8 v1, v1, 0xf

    if-ne v1, v0, :cond_3

    :goto_0
    iget-boolean v1, p0, Lcom/fimi/soul/biz/j/e;->c:Z

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/j/e;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v1

    if-nez v1, :cond_0

    iget v1, p0, Lcom/fimi/soul/biz/j/e;->e:I

    packed-switch v1, :pswitch_data_0

    :cond_0
    :goto_1
    iget-boolean v1, p0, Lcom/fimi/soul/biz/j/e;->c:Z

    if-eqz v1, :cond_1

    if-nez v0, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/biz/j/e;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/biz/j/e;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/ac;->j()Z

    move-result v1

    if-eqz v1, :cond_4

    const v1, 0x7f0a0100

    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/j/e;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/j/e;->a(Ljava/lang/String;)V

    :cond_1
    :goto_2
    iget-boolean v1, p0, Lcom/fimi/soul/biz/j/e;->c:Z

    if-eq v1, v0, :cond_2

    iput-boolean v0, p0, Lcom/fimi/soul/biz/j/e;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p0

    return-void

    :cond_3
    const/4 v0, 0x0

    goto :goto_0

    :pswitch_0
    const v1, 0x7f0a0100

    :try_start_1
    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/j/e;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/j/e;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :pswitch_1
    const v1, 0x7f0a0101

    :try_start_2
    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/j/e;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/j/e;->a(Ljava/lang/String;)V

    goto :goto_1

    :pswitch_2
    const v1, 0x7f0a0102

    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/j/e;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/j/e;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    const v1, 0x7f0a0371

    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/j/e;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/fimi/soul/biz/j/e;->a(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private declared-synchronized c()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/fimi/soul/biz/j/e;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/biz/j/e;->f:Z

    iget v0, p0, Lcom/fimi/soul/biz/j/e;->e:I

    iput v0, p0, Lcom/fimi/soul/biz/j/e;->d:I

    :cond_0
    iget v0, p0, Lcom/fimi/soul/biz/j/e;->d:I

    iget v1, p0, Lcom/fimi/soul/biz/j/e;->e:I

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/fimi/soul/biz/j/e;->e:I

    packed-switch v0, :pswitch_data_0

    :goto_0
    iget v0, p0, Lcom/fimi/soul/biz/j/e;->e:I

    iput v0, p0, Lcom/fimi/soul/biz/j/e;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :pswitch_0
    const v0, 0x7f0a0110

    :try_start_1
    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/e;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/e;->a(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :pswitch_1
    const v0, 0x7f0a0111

    :try_start_2
    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/e;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/e;->a(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_2
    const v0, 0x7f0a0112

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/e;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/j/e;->a(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/e;->a:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/e;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->b(Lcom/fimi/soul/drone/d$b;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/biz/j/e;->c:Z

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/e;->b:Lcom/fimi/kernel/d/b;

    invoke-virtual {v0, p1}, Lcom/fimi/kernel/d/b;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/j/e;->a:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 2

    sget-object v0, Lcom/fimi/soul/biz/j/e$1;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->d()B

    move-result v0

    iput v0, p0, Lcom/fimi/soul/biz/j/e;->e:I

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->r()Lcom/fimi/soul/drone/h/y;

    move-result-object v0

    invoke-direct {p0}, Lcom/fimi/soul/biz/j/e;->c()V

    invoke-direct {p0, v0}, Lcom/fimi/soul/biz/j/e;->a(Lcom/fimi/soul/drone/h/y;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
