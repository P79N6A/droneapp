.class Lcom/google/android/gms/internal/ans$4;
.super Lcom/google/android/gms/internal/ans$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ans;->a(Lcom/google/android/gms/common/api/g;Ljava/util/Collection;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Collection;

.field final synthetic b:Lcom/google/android/gms/internal/ans;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ans;Lcom/google/android/gms/common/api/g;Ljava/util/Collection;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ans$4;->b:Lcom/google/android/gms/internal/ans;

    iput-object p3, p0, Lcom/google/android/gms/internal/ans$4;->a:Ljava/util/Collection;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/google/android/gms/internal/ans$a;-><init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/ans$1;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/plus/internal/e;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ans$4;->a(Lcom/google/android/gms/plus/internal/e;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/plus/internal/e;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ans$4;->a:Ljava/util/Collection;

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/plus/internal/e;->a(Lcom/google/android/gms/internal/ahl$b;Ljava/util/Collection;)V

    return-void
.end method
