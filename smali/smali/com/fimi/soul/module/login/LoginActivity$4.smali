.class Lcom/fimi/soul/module/login/LoginActivity$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/login/LoginActivity;->onCreate(Landroid/os/Bundle;)V
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

    iput-object p1, p0, Lcom/fimi/soul/module/login/LoginActivity$4;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    const/4 v3, 0x1

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$4;->a:Lcom/fimi/soul/module/login/LoginActivity;

    const v1, 0x7f0f015e

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/login/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    iget-object v1, p0, Lcom/fimi/soul/module/login/LoginActivity$4;->a:Lcom/fimi/soul/module/login/LoginActivity;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$4;->a:Lcom/fimi/soul/module/login/LoginActivity;

    const v2, 0x7f0f0475

    invoke-virtual {v0, v2}, Lcom/fimi/soul/module/login/LoginActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/view/BreathLeapView;

    invoke-static {v1, v0}, Lcom/fimi/soul/module/login/LoginActivity;->a(Lcom/fimi/soul/module/login/LoginActivity;Lcom/fimi/soul/view/BreathLeapView;)Lcom/fimi/soul/view/BreathLeapView;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$4;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->l(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f0202fe

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$4;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-virtual {v0}, Lcom/fimi/soul/module/login/LoginActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "login"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$4;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-virtual {v0}, Lcom/fimi/soul/module/login/LoginActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0202f8

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/login/LoginActivity$4;->a:Lcom/fimi/soul/module/login/LoginActivity;

    move-object v0, v1

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    invoke-static {v2, v0}, Lcom/fimi/soul/module/login/LoginActivity;->a(Lcom/fimi/soul/module/login/LoginActivity;Landroid/graphics/drawable/AnimationDrawable;)Landroid/graphics/drawable/AnimationDrawable;

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$4;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->m(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/graphics/drawable/AnimationDrawable;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/AnimationDrawable;->setOneShot(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/login/LoginActivity$4;->a:Lcom/fimi/soul/module/login/LoginActivity;

    invoke-static {v0}, Lcom/fimi/soul/module/login/LoginActivity;->n(Lcom/fimi/soul/module/login/LoginActivity;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method
