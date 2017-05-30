.class public Lcom/fimi/soul/module/droneFragment/a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

.field private b:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

.field private c:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

.field private d:Lcom/fimi/soul/drone/a;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Lcom/fimi/soul/view/MyEditView;

.field private h:Lcom/fimi/soul/view/MyEditView;

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private o:Ljava/lang/String;

.field private p:Landroid/widget/Button;


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/a;Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/a;->i:I

    const/16 v0, 0x8

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/a;->j:I

    const/16 v0, 0x78

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/a;->k:I

    const/4 v0, 0x5

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/a;->l:I

    const-string v0, "m"

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->m:Ljava/lang/String;

    const-string v0, "m/s"

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->n:Ljava/lang/String;

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/a;->d:Lcom/fimi/soul/drone/a;

    invoke-direct {p0, p2}, Lcom/fimi/soul/module/droneFragment/a;->a(Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/a;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/a;->l:I

    return v0
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/a;->o:Ljava/lang/String;

    return-object p1
.end method

.method private a(Landroid/view/View;)V
    .locals 5

    const/4 v4, 0x2

    const v0, 0x7f0f00cd

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->p:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->p:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f02a0

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->a:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v0, 0x7f0f00c7

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->b:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->b:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget v1, p0, Lcom/fimi/soul/module/droneFragment/a;->k:I

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->b:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/a$1;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/a$1;-><init>(Lcom/fimi/soul/module/droneFragment/a;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setOnSeekBarChangeListener(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar$a;)V

    const v0, 0x7f0f00ca

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->c:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->c:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget v1, p0, Lcom/fimi/soul/module/droneFragment/a;->j:I

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->c:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/a$2;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/a$2;-><init>(Lcom/fimi/soul/module/droneFragment/a;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setOnSeekBarChangeListener(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar$a;)V

    const v0, 0x7f0f00c6

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->e:Landroid/widget/TextView;

    const v0, 0x7f0f00c9

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->f:Landroid/widget/TextView;

    const v0, 0x7f0f00c8

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/MyEditView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->g:Lcom/fimi/soul/view/MyEditView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->g:Lcom/fimi/soul/view/MyEditView;

    invoke-virtual {v0, v4}, Lcom/fimi/soul/view/MyEditView;->setInputType(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->g:Lcom/fimi/soul/view/MyEditView;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/a$3;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/a$3;-><init>(Lcom/fimi/soul/module/droneFragment/a;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/MyEditView;->setOnFinishComposingListener(Lcom/fimi/soul/view/MyEditView$b;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->g:Lcom/fimi/soul/view/MyEditView;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/a$4;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/a$4;-><init>(Lcom/fimi/soul/module/droneFragment/a;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/MyEditView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    const v0, 0x7f0f00cb

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/MyEditView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->h:Lcom/fimi/soul/view/MyEditView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->h:Lcom/fimi/soul/view/MyEditView;

    invoke-virtual {v0, v4}, Lcom/fimi/soul/view/MyEditView;->setInputType(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->h:Lcom/fimi/soul/view/MyEditView;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/a$5;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/a$5;-><init>(Lcom/fimi/soul/module/droneFragment/a;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/MyEditView;->setOnFinishComposingListener(Lcom/fimi/soul/view/MyEditView$b;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->h:Lcom/fimi/soul/view/MyEditView;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/a$6;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/a$6;-><init>(Lcom/fimi/soul/module/droneFragment/a;)V

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/MyEditView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->d:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/4 v1, 0x5

    new-array v1, v1, [Landroid/view/View;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/a;->e:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/a;->f:Landroid/widget/TextView;

    aput-object v3, v1, v2

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/a;->p:Landroid/widget/Button;

    aput-object v2, v1, v4

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/a;->g:Lcom/fimi/soul/view/MyEditView;

    aput-object v3, v1, v2

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/a;->h:Lcom/fimi/soul/view/MyEditView;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/a;Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/fimi/soul/module/droneFragment/a;->a(Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V
    .locals 2

    :try_start_0
    invoke-virtual {p1}, Lcom/fimi/soul/view/MyEditView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-le v0, p2, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    invoke-virtual {p4, p2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    invoke-virtual {v0, p5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->j()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/a;->b:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    if-ne p4, v1, :cond_3

    invoke-virtual {v0, p2}, Lcom/fimi/soul/entity/FlyActionBean;->setHeight(I)V

    invoke-virtual {p0, p2}, Lcom/fimi/soul/module/droneFragment/a;->b(I)V

    :cond_1
    :goto_1
    return-void

    :cond_2
    if-ge v0, p3, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    move p2, p3

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/a;->c:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    if-ne p4, v1, :cond_1

    invoke-virtual {v0, p2}, Lcom/fimi/soul/entity/FlyActionBean;->setSpeek(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->o:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->o:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    const-string v0, " "

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->o:Ljava/lang/String;

    goto :goto_1

    :cond_4
    move p2, v0

    move-object v0, v1

    goto :goto_0
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneFragment/a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->m:Ljava/lang/String;

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "[^0-9]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/module/droneFragment/a;)Lcom/fimi/soul/view/MyEditView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->g:Lcom/fimi/soul/view/MyEditView;

    return-object v0
.end method

.method static synthetic d(Lcom/fimi/soul/module/droneFragment/a;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/a;->i:I

    return v0
.end method

.method static synthetic e(Lcom/fimi/soul/module/droneFragment/a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->n:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic f(Lcom/fimi/soul/module/droneFragment/a;)Lcom/fimi/soul/view/MyEditView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->h:Lcom/fimi/soul/view/MyEditView;

    return-object v0
.end method

.method static synthetic g(Lcom/fimi/soul/module/droneFragment/a;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/a;->k:I

    return v0
.end method

.method static synthetic h(Lcom/fimi/soul/module/droneFragment/a;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->b:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    return-object v0
.end method

.method static synthetic i(Lcom/fimi/soul/module/droneFragment/a;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/a;->j:I

    return v0
.end method

.method static synthetic j(Lcom/fimi/soul/module/droneFragment/a;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->c:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->a:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->a:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->b:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->a:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->a:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 5

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->j()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/fimi/soul/biz/c/d;->a(I)V

    invoke-virtual {v2, p1}, Lcom/fimi/soul/entity/FlyActionBean;->setHeight(I)V

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fimi/soul/entity/FlyActionBean;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/a;->d:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getDrawableRes()I

    move-result v3

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()I

    move-result v2

    const/4 v4, 0x1

    invoke-static {v1, v3, v2, v4}, Lcom/fimi/soul/biz/c/j;->a(Landroid/content/Context;IIZ)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    :cond_1
    return-void
.end method

.method public c(I)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->p:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(I)V

    return-void
.end method

.method public d(I)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->c:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/a;->d:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->by:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x7f0f00cd
        :pswitch_0
    .end packed-switch
.end method
