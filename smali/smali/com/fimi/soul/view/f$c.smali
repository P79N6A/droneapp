.class public Lcom/fimi/soul/view/f$c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/view/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:Lcom/fimi/soul/view/f;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Landroid/content/DialogInterface$OnClickListener;

.field private f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/view/f$c;->f:Z

    iput-object p1, p0, Lcom/fimi/soul/view/f$c;->b:Landroid/content/Context;

    new-instance v0, Lcom/fimi/soul/view/f;

    iget-object v1, p0, Lcom/fimi/soul/view/f$c;->b:Landroid/content/Context;

    const v2, 0x7f0b0050

    invoke-direct {v0, v1, v2}, Lcom/fimi/soul/view/f;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/fimi/soul/view/f$c;->a:Lcom/fimi/soul/view/f;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/view/f$c;)Lcom/fimi/soul/view/f;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/view/f$c;->a:Lcom/fimi/soul/view/f;

    return-object v0
.end method

.method static synthetic b(Lcom/fimi/soul/view/f$c;)Landroid/content/DialogInterface$OnClickListener;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/view/f$c;->e:Landroid/content/DialogInterface$OnClickListener;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$c;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/view/f$c;->e:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/fimi/soul/view/f$c;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/view/f$c;->c:Ljava/lang/String;

    return-object p0
.end method

.method public a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$c;
    .locals 0

    iput-object p2, p0, Lcom/fimi/soul/view/f$c;->e:Landroid/content/DialogInterface$OnClickListener;

    iput-object p1, p0, Lcom/fimi/soul/view/f$c;->d:Ljava/lang/String;

    return-object p0
.end method

.method public a(Z)Lcom/fimi/soul/view/f$c;
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/view/f$c;->f:Z

    return-object p0
.end method

.method public a()Lcom/fimi/soul/view/f;
    .locals 6

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/fimi/soul/view/f$c;->b:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    const v1, 0x7f040081

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    const v0, 0x7f0f020e

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0f0210

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iget-object v3, p0, Lcom/fimi/soul/view/f$c;->d:Ljava/lang/String;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/fimi/soul/view/f$c;->d:Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v3, p0, Lcom/fimi/soul/view/f$c;->c:Ljava/lang/String;

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/fimi/soul/view/f$c;->c:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    iget-object v3, p0, Lcom/fimi/soul/view/f$c;->e:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v3, :cond_2

    new-instance v3, Lcom/fimi/soul/view/f$c$1;

    invoke-direct {v3, p0}, Lcom/fimi/soul/view/f$c$1;-><init>(Lcom/fimi/soul/view/f$c;)V

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    iget-object v3, p0, Lcom/fimi/soul/view/f$c;->b:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [Landroid/view/View;

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    invoke-static {v3, v4}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/view/f$c;->a:Lcom/fimi/soul/view/f;

    iget-boolean v1, p0, Lcom/fimi/soul/view/f$c;->f:Z

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f;->setCanceledOnTouchOutside(Z)V

    iget-object v0, p0, Lcom/fimi/soul/view/f$c;->a:Lcom/fimi/soul/view/f;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/f;->setContentView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/view/f$c;->a:Lcom/fimi/soul/view/f;

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    iget-object v0, p0, Lcom/fimi/soul/view/f$c;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/kernel/utils/p;->b(Landroid/content/Context;)F

    move-result v0

    iget-object v3, p0, Lcom/fimi/soul/view/f$c;->b:Landroid/content/Context;

    invoke-static {v3}, Lcom/fimi/kernel/utils/p;->a(Landroid/content/Context;)I

    move-result v3

    int-to-float v3, v3

    cmpl-float v0, v0, v3

    if-lez v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/view/f$c;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/kernel/utils/p;->b(Landroid/content/Context;)F

    move-result v0

    :goto_0
    const/high16 v3, 0x44810000    # 1032.0f

    mul-float/2addr v0, v3

    const/high16 v3, 0x44f00000    # 1920.0f

    div-float/2addr v0, v3

    float-to-int v0, v0

    iput v0, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    invoke-virtual {v1, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    iget-object v0, p0, Lcom/fimi/soul/view/f$c;->a:Lcom/fimi/soul/view/f;

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/view/f$c;->a:Lcom/fimi/soul/view/f;

    return-object v0

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/view/f$c;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/kernel/utils/p;->a(Landroid/content/Context;)I

    move-result v0

    int-to-float v0, v0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)Lcom/fimi/soul/view/f$c;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/view/f$c;->d:Ljava/lang/String;

    return-object p0
.end method

.method public b()Lcom/fimi/soul/view/f;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/view/f$c;->a:Lcom/fimi/soul/view/f;

    return-object v0
.end method