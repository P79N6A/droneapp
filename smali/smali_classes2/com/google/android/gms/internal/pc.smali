.class public final Lcom/google/android/gms/internal/pc;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ok;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/pc$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/os;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/os;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/pc;->a:Lcom/google/android/gms/internal/os;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/nr;",
            "Lcom/google/android/gms/internal/po",
            "<TT;>;)",
            "Lcom/google/android/gms/internal/oj",
            "<TT;>;"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/internal/po;->b()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/po;->a()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/util/Collection;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/or;->a(Ljava/lang/reflect/Type;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/po;->a(Ljava/lang/reflect/Type;)Lcom/google/android/gms/internal/po;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/nr;->a(Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/pc;->a:Lcom/google/android/gms/internal/os;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/os;->a(Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/ox;

    move-result-object v3

    new-instance v0, Lcom/google/android/gms/internal/pc$a;

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/google/android/gms/internal/pc$a;-><init>(Lcom/google/android/gms/internal/nr;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/oj;Lcom/google/android/gms/internal/ox;)V

    goto :goto_0
.end method
