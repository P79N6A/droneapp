.class public Lcom/google/android/gms/internal/q;
.super Lcom/google/android/gms/internal/aqg;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/aqg;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a(Lcom/google/android/gms/internal/apr;[Lcom/google/android/gms/internal/ea;)Lcom/google/android/gms/internal/ea;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/apr;",
            "[",
            "Lcom/google/android/gms/internal/ea",
            "<*>;)",
            "Lcom/google/android/gms/internal/ea",
            "<*>;"
        }
    .end annotation

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p2, :cond_2

    move v0, v2

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    array-length v0, p2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    move v0, v2

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    aget-object v1, p2, v3

    aget-object v4, p2, v2

    instance-of v0, v1, Lcom/google/android/gms/internal/ej;

    if-nez v0, :cond_0

    invoke-static {v1}, Lcom/google/android/gms/internal/ek;->c(Lcom/google/android/gms/internal/ea;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_0
    move v0, v2

    :goto_2
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    invoke-static {v1}, Lcom/google/android/gms/internal/ek;->d(Lcom/google/android/gms/internal/ea;)Z

    move-result v0

    if-nez v0, :cond_5

    move v0, v2

    :goto_3
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    invoke-static {v4}, Lcom/google/android/gms/internal/ek;->d(Lcom/google/android/gms/internal/ea;)Z

    move-result v0

    if-nez v0, :cond_6

    :goto_4
    invoke-static {v2}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    invoke-static {v4}, Lcom/google/android/gms/internal/aqf;->d(Lcom/google/android/gms/internal/ea;)Ljava/lang/String;

    move-result-object v2

    instance-of v0, v1, Lcom/google/android/gms/internal/ef;

    if-eqz v0, :cond_9

    move-object v0, v1

    check-cast v0, Lcom/google/android/gms/internal/ef;

    const-string v3, "length"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    new-instance v1, Lcom/google/android/gms/internal/ec;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ef;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ec;-><init>(Ljava/lang/Double;)V

    move-object v0, v1

    :cond_1
    :goto_5
    return-object v0

    :cond_2
    move v0, v3

    goto :goto_0

    :cond_3
    move v0, v3

    goto :goto_1

    :cond_4
    move v0, v3

    goto :goto_2

    :cond_5
    move v0, v3

    goto :goto_3

    :cond_6
    move v2, v3

    goto :goto_4

    :cond_7
    invoke-static {v4}, Lcom/google/android/gms/internal/aqf;->b(Lcom/google/android/gms/internal/ea;)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v6

    cmpl-double v3, v4, v6

    if-nez v3, :cond_8

    double-to-int v3, v4

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    double-to-int v3, v4

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ef;->b(I)Lcom/google/android/gms/internal/ea;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/internal/ee;->e:Lcom/google/android/gms/internal/ee;

    if-ne v0, v3, :cond_1

    :cond_8
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ea;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ea;

    move-result-object v0

    goto :goto_5

    :cond_9
    instance-of v0, v1, Lcom/google/android/gms/internal/ej;

    if-eqz v0, :cond_8

    check-cast v1, Lcom/google/android/gms/internal/ej;

    const-string v0, "length"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    new-instance v2, Lcom/google/android/gms/internal/ec;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ej;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    int-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ec;-><init>(Ljava/lang/Double;)V

    move-object v0, v2

    goto :goto_5

    :cond_a
    invoke-static {v4}, Lcom/google/android/gms/internal/aqf;->b(Lcom/google/android/gms/internal/ea;)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v6

    cmpl-double v0, v4, v6

    if-nez v0, :cond_b

    double-to-int v0, v4

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    double-to-int v0, v4

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ej;->a(I)Lcom/google/android/gms/internal/ea;

    move-result-object v0

    goto :goto_5

    :cond_b
    sget-object v0, Lcom/google/android/gms/internal/ee;->e:Lcom/google/android/gms/internal/ee;

    goto :goto_5
.end method
