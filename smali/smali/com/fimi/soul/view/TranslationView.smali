.class public Lcom/fimi/soul/view/TranslationView;
.super Landroid/view/View;


# static fields
.field private static final q:F = 0.25f


# instance fields
.field private a:Landroid/graphics/Camera;

.field private b:Landroid/graphics/Matrix;

.field private c:F

.field private d:F

.field private e:F

.field private f:I

.field private g:Landroid/graphics/Paint;

.field private h:Landroid/graphics/Paint;

.field private i:Landroid/graphics/Paint;

.field private j:Landroid/graphics/Bitmap;

.field private k:I

.field private l:Landroid/animation/AnimatorSet;

.field private m:Landroid/graphics/Bitmap;

.field private n:Landroid/graphics/Bitmap;

.field private o:F

.field private p:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/fimi/soul/view/TranslationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 9

    const/4 v8, 0x0

    const/4 v6, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v1}, Lcom/fimi/soul/view/TranslationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Landroid/graphics/Camera;

    invoke-direct {v0}, Landroid/graphics/Camera;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/view/TranslationView;->a:Landroid/graphics/Camera;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/view/TranslationView;->b:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    invoke-static {p1}, Lcom/fimi/kernel/utils/p;->b(Landroid/content/Context;)F

    move-result v0

    invoke-static {p1}, Lcom/fimi/kernel/utils/p;->a(Landroid/content/Context;)I

    move-result v2

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_0

    invoke-static {p1}, Lcom/fimi/kernel/utils/p;->b(Landroid/content/Context;)F

    move-result v0

    move v2, v0

    :goto_0
    invoke-virtual {p0}, Lcom/fimi/soul/view/TranslationView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f02044d

    invoke-static {v0, v3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fimi/soul/view/TranslationView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f02044c

    invoke-static {v3, v4}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v7

    const/high16 v3, 0x447b0000    # 1004.0f

    mul-float/2addr v2, v3

    const/high16 v3, 0x44870000    # 1080.0f

    div-float/2addr v2, v3

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v5, v2, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    move v2, v1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/view/TranslationView;->m:Landroid/graphics/Bitmap;

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    move-object v0, v7

    move v2, v1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/view/TranslationView;->n:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lcom/fimi/soul/view/TranslationView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f02013f

    invoke-static {v0, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/view/TranslationView;->j:Landroid/graphics/Bitmap;

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->a:Landroid/graphics/Camera;

    invoke-virtual {v0}, Landroid/graphics/Camera;->save()V

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->a:Landroid/graphics/Camera;

    const/high16 v2, 0x43fa0000    # 500.0f

    invoke-virtual {v0, v8, v8, v2}, Landroid/graphics/Camera;->translate(FFF)V

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->a:Landroid/graphics/Camera;

    iget-object v2, p0, Lcom/fimi/soul/view/TranslationView;->b:Landroid/graphics/Matrix;

    invoke-virtual {v0, v2}, Landroid/graphics/Camera;->getMatrix(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->a:Landroid/graphics/Camera;

    invoke-virtual {v0}, Landroid/graphics/Camera;->restore()V

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->m:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/fimi/soul/view/TranslationView;->m:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    iget-object v2, p0, Lcom/fimi/soul/view/TranslationView;->m:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    iget-object v5, p0, Lcom/fimi/soul/view/TranslationView;->b:Landroid/graphics/Matrix;

    move v2, v1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Lcom/fimi/soul/view/TranslationView;->o:F

    iget-object v1, p0, Lcom/fimi/soul/view/TranslationView;->m:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float v0, v1, v0

    iput v0, p0, Lcom/fimi/soul/view/TranslationView;->p:F

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/view/TranslationView;->g:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/view/TranslationView;->i:Landroid/graphics/Paint;

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->i:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/view/TranslationView;->h:Landroid/graphics/Paint;

    return-void

    :cond_0
    invoke-static {p1}, Lcom/fimi/kernel/utils/p;->a(Landroid/content/Context;)I

    move-result v0

    int-to-float v0, v0

    move v2, v0

    goto/16 :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/fimi/soul/view/TranslationView;->e:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/fimi/soul/view/TranslationView;->f:I

    const/16 v0, 0x1f4

    iput v0, p0, Lcom/fimi/soul/view/TranslationView;->k:I

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/view/TranslationView;F)F
    .locals 0

    iput p1, p0, Lcom/fimi/soul/view/TranslationView;->c:F

    return p1
.end method

.method static synthetic a(Lcom/fimi/soul/view/TranslationView;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/view/TranslationView;->f:I

    return v0
.end method

.method static synthetic a(Lcom/fimi/soul/view/TranslationView;I)I
    .locals 0

    iput p1, p0, Lcom/fimi/soul/view/TranslationView;->f:I

    return p1
.end method

.method static synthetic b(Lcom/fimi/soul/view/TranslationView;F)F
    .locals 0

    iput p1, p0, Lcom/fimi/soul/view/TranslationView;->d:F

    return p1
.end method

.method static synthetic b(Lcom/fimi/soul/view/TranslationView;)Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->i:Landroid/graphics/Paint;

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/view/TranslationView;F)F
    .locals 0

    iput p1, p0, Lcom/fimi/soul/view/TranslationView;->e:F

    return p1
.end method

.method static synthetic c(Lcom/fimi/soul/view/TranslationView;)Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->g:Landroid/graphics/Paint;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4

    const/4 v3, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/fimi/soul/view/TranslationView;->getMeasuredHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    const/high16 v1, 0x3e800000    # 0.25f

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/fimi/soul/view/TranslationView;->c:F

    iput v2, p0, Lcom/fimi/soul/view/TranslationView;->d:F

    iput v2, p0, Lcom/fimi/soul/view/TranslationView;->e:F

    iput v3, p0, Lcom/fimi/soul/view/TranslationView;->f:I

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->i:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->g:Landroid/graphics/Paint;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p0}, Lcom/fimi/soul/view/TranslationView;->invalidate()V

    return-void
.end method

.method public a(I)V
    .locals 8

    const/4 v6, 0x1

    const/4 v5, 0x0

    const/4 v4, 0x2

    iput p1, p0, Lcom/fimi/soul/view/TranslationView;->k:I

    new-array v0, v4, [F

    invoke-virtual {p0}, Lcom/fimi/soul/view/TranslationView;->getMeasuredHeight()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    const/high16 v2, 0x3e800000    # 0.25f

    mul-float/2addr v1, v2

    aput v1, v0, v5

    invoke-virtual {p0}, Lcom/fimi/soul/view/TranslationView;->getMeasuredWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    iget v2, p0, Lcom/fimi/soul/view/TranslationView;->o:F

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v1, v2

    iget v2, p0, Lcom/fimi/soul/view/TranslationView;->p:F

    mul-float/2addr v1, v2

    aput v1, v0, v6

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    new-instance v1, Lcom/fimi/soul/view/TranslationView$1;

    invoke-direct {v1, p0}, Lcom/fimi/soul/view/TranslationView$1;-><init>(Lcom/fimi/soul/view/TranslationView;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v1, v4, [F

    const/4 v2, 0x0

    aput v2, v1, v5

    invoke-virtual {p0}, Lcom/fimi/soul/view/TranslationView;->getHeight()I

    move-result v2

    neg-int v2, v2

    int-to-float v2, v2

    const v3, 0x3e7a43fe    # 0.2444f

    mul-float/2addr v2, v3

    aput v2, v1, v6

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/view/TranslationView$2;

    invoke-direct {v2, p0}, Lcom/fimi/soul/view/TranslationView$2;-><init>(Lcom/fimi/soul/view/TranslationView;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v2, v4, [F

    fill-array-data v2, :array_0

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    new-instance v3, Lcom/fimi/soul/view/TranslationView$3;

    invoke-direct {v3, p0}, Lcom/fimi/soul/view/TranslationView$3;-><init>(Lcom/fimi/soul/view/TranslationView;)V

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-array v3, v4, [I

    fill-array-data v3, :array_1

    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v3

    new-instance v4, Lcom/fimi/soul/view/TranslationView$4;

    invoke-direct {v4, p0}, Lcom/fimi/soul/view/TranslationView$4;-><init>(Lcom/fimi/soul/view/TranslationView;)V

    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v4, Landroid/animation/AnimatorSet;

    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v4, p0, Lcom/fimi/soul/view/TranslationView;->l:Landroid/animation/AnimatorSet;

    iget-object v4, p0, Lcom/fimi/soul/view/TranslationView;->l:Landroid/animation/AnimatorSet;

    iget v5, p0, Lcom/fimi/soul/view/TranslationView;->k:I

    int-to-long v6, v5

    invoke-virtual {v4, v6, v7}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    iget-object v4, p0, Lcom/fimi/soul/view/TranslationView;->l:Landroid/animation/AnimatorSet;

    invoke-virtual {v4, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->l:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x43fa0000    # 500.0f
    .end array-data

    :array_1
    .array-data 4
        0x0
        0xff
    .end array-data
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->l:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isStarted()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->l:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    invoke-virtual {p0}, Lcom/fimi/soul/view/TranslationView;->a()V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->n:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->n:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    iput-object v1, p0, Lcom/fimi/soul/view/TranslationView;->n:Landroid/graphics/Bitmap;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->m:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->m:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    iput-object v1, p0, Lcom/fimi/soul/view/TranslationView;->m:Landroid/graphics/Bitmap;

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->j:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->j:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_2

    iput-object v1, p0, Lcom/fimi/soul/view/TranslationView;->j:Landroid/graphics/Bitmap;

    :cond_2
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    const/4 v4, 0x0

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->a:Landroid/graphics/Camera;

    invoke-virtual {v0}, Landroid/graphics/Camera;->save()V

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->a:Landroid/graphics/Camera;

    iget v1, p0, Lcom/fimi/soul/view/TranslationView;->c:F

    iget v2, p0, Lcom/fimi/soul/view/TranslationView;->d:F

    iget v3, p0, Lcom/fimi/soul/view/TranslationView;->e:F

    invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Camera;->translate(FFF)V

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->a:Landroid/graphics/Camera;

    iget-object v1, p0, Lcom/fimi/soul/view/TranslationView;->b:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Camera;->getMatrix(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->a:Landroid/graphics/Camera;

    invoke-virtual {v0}, Landroid/graphics/Camera;->restore()V

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->h:Landroid/graphics/Paint;

    iget v1, p0, Lcom/fimi/soul/view/TranslationView;->f:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p0}, Lcom/fimi/soul/view/TranslationView;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/fimi/soul/view/TranslationView;->getHeight()I

    move-result v2

    invoke-direct {v0, v4, v4, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    iget-object v1, p0, Lcom/fimi/soul/view/TranslationView;->j:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/fimi/soul/view/TranslationView;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->m:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/fimi/soul/view/TranslationView;->b:Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/fimi/soul/view/TranslationView;->g:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lcom/fimi/soul/view/TranslationView;->n:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/fimi/soul/view/TranslationView;->b:Landroid/graphics/Matrix;

    iget-object v2, p0, Lcom/fimi/soul/view/TranslationView;->i:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    const/4 v2, 0x0

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-virtual {p0}, Lcom/fimi/soul/view/TranslationView;->getMeasuredHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    const/high16 v1, 0x3e800000    # 0.25f

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/fimi/soul/view/TranslationView;->c:F

    iput v2, p0, Lcom/fimi/soul/view/TranslationView;->d:F

    iput v2, p0, Lcom/fimi/soul/view/TranslationView;->e:F

    return-void
.end method

.method public setDuration(I)V
    .locals 0

    iput p1, p0, Lcom/fimi/soul/view/TranslationView;->k:I

    return-void
.end method
