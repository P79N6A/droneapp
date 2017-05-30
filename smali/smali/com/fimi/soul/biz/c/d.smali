.class public Lcom/fimi/soul/biz/c/d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/biz/c/d$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:Lcom/google/android/gms/maps/model/c;

.field private volatile e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private volatile f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/google/android/gms/maps/model/i;

.field private volatile h:Lcom/fimi/soul/entity/FlyActionBean;

.field private volatile i:I

.field private j:Lcom/google/android/gms/maps/model/g;

.field private k:Z

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/g;",
            ">;"
        }
    .end annotation
.end field

.field private volatile m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/FlyActionBean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    iput v0, p0, Lcom/fimi/soul/biz/c/d;->a:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/fimi/soul/biz/c/d;->b:I

    const/4 v0, 0x4

    iput v0, p0, Lcom/fimi/soul/biz/c/d;->c:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/c/d;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/c/d;->f:Ljava/util/List;

    const/16 v0, 0x1e

    iput v0, p0, Lcom/fimi/soul/biz/c/d;->i:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/c/d;->l:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/c/d;->m:Ljava/util/List;

    return-void
.end method

.method public static k()Lcom/fimi/soul/biz/c/d;
    .locals 1

    sget-object v0, Lcom/fimi/soul/biz/c/d$a;->a:Lcom/fimi/soul/biz/c/d;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/maps/model/c;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/c/d;->d:Lcom/google/android/gms/maps/model/c;

    return-object v0
.end method

.method public a(I)V
    .locals 1

    iget v0, p0, Lcom/fimi/soul/biz/c/d;->a:I

    if-ge p1, v0, :cond_0

    iget p1, p0, Lcom/fimi/soul/biz/c/d;->a:I

    :cond_0
    iput p1, p0, Lcom/fimi/soul/biz/c/d;->i:I

    return-void
.end method

.method public a(Lcom/fimi/soul/entity/FlyActionBean;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/c/d;->h:Lcom/fimi/soul/entity/FlyActionBean;

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/model/c;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/c/d;->d:Lcom/google/android/gms/maps/model/c;

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/model/g;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/c/d;->j:Lcom/google/android/gms/maps/model/g;

    return-void
.end method

.method public a(Lcom/google/android/gms/maps/model/i;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/c/d;->g:Lcom/google/android/gms/maps/model/i;

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/FlyActionBean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/fimi/soul/biz/c/d;->m:Ljava/util/List;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/fimi/soul/biz/c/d;->k:Z

    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/fimi/soul/biz/c/d;->e:Ljava/util/List;

    return-object v0
.end method

.method public b(I)V
    .locals 1

    iget v0, p0, Lcom/fimi/soul/biz/c/d;->c:I

    if-ge p1, v0, :cond_0

    iget p1, p0, Lcom/fimi/soul/biz/c/d;->c:I

    :cond_0
    iput p1, p0, Lcom/fimi/soul/biz/c/d;->b:I

    return-void
.end method

.method public c()Lcom/google/android/gms/maps/model/g;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/c/d;->j:Lcom/google/android/gms/maps/model/g;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/biz/c/d;->k:Z

    return v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/fimi/soul/biz/c/d;->l:Ljava/util/List;

    return-object v0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/FlyActionBean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/fimi/soul/biz/c/d;->m:Ljava/util/List;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/biz/c/d;->i:I

    return v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/fimi/soul/biz/c/d;->f:Ljava/util/List;

    return-object v0
.end method

.method public i()Lcom/google/android/gms/maps/model/i;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/c/d;->g:Lcom/google/android/gms/maps/model/i;

    return-object v0
.end method

.method public j()Lcom/fimi/soul/entity/FlyActionBean;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/c/d;->h:Lcom/fimi/soul/entity/FlyActionBean;

    return-object v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lcom/fimi/soul/biz/c/d;->b:I

    return v0
.end method

.method public m()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/biz/c/d;->l:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/biz/c/d;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/c/d;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/biz/c/d;->g:Lcom/google/android/gms/maps/model/i;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/biz/c/d;->g:Lcom/google/android/gms/maps/model/i;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/i;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/biz/c/d;->g:Lcom/google/android/gms/maps/model/i;

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/biz/c/d;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/c/d;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/fimi/soul/biz/c/d;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
