.class public final Lcom/google/android/gms/internal/fe;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/fe$a;
    }
.end annotation


# direct methods
.method private static a(Ljava/lang/String;[Lcom/google/android/gms/internal/ff$a$a;)I
    .locals 7

    const/16 v2, 0xe

    array-length v3, p1

    const/4 v0, 0x0

    move v1, v0

    move v0, v2

    :goto_0
    if-ge v1, v3, :cond_4

    aget-object v4, p1, v1

    if-ne v0, v2, :cond_3

    iget v5, v4, Lcom/google/android/gms/internal/ff$a$a;->a:I

    const/16 v6, 0x9

    if-eq v5, v6, :cond_0

    iget v5, v4, Lcom/google/android/gms/internal/ff$a$a;->a:I

    const/4 v6, 0x2

    if-eq v5, v6, :cond_0

    iget v5, v4, Lcom/google/android/gms/internal/ff$a$a;->a:I

    const/4 v6, 0x6

    if-ne v5, v6, :cond_2

    :cond_0
    iget v0, v4, Lcom/google/android/gms/internal/ff$a$a;->a:I

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget v5, v4, Lcom/google/android/gms/internal/ff$a$a;->a:I

    if-eq v5, v2, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    iget v1, v4, Lcom/google/android/gms/internal/ff$a$a;->a:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x30

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected TypedValue type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " for key "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget v5, v4, Lcom/google/android/gms/internal/ff$a$a;->a:I

    if-eq v5, v0, :cond_1

    new-instance v1, Ljava/lang/IllegalArgumentException;

    iget v2, v4, Lcom/google/android/gms/internal/ff$a$a;->a:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x7e

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "The ArrayList elements should all be the same type, but ArrayList with key "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " contains items of type "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " and "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    return v0
.end method

.method static a(Ljava/util/List;Lcom/google/android/gms/wearable/Asset;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/wearable/Asset;",
            ">;",
            "Lcom/google/android/gms/wearable/Asset;",
            ")I"
        }
    .end annotation

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public static a(Lcom/google/android/gms/wearable/k;)Lcom/google/android/gms/internal/fe$a;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ff;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ff;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0, v1}, Lcom/google/android/gms/internal/fe;->a(Lcom/google/android/gms/wearable/k;Ljava/util/List;)[Lcom/google/android/gms/internal/ff$a;

    move-result-object v2

    iput-object v2, v0, Lcom/google/android/gms/internal/ff;->a:[Lcom/google/android/gms/internal/ff$a;

    new-instance v2, Lcom/google/android/gms/internal/fe$a;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/fe$a;-><init>(Lcom/google/android/gms/internal/ff;Ljava/util/List;)V

    return-object v2
.end method

.method private static a(Ljava/util/List;Ljava/lang/Object;)Lcom/google/android/gms/internal/ff$a$a;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/wearable/Asset;",
            ">;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/android/gms/internal/ff$a$a;"
        }
    .end annotation

    const/16 v12, 0x9

    const/4 v11, 0x6

    const/4 v10, 0x2

    const/4 v0, 0x0

    const/16 v5, 0xe

    new-instance v3, Lcom/google/android/gms/internal/ff$a$a;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ff$a$a;-><init>()V

    if-nez p1, :cond_0

    iput v5, v3, Lcom/google/android/gms/internal/ff$a$a;->a:I

    move-object v0, v3

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ff$a$a$a;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ff$a$a$a;-><init>()V

    iput-object v1, v3, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_1

    iput v10, v3, Lcom/google/android/gms/internal/ff$a$a;->a:I

    iget-object v0, v3, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    check-cast p1, Ljava/lang/String;

    iput-object p1, v0, Lcom/google/android/gms/internal/ff$a$a$a;->b:Ljava/lang/String;

    :goto_1
    move-object v0, v3

    goto :goto_0

    :cond_1
    instance-of v1, p1, Ljava/lang/Integer;

    if-eqz v1, :cond_2

    iput v11, v3, Lcom/google/android/gms/internal/ff$a$a;->a:I

    iget-object v0, v3, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Lcom/google/android/gms/internal/ff$a$a$a;->f:I

    goto :goto_1

    :cond_2
    instance-of v1, p1, Ljava/lang/Long;

    if-eqz v1, :cond_3

    const/4 v0, 0x5

    iput v0, v3, Lcom/google/android/gms/internal/ff$a$a;->a:I

    iget-object v0, v3, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iput-wide v4, v0, Lcom/google/android/gms/internal/ff$a$a$a;->e:J

    goto :goto_1

    :cond_3
    instance-of v1, p1, Ljava/lang/Double;

    if-eqz v1, :cond_4

    const/4 v0, 0x3

    iput v0, v3, Lcom/google/android/gms/internal/ff$a$a;->a:I

    iget-object v0, v3, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    iput-wide v4, v0, Lcom/google/android/gms/internal/ff$a$a$a;->c:D

    goto :goto_1

    :cond_4
    instance-of v1, p1, Ljava/lang/Float;

    if-eqz v1, :cond_5

    const/4 v0, 0x4

    iput v0, v3, Lcom/google/android/gms/internal/ff$a$a;->a:I

    iget-object v0, v3, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iput v1, v0, Lcom/google/android/gms/internal/ff$a$a$a;->d:F

    goto :goto_1

    :cond_5
    instance-of v1, p1, Ljava/lang/Boolean;

    if-eqz v1, :cond_6

    const/16 v0, 0x8

    iput v0, v3, Lcom/google/android/gms/internal/ff$a$a;->a:I

    iget-object v0, v3, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iput-boolean v1, v0, Lcom/google/android/gms/internal/ff$a$a$a;->h:Z

    goto :goto_1

    :cond_6
    instance-of v1, p1, Ljava/lang/Byte;

    if-eqz v1, :cond_7

    const/4 v0, 0x7

    iput v0, v3, Lcom/google/android/gms/internal/ff$a$a;->a:I

    iget-object v0, v3, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    check-cast p1, Ljava/lang/Byte;

    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    move-result v1

    iput v1, v0, Lcom/google/android/gms/internal/ff$a$a$a;->g:I

    goto :goto_1

    :cond_7
    instance-of v1, p1, [B

    if-eqz v1, :cond_8

    const/4 v0, 0x1

    iput v0, v3, Lcom/google/android/gms/internal/ff$a$a;->a:I

    iget-object v0, v3, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    check-cast p1, [B

    iput-object p1, v0, Lcom/google/android/gms/internal/ff$a$a$a;->a:[B

    goto :goto_1

    :cond_8
    instance-of v1, p1, [Ljava/lang/String;

    if-eqz v1, :cond_9

    const/16 v0, 0xb

    iput v0, v3, Lcom/google/android/gms/internal/ff$a$a;->a:I

    iget-object v0, v3, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    check-cast p1, [Ljava/lang/String;

    iput-object p1, v0, Lcom/google/android/gms/internal/ff$a$a$a;->k:[Ljava/lang/String;

    goto/16 :goto_1

    :cond_9
    instance-of v1, p1, [J

    if-eqz v1, :cond_a

    const/16 v0, 0xc

    iput v0, v3, Lcom/google/android/gms/internal/ff$a$a;->a:I

    iget-object v0, v3, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    check-cast p1, [J

    iput-object p1, v0, Lcom/google/android/gms/internal/ff$a$a$a;->l:[J

    goto/16 :goto_1

    :cond_a
    instance-of v1, p1, [F

    if-eqz v1, :cond_b

    const/16 v0, 0xf

    iput v0, v3, Lcom/google/android/gms/internal/ff$a$a;->a:I

    iget-object v0, v3, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    check-cast p1, [F

    iput-object p1, v0, Lcom/google/android/gms/internal/ff$a$a$a;->m:[F

    goto/16 :goto_1

    :cond_b
    instance-of v1, p1, Lcom/google/android/gms/wearable/Asset;

    if-eqz v1, :cond_c

    const/16 v0, 0xd

    iput v0, v3, Lcom/google/android/gms/internal/ff$a$a;->a:I

    iget-object v0, v3, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    check-cast p1, Lcom/google/android/gms/wearable/Asset;

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/fe;->a(Ljava/util/List;Lcom/google/android/gms/wearable/Asset;)I

    move-result v1

    int-to-long v4, v1

    iput-wide v4, v0, Lcom/google/android/gms/internal/ff$a$a$a;->n:J

    goto/16 :goto_1

    :cond_c
    instance-of v1, p1, Lcom/google/android/gms/wearable/k;

    if-eqz v1, :cond_e

    iput v12, v3, Lcom/google/android/gms/internal/ff$a$a;->a:I

    check-cast p1, Lcom/google/android/gms/wearable/k;

    new-instance v1, Ljava/util/TreeSet;

    invoke-virtual {p1}, Lcom/google/android/gms/wearable/k;->f()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/TreeSet;->size()I

    move-result v2

    new-array v2, v2, [Lcom/google/android/gms/internal/ff$a;

    invoke-virtual {v1}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v0

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v5, Lcom/google/android/gms/internal/ff$a;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ff$a;-><init>()V

    aput-object v5, v2, v1

    aget-object v5, v2, v1

    iput-object v0, v5, Lcom/google/android/gms/internal/ff$a;->a:Ljava/lang/String;

    aget-object v5, v2, v1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/wearable/k;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/fe;->a(Ljava/util/List;Ljava/lang/Object;)Lcom/google/android/gms/internal/ff$a$a;

    move-result-object v0

    iput-object v0, v5, Lcom/google/android/gms/internal/ff$a;->b:Lcom/google/android/gms/internal/ff$a$a;

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :cond_d
    iget-object v0, v3, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    iput-object v2, v0, Lcom/google/android/gms/internal/ff$a$a$a;->i:[Lcom/google/android/gms/internal/ff$a;

    goto/16 :goto_1

    :cond_e
    instance-of v1, p1, Ljava/util/ArrayList;

    if-eqz v1, :cond_12

    const/16 v1, 0xa

    iput v1, v3, Lcom/google/android/gms/internal/ff$a$a;->a:I

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v6, v1, [Lcom/google/android/gms/internal/ff$a$a;

    const/4 v1, 0x0

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v7

    move v4, v0

    move v2, v5

    :goto_3
    if-ge v4, v7, :cond_11

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/fe;->a(Ljava/util/List;Ljava/lang/Object;)Lcom/google/android/gms/internal/ff$a$a;

    move-result-object v8

    iget v9, v8, Lcom/google/android/gms/internal/ff$a$a;->a:I

    if-eq v9, v5, :cond_f

    iget v9, v8, Lcom/google/android/gms/internal/ff$a$a;->a:I

    if-eq v9, v10, :cond_f

    iget v9, v8, Lcom/google/android/gms/internal/ff$a$a;->a:I

    if-eq v9, v11, :cond_f

    iget v9, v8, Lcom/google/android/gms/internal/ff$a$a;->a:I

    if-eq v9, v12, :cond_f

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit16 v3, v3, 0x82

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    if-ne v2, v5, :cond_10

    iget v9, v8, Lcom/google/android/gms/internal/ff$a$a;->a:I

    if-eq v9, v5, :cond_10

    iget v1, v8, Lcom/google/android/gms/internal/ff$a$a;->a:I

    :goto_4
    aput-object v8, v6, v4

    add-int/lit8 v2, v4, 0x1

    move v4, v2

    move v2, v1

    move-object v1, v0

    goto :goto_3

    :cond_10
    iget v9, v8, Lcom/google/android/gms/internal/ff$a$a;->a:I

    if-eq v9, v2, :cond_14

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x50

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "ArrayList elements must all be of the sameclass, but this one contains a "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " and a "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_11
    iget-object v0, v3, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    iput-object v6, v0, Lcom/google/android/gms/internal/ff$a$a$a;->j:[Lcom/google/android/gms/internal/ff$a$a;

    goto/16 :goto_1

    :cond_12
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "newFieldValueFromValue: unexpected value "

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_13

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_5
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_13
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_14
    move-object v0, v1

    move v1, v2

    goto :goto_4
.end method

.method public static a(Lcom/google/android/gms/internal/fe$a;)Lcom/google/android/gms/wearable/k;
    .locals 7

    new-instance v1, Lcom/google/android/gms/wearable/k;

    invoke-direct {v1}, Lcom/google/android/gms/wearable/k;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/fe$a;->a:Lcom/google/android/gms/internal/ff;

    iget-object v2, v0, Lcom/google/android/gms/internal/ff;->a:[Lcom/google/android/gms/internal/ff$a;

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    iget-object v5, p0, Lcom/google/android/gms/internal/fe$a;->b:Ljava/util/List;

    iget-object v6, v4, Lcom/google/android/gms/internal/ff$a;->a:Ljava/lang/String;

    iget-object v4, v4, Lcom/google/android/gms/internal/ff$a;->b:Lcom/google/android/gms/internal/ff$a$a;

    invoke-static {v5, v1, v6, v4}, Lcom/google/android/gms/internal/fe;->a(Ljava/util/List;Lcom/google/android/gms/wearable/k;Ljava/lang/String;Lcom/google/android/gms/internal/ff$a$a;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private static a(Ljava/util/List;Lcom/google/android/gms/internal/ff$a$a$a;I)Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/wearable/Asset;",
            ">;",
            "Lcom/google/android/gms/internal/ff$a$a$a;",
            "I)",
            "Ljava/util/ArrayList;"
        }
    .end annotation

    const/4 v1, 0x0

    new-instance v3, Ljava/util/ArrayList;

    iget-object v0, p1, Lcom/google/android/gms/internal/ff$a$a$a;->j:[Lcom/google/android/gms/internal/ff$a$a;

    array-length v0, v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v4, p1, Lcom/google/android/gms/internal/ff$a$a$a;->j:[Lcom/google/android/gms/internal/ff$a$a;

    array-length v5, v4

    move v2, v1

    :goto_0
    if-ge v2, v5, :cond_5

    aget-object v0, v4, v2

    iget v6, v0, Lcom/google/android/gms/internal/ff$a$a;->a:I

    const/16 v7, 0xe

    if-ne v6, v7, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_0
    const/16 v6, 0x9

    if-ne p2, v6, :cond_2

    new-instance v6, Lcom/google/android/gms/wearable/k;

    invoke-direct {v6}, Lcom/google/android/gms/wearable/k;-><init>()V

    iget-object v0, v0, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    iget-object v7, v0, Lcom/google/android/gms/internal/ff$a$a$a;->i:[Lcom/google/android/gms/internal/ff$a;

    array-length v8, v7

    move v0, v1

    :goto_2
    if-ge v0, v8, :cond_1

    aget-object v9, v7, v0

    iget-object v10, v9, Lcom/google/android/gms/internal/ff$a;->a:Ljava/lang/String;

    iget-object v9, v9, Lcom/google/android/gms/internal/ff$a;->b:Lcom/google/android/gms/internal/ff$a$a;

    invoke-static {p0, v6, v10, v9}, Lcom/google/android/gms/internal/fe;->a(Ljava/util/List;Lcom/google/android/gms/wearable/k;Ljava/lang/String;Lcom/google/android/gms/internal/ff$a$a;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_1
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    const/4 v6, 0x2

    if-ne p2, v6, :cond_3

    iget-object v0, v0, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    iget-object v0, v0, Lcom/google/android/gms/internal/ff$a$a$a;->b:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    const/4 v6, 0x6

    if-ne p2, v6, :cond_4

    iget-object v0, v0, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    iget v0, v0, Lcom/google/android/gms/internal/ff$a$a$a;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x27

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Unexpected typeOfArrayList: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    return-object v3
.end method

.method private static a(Ljava/util/List;Lcom/google/android/gms/wearable/k;Ljava/lang/String;Lcom/google/android/gms/internal/ff$a$a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/wearable/Asset;",
            ">;",
            "Lcom/google/android/gms/wearable/k;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ff$a$a;",
            ")V"
        }
    .end annotation

    const/16 v6, 0xe

    const/16 v5, 0x9

    const/4 v4, 0x6

    const/4 v3, 0x2

    iget v0, p3, Lcom/google/android/gms/internal/ff$a$a;->a:I

    if-ne v0, v6, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/wearable/k;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v1, p3, Lcom/google/android/gms/internal/ff$a$a;->b:Lcom/google/android/gms/internal/ff$a$a$a;

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    iget-object v0, v1, Lcom/google/android/gms/internal/ff$a$a$a;->a:[B

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/wearable/k;->a(Ljava/lang/String;[B)V

    goto :goto_0

    :cond_1
    const/16 v2, 0xb

    if-ne v0, v2, :cond_2

    iget-object v0, v1, Lcom/google/android/gms/internal/ff$a$a$a;->k:[Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/wearable/k;->a(Ljava/lang/String;[Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const/16 v2, 0xc

    if-ne v0, v2, :cond_3

    iget-object v0, v1, Lcom/google/android/gms/internal/ff$a$a$a;->l:[J

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/wearable/k;->a(Ljava/lang/String;[J)V

    goto :goto_0

    :cond_3
    const/16 v2, 0xf

    if-ne v0, v2, :cond_4

    iget-object v0, v1, Lcom/google/android/gms/internal/ff$a$a$a;->m:[F

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/wearable/k;->a(Ljava/lang/String;[F)V

    goto :goto_0

    :cond_4
    if-ne v0, v3, :cond_5

    iget-object v0, v1, Lcom/google/android/gms/internal/ff$a$a$a;->b:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/wearable/k;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    const/4 v2, 0x3

    if-ne v0, v2, :cond_6

    iget-wide v0, v1, Lcom/google/android/gms/internal/ff$a$a$a;->c:D

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/android/gms/wearable/k;->a(Ljava/lang/String;D)V

    goto :goto_0

    :cond_6
    const/4 v2, 0x4

    if-ne v0, v2, :cond_7

    iget v0, v1, Lcom/google/android/gms/internal/ff$a$a$a;->d:F

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/wearable/k;->a(Ljava/lang/String;F)V

    goto :goto_0

    :cond_7
    const/4 v2, 0x5

    if-ne v0, v2, :cond_8

    iget-wide v0, v1, Lcom/google/android/gms/internal/ff$a$a$a;->e:J

    invoke-virtual {p1, p2, v0, v1}, Lcom/google/android/gms/wearable/k;->a(Ljava/lang/String;J)V

    goto :goto_0

    :cond_8
    if-ne v0, v4, :cond_9

    iget v0, v1, Lcom/google/android/gms/internal/ff$a$a$a;->f:I

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/wearable/k;->a(Ljava/lang/String;I)V

    goto :goto_0

    :cond_9
    const/4 v2, 0x7

    if-ne v0, v2, :cond_a

    iget v0, v1, Lcom/google/android/gms/internal/ff$a$a$a;->g:I

    int-to-byte v0, v0

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/wearable/k;->a(Ljava/lang/String;B)V

    goto :goto_0

    :cond_a
    const/16 v2, 0x8

    if-ne v0, v2, :cond_b

    iget-boolean v0, v1, Lcom/google/android/gms/internal/ff$a$a$a;->h:Z

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/wearable/k;->a(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_b
    const/16 v2, 0xd

    if-ne v0, v2, :cond_e

    if-nez p0, :cond_d

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "populateBundle: unexpected type for: "

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_d
    iget-wide v0, v1, Lcom/google/android/gms/internal/ff$a$a$a;->n:J

    long-to-int v0, v0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/wearable/Asset;

    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/wearable/k;->a(Ljava/lang/String;Lcom/google/android/gms/wearable/Asset;)V

    goto/16 :goto_0

    :cond_e
    if-ne v0, v5, :cond_10

    new-instance v2, Lcom/google/android/gms/wearable/k;

    invoke-direct {v2}, Lcom/google/android/gms/wearable/k;-><init>()V

    iget-object v1, v1, Lcom/google/android/gms/internal/ff$a$a$a;->i:[Lcom/google/android/gms/internal/ff$a;

    array-length v3, v1

    const/4 v0, 0x0

    :goto_2
    if-ge v0, v3, :cond_f

    aget-object v4, v1, v0

    iget-object v5, v4, Lcom/google/android/gms/internal/ff$a;->a:Ljava/lang/String;

    iget-object v4, v4, Lcom/google/android/gms/internal/ff$a;->b:Lcom/google/android/gms/internal/ff$a$a;

    invoke-static {p0, v2, v5, v4}, Lcom/google/android/gms/internal/fe;->a(Ljava/util/List;Lcom/google/android/gms/wearable/k;Ljava/lang/String;Lcom/google/android/gms/internal/ff$a$a;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_f
    invoke-virtual {p1, p2, v2}, Lcom/google/android/gms/wearable/k;->a(Ljava/lang/String;Lcom/google/android/gms/wearable/k;)V

    goto/16 :goto_0

    :cond_10
    const/16 v2, 0xa

    if-ne v0, v2, :cond_15

    iget-object v0, v1, Lcom/google/android/gms/internal/ff$a$a$a;->j:[Lcom/google/android/gms/internal/ff$a$a;

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/fe;->a(Ljava/lang/String;[Lcom/google/android/gms/internal/ff$a$a;)I

    move-result v0

    invoke-static {p0, v1, v0}, Lcom/google/android/gms/internal/fe;->a(Ljava/util/List;Lcom/google/android/gms/internal/ff$a$a$a;I)Ljava/util/ArrayList;

    move-result-object v1

    if-ne v0, v6, :cond_11

    invoke-virtual {p1, p2, v1}, Lcom/google/android/gms/wearable/k;->c(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto/16 :goto_0

    :cond_11
    if-ne v0, v5, :cond_12

    invoke-virtual {p1, p2, v1}, Lcom/google/android/gms/wearable/k;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto/16 :goto_0

    :cond_12
    if-ne v0, v3, :cond_13

    invoke-virtual {p1, p2, v1}, Lcom/google/android/gms/wearable/k;->c(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto/16 :goto_0

    :cond_13
    if-ne v0, v4, :cond_14

    invoke-virtual {p1, p2, v1}, Lcom/google/android/gms/wearable/k;->b(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto/16 :goto_0

    :cond_14
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x27

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected typeOfArrayList: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_15
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x2b

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "populateBundle: unexpected type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static a(Lcom/google/android/gms/wearable/k;Ljava/util/List;)[Lcom/google/android/gms/internal/ff$a;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/k;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/wearable/Asset;",
            ">;)[",
            "Lcom/google/android/gms/internal/ff$a;"
        }
    .end annotation

    new-instance v1, Ljava/util/TreeSet;

    invoke-virtual {p0}, Lcom/google/android/gms/wearable/k;->f()Ljava/util/Set;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/TreeSet;->size()I

    move-result v0

    new-array v2, v0, [Lcom/google/android/gms/internal/ff$a;

    const/4 v0, 0x0

    invoke-virtual {v1}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/wearable/k;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    new-instance v5, Lcom/google/android/gms/internal/ff$a;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ff$a;-><init>()V

    aput-object v5, v2, v1

    aget-object v5, v2, v1

    iput-object v0, v5, Lcom/google/android/gms/internal/ff$a;->a:Ljava/lang/String;

    aget-object v0, v2, v1

    invoke-static {p1, v4}, Lcom/google/android/gms/internal/fe;->a(Ljava/util/List;Ljava/lang/Object;)Lcom/google/android/gms/internal/ff$a$a;

    move-result-object v4

    iput-object v4, v0, Lcom/google/android/gms/internal/ff$a;->b:Lcom/google/android/gms/internal/ff$a$a;

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    return-object v2
.end method
