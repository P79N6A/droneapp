.class public Lcom/fimi/soul/module/droneui/IMUActivity;
.super Lcom/fimi/soul/base/BaseActivity;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/fimi/soul/drone/d$b;


# static fields
.field private static E:I

.field private static F:I

.field private static G:I

.field static a:Lcom/fimi/soul/drone/g/f;


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Landroid/widget/TextView;

.field private C:Landroid/widget/TextView;

.field private D:Landroid/widget/TextView;

.field private H:Lcom/fimi/soul/module/b/d;

.field private I:Lcom/fimi/soul/drone/g/f;

.field private J:Z

.field private K:I

.field private L:Landroid/os/Handler;

.field private b:Landroid/widget/Button;

.field private c:Landroid/widget/Button;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

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
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    sput v0, Lcom/fimi/soul/module/droneui/IMUActivity;->E:I

    const/4 v0, 0x3

    sput v0, Lcom/fimi/soul/module/droneui/IMUActivity;->F:I

    const/4 v0, 0x1

    sput v0, Lcom/fimi/soul/module/droneui/IMUActivity;->G:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/fimi/soul/base/BaseActivity;-><init>()V

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->J:Z

    iput v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->K:I

    new-instance v0, Lcom/fimi/soul/module/droneui/IMUActivity$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/droneui/IMUActivity$1;-><init>(Lcom/fimi/soul/module/droneui/IMUActivity;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->L:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneui/IMUActivity;I)I
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->K:I

    return p1
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneui/IMUActivity;)Lcom/fimi/soul/module/b/d;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->H:Lcom/fimi/soul/module/b/d;

    return-object v0
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneui/IMUActivity;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->K:I

    return v0
.end method

.method static synthetic c(Lcom/fimi/soul/module/droneui/IMUActivity;)Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->u:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic d(Lcom/fimi/soul/module/droneui/IMUActivity;)Lcom/fimi/soul/drone/g/f;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->I:Lcom/fimi/soul/drone/g/f;

    return-object v0
.end method

.method static synthetic e()I
    .locals 1

    sget v0, Lcom/fimi/soul/module/droneui/IMUActivity;->E:I

    return v0
.end method

