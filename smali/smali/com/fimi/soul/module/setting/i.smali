.class public Lcom/fimi/soul/module/setting/i;
.super Landroid/widget/BaseAdapter;

# interfaces
.implements Lcom/fimi/kernel/view/button/SwitchButton$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/setting/i$e;,
        Lcom/fimi/soul/module/setting/i$a;,
        Lcom/fimi/soul/module/setting/i$c;,
        Lcom/fimi/soul/module/setting/i$b;,
        Lcom/fimi/soul/module/setting/i$d;
    }
.end annotation


# static fields
.field public static final b:Ljava/lang/String; = "100"


# instance fields
.field public a:Lcom/fimi/soul/module/setting/i$c;

.field private c:Landroid/content/Context;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/Setting;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/fimi/soul/drone/a;

.field private f:Lcom/fimi/soul/module/setting/i$b;

.field private g:Lcom/fimi/soul/module/update/a/b;

.field private h:Lcom/fimi/soul/biz/manager/k;

.field private i:Lcom/fimi/soul/module/setting/i$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/fimi/soul/drone/a;)V
    .locals 3

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    iput-object p1, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    iput-object p2, p0, Lcom/fimi/soul/module/setting/i;->e:Lcom/fimi/soul/drone/a;

    invoke-static {p1}, Lcom/fimi/soul/biz/manager/k;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/k;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/setting/i;->h:Lcom/fimi/soul/biz/manager/k;

    invoke-static {}, Lcom/fimi/kernel/c;->c()Lcom/fimi/kernel/c/a;

    move-result-object v0

    const-string v1, "sp_firmware_cache"

    const-class v2, Lcom/fimi/soul/module/update/a/b;

    invoke-interface {v0, v1, v2}, Lcom/fimi/kernel/c/a;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/update/a/b;

    iput-object v0, p0, Lcom/fimi/soul/module/setting/i;->g:Lcom/fimi/soul/module/update/a/b;

    return-void
.end method

.method static synthetic a(Lcom/fimi/soul/module/setting/i;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    return-object v0
.end method

.method private a(Lcom/fimi/soul/module/setting/i$e;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 5

    const v4, 0x7f0e0123

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v2, 0x4

    iget-object v0, p1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    const v1, 0x7f0202f1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    iget-object v0, p1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/module/setting/i$e;->h:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/module/setting/i$e;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/module/setting/i$e;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/module/setting/i$e;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p1, Lcom/fimi/soul/module/setting/i$e;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p1, Lcom/fimi/soul/module/setting/i$e;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e0124

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p1, Lcom/fimi/soul/module/setting/i$e;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0e0125

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, p1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/view/button/SwitchButton;->setAlpha(F)V

    iget-object v0, p1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900f5

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v0, p1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public a(ILandroid/view/View;)V
    .locals 2

    if-nez p2, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/fimi/soul/module/setting/i$e;

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/setting/i$e;

    iget-object v1, v0, Lcom/fimi/soul/module/setting/i$e;->g:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public a(Landroid/view/View;Z)V
    .locals 6

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->x:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/o;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/manager/o;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/o;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/o;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/fimi/soul/biz/manager/o;->f(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "Amptype"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->j:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->d()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/fimi/kernel/utils/v;->a(Z)V

    :goto_1
    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    check-cast v0, Lcom/fimi/soul/module/droneui/FlightActivity;

    invoke-virtual {v0}, Lcom/fimi/soul/module/droneui/FlightActivity;->h()V

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/button/SwitchButton;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/i;->f:Lcom/fimi/soul/module/setting/i$b;

    invoke-interface {v1, v0}, Lcom/fimi/soul/module/setting/i$b;->a(Lcom/fimi/kernel/view/button/SwitchButton;)V

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_8

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/button/SwitchButton;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v1}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v0, v4, v3}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    :goto_2
    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

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

    if-eqz v0, :cond_7

    :cond_3
    :goto_3
    return-void

    :cond_4
    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/o;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/o;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/fimi/soul/biz/manager/o;->f(Z)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "Amptype"

    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto/16 :goto_0

    :cond_5
    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/fimi/kernel/utils/v;->a(Z)V

    goto/16 :goto_1

    :cond_6
    invoke-virtual {v0, v3, v3}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    goto :goto_2

    :cond_7
    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->a:Lcom/fimi/soul/module/setting/i$c;

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Lcom/fimi/soul/module/setting/i$c;->a(I)V

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/i;->notifyDataSetChanged()V

    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->h:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_9

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/fimi/kernel/view/button/SwitchButton;

    iget-object v1, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->h:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v1}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v0, v4, v3}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    :goto_4
    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->a:Lcom/fimi/soul/module/setting/i$c;

    invoke-interface {v0, v5}, Lcom/fimi/soul/module/setting/i$c;->a(I)V

    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lcom/fimi/soul/module/setting/i$d;->y:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v1}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v1

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->e:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {}, Lcom/fimi/soul/biz/n/a;->a()Lcom/fimi/soul/biz/n/a;

    move-result-object v1

    const-string v2, "Map_Code_Correction"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "Map_Code_Correction"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-virtual {v1, v4}, Lcom/fimi/soul/biz/n/a;->a(Z)V

    goto/16 :goto_3

    :cond_a
    invoke-virtual {v0, v3, v3}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    goto :goto_4

    :cond_b
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "Map_Code_Correction"

    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-virtual {v1, v3}, Lcom/fimi/soul/biz/n/a;->a(Z)V

    goto/16 :goto_3
