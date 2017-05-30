.class public Lcom/fimi/soul/module/setting/MapSettingFragment;
.super Landroid/support/v4/app/Fragment;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lcom/fimi/soul/biz/update/b$a;
.implements Lcom/fimi/soul/drone/d$b;
.implements Lcom/fimi/soul/module/setting/i$a;
.implements Lcom/fimi/soul/module/setting/i$b;
.implements Lcom/fimi/soul/module/setting/i$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/setting/MapSettingFragment$a;
    }
.end annotation


# static fields
.field private static final A:I = 0x0

.field private static final B:I = 0x2

.field private static final C:I = 0x1

.field private static final D:I = 0x3

.field private static final E:I = 0x5


# instance fields
.field private F:Lcom/fimi/soul/biz/manager/k;

.field private G:Z

.field private H:Z

.field private I:J

.field private J:Z

.field private K:Z

.field private L:Z

.field private M:Z

.field private N:Z

.field private O:Ljava/lang/String;

.field private P:Ljava/lang/String;

.field private Q:Landroid/os/Handler;

.field public a:Z

.field public b:Lcom/fimi/soul/biz/update/b;

.field c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/FirmwareInfo;",
            ">;"
        }
    .end annotation
.end field

.field d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/UpdateVersonBean;",
            ">;"
        }
    .end annotation
.end field

.field e:Lcom/fimi/soul/module/setting/newhand/d;

.field private f:Ljava/util/Observer;

.field private g:Landroid/widget/ListView;

.field private h:Lcom/fimi/soul/module/setting/i;

.field private i:Lcom/fimi/soul/b/b;

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/Setting;",
            ">;"
        }
    .end annotation
.end field

.field private k:Lcom/fimi/soul/entity/Setting;

.field private l:Landroid/content/Context;

.field private m:Lcom/fimi/soul/module/setting/MapSettingFragment$a;

.field private n:Landroid/widget/Button;

.field private o:Landroid/widget/TextView;

.field private p:Lcom/fimi/soul/drone/a;

.field private q:Lcom/fimi/soul/module/b/d;

.field private r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

.field private s:Lcom/fimi/kernel/utils/v;

.field private t:Lcom/fimi/soul/biz/camera/d;

.field private u:Lcom/fimi/soul/biz/manager/x;

.field private v:Z

.field private w:I

.field private x:I

.field private y:I

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    new-instance v0, Lcom/fimi/soul/module/setting/MapSettingFragment$1;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/setting/MapSettingFragment$1;-><init>(Lcom/fimi/soul/module/setting/MapSettingFragment;)V

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->f:Ljava/util/Observer;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    iput-boolean v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->a:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->c:Ljava/util/List;

    iput-boolean v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->v:Z

    iput v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->w:I

    iput v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->x:I

    iput v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->y:I

    iput-boolean v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->z:Z

    iput-boolean v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->H:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->I:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->J:Z

    iput-boolean v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->K:Z

    iput-boolean v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->L:Z

    iput-boolean v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->M:Z

    iput-boolean v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->N:Z

    const-string v0, "is_setting_enter"

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->O:Ljava/lang/String;

    const-string v0, "remodel"

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->P:Ljava/lang/String;

    new-instance v0, Lcom/fimi/soul/module/setting/MapSettingFragment$10;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/setting/MapSettingFragment$10;-><init>(Lcom/fimi/soul/module/setting/MapSettingFragment;)V

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->Q:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/setting/MapSettingFragment;I)I
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->w:I

    return p1
.end method

.method static synthetic a(Lcom/fimi/soul/module/setting/MapSettingFragment;)Lcom/fimi/soul/module/setting/i;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->h:Lcom/fimi/soul/module/setting/i;

    return-object v0
.end method

.method private a(Lcom/fimi/soul/drone/a;)V
    .locals 2

    new-instance v0, Lcom/fimi/soul/drone/c/a/a/bf;

    invoke-direct {v0}, Lcom/fimi/soul/drone/c/a/a/bf;-><init>()V

    const/16 v1, 0x73

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/bf;->d:B

    const/4 v1, 0x1

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/bf;->e:B

    const/4 v1, 0x0

    iput-byte v1, v0, Lcom/fimi/soul/drone/c/a/a/bf;->f:B

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/fimi/soul/drone/c/a/a/bf;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void
.end method

.method static synthetic b(Lcom/fimi/soul/module/setting/MapSettingFragment;I)I
    .locals 0

    iput p1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->x:I

    return p1
.end method

