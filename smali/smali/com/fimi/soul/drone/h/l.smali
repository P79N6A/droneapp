.class public Lcom/fimi/soul/drone/h/l;
.super Lcom/fimi/soul/drone/e;


# instance fields
.field private b:D

.field private c:D

.field private d:D


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/fimi/soul/drone/e;-><init>(Lcom/fimi/soul/drone/a;)V

    return-void
.end method


# virtual methods
.method public a()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/l;->b:D

    return-wide v0
.end method

.method public a(DDD)V
    .locals 3

    iput-wide p1, p0, Lcom/fimi/soul/drone/h/l;->b:D

    iput-wide p3, p0, Lcom/fimi/soul/drone/h/l;->c:D

    iput-wide p5, p0, Lcom/fimi/soul/drone/h/l;->d:D

    iget-object v0, p0, Lcom/fimi/soul/drone/h/l;->a:Lcom/fimi/soul/drone/a;

    sget-object v1, Lcom/fimi/soul/drone/d$a;->N:Lcom/fimi/soul/drone/d$a;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$a;)V

    return-void
.end method

.method public b()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/l;->c:D

    return-wide v0
.end method

.method public c()D
    .locals 2

    iget-wide v0, p0, Lcom/fimi/soul/drone/h/l;->d:D

    return-wide v0
.end method
