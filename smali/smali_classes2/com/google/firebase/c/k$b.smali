.class public Lcom/google/firebase/c/k$b;
.super Lcom/google/firebase/c/j$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/c/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/firebase/c/j",
        "<",
        "Lcom/google/firebase/c/k$b;",
        ">.b;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/firebase/c/k;

.field private final c:J


# direct methods
.method constructor <init>(Lcom/google/firebase/c/k;Ljava/lang/Exception;J)V
    .locals 1

    iput-object p1, p0, Lcom/google/firebase/c/k$b;->a:Lcom/google/firebase/c/k;

    invoke-direct {p0, p1, p2}, Lcom/google/firebase/c/j$b;-><init>(Lcom/google/firebase/c/j;Ljava/lang/Exception;)V

    iput-wide p3, p0, Lcom/google/firebase/c/k$b;->c:J

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lcom/google/firebase/c/k$b;->c:J

    return-wide v0
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/c/k$b;->a:Lcom/google/firebase/c/k;

    invoke-virtual {v0}, Lcom/google/firebase/c/k;->k()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic c()Ljava/lang/Exception;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    invoke-super {p0}, Lcom/google/firebase/c/j$b;->c()Ljava/lang/Exception;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Lcom/google/firebase/c/i;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-super {p0}, Lcom/google/firebase/c/j$b;->d()Lcom/google/firebase/c/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Lcom/google/firebase/c/j;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-super {p0}, Lcom/google/firebase/c/j$b;->e()Lcom/google/firebase/c/j;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/c/k$b;->a:Lcom/google/firebase/c/k;

    invoke-static {v0}, Lcom/google/firebase/c/k;->b(Lcom/google/firebase/c/k;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
