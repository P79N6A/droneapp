.class public Lcom/fimi/soul/utils/ar;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/utils/ar$a;,
        Lcom/fimi/soul/utils/ar$b;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:I

.field private c:I

.field private d:I

.field private e:Landroid/graphics/drawable/Drawable;

.field private f:Landroid/view/View;

.field private g:Landroid/graphics/drawable/Drawable;

.field private h:Landroid/graphics/drawable/Drawable;

.field private i:Lcom/android/volley/o;

.field private j:Lcom/android/volley/toolbox/k;

.field private k:Lcom/fimi/soul/utils/ar$b;

.field private l:Lcom/fimi/soul/utils/ar$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/utils/ar;->a:Landroid/content/Context;

    iput-object v0, p0, Lcom/fimi/soul/utils/ar;->j:Lcom/android/volley/toolbox/k;

    iput-object v0, p0, Lcom/fimi/soul/utils/ar;->k:Lcom/fimi/soul/utils/ar$b;

    iput-object v0, p0, Lcom/fimi/soul/utils/ar;->l:Lcom/fimi/soul/utils/ar$a;

    iput-object p1, p0, Lcom/fimi/soul/utils/ar;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/android/volley/toolbox/t;->a(Landroid/content/Context;)Lcom/android/volley/o;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/utils/ar;->i:Lcom/android/volley/o;

    new-instance v0, Lcom/android/volley/toolbox/k;

    iget-object v1, p0, Lcom/fimi/soul/utils/ar;->i:Lcom/android/volley/o;

    invoke-static {}, Lcom/fimi/soul/utils/aq;->a()Lcom/fimi/soul/utils/aq;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/android/volley/toolbox/k;-><init>(Lcom/android/volley/o;Lcom/android/volley/toolbox/k$b;)V

    iput-object v0, p0, Lcom/fimi/soul/utils/ar;->j:Lcom/android/volley/toolbox/k;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/utils/ar;)Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->g:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lcom/fimi/soul/utils/ar;
    .locals 1

    new-instance v0, Lcom/fimi/soul/utils/ar;

    invoke-direct {v0, p0}, Lcom/fimi/soul/utils/ar;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method static synthetic b(Lcom/fimi/soul/utils/ar;)Lcom/fimi/soul/utils/ar$a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->l:Lcom/fimi/soul/utils/ar$a;

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/utils/ar;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->f:Landroid/view/View;

    return-object v0
.end method

.method static synthetic d(Lcom/fimi/soul/utils/ar;)Lcom/fimi/soul/utils/ar$b;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->k:Lcom/fimi/soul/utils/ar$b;

    return-object v0
.end method

.method static synthetic e(Lcom/fimi/soul/utils/ar;)Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->h:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/utils/ar;->b:I

    return v0
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/utils/ar;->e:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/utils/ar;->f:Landroid/view/View;

    return-void
.end method

.method public a(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 4

    const/4 v2, 0x4

    const/4 v1, 0x0

    invoke-static {p2}, Lcom/fimi/kernel/utils/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->h:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->f:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->f:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->h:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->l:Lcom/fimi/soul/utils/ar$a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->l:Lcom/fimi/soul/utils/ar$a;

    invoke-interface {v0}, Lcom/fimi/soul/utils/ar$a;->a()V

    :cond_2
    :goto_0
    return-void

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->f:Landroid/view/View;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->f:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_4
    :goto_1
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->j:Lcom/android/volley/toolbox/k;

    new-instance v1, Lcom/fimi/soul/utils/ar$1;

    invoke-direct {v1, p0, p1}, Lcom/fimi/soul/utils/ar$1;-><init>(Lcom/fimi/soul/utils/ar;Landroid/widget/ImageView;)V

    iget v2, p0, Lcom/fimi/soul/utils/ar;->b:I

    iget v3, p0, Lcom/fimi/soul/utils/ar;->c:I

    invoke-virtual {v0, p2, v1, v2, v3}, Lcom/android/volley/toolbox/k;->a(Ljava/lang/String;Lcom/android/volley/toolbox/k$d;II)Lcom/android/volley/toolbox/k$c;

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->e:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->e:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1
.end method

.method public a(Lcom/fimi/soul/utils/ar$a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/utils/ar;->l:Lcom/fimi/soul/utils/ar$a;

    return-void
.end method

.method public a(Lcom/fimi/soul/utils/ar$b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/utils/ar;->k:Lcom/fimi/soul/utils/ar$b;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    invoke-static {p1}, Lcom/fimi/kernel/utils/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->j:Lcom/android/volley/toolbox/k;

    new-instance v1, Lcom/fimi/soul/utils/ar$2;

    invoke-direct {v1, p0}, Lcom/fimi/soul/utils/ar$2;-><init>(Lcom/fimi/soul/utils/ar;)V

    iget v2, p0, Lcom/fimi/soul/utils/ar;->b:I

    iget v3, p0, Lcom/fimi/soul/utils/ar;->c:I

    invoke-virtual {v0, p1, v1, v2, v3}, Lcom/android/volley/toolbox/k;->a(Ljava/lang/String;Lcom/android/volley/toolbox/k$d;II)Lcom/android/volley/toolbox/k$c;

    goto :goto_0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/utils/ar;->c:I

    return v0
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/utils/ar;->g:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/utils/ar;->d:I

    return v0
.end method

.method public c(I)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/utils/ar;->h:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public d()Lcom/fimi/soul/utils/ar$b;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->k:Lcom/fimi/soul/utils/ar$b;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/utils/ar;->b:I

    return-void
.end method

.method public e()Lcom/fimi/soul/utils/ar$a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/utils/ar;->l:Lcom/fimi/soul/utils/ar$a;

    return-object v0
.end method

.method public e(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/utils/ar;->c:I

    return-void
.end method

.method public f(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/utils/ar;->d:I

    return-void
.end method
