.class public Lcom/fimi/soul/module/login/LoginFragment;
.super Landroid/app/Fragment;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/login/LoginFragment$a;
    }
.end annotation


# instance fields
.field private A:Lcom/fimi/soul/module/thirdpartlogin/c$a;

.field private a:Landroid/widget/TextView;

.field private b:Landroid/content/Context;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/Button;

.field private f:Landroid/widget/Button;

.field private g:Landroid/widget/Button;

.field private h:Landroid/widget/Button;

.field private i:Landroid/widget/LinearLayout;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/RelativeLayout;

.field private o:Landroid/widget/RelativeLayout;

.field private p:Landroid/animation/LayoutTransition;

.field private q:Lcom/fimi/soul/module/login/LoginFragment$a;

.field private r:Ljava/lang/String;

.field private s:Lcom/xiaomi/account/openauth/XiaomiOAuthResults;

.field private t:Lcom/fimi/soul/biz/manager/x;

.field private u:Ljava/lang/String;

.field private v:Lcom/fimi/soul/entity/User;

.field private w:Ljava/lang/Boolean;

.field private x:Lcom/fimi/soul/utils/aj;

.field private y:Z

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    const-string v0, "http://dev.xiaomi.com"

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->r:Ljava/lang/String;

    new-instance v0, Lcom/fimi/soul/entity/User;

    invoke-direct {v0}, Lcom/fimi/soul/entity/User;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->v:Lcom/fimi/soul/entity/User;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->w:Ljava/lang/Boolean;

    iput-boolean v1, p0, Lcom/fimi/soul/module/login/LoginFragment;->y:Z

    const/16 v0, -0xa

    iput v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->z:I

    new-instance v0, Lcom/fimi/soul/module/login/LoginFragment$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/login/LoginFragment$1;-><init>(Lcom/fimi/soul/module/login/LoginFragment;)V

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->A:Lcom/fimi/soul/module/thirdpartlogin/c$a;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/login/LoginFragment;I)I
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/login/LoginFragment;->z:I

    return p1
.end method

