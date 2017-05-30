.class public Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;
.super Lcom/fimi/soul/module/calibcompass/BaseCaliCompassFragment;


# instance fields
.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/Button;

.field private i:Landroid/widget/Button;

.field private j:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/calibcompass/BaseCaliCompassFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IZ)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->g:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->i:Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->isEnabled()Z

    move-result v0

    if-eq v0, p2, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/kernel/d/b;->b(Landroid/content/Context;)Lcom/fimi/kernel/d/b;

    move-result-object v0

    const v1, 0x7f0a033d

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/kernel/d/b;->a(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->i:Landroid/widget/Button;

    invoke-virtual {v0, p2}, Landroid/widget/Button;->setEnabled(Z)V

    if-eqz p2, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->i:Landroid/widget/Button;

    const/16 v1, 0xe6

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->a(Landroid/widget/Button;I)V

    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->i:Landroid/widget/Button;

    const/16 v1, 0x4d

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->a(Landroid/widget/Button;I)V

    goto :goto_0
.end method

.method public a(Landroid/widget/Button;I)V
    .locals 1

    invoke-virtual {p1}, Landroid/widget/Button;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/ColorStateList;->withAlpha(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->i:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    const/4 v1, 0x1

    invoke-super {p0, p1}, Lcom/fimi/soul/module/calibcompass/BaseCaliCompassFragment;->onClick(Landroid/view/View;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :goto_0
    return-void

    :sswitch_0
    invoke-virtual {p0}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->b:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/b/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/b/d;

    move-result-object v0

    invoke-virtual {v0, v1, v1, v1}, Lcom/fimi/soul/module/b/d;->a(BBB)V

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->c:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->c:Landroid/support/v4/app/FragmentManager;

    const-string v2, "first"

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0f01cd -> :sswitch_1
        0x7f0f0427 -> :sswitch_0
    .end sparse-switch
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    const v7, 0x7f0a00e2

    const/4 v6, 0x1

    const/4 v5, 0x0

    const v0, 0x7f040040

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    const v0, 0x7f0f0357

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->f:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->f:Landroid/widget/TextView;

    const v2, 0x7f0a0122

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    const v0, 0x7f0f01cc

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->g:Landroid/widget/TextView;

    const v0, 0x7f0f0427

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->h:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->h:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0f01cd

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->i:Landroid/widget/Button;

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->i:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->i:Landroid/widget/Button;

    invoke-virtual {v0, v5}, Landroid/widget/Button;->setEnabled(Z)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/4 v2, 0x3

    new-array v2, v2, [Landroid/view/View;

    iget-object v3, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->h:Landroid/widget/Button;

    aput-object v3, v2, v5

    iget-object v3, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->f:Landroid/widget/TextView;

    aput-object v3, v2, v6

    const/4 v3, 0x2

    iget-object v4, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->g:Landroid/widget/TextView;

    aput-object v4, v2, v3

    invoke-static {v0, v2}, Lcom/fimi/soul/utils/ao;->a(Landroid/content/res/AssetManager;[Landroid/view/View;)V

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->b:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->b:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->b:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f0a030f

    invoke-virtual {p0, v0, v5}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->a(IZ)V

    :goto_0
    return-object v1

    :cond_1
    const v0, 0x7f0a00e3

    invoke-virtual {p0, v0, v5}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->a(IZ)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->b:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ad()Lcom/fimi/soul/drone/h/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->aj()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v7, v5}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->a(IZ)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/kernel/d/b;->b(Landroid/content/Context;)Lcom/fimi/kernel/d/b;

    move-result-object v0

    invoke-virtual {p0, v7}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/d/b;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const v0, 0x7f0a00d7

    invoke-virtual {p0, v0, v6}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->a(IZ)V

    goto :goto_0
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 6

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    invoke-super {p0, p1, p2}, Lcom/fimi/soul/module/calibcompass/BaseCaliCompassFragment;->onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment$1;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->i()Lcom/fimi/soul/drone/h/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->d()B

    move-result v1

    if-ne v1, v5, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->e()B

    move-result v1

    if-ne v1, v4, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->b()B

    move-result v1

    if-ne v1, v4, :cond_0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->c()B

    move-result v1

    if-eq v1, v5, :cond_1

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->c()B

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    :cond_1
    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/j;->c()B

    move-result v0

    if-ne v0, v5, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->c:Landroid/support/v4/app/FragmentManager;

    const-string v1, "error"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_0

    instance-of v0, v1, Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Landroid/support/v4/app/Fragment;->isHidden()Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, v1

    check-cast v0, Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;

    const v2, 0x7f0a00e1

    invoke-virtual {p0, v2}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v4, v3}, Lcom/fimi/soul/module/calibcompass/CaliCompassErrorFragment;->a(Ljava/lang/String;ZZ)V

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->c:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/support/v4/app/FragmentTransaction;->hide(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_0

    :cond_2
    iput-boolean v4, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->j:Z

    const v0, 0x7f0a00de

    invoke-virtual {p0, v0, v3}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->a(IZ)V

    goto :goto_0

    :pswitch_2
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->j:Z

    if-eqz v0, :cond_3

    iput-boolean v3, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->j:Z

    :cond_3
    iget-boolean v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->j:Z

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-nez v0, :cond_4

    const v0, 0x7f0a00ee

    invoke-virtual {p0, v0, v3}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->a(IZ)V

    goto/16 :goto_0

    :cond_4
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_5

    const v0, 0x7f0a030f

    invoke-virtual {p0, v0, v3}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->a(IZ)V

    goto/16 :goto_0

    :cond_5
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->ad()Lcom/fimi/soul/drone/h/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/q;->aj()Z

    move-result v0

    if-eqz v0, :cond_6

    const v0, 0x7f0a00e2

    invoke-virtual {p0, v0, v3}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->a(IZ)V

    goto/16 :goto_0

    :cond_6
    const v0, 0x7f0a00d7

    invoke-virtual {p0, v0, v4}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->a(IZ)V

    goto/16 :goto_0

    :pswitch_3
    const v0, 0x7f0a0083

    invoke-virtual {p0, v0, v3}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->a(IZ)V

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public onHiddenChanged(Z)V
    .locals 2

    const/4 v1, 0x0

    invoke-super {p0, p1}, Lcom/fimi/soul/module/calibcompass/BaseCaliCompassFragment;->onHiddenChanged(Z)V

    if-nez p1, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->b:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->b:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->b:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, 0x7f0a030f

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->a(IZ)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    const v0, 0x7f0a00e3

    invoke-virtual {p0, v0, v1}, Lcom/fimi/soul/module/calibcompass/CaliCompassStatusFragment;->a(IZ)V

    goto :goto_0
.end method
