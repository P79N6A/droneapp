.class Lcom/google/android/gms/maps/c$18;
.super Lcom/google/android/gms/maps/a/aq$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/c$r;

.field final synthetic b:Lcom/google/android/gms/maps/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$r;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/c$18;->b:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/google/android/gms/maps/c$18;->a:Lcom/google/android/gms/maps/c$r;

    invoke-direct {p0}, Lcom/google/android/gms/maps/a/aq$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/a/g;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/c$18;->a:Lcom/google/android/gms/maps/c$r;

    new-instance v1, Lcom/google/android/gms/maps/model/g;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/model/g;-><init>(Lcom/google/android/gms/maps/model/a/g;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/c$r;->g(Lcom/google/android/gms/maps/model/g;)V

    return-void
.end method

.method public b(Lcom/google/android/gms/maps/model/a/g;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/c$18;->a:Lcom/google/android/gms/maps/c$r;

    new-instance v1, Lcom/google/android/gms/maps/model/g;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/model/g;-><init>(Lcom/google/android/gms/maps/model/a/g;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/c$r;->f(Lcom/google/android/gms/maps/model/g;)V

    return-void
.end method

.method public c(Lcom/google/android/gms/maps/model/a/g;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/c$18;->a:Lcom/google/android/gms/maps/c$r;

    new-instance v1, Lcom/google/android/gms/maps/model/g;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/model/g;-><init>(Lcom/google/android/gms/maps/model/a/g;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/c$r;->e(Lcom/google/android/gms/maps/model/g;)V

    return-void
.end method
