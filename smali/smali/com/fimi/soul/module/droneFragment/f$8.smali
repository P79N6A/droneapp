.class Lcom/fimi/soul/module/droneFragment/f$8;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


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

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/f$8;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$8;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/f;->b(Lcom/fimi/soul/module/droneFragment/f;)Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->j()Lcom/fimi/soul/entity/FlyActionBean;

    move-result-object v0

    if-eqz v0, :cond_0

    packed-switch p2, :pswitch_data_0

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$8;->a:Lcom/fimi/soul/module/droneFragment/f;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneFragment/f;->f()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/f$8;->a:Lcom/fimi/soul/module/droneFragment/f;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneFragment/f;->a(Z)V

    :cond_0
    return-void

    :pswitch_0
    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/FlyActionBean;->setPara1(I)V

    goto :goto_0

    :pswitch_1
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/FlyActionBean;->setPara1(I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x7f0f02b1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
