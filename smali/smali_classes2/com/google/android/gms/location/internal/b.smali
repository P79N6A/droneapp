.class public Lcom/google/android/gms/location/internal/b;
.super Lcom/google/android/gms/common/internal/w;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/w",
        "<",
        "Lcom/google/android/gms/location/internal/i;",
        ">;"
    }
.end annotation


# instance fields
.field protected final a:Lcom/google/android/gms/location/internal/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/location/internal/p",
            "<",
            "Lcom/google/android/gms/location/internal/i;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;Ljava/lang/String;Lcom/google/android/gms/common/internal/s;)V
    .locals 7

    const/16 v3, 0x17

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p6

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/w;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V

    new-instance v0, Lcom/google/android/gms/location/internal/b$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/location/internal/b$1;-><init>(Lcom/google/android/gms/location/internal/b;)V

    iput-object v0, p0, Lcom/google/android/gms/location/internal/b;->a:Lcom/google/android/gms/location/internal/p;

    iput-object p5, p0, Lcom/google/android/gms/location/internal/b;->e:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/location/internal/b;)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/location/internal/b;->F()V

    return-void
.end method


# virtual methods
.method protected a(Landroid/os/IBinder;)Lcom/google/android/gms/location/internal/i;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/location/internal/i$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/location/internal/i;

    move-result-object v0

    return-object v0
.end method

.method protected a()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.location.internal.GoogleLocationManagerService.START"

    return-object v0
.end method

.method protected synthetic b(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/internal/b;->a(Landroid/os/IBinder;)Lcom/google/android/gms/location/internal/i;

    move-result-object v0

    return-object v0
.end method

.method protected b()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    return-object v0
.end method

.method protected c()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "client_name"

    iget-object v2, p0, Lcom/google/android/gms/location/internal/b;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
