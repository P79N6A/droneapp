.class Lcom/fimi/soul/module/droneFragment/f$14;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/droneFragment/f;-><init>(Landroid/view/View;Lcom/fimi/soul/drone/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/droneFragment/f;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/droneFragment/f;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/f$14;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 6

    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$14;->a:Lcom/fimi/soul/module/droneFragment/f;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$14;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->n(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f$14;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/f;->l(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;->getMax()I

    move-result v2

    iget-object v3, p0, Lcom/fimi/soul/module/droneFragment/f$14;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v3}, Lcom/fimi/soul/module/droneFragment/f;->m(Lcom/fimi/soul/module/droneFragment/f;)I

    move-result v3

    iget-object v4, p0, Lcom/fimi/soul/module/droneFragment/f$14;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v4}, Lcom/fimi/soul/module/droneFragment/f;->l(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/myhorizontalseebar/SeekBar;

    move-result-object v4

    const-string v5, "m"

    invoke-static/range {v0 .. v5}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/module/droneFragment/f;Lcom/fimi/soul/view/MyEditView;IILcom/fimi/soul/view/myhorizontalseebar/SeekBar;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$14;->a:Lcom/fimi/soul/module/droneFragment/f;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/f$14;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v1}, Lcom/fimi/soul/module/droneFragment/f;->n(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/view/MyEditView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/view/MyEditView;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->a(Lcom/fimi/soul/module/droneFragment/f;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0
.end method