.method static synthetic a(Lcom/fimi/soul/module/login/LoginFragment;)Landroid/widget/RelativeLayout;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->o:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private a()V
    .locals 14

    const-wide/16 v12, 0x1f4

    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v8, 0x0

    const/high16 v7, 0x447a0000    # 1000.0f

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->a:Landroid/widget/TextView;

    const-string v1, "translationX"

    new-array v2, v10, [F

    iget-object v3, p0, Lcom/fimi/soul/module/login/LoginFragment;->a:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getTranslationX()F

    move-result v3

    aput v3, v2, v8

    aput v7, v2, v9

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->d:Landroid/widget/TextView;

    const-string v1, "translationX"

    new-array v2, v10, [F

    iget-object v3, p0, Lcom/fimi/soul/module/login/LoginFragment;->d:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getTranslationX()F

    move-result v3

    aput v3, v2, v8

    aput v7, v2, v9

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    invoke-virtual {v0, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->e:Landroid/widget/Button;

    const-string v1, "translationX"

    new-array v2, v10, [F

    iget-object v3, p0, Lcom/fimi/soul/module/login/LoginFragment;->d:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getTranslationX()F

    move-result v3

    aput v3, v2, v8

    aput v7, v2, v9

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    invoke-virtual {v0, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->i:Landroid/widget/LinearLayout;

    const-string v1, "translationX"

    new-array v2, v10, [F

    iget-object v3, p0, Lcom/fimi/soul/module/login/LoginFragment;->d:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getTranslationX()F

    move-result v3

    aput v3, v2, v8

    aput v7, v2, v9

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    invoke-virtual {v0, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->f:Landroid/widget/Button;

    const-string v1, "translationX"

    new-array v2, v10, [F

    iget-object v3, p0, Lcom/fimi/soul/module/login/LoginFragment;->d:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getTranslationX()F

    move-result v3

    aput v3, v2, v8

    aput v7, v2, v9

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    invoke-virtual {v0, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->j:Landroid/widget/TextView;

    const-string v1, "translationX"

    new-array v2, v10, [F

    iget-object v3, p0, Lcom/fimi/soul/module/login/LoginFragment;->d:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getTranslationX()F

    move-result v3

    aput v3, v2, v8

    aput v7, v2, v9

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginFragment;->k:Landroid/widget/TextView;

    const-string v2, "translationX"

    new-array v3, v10, [F

    iget-object v4, p0, Lcom/fimi/soul/module/login/LoginFragment;->d:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getTranslationX()F

    move-result v4

    aput v4, v3, v8

    aput v7, v3, v9

    invoke-static {v1, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginFragment;->m:Landroid/widget/TextView;

    const-string v3, "translationX"

    new-array v4, v10, [F

    iget-object v5, p0, Lcom/fimi/soul/module/login/LoginFragment;->d:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/widget/TextView;->getTranslationX()F

    move-result v5

    aput v5, v4, v8

    aput v7, v4, v9

    invoke-static {v2, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v2

    iget-object v3, p0, Lcom/fimi/soul/module/login/LoginFragment;->l:Landroid/widget/TextView;

    const-string v4, "translationX"

    new-array v5, v10, [F

    iget-object v6, p0, Lcom/fimi/soul/module/login/LoginFragment;->d:Landroid/widget/TextView;

    invoke-virtual {v6}, Landroid/widget/TextView;->getTranslationX()F

    move-result v6

    aput v6, v5, v8

    aput v7, v5, v9

    invoke-static {v3, v4, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v3

    new-instance v4, Landroid/animation/AnimatorSet;

    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-virtual {v4, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    const-wide/16 v0, 0x190

    invoke-virtual {v4, v0, v1}, Landroid/animation/AnimatorSet;->setStartDelay(J)V

    invoke-virtual {v4, v12, v13}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    invoke-virtual {v4}, Landroid/animation/AnimatorSet;->start()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->c:Landroid/widget/TextView;

    const-string v1, "translationX"

    new-array v2, v10, [F

    iget-object v3, p0, Lcom/fimi/soul/module/login/LoginFragment;->d:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getTranslationX()F

    move-result v3

    aput v3, v2, v8

    aput v7, v2, v9

    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0, v12, v13}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    invoke-virtual {v0, v12, v13}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->q:Lcom/fimi/soul/module/login/LoginFragment$a;

    invoke-interface {v0}, Lcom/fimi/soul/module/login/LoginFragment$a;->a()V

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/login/LoginFragment;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/module/login/LoginFragment;->y:Z

    return p1
.end method

.method static synthetic b(Lcom/fimi/soul/module/login/LoginFragment;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/module/login/LoginFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/login/LoginFragment;->a()V

    return-void
.end method


# virtual methods
.method public facebookLogin()V
    .locals 3

    const/4 v1, 0x0

    iget-boolean v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->y:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iput-boolean v1, p0, Lcom/fimi/soul/module/login/LoginFragment;->y:Z

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/module/c/a;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->o:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_1
    invoke-static {}, Lcom/fimi/soul/module/thirdpartlogin/c;->a()Lcom/fimi/soul/module/thirdpartlogin/c;

    move-result-object v0

    sget-object v1, Lcn/sharesdk/facebook/Facebook;->NAME:Ljava/lang/String;

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginFragment;->A:Lcom/fimi/soul/module/thirdpartlogin/c$a;

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/module/thirdpartlogin/c;->a(Ljava/lang/String;Lcom/fimi/soul/module/thirdpartlogin/c$a;)V

    goto :goto_0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Fragment;->onAttach(Landroid/app/Activity;)V

    move-object v0, p1

    check-cast v0, Lcom/fimi/soul/module/login/LoginFragment$a;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->q:Lcom/fimi/soul/module/login/LoginFragment$a;

    iput-object p1, p0, Lcom/fimi/soul/module/login/LoginFragment;->b:Landroid/content/Context;

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    const v2, 0x7f0a0288

    const/16 v1, 0x3e8

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :cond_0
    :goto_0
    return-void

    :sswitch_0
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->w:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->w:Ljava/lang/Boolean;

    invoke-direct {p0}, Lcom/fimi/soul/module/login/LoginFragment;->a()V

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->o:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->x:Lcom/fimi/soul/utils/aj;

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginFragment;->b:Landroid/content/Context;

    new-instance v2, Lcom/fimi/soul/module/login/LoginFragment$2;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/login/LoginFragment$2;-><init>(Lcom/fimi/soul/module/login/LoginFragment;)V

    invoke-interface {v0, v1, v2}, Lcom/fimi/soul/utils/aj;->a(Landroid/content/Context;Lcom/fimi/soul/utils/aj$a;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->b:Landroid/content/Context;

    invoke-static {v0, v2, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0

    :sswitch_2
    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginFragment;->facebookLogin()V

    goto :goto_0

    :sswitch_3
    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginFragment;->twitterLogin()V

    goto :goto_0

    :sswitch_4
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginFragment;->b:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/login/RegisterActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginFragment;->b:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->b:Landroid/content/Context;

    invoke-static {v0, v2, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_0

    :sswitch_5
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const-class v2, Lcom/fimi/soul/module/setting/ShowTextActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "URL_ONLINE"

    const-string v2, "https://fimiservice-us.mi-ae.com/privacy.html"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "URL_TITLE"

    const v2, 0x7f0a00ac

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "URL_LOCAL"

    const-string v2, "file:///android_asset/privacy.html"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LoginFragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :sswitch_6
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    const-class v2, Lcom/fimi/soul/module/setting/ShowTextActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "URL_ONLINE"

    const-string v2, "https://fimiservice-us.mi-ae.com/statement.html"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "URL_TITLE"

    const v2, 0x7f0a00ad

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "URL_LOCAL"

    const-string v2, "file:///android_asset/statement.html"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/login/LoginFragment;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0f00ed -> :sswitch_6
        0x7f0f02ed -> :sswitch_4
        0x7f0f02ee -> :sswitch_1
        0x7f0f02f0 -> :sswitch_2
        0x7f0f02f1 -> :sswitch_3
        0x7f0f02f3 -> :sswitch_5
        0x7f0f02f5 -> :sswitch_0
    .end sparse-switch
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const v3, 0x7f0f02ed

    const v2, 0x7f0f02ec

    const/4 v6, 0x0

    const/16 v5, 0x8

    const/4 v4, 0x1

    const v0, 0x7f040072

    invoke-virtual {p1, v0, p2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    const v0, 0x7f0f02f5

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->c:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f02eb

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->a:Landroid/widget/TextView;

    const v0, 0x7f0f02ee

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->e:Landroid/widget/Button;

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->f:Landroid/widget/Button;

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->d:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->d:Landroid/widget/TextView;

    const v0, 0x7f0f02ee

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->e:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->e:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f02ef

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->i:Landroid/widget/LinearLayout;

    const v0, 0x7f0f02f0

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->g:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->g:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f02f1

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->h:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->h:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f02f4

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->m:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->f:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->f:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f02f3

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->j:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->j:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/text/TextPaint;->setFlags(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->j:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->j:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f00ed

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->k:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->k:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/text/TextPaint;->setFlags(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->k:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/text/TextPaint;->setAntiAlias(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->k:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f02f2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->l:Landroid/widget/TextView;

    const v0, 0x7f0f02ea

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->n:Landroid/widget/RelativeLayout;

    const v0, 0x7f0f02f6

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->o:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/x;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/x;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->t:Lcom/fimi/soul/biz/manager/x;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/16 v2, 0xb

    new-array v2, v2, [Landroid/view/View;

    iget-object v3, p0, Lcom/fimi/soul/module/login/LoginFragment;->c:Landroid/widget/TextView;

    aput-object v3, v2, v6

    iget-object v3, p0, Lcom/fimi/soul/module/login/LoginFragment;->a:Landroid/widget/TextView;

    aput-object v3, v2, v4

    const/4 v3, 0x2

    iget-object v4, p0, Lcom/fimi/soul/module/login/LoginFragment;->e:Landroid/widget/Button;

    aput-object v4, v2, v3

    const/4 v3, 0x3

    iget-object v4, p0, Lcom/fimi/soul/module/login/LoginFragment;->f:Landroid/widget/Button;

    aput-object v4, v2, v3

    const/4 v3, 0x4

    iget-object v4, p0, Lcom/fimi/soul/module/login/LoginFragment;->d:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x5

    iget-object v4, p0, Lcom/fimi/soul/module/login/LoginFragment;->j:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x6

    iget-object v4, p0, Lcom/fimi/soul/module/login/LoginFragment;->m:Landroid/widget/TextView;

    aput-object v4, v2, v3

    const/4 v3, 0x7

    iget-object v4, p0, Lcom/fimi/soul/module/login/LoginFragment;->k:Landroid/widget/TextView;

    aput-object v4, v2, v3

    iget-object v3, p0, Lcom/fimi/soul/module/login/LoginFragment;->l:Landroid/widget/TextView;

    aput-object v3, v2, v5

    const/16 v3, 0x9

    iget-object v4, p0, Lcom/fimi/soul/module/login/LoginFragment;->g:Landroid/widget/Button;

    aput-object v4, v2, v3

    const/16 v3, 0xa

    iget-object v4, p0, Lcom/fimi/soul/module/login/LoginFragment;->h:Landroid/widget/Button;

    aput-object v4, v2, v3

    invoke-static {v0, v2}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    new-instance v0, Lcom/fimi/soul/utils/ai;

    invoke-direct {v0}, Lcom/fimi/soul/utils/ai;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->x:Lcom/fimi/soul/utils/aj;

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/fimi/soul/module/thirdpartlogin/c;->a()Lcom/fimi/soul/module/thirdpartlogin/c;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fimi/soul/module/login/LoginFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/fimi/soul/module/thirdpartlogin/c;->a(Landroid/content/Context;)V

    :cond_0
    return-object v1
.end method

.method public twitterLogin()V
    .locals 3

    const/4 v1, 0x0

    iget-boolean v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->y:Z

    if-eqz v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iput-boolean v1, p0, Lcom/fimi/soul/module/login/LoginFragment;->y:Z

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/module/c/a;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginFragment;->o:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_1
    invoke-static {}, Lcom/fimi/soul/module/thirdpartlogin/c;->a()Lcom/fimi/soul/module/thirdpartlogin/c;

    move-result-object v0

    sget-object v1, Lcn/sharesdk/twitter/Twitter;->NAME:Ljava/lang/String;

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginFragment;->A:Lcom/fimi/soul/module/thirdpartlogin/c$a;

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/module/thirdpartlogin/c;->a(Ljava/lang/String;Lcom/fimi/soul/module/thirdpartlogin/c$a;)V

    goto :goto_0
.end method
