.class public Lcom/google/android/gms/vision/text/internal/client/TextRecognizerOptions;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/vision/text/internal/client/h;


# instance fields
.field final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/vision/text/internal/client/h;

    invoke-direct {v0}, Lcom/google/android/gms/vision/text/internal/client/h;-><init>()V

    sput-object v0, Lcom/google/android/gms/vision/text/internal/client/TextRecognizerOptions;->CREATOR:Lcom/google/android/gms/vision/text/internal/client/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/vision/text/internal/client/TextRecognizerOptions;->a:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/vision/text/internal/client/TextRecognizerOptions;->a:I

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/vision/text/internal/client/h;->a(Lcom/google/android/gms/vision/text/internal/client/TextRecognizerOptions;Landroid/os/Parcel;I)V

    return-void
.end method