.method static synthetic e(Lcom/fimi/soul/module/droneui/IMUActivity;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->L:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic f()I
    .locals 1

    sget v0, Lcom/fimi/soul/module/droneui/IMUActivity;->F:I

    return v0
.end method

.method static synthetic g()I
    .locals 1

    sget v0, Lcom/fimi/soul/module/droneui/IMUActivity;->G:I

    return v0
.end method

.method private h()V
    .locals 4

    const v2, 0x7f0e0164

    const v0, 0x7f0f0192

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->b:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->b:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f00d1

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->d:Landroid/widget/TextView;

    const v0, 0x7f0f013c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->e:Landroid/widget/TextView;

    const v0, 0x7f0f013d

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->f:Landroid/widget/TextView;

    const v0, 0x7f0f013e

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->g:Landroid/widget/TextView;

    const v0, 0x7f0f013f

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->h:Landroid/widget/TextView;

    const v0, 0x7f0f0141

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->i:Landroid/widget/TextView;

    const v0, 0x7f0f0142

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->j:Landroid/widget/TextView;

    const v0, 0x7f0f0143

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->k:Landroid/widget/TextView;

    const v0, 0x7f0f0144

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->l:Landroid/widget/TextView;

    const v0, 0x7f0f0146

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->m:Landroid/widget/TextView;

    const v0, 0x7f0f0147

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->n:Landroid/widget/TextView;

    const v0, 0x7f0f0148

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->o:Landroid/widget/TextView;

    const v0, 0x7f0f0149

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->p:Landroid/widget/TextView;

    const v0, 0x7f0f014b

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->q:Landroid/widget/TextView;

    const v0, 0x7f0f014c

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->r:Landroid/widget/TextView;

    const v0, 0x7f0f014d

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->s:Landroid/widget/TextView;

    const v0, 0x7f0f014e

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->t:Landroid/widget/TextView;

    const v0, 0x7f0f0151

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->u:Landroid/widget/TextView;

    const v0, 0x7f0f0150

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->c:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->c:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f014f

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->v:Landroid/widget/TextView;

    const v0, 0x7f0f0137

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->w:Landroid/widget/TextView;

    const v0, 0x7f0f0138

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->x:Landroid/widget/TextView;

    const v0, 0x7f0f0139

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->y:Landroid/widget/TextView;

    const v0, 0x7f0f013a

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->w:Landroid/widget/TextView;

    const v0, 0x7f0f013b

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->A:Landroid/widget/TextView;

    const v0, 0x7f0f0140

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->B:Landroid/widget/TextView;

    const v0, 0x7f0f0145

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->C:Landroid/widget/TextView;

    const v0, 0x7f0f014a

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->D:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->u:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0a0131

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/fimi/soul/module/droneui/IMUActivity;->a(Landroid/widget/TextView;ILjava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->u:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0a03e8

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/fimi/soul/module/droneui/IMUActivity;->a(Landroid/widget/TextView;ILjava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->c:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e0165

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/fimi/soul/module/droneui/IMUActivity;->a(Landroid/widget/Button;IZ)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->u:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0a0217

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/fimi/soul/module/droneui/IMUActivity;->a(Landroid/widget/TextView;ILjava/lang/String;)V

    goto :goto_0
.end method

.method private i()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/b/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/b/d;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->H:Lcom/fimi/soul/module/b/d;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->H:Lcom/fimi/soul/module/b/d;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/b/d;->a(B)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->H:Lcom/fimi/soul/module/b/d;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/b/d;->a(B)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->a()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    const/4 v6, 0x0

    const v3, 0x7f0e0164

    const/4 v5, 0x1

    const v4, 0x7f0a02d5

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->u:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0a03e8

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/fimi/soul/module/droneui/IMUActivity;->a(Landroid/widget/TextView;ILjava/lang/String;)V

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->c:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e0165

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p0, v0, v1, v6}, Lcom/fimi/soul/module/droneui/IMUActivity;->a(Landroid/widget/Button;IZ)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->e:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->i:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->j:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->k:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->l:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->m:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->n:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->p:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->q:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->r:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->s:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->t:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    return-void

    :cond_2
    iget v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->K:I

    if-eq v0, v5, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->u:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0a0131

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/fimi/soul/module/droneui/IMUActivity;->a(Landroid/widget/TextView;ILjava/lang/String;)V

    iput-boolean v5, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->J:Z

    goto/16 :goto_0

    :cond_3
    iget-boolean v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->J:Z

    if-eqz v0, :cond_5

    iget v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->K:I

    if-eq v0, v5, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->u:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0a0217

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/fimi/soul/module/droneui/IMUActivity;->a(Landroid/widget/TextView;ILjava/lang/String;)V

    iput-boolean v6, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->J:Z

    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->e:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/h/aa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/aa;->a()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/h/aa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/aa;->b()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->g:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/h/aa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/aa;->c()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->h:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/h/aa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/aa;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->i:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/h/aa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/aa;->e()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->j:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/h/aa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/aa;->f()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->k:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/h/aa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/aa;->g()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->l:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->x()Lcom/fimi/soul/drone/h/aa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/aa;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->m:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->z()Lcom/fimi/soul/drone/h/k;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/k;->a()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->n:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->z()Lcom/fimi/soul/drone/h/k;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/k;->b()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->o:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->z()Lcom/fimi/soul/drone/h/k;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/k;->c()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->p:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->z()Lcom/fimi/soul/drone/h/k;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/k;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->q:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->z()Lcom/fimi/soul/drone/h/k;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/k;->e()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->r:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->z()Lcom/fimi/soul/drone/h/k;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/k;->f()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->s:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->z()Lcom/fimi/soul/drone/h/k;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/k;->g()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->t:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->z()Lcom/fimi/soul/drone/h/k;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/k;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_5
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->u:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0a0156

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->c:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p0, v0, v1, v5}, Lcom/fimi/soul/module/droneui/IMUActivity;->a(Landroid/widget/Button;IZ)V

    goto/16 :goto_2
.end method

.method public a(Landroid/widget/Button;IZ)V
    .locals 0

    invoke-virtual {p1, p3}, Landroid/widget/Button;->setEnabled(Z)V

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setTextColor(I)V

    return-void
.end method

.method public a(Landroid/widget/TextView;ILjava/lang/String;)V
    .locals 0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public b()V
    .locals 4

    const v3, 0x7f0e0164

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->y()Lcom/fimi/soul/drone/h/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ab;->b()B

    move-result v0

    if-ne v2, v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/b/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/b/d;

    move-result-object v0

    const/16 v1, 0x99

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/b/d;->c(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->I:Lcom/fimi/soul/drone/g/f;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/g/f;->f()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->y()Lcom/fimi/soul/drone/h/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ab;->a()I

    move-result v0

    if-nez v0, :cond_1

    iput v2, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->K:I

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->c:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p0, v0, v1, v2}, Lcom/fimi/soul/module/droneui/IMUActivity;->a(Landroid/widget/Button;IZ)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->u:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e0013

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0a0229

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/fimi/soul/module/droneui/IMUActivity;->a(Landroid/widget/TextView;ILjava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iput v2, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->K:I

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->c:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p0, v0, v1, v2}, Lcom/fimi/soul/module/droneui/IMUActivity;->a(Landroid/widget/Button;IZ)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->u:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e0016

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0a0226

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/fimi/soul/module/droneui/IMUActivity;->a(Landroid/widget/TextView;ILjava/lang/String;)V

    goto :goto_0
.end method

.method public c()V
    .locals 3

    sget-object v0, Lcom/fimi/soul/module/droneui/IMUActivity;->a:Lcom/fimi/soul/drone/g/f;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/fimi/soul/module/droneui/IMUActivity;->a:Lcom/fimi/soul/drone/g/f;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/g/f;->c()V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/fimi/soul/drone/g/f;

    const/16 v1, 0x1388

    new-instance v2, Lcom/fimi/soul/module/droneui/IMUActivity$3;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneui/IMUActivity$3;-><init>(Lcom/fimi/soul/module/droneui/IMUActivity;)V

    invoke-direct {v0, v1, v2}, Lcom/fimi/soul/drone/g/f;-><init>(ILjava/lang/Runnable;)V

    sput-object v0, Lcom/fimi/soul/module/droneui/IMUActivity;->a:Lcom/fimi/soul/drone/g/f;

    sget-object v0, Lcom/fimi/soul/module/droneui/IMUActivity;->a:Lcom/fimi/soul/drone/g/f;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/g/f;->d()V

    goto :goto_0
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->I:Lcom/fimi/soul/drone/g/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->I:Lcom/fimi/soul/drone/g/f;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/g/f;->c()V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/fimi/soul/drone/g/f;

    const/16 v1, 0x3e8

    new-instance v2, Lcom/fimi/soul/module/droneui/IMUActivity$4;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneui/IMUActivity$4;-><init>(Lcom/fimi/soul/module/droneui/IMUActivity;)V

    invoke-direct {v0, v1, v2}, Lcom/fimi/soul/drone/g/f;-><init>(ILjava/lang/Runnable;)V

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->I:Lcom/fimi/soul/drone/g/f;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->I:Lcom/fimi/soul/drone/g/f;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/g/f;->d()V

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 5

    const v2, 0x7f0e0165

    const/4 v4, 0x0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0f0192

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->finish()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const v1, 0x7f0f0150

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->c:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p0, v0, v1, v4}, Lcom/fimi/soul/module/droneui/IMUActivity;->a(Landroid/widget/Button;IZ)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->u:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0a0156

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/fimi/soul/module/droneui/IMUActivity;->a(Landroid/widget/TextView;ILjava/lang/String;)V

    iput v4, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->K:I

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->d()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->L:Landroid/os/Handler;

    new-instance v1, Lcom/fimi/soul/module/droneui/IMUActivity$2;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneui/IMUActivity$2;-><init>(Lcom/fimi/soul/module/droneui/IMUActivity;)V

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    const/16 v1, 0x80

    invoke-super {p0, p1}, Lcom/fimi/soul/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    const v0, 0x7f04002b

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneui/IMUActivity;->setContentView(I)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->h()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/16 v1, 0x1d

    new-array v1, v1, [Landroid/view/View;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->b:Landroid/widget/Button;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->c:Landroid/widget/Button;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->d:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->e:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->f:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->g:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->h:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->i:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->j:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->k:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0xa

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->l:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0xb

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->m:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0xc

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->n:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0xd

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->o:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0xe

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->p:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0xf

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->q:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x10

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->r:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x11

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->s:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x12

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->t:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x13

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->u:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x14

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->v:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x15

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->w:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x16

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->x:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x17

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->y:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x18

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->z:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x19

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->A:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x1a

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->B:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x1b

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->C:Landroid/widget/TextView;

    aput-object v3, v1, v2

    const/16 v2, 0x1c

    iget-object v3, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->D:Landroid/widget/TextView;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->i()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->c()V

    return-void
.end method

.method protected onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/fimi/soul/base/BaseActivity;->onDestroy()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->drone:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->b(Lcom/fimi/soul/drone/d$b;)V

    sget-object v0, Lcom/fimi/soul/module/droneui/IMUActivity;->a:Lcom/fimi/soul/drone/g/f;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/g/f;->f()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->I:Lcom/fimi/soul/drone/g/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->I:Lcom/fimi/soul/drone/g/f;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/g/f;->f()V

    :cond_0
    return-void
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 2

    sget-object v0, Lcom/fimi/soul/module/droneui/IMUActivity$5;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->L:Landroid/os/Handler;

    sget v1, Lcom/fimi/soul/module/droneui/IMUActivity;->F:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->L:Landroid/os/Handler;

    sget v1, Lcom/fimi/soul/module/droneui/IMUActivity;->F:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/IMUActivity;->b()V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneui/IMUActivity;->L:Landroid/os/Handler;

    sget v1, Lcom/fimi/soul/module/droneui/IMUActivity;->F:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
