.class public Lcom/baidu/tts/o/a/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/tts/aop/tts/ITts;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/tts/o/a/c$1;
    }
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field private b:Lcom/baidu/tts/m/j;

.field private c:Lcom/baidu/tts/aop/ttslistener/TtsListener;

.field private d:Lcom/baidu/tts/f/m;

.field private e:Lcom/baidu/tts/a/c/c;

.field private volatile f:Lcom/baidu/tts/o/a/a;

.field private g:Lcom/baidu/tts/o/a/d;

.field private h:Lcom/baidu/tts/o/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/baidu/tts/o/a/c;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/baidu/tts/o/a/c;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/baidu/tts/m/j;

    invoke-direct {v0}, Lcom/baidu/tts/m/j;-><init>()V

    iput-object v0, p0, Lcom/baidu/tts/o/a/c;->b:Lcom/baidu/tts/m/j;

    new-instance v0, Lcom/baidu/tts/o/a/d;

    invoke-direct {v0, p0}, Lcom/baidu/tts/o/a/d;-><init>(Lcom/baidu/tts/o/a/c;)V

    iput-object v0, p0, Lcom/baidu/tts/o/a/c;->g:Lcom/baidu/tts/o/a/d;

    new-instance v0, Lcom/baidu/tts/o/a/b;

    invoke-direct {v0, p0}, Lcom/baidu/tts/o/a/b;-><init>(Lcom/baidu/tts/o/a/c;)V

    iput-object v0, p0, Lcom/baidu/tts/o/a/c;->h:Lcom/baidu/tts/o/a/b;

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->g:Lcom/baidu/tts/o/a/d;

    iput-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    return-void
.end method


# virtual methods
.method a(FF)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->e:Lcom/baidu/tts/a/c/c;

    invoke-virtual {v0, p1, p2}, Lcom/baidu/tts/a/c/c;->a(FF)I

    move-result v0

    return v0
.end method

