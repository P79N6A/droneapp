.class public Lb/a/c;
.super Lb/b/a;

# interfaces
.implements Lb/b/i;


# instance fields
.field protected a:Lb/b/i;


# direct methods
.method public constructor <init>(Lb/b/i;)V
    .locals 0

    invoke-direct {p0}, Lb/b/a;-><init>()V

    iput-object p1, p0, Lb/a/c;->a:Lb/b/i;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lb/a/c;->a:Lb/b/i;

    invoke-interface {v0}, Lb/b/i;->a()I

    move-result v0

    return v0
.end method

.method public a(Lb/b/m;)V
    .locals 0

    invoke-virtual {p0, p1}, Lb/a/c;->b(Lb/b/m;)V

    return-void
.end method

.method public b()Lb/b/i;
    .locals 1

    iget-object v0, p0, Lb/a/c;->a:Lb/b/i;

    return-object v0
.end method

.method public b(Lb/b/m;)V
    .locals 1

    iget-object v0, p0, Lb/a/c;->a:Lb/b/i;

    invoke-interface {v0, p1}, Lb/b/i;->a(Lb/b/m;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb/a/c;->a:Lb/b/i;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
