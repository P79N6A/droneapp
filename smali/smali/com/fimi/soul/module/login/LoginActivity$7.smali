.class Lcom/fimi/soul/module/login/LoginActivity$7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fimi/soul/module/login/LoginActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/login/LoginActivity;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/login/LoginActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    const/4 v3, 0x4

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->a(Lcom/fimi/soul/module/login/LoginActivity;)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->p(Lcom/fimi/soul/module/login/LoginActivity;)Lcom/fimi/soul/view/TranslationView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/TranslationView;->a()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->k(Lcom/fimi/soul/module/login/LoginActivity;)Lcom/fimi/soul/view/BreathLeapView;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/fimi/soul/view/BreathLeapView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->p(Lcom/fimi/soul/module/login/LoginActivity;)Lcom/fimi/soul/view/TranslationView;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/TranslationView;->setVisibility(I)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-boolean v0, v0, Lcom/fimi/soul/module/login/LoginActivity;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->q(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->r(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->j(Lcom/fimi/soul/module/login/LoginActivity;)Lcom/fimi/kernel/view/progress/ProgressView;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/progress/ProgressView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-virtual {v0}, Lcom/fimi/soul/module/login/LoginActivity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v1}, Lcom/fimi/soul/module/login/LoginActivity;->o(Lcom/fimi/soul/module/login/LoginActivity;)Lcom/fimi/soul/module/login/UsbConnectFragment;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iput-boolean v2, v0, Lcom/fimi/soul/module/login/LoginActivity;->a:Z

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->k(Lcom/fimi/soul/module/login/LoginActivity;)Lcom/fimi/soul/view/BreathLeapView;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/BreathLeapView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->p(Lcom/fimi/soul/module/login/LoginActivity;)Lcom/fimi/soul/view/TranslationView;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/fimi/soul/view/TranslationView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->k(Lcom/fimi/soul/module/login/LoginActivity;)Lcom/fimi/soul/view/BreathLeapView;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v1}, Lcom/fimi/soul/module/login/LoginActivity;->s(Lcom/fimi/soul/module/login/LoginActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/BreathLeapView;->setting(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->t(Lcom/fimi/soul/module/login/LoginActivity;)I

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->s(Lcom/fimi/soul/module/login/LoginActivity;)I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0, v2}, Lcom/fimi/soul/module/login/LoginActivity;->b(Lcom/fimi/soul/module/login/LoginActivity;I)I

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->e(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v1}, Lcom/fimi/soul/module/login/LoginActivity;->d(Lcom/fimi/soul/module/login/LoginActivity;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x258

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->e(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity$7;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v1}, Lcom/fimi/soul/module/login/LoginActivity;->d(Lcom/fimi/soul/module/login/LoginActivity;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_0
.end method
