.class public Lcom/fimi/soul/drone/c/a/a/g;
.super Lcom/fimi/soul/drone/c/a/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/fimi/soul/drone/c/a;",
        ">",
        "Lcom/fimi/soul/drone/c/a/b;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private b:Lcom/fimi/soul/drone/c/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/c/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/fimi/soul/drone/c/a/b;-><init>()V

    iput-object p1, p0, Lcom/fimi/soul/drone/c/a/a/g;->b:Lcom/fimi/soul/drone/c/a;

    return-void
.end method


# virtual methods
.method public a()Lcom/fimi/soul/drone/c/a/c;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/fimi/soul/drone/c/a/d;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/a/g;->b:Lcom/fimi/soul/drone/c/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/a/g;->b:Lcom/fimi/soul/drone/c/a;

    invoke-interface {v0, p1}, Lcom/fimi/soul/drone/c/a;->a(Lcom/fimi/soul/drone/c/a/d;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/fimi/soul/drone/c/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/fimi/soul/drone/c/a/a/g;->b:Lcom/fimi/soul/drone/c/a;

    return-void
.end method

.method public b()Lcom/fimi/soul/drone/c/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/fimi/soul/drone/c/a/a/g;->b:Lcom/fimi/soul/drone/c/a;

    return-object v0
.end method
