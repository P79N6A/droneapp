.class public Lcom/google/android/gms/config/internal/CustomVariable;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/config/internal/f;


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/config/internal/f;

    invoke-direct {v0}, Lcom/google/android/gms/config/internal/f;-><init>()V

    sput-object v0, Lcom/google/android/gms/config/internal/CustomVariable;->CREATOR:Lcom/google/android/gms/config/internal/f;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/config/internal/CustomVariable;->a:I

    iput-object p2, p0, Lcom/google/android/gms/config/internal/CustomVariable;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/config/internal/CustomVariable;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/config/internal/CustomVariable;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/config/internal/CustomVariable;->a:I

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/config/internal/CustomVariable;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/config/internal/CustomVariable;->c:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/config/internal/f;->a(Lcom/google/android/gms/config/internal/CustomVariable;Landroid/os/Parcel;I)V

    return-void
.end method