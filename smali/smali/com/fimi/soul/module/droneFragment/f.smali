.class public Lcom/fimi/soul/module/droneFragment/f;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/droneFragment/f$a;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:Lcom/fimi/soul/drone/a;

.field private E:I

.field private F:Lcom/google/android/gms/maps/model/c;

.field private G:Lcom/fimi/soul/biz/c/d;

.field private H:Lcom/google/android/gms/maps/model/g;

.field private I:Lcom/google/android/gms/maps/model/g;

.field private J:Lcom/google/android/gms/maps/c;

.field private K:Lcom/google/android/gms/maps/model/i;

.field private L:I

.field private M:I

.field private N:I

.field private O:I

.field private P:I

.field private Q:I

.field private R:I

.field private S:I

.field private T:I

.field private U:Ljava/lang/String;

.field private V:[Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

.field private W:F

.field private X:F

.field a:[Landroid/widget/EditText;

.field b:Landroid/view/inputmethod/InputMethodManager;

.field private c:Lcom/fimi/soul/view/MyEditView;

.field private d:Lcom/fimi/soul/view/MyEditView;

.field private e:Lcom/fimi/soul/view/MyEditView;

.field private f:Lcom/fimi/soul/view/MyEditView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

.field private m:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

.field private n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

.field private o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

.field private p:Landroid/widget/RadioGroup;

.field private q:Landroid/content/Context;

.field private r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

.field private s:Landroid/widget/RadioButton;

.field private t:Landroid/widget/RadioButton;

.field private u:Landroid/widget/Button;

.field private v:Landroid/widget/Button;

.field private w:Landroid/widget/Button;

.field private x:Landroid/widget/PopupWindow;

.field private y:[Ljava/lang/String;

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/fimi/soul/drone/a;)V
    .locals 9

    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->M:I

    const/16 v0, 0x78

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->N:I

    const/16 v0, 0xa

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->O:I

    iput v5, p0, Lcom/fimi/soul/module/droneFragment/f;->P:I

    const/16 v0, 0x1c2

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->Q:I

    const/4 v0, 0x5

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->R:I

    const/16 v0, 0x168

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->S:I

    iput v1, p0, Lcom/fimi/soul/module/droneFragment/f;->T:I

    iget-object v0, p2, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const-string v2, "input_method"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->b:Landroid/view/inputmethod/InputMethodManager;

    iget-object v0, p2, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    div-int/lit8 v0, v0, 0x3

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->L:I

    iput-object p2, p0, Lcom/fimi/soul/module/droneFragment/f;->D:Lcom/fimi/soul/drone/a;

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aa()Lcom/google/android/gms/maps/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->J:Lcom/google/android/gms/maps/c;

    iget-object v0, p2, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->G:Lcom/fimi/soul/biz/c/d;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0d0007

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->y:[Ljava/lang/String;

    const v0, 0x7f0f00c6

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->i:Landroid/widget/TextView;

    const v0, 0x7f0f00c9

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->j:Landroid/widget/TextView;

    const v0, 0x7f0f02a7

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->k:Landroid/widget/TextView;

    const v0, 0x7f0f02ac

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/MyEditView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->f:Lcom/fimi/soul/view/MyEditView;

    const v0, 0x7f0f02aa

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->h:Landroid/widget/TextView;

    const v0, 0x7f0f02ab

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget v2, p0, Lcom/fimi/soul/module/droneFragment/f;->S:I

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$1;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$1;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setOnSeekBarChangeListener(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar$a;)V

    const v0, 0x7f0f02b5

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->w:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->w:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f02b3

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->g:Landroid/widget/TextView;

    const v0, 0x7f0f02b4

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->v:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f02ae

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/Button;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->y:[Ljava/lang/String;

    aget-object v2, v2, v1

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f02b0

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->p:Landroid/widget/RadioGroup;

    const v0, 0x7f0f02b1

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->s:Landroid/widget/RadioButton;

    const v0, 0x7f0f02b2

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->t:Landroid/widget/RadioButton;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->p:Landroid/widget/RadioGroup;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$8;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$8;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->p:Landroid/widget/RadioGroup;

    const v2, 0x7f0f02b1

    invoke-virtual {v0, v2}, Landroid/widget/RadioGroup;->check(I)V

    const v0, 0x7f0f02a1

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v0, 0x7f0f02a5

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/MyEditView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->c:Lcom/fimi/soul/view/MyEditView;

    const v0, 0x7f0f02a6

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/MyEditView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->d:Lcom/fimi/soul/view/MyEditView;

    const v0, 0x7f0f02a9

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/MyEditView;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->e:Lcom/fimi/soul/view/MyEditView;

    const v0, 0x7f0f02a4

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->l:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    const v0, 0x7f0f026f

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->m:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    const v0, 0x7f0f02a8

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget v2, p0, Lcom/fimi/soul/module/droneFragment/f;->Q:I

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->m:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget v2, p0, Lcom/fimi/soul/module/droneFragment/f;->O:I

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->l:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget v2, p0, Lcom/fimi/soul/module/droneFragment/f;->N:I

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->l:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$9;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$9;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setOnSeekBarChangeListener(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->m:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$10;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$10;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setOnSeekBarChangeListener(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$11;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$11;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setOnSeekBarChangeListener(Lcom/fimi/soul/view/myhorizontalseebar/SeekBar$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-array v2, v8, [Landroid/view/View;

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->f:Lcom/fimi/soul/view/MyEditView;

    aput-object v3, v2, v1

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->c:Lcom/fimi/soul/view/MyEditView;

    aput-object v3, v2, v5

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->d:Lcom/fimi/soul/view/MyEditView;

    aput-object v3, v2, v6

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->e:Lcom/fimi/soul/view/MyEditView;

    aput-object v3, v2, v7

    invoke-static {v0, v2}, Lcom/fimi/soul/utils/ao;->b(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/4 v2, 0x7

    new-array v2, v2, [Landroid/view/View;

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->j:Landroid/widget/TextView;

    aput-object v3, v2, v1

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->k:Landroid/widget/TextView;

    aput-object v3, v2, v5

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->i:Landroid/widget/TextView;

    aput-object v3, v2, v6

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->s:Landroid/widget/RadioButton;

    aput-object v3, v2, v7

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->t:Landroid/widget/RadioButton;

    aput-object v3, v2, v8

    const/4 v3, 0x5

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f;->g:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x6

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f;->h:Landroid/widget/TextView;

    aput-object v4, v2, v3

    invoke-static {v0, v2}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    new-array v0, v8, [Landroid/widget/EditText;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->c:Lcom/fimi/soul/view/MyEditView;

    aput-object v2, v0, v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->d:Lcom/fimi/soul/view/MyEditView;

    aput-object v2, v0, v5

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->e:Lcom/fimi/soul/view/MyEditView;

    aput-object v2, v0, v6

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->f:Lcom/fimi/soul/view/MyEditView;

    aput-object v2, v0, v7

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->a:[Landroid/widget/EditText;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->a:[Landroid/widget/EditText;

    array-length v3, v2

    move v0, v1

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    invoke-virtual {v4, v6}, Landroid/widget/EditText;->setInputType(I)V

    invoke-virtual {v4}, Landroid/widget/EditText;->clearFocus()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->c:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$12;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$12;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->d:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$13;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$13;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->e:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$14;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$14;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->f:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$15;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$15;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->c:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$2;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$2;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->setOnFinishComposingListener(Lcom/fimi/soul/view/MyEditView$b;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->d:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$3;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$3;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->setOnFinishComposingListener(Lcom/fimi/soul/view/MyEditView$b;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->e:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$4;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$4;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->setOnFinishComposingListener(Lcom/fimi/soul/view/MyEditView$b;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->f:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$5;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$5;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/MyEditView;->setOnFinishComposingListener(Lcom/fimi/soul/view/MyEditView$b;)V

    new-array v0, v8, [Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->l:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    aput-object v2, v0, v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->m:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    aput-object v2, v0, v5

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    aput-object v2, v0, v6

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    aput-object v2, v0, v7

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->V:[Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->V:[Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    array-length v3, v2

    move v0, v1

    :goto_1
    if-ge v0, v3, :cond_1

    aget-object v1, v2, v0

    invoke-virtual {v1, p0}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/f;I)I
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/droneFragment/f;->E:I

    return p1
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/f;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/f;->U:Ljava/lang/String;

    return-object p1
.end method

.method private a(Lcom/fimi/soul/entity/FlyActionBean;Lcom/google/android/gms/maps/c;Z)V
    .locals 3

    const/high16 v2, 0x3f000000    # 0.5f

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/entity/FlyActionBean;D)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Lcom/google/android/gms/maps/model/g;

    if-nez v1, :cond_2

    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const v1, 0x7f02027b

    invoke-static {v1}, Lcom/fimi/soul/biz/c/j;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/a;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/g;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Lcom/google/android/gms/maps/model/g;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Lcom/google/android/gms/maps/model/g;

    const v1, 0x461c4000    # 10000.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0, v2, v2}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Lcom/google/android/gms/maps/model/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Lcom/google/android/gms/maps/model/g;

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->p()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->b(F)V

    :cond_0
    :goto_1
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->k()V

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v0

    neg-int v0, v0

    int-to-double v0, v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/entity/FlyActionBean;D)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Lcom/google/android/gms/maps/model/g;

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->p()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->b(F)V

    goto :goto_1
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/f;Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V
    .locals 5

    :try_start_0
    invoke-virtual {p1}, Lcom/fimi/soul/view/MyEditView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/f;->a(Ljava/lang/String;)Ljava/lang/String;

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
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p4, v1}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

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
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->G:Lcom/fimi/soul/biz/c/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->j()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    if-ne p4, v0, :cond_3

    int-to-short v0, p2

    invoke-virtual {v1, v0}, Lcom/fimi/soul/entity/FlyActionBean;->setStart_point_agle(S)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/f;->a(Z)V

    :cond_1
    :goto_1
    return-void

    :cond_2
    if-ge v0, p3, :cond_7

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
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->m:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    if-ne p4, v0, :cond_4

    invoke-virtual {v1, p2}, Lcom/fimi/soul/entity/FlyActionBean;->setSpeek(I)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->o()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->U:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->U:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    const-string v0, " "

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->U:Ljava/lang/String;

    goto :goto_1

    :cond_4
    :try_start_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->l:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    if-ne p4, v0, :cond_6

    invoke-virtual {v1, p2}, Lcom/fimi/soul/entity/FlyActionBean;->setHeight(I)V

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/fimi/soul/entity/FlyActionBean;->getDrawableRes()I

    move-result v3

    invoke-virtual {v1}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()I

    move-result v1

    const/4 v4, 0x1

    invoke-static {v2, v3, v1, v4}, Lcom/fimi/soul/biz/c/j;->a(Landroid/content/Context;IIZ)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    goto :goto_1

    :cond_6
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    if-ne p4, v0, :cond_1

    invoke-virtual {v1, p2}, Lcom/fimi/soul/entity/FlyActionBean;->setRidus(I)V

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/droneFragment/f;->b(Lcom/fimi/soul/entity/FlyActionBean;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/f;->a(Z)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->o()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :cond_7
    move p2, v0

    move-object v0, v1

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/f;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Z

    return v0
.end method

.method static synthetic a(Lcom/fimi/soul/module/droneFragment/f;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/droneFragment/f;->C:Z

    return p1
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/biz/c/d;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->G:Lcom/fimi/soul/biz/c/d;

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

.method private b(Lcom/fimi/soul/entity/FlyActionBean;Lcom/google/android/gms/maps/c;Z)V
    .locals 4

    const/high16 v3, 0x3f000000    # 0.5f

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v0

    add-int/lit8 v0, v0, 0x5a

    int-to-double v0, v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/entity/FlyActionBean;D)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/google/android/gms/maps/model/g;

    if-nez v1, :cond_3

    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    const v1, 0x7f02028d

    invoke-static {v1}, Lcom/fimi/soul/biz/c/j;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/a;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/g;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/google/android/gms/maps/model/g;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/google/android/gms/maps/model/g;

    const v1, 0x461c4000    # 10000.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(F)V

    if-eqz p3, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v1

    add-int/lit16 v1, v1, 0xb4

    int-to-float v1, v1

    invoke-virtual {p2}, Lcom/google/android/gms/maps/c;->a()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v2

    iget v2, v2, Lcom/google/android/gms/maps/model/CameraPosition;->d:F

    add-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->b(F)V

    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0, v3, v3}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    :cond_0
    :goto_2
    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v0

    rsub-int v0, v0, 0x10e

    int-to-double v0, v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/entity/FlyActionBean;D)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v1

    neg-int v1, v1

    add-int/lit16 v1, v1, -0xb4

    int-to-float v1, v1

    invoke-virtual {p2}, Lcom/google/android/gms/maps/c;->a()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v2

    iget v2, v2, Lcom/google/android/gms/maps/model/CameraPosition;->d:F

    add-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->b(F)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    if-eqz p3, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v1

    add-int/lit16 v1, v1, 0xb4

    int-to-float v1, v1

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->p()F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->b(F)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v1

    neg-int v1, v1

    add-int/lit16 v1, v1, -0xb4

    int-to-float v1, v1

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->p()F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->b(F)V

    goto :goto_2
.end method

.method static synthetic b(Lcom/fimi/soul/module/droneFragment/f;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Z

    return p1
.end method

.method static synthetic c(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->f:Lcom/fimi/soul/view/MyEditView;

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/module/droneFragment/f;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/droneFragment/f;->A:Z

    return p1
.end method

.method static synthetic d(Lcom/fimi/soul/module/droneFragment/f;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->z:Z

    return v0
.end method

.method static synthetic d(Lcom/fimi/soul/module/droneFragment/f;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/droneFragment/f;->B:Z

    return p1
.end method

.method static synthetic e(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->M:I

    return v0
.end method

.method static synthetic f(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->c:Lcom/fimi/soul/view/MyEditView;

    return-object v0
.end method

.method static synthetic g(Lcom/fimi/soul/module/droneFragment/f;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic h(Lcom/fimi/soul/module/droneFragment/f;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->A:Z

    return v0
.end method

.method static synthetic i(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->P:I

    return v0
.end method

.method static synthetic j(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->d:Lcom/fimi/soul/view/MyEditView;

    return-object v0
.end method

.method private k()V
    .locals 6

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->j()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Lcom/google/android/gms/maps/model/g;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/i;

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->J:Lcom/google/android/gms/maps/c;

    new-instance v2, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v2}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/android/gms/maps/model/LatLng;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v5}, Lcom/google/android/gms/maps/model/g;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {v2, v3}, Lcom/google/android/gms/maps/model/PolylineOptions;->a([Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->D:Lcom/fimi/soul/drone/a;

    iget-object v2, v2, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0e0111

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/PolylineOptions;->a(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    const/high16 v2, 0x40800000    # 4.0f

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/PolylineOptions;->a(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/i;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/i;

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/i;->a(Ljava/util/List;)V

    goto :goto_0
.end method

.method static synthetic k(Lcom/fimi/soul/module/droneFragment/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->o()V

    return-void
.end method

.method private l()D
    .locals 6

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->D:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->v()Lcom/fimi/soul/drone/h/z;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/z;->b()D

    move-result-wide v2

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->D:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->v()Lcom/fimi/soul/drone/h/z;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/z;->c()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    new-instance v1, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->D:Lcom/fimi/soul/drone/a;

    invoke-virtual {v2}, Lcom/fimi/soul/drone/a;->u()Lcom/fimi/soul/drone/h/ag;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/drone/h/ag;->e()D

    move-result-wide v2

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f;->D:Lcom/fimi/soul/drone/a;

    invoke-virtual {v4}, Lcom/fimi/soul/drone/a;->u()Lcom/fimi/soul/drone/h/ag;

    move-result-object v4

    invoke-virtual {v4}, Lcom/fimi/soul/drone/h/ag;->d()D

    move-result-wide v4

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-static {v0, v1}, Lcom/fimi/soul/utils/y;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/fimi/soul/utils/ag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/utils/ag;->a()D

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic l(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    return-object v0
.end method

.method static synthetic m(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->R:I

    return v0
.end method

.method private m()V
    .locals 8

    const v1, 0x7f02006b

    const/4 v7, 0x0

    const/high16 v6, -0x3f000000    # -8.0f

    const/4 v5, 0x1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0400a4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    const v0, 0x7f0f03be

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$a;

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f;->y:[Ljava/lang/String;

    invoke-direct {v2, p0, v3, v4}, Lcom/fimi/soul/module/droneFragment/f$a;-><init>(Lcom/fimi/soul/module/droneFragment/f;Landroid/content/Context;[Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    invoke-virtual {v0, v5}, Landroid/widget/ListView;->setSelection(I)V

    new-instance v2, Lcom/fimi/soul/module/droneFragment/f$6;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/droneFragment/f$6;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    new-instance v2, Landroid/widget/PopupWindow;

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/Button;

    invoke-virtual {v3}, Landroid/widget/Button;->getWidth()I

    move-result v3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/Button;

    invoke-virtual {v4}, Landroid/widget/Button;->getHeight()I

    move-result v4

    mul-int/lit8 v4, v4, 0x4

    invoke-direct {v2, v0, v3, v4}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    iput-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/Button;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    invoke-static {v2, v6}, Lcom/fimi/soul/utils/g;->b(Landroid/content/Context;F)I

    move-result v2

    invoke-virtual {v0, v1, v7, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v5}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v5}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v5}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>()V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    new-instance v1, Lcom/fimi/soul/module/droneFragment/f$7;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/droneFragment/f$7;-><init>(Lcom/fimi/soul/module/droneFragment/f;)V

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/Button;

    const v1, 0x7f02006a

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/Button;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    invoke-static {v2, v6}, Lcom/fimi/soul/utils/g;->b(Landroid/content/Context;F)I

    move-result v2

    invoke-virtual {v0, v1, v7, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    goto :goto_0
.end method

.method static synthetic n(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->e:Lcom/fimi/soul/view/MyEditView;

    return-object v0
.end method

.method private n()V
    .locals 7

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->getWidth()I

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->G:Lcom/fimi/soul/biz/c/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->j()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->D:Lcom/fimi/soul/drone/a;

    invoke-virtual {v3}, Lcom/fimi/soul/drone/a;->aa()Lcom/google/android/gms/maps/c;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/google/android/gms/maps/c;->n()Lcom/google/android/gms/maps/h;

    move-result-object v4

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/maps/h;->a(Lcom/google/android/gms/maps/model/LatLng;)Landroid/graphics/Point;

    move-result-object v4

    iget v5, v4, Landroid/graphics/Point;->x:I

    div-int/lit8 v6, v1, 0x2

    if-le v5, v6, :cond_0

    new-instance v5, Landroid/graphics/Point;

    iget v4, v4, Landroid/graphics/Point;->x:I

    div-int/lit8 v6, v1, 0x3

    sub-int/2addr v4, v6

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v1, v4

    div-int/lit8 v2, v2, 0x2

    invoke-direct {v5, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v3}, Lcom/google/android/gms/maps/c;->n()Lcom/google/android/gms/maps/h;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/google/android/gms/maps/h;->a(Landroid/graphics/Point;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/maps/b;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/a;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/a;)V

    :cond_0
    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/f;->b(Lcom/fimi/soul/entity/FlyActionBean;)V

    return-void
.end method

.method private o()V
    .locals 6

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->j()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->F:Lcom/google/android/gms/maps/model/c;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->F:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/c;->d()D

    move-result-wide v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    mul-double/2addr v2, v4

    const-wide v4, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v2, v4

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getSpeek()I

    move-result v0

    int-to-double v0, v0

    div-double v0, v2, v0

    double-to-int v0, v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->g:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    const v3, 0x7f0a03d8

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method static synthetic o(Lcom/fimi/soul/module/droneFragment/f;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/droneFragment/f;->B:Z

    return v0
.end method

.method private declared-synchronized p()F
    .locals 2

    const/4 v0, 0x0

    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->J:Lcom/google/android/gms/maps/c;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/c;->a()Lcom/google/android/gms/maps/model/CameraPosition;

    move-result-object v1

    if-eqz v1, :cond_0

    iget v0, v1, Lcom/google/android/gms/maps/model/CameraPosition;->d:F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method static synthetic p(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->E:I

    return v0
.end method

.method static synthetic q(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->m:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    return-object v0
.end method

.method static synthetic r(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->O:I

    return v0
.end method

.method static synthetic s(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->N:I

    return v0
.end method

.method static synthetic t(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->l:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    return-object v0
.end method

.method static synthetic u(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->S:I

    return v0
.end method

.method static synthetic v(Lcom/fimi/soul/module/droneFragment/f;)I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->T:I

    return v0
.end method

.method static synthetic w(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    return-object v0
.end method

.method static synthetic x(Lcom/fimi/soul/module/droneFragment/f;)Landroid/widget/Button;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic y(Lcom/fimi/soul/module/droneFragment/f;)Landroid/widget/PopupWindow;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/fimi/soul/entity/FlyActionBean;D)Lcom/google/android/gms/maps/model/LatLng;
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->F:Lcom/google/android/gms/maps/model/c;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->F:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/c;->d()D

    move-result-wide v2

    invoke-static {v0, p2, p3, v2, v3}, Lcom/fimi/soul/utils/y;->a(Lcom/google/android/gms/maps/model/LatLng;DD)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    :cond_0
    return-object v0
.end method

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
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->w:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->w:Landroid/widget/Button;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    const v1, 0x7f0a0381

    const/16 v2, 0x5dc

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    :cond_0
    return-void
.end method

.method public a(Lcom/fimi/soul/entity/FlyActionBean;)V
    .locals 7

    const/4 v6, 0x4

    const/4 v5, 0x2

    const/4 v4, 0x0

    const/4 v3, 0x3

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->y:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, v2}, Lcom/fimi/soul/entity/FlyActionBean;->setYaw_mode(I)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->p:Landroid/widget/RadioGroup;

    invoke-virtual {v0}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :goto_1
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/f;->f()V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->o()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->y:[Ljava/lang/String;

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1, v4}, Lcom/fimi/soul/entity/FlyActionBean;->setYaw_mode(I)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->y:[Ljava/lang/String;

    aget-object v1, v1, v5

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1, v5}, Lcom/fimi/soul/entity/FlyActionBean;->setYaw_mode(I)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->y:[Ljava/lang/String;

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1, v3}, Lcom/fimi/soul/entity/FlyActionBean;->setYaw_mode(I)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->y:[Ljava/lang/String;

    aget-object v1, v1, v6

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v6}, Lcom/fimi/soul/entity/FlyActionBean;->setYaw_mode(I)V

    goto :goto_0

    :pswitch_0
    invoke-virtual {p1, v3}, Lcom/fimi/soul/entity/FlyActionBean;->setPara1(I)V

    goto :goto_1

    :pswitch_1
    invoke-virtual {p1, v2}, Lcom/fimi/soul/entity/FlyActionBean;->setPara1(I)V

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x7f0f02b1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public a(Z)V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->G:Lcom/fimi/soul/biz/c/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->j()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->D:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->aa()Lcom/google/android/gms/maps/c;

    move-result-object v1

    iput-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->J:Lcom/google/android/gms/maps/c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->J:Lcom/google/android/gms/maps/c;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->p:Landroid/widget/RadioGroup;

    invoke-virtual {v1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    if-nez p1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->J:Lcom/google/android/gms/maps/c;

    invoke-direct {p0, v0, v1, v3}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/entity/FlyActionBean;Lcom/google/android/gms/maps/c;Z)V

    :cond_1
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->J:Lcom/google/android/gms/maps/c;

    invoke-direct {p0, v0, v1, v3}, Lcom/fimi/soul/module/droneFragment/f;->b(Lcom/fimi/soul/entity/FlyActionBean;Lcom/google/android/gms/maps/c;Z)V

    goto :goto_0

    :pswitch_1
    if-nez p1, :cond_2

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->J:Lcom/google/android/gms/maps/c;

    invoke-direct {p0, v0, v1, v2}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/entity/FlyActionBean;Lcom/google/android/gms/maps/c;Z)V

    :cond_2
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->J:Lcom/google/android/gms/maps/c;

    invoke-direct {p0, v0, v1, v2}, Lcom/fimi/soul/module/droneFragment/f;->b(Lcom/fimi/soul/entity/FlyActionBean;Lcom/google/android/gms/maps/c;Z)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x7f0f02b1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public b(Lcom/fimi/soul/entity/FlyActionBean;)V
    .locals 6

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->D:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->aa()Lcom/google/android/gms/maps/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->J:Lcom/google/android/gms/maps/c;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->J:Lcom/google/android/gms/maps/c;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->F:Lcom/google/android/gms/maps/model/c;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->G:Lcom/fimi/soul/biz/c/d;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->j()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getRidus()I

    move-result v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->J:Lcom/google/android/gms/maps/c;

    new-instance v3, Lcom/google/android/gms/maps/model/CircleOptions;

    invoke-direct {v3}, Lcom/google/android/gms/maps/model/CircleOptions;-><init>()V

    int-to-double v4, v1

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/maps/model/CircleOptions;->a(D)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    const/high16 v3, 0x40800000    # 4.0f

    invoke-virtual {v1, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->a(F)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0e0111

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/google/android/gms/maps/model/CircleOptions;->a(I)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/model/CircleOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/CircleOptions;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/CircleOptions;)Lcom/google/android/gms/maps/model/c;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->F:Lcom/google/android/gms/maps/model/c;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->G:Lcom/fimi/soul/biz/c/d;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->F:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/c/d;->a(Lcom/google/android/gms/maps/model/c;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->F:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {p1}, Lcom/fimi/soul/entity/FlyActionBean;->getRidus()I

    move-result v1

    int-to-double v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/maps/model/c;->a(D)V

    goto :goto_0
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    invoke-virtual {v0}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 3

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/f;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->u:Landroid/widget/Button;

    const v1, 0x7f02006a

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->F:Lcom/google/android/gms/maps/model/c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->F:Lcom/google/android/gms/maps/model/c;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/c;->a()V

    iput-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->F:Lcom/google/android/gms/maps/model/c;

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->a()V

    iput-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Lcom/google/android/gms/maps/model/g;

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->a()V

    iput-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->I:Lcom/google/android/gms/maps/model/g;

    :cond_3
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    iput-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->K:Lcom/google/android/gms/maps/model/i;

    :cond_4
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->w:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->w:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 4

    const v3, 0x7f0e0044

    const v2, 0x7f0e001d

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->s:Landroid/widget/RadioButton;

    invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->s:Landroid/widget/RadioButton;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->t:Landroid/widget/RadioButton;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTextColor(I)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->t:Landroid/widget/RadioButton;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTextColor(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->s:Landroid/widget/RadioButton;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setTextColor(I)V

    goto :goto_0
.end method

.method public g()V
    .locals 0

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/f;->c()V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->n()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/f;->h()V

    return-void
.end method

.method public h()V
    .locals 8

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->j()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->l()D

    move-result-wide v2

    iget v1, p0, Lcom/fimi/soul/module/droneFragment/f;->Q:I

    int-to-double v4, v1

    sub-double/2addr v4, v2

    iget v1, p0, Lcom/fimi/soul/module/droneFragment/f;->R:I

    int-to-double v6, v1

    cmpg-double v1, v4, v6

    if-gez v1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->q:Landroid/content/Context;

    const v1, 0x7f0a010c

    const/16 v2, 0xbb8

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->l:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()I

    move-result v4

    invoke-virtual {v1, v4}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->m:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getSpeek()I

    move-result v4

    invoke-virtual {v1, v4}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getRidus()I

    move-result v4

    invoke-virtual {v1, v4}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->o:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v4

    invoke-virtual {v1, v4}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setProgress(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->n:Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    iget v4, p0, Lcom/fimi/soul/module/droneFragment/f;->Q:I

    int-to-double v4, v4

    sub-double v2, v4, v2

    double-to-int v2, v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->setMax(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->c:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getHeight()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "m"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->d:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getSpeek()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "m/s"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->e:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getRidus()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "m"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->f:Lcom/fimi/soul/view/MyEditView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getStart_point_agle()S

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\u00b0"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getPara1()I

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getPara1()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_4

    :cond_2
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->p:Landroid/widget/RadioGroup;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->t:Landroid/widget/RadioButton;

    invoke-virtual {v2}, Landroid/widget/RadioButton;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/RadioGroup;->check(I)V

    :cond_3
    :goto_1
    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/entity/FlyActionBean;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/f;->a(Z)V

    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->k()V

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getPara1()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_5

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getPara1()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_3

    :cond_5
    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f;->p:Landroid/widget/RadioGroup;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->s:Landroid/widget/RadioButton;

    invoke-virtual {v2}, Landroid/widget/RadioButton;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/RadioGroup;->check(I)V

    goto :goto_1
.end method

.method public declared-synchronized i()V
    .locals 6

    const-wide/16 v0, 0x0

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/biz/c/d;->j()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v2

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->F:Lcom/google/android/gms/maps/model/c;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Lcom/google/android/gms/maps/model/g;

    if-eqz v3, :cond_0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/fimi/soul/entity/FlyActionBean;->getLatLng()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v4}, Lcom/google/android/gms/maps/model/g;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/fimi/soul/utils/y;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)Lcom/fimi/soul/utils/ag;

    move-result-object v3

    invoke-virtual {v3}, Lcom/fimi/soul/utils/ag;->a()D

    move-result-wide v4

    double-to-int v3, v4

    invoke-virtual {v2, v3}, Lcom/fimi/soul/entity/FlyActionBean;->setRidus(I)V

    invoke-virtual {p0, v2}, Lcom/fimi/soul/module/droneFragment/f;->b(Lcom/fimi/soul/entity/FlyActionBean;)V

    const-wide/16 v4, 0x0

    invoke-virtual {p0, v2, v4, v5}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/entity/FlyActionBean;D)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f;->p:Landroid/widget/RadioGroup;

    invoke-virtual {v4}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    :goto_0
    double-to-int v3, v0

    int-to-short v3, v3

    invoke-virtual {v2, v3}, Lcom/fimi/soul/entity/FlyActionBean;->setStart_point_agle(S)V

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f;->f:Lcom/fimi/soul/view/MyEditView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    double-to-int v0, v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "deg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/fimi/soul/view/MyEditView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/droneFragment/f;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :pswitch_0
    :try_start_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/fimi/soul/utils/y;->d(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide v0

    goto :goto_0

    :pswitch_1
    iget v0, p0, Lcom/fimi/soul/module/droneFragment/f;->S:I

    int-to-double v0, v0

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f;->H:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v4}, Lcom/google/android/gms/maps/model/g;->c()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/fimi/soul/utils/y;->d(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-wide v4

    sub-double/2addr v0, v4

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :pswitch_data_0
    .packed-switch 0x7f0f02b1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->x:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :goto_0
    return-void

    :sswitch_0
    invoke-direct {p0}, Lcom/fimi/soul/module/droneFragment/f;->m()V

    goto :goto_0

    :sswitch_1
    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/f;->d()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->D:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bj:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneFragment/f;->a()V

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->D:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->bA:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f;->w:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0f02ae -> :sswitch_0
        0x7f0f02b4 -> :sswitch_1
        0x7f0f02b5 -> :sswitch_2
    .end sparse-switch
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    const/4 v3, 0x0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return v3

    :pswitch_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->W:F

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/fimi/soul/module/droneFragment/f;->X:F

    goto :goto_0

    :pswitch_1
    invoke-virtual {p1}, Landroid/view/View;->getX()F

    move-result v0

    iget v1, p0, Lcom/fimi/soul/module/droneFragment/f;->W:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getY()F

    move-result v1

    iget v2, p0, Lcom/fimi/soul/module/droneFragment/f;->X:F

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_0

    :pswitch_2
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
