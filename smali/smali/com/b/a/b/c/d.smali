.class public Lcom/b/a/b/c/d;
.super Lcom/b/a/b/c/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/b/a/b/c/d$a;
    }
.end annotation


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/b/a/b/c/c;-><init>(II)V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;Lcom/b/a/b/e/a;Lcom/b/a/b/a/f;)V
    .locals 3

    instance-of v0, p2, Lcom/b/a/b/e/b;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ImageAware should wrap ImageView. ImageViewAware is expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/b/a/b/c/d$a;

    iget v1, p0, Lcom/b/a/b/c/d;->a:I

    iget v2, p0, Lcom/b/a/b/c/d;->b:I

    invoke-direct {v0, p1, v1, v2}, Lcom/b/a/b/c/d$a;-><init>(Landroid/graphics/Bitmap;II)V

    invoke-interface {p2, v0}, Lcom/b/a/b/e/a;->a(Landroid/graphics/drawable/Drawable;)Z

    return-void
.end method
