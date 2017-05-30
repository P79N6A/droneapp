.class public final Lcom/a/a/l;
.super Lcom/a/a/q;


# static fields
.field private static final p:Z

.field private static final q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/a/b/d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private r:Ljava/lang/Object;

.field private s:Ljava/lang/String;

.field private t:Lcom/a/b/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/a/a/l;->q:Ljava/util/Map;

    sget-object v0, Lcom/a/a/l;->q:Ljava/util/Map;

    const-string v1, "alpha"

    sget-object v2, Lcom/a/a/m;->a:Lcom/a/b/d;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/a/a/l;->q:Ljava/util/Map;

    const-string v1, "pivotX"

    sget-object v2, Lcom/a/a/m;->b:Lcom/a/b/d;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/a/a/l;->q:Ljava/util/Map;

    const-string v1, "pivotY"

    sget-object v2, Lcom/a/a/m;->c:Lcom/a/b/d;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/a/a/l;->q:Ljava/util/Map;

    const-string v1, "translationX"

    sget-object v2, Lcom/a/a/m;->d:Lcom/a/b/d;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/a/a/l;->q:Ljava/util/Map;

    const-string v1, "translationY"

    sget-object v2, Lcom/a/a/m;->e:Lcom/a/b/d;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/a/a/l;->q:Ljava/util/Map;

    const-string v1, "rotation"

    sget-object v2, Lcom/a/a/m;->f:Lcom/a/b/d;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/a/a/l;->q:Ljava/util/Map;

    const-string v1, "rotationX"

    sget-object v2, Lcom/a/a/m;->g:Lcom/a/b/d;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/a/a/l;->q:Ljava/util/Map;

    const-string v1, "rotationY"

    sget-object v2, Lcom/a/a/m;->h:Lcom/a/b/d;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/a/a/l;->q:Ljava/util/Map;

    const-string v1, "scaleX"

    sget-object v2, Lcom/a/a/m;->i:Lcom/a/b/d;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/a/a/l;->q:Ljava/util/Map;

    const-string v1, "scaleY"

    sget-object v2, Lcom/a/a/m;->j:Lcom/a/b/d;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/a/a/l;->q:Ljava/util/Map;

    const-string v1, "scrollX"

    sget-object v2, Lcom/a/a/m;->k:Lcom/a/b/d;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/a/a/l;->q:Ljava/util/Map;

    const-string v1, "scrollY"

    sget-object v2, Lcom/a/a/m;->l:Lcom/a/b/d;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/a/a/l;->q:Ljava/util/Map;

    const-string v1, "x"

    sget-object v2, Lcom/a/a/m;->m:Lcom/a/b/d;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/a/a/l;->q:Ljava/util/Map;

    const-string v1, "y"

    sget-object v2, Lcom/a/a/m;->n:Lcom/a/b/d;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/a/a/q;-><init>()V

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Lcom/a/b/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lcom/a/b/d",
            "<TT;*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/a/a/q;-><init>()V

    iput-object p1, p0, Lcom/a/a/l;->r:Ljava/lang/Object;

    invoke-virtual {p0, p2}, Lcom/a/a/l;->a(Lcom/a/b/d;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/a/a/q;-><init>()V

    iput-object p1, p0, Lcom/a/a/l;->r:Ljava/lang/Object;

    invoke-virtual {p0, p2}, Lcom/a/a/l;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static varargs a(Ljava/lang/Object;Lcom/a/b/d;Lcom/a/a/p;[Ljava/lang/Object;)Lcom/a/a/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lcom/a/b/d",
            "<TT;TV;>;",
            "Lcom/a/a/p",
            "<TV;>;[TV;)",
            "Lcom/a/a/l;"
        }
    .end annotation

    new-instance v0, Lcom/a/a/l;

    invoke-direct {v0, p0, p1}, Lcom/a/a/l;-><init>(Ljava/lang/Object;Lcom/a/b/d;)V

    invoke-virtual {v0, p3}, Lcom/a/a/l;->a([Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Lcom/a/a/l;->a(Lcom/a/a/p;)V

    return-object v0
.end method

.method public static varargs a(Ljava/lang/Object;Lcom/a/b/d;[F)Lcom/a/a/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lcom/a/b/d",
            "<TT;",
            "Ljava/lang/Float;",
            ">;[F)",
            "Lcom/a/a/l;"
        }
    .end annotation

    new-instance v0, Lcom/a/a/l;

    invoke-direct {v0, p0, p1}, Lcom/a/a/l;-><init>(Ljava/lang/Object;Lcom/a/b/d;)V

    invoke-virtual {v0, p2}, Lcom/a/a/l;->a([F)V

    return-object v0
.end method

.method public static varargs a(Ljava/lang/Object;Lcom/a/b/d;[I)Lcom/a/a/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lcom/a/b/d",
            "<TT;",
            "Ljava/lang/Integer;",
            ">;[I)",
            "Lcom/a/a/l;"
        }
    .end annotation

    new-instance v0, Lcom/a/a/l;

    invoke-direct {v0, p0, p1}, Lcom/a/a/l;-><init>(Ljava/lang/Object;Lcom/a/b/d;)V

    invoke-virtual {v0, p2}, Lcom/a/a/l;->a([I)V

    return-object v0
.end method

.method public static varargs a(Ljava/lang/Object;Ljava/lang/String;Lcom/a/a/p;[Ljava/lang/Object;)Lcom/a/a/l;
    .locals 1

    new-instance v0, Lcom/a/a/l;

    invoke-direct {v0, p0, p1}, Lcom/a/a/l;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Lcom/a/a/l;->a([Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Lcom/a/a/l;->a(Lcom/a/a/p;)V

    return-object v0
.end method

.method public static varargs a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/a/a/l;
    .locals 1

    new-instance v0, Lcom/a/a/l;

    invoke-direct {v0, p0, p1}, Lcom/a/a/l;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Lcom/a/a/l;->a([F)V

    return-object v0
.end method

.method public static varargs a(Ljava/lang/Object;Ljava/lang/String;[I)Lcom/a/a/l;
    .locals 1

    new-instance v0, Lcom/a/a/l;

    invoke-direct {v0, p0, p1}, Lcom/a/a/l;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Lcom/a/a/l;->a([I)V

    return-object v0
.end method

.method public static varargs a(Ljava/lang/Object;[Lcom/a/a/n;)Lcom/a/a/l;
    .locals 1

    new-instance v0, Lcom/a/a/l;

    invoke-direct {v0}, Lcom/a/a/l;-><init>()V

    iput-object p0, v0, Lcom/a/a/l;->r:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Lcom/a/a/l;->b([Lcom/a/a/n;)V

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-super {p0}, Lcom/a/a/q;->a()V

    return-void
.end method

.method a(F)V
    .locals 4

    invoke-super {p0, p1}, Lcom/a/a/q;->a(F)V

    iget-object v0, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    array-length v1, v0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    aget-object v2, v2, v0

    iget-object v3, p0, Lcom/a/a/l;->r:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Lcom/a/a/n;->d(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Lcom/a/b/d;)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    aget-object v0, v0, v3

    invoke-virtual {v0}, Lcom/a/a/n;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1}, Lcom/a/a/n;->a(Lcom/a/b/d;)V

    iget-object v2, p0, Lcom/a/a/l;->l:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/a/a/l;->l:Ljava/util/HashMap;

    iget-object v2, p0, Lcom/a/a/l;->s:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/a/a/l;->t:Lcom/a/b/d;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/a/b/d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/l;->s:Ljava/lang/String;

    :cond_1
    iput-object p1, p0, Lcom/a/a/l;->t:Lcom/a/b/d;

    iput-boolean v3, p0, Lcom/a/a/l;->j:Z

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/a/a/l;->r:Ljava/lang/Object;

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lcom/a/a/l;->r:Ljava/lang/Object;

    iput-object p1, p0, Lcom/a/a/l;->r:Ljava/lang/Object;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/a/a/l;->j:Z

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    aget-object v0, v0, v3

    invoke-virtual {v0}, Lcom/a/a/n;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1}, Lcom/a/a/n;->a(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/a/a/l;->l:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/a/a/l;->l:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iput-object p1, p0, Lcom/a/a/l;->s:Ljava/lang/String;

    iput-boolean v3, p0, Lcom/a/a/l;->j:Z

    return-void
.end method

.method public varargs a([F)V
    .locals 3

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    array-length v0, v0

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/a/a/l;->t:Lcom/a/b/d;

    if-eqz v0, :cond_1

    new-array v0, v1, [Lcom/a/a/n;

    iget-object v1, p0, Lcom/a/a/l;->t:Lcom/a/b/d;

    invoke-static {v1, p1}, Lcom/a/a/n;->a(Lcom/a/b/d;[F)Lcom/a/a/n;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/a/a/l;->b([Lcom/a/a/n;)V

    :goto_0
    return-void

    :cond_1
    new-array v0, v1, [Lcom/a/a/n;

    iget-object v1, p0, Lcom/a/a/l;->s:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/a/a/n;->a(Ljava/lang/String;[F)Lcom/a/a/n;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/a/a/l;->b([Lcom/a/a/n;)V

    goto :goto_0

    :cond_2
    invoke-super {p0, p1}, Lcom/a/a/q;->a([F)V

    goto :goto_0
.end method

.method public varargs a([I)V
    .locals 3

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    array-length v0, v0

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/a/a/l;->t:Lcom/a/b/d;

    if-eqz v0, :cond_1

    new-array v0, v1, [Lcom/a/a/n;

    iget-object v1, p0, Lcom/a/a/l;->t:Lcom/a/b/d;

    invoke-static {v1, p1}, Lcom/a/a/n;->a(Lcom/a/b/d;[I)Lcom/a/a/n;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/a/a/l;->b([Lcom/a/a/n;)V

    :goto_0
    return-void

    :cond_1
    new-array v0, v1, [Lcom/a/a/n;

    iget-object v1, p0, Lcom/a/a/l;->s:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/a/a/n;->a(Ljava/lang/String;[I)Lcom/a/a/n;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/a/a/l;->b([Lcom/a/a/n;)V

    goto :goto_0

    :cond_2
    invoke-super {p0, p1}, Lcom/a/a/q;->a([I)V

    goto :goto_0
.end method

.method public varargs a([Ljava/lang/Object;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v1, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    array-length v1, v1

    if-nez v1, :cond_2

    :cond_0
    iget-object v1, p0, Lcom/a/a/l;->t:Lcom/a/b/d;

    if-eqz v1, :cond_1

    new-array v1, v2, [Lcom/a/a/n;

    iget-object v2, p0, Lcom/a/a/l;->t:Lcom/a/b/d;

    check-cast v0, Lcom/a/a/p;

    invoke-static {v2, v0, p1}, Lcom/a/a/n;->a(Lcom/a/b/d;Lcom/a/a/p;[Ljava/lang/Object;)Lcom/a/a/n;

    move-result-object v0

    aput-object v0, v1, v3

    invoke-virtual {p0, v1}, Lcom/a/a/l;->b([Lcom/a/a/n;)V

    :goto_0
    return-void

    :cond_1
    new-array v1, v2, [Lcom/a/a/n;

    iget-object v2, p0, Lcom/a/a/l;->s:Ljava/lang/String;

    check-cast v0, Lcom/a/a/p;

    invoke-static {v2, v0, p1}, Lcom/a/a/n;->a(Ljava/lang/String;Lcom/a/a/p;[Ljava/lang/Object;)Lcom/a/a/n;

    move-result-object v0

    aput-object v0, v1, v3

    invoke-virtual {p0, v1}, Lcom/a/a/l;->b([Lcom/a/a/n;)V

    goto :goto_0

    :cond_2
    invoke-super {p0, p1}, Lcom/a/a/q;->a([Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public a_(J)Lcom/a/a/l;
    .locals 1

    invoke-super {p0, p1, p2}, Lcom/a/a/q;->d(J)Lcom/a/a/q;

    return-object p0
.end method

.method public synthetic b(J)Lcom/a/a/a;
    .locals 1

    invoke-virtual {p0, p1, p2}, Lcom/a/a/l;->a_(J)Lcom/a/a/l;

    move-result-object v0

    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/a/a/l;->p()Lcom/a/a/l;

    move-result-object v0

    return-object v0
.end method

.method public synthetic d(J)Lcom/a/a/q;
    .locals 1

    invoke-virtual {p0, p1, p2}, Lcom/a/a/l;->a_(J)Lcom/a/a/l;

    move-result-object v0

    return-object v0
.end method

.method public synthetic j()Lcom/a/a/a;
    .locals 1

    invoke-virtual {p0}, Lcom/a/a/l;->p()Lcom/a/a/l;

    move-result-object v0

    return-object v0
.end method

.method public k()V
    .locals 4

    invoke-virtual {p0}, Lcom/a/a/l;->n()V

    iget-object v0, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    array-length v1, v0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    aget-object v2, v2, v0

    iget-object v3, p0, Lcom/a/a/l;->r:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Lcom/a/a/n;->b(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public l()V
    .locals 4

    invoke-virtual {p0}, Lcom/a/a/l;->n()V

    iget-object v0, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    array-length v1, v0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    aget-object v2, v2, v0

    iget-object v3, p0, Lcom/a/a/l;->r:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Lcom/a/a/n;->c(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/a/a/l;->s:Ljava/lang/String;

    return-object v0
.end method

.method n()V
    .locals 4

    iget-boolean v0, p0, Lcom/a/a/l;->j:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/a/a/l;->t:Lcom/a/b/d;

    if-nez v0, :cond_0

    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/l;->r:Ljava/lang/Object;

    instance-of v0, v0, Landroid/view/View;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/a/a/l;->q:Ljava/util/Map;

    iget-object v1, p0, Lcom/a/a/l;->s:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/a/a/l;->q:Ljava/util/Map;

    iget-object v1, p0, Lcom/a/a/l;->s:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/b/d;

    invoke-virtual {p0, v0}, Lcom/a/a/l;->a(Lcom/a/b/d;)V

    :cond_0
    iget-object v0, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    array-length v1, v0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_1

    iget-object v2, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    aget-object v2, v2, v0

    iget-object v3, p0, Lcom/a/a/l;->r:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Lcom/a/a/n;->a(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-super {p0}, Lcom/a/a/q;->n()V

    :cond_2
    return-void
.end method

.method public o()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/a/a/l;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public p()Lcom/a/a/l;
    .locals 1

    invoke-super {p0}, Lcom/a/a/q;->q()Lcom/a/a/q;

    move-result-object v0

    check-cast v0, Lcom/a/a/l;

    return-object v0
.end method

.method public synthetic q()Lcom/a/a/q;
    .locals 1

    invoke-virtual {p0}, Lcom/a/a/l;->p()Lcom/a/a/l;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ObjectAnimator@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", target "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/a/a/l;->r:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    array-length v2, v2

    if-ge v0, v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n    "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/a/a/l;->k:[Lcom/a/a/n;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Lcom/a/a/n;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method
