.class abstract Lcom/google/android/gms/games/internal/a/q$h;
.super Lcom/google/android/gms/games/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/a/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/games/c$a",
        "<",
        "Lcom/google/android/gms/games/video/f$j;",
        ">;"
    }
.end annotation


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/video/f$j;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/a/q$h$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/internal/a/q$h$1;-><init>(Lcom/google/android/gms/games/internal/a/q$h;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/q$h;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/video/f$j;

    move-result-object v0

    return-object v0
.end method
