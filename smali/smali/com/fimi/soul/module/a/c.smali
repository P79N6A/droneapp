.class public Lcom/fimi/soul/module/a/c;
.super Lcom/mob/tools/FakeActivity;


# instance fields
.field private a:Lcom/fimi/soul/module/a/e;


# direct methods
.method public constructor <init>(Lcom/fimi/soul/module/a/e;)V
    .locals 0

    invoke-direct {p0}, Lcom/mob/tools/FakeActivity;-><init>()V

    iput-object p1, p0, Lcom/fimi/soul/module/a/c;->a:Lcom/fimi/soul/module/a/e;

    return-void
.end method


# virtual methods
.method protected final a(Lcn/sharesdk/framework/Platform;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/a/c;->a:Lcom/fimi/soul/module/a/e;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/module/a/e;->b(Lcn/sharesdk/framework/Platform;)V

    return-void
.end method

.method protected final a()Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/a/c;->a:Lcom/fimi/soul/module/a/e;

    iget-boolean v0, v0, Lcom/fimi/soul/module/a/e;->a:Z

    return v0
.end method

.method protected final b(Lcn/sharesdk/framework/Platform;)Lcn/sharesdk/framework/Platform$ShareParams;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/a/c;->a:Lcom/fimi/soul/module/a/e;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/module/a/e;->c(Lcn/sharesdk/framework/Platform;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/a/c;->a:Lcom/fimi/soul/module/a/e;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/module/a/e;->d(Lcn/sharesdk/framework/Platform;)Lcn/sharesdk/framework/Platform$ShareParams;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected final b()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/fimi/soul/module/a/c;->a:Lcom/fimi/soul/module/a/e;

    iget-object v0, v0, Lcom/fimi/soul/module/a/e;->b:Ljava/util/HashMap;

    return-object v0
.end method

.method protected final c()Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/a/c;->a:Lcom/fimi/soul/module/a/e;

    iget-boolean v0, v0, Lcom/fimi/soul/module/a/e;->c:Z

    return v0
.end method

.method protected final c(Lcn/sharesdk/framework/Platform;)Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/a/c;->a:Lcom/fimi/soul/module/a/e;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/module/a/e;->a(Lcn/sharesdk/framework/Platform;)Z

    move-result v0

    return v0
.end method

.method protected final d()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/fimi/soul/module/a/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/fimi/soul/module/a/c;->a:Lcom/fimi/soul/module/a/e;

    iget-object v0, v0, Lcom/fimi/soul/module/a/e;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method protected final e()Ljava/util/HashMap;
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

    iget-object v0, p0, Lcom/fimi/soul/module/a/c;->a:Lcom/fimi/soul/module/a/e;

    iget-object v0, v0, Lcom/fimi/soul/module/a/e;->e:Ljava/util/HashMap;

    return-object v0
.end method

.method protected final f()Lcn/sharesdk/framework/PlatformActionListener;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/a/c;->a:Lcom/fimi/soul/module/a/e;

    iget-object v0, v0, Lcom/fimi/soul/module/a/e;->f:Lcn/sharesdk/framework/PlatformActionListener;

    return-object v0
.end method

.method protected final g()Lcom/fimi/soul/module/a/f;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/a/c;->a:Lcom/fimi/soul/module/a/e;

    iget-object v0, v0, Lcom/fimi/soul/module/a/e;->g:Lcom/fimi/soul/module/a/f;

    return-object v0
.end method

.method protected final h()Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/a/c;->a:Lcom/fimi/soul/module/a/e;

    iget-boolean v0, v0, Lcom/fimi/soul/module/a/e;->h:Z

    return v0
.end method
