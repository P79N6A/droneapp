.class Lcom/google/android/gms/measurement/internal/f$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/measurement/internal/f;->a(Landroid/content/Intent;II)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/measurement/internal/aj;

.field final synthetic b:I

.field final synthetic c:Lcom/google/android/gms/measurement/internal/ab;

.field final synthetic d:Lcom/google/android/gms/measurement/internal/f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/f;Lcom/google/android/gms/measurement/internal/aj;ILcom/google/android/gms/measurement/internal/ab;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/f$1;->d:Lcom/google/android/gms/measurement/internal/f;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/f$1;->a:Lcom/google/android/gms/measurement/internal/aj;

    iput p3, p0, Lcom/google/android/gms/measurement/internal/f$1;->b:I

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/f$1;->c:Lcom/google/android/gms/measurement/internal/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/f$1;->a:Lcom/google/android/gms/measurement/internal/aj;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->K()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/f$1;->a:Lcom/google/android/gms/measurement/internal/aj;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/aj;->I()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/f$1;->d:Lcom/google/android/gms/measurement/internal/f;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/f;->b(Lcom/google/android/gms/measurement/internal/f;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/measurement/internal/f$1$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/measurement/internal/f$1$1;-><init>(Lcom/google/android/gms/measurement/internal/f$1;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
