.class final Lcom/google/android/gms/internal/pn$16;
.super Lcom/google/android/gms/internal/oj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/pn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/oj",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/oj;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/pp;)Ljava/lang/Boolean;
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->f()Lcom/google/android/gms/internal/pq;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/pq;->i:Lcom/google/android/gms/internal/pq;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->j()V

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->f()Lcom/google/android/gms/internal/pq;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/pq;->f:Lcom/google/android/gms/internal/pq;

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->i()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/ps;Ljava/lang/Boolean;)V
    .locals 1

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ps;->f()Lcom/google/android/gms/internal/ps;

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ps;->a(Z)Lcom/google/android/gms/internal/ps;

    goto :goto_0
.end method

.method public bridge synthetic a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/pn$16;->a(Lcom/google/android/gms/internal/ps;Ljava/lang/Boolean;)V

    return-void
.end method

.method public synthetic b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pn$16;->a(Lcom/google/android/gms/internal/pp;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
