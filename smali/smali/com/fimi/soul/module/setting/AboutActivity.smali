.class public Lcom/fimi/soul/module/setting/AboutActivity;
.super Lcom/fimi/soul/base/BaseActivity;

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final F:I = 0x1

.field private static final G:I = 0x0

.field private static final H:I = 0x1


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Landroid/widget/TextView;

.field private C:Landroid/widget/TextView;

.field private D:Landroid/widget/TextView;

.field private E:Lcom/fimi/soul/biz/camera/d;

.field private I:I

.field a:Lcom/fimi/soul/module/update/a/g;

.field private b:Landroid/widget/Button;

.field private c:Landroid/widget/Button;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/TextView;

.field private h:Lcom/fimi/soul/module/update/a/b;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/widget/TextView;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/TextView;

.field private z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/fimi/soul/base/BaseActivity;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->I:I

    return-void
.end method

.method private a(I)Ljava/lang/String;
    .locals 1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a()V
    .locals 2

    const v0, 0x7f0f00d0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->b:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->b:Landroid/widget/Button;

    new-instance v1, Lcom/fimi/soul/module/setting/AboutActivity$1;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/setting/AboutActivity$1;-><init>(Lcom/fimi/soul/module/setting/AboutActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private b()V
    .locals 6

    const/4 v2, 0x1

    const/16 v5, 0x8

    const v0, 0x7f0f00ec

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->g:Landroid/widget/TextView;

    const v0, 0x7f0f00d4

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->d:Landroid/widget/TextView;

    const v0, 0x7f0f00ed

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->e:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/text/TextPaint;->setFlags(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->d:Landroid/widget/TextView;

    const v1, 0x7f0a00a2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p0}, Lcom/fimi/soul/utils/ao;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-virtual {p0, v1, v2}, Lcom/fimi/soul/module/setting/AboutActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0f00eb

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->c:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->c:Landroid/widget/Button;

    new-instance v1, Lcom/fimi/soul/module/setting/AboutActivity$2;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/setting/AboutActivity$2;-><init>(Lcom/fimi/soul/module/setting/AboutActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f00d3

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->f:Landroid/widget/ImageView;

    const v0, 0x7f0f00e0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->m:Landroid/widget/TextView;

    const v0, 0x7f0f00d6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->i:Landroid/widget/TextView;

    const v0, 0x7f0f00da

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->k:Landroid/widget/TextView;

    const v0, 0x7f0f00d8

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->j:Landroid/widget/TextView;

    const v0, 0x7f0f00dc

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->l:Landroid/widget/TextView;

    const v0, 0x7f0f00e2

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->n:Landroid/widget/TextView;

    const v0, 0x7f0f00e4

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->o:Landroid/widget/TextView;

    const v0, 0x7f0f00e6

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->p:Landroid/widget/TextView;

    const v0, 0x7f0f00d5

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->t:Landroid/widget/TextView;

    const v0, 0x7f0f00d7

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->u:Landroid/widget/TextView;

    const v0, 0x7f0f00d9

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->v:Landroid/widget/TextView;

    const v0, 0x7f0f00db

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->w:Landroid/widget/TextView;

    const v0, 0x7f0f00df

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->x:Landroid/widget/TextView;

    const v0, 0x7f0f00e1

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->y:Landroid/widget/TextView;

    const v0, 0x7f0f00e3

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->z:Landroid/widget/TextView;

    const v0, 0x7f0f00e5

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->A:Landroid/widget/TextView;

    const v0, 0x7f0f00de

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->q:Landroid/widget/TextView;

    const v0, 0x7f0f00ea

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->r:Landroid/widget/TextView;

    const v0, 0x7f0f00e9

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->B:Landroid/widget/TextView;

    const v0, 0x7f0f00dd

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->C:Landroid/widget/TextView;

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/d;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->B:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->r:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    const v0, 0x7f0f00e7

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->D:Landroid/widget/TextView;

    const v0, 0x7f0f00e8

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->s:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->s:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->D:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    new-instance v0, Lcom/fimi/soul/module/update/a/g;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/AboutActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-direct {v0, p0, v1}, Lcom/fimi/soul/module/update/a/g;-><init>(Landroid/content/Context;Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->a:Lcom/fimi/soul/module/update/a/g;

    return-void
.end method

.method private c()V
    .locals 5

    const v4, 0x7f0a02d1

    const/4 v3, 0x1

    invoke-static {}, Lcom/fimi/kernel/c;->c()Lcom/fimi/kernel/c/a;

    move-result-object v0

    const-string v1, "sp_firmware_cache"

    const-class v2, Lcom/fimi/soul/module/update/a/b;

    invoke-interface {v0, v1, v2}, Lcom/fimi/kernel/c/a;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/update/a/b;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/b;->b()I

    move-result v0

    if-lez v0, :cond_c

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v1}, Lcom/fimi/soul/module/update/a/b;->b()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/setting/AboutActivity;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/b;->a()I

    move-result v0

    if-lez v0, :cond_d

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v1}, Lcom/fimi/soul/module/update/a/b;->a()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/setting/AboutActivity;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/b;->c()I

    move-result v0

    if-lez v0, :cond_e

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->n:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v1}, Lcom/fimi/soul/module/update/a/b;->c()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/setting/AboutActivity;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/b;->h()I

    move-result v0

    if-lez v0, :cond_f

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->o:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v1}, Lcom/fimi/soul/module/update/a/b;->h()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/setting/AboutActivity;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    :goto_3
    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/b;->f()I

    move-result v0

    if-lez v0, :cond_10

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->k:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v1}, Lcom/fimi/soul/module/update/a/b;->f()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/setting/AboutActivity;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    :goto_4
    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/b;->g()I

    move-result v0

    if-lez v0, :cond_11

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v1}, Lcom/fimi/soul/module/update/a/b;->g()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/setting/AboutActivity;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    :goto_5
    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    if-eqz v0, :cond_12

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/b;->e()I

    move-result v0

    if-lez v0, :cond_12

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->q:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v1}, Lcom/fimi/soul/module/update/a/b;->e()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/setting/AboutActivity;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    :goto_6
    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    if-eqz v0, :cond_13

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/b;->n()I

    move-result v0

    if-lez v0, :cond_13

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->m:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v2}, Lcom/fimi/soul/module/update/a/b;->n()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_7
    :goto_7
    invoke-static {}, Lcom/fimi/soul/biz/e/c;->a()Lcom/fimi/soul/biz/e/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/c;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_14

    invoke-static {}, Lcom/fimi/soul/biz/e/c;->a()Lcom/fimi/soul/biz/e/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/c;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_14

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->r:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/fimi/soul/biz/e/c;->a()Lcom/fimi/soul/biz/e/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/biz/e/c;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_8
    :goto_8
    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    if-eqz v0, :cond_15

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/b;->l()I

    move-result v0

    if-lez v0, :cond_15

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->j:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v1}, Lcom/fimi/soul/module/update/a/b;->l()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/setting/AboutActivity;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_9
    :goto_9
    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    if-eqz v0, :cond_16

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/b;->o()I

    move-result v0

    if-lez v0, :cond_16

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->s:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/AboutActivity;->h:Lcom/fimi/soul/module/update/a/b;

    invoke-virtual {v1}, Lcom/fimi/soul/module/update/a/b;->o()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/fimi/soul/module/setting/AboutActivity;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_a
    :goto_a
    iget v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->I:I

    if-eq v0, v3, :cond_b

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/AboutActivity;->d()V

    :cond_b
    return-void

    :cond_c
    iget v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->I:I

    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    :cond_d
    iget v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->I:I

    if-ne v0, v3, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_1

    :cond_e
    iget v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->I:I

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_2

    :cond_f
    iget v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->I:I

    if-ne v0, v3, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_3

    :cond_10
    iget v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->I:I

    if-ne v0, v3, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_4

    :cond_11
    iget v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->I:I

    if-ne v0, v3, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_5

    :cond_12
    iget v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->I:I

    if-ne v0, v3, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_6

    :cond_13
    iget v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->I:I

    if-ne v0, v3, :cond_7

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_7

    :cond_14
    iget v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->I:I

    if-ne v0, v3, :cond_8

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->r:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_8

    :cond_15
    iget v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->I:I

    if-ne v0, v3, :cond_9

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->j:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_9

    :cond_16
    iget v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->I:I

    if-ne v0, v3, :cond_a

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->s:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    goto :goto_a
.end method

