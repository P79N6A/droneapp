.class Lcom/google/android/gms/games/internal/a/b$1;
.super Lcom/google/android/gms/games/internal/a/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/internal/d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/b$1;->a(Lcom/google/android/gms/games/internal/d;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/d;)V
    .locals 6

    const/4 v3, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    move-object v1, p0

    move-object v4, v3

    move v5, v2

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/games/internal/d;->a(Lcom/google/android/gms/internal/ahl$b;ILjava/lang/String;[Ljava/lang/String;Z)V

    return-void
.end method
