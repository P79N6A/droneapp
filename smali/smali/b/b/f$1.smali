.class Lb/b/f$1;
.super Lorg/c/e/b/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/b/f;->a(Lb/b/m;Lb/b/e;)Lorg/c/e/b/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/b/m;

.field final synthetic b:Lb/b/f;


# direct methods
.method constructor <init>(Lb/b/f;Lb/b/m;)V
    .locals 0

    iput-object p1, p0, Lb/b/f$1;->b:Lb/b/f;

    iput-object p2, p0, Lb/b/f$1;->a:Lb/b/m;

    invoke-direct {p0}, Lorg/c/e/b/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/c/e/b/a;)V
    .locals 3

    iget-object v0, p0, Lb/b/f$1;->a:Lb/b/m;

    iget-object v1, p0, Lb/b/f$1;->b:Lb/b/f;

    invoke-virtual {p1}, Lorg/c/e/b/a;->b()Lorg/c/e/c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb/b/f;->a(Lorg/c/e/c;)Lb/b/i;

    move-result-object v1

    invoke-virtual {p1}, Lorg/c/e/b/a;->c()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lb/b/m;->a(Lb/b/i;Ljava/lang/Throwable;)V

    return-void
.end method

.method public a(Lorg/c/e/c;)V
    .locals 2

    iget-object v0, p0, Lb/b/f$1;->a:Lb/b/m;

    iget-object v1, p0, Lb/b/f$1;->b:Lb/b/f;

    invoke-virtual {v1, p1}, Lb/b/f;->a(Lorg/c/e/c;)Lb/b/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb/b/m;->a(Lb/b/i;)V

    return-void
.end method

.method public b(Lorg/c/e/c;)V
    .locals 2

    iget-object v0, p0, Lb/b/f$1;->a:Lb/b/m;

    iget-object v1, p0, Lb/b/f$1;->b:Lb/b/f;

    invoke-virtual {v1, p1}, Lb/b/f;->a(Lorg/c/e/c;)Lb/b/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb/b/m;->b(Lb/b/i;)V

    return-void
.end method
