.class public final Lcom/google/android/gms/games/internal/a/o;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/stats/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/games/internal/a/o$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Z)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/games/stats/c$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/games/internal/a/o$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/games/internal/a/o$1;-><init>(Lcom/google/android/gms/games/internal/a/o;Lcom/google/android/gms/common/api/g;Z)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method
