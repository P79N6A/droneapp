.class abstract Lcom/google/android/gms/internal/anx$e;
.super Lcom/google/android/gms/internal/anu;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/anx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/anu",
        "<",
        "Lcom/google/android/gms/safetynet/c$b;",
        ">;"
    }
.end annotation


# instance fields
.field protected e:Lcom/google/android/gms/internal/anv;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/g;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/anu;-><init>(Lcom/google/android/gms/common/api/g;)V

    new-instance v0, Lcom/google/android/gms/internal/anx$e$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/anx$e$1;-><init>(Lcom/google/android/gms/internal/anx$e;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/anx$e;->e:Lcom/google/android/gms/internal/anv;

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/safetynet/c$b;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/anx$g;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/anx$g;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/safetynet/SafeBrowsingData;)V

    return-object v0
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/anx$e;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/safetynet/c$b;

    move-result-object v0

    return-object v0
.end method
