.class Lcom/fimi/soul/module/setting/newhand/c$9;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/setting/newhand/c;->b(ILcom/fimi/soul/module/setting/newhand/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/setting/newhand/c;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/setting/newhand/c;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/setting/newhand/c$9;->a:Lcom/fimi/soul/module/setting/newhand/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/newhand/c$9;->a:Lcom/fimi/soul/module/setting/newhand/c;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/newhand/c$9;->a:Lcom/fimi/soul/module/setting/newhand/c;

    invoke-static {v1}, Lcom/fimi/soul/module/setting/newhand/c;->c(Lcom/fimi/soul/module/setting/newhand/c;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/setting/newhand/c;->b(I)V

    return-void
.end method
