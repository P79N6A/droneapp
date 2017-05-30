.class public abstract Lcom/fimi/soul/module/droneui/DroneMap;
.super Lcom/google/android/gms/maps/SupportMapFragment;

# interfaces
.implements Lcom/fimi/soul/biz/manager/MyLocationManager$a;
.implements Lcom/fimi/soul/drone/d$b;
.implements Lcom/google/android/gms/maps/f;


# static fields
.field public static l:I = 0x0

.field public static final m:B = 0x50t

.field public static final n:B = 0x52t

.field public static final o:B = 0x43t

.field public static p:I = 0x0

.field public static final q:I = 0x3

.field public static r:I


# instance fields
.field private a:Z

.field private b:Lcom/google/android/gms/maps/model/g;

.field protected j:Lcom/google/android/gms/maps/c;

.field public k:Lcom/fimi/soul/drone/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    const/16 v0, 0x14

    sput v0, Lcom/fimi/soul/module/droneui/DroneMap;->l:I

    sput v1, Lcom/fimi/soul/module/droneui/DroneMap;->p:I

    sput v1, Lcom/fimi/soul/module/droneui/DroneMap;->r:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/maps/SupportMapFragment;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/droneui/DroneMap;->a:Z

    return-void
.end method

.method private a(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/DroneMap;->j:Lcom/google/android/gms/maps/c;

    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    const v2, 0x7f020278

    invoke-static {v2}, Lcom/google/android/gms/maps/model/b;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/a;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/g;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/DroneMap;->b:Lcom/google/android/gms/maps/model/g;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/DroneMap;->b:Lcom/google/android/gms/maps/model/g;

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    return-void
.end method


# virtual methods
.method public a(Landroid/location/Location;)V
    .locals 6

    const-wide/16 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/DroneMap;->j:Lcom/google/android/gms/maps/c;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/DroneMap;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p1}, Lcom/fimi/soul/drone/a;->a(Landroid/location/Location;)V

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/DroneMap;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/DroneMap;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->ao()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/DroneMap;->k:Lcom/fimi/soul/drone/a;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/fimi/soul/drone/a;->f(Z)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/DroneMap;->j:Lcom/google/android/gms/maps/c;

    const/high16 v2, 0x41900000    # 18.0f

    invoke-static {v0, v2}, Lcom/google/android/gms/maps/b;->a(Lcom/google/android/gms/maps/model/LatLng;F)Lcom/google/android/gms/maps/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/a;)V

    :cond_0
    iget-object v1, p0, Lcom/fimi/soul/module/droneui/DroneMap;->b:Lcom/google/android/gms/maps/model/g;

    if-nez v1, :cond_2

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneui/DroneMap;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v1, p0, Lcom/fimi/soul/module/droneui/DroneMap;->b:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/g;->k()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/DroneMap;->b:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v1}, Lcom/google/android/gms/maps/model/g;->a()V

    invoke-direct {p0, v0}, Lcom/fimi/soul/module/droneui/DroneMap;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    :cond_3
    iget-object v1, p0, Lcom/fimi/soul/module/droneui/DroneMap;->b:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    goto :goto_0
.end method

.method public b(Lcom/google/android/gms/maps/c;)V
    .locals 2

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/fimi/soul/module/droneui/DroneMap;->j:Lcom/google/android/gms/maps/c;

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/DroneMap;->k:Lcom/fimi/soul/drone/a;

    iget-object v1, p0, Lcom/fimi/soul/module/droneui/DroneMap;->j:Lcom/google/android/gms/maps/c;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/google/android/gms/maps/c;)V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/maps/SupportMapFragment;->onDestroy()V

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/maps/SupportMapFragment;->onAttach(Landroid/app/Activity;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    invoke-super {p0, p1, p2, p3}, Lcom/google/android/gms/maps/SupportMapFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/DroneMap;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/base/DroidPlannerApp;

    iget-object v0, v0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    iput-object v0, p0, Lcom/fimi/soul/module/droneui/DroneMap;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {p0}, Lcom/fimi/soul/module/droneui/DroneMap;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/MyLocationManager;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/MyLocationManager;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/fimi/soul/biz/manager/MyLocationManager;->a(Lcom/fimi/soul/biz/manager/MyLocationManager$a;)V

    invoke-virtual {p0, p0}, Lcom/fimi/soul/module/droneui/DroneMap;->a(Lcom/google/android/gms/maps/f;)V

    return-object v1
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 2

    sget-object v0, Lcom/fimi/soul/module/droneui/DroneMap$1;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->r()Lcom/fimi/soul/drone/h/y;

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->aj()Lcom/fimi/soul/drone/h/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/a/e;->e()B

    move-result v0

    sput v0, Lcom/fimi/soul/module/droneui/DroneMap;->l:I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/maps/SupportMapFragment;->onResume()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/maps/SupportMapFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/maps/SupportMapFragment;->onStart()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/DroneMap;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/maps/SupportMapFragment;->onStop()V

    iget-object v0, p0, Lcom/fimi/soul/module/droneui/DroneMap;->k:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->b(Lcom/fimi/soul/drone/d$b;)V

    return-void
.end method
