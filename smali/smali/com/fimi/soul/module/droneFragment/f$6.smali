.class Lcom/fimi/soul/module/droneFragment/f$6;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/droneFragment/f;->m()V
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

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->j()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v1

    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v2}, Lcom/fimi/soul/module/droneFragment/f;->x(Lcom/fimi/soul/module/droneFragment/f;)Landroid/widget/Button;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    if-nez p3, :cond_2

    add-int/lit8 p3, p3, 0x1

    :cond_0
    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1, p3}, Lcom/fimi/soul/entity/FlyActionBean;->setYaw_mode(I)V

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->y(Lcom/fimi/soul/module/droneFragment/f;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$6;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->x(Lcom/fimi/soul/module/droneFragment/f;)Landroid/widget/Button;

    move-result-object v0

    const v1, 0x7f02006a

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    return-void

    :cond_2
    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    add-int/lit8 p3, p3, -0x1

    goto :goto_0
.end method
