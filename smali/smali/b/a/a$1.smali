.class Lb/a/a$1;
.super Ljava/lang/Thread;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/a/a;->a(Lb/b/i;Lb/b/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/b/i;

.field final synthetic b:Lb/b/m;

.field final synthetic c:Lb/a/a;


# direct methods
.method constructor <init>(Lb/a/a;Lb/b/i;Lb/b/m;)V
    .locals 0

    iput-object p1, p0, Lb/a/a$1;->c:Lb/a/a;

    iput-object p2, p0, Lb/a/a$1;->a:Lb/b/i;

    iput-object p3, p0, Lb/a/a$1;->b:Lb/b/m;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lb/a/a$1;->a:Lb/b/i;

    iget-object v1, p0, Lb/a/a$1;->b:Lb/b/m;

    invoke-interface {v0, v1}, Lb/b/i;->a(Lb/b/m;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lb/a/a$1;->c:Lb/a/a;

    invoke-virtual {v0}, Lb/a/a;->b()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lb/a/a$1;->c:Lb/a/a;

    invoke-virtual {v1}, Lb/a/a;->b()V

    throw v0
.end method
