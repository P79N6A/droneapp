.class public Lcom/fimi/soul/module/a/a/a/b/b;
.super Lcom/fimi/soul/module/a/a/a/e;


# static fields
.field private static final a:I = 0x2d0

.field private static final b:I = 0x60


# direct methods
.method public constructor <init>(Lcom/fimi/soul/module/a/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/a/a/a/e;-><init>(Lcom/fimi/soul/module/a/e;)V

    return-void
.end method


# virtual methods
.method protected i()F
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/a/a/a/b/b;->activity:Landroid/app/Activity;

    invoke-static {v0}, Lcom/mob/tools/utils/R;->getScreenWidth(Landroid/content/Context;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x44340000    # 720.0f

    div-float/2addr v0, v1

    return v0
.end method

.method protected j()I
    .locals 1

    const/16 v0, 0x60

    return v0
.end method
