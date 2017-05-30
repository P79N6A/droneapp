.class public Lb/a/d;
.super Lb/a/c;


# direct methods
.method public constructor <init>(Lb/b/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lb/a/c;-><init>(Lb/b/i;)V

    return-void
.end method


# virtual methods
.method public a(Lb/b/m;)V
    .locals 1

    new-instance v0, Lb/a/d$1;

    invoke-direct {v0, p0, p1}, Lb/a/d$1;-><init>(Lb/a/d;Lb/b/m;)V

    invoke-virtual {p1, p0, v0}, Lb/b/m;->a(Lb/b/i;Lb/b/h;)V

    return-void
.end method

.method protected c()V
    .locals 0

    return-void
.end method

.method protected d()V
    .locals 0

    return-void
.end method
