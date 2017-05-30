.class Lcom/a/c/d$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/a/c/d;->a(Lcom/a/a/a$a;)Lcom/a/c/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/a/a/a$a;

.field final synthetic b:Lcom/a/c/d;


# direct methods
.method constructor <init>(Lcom/a/c/d;Lcom/a/a/a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/a/c/d$1;->b:Lcom/a/c/d;

    iput-object p2, p0, Lcom/a/c/d$1;->a:Lcom/a/a/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Lcom/a/c/d$1;->a:Lcom/a/a/a$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/a/a/a$a;->c(Lcom/a/a/a;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Lcom/a/c/d$1;->a:Lcom/a/a/a$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/a/a/a$a;->b(Lcom/a/a/a;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Lcom/a/c/d$1;->a:Lcom/a/a/a$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/a/a/a$a;->d(Lcom/a/a/a;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Lcom/a/c/d$1;->a:Lcom/a/a/a$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/a/a/a$a;->a(Lcom/a/a/a;)V

    return-void
.end method
