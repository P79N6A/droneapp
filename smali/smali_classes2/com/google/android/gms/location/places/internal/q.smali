.class public Lcom/google/android/gms/location/places/internal/q;
.super Lcom/google/android/gms/location/places/internal/t;

# interfaces
.implements Lcom/google/android/gms/location/places/i;


# instance fields
.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;I)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/location/places/internal/t;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    const-string v0, "photo_fife_url"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/location/places/internal/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/location/places/internal/q;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/location/places/PlacePhotoResult;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/q;->c()I

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/q;->d()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/location/places/internal/q;->a(Lcom/google/android/gms/common/api/g;II)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;II)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "II)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/location/places/PlacePhotoResult;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/q;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/location/places/i;

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/location/places/i;->a(Lcom/google/android/gms/common/api/g;II)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/q;->f()Lcom/google/android/gms/location/places/i;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 2

    const-string v0, "photo_max_width"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/q;->a(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 2

    const-string v0, "photo_max_height"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/q;->a(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public e()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "photo_attributions"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/location/places/internal/q;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Lcom/google/android/gms/location/places/i;
    .locals 6

    new-instance v0, Lcom/google/android/gms/location/places/internal/p;

    iget-object v1, p0, Lcom/google/android/gms/location/places/internal/q;->c:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/q;->c()I

    move-result v2

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/q;->d()I

    move-result v3

    invoke-virtual {p0}, Lcom/google/android/gms/location/places/internal/q;->e()Ljava/lang/CharSequence;

    move-result-object v4

    iget v5, p0, Lcom/google/android/gms/location/places/internal/q;->d_:I

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/location/places/internal/p;-><init>(Ljava/lang/String;IILjava/lang/CharSequence;I)V

    return-object v0
.end method
