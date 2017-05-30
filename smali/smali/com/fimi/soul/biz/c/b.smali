.class public Lcom/fimi/soul/biz/c/b;
.super Ljava/lang/Object;


# instance fields
.field public volatile a:Z

.field private b:Lcom/google/android/gms/maps/c;

.field private c:Landroid/content/Context;

.field private d:Lcom/fimi/soul/drone/a;

.field private e:Lcom/google/android/gms/maps/model/g;

.field private f:Lcom/google/android/gms/maps/model/i;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/maps/c;Landroid/content/Context;Lcom/fimi/soul/drone/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lcom/fimi/soul/biz/c/b;->d:Lcom/fimi/soul/drone/a;

    iput-object p1, p0, Lcom/fimi/soul/biz/c/b;->b:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/fimi/soul/biz/c/b;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    new-instance v0, Lcom/google/android/gms/maps/model/LatLng;

    iget-object v1, p0, Lcom/fimi/soul/biz/c/b;->d:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->u()Lcom/fimi/soul/drone/h/ag;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/ag;->e()D

    move-result-wide v2

    iget-object v1, p0, Lcom/fimi/soul/biz/c/b;->d:Lcom/fimi/soul/drone/a;

    invoke-virtual {v1}, Lcom/fimi/soul/drone/a;->u()Lcom/fimi/soul/drone/h/ag;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/drone/h/ag;->d()D

    move-result-wide v4

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/biz/c/b;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/biz/c/b;->e:Lcom/google/android/gms/maps/model/g;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/c/b;->b:Lcom/google/android/gms/maps/c;

    new-instance v1, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v1}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    const v2, 0x7f0202be

    invoke-static {v2}, Lcom/fimi/soul/biz/c/j;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/a;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/g;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/c/b;->e:Lcom/google/android/gms/maps/model/g;

    iget-object v0, p0, Lcom/fimi/soul/biz/c/b;->e:Lcom/google/android/gms/maps/model/g;

    const/high16 v1, 0x3f000000    # 0.5f

    const v2, 0x3f6147ae    # 0.88f

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    iget-object v0, p0, Lcom/fimi/soul/biz/c/b;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/biz/c/b;->e:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/c/b;->e:Lcom/google/android/gms/maps/model/g;

    const v1, 0x7f0202c1

    invoke-static {v1}, Lcom/fimi/soul/biz/c/j;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/a;)V

    :cond_0
    return-void
.end method

.method public b(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 5

    invoke-static {}, Lcom/fimi/soul/biz/c/d;->k()Lcom/fimi/soul/biz/c/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/c/d;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_0

    iget-object v1, p0, Lcom/fimi/soul/biz/c/b;->f:Lcom/google/android/gms/maps/model/i;

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/fimi/soul/biz/c/b;->b:Lcom/google/android/gms/maps/c;

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/fimi/soul/biz/c/b;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0e007a

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-static {v0, v2, v3}, Lcom/fimi/soul/biz/c/i;->a(Ljava/util/List;II)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    const/high16 v2, 0x42480000    # 50.0f

    invoke-virtual {v0, v2}, Lcom/google/android/gms/maps/model/PolylineOptions;->b(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/PolylineOptions;)Lcom/google/android/gms/maps/model/i;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/c/b;->f:Lcom/google/android/gms/maps/model/i;

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lcom/fimi/soul/biz/c/b;->f:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/maps/model/i;->a(Ljava/util/List;)V

    goto :goto_0
.end method

.method public c()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/fimi/soul/biz/c/b;->e:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/c/b;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->a()V

    iput-object v1, p0, Lcom/fimi/soul/biz/c/b;->e:Lcom/google/android/gms/maps/model/g;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/c/b;->f:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/c/b;->f:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    iput-object v1, p0, Lcom/fimi/soul/biz/c/b;->f:Lcom/google/android/gms/maps/model/i;

    :cond_1
    return-void
.end method

.method public d()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/biz/c/b;->a:Z

    iget-object v0, p0, Lcom/fimi/soul/biz/c/b;->e:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/c/b;->e:Lcom/google/android/gms/maps/model/g;

    iget-object v1, p0, Lcom/fimi/soul/biz/c/b;->d:Lcom/fimi/soul/drone/a;

    iget-object v1, v1, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    const v2, 0x7f0a014b

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/c/b;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->h()V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/biz/c/b;->a:Z

    iget-object v0, p0, Lcom/fimi/soul/biz/c/b;->e:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/c/b;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->i()V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/biz/c/b;->a:Z

    iget-object v0, p0, Lcom/fimi/soul/biz/c/b;->e:Lcom/google/android/gms/maps/model/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/c/b;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->i()V

    :cond_0
    return-void
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/c/b;->e:Lcom/google/android/gms/maps/model/g;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
