.class Lcom/a/c/c$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/a/a/a$a;
.implements Lcom/a/a/q$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/c/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/a/c/c;


# direct methods
.method private constructor <init>(Lcom/a/c/c;)V
    .locals 0

    iput-object p1, p0, Lcom/a/c/c$a;->a:Lcom/a/c/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/a/c/c;Lcom/a/c/c$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/a/c/c$a;-><init>(Lcom/a/c/c;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/a/a/a;)V
    .locals 1

    iget-object v0, p0, Lcom/a/c/c$a;->a:Lcom/a/c/c;

    invoke-static {v0}, Lcom/a/c/c;->b(Lcom/a/c/c;)Lcom/a/a/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/c/c$a;->a:Lcom/a/c/c;

    invoke-static {v0}, Lcom/a/c/c;->b(Lcom/a/c/c;)Lcom/a/a/a$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/a/a/a$a;->a(Lcom/a/a/a;)V

    :cond_0
    return-void
.end method

.method public b(Lcom/a/a/a;)V
    .locals 2

    iget-object v0, p0, Lcom/a/c/c$a;->a:Lcom/a/c/c;

    invoke-static {v0}, Lcom/a/c/c;->b(Lcom/a/c/c;)Lcom/a/a/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/c/c$a;->a:Lcom/a/c/c;

    invoke-static {v0}, Lcom/a/c/c;->b(Lcom/a/c/c;)Lcom/a/a/a$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/a/a/a$a;->b(Lcom/a/a/a;)V

    :cond_0
    iget-object v0, p0, Lcom/a/c/c$a;->a:Lcom/a/c/c;

    invoke-static {v0}, Lcom/a/c/c;->c(Lcom/a/c/c;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/a/c/c$a;->a:Lcom/a/c/c;

    invoke-static {v0}, Lcom/a/c/c;->c(Lcom/a/c/c;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/a/c/c$a;->a:Lcom/a/c/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/a/c/c;->a(Lcom/a/c/c;Lcom/a/a/a$a;)Lcom/a/a/a$a;

    :cond_1
    return-void
.end method

.method public c(Lcom/a/a/a;)V
    .locals 1

    iget-object v0, p0, Lcom/a/c/c$a;->a:Lcom/a/c/c;

    invoke-static {v0}, Lcom/a/c/c;->b(Lcom/a/c/c;)Lcom/a/a/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/c/c$a;->a:Lcom/a/c/c;

    invoke-static {v0}, Lcom/a/c/c;->b(Lcom/a/c/c;)Lcom/a/a/a$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/a/a/a$a;->c(Lcom/a/a/a;)V

    :cond_0
    return-void
.end method

.method public d(Lcom/a/a/a;)V
    .locals 1

    iget-object v0, p0, Lcom/a/c/c$a;->a:Lcom/a/c/c;

    invoke-static {v0}, Lcom/a/c/c;->b(Lcom/a/c/c;)Lcom/a/a/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/c/c$a;->a:Lcom/a/c/c;

    invoke-static {v0}, Lcom/a/c/c;->b(Lcom/a/c/c;)Lcom/a/a/a$a;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/a/a/a$a;->d(Lcom/a/a/a;)V

    :cond_0
    return-void
.end method

.method public onAnimationUpdate(Lcom/a/a/q;)V
    .locals 7

    invoke-virtual {p1}, Lcom/a/a/q;->A()F

    move-result v2

    iget-object v0, p0, Lcom/a/c/c$a;->a:Lcom/a/c/c;

    invoke-static {v0}, Lcom/a/c/c;->c(Lcom/a/c/c;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/c/c$c;

    iget v1, v0, Lcom/a/c/c$c;->a:I

    and-int/lit16 v1, v1, 0x1ff

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/a/c/c$a;->a:Lcom/a/c/c;

    invoke-static {v1}, Lcom/a/c/c;->d(Lcom/a/c/c;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    :cond_0
    iget-object v3, v0, Lcom/a/c/c$c;->b:Ljava/util/ArrayList;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/c/c$b;

    iget v5, v0, Lcom/a/c/c$b;->b:F

    iget v6, v0, Lcom/a/c/c$b;->c:F

    mul-float/2addr v6, v2

    add-float/2addr v5, v6

    iget-object v6, p0, Lcom/a/c/c$a;->a:Lcom/a/c/c;

    iget v0, v0, Lcom/a/c/c$b;->a:I

    invoke-static {v6, v0, v5}, Lcom/a/c/c;->a(Lcom/a/c/c;IF)V

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/a/c/c$a;->a:Lcom/a/c/c;

    invoke-static {v0}, Lcom/a/c/c;->d(Lcom/a/c/c;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_2
    return-void
.end method
