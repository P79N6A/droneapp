.class Lb/a/d$1;
.super Ljava/lang/Object;

# interfaces
.implements Lb/b/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/a/d;->a(Lb/b/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/b/m;

.field final synthetic b:Lb/a/d;


# direct methods
.method constructor <init>(Lb/a/d;Lb/b/m;)V
    .locals 0

    iput-object p1, p0, Lb/a/d$1;->b:Lb/a/d;

    iput-object p2, p0, Lb/a/d$1;->a:Lb/b/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lb/a/d$1;->b:Lb/a/d;

    invoke-virtual {v0}, Lb/a/d;->c()V

    iget-object v0, p0, Lb/a/d$1;->b:Lb/a/d;

    iget-object v1, p0, Lb/a/d$1;->a:Lb/b/m;

    invoke-virtual {v0, v1}, Lb/a/d;->b(Lb/b/m;)V

    iget-object v0, p0, Lb/a/d$1;->b:Lb/a/d;

    invoke-virtual {v0}, Lb/a/d;->d()V

    return-void
.end method
