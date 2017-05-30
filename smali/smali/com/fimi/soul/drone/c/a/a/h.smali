.class public final Lcom/fimi/soul/drone/c/a/a/h;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILcom/fimi/soul/drone/c/a/c;)Lcom/fimi/soul/drone/c/a/a/g;
    .locals 2

    const/4 v0, 0x0

    packed-switch p0, :pswitch_data_0

    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_0

    invoke-virtual {v1, p0}, Lcom/fimi/soul/drone/h/a;->a(I)V

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/g;

    invoke-direct {v0, v1}, Lcom/fimi/soul/drone/c/a/a/g;-><init>(Lcom/fimi/soul/drone/c/a;)V

    iput p0, v0, Lcom/fimi/soul/drone/c/a/a/g;->a:I

    iget-object v1, p1, Lcom/fimi/soul/drone/c/a/c;->d:Lcom/fimi/soul/drone/c/a/d;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/c/a/a/g;->a(Lcom/fimi/soul/drone/c/a/d;)V

    :cond_0
    return-object v0

    :pswitch_0
    new-instance v1, Lcom/fimi/soul/drone/h/i;

    invoke-direct {v1}, Lcom/fimi/soul/drone/h/i;-><init>()V

    goto :goto_0

    :pswitch_1
    new-instance v1, Lcom/fimi/soul/drone/h/g;

    invoke-direct {v1}, Lcom/fimi/soul/drone/h/g;-><init>()V

    goto :goto_0

    :pswitch_2
    new-instance v1, Lcom/fimi/soul/drone/h/i;

    invoke-direct {v1}, Lcom/fimi/soul/drone/h/i;-><init>()V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x31
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static a(IILcom/fimi/soul/drone/c/a/d;)Lcom/fimi/soul/drone/c/a/c;
    .locals 1

    new-instance v0, Lcom/fimi/soul/drone/c/a/c;

    invoke-direct {v0, p2}, Lcom/fimi/soul/drone/c/a/c;-><init>(Lcom/fimi/soul/drone/c/a/d;)V

    iput p0, v0, Lcom/fimi/soul/drone/c/a/c;->b:I

    iput p1, v0, Lcom/fimi/soul/drone/c/a/c;->c:I

    return-object v0
.end method

.method public static a(I[B)Lcom/fimi/soul/drone/c/a/c;
    .locals 2

    new-instance v0, Lcom/fimi/soul/drone/c/a/c;

    invoke-static {p1}, Lcom/fimi/soul/drone/c/a/a/h;->a([B)Lcom/fimi/soul/drone/c/a/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fimi/soul/drone/c/a/c;-><init>(Lcom/fimi/soul/drone/c/a/d;)V

    array-length v1, p1

    iput v1, v0, Lcom/fimi/soul/drone/c/a/c;->b:I

    iput p0, v0, Lcom/fimi/soul/drone/c/a/c;->c:I

    return-object v0
.end method

.method public static a([B)Lcom/fimi/soul/drone/c/a/d;
    .locals 4

    new-instance v1, Lcom/fimi/soul/drone/c/a/d;

    invoke-direct {v1}, Lcom/fimi/soul/drone/c/a/d;-><init>()V

    array-length v2, p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-byte v3, p0, v0

    invoke-virtual {v1, v3}, Lcom/fimi/soul/drone/c/a/d;->b(B)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method