.method private d()V
    .locals 5

    const/4 v4, 0x1

    iput v4, p0, Lcom/fimi/soul/module/setting/AboutActivity;->I:I

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/fimi/soul/module/setting/AboutActivity$3;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/setting/AboutActivity$3;-><init>(Lcom/fimi/soul/module/setting/AboutActivity;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/AboutActivity;->getHandler()Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, 0x898

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/fimi/soul/module/setting/ShowTextActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "URL_ONLINE"

    const-string v2, "https://fimiservice-us.mi-ae.com/statement.html"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "URL_TITLE"

    const v2, 0x7f0a00ad

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "URL_LOCAL"

    const-string v2, "file:///android_asset/statement.html"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x7f0f00ed
        :pswitch_0
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Lcom/fimi/soul/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f04001d

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/AboutActivity;->setContentView(I)V

    invoke-static {}, Lcom/fimi/soul/biz/camera/b;->a()Lcom/fimi/soul/biz/camera/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/b;->d()Lcom/fimi/soul/biz/camera/b/a;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/biz/camera/d;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->E:Lcom/fimi/soul/biz/camera/d;

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/AboutActivity;->a()V

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/AboutActivity;->b()V

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/AboutActivity;->c()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/AboutActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/16 v1, 0x18

    new-array v1, v1, [Landroid/view/View;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->d:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->e:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->b:Landroid/widget/Button;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->g:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->i:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->j:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->k:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->l:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->m:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->n:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0xa

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->o:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0xb

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->p:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0xc

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->t:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0xd

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->u:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0xe

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->v:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0xf

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->w:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x10

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->x:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x11

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->y:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x12

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->z:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x13

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->A:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x14

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->q:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x15

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->r:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x16

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->B:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x17

    iget-object v3, p0, Lcom/fimi/soul/module/setting/AboutActivity;->C:Landroid/widget/TextView;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onDestroy()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->a:Lcom/fimi/soul/module/update/a/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/AboutActivity;->a:Lcom/fimi/soul/module/update/a/g;

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/g;->c()V

    :cond_0
    return-void
.end method

.method public onHandleMessage(Landroid/os/Message;)V
    .locals 2

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/AboutActivity;->c()V

    :cond_0
    return-void
.end method
