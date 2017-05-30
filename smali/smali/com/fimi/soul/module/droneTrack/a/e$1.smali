.class Lcom/fimi/soul/module/droneTrack/a/e$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/droneTrack/a/e;->a([Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/String;

.field final synthetic b:Lcom/fimi/soul/module/droneTrack/a/e;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/droneTrack/a/e;[Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    iput-object p2, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->a:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/module/droneTrack/a/e;->a(Z)V

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v2, v1, Lcom/fimi/soul/module/droneTrack/a/e;->b:Ljava/util/LinkedHashMap;

    iget-object v1, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->a:[Ljava/lang/String;

    array-length v1, v1

    :goto_0
    if-ge v0, v1, :cond_4

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->a:[Ljava/lang/String;

    aget-object v2, v2, v0

    invoke-static {}, Lcom/fimi/soul/module/droneTrack/a/e;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/fimi/kernel/utils/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :try_start_0
    const-string v3, "fe"

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, " "

    const-string v5, ""

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x4

    const/4 v5, 0x6

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x10

    invoke-static {v4, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    const/4 v5, 0x6

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x4

    invoke-virtual {v3, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    const/4 v5, 0x0

    const-string v6, "fe"

    invoke-virtual {v2, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    add-int/lit8 v6, v6, -0x8

    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    new-instance v5, Lcom/fimi/soul/module/droneTrack/f;

    invoke-direct {v5, v3}, Lcom/fimi/soul/module/droneTrack/f;-><init>([C)V

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-static {v3}, Lcom/fimi/soul/module/droneTrack/a/e;->a(Lcom/fimi/soul/module/droneTrack/a/e;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-static {v3, v2}, Lcom/fimi/soul/module/droneTrack/a/e;->a(Lcom/fimi/soul/module/droneTrack/a/e;Ljava/lang/String;)Ljava/lang/String;

    :cond_0
    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    iget-object v6, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-virtual {v6, v4, v5}, Lcom/fimi/soul/module/droneTrack/a/e;->a(ILcom/fimi/soul/module/droneTrack/f;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/fimi/soul/module/droneTrack/a/e;->a(Lcom/fimi/soul/module/droneTrack/a/e;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-static {v3}, Lcom/fimi/soul/module/droneTrack/a/e;->a(Lcom/fimi/soul/module/droneTrack/a/e;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-static {v2}, Lcom/fimi/soul/module/droneTrack/a/e;->b(Lcom/fimi/soul/module/droneTrack/a/e;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-static {v2}, Lcom/fimi/soul/module/droneTrack/a/e;->b(Lcom/fimi/soul/module/droneTrack/a/e;)Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/fimi/soul/drone/h/a/e;

    if-eqz v2, :cond_1

    :cond_1
    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-static {v2}, Lcom/fimi/soul/module/droneTrack/a/e;->c(Lcom/fimi/soul/module/droneTrack/a/e;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-static {v3}, Lcom/fimi/soul/module/droneTrack/a/e;->b(Lcom/fimi/soul/module/droneTrack/a/e;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_3
    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    iget v4, v3, Lcom/fimi/soul/module/droneTrack/a/e;->a:I

    add-int/lit8 v4, v4, 0x1

    iput v4, v3, Lcom/fimi/soul/module/droneTrack/a/e;->a:I

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-static {v3, v2}, Lcom/fimi/soul/module/droneTrack/a/e;->a(Lcom/fimi/soul/module/droneTrack/a/e;Ljava/lang/String;)Ljava/lang/String;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-static {v3}, Lcom/fimi/soul/module/droneTrack/a/e;->c(Lcom/fimi/soul/module/droneTrack/a/e;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    iget-object v3, v3, Lcom/fimi/soul/module/droneTrack/a/e;->b:Ljava/util/LinkedHashMap;

    iget-object v4, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    iget v4, v4, Lcom/fimi/soul/module/droneTrack/a/e;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-static {v2}, Lcom/fimi/soul/module/droneTrack/a/e;->c(Lcom/fimi/soul/module/droneTrack/a/e;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->clear()V

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-static {v2}, Lcom/fimi/soul/module/droneTrack/a/e;->b(Lcom/fimi/soul/module/droneTrack/a/e;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-static {v2}, Lcom/fimi/soul/module/droneTrack/a/e;->c(Lcom/fimi/soul/module/droneTrack/a/e;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    invoke-static {v3}, Lcom/fimi/soul/module/droneTrack/a/e;->b(Lcom/fimi/soul/module/droneTrack/a/e;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/droneTrack/a/e$1;->b:Lcom/fimi/soul/module/droneTrack/a/e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/droneTrack/a/e;->a(Z)V

    return-void
.end method
