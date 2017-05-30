.class Lcom/fimi/soul/module/dronemanage/FlightMapFragment$2;
.super Lcom/fimi/soul/module/droneFragment/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/dronemanage/FlightMapFragment;Landroid/view/View;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$2;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    invoke-direct {p0, p2, p3, p4}, Lcom/fimi/soul/module/droneFragment/e;-><init>(Landroid/view/View;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method protected a(Landroid/view/View;Lcom/google/android/gms/maps/model/g;)V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$2;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    invoke-virtual {v0}, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/c/h;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/c/h;

    move-result-object v1

    const/4 v0, 0x0

    invoke-virtual {p2}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/fimi/soul/entity/FlyActionBean;

    if-eqz v2, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/maps/model/g;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/FlyActionBean;

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/fimi/soul/entity/FlyActionBean;->getModelType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Lcom/fimi/soul/biz/c/h;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$2;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    iget-object v0, v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->u:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/fimi/soul/biz/c/h;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$2;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    iget-object v0, v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->r:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x3

    invoke-virtual {v1, v0}, Lcom/fimi/soul/biz/c/h;->a(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment$2;->a:Lcom/fimi/soul/module/dronemanage/FlightMapFragment;

    iget-object v0, v0, Lcom/fimi/soul/module/dronemanage/FlightMapFragment;->k:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->w:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
