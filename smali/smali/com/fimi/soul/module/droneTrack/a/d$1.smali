.class Lcom/fimi/soul/module/droneTrack/a/d$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/module/droneTrack/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/droneTrack/a/d;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/droneTrack/a/d;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    invoke-static {v0}, Lcom/fimi/soul/module/droneTrack/a/d;->a(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/e;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    invoke-static {v0}, Lcom/fimi/soul/module/droneTrack/a/d;->b(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/e;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    invoke-static {v0}, Lcom/fimi/soul/module/droneTrack/a/d;->c(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/e;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    invoke-static {v0}, Lcom/fimi/soul/module/droneTrack/a/d;->d(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/e;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/fimi/soul/module/droneTrack/a/b;->a()Lcom/fimi/soul/module/droneTrack/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneTrack/a/b;->b()Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    invoke-static {v1}, Lcom/fimi/soul/module/droneTrack/a/d;->a(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/a/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/module/droneTrack/a/e;->b()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->size()I

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    invoke-static {v1}, Lcom/fimi/soul/module/droneTrack/a/d;->b(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/a/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/module/droneTrack/a/e;->b()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->size()I

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    invoke-static {v1}, Lcom/fimi/soul/module/droneTrack/a/d;->c(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/a/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/module/droneTrack/a/e;->b()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->size()I

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    invoke-static {v1}, Lcom/fimi/soul/module/droneTrack/a/d;->d(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/a/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/module/droneTrack/a/e;->b()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->size()I

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    invoke-static {v1}, Lcom/fimi/soul/module/droneTrack/a/d;->a(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/a/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/module/droneTrack/a/e;->b()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    invoke-static {v2}, Lcom/fimi/soul/module/droneTrack/a/d;->b(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/a/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/module/droneTrack/a/e;->b()Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/fimi/soul/module/droneTrack/a/d;->a(Lcom/fimi/soul/module/droneTrack/a/d;Ljava/util/HashMap;Ljava/util/HashMap;)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    invoke-static {v2}, Lcom/fimi/soul/module/droneTrack/a/d;->c(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/a/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/module/droneTrack/a/e;->b()Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/fimi/soul/module/droneTrack/a/d;->a(Lcom/fimi/soul/module/droneTrack/a/d;Ljava/util/HashMap;Ljava/util/HashMap;)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    invoke-static {v2}, Lcom/fimi/soul/module/droneTrack/a/d;->d(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/a/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/module/droneTrack/a/e;->b()Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/fimi/soul/module/droneTrack/a/d;->a(Lcom/fimi/soul/module/droneTrack/a/d;Ljava/util/HashMap;Ljava/util/HashMap;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v0, Lcom/fimi/soul/module/droneTrack/a/d$1$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/droneTrack/a/d$1$1;-><init>(Lcom/fimi/soul/module/droneTrack/a/d$1;)V

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    invoke-static {v0}, Lcom/fimi/soul/module/droneTrack/a/d;->e(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    invoke-static {v0}, Lcom/fimi/soul/module/droneTrack/a/d;->e(Lcom/fimi/soul/module/droneTrack/a/d;)Lcom/fimi/soul/module/droneTrack/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/module/droneTrack/e;->a()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/d$1;->a:Lcom/fimi/soul/module/droneTrack/a/d;

    invoke-static {v0}, Lcom/fimi/soul/module/droneTrack/a/d;->f(Lcom/fimi/soul/module/droneTrack/a/d;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method