.end method

.method public a(Lcom/fimi/soul/module/setting/i$a;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/setting/i;->i:Lcom/fimi/soul/module/setting/i$a;

    return-void
.end method

.method public a(Lcom/fimi/soul/module/setting/i$b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/setting/i;->f:Lcom/fimi/soul/module/setting/i$b;

    return-void
.end method

.method public a(Lcom/fimi/soul/module/setting/i$c;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/setting/i;->a:Lcom/fimi/soul/module/setting/i$c;

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/entity/Setting;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    invoke-virtual {p0}, Lcom/fimi/soul/module/setting/i;->notifyDataSetChanged()V

    return-void
.end method

.method public getCount()I
    .locals 1

    invoke-static {}, Lcom/fimi/soul/module/setting/i$d;->values()[Lcom/fimi/soul/module/setting/i$d;

    move-result-object v0

    array-length v0, v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    const v8, 0x7f0e0121

    const v7, 0x7f0e00c3

    const v6, 0x3e99999a    # 0.3f

    const/4 v5, 0x4

    const/4 v4, 0x0

    if-nez p2, :cond_1

    new-instance v0, Lcom/fimi/soul/module/setting/i$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/fimi/soul/module/setting/i$e;-><init>(Lcom/fimi/soul/module/setting/i;Lcom/fimi/soul/module/setting/i$1;)V

    invoke-virtual {v0, p3}, Lcom/fimi/soul/module/setting/i$e;->a(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v1, v0

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    if-nez v0, :cond_2

    :cond_0
    :goto_1
    return-object p2

    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/module/setting/i$e;

    move-object v1, v0

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/fimi/soul/module/setting/i;->a(Lcom/fimi/soul/module/setting/i$e;Landroid/view/ViewGroup$LayoutParams;)V

    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->a:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_3

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    const v2, 0x7f0a01ce

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    :cond_3
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->b:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_5

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->b:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setAlpha(F)V

    :cond_4
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f02015a

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a0135

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_5
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->c:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_8

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->c:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setAlpha(F)V

    :cond_6
    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->c:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->c:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->isDisplayTv()Z

    move-result v0

    if-eqz v0, :cond_2b

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->g:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0a02ac

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_7
    :goto_2
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f0201ad

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a032f

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_8
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->d:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_9

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f020159

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a0122

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_9
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->e:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_a

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f02031f

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a02b3

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_a
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_b

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->d:Landroid/widget/TextView;

    const v2, 0x7f0a02b5

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->e:Landroid/widget/TextView;

    const v2, 0x7f0a02ca

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f020163

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2c

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    :goto_3
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->setAlpha(F)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->setTag(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, p0}, Lcom/fimi/kernel/view/button/SwitchButton;->setOnSwitchListener(Lcom/fimi/kernel/view/button/SwitchButton$a;)V

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0900f6

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v2, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_b
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->g:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_d

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->d:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->e:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setAlpha(F)V

    :cond_c
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->d:Landroid/widget/TextView;

    const v2, 0x7f0a020a

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->e:Landroid/widget/TextView;

    const v2, 0x7f0a02a7

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f020299

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0900f6

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v2, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_d
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->h:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_f

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2d

    :cond_e
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->d:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->e:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v6}, Lcom/fimi/kernel/view/button/SwitchButton;->setAlpha(F)V

    :goto_4
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->h:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->setTag(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, p0}, Lcom/fimi/kernel/view/button/SwitchButton;->setOnSwitchListener(Lcom/fimi/kernel/view/button/SwitchButton$a;)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->d:Landroid/widget/TextView;

    const v2, 0x7f0a02ea

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->e:Landroid/widget/TextView;

    const v2, 0x7f0a02a7

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->h:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2e

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    :goto_5
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f02029b

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0900f6

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v2, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_f
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_10

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->f:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2f

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->d:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->e:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v6}, Lcom/fimi/kernel/view/button/SwitchButton;->setAlpha(F)V

    :goto_6
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->d:Landroid/widget/TextView;

    const v2, 0x7f0a01ef

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->e:Landroid/widget/TextView;

    const v2, 0x7f0a02a7

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_30

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    :goto_7
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->i:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->setTag(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, p0}, Lcom/fimi/kernel/view/button/SwitchButton;->setOnSwitchListener(Lcom/fimi/kernel/view/button/SwitchButton$a;)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f0202a5

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0900f6

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v2, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_10
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->j:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_11

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f0201b3

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a039d

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->setVisibility(I)V

    invoke-static {}, Lcom/fimi/kernel/c;->e()Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->d()Z

    move-result v0

    if-eqz v0, :cond_31

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    :goto_8
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, p0}, Lcom/fimi/kernel/view/button/SwitchButton;->setOnSwitchListener(Lcom/fimi/kernel/view/button/SwitchButton$a;)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->j:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->setTag(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_11
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->k:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_12

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    const v2, 0x7f0a0347

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    :cond_12
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->l:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_14

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->l:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setAlpha(F)V

    :cond_13
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f02040b

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a00dd

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_14
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->m:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_15

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f0203fe

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a03fa

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v2, v1, Lcom/fimi/soul/module/setting/i$e;->g:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v3, Lcom/fimi/soul/module/setting/i$d;->m:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v3}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_15
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->q:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_16

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    const v2, 0x7f0a00bd

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    :cond_16
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->p:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_17

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a0356

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f0202a6

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v2, v1, Lcom/fimi/soul/module/setting/i$e;->g:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v3, Lcom/fimi/soul/module/setting/i$d;->p:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v3}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_17
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->r:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_18

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f02027c

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a00c4

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_18
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->s:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_19

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    const v2, 0x7f0a0200

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    :cond_19
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->t:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_1a

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f0201c6

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a0201

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_1a
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->w:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_1b

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    const v2, 0x7f0a0290

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    :cond_1b
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->x:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_1c

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f0203c3

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a035b

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/soul/biz/manager/o;->a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/manager/o;->e()Z

    move-result v0

    if-eqz v0, :cond_32

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    :goto_9
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, p0}, Lcom/fimi/kernel/view/button/SwitchButton;->setOnSwitchListener(Lcom/fimi/kernel/view/button/SwitchButton$a;)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->x:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->setTag(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1c
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->u:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_1d

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    const v2, 0x7f0a00f2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    :cond_1d
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->v:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_1e

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f02010c

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a00fa

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_1e
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->z:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_1f

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    const v2, 0x7f0a00a4

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    :cond_1f
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->A:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_20

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f020293

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a01d1

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_20
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->B:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_21

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f020291

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a01dc

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_21
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->F:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_22

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->F:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_33

    iget-object v2, v1, Lcom/fimi/soul/module/setting/i$e;->g:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v3, Lcom/fimi/soul/module/setting/i$d;->F:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v3}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_a
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f020307

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a046a

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_22
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->C:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_23

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f02028b

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a0452

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_23
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->D:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_24

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f02004c

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a009d

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_24
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->E:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_25

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f0202a1

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a038b

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_25
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->G:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_26

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v5}, Lcom/fimi/kernel/view/button/SwitchButton;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0900f4

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v2, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    :cond_26
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->o:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_28

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->l:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_27

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setAlpha(F)V

    :cond_27
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f0202a0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a02fe

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_28
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->n:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_2a

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->d:Ljava/util/List;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->l:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/entity/Setting;

    invoke-virtual {v0}, Lcom/fimi/soul/entity/Setting;->getIsOPen()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_29

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v7}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setAlpha(F)V

    :cond_29
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f0203e0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    const v2, 0x7f0a0338

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    :cond_2a
    sget-object v0, Lcom/fimi/soul/module/setting/i$d;->y:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const v2, 0x7f030008

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->d:Landroid/widget/TextView;

    const v2, 0x7f0a0291

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->e:Landroid/widget/TextView;

    const v2, 0x7f0a0292

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->setVisibility(I)V

    iget-object v0, p0, Lcom/fimi/soul/module/setting/i;->e:Lcom/fimi/soul/drone/a;

    iget-object v0, v0, Lcom/fimi/soul/drone/a;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/fimi/kernel/utils/v;->a(Landroid/content/Context;)Lcom/fimi/kernel/utils/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/kernel/utils/v;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {}, Lcom/fimi/soul/biz/n/a;->a()Lcom/fimi/soul/biz/n/a;

    move-result-object v2

    const-string v3, "Map_Code_Correction"

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_34

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    invoke-virtual {v2, v4}, Lcom/fimi/soul/biz/n/a;->a(Z)V

    :goto_b
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, p0}, Lcom/fimi/kernel/view/button/SwitchButton;->setOnSwitchListener(Lcom/fimi/kernel/view/button/SwitchButton$a;)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    sget-object v2, Lcom/fimi/soul/module/setting/i$d;->y:Lcom/fimi/soul/module/setting/i$d;

    invoke-virtual {v2}, Lcom/fimi/soul/module/setting/i$d;->ordinal()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->setTag(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v2, p0, Lcom/fimi/soul/module/setting/i;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0900f6

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v1, v1, Lcom/fimi/soul/module/setting/i$e;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_1

    :cond_2b
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->h:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_2

    :cond_2c
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v4, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    goto/16 :goto_3

    :cond_2d
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->setAlpha(F)V

    goto/16 :goto_4

    :cond_2e
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v4, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    goto/16 :goto_5

    :cond_2f
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->b:Landroid/widget/ImageView;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setAlpha(F)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2}, Lcom/fimi/kernel/view/button/SwitchButton;->setAlpha(F)V

    goto/16 :goto_6

    :cond_30
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v4, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    goto/16 :goto_7

    :cond_31
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v4, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    goto/16 :goto_8

    :cond_32
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v4, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    goto/16 :goto_9

    :cond_33
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->g:Landroid/widget/TextView;

    const v2, 0x7f0a0192

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_a

    :cond_34
    iget-object v0, v1, Lcom/fimi/soul/module/setting/i$e;->j:Lcom/fimi/kernel/view/button/SwitchButton;

    invoke-virtual {v0, v4, v4}, Lcom/fimi/kernel/view/button/SwitchButton;->a(ZZ)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/fimi/soul/biz/n/a;->a(Z)V

    goto/16 :goto_b
.end method