.method a(I)I
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->e:Lcom/baidu/tts/a/c/c;

    invoke-virtual {v0}, Lcom/baidu/tts/a/c/c;->f()Lcom/baidu/tts/a/c/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/baidu/tts/a/c/a;->a()Lcom/baidu/tts/b/b/a/c;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/baidu/tts/b/b/a/c;->a(I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, -0x1

    goto :goto_0
.end method

.method a(Lcom/baidu/tts/f/g;Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->b:Lcom/baidu/tts/m/j;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->b:Lcom/baidu/tts/m/j;

    invoke-virtual {v0, p1, p2}, Lcom/baidu/tts/m/j;->a(Lcom/baidu/tts/f/g;Ljava/lang/String;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(Lcom/baidu/tts/m/e;)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->e:Lcom/baidu/tts/a/c/c;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/a/c/c;->a(Lcom/baidu/tts/m/e;)I

    move-result v0

    return v0
.end method

.method a(Lcom/baidu/tts/m/f;)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->e:Lcom/baidu/tts/a/c/c;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/a/c/c;->a(Lcom/baidu/tts/m/f;)I

    move-result v0

    return v0
.end method

.method a(Lcom/baidu/tts/m/g;)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->e:Lcom/baidu/tts/a/c/c;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/a/c/c;->a(Lcom/baidu/tts/m/g;)I

    move-result v0

    return v0
.end method

.method public a()Lcom/baidu/tts/o/a/d;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->g:Lcom/baidu/tts/o/a/d;

    return-object v0
.end method

.method a(Landroid/content/Context;)V
    .locals 1

    invoke-static {}, Lcom/baidu/tts/h/b/b;->a()Lcom/baidu/tts/h/b/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/baidu/tts/h/b/b;->a(Landroid/content/Context;)V

    return-void
.end method

.method public a(Lcom/baidu/tts/aop/tts/TtsError;)V
    .locals 1

    invoke-static {p1}, Lcom/baidu/tts/m/h;->b(Lcom/baidu/tts/aop/tts/TtsError;)Lcom/baidu/tts/m/h;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/baidu/tts/o/a/c;->a(Lcom/baidu/tts/m/h;)V

    return-void
.end method

.method a(Lcom/baidu/tts/aop/ttslistener/TtsListener;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->c:Lcom/baidu/tts/aop/ttslistener/TtsListener;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Lcom/baidu/tts/o/a/c;->c:Lcom/baidu/tts/aop/ttslistener/TtsListener;

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->e:Lcom/baidu/tts/a/c/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->e:Lcom/baidu/tts/a/c/c;

    iget-object v1, p0, Lcom/baidu/tts/o/a/c;->c:Lcom/baidu/tts/aop/ttslistener/TtsListener;

    invoke-virtual {v0, v1}, Lcom/baidu/tts/a/c/c;->a(Lcom/baidu/tts/aop/ttslistener/TtsListener;)V

    :cond_0
    return-void
.end method

.method a(Lcom/baidu/tts/f/m;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/o/a/c;->d:Lcom/baidu/tts/f/m;

    return-void
.end method

.method public a(Lcom/baidu/tts/m/h;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->c:Lcom/baidu/tts/aop/ttslistener/TtsListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->c:Lcom/baidu/tts/aop/ttslistener/TtsListener;

    invoke-interface {v0, p1}, Lcom/baidu/tts/aop/ttslistener/TtsListener;->onError(Lcom/baidu/tts/m/h;)V

    :cond_0
    return-void
.end method

.method a(Lcom/baidu/tts/m/i;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->e:Lcom/baidu/tts/a/c/c;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/a/c/c;->a(Lcom/baidu/tts/m/i;)V

    return-void
.end method

.method a(Lcom/baidu/tts/o/a/a;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    return-void
.end method

.method public auth(Lcom/baidu/tts/f/m;)Lcom/baidu/tts/auth/AuthInfo;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/o/a/a;->auth(Lcom/baidu/tts/f/m;)Lcom/baidu/tts/auth/AuthInfo;

    move-result-object v0

    return-object v0
.end method

.method b(Lcom/baidu/tts/m/e;)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->e:Lcom/baidu/tts/a/c/c;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/a/c/c;->b(Lcom/baidu/tts/m/e;)I

    move-result v0

    return v0
.end method

.method public b()Lcom/baidu/tts/aop/tts/TtsError;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0}, Lcom/baidu/tts/o/a/a;->b()Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    return-object v0
.end method

.method b(Lcom/baidu/tts/f/m;)Lcom/baidu/tts/auth/AuthInfo;
    .locals 2

    invoke-static {}, Lcom/baidu/tts/auth/a;->a()Lcom/baidu/tts/auth/a;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/tts/o/a/c;->b:Lcom/baidu/tts/m/j;

    invoke-virtual {v0, p1, v1}, Lcom/baidu/tts/auth/a;->a(Lcom/baidu/tts/f/m;Lcom/baidu/tts/m/j;)Lcom/baidu/tts/auth/AuthInfo;

    move-result-object v0

    return-object v0
.end method

.method b(Lcom/baidu/tts/m/i;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->e:Lcom/baidu/tts/a/c/c;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/a/c/c;->b(Lcom/baidu/tts/m/i;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0}, Lcom/baidu/tts/o/a/a;->c()V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0}, Lcom/baidu/tts/o/a/a;->d()V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0}, Lcom/baidu/tts/o/a/a;->e()V

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0}, Lcom/baidu/tts/o/a/a;->f()V

    return-void
.end method

.method public freeCustomResource(Lcom/baidu/tts/m/e;)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/o/a/a;->freeCustomResource(Lcom/baidu/tts/m/e;)I

    move-result v0

    return v0
.end method

.method public g()Lcom/baidu/tts/o/a/b;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->h:Lcom/baidu/tts/o/a/b;

    return-object v0
.end method

.method public getMode()Lcom/baidu/tts/f/m;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0}, Lcom/baidu/tts/o/a/a;->getMode()Lcom/baidu/tts/f/m;

    move-result-object v0

    return-object v0
.end method

.method public getTtsListener()Lcom/baidu/tts/aop/ttslistener/TtsListener;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0}, Lcom/baidu/tts/o/a/a;->getTtsListener()Lcom/baidu/tts/aop/ttslistener/TtsListener;

    move-result-object v0

    return-object v0
.end method

.method public getTtsParams()Lcom/baidu/tts/m/j;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0}, Lcom/baidu/tts/o/a/a;->getTtsParams()Lcom/baidu/tts/m/j;

    move-result-object v0

    return-object v0
.end method

.method h()Lcom/baidu/tts/aop/tts/TtsError;
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/baidu/tts/o/a/c;->d:Lcom/baidu/tts/f/m;

    if-nez v1, :cond_0

    sget-object v1, Lcom/baidu/tts/f/m;->a:Lcom/baidu/tts/f/m;

    iput-object v1, p0, Lcom/baidu/tts/o/a/c;->d:Lcom/baidu/tts/f/m;

    :cond_0
    iget-object v1, p0, Lcom/baidu/tts/o/a/c;->b:Lcom/baidu/tts/m/j;

    if-nez v1, :cond_1

    new-instance v1, Lcom/baidu/tts/m/j;

    invoke-direct {v1}, Lcom/baidu/tts/m/j;-><init>()V

    iput-object v1, p0, Lcom/baidu/tts/o/a/c;->b:Lcom/baidu/tts/m/j;

    :cond_1
    invoke-static {}, Lcom/baidu/tts/h/b/b;->a()Lcom/baidu/tts/h/b/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/tts/h/b/b;->b()Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v1

    sget-boolean v2, Lcom/baidu/tts/o/a/c;->a:Z

    if-nez v2, :cond_2

    if-eqz v1, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_2
    sget-object v1, Lcom/baidu/tts/o/a/c$1;->a:[I

    iget-object v2, p0, Lcom/baidu/tts/o/a/c;->d:Lcom/baidu/tts/f/m;

    invoke-virtual {v2}, Lcom/baidu/tts/f/m;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_4

    if-eqz v0, :cond_4

    invoke-interface {v1, v0}, Lcom/baidu/tts/b/a/a/d;->a(Ljava/lang/Object;)V

    new-instance v0, Lcom/baidu/tts/b/b/a/f;

    invoke-direct {v0}, Lcom/baidu/tts/b/b/a/f;-><init>()V

    iget-object v2, p0, Lcom/baidu/tts/o/a/c;->b:Lcom/baidu/tts/m/j;

    invoke-virtual {v2}, Lcom/baidu/tts/m/j;->b()Lcom/baidu/tts/m/a;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/baidu/tts/b/b/a/c;->a(Ljava/lang/Object;)V

    new-instance v2, Lcom/baidu/tts/a/c/c;

    invoke-direct {v2}, Lcom/baidu/tts/a/c/c;-><init>()V

    iput-object v2, p0, Lcom/baidu/tts/o/a/c;->e:Lcom/baidu/tts/a/c/c;

    new-instance v2, Lcom/baidu/tts/a/c/b;

    iget-object v3, p0, Lcom/baidu/tts/o/a/c;->b:Lcom/baidu/tts/m/j;

    invoke-direct {v2, v1, v0, v3}, Lcom/baidu/tts/a/c/b;-><init>(Lcom/baidu/tts/b/a/a/d;Lcom/baidu/tts/b/b/a/c;Lcom/baidu/tts/m/j;)V

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->e:Lcom/baidu/tts/a/c/c;

    invoke-virtual {v0, v2}, Lcom/baidu/tts/a/c/c;->a(Lcom/baidu/tts/a/c/a;)V

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->c:Lcom/baidu/tts/aop/ttslistener/TtsListener;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->e:Lcom/baidu/tts/a/c/c;

    iget-object v1, p0, Lcom/baidu/tts/o/a/c;->c:Lcom/baidu/tts/aop/ttslistener/TtsListener;

    invoke-virtual {v0, v1}, Lcom/baidu/tts/a/c/c;->a(Lcom/baidu/tts/aop/ttslistener/TtsListener;)V

    :cond_3
    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->e:Lcom/baidu/tts/a/c/c;

    invoke-virtual {v0}, Lcom/baidu/tts/a/c/c;->a()Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    :goto_1
    return-object v0

    :pswitch_0
    invoke-static {}, Lcom/baidu/tts/b/a/a;->a()Lcom/baidu/tts/b/a/a;

    move-result-object v0

    sget-object v1, Lcom/baidu/tts/f/f;->a:Lcom/baidu/tts/f/f;

    invoke-virtual {v0, v1}, Lcom/baidu/tts/b/a/a;->a(Lcom/baidu/tts/f/f;)Lcom/baidu/tts/b/a/a/d;

    move-result-object v1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->b:Lcom/baidu/tts/m/j;

    invoke-virtual {v0}, Lcom/baidu/tts/m/j;->c()Lcom/baidu/tts/b/a/b/f$b;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    invoke-static {}, Lcom/baidu/tts/b/a/a;->a()Lcom/baidu/tts/b/a/a;

    move-result-object v0

    sget-object v1, Lcom/baidu/tts/f/f;->b:Lcom/baidu/tts/f/f;

    invoke-virtual {v0, v1}, Lcom/baidu/tts/b/a/a;->a(Lcom/baidu/tts/f/f;)Lcom/baidu/tts/b/a/a/d;

    move-result-object v1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->b:Lcom/baidu/tts/m/j;

    invoke-virtual {v0}, Lcom/baidu/tts/m/j;->d()Lcom/baidu/tts/b/a/b/e$b;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    invoke-static {}, Lcom/baidu/tts/b/a/a;->a()Lcom/baidu/tts/b/a/a;

    move-result-object v0

    sget-object v1, Lcom/baidu/tts/f/f;->c:Lcom/baidu/tts/f/f;

    invoke-virtual {v0, v1}, Lcom/baidu/tts/b/a/a;->a(Lcom/baidu/tts/f/f;)Lcom/baidu/tts/b/a/a/d;

    move-result-object v1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->b:Lcom/baidu/tts/m/j;

    invoke-virtual {v0}, Lcom/baidu/tts/m/j;->a()Lcom/baidu/tts/m/b;

    move-result-object v0

    goto :goto_0

    :cond_4
    invoke-static {}, Lcom/baidu/tts/h/a/c;->a()Lcom/baidu/tts/h/a/c;

    move-result-object v0

    sget-object v1, Lcom/baidu/tts/f/n;->S:Lcom/baidu/tts/f/n;

    invoke-virtual {v0, v1}, Lcom/baidu/tts/h/a/c;->b(Lcom/baidu/tts/f/n;)Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method i()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->e:Lcom/baidu/tts/a/c/c;

    invoke-virtual {v0}, Lcom/baidu/tts/a/c/c;->b()V

    return-void
.end method

.method j()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->e:Lcom/baidu/tts/a/c/c;

    invoke-virtual {v0}, Lcom/baidu/tts/a/c/c;->c()V

    return-void
.end method

.method k()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->e:Lcom/baidu/tts/a/c/c;

    invoke-virtual {v0}, Lcom/baidu/tts/a/c/c;->d()V

    return-void
.end method

.method l()V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->e:Lcom/baidu/tts/a/c/c;

    invoke-virtual {v0}, Lcom/baidu/tts/a/c/c;->e()V

    invoke-static {}, Lcom/baidu/tts/auth/a;->a()Lcom/baidu/tts/auth/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/tts/auth/a;->b()V

    invoke-static {}, Lcom/baidu/tts/h/b/b;->a()Lcom/baidu/tts/h/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/tts/h/b/b;->f()V

    new-instance v0, Lcom/baidu/tts/m/j;

    invoke-direct {v0}, Lcom/baidu/tts/m/j;-><init>()V

    iput-object v0, p0, Lcom/baidu/tts/o/a/c;->b:Lcom/baidu/tts/m/j;

    return-void
.end method

.method public loadCustomResource(Lcom/baidu/tts/m/e;)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/o/a/a;->loadCustomResource(Lcom/baidu/tts/m/e;)I

    move-result v0

    return v0
.end method

.method public loadEnglishModel(Lcom/baidu/tts/m/f;)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/o/a/a;->loadEnglishModel(Lcom/baidu/tts/m/f;)I

    move-result v0

    return v0
.end method

.method public loadModel(Lcom/baidu/tts/m/g;)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/o/a/a;->loadModel(Lcom/baidu/tts/m/g;)I

    move-result v0

    return v0
.end method

.method m()Lcom/baidu/tts/aop/ttslistener/TtsListener;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->c:Lcom/baidu/tts/aop/ttslistener/TtsListener;

    return-object v0
.end method

.method n()Lcom/baidu/tts/f/m;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->d:Lcom/baidu/tts/f/m;

    return-object v0
.end method

.method o()Lcom/baidu/tts/m/j;
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->b:Lcom/baidu/tts/m/j;

    return-object v0
.end method

.method public p()I
    .locals 2

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->c:Lcom/baidu/tts/aop/ttslistener/TtsListener;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    sget-object v1, Lcom/baidu/tts/f/n;->S:Lcom/baidu/tts/f/n;

    invoke-virtual {v1}, Lcom/baidu/tts/f/n;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-static {}, Lcom/baidu/tts/h/a/c;->a()Lcom/baidu/tts/h/a/c;

    move-result-object v0

    sget-object v1, Lcom/baidu/tts/f/n;->S:Lcom/baidu/tts/f/n;

    invoke-virtual {v0, v1}, Lcom/baidu/tts/h/a/c;->b(Lcom/baidu/tts/f/n;)Lcom/baidu/tts/aop/tts/TtsError;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/baidu/tts/o/a/c;->a(Lcom/baidu/tts/aop/tts/TtsError;)V

    const/4 v0, -0x1

    return v0
.end method

.method public q()Z
    .locals 2

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->h:Lcom/baidu/tts/o/a/b;

    iget-object v1, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setAudioStreamType(I)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/o/a/a;->setAudioStreamType(I)I

    move-result v0

    return v0
.end method

.method public setContext(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/o/a/a;->setContext(Landroid/content/Context;)V

    return-void
.end method

.method public setMode(Lcom/baidu/tts/f/m;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/o/a/a;->setMode(Lcom/baidu/tts/f/m;)V

    return-void
.end method

.method public setParam(Lcom/baidu/tts/f/g;Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0, p1, p2}, Lcom/baidu/tts/o/a/a;->setParam(Lcom/baidu/tts/f/g;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public setStereoVolume(FF)I
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0, p1, p2}, Lcom/baidu/tts/o/a/a;->setStereoVolume(FF)I

    move-result v0

    return v0
.end method

.method public setTtsListener(Lcom/baidu/tts/aop/ttslistener/TtsListener;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/o/a/a;->setTtsListener(Lcom/baidu/tts/aop/ttslistener/TtsListener;)V

    return-void
.end method

.method public speak(Lcom/baidu/tts/m/i;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/o/a/a;->speak(Lcom/baidu/tts/m/i;)V

    return-void
.end method

.method public synthesize(Lcom/baidu/tts/m/i;)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/tts/o/a/c;->f:Lcom/baidu/tts/o/a/a;

    invoke-virtual {v0, p1}, Lcom/baidu/tts/o/a/a;->synthesize(Lcom/baidu/tts/m/i;)V

    return-void
.end method
