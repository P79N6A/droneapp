.class public abstract Lcom/fimi/soul/drone/h/a/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/fimi/soul/drone/h/a/d;",
        ">;"
    }
.end annotation


# instance fields
.field protected a:Lcom/fimi/soul/drone/h/a/c;


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/h/a/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/fimi/soul/drone/h/a/d;->a:Lcom/fimi/soul/drone/h/a/c;

    return-void
.end method

.method public constructor <init>(Lcom/fimi/soul/drone/h/a/d;)V
    .locals 1

    iget-object v0, p1, Lcom/fimi/soul/drone/h/a/d;->a:Lcom/fimi/soul/drone/h/a/c;

    invoke-direct {p0, v0}, Lcom/fimi/soul/drone/h/a/d;-><init>(Lcom/fimi/soul/drone/h/a/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/fimi/soul/drone/h/a/c;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/drone/h/a/d;->a:Lcom/fimi/soul/drone/h/a/c;

    return-object v0
.end method
