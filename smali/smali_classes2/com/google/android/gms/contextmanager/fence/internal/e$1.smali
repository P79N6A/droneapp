.class final Lcom/google/android/gms/contextmanager/fence/internal/e$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/sx$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/contextmanager/fence/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/sx$a",
        "<",
        "Lcom/google/android/gms/awareness/fence/i;",
        "Lcom/google/android/gms/contextmanager/fence/internal/e;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Landroid/os/Looper;)Landroid/os/IInterface;
    .locals 1

    check-cast p1, Lcom/google/android/gms/awareness/fence/i;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/contextmanager/fence/internal/e$1;->a(Lcom/google/android/gms/awareness/fence/i;Landroid/os/Looper;)Lcom/google/android/gms/contextmanager/fence/internal/e;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/awareness/fence/i;Landroid/os/Looper;)Lcom/google/android/gms/contextmanager/fence/internal/e;
    .locals 2

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/google/android/gms/contextmanager/fence/internal/e;-><init>(Lcom/google/android/gms/awareness/fence/i;Landroid/os/Looper;Lcom/google/android/gms/contextmanager/fence/internal/e$1;)V

    return-object v0
.end method
