.class final Lcom/google/android/gms/games/internal/d$bc;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/c$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "bc"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/api/Status;

.field private final b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/Status;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/d$bc;->a:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/games/internal/d$bc;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/d$bc;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