.method static synthetic b(Lcom/fimi/soul/module/setting/MapSettingFragment;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lcom/fimi/soul/module/setting/MapSettingFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->e()V

    return-void
.end method

.method static synthetic d(Lcom/fimi/soul/module/setting/MapSettingFragment;)Lcom/fimi/soul/module/setting/MapSettingFragment$a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->m:Lcom/fimi/soul/module/setting/MapSettingFragment$a;

    return-object v0
.end method

.method private d()Z
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic e(Lcom/fimi/soul/module/setting/MapSettingFragment;)Landroid/widget/ListView;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->g:Landroid/widget/ListView;

    return-object v0
.end method

.method private e()V
    .locals 5

    const v4, 0x7f0a0384

    const/4 v3, 0x2

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->o:Landroid/widget/TextView;

    const v1, 0x7f0a00fa

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->i:Lcom/fimi/soul/b/b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/b/b;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->p:Lcom/fimi/soul/drone/a;

    invoke-direct {v0, v1, v2}, Lcom/fimi/soul/b/b;-><init>(Landroid/content/Context;Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->i:Lcom/fimi/soul/b/b;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->i:Lcom/fimi/soul/b/b;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b;->a()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->i:Lcom/fimi/soul/b/b;

    invoke-virtual {v0}, Lcom/fimi/soul/b/b;->b()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->g:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->i:Lcom/fimi/soul/b/b;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->g:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->i:Lcom/fimi/soul/b/b;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->h:Lcom/fimi/soul/module/setting/i;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->g:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->h:Lcom/fimi/soul/module/setting/i;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->g:Landroid/widget/ListView;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setOverScrollMode(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->g:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->f()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->g:Landroid/widget/ListView;

    iget v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->w:I

    iget v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->x:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/ListView;->setSelectionFromTop(II)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->o:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    new-instance v0, Lcom/fimi/soul/module/setting/i;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->p:Lcom/fimi/soul/drone/a;

    invoke-direct {v0, v1, v2}, Lcom/fimi/soul/module/setting/i;-><init>(Landroid/content/Context;Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->h:Lcom/fimi/soul/module/setting/i;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->h:Lcom/fimi/soul/module/setting/i;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/module/setting/i;->a(Lcom/fimi/soul/module/setting/i$b;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->h:Lcom/fimi/soul/module/setting/i;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/module/setting/i;->a(Lcom/fimi/soul/module/setting/i$c;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->h:Lcom/fimi/soul/module/setting/i;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/module/setting/i;->a(Lcom/fimi/soul/module/setting/i$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->g:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->h:Lcom/fimi/soul/module/setting/i;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->g:Landroid/widget/ListView;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setOverScrollMode(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->g:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    const/4 v0, 0x0

    :goto_1
    invoke-static {}, Lcom/fimi/soul/module/setting/i$d;->values()[Lcom/fimi/soul/module/setting/i$d;

    move-result-object v1

    array-length v1, v1

    if-ge v0, v1, :cond_3

    new-instance v1, Lcom/fimi/soul/entity/Setting;

    invoke-direct {v1}, Lcom/fimi/soul/entity/Setting;-><init>()V

    iput-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->k:Lcom/fimi/soul/entity/Setting;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->k:Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v1, v0}, Lcom/fimi/soul/entity/Setting;->setId(I)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->k:Lcom/fimi/soul/entity/Setting;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->f:Ljava/util/Observer;

    invoke-virtual {v1, v2}, Lcom/fimi/soul/entity/Setting;->addObserver(Ljava/util/Observer;)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->k:Lcom/fimi/soul/entity/Setting;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->k:Lcom/fimi/soul/entity/Setting;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->f()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->g:Landroid/widget/ListView;

    new-instance v1, Lcom/fimi/soul/module/setting/MapSettingFragment$5;

    invoke-direct {v1, p0}, Lcom/fimi/soul/module/setting/MapSettingFragment$5;-><init>(Lcom/fimi/soul/module/setting/MapSettingFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    goto/16 :goto_0
.end method

.method static synthetic f(Lcom/fimi/soul/module/setting/MapSettingFragment;)Lcom/fimi/kernel/utils/v;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->s:Lcom/fimi/kernel/utils/v;

    return-object v0
.end method

.method private f()V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    iget-boolean v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->J:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->h:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    iget-boolean v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->L:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    iget-boolean v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->K:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->p:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    invoke-static {}, Lcom/fimi/soul/module/update/a/a;->a()Lcom/fimi/soul/module/update/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/a;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->c:Ljava/util/List;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->s:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "isfirstloading"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->F:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->F:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    invoke-static {v1}, Lcom/fimi/soul/base/a;->b(Landroid/content/Context;)Lcom/fimi/soul/entity/User;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/entity/User;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setContent(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->s:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "remodel"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->m:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0a029e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setContent(Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->p:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->p:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_2
    invoke-static {}, Lcom/fimi/soul/module/update/a/a;->a()Lcom/fimi/soul/module/update/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/a;->e()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->d:Ljava/util/List;

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->g()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->h:Lcom/fimi/soul/module/setting/i;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/setting/i;->a(Ljava/util/List;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->F:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->m:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0a029f

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setContent(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->b:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    goto :goto_2
.end method

.method static synthetic g(Lcom/fimi/soul/module/setting/MapSettingFragment;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    return-object v0
.end method

.method private g()V
    .locals 3

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->c:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->d()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->c:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->c:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0, v2}, Lcom/fimi/soul/entity/Setting;->setDisplayTv(Z)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->c:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setDisplayTv(Z)V

    goto :goto_0
.end method

.method static synthetic h(Lcom/fimi/soul/module/setting/MapSettingFragment;)Lcom/fimi/soul/biz/manager/x;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->u:Lcom/fimi/soul/biz/manager/x;

    return-object v0
.end method

.method private h()V
    .locals 5

    new-instance v0, Lcom/fimi/soul/view/i$a;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->p:Lcom/fimi/soul/drone/a;

    invoke-direct {v0, v1, v2}, Lcom/fimi/soul/view/i$a;-><init>(Landroid/content/Context;Lcom/fimi/soul/drone/a;)V

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/e/d;->q()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/fimi/soul/biz/e/d;->p()Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/i$a;->c(Ljava/lang/String;)Lcom/fimi/soul/view/i$a;

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v0, v2}, Lcom/fimi/soul/view/i$a;->d(Ljava/lang/String;)Lcom/fimi/soul/view/i$a;

    :cond_1
    const v1, 0x7f0a0103

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/setting/MapSettingFragment$8;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/setting/MapSettingFragment$8;-><init>(Lcom/fimi/soul/module/setting/MapSettingFragment;)V

    const v3, 0x7f0a017f

    invoke-virtual {p0, v3}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/fimi/soul/module/setting/MapSettingFragment$9;

    invoke-direct {v4, p0, v0}, Lcom/fimi/soul/module/setting/MapSettingFragment$9;-><init>(Lcom/fimi/soul/module/setting/MapSettingFragment;Lcom/fimi/soul/view/i$a;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/fimi/soul/view/i$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/i$a;

    invoke-virtual {v0}, Lcom/fimi/soul/view/i$a;->c()Lcom/fimi/soul/view/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/i;->show()V

    return-void
.end method

.method static synthetic i(Lcom/fimi/soul/module/setting/MapSettingFragment;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->M:Z

    return v0
.end method

.method static synthetic j(Lcom/fimi/soul/module/setting/MapSettingFragment;)Lcom/fimi/soul/drone/a;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->p:Lcom/fimi/soul/drone/a;

    return-object v0
.end method

.method static synthetic k(Lcom/fimi/soul/module/setting/MapSettingFragment;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->N:Z

    return v0
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->e:Lcom/fimi/soul/module/setting/newhand/d;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/module/setting/newhand/c;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->p:Lcom/fimi/soul/drone/a;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lcom/fimi/soul/module/setting/newhand/c;-><init>(Lcom/fimi/soul/drone/a;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->e:Lcom/fimi/soul/module/setting/newhand/d;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->e:Lcom/fimi/soul/module/setting/newhand/d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/newhand/d;->e()V

    return-void
.end method

.method public a(I)V
    .locals 3

    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->e:Lcom/fimi/soul/module/setting/newhand/d;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/setting/newhand/d;->a(Ljava/util/List;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->e:Lcom/fimi/soul/module/setting/newhand/d;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->F:Lcom/fimi/soul/biz/manager/k;

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/module/setting/newhand/d;->a(Ljava/util/List;Lcom/fimi/soul/biz/manager/k;)V

    goto :goto_0
.end method

.method public a(Lcom/fimi/kernel/view/button/SwitchButton;)V
    .locals 3

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->e:Lcom/fimi/soul/module/setting/newhand/d;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v1, p1, v0}, Lcom/fimi/soul/module/setting/newhand/d;->a(Lcom/fimi/kernel/view/button/SwitchButton;Lcom/fimi/soul/entity/Setting;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->h:Lcom/fimi/soul/module/setting/i;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i;->notifyDataSetChanged()V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->h:Lcom/fimi/soul/module/setting/i;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/setting/i;->a(Ljava/util/List;)V

    invoke-static {}, Lcom/fimi/soul/module/update/a/a;->a()Lcom/fimi/soul/module/update/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/update/a/a;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->c:Ljava/util/List;

    return-void
.end method

.method public a(Z)V
    .locals 4

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    const/4 v0, 0x2

    :goto_0
    new-instance v2, Lcom/fimi/soul/drone/c/a/a/bf;

    invoke-direct {v2}, Lcom/fimi/soul/drone/c/a/a/bf;-><init>()V

    const/16 v3, 0x74

    iput-byte v3, v2, Lcom/fimi/soul/drone/c/a/a/bf;->d:B

    iput-byte v1, v2, Lcom/fimi/soul/drone/c/a/a/bf;->e:B

    iput-byte v0, v2, Lcom/fimi/soul/drone/c/a/a/bf;->f:B

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->p:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-virtual {v2}, Lcom/fimi/soul/drone/c/a/a/bf;->a()Lcom/fimi/soul/drone/c/a/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a(Lcom/fimi/soul/drone/c/a/c;)V

    return-void

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()Z
    .locals 2

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->a:Z

    if-eqz v1, :cond_0

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->a:Z

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->t:Lcom/fimi/soul/biz/camera/d;

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/d;->r()Lcom/fimi/soul/biz/camera/c/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/camera/c/c;->e()V

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->e()V

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->m:Lcom/fimi/soul/module/setting/MapSettingFragment$a;

    invoke-interface {v0}, Lcom/fimi/soul/module/setting/MapSettingFragment$a;->c()V

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    packed-switch p1, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    const-string v0, "content"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->p:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setContent(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->h:Lcom/fimi/soul/module/setting/i;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i;->notifyDataSetChanged()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_0
    .end packed-switch
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    iput-object p1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    move-object v0, p1

    check-cast v0, Lcom/fimi/soul/module/setting/MapSettingFragment$a;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->m:Lcom/fimi/soul/module/setting/MapSettingFragment$a;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/base/DroidPlannerApp;

    iget-object v0, v0, Lcom/fimi/soul/base/DroidPlannerApp;->a:Lcom/fimi/soul/drone/a;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->p:Lcom/fimi/soul/drone/a;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const v0, 0x7f040026

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    const v0, 0x7f0f0114

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v2, 0x7f0f0427

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->n:Landroid/widget/Button;

    const v0, 0x7f0f011d

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->g:Landroid/widget/ListView;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->r:Lcom/fimi/kernel/view/percent/PercentRelativeLayout;

    const v2, 0x7f0f0357

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/percent/PercentRelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->s:Lcom/fimi/kernel/utils/v;

    invoke-static {}, Lcom/fimi/soul/biz/camera/b;->a()Lcom/fimi/soul/biz/camera/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/camera/b;->d()Lcom/fimi/soul/biz/camera/b/a;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/biz/camera/d;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->t:Lcom/fimi/soul/biz/camera/d;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->n:Landroid/widget/Button;

    new-instance v2, Lcom/fimi/soul/module/setting/MapSettingFragment$3;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/setting/MapSettingFragment$3;-><init>(Lcom/fimi/soul/module/setting/MapSettingFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v0, Lcom/fimi/soul/biz/update/b;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    invoke-direct {v0, v2}, Lcom/fimi/soul/biz/update/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->b:Lcom/fimi/soul/biz/update/b;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->b:Lcom/fimi/soul/biz/update/b;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/biz/update/b;->a(Lcom/fimi/soul/biz/update/b$a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->b:Lcom/fimi/soul/biz/update/b;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/update/b;->a()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/x;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/x;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->u:Lcom/fimi/soul/biz/manager/x;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/k;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/k;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->F:Lcom/fimi/soul/biz/manager/k;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/utils/ao;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->p:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->F:Lcom/fimi/soul/biz/manager/k;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    invoke-static {v2}, Lcom/fimi/soul/base/a;->b(Landroid/content/Context;)Lcom/fimi/soul/entity/User;

    move-result-object v2

    sget-object v3, Lcom/fimi/soul/biz/manager/k;->a:Ljava/lang/String;

    new-instance v4, Lcom/fimi/soul/module/setting/MapSettingFragment$4;

    invoke-direct {v4, p0}, Lcom/fimi/soul/module/setting/MapSettingFragment$4;-><init>(Lcom/fimi/soul/module/setting/MapSettingFragment;)V

    invoke-virtual {v0, v2, v3, v4}, Lcom/fimi/soul/biz/manager/k;->a(Lcom/fimi/soul/entity/User;Ljava/lang/String;Lcom/fimi/soul/biz/m/k;)V

    :cond_0
    return-object v1
.end method

.method public onDroneEvent(Lcom/fimi/soul/drone/d$a;Lcom/fimi/soul/drone/a;)V
    .locals 10

    const/high16 v7, 0x3f800000    # 1.0f

    const-wide/16 v8, 0x3e8

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_14

    sget-object v0, Lcom/fimi/soul/module/setting/MapSettingFragment$2;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    sget-object v0, Lcom/fimi/soul/drone/d$a;->ah:Lcom/fimi/soul/drone/d$a;

    if-ne p1, v0, :cond_2

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->L()Lcom/fimi/soul/drone/h/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/c;->b()B

    move-result v0

    const/16 v1, 0x72

    if-ne v0, v1, :cond_2

    invoke-static {}, Lcom/fimi/soul/module/calibcompass/a;->a()Lcom/fimi/soul/module/calibcompass/a;

    move-result-object v0

    const-string v1, "98"

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/calibcompass/a;->a(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->L()Lcom/fimi/soul/drone/h/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/c;->d()B

    move-result v0

    if-ne v0, v6, :cond_15

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->s:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "remodel"

    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->m:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0a029f

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setContent(Ljava/lang/String;)V

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->h:Lcom/fimi/soul/module/setting/i;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->h:Lcom/fimi/soul/module/setting/i;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->m:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    iget-object v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->g:Landroid/widget/ListView;

    sget-object v3, Lcom/fimi/soul/module/setting/i$d;->m:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v3}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/module/setting/i;->a(ILandroid/view/View;)V

    :cond_2
    sget-object v0, Lcom/fimi/soul/module/setting/MapSettingFragment$2;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_1

    :cond_3
    :goto_2
    :pswitch_1
    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->b:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    goto/16 :goto_0

    :pswitch_3
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->d()B

    move-result v0

    const/16 v1, 0x33

    if-ne v0, v1, :cond_7

    invoke-static {}, Lcom/fimi/kernel/c;->b()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->b()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/fimi/kernel/c;->b()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->b()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/fimi/kernel/c;->b()Lcom/fimi/kernel/view/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/kernel/view/b;->c()V

    :cond_4
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->f()B

    move-result v0

    if-ne v0, v5, :cond_5

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->i()B

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const v1, 0x7f0a037d

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->Q:Landroid/os/Handler;

    invoke-virtual {v0, v5, v8, v9}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->Q:Landroid/os/Handler;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v5, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->M:Z

    :goto_3
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->e()B

    move-result v0

    if-nez v0, :cond_c

    iput-boolean v5, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->J:Z

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->K:Z

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->L:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->h:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->e:Lcom/fimi/soul/module/setting/newhand/d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/newhand/d;->e()V

    :cond_5
    :goto_4
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->f()B

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_7

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->i()B

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const v1, 0x7f0a037d

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->Q:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1, v8, v9}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->Q:Landroid/os/Handler;

    const/4 v1, 0x5

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->N:Z

    :goto_5
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->g()B

    move-result v0

    if-ne v0, v6, :cond_6

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->h()F

    move-result v0

    cmpl-float v0, v0, v7

    if-nez v0, :cond_e

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->J:Z

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->K:Z

    iput-boolean v5, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->L:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->h:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    :cond_6
    :goto_6
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->g()B

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_7

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->h()F

    move-result v0

    cmpl-float v0, v0, v7

    if-nez v0, :cond_f

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->J:Z

    iput-boolean v5, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->K:Z

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->L:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->h:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iput-boolean v5, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->H:Z

    invoke-virtual {p0, v5}, Lcom/fimi/soul/module/setting/MapSettingFragment;->a(Z)V

    invoke-direct {p0, p2}, Lcom/fimi/soul/module/setting/MapSettingFragment;->a(Lcom/fimi/soul/drone/a;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->p:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const v2, 0x7f0a0208

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setContent(Ljava/lang/String;)V

    :cond_7
    :goto_7
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->d()B

    move-result v0

    const/16 v1, 0x22

    if-ne v0, v1, :cond_0

    iput-boolean v5, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->M:Z

    iput-boolean v5, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->N:Z

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->f()B

    move-result v0

    if-eq v0, v5, :cond_8

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->f()B

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    :cond_8
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->f()B

    move-result v0

    if-ne v0, v5, :cond_9

    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->e()B

    move-result v0

    if-nez v0, :cond_10

    iput-boolean v5, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->J:Z

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->K:Z

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->L:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->h:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->p:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->H:Z

    invoke-virtual {p0, v4}, Lcom/fimi/soul/module/setting/MapSettingFragment;->a(Z)V

    invoke-direct {p0, p2}, Lcom/fimi/soul/module/setting/MapSettingFragment;->a(Lcom/fimi/soul/drone/a;)V

    :cond_9
    :goto_8
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->h()F

    move-result v0

    float-to-int v0, v0

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v5, :cond_a

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->K:Z

    :cond_a
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->h()F

    move-result v0

    float-to-int v0, v0

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v6, :cond_11

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->J:Z

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->K:Z

    iput-boolean v5, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->L:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->h:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    :goto_9
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->al()Lcom/fimi/soul/drone/h/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/ac;->h()F

    move-result v0

    float-to-int v0, v0

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_12

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->J:Z

    if-nez v0, :cond_0

    iput-boolean v5, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->H:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->p:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const v2, 0x7f0a0208

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setContent(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->p:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->J:Z

    iput-boolean v5, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->K:Z

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->L:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->h:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    goto/16 :goto_0

    :cond_b
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const v1, 0x7f0a037c

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    goto/16 :goto_3

    :cond_c
    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->J:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    goto/16 :goto_4

    :cond_d
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const v1, 0x7f0a037c

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    goto/16 :goto_5

    :cond_e
    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->L:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->h:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    goto/16 :goto_6

    :cond_f
    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->K:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->p:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    goto/16 :goto_7

    :cond_10
    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->J:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    goto/16 :goto_8

    :cond_11
    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->L:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->h:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    goto/16 :goto_9

    :cond_12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->I:J

    sub-long/2addr v0, v2

    cmp-long v0, v0, v8

    if-ltz v0, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->I:J

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->p:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->H:Z

    invoke-virtual {p0, v4}, Lcom/fimi/soul/module/setting/MapSettingFragment;->a(Z)V

    invoke-direct {p0, p2}, Lcom/fimi/soul/module/setting/MapSettingFragment;->a(Lcom/fimi/soul/drone/a;)V

    goto/16 :goto_0

    :pswitch_4
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->L()Lcom/fimi/soul/drone/h/c;

    move-result-object v0

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/c;->b()B

    move-result v1

    const/16 v2, 0x73

    if-ne v1, v2, :cond_13

    iget-boolean v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->H:Z

    if-nez v1, :cond_3

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/c;->c()B

    move-result v1

    if-ne v1, v6, :cond_13

    iget-byte v0, v0, Lcom/fimi/soul/drone/h/c;->d:B

    packed-switch v0, :pswitch_data_2

    :cond_13
    :goto_a
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->h:Lcom/fimi/soul/module/setting/i;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i;->notifyDataSetChanged()V

    goto/16 :goto_0

    :pswitch_5
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->p:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    const v1, 0x7f0a026e

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setContent(Ljava/lang/String;)V

    goto :goto_a

    :pswitch_6
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->p:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    const v1, 0x7f0a0189

    invoke-virtual {p0, v1}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setContent(Ljava/lang/String;)V

    goto :goto_a

    :cond_14
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->b:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    sget-object v0, Lcom/fimi/soul/module/setting/MapSettingFragment$2;->a:[I

    invoke-virtual {p1}, Lcom/fimi/soul/drone/d$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_3

    :pswitch_7
    goto/16 :goto_0

    :pswitch_8
    invoke-direct {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->g()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->b:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setIsOPen(Ljava/lang/Boolean;)V

    goto/16 :goto_0

    :cond_15
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->L()Lcom/fimi/soul/drone/h/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/drone/h/c;->d()B

    move-result v0

    if-ne v0, v5, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->s:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "remodel"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->m:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0a029e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/entity/Setting;->setContent(Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_9
    invoke-virtual {p2}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_16

    iget-boolean v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->z:Z

    if-eqz v0, :cond_3

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->z:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->e:Lcom/fimi/soul/module/setting/newhand/d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/newhand/d;->e()V

    goto/16 :goto_2

    :cond_16
    iput-boolean v5, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->z:Z

    goto/16 :goto_2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_9
        :pswitch_1
        :pswitch_1
        :pswitch_9
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_0
        :pswitch_7
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    const/16 v7, 0xbb8

    const v6, 0x7f0f01b2

    const/4 v5, 0x0

    const/4 v4, 0x1

    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->b:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_2

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->b:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->s:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "is_setting_enter"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/login/LoginActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "login"

    invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {p0, v0, v5}, Lcom/fimi/soul/module/setting/MapSettingFragment;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_2
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->c:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->c:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->d()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, Lcom/fimi/kernel/c/c;->a()Lcom/fimi/kernel/c/c;

    move-result-object v0

    const-string v1, "sp_need_down_firmwares"

    iget-object v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->d:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/fimi/kernel/c/c;->a(Ljava/lang/String;Ljava/util/List;)V

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/update/FindOnlineFirmwareAvtivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->startActivity(Landroid/content/Intent;)V

    :cond_3
    :goto_1
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->d:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_4

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/fimi/soul/module/calibcompass/CaliCompassActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "isdirectcalicompass"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->startActivity(Landroid/content/Intent;)V

    :cond_4
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->t:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_5

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/setting/GimalCalibration/GimalCalibrationActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->startActivity(Landroid/content/Intent;)V

    :cond_5
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->e:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_6

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->s:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "is_setting_enter"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/setting/newhand/NewHandActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->startActivity(Landroid/content/Intent;)V

    :cond_6
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_7

    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/button/SwitchButton;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->e:Lcom/fimi/soul/module/setting/newhand/d;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v3, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v3}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v3

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v2, v0, v1}, Lcom/fimi/soul/module/setting/newhand/d;->a(Lcom/fimi/kernel/view/button/SwitchButton;Lcom/fimi/soul/entity/Setting;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->h:Lcom/fimi/soul/module/setting/i;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i;->notifyDataSetChanged()V

    :cond_7
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->g:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_8

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/setting/newhand/GpsSettingActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "newhand_mode"

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v3, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v3}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const-string v2, "optical_flow_mode"

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v3, Lcom/fimi/soul/module/setting/i$d;->h:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v3}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const-string v2, "force_attitude_mode"

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v3, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v3}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_8
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->x:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_9

    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/button/SwitchButton;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    invoke-static {v1}, Lcom/fimi/soul/biz/manager/o;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/o;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/soul/biz/manager/o;->e()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-virtual {v0, v5, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/o;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/o;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/fimi/soul/biz/manager/o;->f(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "Amptype"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_9
    :goto_2
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->j:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_a

    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v1

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->d()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/fimi/kernel/utils/v;->a(Z)V

    invoke-virtual {v0, v5, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    :goto_3
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    check-cast v0, Lcom/fimi/soul/module/droneui/FlightActivity;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneui/FlightActivity;->h()V

    :cond_a
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->l:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_b

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/remote/RemoteCalibration;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->startActivity(Landroid/content/Intent;)V

    :cond_b
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->m:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_11

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->p:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->U()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const v2, 0x7f0a011a

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/fimi/kernel/utils/z;->b:I

    invoke-static {v0, v1, v2}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;Ljava/lang/String;I)V

    goto/16 :goto_0

    :cond_c
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->c:Ljava/util/List;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_d

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/update/FindNewFirmwareAvtivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_1

    :cond_d
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const v1, 0x7f0a0455

    invoke-static {v0, v1}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;I)V

    goto/16 :goto_1

    :cond_e
    invoke-virtual {v0, v4, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/o;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/o;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/fimi/soul/biz/manager/o;->f(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "Amptype"

    const/4 v2, 0x2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto/16 :goto_2

    :cond_f
    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/fimi/kernel/utils/v;->a(Z)V

    invoke-virtual {v0, v4, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    goto/16 :goto_3

    :cond_10
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/remote/RemoteModelActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->startActivity(Landroid/content/Intent;)V

    :cond_11
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->v:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_12

    iput-boolean v4, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->a:Z

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->e()V

    :cond_12
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->E:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_13

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/push/HistoryMessageActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->startActivity(Landroid/content/Intent;)V

    :cond_13
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->F:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_14

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->s:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "isfirstloading"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1e

    new-instance v0, Lcom/fimi/soul/view/f$a;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/fimi/soul/view/f$a;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const v2, 0x7f0a0286

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$a;->c(I)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e006e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/fimi/soul/view/f$a;->a(I)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const v2, 0x7f0a0190

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/setting/MapSettingFragment$7;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/setting/MapSettingFragment$7;-><init>(Lcom/fimi/soul/module/setting/MapSettingFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->b(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const v2, 0x7f0a0103

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/fimi/soul/module/setting/MapSettingFragment$6;

    invoke-direct {v2, p0}, Lcom/fimi/soul/module/setting/MapSettingFragment$6;-><init>(Lcom/fimi/soul/module/setting/MapSettingFragment;)V

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/f$a;->a(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/fimi/soul/view/f$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f$a;->a()Lcom/fimi/soul/view/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/f;->show()V

    :cond_14
    :goto_4
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->C:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_15

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/setting/UserFeedBackActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->startActivity(Landroid/content/Intent;)V

    :cond_15
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->D:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_16

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/setting/AboutActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->startActivity(Landroid/content/Intent;)V

    :cond_16
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->r:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_17

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/droneui/BatteryInfoActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->startActivity(Landroid/content/Intent;)V

    :cond_17
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->h:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_18

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->e:Lcom/fimi/soul/module/setting/newhand/d;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->F:Lcom/fimi/soul/biz/manager/k;

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/module/setting/newhand/d;->a(Ljava/util/List;Lcom/fimi/soul/biz/manager/k;)V

    :cond_18
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_19

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->e:Lcom/fimi/soul/module/setting/newhand/d;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/fimi/soul/module/setting/newhand/d;->a(Ljava/util/List;)V

    :cond_19
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->A:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_1a

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/setting/FlyRecordActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->startActivity(Landroid/content/Intent;)V

    :cond_1a
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->B:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_1b

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/setting/FlyLogsActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->startActivity(Landroid/content/Intent;)V

    :cond_1b
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->o:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_1c

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/paircode/PairCodeActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->startActivity(Landroid/content/Intent;)V

    :cond_1c
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->p:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_1d

    new-instance v1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/setting/RightRollerSetActivity;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "GPS_ATTI"

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v3, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v3}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const-string v2, "curModel"

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->j:Ljava/util/List;

    sget-object v3, Lcom/fimi/soul/module/setting/i$d;->p:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v3}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/16 v2, 0x64

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_1d
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->n:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_20

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->p:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->T()Lcom/fimi/soul/drone/droneconnection/connection/f$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/fimi/soul/drone/droneconnection/connection/f$a;->a()Z

    move-result v0

    if-eqz v0, :cond_21

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->p:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0}, Lcom/fimi/soul/drone/a;->ac()Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a0331

    invoke-static {v0, v1, v7}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto/16 :goto_0

    :cond_1e
    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->s:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "is_setting_enter"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    const-class v2, Lcom/fimi/soul/module/login/LoginActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "login"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_4

    :cond_1f
    invoke-direct {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->h()V

    :cond_20
    :goto_5
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->y:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p3, v0, :cond_0

    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/button/SwitchButton;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->s:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "Map_Code_Correction"

    invoke-interface {v1, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {}, Lcom/fimi/soul/biz/n/a;->a()Lcom/fimi/soul/biz/n/a;

    move-result-object v2

    if-nez v1, :cond_22

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->s:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v3, "Map_Code_Correction"

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-virtual {v0, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->setSwitchState(Z)V

    invoke-virtual {v2, v5}, Lcom/fimi/soul/biz/n/a;->a(Z)V

    goto/16 :goto_0

    :cond_21
    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f0a0138

    invoke-static {v0, v1, v7}, Lcom/fimi/kernel/utils/z;->a(Landroid/content/Context;II)V

    goto :goto_5

    :cond_22
    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->s:Lcom/fimi/kernel/utils/v;

    invoke-virtual {v1}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v3, "Map_Code_Correction"

    invoke-interface {v1, v3, v5}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-virtual {v0, v5}, Lcom/fimi/kernel/view/button/SwitchButton;->setSwitchState(Z)V

    invoke-virtual {v2, v4}, Lcom/fimi/soul/biz/n/a;->a(Z)V

    goto/16 :goto_0
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    return-void
.end method

.method public onStart()V
    .locals 5

    const/4 v4, 0x1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStart()V

    invoke-direct {p0}, Lcom/fimi/soul/module/setting/MapSettingFragment;->e()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->p:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->a(Lcom/fimi/soul/drone/d$b;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->p:Lcom/fimi/soul/drone/a;

    invoke-static {v0}, Lcom/fimi/soul/module/b/d;->a(Lcom/fimi/soul/drone/a;)Lcom/fimi/soul/module/b/d;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->q:Lcom/fimi/soul/module/b/d;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->q:Lcom/fimi/soul/module/b/d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/b/d;->g()V

    invoke-static {}, Lcom/fimi/soul/biz/e/d;->a()Lcom/fimi/soul/biz/e/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/e/d;->k()Z

    move-result v0

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->G:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->e:Lcom/fimi/soul/module/setting/newhand/d;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/module/setting/newhand/c;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->p:Lcom/fimi/soul/drone/a;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->l:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lcom/fimi/soul/module/setting/newhand/c;-><init>(Lcom/fimi/soul/drone/a;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->e:Lcom/fimi/soul/module/setting/newhand/d;

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->M:Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->e:Lcom/fimi/soul/module/setting/newhand/d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/newhand/d;->e()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->Q:Landroid/os/Handler;

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->Q:Landroid/os/Handler;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    const-string v0, "is_setting_enter"

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->O:Ljava/lang/String;

    const-string v0, "remodel"

    iput-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->P:Ljava/lang/String;

    return-void
.end method

.method public onStop()V
    .locals 2

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->p:Lcom/fimi/soul/drone/a;

    invoke-virtual {v0, p0}, Lcom/fimi/soul/drone/a;->b(Lcom/fimi/soul/drone/d$b;)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->b:Lcom/fimi/soul/biz/update/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->b:Lcom/fimi/soul/biz/update/b;

    invoke-virtual {v0}, Lcom/fimi/soul/biz/update/b;->b()Lcom/fimi/soul/biz/update/b$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/MapSettingFragment;->b:Lcom/fimi/soul/biz/update/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/update/b;->a(Lcom/fimi/soul/biz/update/b$b;)V

    :cond_0
    return-void
.end method
