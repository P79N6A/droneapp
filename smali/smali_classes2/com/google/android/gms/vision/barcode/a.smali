.class public final Lcom/google/android/gms/vision/barcode/a;
.super Lcom/google/android/gms/vision/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/vision/barcode/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/vision/b",
        "<",
        "Lcom/google/android/gms/vision/barcode/Barcode;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/vision/barcode/internal/client/b;


# direct methods
.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/vision/b;-><init>()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Default constructor called"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private constructor <init>(Lcom/google/android/gms/vision/barcode/internal/client/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/vision/b;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/vision/barcode/a;->a:Lcom/google/android/gms/vision/barcode/internal/client/b;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/vision/barcode/internal/client/b;Lcom/google/android/gms/vision/barcode/a$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/vision/barcode/a;-><init>(Lcom/google/android/gms/vision/barcode/internal/client/b;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/vision/d;)Landroid/util/SparseArray;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/d;",
            ")",
            "Landroid/util/SparseArray",
            "<",
            "Lcom/google/android/gms/vision/barcode/Barcode;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No frame supplied."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;->a(Lcom/google/android/gms/vision/d;)Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/vision/d;->c()Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/vision/barcode/a;->a:Lcom/google/android/gms/vision/barcode/internal/client/b;

    invoke-virtual {p1}, Lcom/google/android/gms/vision/d;->c()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/vision/barcode/internal/client/b;->a(Landroid/graphics/Bitmap;Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;)[Lcom/google/android/gms/vision/barcode/Barcode;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Internal barcode detector error; check logcat output."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/vision/d;->b()Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/vision/barcode/a;->a:Lcom/google/android/gms/vision/barcode/internal/client/b;

    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/vision/barcode/internal/client/b;->a(Ljava/nio/ByteBuffer;Lcom/google/android/gms/vision/internal/client/FrameMetadataParcel;)[Lcom/google/android/gms/vision/barcode/Barcode;

    move-result-object v0

    :cond_2
    new-instance v2, Landroid/util/SparseArray;

    array-length v1, v0

    invoke-direct {v2, v1}, Landroid/util/SparseArray;-><init>(I)V

    array-length v3, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v3, :cond_3

    aget-object v4, v0, v1

    iget-object v5, v4, Lcom/google/android/gms/vision/barcode/Barcode;->C:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v5

    invoke-virtual {v2, v5, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object v2
.end method

.method public a()V
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/vision/b;->a()V

    iget-object v0, p0, Lcom/google/android/gms/vision/barcode/a;->a:Lcom/google/android/gms/vision/barcode/internal/client/b;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/barcode/internal/client/b;->c()V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/vision/barcode/a;->a:Lcom/google/android/gms/vision/barcode/internal/client/b;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/barcode/internal/client/b;->b()Z

    move-result v0

    return v0
.end method
