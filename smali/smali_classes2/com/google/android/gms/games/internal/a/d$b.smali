.class abstract Lcom/google/android/gms/games/internal/a/d$b;
.super Lcom/google/android/gms/games/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/games/c$a",
        "<",
        "Lcom/google/android/gms/games/e$b;",
        ">;"
    }
.end annotation


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/e$b;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/internal/a/d$b$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/games/internal/a/d$b$1;-><init>(Lcom/google/android/gms/games/internal/a/d$b;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/a/d$b;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/e$b;

    move-result-object v0

    return-object v0
.end method